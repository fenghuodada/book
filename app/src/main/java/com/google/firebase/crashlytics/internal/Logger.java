package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* loaded from: classes3.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    /* renamed from: d */
    public void m3348d(String str) {
        m3347d(str, null);
    }

    /* renamed from: d */
    public void m3347d(String str, Throwable th) {
        if (canLog(3)) {
            Log.d(this.tag, str, th);
        }
    }

    /* renamed from: e */
    public void m3346e(String str) {
        m3345e(str, null);
    }

    /* renamed from: e */
    public void m3345e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    /* renamed from: i */
    public void m3344i(String str) {
        m3343i(str, null);
    }

    /* renamed from: i */
    public void m3343i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.tag, str, th);
        }
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.tag, str);
        }
    }

    /* renamed from: v */
    public void m3342v(String str) {
        m3341v(str, null);
    }

    /* renamed from: v */
    public void m3341v(String str, Throwable th) {
        if (canLog(2)) {
            Log.v(this.tag, str, th);
        }
    }

    /* renamed from: w */
    public void m3340w(String str) {
        m3339w(str, null);
    }

    /* renamed from: w */
    public void m3339w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.tag, str, th);
        }
    }
}
