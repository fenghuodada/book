package com.unity3d.services.core.api;

import com.unity3d.services.core.preferences.C9566a;
import com.unity3d.services.core.preferences.EnumC9567b;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: classes3.dex */
public class Preferences {
    @WebViewExposed
    public static void getBoolean(String str, String str2, C9644l c9644l) {
        Boolean m1979a = C9566a.m1979a(str, str2);
        if (m1979a != null) {
            c9644l.m1736a(m1979a);
        } else {
            c9644l.m1737a(EnumC9567b.COULDNT_GET_VALUE, str, str2);
        }
    }

    @WebViewExposed
    public static void getFloat(String str, String str2, C9644l c9644l) {
        Float m1973b = C9566a.m1973b(str, str2);
        if (m1973b != null) {
            c9644l.m1736a(m1973b);
        } else {
            c9644l.m1737a(EnumC9567b.COULDNT_GET_VALUE, str, str2);
        }
    }

    @WebViewExposed
    public static void getInt(String str, String str2, C9644l c9644l) {
        Integer m1972c = C9566a.m1972c(str, str2);
        if (m1972c != null) {
            c9644l.m1736a(m1972c);
        } else {
            c9644l.m1737a(EnumC9567b.COULDNT_GET_VALUE, str, str2);
        }
    }

    @WebViewExposed
    public static void getLong(String str, String str2, C9644l c9644l) {
        Long m1971d = C9566a.m1971d(str, str2);
        if (m1971d != null) {
            c9644l.m1736a(m1971d);
        } else {
            c9644l.m1737a(EnumC9567b.COULDNT_GET_VALUE, str, str2);
        }
    }

    @WebViewExposed
    public static void getString(String str, String str2, C9644l c9644l) {
        String m1970e = C9566a.m1970e(str, str2);
        if (m1970e != null) {
            c9644l.m1736a(m1970e);
        } else {
            c9644l.m1737a(EnumC9567b.COULDNT_GET_VALUE, str, str2);
        }
    }

    @WebViewExposed
    public static void hasKey(String str, String str2, C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9566a.m1969f(str, str2)));
    }

    @WebViewExposed
    public static void removeKey(String str, String str2, C9644l c9644l) {
        C9566a.m1968g(str, str2);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setBoolean(String str, String str2, Boolean bool, C9644l c9644l) {
        C9566a.m1978a(str, str2, bool);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setFloat(String str, String str2, Double d, C9644l c9644l) {
        C9566a.m1977a(str, str2, d);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setInt(String str, String str2, Integer num, C9644l c9644l) {
        C9566a.m1976a(str, str2, num);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setLong(String str, String str2, Long l, C9644l c9644l) {
        C9566a.m1975a(str, str2, l);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setString(String str, String str2, String str3, C9644l c9644l) {
        C9566a.m1974a(str, str2, str3);
        c9644l.m1736a(new Object[0]);
    }
}
