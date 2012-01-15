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


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;

import com.DGSD.DGUtils.Cache.HttpResponseCache;

/**
 * A response proxy returning data from a {@link HttpResponseCache}
 * 
 * @author Matthias Kaeppler
 */
public class CachedHttpResponse implements BetterHttpResponse {

    public static final class ResponseData {
        public ResponseData(int statusCode, byte[] responseBody) {
            this.statusCode = statusCode;
            this.responseBody = responseBody;
        }

        private int statusCode;
        private byte[] responseBody;

        public int getStatusCode() {
            return statusCode;
        }

        public byte[] getResponseBody() {
            return responseBody;
        }
    }

    private HttpResponseCache responseCache;

    private ResponseData cachedData;

    public CachedHttpResponse(String url) {
        responseCache = BetterHttp.getResponseCache();
        cachedData = responseCache.get(url);
    }

    public String getHeader(String header) {
        return null;
    }

    public InputStream getResponseBody() throws IOException {
        return new ByteArrayInputStream(cachedData.responseBody);
    }

    public byte[] getResponseBodyAsBytes() throws IOException {
        return cachedData.responseBody;
    }

    public String getResponseBodyAsString() throws IOException {
        return new String(cachedData.responseBody);
    }

    public int getStatusCode() {
        return cachedData.statusCode;
    }

    public HttpResponse unwrap() {
        return null;
    }

}
