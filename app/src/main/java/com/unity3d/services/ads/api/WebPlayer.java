package com.unity3d.services.ads.api;

import com.unity3d.services.ads.webplayer.C9412d;
import com.unity3d.services.ads.webplayer.C9413e;
import com.unity3d.services.ads.webplayer.C9414f;
import com.unity3d.services.ads.webplayer.C9422g;
import com.unity3d.services.ads.webplayer.EnumC9410b;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class WebPlayer {

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$a */
    /* loaded from: classes3.dex */
    public static class RunnableC9316a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9414f f18192a;

        /* renamed from: b */
        final /* synthetic */ String f18193b;

        public RunnableC9316a(C9414f c9414f, String str) {
            this.f18192a = c9414f;
            this.f18193b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18192a.loadUrl(this.f18193b);
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$b */
    /* loaded from: classes3.dex */
    public static class RunnableC9317b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9414f f18194a;

        /* renamed from: b */
        final /* synthetic */ String f18195b;

        /* renamed from: c */
        final /* synthetic */ String f18196c;

        /* renamed from: d */
        final /* synthetic */ String f18197d;

        public RunnableC9317b(C9414f c9414f, String str, String str2, String str3) {
            this.f18194a = c9414f;
            this.f18195b = str;
            this.f18196c = str2;
            this.f18197d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18194a.loadData(this.f18195b, this.f18196c, this.f18197d);
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$c */
    /* loaded from: classes3.dex */
    public static class RunnableC9318c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9414f f18198a;

        /* renamed from: b */
        final /* synthetic */ String f18199b;

        /* renamed from: c */
        final /* synthetic */ String f18200c;

        /* renamed from: d */
        final /* synthetic */ String f18201d;

        /* renamed from: e */
        final /* synthetic */ String f18202e;

        public RunnableC9318c(C9414f c9414f, String str, String str2, String str3, String str4) {
            this.f18198a = c9414f;
            this.f18199b = str;
            this.f18200c = str2;
            this.f18201d = str3;
            this.f18202e = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18198a.loadDataWithBaseURL(this.f18199b, this.f18200c, this.f18201d, this.f18202e, null);
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$d */
    /* loaded from: classes3.dex */
    public static class RunnableC9319d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9414f f18203a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f18204b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f18205c;

        public RunnableC9319d(C9414f c9414f, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f18203a = c9414f;
            this.f18204b = jSONObject;
            this.f18205c = jSONObject2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18203a.m2334a(this.f18204b, this.f18205c);
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$e */
    /* loaded from: classes3.dex */
    public static class RunnableC9320e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9414f f18206a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f18207b;

        public RunnableC9320e(C9414f c9414f, JSONObject jSONObject) {
            this.f18206a = c9414f;
            this.f18207b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18206a.setEventSettings(this.f18207b);
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$f */
    /* loaded from: classes3.dex */
    public static class RunnableC9321f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9414f f18208a;

        public RunnableC9321f(C9414f c9414f) {
            this.f18208a = c9414f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18208a.m2334a(new JSONObject(), new JSONObject());
            this.f18208a.setEventSettings(new JSONObject());
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$g */
    /* loaded from: classes3.dex */
    public static class RunnableC9322g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9414f f18209a;

        /* renamed from: b */
        final /* synthetic */ String f18210b;

        /* renamed from: c */
        final /* synthetic */ String f18211c;

        public RunnableC9322g(C9414f c9414f, String str, String str2) {
            this.f18209a = c9414f;
            this.f18210b = str;
            this.f18211c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            this.f18209a.getLocationOnScreen(iArr);
            C9412d.m2356a(this.f18210b, this.f18211c, iArr[0], iArr[1], this.f18209a.getWidth(), this.f18209a.getHeight(), this.f18209a.getAlpha());
        }
    }

    @WebViewExposed
    public static void clearSettings(String str, C9644l c9644l) {
        C9413e m2354a = C9413e.m2354a();
        m2354a.m2345f(str);
        m2354a.m2346e(str);
        m2354a.m2347d(str);
        C9414f m2323a = C9422g.m2324a().m2323a(str);
        if (m2323a == null) {
            c9644l.m1737a(EnumC9410b.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        C9564j.m1991a(new RunnableC9321f(m2323a));
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void getErroredSettings(String str, C9644l c9644l) {
        C9414f m2323a = C9422g.m2324a().m2323a(str);
        if (m2323a == null) {
            c9644l.m1737a(EnumC9410b.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        Map<String, String> erroredSettings = m2323a.getErroredSettings();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : erroredSettings.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            C9549a.m2023a("Error forming JSON object", e);
        }
        c9644l.m1736a(jSONObject);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void getFrame(String str, String str2, C9644l c9644l) {
        c9644l.m1736a(new Object[0]);
        C9414f m2323a = C9422g.m2324a().m2323a(str2);
        if (m2323a != null) {
            C9564j.m1991a(new RunnableC9322g(m2323a, str, str2));
        }
    }

    @WebViewExposed
    public static void sendEvent(JSONArray jSONArray, String str, C9644l c9644l) {
        C9414f m2323a = C9422g.m2324a().m2323a(str);
        if (m2323a == null) {
            c9644l.m1737a(EnumC9410b.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        m2323a.m2326c(jSONArray);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setData(String str, String str2, String str3, String str4, C9644l c9644l) {
        C9414f m2323a = C9422g.m2324a().m2323a(str4);
        if (m2323a == null) {
            c9644l.m1737a(EnumC9410b.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        C9564j.m1991a(new RunnableC9317b(m2323a, str, str2, str3));
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setDataWithUrl(String str, String str2, String str3, String str4, String str5, C9644l c9644l) {
        C9414f m2323a = C9422g.m2324a().m2323a(str5);
        if (m2323a == null) {
            c9644l.m1737a(EnumC9410b.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        C9564j.m1991a(new RunnableC9318c(m2323a, str, str2, str3, str4));
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setEventSettings(JSONObject jSONObject, String str, C9644l c9644l) {
        C9413e.m2354a().m2352a(str, jSONObject);
        C9414f m2323a = C9422g.m2324a().m2323a(str);
        if (m2323a == null) {
            c9644l.m1737a(EnumC9410b.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        C9564j.m1991a(new RunnableC9320e(m2323a, jSONObject));
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setSettings(JSONObject jSONObject, JSONObject jSONObject2, String str, C9644l c9644l) {
        C9413e.m2354a().m2348c(str, jSONObject);
        C9413e.m2354a().m2350b(str, jSONObject2);
        C9414f m2323a = C9422g.m2324a().m2323a(str);
        if (m2323a == null) {
            c9644l.m1737a(EnumC9410b.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        C9564j.m1991a(new RunnableC9319d(m2323a, jSONObject, jSONObject2));
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setUrl(String str, String str2, C9644l c9644l) {
        C9414f m2323a = C9422g.m2324a().m2323a(str2);
        if (m2323a == null) {
            c9644l.m1737a(EnumC9410b.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        C9564j.m1991a(new RunnableC9316a(m2323a, str));
        c9644l.m1736a(new Object[0]);
    }
}
