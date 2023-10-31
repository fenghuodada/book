package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C8773a;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.p046b.C8779d;
import com.iab.omid.library.applovin.p046b.C8780e;
import com.iab.omid.library.applovin.p048d.C8790b;
import com.iab.omid.library.applovin.p048d.C8793d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.publisher.b */
/* loaded from: classes3.dex */
public class C8800b extends AdSessionStatePublisher {

    /* renamed from: a */
    private WebView f16741a;

    /* renamed from: b */
    private Long f16742b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f16743c;

    /* renamed from: d */
    private final String f16744d;

    public C8800b(Map<String, VerificationScriptResource> map, String str) {
        this.f16743c = map;
        this.f16744d = str;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    /* renamed from: a */
    public void mo3003a() {
        super.mo3003a();
        m2999j();
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    /* renamed from: a */
    public void mo3002a(C8773a c8773a, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C8790b.m3054a(jSONObject, str, injectedResourcesMap.get(str));
        }
        m3018a(c8773a, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    /* renamed from: b */
    public void mo3000b() {
        super.mo3000b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.applovin.publisher.b.1

            /* renamed from: b */
            private final WebView f16746b;

            {
                this.f16746b = C8800b.this.f16741a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16746b.destroy();
            }
        }, Math.max(4000 - (this.f16742b == null ? 4000L : TimeUnit.MILLISECONDS.convert(C8793d.m3042a() - this.f16742b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f16741a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: j */
    public void m2999j() {
        WebView webView = new WebView(C8779d.m3107a().m3105b());
        this.f16741a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        m3022a(this.f16741a);
        C8780e.m3104a().m3100a(this.f16741a, this.f16744d);
        for (String str : this.f16743c.keySet()) {
            C8780e.m3104a().m3099a(this.f16741a, this.f16743c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f16742b = Long.valueOf(C8793d.m3042a());
    }
}
