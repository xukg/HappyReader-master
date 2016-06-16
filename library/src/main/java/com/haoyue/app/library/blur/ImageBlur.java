package com.haoyue.app.library.blur;

import android.graphics.Bitmap;

public class ImageBlur {

    static {
        System.loadLibrary("ImageBlur");
    }

    public static native void blurIntArray(int[] pixelArray, int width, int height, int radius);

    public static native void blurBitMap(Bitmap bitmap, int radius);
}
