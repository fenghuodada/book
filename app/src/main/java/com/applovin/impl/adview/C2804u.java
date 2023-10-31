package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.adview.u */
/* loaded from: classes.dex */
public class C2804u extends WebViewClient {

    /* renamed from: a */
    private final C3349v f6697a;

    /* renamed from: b */
    private WeakReference<InterfaceC2805a> f6698b;

    /* renamed from: com.applovin.impl.adview.u$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2805a {
        /* renamed from: a */
        void mo8872a(C2803t c2803t);

        /* renamed from: b */
        void mo8871b(C2803t c2803t);

        /* renamed from: c */
        void mo8870c(C2803t c2803t);
    }

    public C2804u(C3214m c3214m) {
        this.f6697a = c3214m.m7487A();
    }

    /* renamed from: a */
    private void m8874a(WebView webView, String str) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6697a;
            c3349v.m6853c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof C2803t)) {
            return;
        }
        C2803t c2803t = (C2803t) webView;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        InterfaceC2805a interfaceC2805a = this.f6698b.get();
        if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && interfaceC2805a != null) {
            if ("/track_click".equals(path)) {
                interfaceC2805a.mo8872a(c2803t);
            } else if ("/close_ad".equals(path)) {
                interfaceC2805a.mo8871b(c2803t);
            } else if ("/skip_ad".equals(path)) {
                interfaceC2805a.mo8870c(c2803t);
            } else if (C3349v.m6862a()) {
                this.f6697a.m6851d("WebViewButtonClient", "Unknown URL: ".concat(str));
                C3349v c3349v2 = this.f6697a;
                c3349v2.m6851d("WebViewButtonClient", "Path: " + path);
            }
        }
    }

    /* renamed from: a */
    public void m8873a(WeakReference<InterfaceC2805a> weakReference) {
        this.f6698b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        m8874a(webView, str);
        return true;
    }
}
