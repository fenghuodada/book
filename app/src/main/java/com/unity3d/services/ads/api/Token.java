package com.unity3d.services.ads.api;

import com.unity3d.services.ads.token.C9398h;
import com.unity3d.services.ads.token.EnumC9396f;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class Token {
    @WebViewExposed
    public static void appendTokens(JSONArray jSONArray, C9644l c9644l) {
        try {
            C9398h.m2372a(jSONArray);
            c9644l.m1736a(new Object[0]);
        } catch (JSONException e) {
            c9644l.m1737a(EnumC9396f.JSON_EXCEPTION, e.getMessage());
        }
    }

    @WebViewExposed
    public static void createTokens(JSONArray jSONArray, C9644l c9644l) {
        try {
            C9398h.m2369b(jSONArray);
            c9644l.m1736a(new Object[0]);
        } catch (JSONException e) {
            c9644l.m1737a(EnumC9396f.JSON_EXCEPTION, e.getMessage());
        }
    }

    @WebViewExposed
    public static void deleteTokens(C9644l c9644l) {
        C9398h.m2375a();
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void getNativeGeneratedToken(C9644l c9644l) {
        C9398h.m2370b();
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setPeekMode(Boolean bool, C9644l c9644l) {
        C9398h.m2371a(bool.booleanValue());
        c9644l.m1736a(new Object[0]);
    }
}
