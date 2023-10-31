package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p032d.C3120b;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(29)
/* renamed from: com.applovin.impl.adview.f */
/* loaded from: classes.dex */
public class C2770f {

    /* renamed from: a */
    private final C3214m f6620a;

    /* renamed from: b */
    private final WebViewRenderProcessClient f6621b = new WebViewRenderProcessClient() { // from class: com.applovin.impl.adview.f.1
        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof C2762d) {
                AbstractC3080e currentAd = ((C2762d) webView).getCurrentAd();
                C2770f.this.f6620a.m7437ac().m7756a(currentAd).m7754a(C3120b.f8112D).m7755a();
                if (C3349v.m6862a()) {
                    C3349v m7487A = C2770f.this.f6620a.m7487A();
                    m7487A.m6850e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    };

    public C2770f(C3214m c3214m) {
        this.f6620a = c3214m;
    }

    /* renamed from: a */
    public WebViewRenderProcessClient m8955a() {
        return this.f6621b;
    }
}
