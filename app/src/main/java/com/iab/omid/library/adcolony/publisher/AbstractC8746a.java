package com.iab.omid.library.adcolony.publisher;

import android.os.Build;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.C8711a;
import com.iab.omid.library.adcolony.adsession.C8714d;
import com.iab.omid.library.adcolony.adsession.C8720j;
import com.iab.omid.library.adcolony.adsession.C8721k;
import com.iab.omid.library.adcolony.adsession.C8722l;
import com.iab.omid.library.adcolony.adsession.media.C8724b;
import com.iab.omid.library.adcolony.p041b.C8732d;
import com.iab.omid.library.adcolony.p041b.C8734f;
import com.iab.omid.library.adcolony.p043d.C8742a;
import com.iab.omid.library.adcolony.p044e.C8745b;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.publisher.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8746a {

    /* renamed from: b */
    public C8711a f16627b;

    /* renamed from: c */
    public C8724b f16628c;

    /* renamed from: e */
    public long f16630e = System.nanoTime();

    /* renamed from: d */
    public int f16629d = 1;

    /* renamed from: a */
    public C8745b f16626a = new C8745b(null);

    /* renamed from: a */
    public void mo3168a() {
    }

    /* renamed from: b */
    public void mo3167b(C8722l c8722l, C8714d c8714d) {
        m3171c(c8722l, c8714d, null);
    }

    /* renamed from: c */
    public final void m3171c(C8722l c8722l, C8714d c8714d, JSONObject jSONObject) {
        String str = c8722l.f16576h;
        JSONObject jSONObject2 = new JSONObject();
        C8742a.m3174c(jSONObject2, "environment", "app");
        C8742a.m3174c(jSONObject2, "adSessionType", c8714d.f16541h);
        JSONObject jSONObject3 = new JSONObject();
        C8742a.m3174c(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C8742a.m3174c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C8742a.m3174c(jSONObject3, "os", "Android");
        C8742a.m3174c(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C8742a.m3174c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        C8720j c8720j = c8714d.f16534a;
        C8742a.m3174c(jSONObject4, "partnerName", c8720j.f16563a);
        C8742a.m3174c(jSONObject4, "partnerVersion", c8720j.f16564b);
        C8742a.m3174c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C8742a.m3174c(jSONObject5, "libraryVersion", "1.3.30-Adcolony");
        C8742a.m3174c(jSONObject5, "appId", C8732d.f16602b.f16603a.getApplicationContext().getPackageName());
        C8742a.m3174c(jSONObject2, "app", jSONObject5);
        String str2 = c8714d.f16540g;
        if (str2 != null) {
            C8742a.m3174c(jSONObject2, "contentUrl", str2);
        }
        String str3 = c8714d.f16539f;
        if (str3 != null) {
            C8742a.m3174c(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (C8721k c8721k : Collections.unmodifiableList(c8714d.f16536c)) {
            C8742a.m3174c(jSONObject6, c8721k.f16565a, c8721k.f16567c);
        }
        C8734f.m3182a(m3169f(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    /* renamed from: d */
    public final void m3170d(String str) {
        C8734f.m3182a(m3169f(), "publishMediaEvent", str);
    }

    /* renamed from: e */
    public void mo3166e() {
        this.f16626a.clear();
    }

    /* renamed from: f */
    public final WebView m3169f() {
        return this.f16626a.get();
    }
}
