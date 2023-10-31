package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;

/* renamed from: com.google.android.datatransport.runtime.logging.a */
/* loaded from: classes.dex */
public final class C6520a {
    /* renamed from: a */
    public static void m6286a(Object obj, String str, String str2) {
        String m6284c = m6284c(str);
        if (Log.isLoggable(m6284c, 3)) {
            Log.d(m6284c, String.format(str2, obj));
        }
    }

    /* renamed from: b */
    public static void m6285b(String str, String str2, Exception exc) {
        String m6284c = m6284c(str);
        if (Log.isLoggable(m6284c, 6)) {
            Log.e(m6284c, str2, exc);
        }
    }

    /* renamed from: c */
    public static String m6284c(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }
}
