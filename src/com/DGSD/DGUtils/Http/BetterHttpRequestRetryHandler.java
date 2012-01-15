package com.DGSD.DGUtils.Http;

/* Copyright (c) 2009 Matthias K�ppler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;

import javax.net.ssl.SSLHandshakeException;

import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

import android.os.SystemClock;
import android.util.Log;

public class BetterHttpRequestRetryHandler implements HttpRequestRetryHandler {

    // TODO: make configurable
    private static final int RETRY_SLEEP_TIME_MILLIS = 1500;

    private static HashSet<Class<?>> exceptionWhitelist = new HashSet<Class<?>>();

    private static HashSet<Class<?>> exceptionBlacklist = new HashSet<Class<?>>();

    static {
        // Retry if the server dropped connection on us
        exceptionWhitelist.add(NoHttpResponseException.class);
        // retry-this, since it may happens as part of a Wi-Fi to 3G failover
        exceptionWhitelist.add(UnknownHostException.class);
        // retry-this, since it may happens as part of a Wi-Fi to 3G failover
        exceptionWhitelist.add(SocketException.class);

        // never retry timeouts
        // TODO: this doesn't actually capture all timeouts; I've seen timeouts being thrown as a
        // plain SocketExceptiion
        exceptionBlacklist.add(InterruptedIOException.class);
        // never retry SSL handshake failures
        exceptionBlacklist.add(SSLHandshakeException.class);
    }

    private int maxRetries, timesRetried;

    public BetterHttpRequestRetryHandler(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
        boolean retry;

        this.timesRetried = executionCount;

        Boolean b = (Boolean) context.getAttribute(ExecutionContext.HTTP_REQ_SENT);
        boolean sent = (b != null && b.booleanValue());

        if (executionCount > maxRetries) {
            // Do not retry if over max retry count
            retry = false;
        } else if (exceptionBlacklist.contains(exception.getClass())) {
            // immediately cancel retry if the error is blacklisted
            retry = false;
        } else if (exceptionWhitelist.contains(exception.getClass())) {
            // immediately retry if error is whitelisted
            retry = true;
        } else if (!sent) {
            // for all other errors, retry only if request hasn't been fully sent yet
            // TODO: refine to resend all idempotent requests
            retry = true;
        } else {
            // otherwise do not retry
            retry = false;
        }

        if (retry) {
            Log.e(BetterHttp.LOG_TAG, "request failed (" + exception.getClass().getCanonicalName()
                    + ": " + exception.getMessage() + " / attempt " + executionCount
                    + "), will retry in " + RETRY_SLEEP_TIME_MILLIS / 1000.0 + " seconds");
            SystemClock.sleep(RETRY_SLEEP_TIME_MILLIS);
        } else {
            Log.e(BetterHttp.LOG_TAG, "request failed after " + executionCount + " attempts");
            exception.printStackTrace();
        }

        return retry;
    }

    public int getTimesRetried() {
        return timesRetried;
    }
}
