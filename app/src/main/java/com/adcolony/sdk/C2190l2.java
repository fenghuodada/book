package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C2088e1;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.adcolony.sdk.l2 */
/* loaded from: classes.dex */
public class C2190l2 extends C2088e1 {

    /* renamed from: E */
    public static final /* synthetic */ int f5350E = 0;

    /* renamed from: com.adcolony.sdk.l2$a */
    /* loaded from: classes.dex */
    public class C2191a extends C2088e1.C2091c {
        public C2191a() {
            super();
        }

        @Override // com.adcolony.sdk.C2088e1.C2091c, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            C2190l2 c2190l2 = C2190l2.this;
            if (!(c2190l2 instanceof C2240p3)) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                C2080d1.m9657k(c2190l2.getAdc3ModuleId(), c2367y1, FacebookAdapter.KEY_ID);
                C2100e2 message = c2190l2.getMessage();
                if (message != null) {
                    message.m9641a(c2367y1).m9640b();
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.l2$b */
    /* loaded from: classes.dex */
    public class C2192b extends C2088e1.C2092d {
        public C2192b() {
            super();
        }

        @Override // com.adcolony.sdk.C2088e1.C2092d, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            C2190l2 c2190l2 = C2190l2.this;
            if (!(c2190l2 instanceof C2240p3)) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                C2080d1.m9657k(c2190l2.getAdc3ModuleId(), c2367y1, FacebookAdapter.KEY_ID);
                C2100e2 message = c2190l2.getMessage();
                if (message != null) {
                    message.m9641a(c2367y1).m9640b();
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.l2$c */
    /* loaded from: classes.dex */
    public class C2193c extends C2088e1.C2093e {
        public C2193c() {
            super();
        }

        @Override // com.adcolony.sdk.C2088e1.C2093e, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            C2190l2 c2190l2 = C2190l2.this;
            if (!(c2190l2 instanceof C2240p3)) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                C2080d1.m9657k(c2190l2.getAdc3ModuleId(), c2367y1, FacebookAdapter.KEY_ID);
                C2100e2 message = c2190l2.getMessage();
                if (message != null) {
                    message.m9641a(c2367y1).m9640b();
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.l2$d */
    /* loaded from: classes.dex */
    public class C2194d extends C2088e1.C2094f {
        public C2194d() {
            super();
        }

        @Override // com.adcolony.sdk.C2088e1.C2094f, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            C2190l2 c2190l2 = C2190l2.this;
            if (!(c2190l2 instanceof C2240p3)) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                C2080d1.m9657k(c2190l2.getAdc3ModuleId(), c2367y1, FacebookAdapter.KEY_ID);
                C2100e2 message = c2190l2.getMessage();
                if (message != null) {
                    message.m9641a(c2367y1).m9640b();
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.l2$e */
    /* loaded from: classes.dex */
    public class C2195e extends C2088e1.C2095g {
        public C2195e() {
            super();
        }

        @Override // com.adcolony.sdk.C2088e1.C2095g, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            C2190l2 c2190l2 = C2190l2.this;
            if (!(c2190l2 instanceof C2240p3)) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                C2080d1.m9657k(c2190l2.getAdc3ModuleId(), c2367y1, FacebookAdapter.KEY_ID);
                C2100e2 message = c2190l2.getMessage();
                if (message != null) {
                    message.m9641a(c2367y1).m9640b();
                }
            }
        }
    }

    public C2190l2(@NotNull Context context, int i, @Nullable C2100e2 c2100e2) {
        super(context, i, c2100e2);
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C2192b();
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C2193c();
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C2194d();
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C2195e();
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C2191a();
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    /* renamed from: n */
    public void mo9472n() {
        C2367y1 c2367y1;
        C2100e2 message = getMessage();
        if (message == null) {
            c2367y1 = null;
        } else {
            c2367y1 = message.f5098b;
        }
        if (c2367y1 == null) {
            c2367y1 = new C2367y1();
        }
        setMraidFilepath(c2367y1.m9436w("mraid_filepath"));
        setBaseUrl(c2367y1.m9436w("base_url"));
        setIab(c2367y1.m9439t("iab"));
        setInfo(c2367y1.m9439t("info"));
        setAdSessionId(c2367y1.m9436w("ad_session_id"));
        setMUrl(mo9468v(c2367y1));
        super.mo9472n();
    }

    @Override // com.adcolony.sdk.C2218o0
    public void setBounds(C2100e2 c2100e2) {
        super.setBounds(c2100e2);
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
        C2080d1.m9657k(getAdc3ModuleId(), c2367y1, FacebookAdapter.KEY_ID);
        c2100e2.m9641a(c2367y1).m9640b();
    }

    @Override // com.adcolony.sdk.C2218o0
    public void setVisible(C2100e2 c2100e2) {
        super.setVisible(c2100e2);
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
        C2080d1.m9657k(getAdc3ModuleId(), c2367y1, FacebookAdapter.KEY_ID);
        c2100e2.m9641a(c2367y1).m9640b();
    }
}
