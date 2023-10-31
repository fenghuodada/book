package me.jessyan.autosize.utils;

import android.util.Log;

/* loaded from: classes3.dex */
public class AutoSizeLog {
    private static final String TAG = "AndroidAutoSize";
    private static boolean debug;

    private AutoSizeLog() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    /* renamed from: d */
    public static void m96d(String str) {
        if (debug) {
            Log.d(TAG, str);
        }
    }

    /* renamed from: e */
    public static void m95e(String str) {
        if (debug) {
            Log.e(TAG, str);
        }
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: w */
    public static void m94w(String str) {
        if (debug) {
            Log.w(TAG, str);
        }
    }
}
