package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.p008a.C2656d;
import com.applovin.impl.p008a.C2665l;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3262h;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3120b;
import com.applovin.impl.sdk.p032d.C3123d;
import com.applovin.impl.sdk.utils.AbstractC3287a;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.github.appintro.AppIntroBaseFragmentKt;

/* renamed from: com.applovin.impl.adview.e */
/* loaded from: classes.dex */
public class C2768e extends WebViewClient {

    /* renamed from: a */
    private final C3214m f6615a;

    /* renamed from: b */
    private final C3349v f6616b;

    /* renamed from: c */
    private final C2746b f6617c;

    public C2768e(@Nullable C2746b c2746b, C3214m c3214m) {
        this.f6615a = c3214m;
        this.f6616b = c3214m.m7487A();
        this.f6617c = c2746b;
    }

    /* renamed from: a */
    private void m8964a(PointF pointF) {
        this.f6617c.m9040a(pointF);
    }

    /* renamed from: a */
    private void m8963a(Uri uri, C2762d c2762d) {
        C3349v c3349v;
        String str;
        final String queryParameter = uri.getQueryParameter("n");
        if (StringUtils.isValidString(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                if (C3349v.m6862a()) {
                    C2808x.m8855b("Loading new page externally: ", queryParameter, this.f6616b, "AdWebView");
                }
                Utils.openUri(c2762d.getContext(), Uri.parse(queryParameter), this.f6615a);
                C3298j.m6953c(this.f6617c.m9008g(), this.f6617c.m8990p(), this.f6617c.m8986r());
                return;
            } else if ("internal".equalsIgnoreCase(queryParameter2)) {
                if (C3349v.m6862a()) {
                    C2808x.m8855b("Loading new page in WebView: ", queryParameter, this.f6616b, "AdWebView");
                }
                c2762d.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter(AppIntroBaseFragmentKt.ARG_BG_COLOR);
                if (StringUtils.isValidString(queryParameter3)) {
                    c2762d.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
                if (C3349v.m6862a()) {
                    C2808x.m8855b("Loading new page in slide-up webview: ", queryParameter, this.f6616b, "AdWebView");
                }
                this.f6615a.m7434af().m8069a(new AbstractC3287a() { // from class: com.applovin.impl.adview.e.1
                    @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, null);
                            C3298j.m6988a(C2768e.this.f6617c.m9008g(), C2768e.this.f6617c.m8990p(), C2768e.this.f6617c.m8986r());
                        }
                    }

                    @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            C3298j.m6959b(C2768e.this.f6617c.m9008g(), C2768e.this.f6617c.m8990p(), C2768e.this.f6617c.m8986r());
                            C2768e.this.f6615a.m7434af().m8067b(this);
                        }
                    }
                });
                Intent intent = new Intent(this.f6615a.m7476L(), AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f6615a.m7386z());
                intent.setFlags(268435456);
                this.f6615a.m7476L().startActivity(intent);
                return;
            } else if (C3349v.m6862a()) {
                c3349v = this.f6616b;
                str = "Could not find load type in original uri";
            } else {
                return;
            }
        } else if (C3349v.m6862a()) {
            c3349v = this.f6616b;
            str = "Could not find url to load from query in original uri";
        } else {
            return;
        }
        c3349v.m6850e("AdWebView", str);
    }

    /* renamed from: a */
    private void m8962a(Uri uri, AbstractC3080e abstractC3080e) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            String appendQueryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", abstractC3080e.getClCode());
            this.f6615a.m7467U().m7253a(C3262h.m7216o().m7205c(appendQueryParameter).m7211a(false).m7203c(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).m7215a());
        } else if (C3349v.m6862a()) {
            C3349v c3349v = this.f6616b;
            c3349v.m6850e("AdWebView", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    /* renamed from: a */
    private void m8961a(C2649a c2649a, C2762d c2762d) {
        C2656d m9303aM = c2649a.m9303aM();
        if (m9303aM != null) {
            C2665l.m9207a(m9303aM.m9247c(), this.f6617c.m8988q());
            m8960a(c2762d, m9303aM.m9250a());
        }
    }

    /* renamed from: a */
    private void m8960a(C2762d c2762d, Uri uri) {
        AbstractC3080e currentAd = c2762d.getCurrentAd();
        AppLovinAdView m8986r = this.f6617c.m8986r();
        if (m8986r == null || currentAd == null) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6616b;
                c3349v.m6850e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
                return;
            }
            return;
        }
        C3123d statsManagerHelper = c2762d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.m7745b();
        }
        if (currentAd instanceof C2649a) {
            ((C2649a) currentAd).mo7884o().m8029o();
        }
        this.f6617c.m9030a(currentAd, m8986r, uri, c2762d.getAndClearLastClickLocation());
    }

    /* renamed from: b */
    private void m8958b() {
        this.f6617c.m8998l();
    }

    /* renamed from: c */
    private void m8956c() {
        this.f6617c.m9000k();
    }

    /* renamed from: a */
    public C2746b m8965a() {
        return this.f6617c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0240, code lost:
        if (r6.m9302aN() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
        if (r6.m9302aN() != false) goto L64;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo7598a(android.webkit.WebView r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C2768e.mo7598a(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6616b;
            c3349v.m6853c("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C2746b c2746b = this.f6617c;
        if (c2746b != null) {
            c2746b.m9038a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C2746b c2746b = this.f6617c;
        if (c2746b != null) {
            AbstractC3080e m8990p = c2746b.m8990p();
            String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
            if (m8990p != null) {
                this.f6615a.m7437ac().m7756a(m8990p).m7752a(C3120b.f8139z, str3).m7755a();
            }
            if (C3349v.m6862a()) {
                this.f6616b.m6850e("AdWebView", str3 + " for ad: " + m8990p);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C2746b c2746b = this.f6617c;
        if (c2746b != null) {
            AbstractC3080e m8990p = c2746b.m8990p();
            this.f6615a.m7437ac().m7756a(m8990p).m7754a(C3120b.f8109A).m7755a();
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6616b;
                c3349v.m6850e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + m8990p);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C2746b c2746b = this.f6617c;
        if (c2746b != null) {
            AbstractC3080e m8990p = c2746b.m8990p();
            String str = "Received SSL error: " + sslError;
            this.f6615a.m7437ac().m7756a(m8990p).m7752a(C3120b.f8111C, str).m7755a();
            if (C3349v.m6862a()) {
                this.f6616b.m6850e("AdWebView", str + " for ad: " + m8990p);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String str;
        if (this.f6617c == null) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        if (C3349v.m6862a()) {
            C3349v.m6846i("AdWebView", "Render process gone for ad: " + this.f6617c.m8990p() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        }
        AbstractC3080e m8990p = this.f6617c.m8990p();
        if (m8990p != null) {
            this.f6615a.m7437ac().m7756a(m8990p).m7754a(C3120b.f8110B).m7755a();
        }
        if (((Boolean) this.f6615a.m7456a(C3109b.f8010eF)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f6615a.m7456a(C3109b.f8012eH)).booleanValue()) {
                if (m8990p != null) {
                    str = String.valueOf(m8990p.getAdIdNumber());
                } else {
                    str = "null";
                }
                throw new RuntimeException(C0552c.m12192b("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", str));
            } else if (webView != null && webView.equals(this.f6617c.m8984s())) {
                this.f6617c.m9010f();
                AppLovinAdSize m9021b = this.f6617c.m9021b();
                if (Utils.isBML(m9021b)) {
                    this.f6617c.m9023a(m9021b);
                    this.f6617c.m9012e();
                    return true;
                }
                return true;
            } else {
                return true;
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean hasGesture = ((Boolean) this.f6615a.m7456a(C3109b.f7853bE)).booleanValue() ? webResourceRequest.hasGesture() : true;
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return mo7598a(webView, url.toString(), hasGesture);
        }
        if (C3349v.m6862a()) {
            this.f6616b.m6850e("AdWebView", "No url found for request");
            return false;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return mo7598a(webView, str, true);
    }
}
