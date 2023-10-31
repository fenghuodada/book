package com.iab.omid.library.vungle.publisher;

import android.os.Build;
import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.C8823b;
import com.iab.omid.library.vungle.adsession.C8828g;
import com.iab.omid.library.vungle.adsession.C8829h;
import com.iab.omid.library.vungle.adsession.C8830i;
import com.iab.omid.library.vungle.p052b.C8836d;
import com.iab.omid.library.vungle.p052b.C8838f;
import com.iab.omid.library.vungle.p054d.C8846a;
import com.iab.omid.library.vungle.p055e.C8849b;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.publisher.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8850a {

    /* renamed from: c */
    public long f16856c = System.nanoTime();

    /* renamed from: b */
    public int f16855b = 1;

    /* renamed from: a */
    public C8849b f16854a = new C8849b(null);

    /* renamed from: a */
    public void mo2926a() {
    }

    /* renamed from: b */
    public void mo2925b(C8830i c8830i, C8823b c8823b) {
        m2928c(c8830i, c8823b, null);
    }

    /* renamed from: c */
    public final void m2928c(C8830i c8830i, C8823b c8823b, JSONObject jSONObject) {
        String str = c8830i.f16827g;
        JSONObject jSONObject2 = new JSONObject();
        C8846a.m2931c(jSONObject2, "environment", "app");
        C8846a.m2931c(jSONObject2, "adSessionType", c8823b.f16805h);
        JSONObject jSONObject3 = new JSONObject();
        C8846a.m2931c(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C8846a.m2931c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C8846a.m2931c(jSONObject3, "os", "Android");
        C8846a.m2931c(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C8846a.m2931c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        C8828g c8828g = c8823b.f16798a;
        C8846a.m2931c(jSONObject4, "partnerName", c8828g.f16819a);
        C8846a.m2931c(jSONObject4, "partnerVersion", c8828g.f16820b);
        C8846a.m2931c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C8846a.m2931c(jSONObject5, "libraryVersion", "1.3.21-Vungle");
        C8846a.m2931c(jSONObject5, "appId", C8836d.f16836b.f16837a.getApplicationContext().getPackageName());
        C8846a.m2931c(jSONObject2, "app", jSONObject5);
        String str2 = c8823b.f16804g;
        if (str2 != null) {
            C8846a.m2931c(jSONObject2, "contentUrl", str2);
        }
        String str3 = c8823b.f16803f;
        if (str3 != null) {
            C8846a.m2931c(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (C8829h c8829h : Collections.unmodifiableList(c8823b.f16800c)) {
            c8829h.getClass();
            C8846a.m2931c(jSONObject6, null, null);
        }
        C8838f.m2937a(m2927e(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    /* renamed from: d */
    public void mo2924d() {
        this.f16854a.clear();
    }

    /* renamed from: e */
    public final WebView m2927e() {
        return this.f16854a.get();
    }
}
