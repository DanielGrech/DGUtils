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

import java.net.ConnectException;

import org.apache.http.client.methods.HttpUriRequest;

public class CachedHttpRequest implements BetterHttpRequest {

    private String url;

    public CachedHttpRequest(String url) {
        this.url = url;
    }

    public String getRequestUrl() {
        return url;
    }

    public BetterHttpRequest expecting(Integer... statusCodes) {
        return this;
    }

    public BetterHttpRequest retries(int retries) {
        return this;
    }

    public BetterHttpResponse send() throws ConnectException {
        return new CachedHttpResponse(url);
    }

    public HttpUriRequest unwrap() {
        return null;
    }

    public BetterHttpRequest withTimeout(int timeout) {
        return this;
    }
}
