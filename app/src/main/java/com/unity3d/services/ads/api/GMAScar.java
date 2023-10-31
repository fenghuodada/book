package com.unity3d.services.ads.api;

import com.unity3d.services.ads.gmascar.C9324a;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class GMAScar {

    /* renamed from: a */
    private static final C9324a f18185a = new C9324a();

    /* renamed from: a */
    private static String[] m2469a(JSONArray jSONArray) throws JSONException {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    @WebViewExposed
    public static void getSCARSignals(JSONArray jSONArray, JSONArray jSONArray2, C9644l c9644l) throws JSONException {
        f18185a.m2462a(m2469a(jSONArray), m2469a(jSONArray2));
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void getVersion(C9644l c9644l) {
        f18185a.m2461b();
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void initializeScar(C9644l c9644l) {
        f18185a.m2459c();
        c9644l.m1736a(new Object[0]);
    }

    public static void isInitialized(C9644l c9644l) {
        f18185a.m2458d();
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void load(String str, String str2, Boolean bool, String str3, String str4, Integer num, C9644l c9644l) {
        f18185a.m2463a(bool.booleanValue(), str, str2, str4, str3, num.intValue());
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void show(String str, String str2, Boolean bool, C9644l c9644l) {
        f18185a.m2464a(str, str2, bool.booleanValue());
        c9644l.m1736a(new Object[0]);
    }
}
