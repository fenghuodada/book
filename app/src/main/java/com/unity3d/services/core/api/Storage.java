package com.unity3d.services.core.api;

import com.unity3d.services.core.device.C9509f;
import com.unity3d.services.core.device.C9512i;
import com.unity3d.services.core.device.EnumC9510g;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Storage {
    /* renamed from: a */
    private static C9509f m2252a(String str) {
        return C9512i.m2085a(C9512i.EnumC9513a.valueOf(str));
    }

    /* renamed from: a */
    private static void m2251a(String str, String str2, Object obj, C9644l c9644l) {
        C9509f m2252a = m2252a(str);
        if (m2252a == null) {
            c9644l.m1737a(EnumC9510g.COULDNT_GET_STORAGE, str, str2);
        } else if (m2252a.set(str2, obj)) {
            c9644l.m1736a(str2);
        } else {
            c9644l.m1737a(EnumC9510g.COULDNT_SET_VALUE, str2);
        }
    }

    @WebViewExposed
    public static void clear(String str, C9644l c9644l) {
        C9509f m2252a = m2252a(str);
        if (m2252a == null) {
            c9644l.m1737a(EnumC9510g.COULDNT_GET_STORAGE, str);
        } else if (m2252a.m2093a()) {
            c9644l.m1736a(str);
        } else {
            c9644l.m1737a(EnumC9510g.COULDNT_CLEAR_STORAGE, str);
        }
    }

    @WebViewExposed
    public static void delete(String str, String str2, C9644l c9644l) {
        C9509f m2252a = m2252a(str);
        if (m2252a == null) {
            c9644l.m1737a(EnumC9510g.COULDNT_GET_STORAGE, str);
        } else if (m2252a.delete(str2)) {
            c9644l.m1736a(str);
        } else {
            c9644l.m1737a(EnumC9510g.COULDNT_DELETE_VALUE, str);
        }
    }

    @WebViewExposed
    public static void get(String str, String str2, C9644l c9644l) {
        C9509f m2252a = m2252a(str);
        if (m2252a == null) {
            c9644l.m1737a(EnumC9510g.COULDNT_GET_STORAGE, str, str2);
            return;
        }
        Object obj = m2252a.get(str2);
        if (obj == null) {
            c9644l.m1737a(EnumC9510g.COULDNT_GET_VALUE, str2);
        } else {
            c9644l.m1736a(obj);
        }
    }

    @WebViewExposed
    public static void getKeys(String str, String str2, Boolean bool, C9644l c9644l) {
        C9509f m2252a = m2252a(str);
        if (m2252a == null) {
            c9644l.m1737a(EnumC9510g.COULDNT_GET_STORAGE, str, str2);
            return;
        }
        List<String> keys = m2252a.getKeys(str2, bool.booleanValue());
        if (keys != null) {
            c9644l.m1736a(new JSONArray((Collection) keys));
        } else {
            c9644l.m1736a(new JSONArray());
        }
    }

    @WebViewExposed
    public static void read(String str, C9644l c9644l) {
        C9509f m2252a = m2252a(str);
        if (m2252a == null) {
            c9644l.m1737a(EnumC9510g.COULDNT_GET_STORAGE, str);
            return;
        }
        m2252a.m2089d();
        c9644l.m1736a(str);
    }

    @WebViewExposed
    public static void set(String str, String str2, Boolean bool, C9644l c9644l) {
        m2251a(str, str2, bool, c9644l);
    }

    @WebViewExposed
    public static void set(String str, String str2, Double d, C9644l c9644l) {
        m2251a(str, str2, d, c9644l);
    }

    @WebViewExposed
    public static void set(String str, String str2, Integer num, C9644l c9644l) {
        m2251a(str, str2, num, c9644l);
    }

    @WebViewExposed
    public static void set(String str, String str2, Long l, C9644l c9644l) {
        m2251a(str, str2, l, c9644l);
    }

    @WebViewExposed
    public static void set(String str, String str2, String str3, C9644l c9644l) {
        m2251a(str, str2, str3, c9644l);
    }

    @WebViewExposed
    public static void set(String str, String str2, JSONArray jSONArray, C9644l c9644l) {
        m2251a(str, str2, jSONArray, c9644l);
    }

    @WebViewExposed
    public static void set(String str, String str2, JSONObject jSONObject, C9644l c9644l) {
        m2251a(str, str2, jSONObject, c9644l);
    }

    @WebViewExposed
    public static void write(String str, C9644l c9644l) {
        C9509f m2252a = m2252a(str);
        if (m2252a == null) {
            c9644l.m1737a(EnumC9510g.COULDNT_GET_STORAGE, str);
        } else if (m2252a.m2087f()) {
            c9644l.m1736a(str);
        } else {
            c9644l.m1737a(EnumC9510g.COULDNT_WRITE_STORAGE_TO_CACHE, str);
        }
    }
}
