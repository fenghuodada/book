package com.unity3d.services.core.webview.bridge;

import android.webkit.JavascriptInterface;
import com.adcolony.sdk.C2362x3;
import com.unity3d.services.core.log.C9549a;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.unity3d.services.core.webview.bridge.i */
/* loaded from: classes3.dex */
public class C9636i {
    /* renamed from: a */
    private Object[] m1750a(JSONArray jSONArray) throws JSONException {
        Object[] objArr = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            objArr[i] = jSONArray.get(i);
        }
        return objArr;
    }

    @JavascriptInterface
    public void handleCallback(String str, String str2, String str3) throws Exception {
        Object[] objArr;
        StringBuilder m9460b = C2362x3.m9460b("handleCallback ", str, " ", str2, " ");
        m9460b.append(str3);
        C9549a.m2019b(m9460b.toString());
        JSONArray jSONArray = new JSONArray(str3);
        if (jSONArray.length() > 0) {
            objArr = new Object[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                objArr[i] = jSONArray.get(i);
            }
        } else {
            objArr = null;
        }
        C9634g.m1751b(str, str2, objArr);
    }

    @JavascriptInterface
    public void handleInvocation(String str) throws JSONException {
        C9549a.m2019b("handleInvocation " + str);
        JSONArray jSONArray = new JSONArray(str);
        C9632e c9632e = new C9632e();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = (JSONArray) jSONArray.get(i);
            c9632e.m1762a((String) jSONArray2.get(0), (String) jSONArray2.get(1), m1750a((JSONArray) jSONArray2.get(2)), new C9644l((String) jSONArray2.get(3), c9632e.m1765a()));
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            c9632e.m1760c();
        }
        c9632e.m1759d();
    }
}
