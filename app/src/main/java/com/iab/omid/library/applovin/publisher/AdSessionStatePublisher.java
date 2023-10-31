package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C8773a;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.p046b.C8779d;
import com.iab.omid.library.applovin.p046b.C8780e;
import com.iab.omid.library.applovin.p048d.C8789a;
import com.iab.omid.library.applovin.p048d.C8790b;
import com.iab.omid.library.applovin.p048d.C8793d;
import com.iab.omid.library.applovin.p049e.C8797b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C8797b f16732a;

    /* renamed from: b */
    private AdEvents f16733b;

    /* renamed from: c */
    private MediaEvents f16734c;

    /* renamed from: d */
    private EnumC8798a f16735d;

    /* renamed from: e */
    private long f16736e;

    /* renamed from: com.iab.omid.library.applovin.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes3.dex */
    public enum EnumC8798a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        m3004i();
        this.f16732a = new C8797b(null);
    }

    /* renamed from: a */
    public void mo3003a() {
    }

    /* renamed from: a */
    public void m3023a(float f) {
        C8780e.m3104a().m3102a(getWebView(), f);
    }

    /* renamed from: a */
    public void m3022a(WebView webView) {
        this.f16732a = new C8797b(webView);
    }

    /* renamed from: a */
    public void m3021a(AdEvents adEvents) {
        this.f16733b = adEvents;
    }

    /* renamed from: a */
    public void m3020a(AdSessionConfiguration adSessionConfiguration) {
        C8780e.m3104a().m3094a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m3019a(ErrorType errorType, String str) {
        C8780e.m3104a().m3101a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo3002a(C8773a c8773a, AdSessionContext adSessionContext) {
        m3018a(c8773a, adSessionContext, null);
    }

    /* renamed from: a */
    public void m3018a(C8773a c8773a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c8773a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C8790b.m3054a(jSONObject2, "environment", "app");
        C8790b.m3054a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C8790b.m3054a(jSONObject2, "deviceInfo", C8789a.m3063d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C8790b.m3054a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C8790b.m3054a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C8790b.m3054a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C8790b.m3054a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C8790b.m3054a(jSONObject4, "libraryVersion", "1.3.30-Applovin");
        C8790b.m3054a(jSONObject4, "appId", C8779d.m3107a().m3105b().getApplicationContext().getPackageName());
        C8790b.m3054a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C8790b.m3054a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C8790b.m3054a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C8790b.m3054a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C8780e.m3104a().m3097a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m3017a(MediaEvents mediaEvents) {
        this.f16734c = mediaEvents;
    }

    /* renamed from: a */
    public void m3016a(String str) {
        C8780e.m3104a().m3098a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m3015a(String str, long j) {
        if (j >= this.f16736e) {
            this.f16735d = EnumC8798a.AD_STATE_VISIBLE;
            C8780e.m3104a().m3091b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void m3014a(String str, JSONObject jSONObject) {
        C8780e.m3104a().m3098a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void m3013a(@NonNull JSONObject jSONObject) {
        C8780e.m3104a().m3090b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m3012a(boolean z) {
        if (m3008e()) {
            C8780e.m3104a().m3088c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo3000b() {
        this.f16732a.clear();
    }

    /* renamed from: b */
    public void m3011b(String str, long j) {
        if (j >= this.f16736e) {
            EnumC8798a enumC8798a = this.f16735d;
            EnumC8798a enumC8798a2 = EnumC8798a.AD_STATE_NOTVISIBLE;
            if (enumC8798a != enumC8798a2) {
                this.f16735d = enumC8798a2;
                C8780e.m3104a().m3091b(getWebView(), str);
            }
        }
    }

    /* renamed from: c */
    public AdEvents m3010c() {
        return this.f16733b;
    }

    /* renamed from: d */
    public MediaEvents m3009d() {
        return this.f16734c;
    }

    /* renamed from: e */
    public boolean m3008e() {
        return this.f16732a.get() != null;
    }

    /* renamed from: f */
    public void m3007f() {
        C8780e.m3104a().m3103a(getWebView());
    }

    /* renamed from: g */
    public void m3006g() {
        C8780e.m3104a().m3092b(getWebView());
    }

    public WebView getWebView() {
        return this.f16732a.get();
    }

    /* renamed from: h */
    public void m3005h() {
        C8780e.m3104a().m3089c(getWebView());
    }

    /* renamed from: i */
    public void m3004i() {
        this.f16736e = C8793d.m3042a();
        this.f16735d = EnumC8798a.AD_STATE_IDLE;
    }
}
