package com.DGSD.DGUtils.Utils;

/* Copyright (c) 2009 Matthias Käppler
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

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * Useful utilities which get display information at runtime
 *
 */
public class DisplayUtils {

    public static final int SCREEN_DENSITY_LOW = 120;
    public static final int SCREEN_DENSITY_MEDIUM = 160;
    public static final int SCREEN_DENSITY_HIGH = 240;

    private static int screenDensity = -1;

    public static int dipToPx(Context context, int dip) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (dip * displayMetrics.density + 0.5f);
    }

    public static Drawable scaleDrawable(Context context, int drawableResourceId, int width,
            int height) {
        Bitmap sourceBitmap = BitmapFactory.decodeResource(context.getResources(),
            drawableResourceId);
        return new BitmapDrawable(Bitmap.createScaledBitmap(sourceBitmap, width, height, true));
    }

    public static int getScreenDensity(Context context) {
        if (screenDensity == -1) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            try {
                screenDensity = DisplayMetrics.class.getField("densityDpi").getInt(displayMetrics);
            } catch (Exception e) {
                screenDensity = SCREEN_DENSITY_MEDIUM;
            }
        }
        return screenDensity;
    }

    public static boolean isTablet(Context context) {
        // Can use static final constants like HONEYCOMB, declared in later versions
        // of the OS since they are inlined at compile time. This is guaranteed behavior.
        return (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) && (context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK)
                == Configuration.SCREENLAYOUT_SIZE_XLARGE;
    }

    public static boolean isInLandscape(Context c) {
        Display d = ((WindowManager) c.getSystemService(Activity.WINDOW_SERVICE)).getDefaultDisplay();
        return d.getWidth() > d.getHeight();
    }
}