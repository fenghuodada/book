package com.unity3d.services.core.api;

import com.unity3d.services.core.broadcast.C9466d;
import com.unity3d.services.core.broadcast.EnumC9463a;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class Broadcast {
    @WebViewExposed
    public static void addBroadcastListener(String str, String str2, JSONArray jSONArray, C9644l c9644l) {
        try {
            if (jSONArray.length() > 0) {
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                C9466d.m2248a(str, str2, strArr);
            }
            c9644l.m1736a(new Object[0]);
        } catch (JSONException unused) {
            c9644l.m1737a(EnumC9463a.JSON_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void addBroadcastListener(String str, JSONArray jSONArray, C9644l c9644l) {
        addBroadcastListener(str, null, jSONArray, c9644l);
    }

    @WebViewExposed
    public static void removeAllBroadcastListeners(C9644l c9644l) {
        C9466d.m2250a();
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void removeBroadcastListener(String str, C9644l c9644l) {
        C9466d.m2249a(str);
        c9644l.m1736a(new Object[0]);
    }
}
