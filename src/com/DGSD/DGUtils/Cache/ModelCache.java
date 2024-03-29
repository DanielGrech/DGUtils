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

import android.os.Parcel;

/**
 * Allows caching Model objects using the features provided by {@link AbstractCache}. The key into
 * the cache will be based around the cached object's key, and the object will be able to save and
 * reload itself from the cache.
 * 
 * @author Michael England
 * 
 */
public class ModelCache extends AbstractCache<String, CachedModel> {

    /**
     * Creates an {@link AbstractCache} with params provided and name 'ModelCache'.
     * 
     * @see com.github.droidfu.cachefu.AbstractCache#AbstractCache(String, int, long, int)
     */
    public ModelCache(int initialCapacity, long expirationInMinutes, int maxConcurrentThreads) {
        super("ModelCache", initialCapacity, expirationInMinutes, maxConcurrentThreads);
    }

    // Counter for all saves to cache. Used to determine if newer object in cache
    private long transactionCount = Long.MIN_VALUE + 1;

    /**
     * @see com.github.droidfu.cachefu.AbstractCache#put(Object, Object)
     */
    @Override
    public synchronized CachedModel put(String key, CachedModel value) {
        // Set transaction id for checking validity against other values with same key
        value.setTransactionId(transactionCount++);
        return super.put(key, value);
    }

    /**
     * Removes all cached objects with key prefix.
     * 
     * @param prefix
     *            Prefix of all cached object keys to be removed
     */
    public synchronized void removeAllWithPrefix(String prefix) {
        CacheHelper.removeAllWithStringPrefix(this, prefix);
    }

    /**
     * @see com.github.droidfu.cachefu.AbstractCache#getFileNameForKey(Object)
     */
    @Override
    public String getFileNameForKey(String url) {
        return CacheHelper.getFileNameFromUrl(url);
    }

    /**
     * @see com.github.droidfu.cachefu.AbstractCache#readValueFromDisk(java.io.File)
     */
    @Override
    protected CachedModel readValueFromDisk(File file) throws IOException {
        FileInputStream istream = new FileInputStream(file);

        // Read file into byte array
        byte[] dataWritten = new byte[(int) file.length()];
        BufferedInputStream bistream = new BufferedInputStream(istream);
        bistream.read(dataWritten);
        bistream.close();

        // Create parcel with cached data
        Parcel parcelIn = Parcel.obtain();
        parcelIn.unmarshall(dataWritten, 0, dataWritten.length);
        parcelIn.setDataPosition(0);

        // Read class name from parcel and use the class loader to read parcel
        String className = parcelIn.readString();
        // In case this sometimes hits a null value
        if (className == null) {
            return null;
        }
        Class<?> clazz;
        try {
            clazz = Class.forName(className);
            return parcelIn.readParcelable(clazz.getClassLoader());
        } catch (ClassNotFoundException e) {
            throw new IOException(e.getMessage());
        }
    }

    /**
     * @see com.github.droidfu.cachefu.AbstractCache#writeValueToDisk(java.io.File,
     *      Object)
     */
    @Override
    protected void writeValueToDisk(File file, CachedModel data) throws IOException {
        // Write object into parcel
        Parcel parcelOut = Parcel.obtain();
        parcelOut.writeString(data.getClass().getCanonicalName());
        parcelOut.writeParcelable(data, 0);

        // Write byte data to file
        FileOutputStream ostream = new FileOutputStream(file);
        BufferedOutputStream bistream = new BufferedOutputStream(ostream);
        bistream.write(parcelOut.marshall());
        bistream.close();
    }

}
