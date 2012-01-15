package com.DGSD.DGUtils.Cache;

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
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.DGSD.DGUtils.Http.CachedHttpResponse.ResponseData;

/**
 * Allows caching HTTP responses (only status code and payload at the moment) using the features
 * provided by {@link AbstractCache}. The key into the cache will be the request URL used to
 * retrieve the HTTP response in the first place.
 * 
 * @author Matthias Kaeppler
 * 
 */
public class HttpResponseCache extends AbstractCache<String, ResponseData> {

    public HttpResponseCache(int initialCapacity, long expirationInMinutes, int maxConcurrentThreads) {
        super("HttpCache", initialCapacity, expirationInMinutes, maxConcurrentThreads);
    }

    public synchronized void removeAllWithPrefix(String urlPrefix) {
        CacheHelper.removeAllWithStringPrefix(this, urlPrefix);
    }

    @Override
    public String getFileNameForKey(String url) {
        return CacheHelper.getFileNameFromUrl(url);
    }

    @Override
    protected ResponseData readValueFromDisk(File file) throws IOException {
        BufferedInputStream istream = new BufferedInputStream(new FileInputStream(file));
        long fileSize = file.length();
        if (fileSize > Integer.MAX_VALUE) {
            throw new IOException("Cannot read files larger than " + Integer.MAX_VALUE + " bytes");
        }

        // first byte is the status code
        int statusCode = istream.read();

        // the remainder is the response data
        int responseDataLength = (int) fileSize - 1;

        byte[] responseBody = new byte[responseDataLength];
        istream.read(responseBody, 0, responseDataLength);
        istream.close();

        return new ResponseData(statusCode, responseBody);
    }

    @Override
    protected void writeValueToDisk(File file, ResponseData data) throws IOException {
        BufferedOutputStream ostream = new BufferedOutputStream(new FileOutputStream(file));

        ostream.write(data.getStatusCode());
        ostream.write(data.getResponseBody());

        ostream.close();
    }
}
