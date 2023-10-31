package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.C0561g;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.C2218o0;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import kotlin.C10868p;
import kotlin.jvm.internal.C10843j;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.e1 */
/* loaded from: classes.dex */
public class C2088e1 extends C2218o0 implements InterfaceC2228o3 {

    /* renamed from: A */
    public boolean f5076A;

    /* renamed from: B */
    public C2367y1 f5077B;

    /* renamed from: C */
    public boolean f5078C;

    /* renamed from: D */
    public boolean f5079D;

    /* renamed from: u */
    public boolean f5080u;

    /* renamed from: v */
    public boolean f5081v;
    @NotNull

    /* renamed from: w */
    public final Object f5082w;

    /* renamed from: x */
    public C2328v1 f5083x;
    @NotNull

    /* renamed from: y */
    public String f5084y;
    @Nullable

    /* renamed from: z */
    public C2096h f5085z;

    /* renamed from: com.adcolony.sdk.e1$a */
    /* loaded from: classes.dex */
    public class C2089a {
        public C2089a() {
        }

        @JavascriptInterface
        public final void dispatch_messages(@NotNull String str, @NotNull String str2) {
            C2088e1 c2088e1 = C2088e1.this;
            if (C10843j.m435a(str2, c2088e1.f5084y)) {
                C2088e1.m9647s(c2088e1, str);
            }
        }

        @JavascriptInterface
        public final void enable_reverse_messaging(@NotNull String str) {
            C2088e1 c2088e1 = C2088e1.this;
            if (C10843j.m435a(str, c2088e1.f5084y)) {
                c2088e1.f5080u = true;
            }
        }

        @JavascriptInterface
        @NotNull
        public final String pull_messages(@NotNull String str) {
            if (C10843j.m435a(str, C2088e1.this.f5084y)) {
                String str2 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                C2088e1 c2088e1 = C2088e1.this;
                synchronized (c2088e1.f5082w) {
                    if (c2088e1.f5083x.m9484c() > 0) {
                        if (c2088e1.getEnableMessages()) {
                            str2 = c2088e1.f5083x.toString();
                        }
                        c2088e1.f5083x = new C2328v1();
                    }
                    C10868p c10868p = C10868p.f21418a;
                }
                return str2;
            }
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }

        @JavascriptInterface
        public final void push_messages(@NotNull String str, @NotNull String str2) {
            C2088e1 c2088e1 = C2088e1.this;
            if (C10843j.m435a(str2, c2088e1.f5084y)) {
                C2088e1.m9647s(c2088e1, str);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.e1$b */
    /* loaded from: classes.dex */
    public final class C2090b extends C2089a {
        public C2090b() {
            super();
        }

        @JavascriptInterface
        public final void enable_event_messaging(@NotNull String str) {
            C2088e1 c2088e1 = C2088e1.this;
            if (C10843j.m435a(str, c2088e1.f5084y)) {
                c2088e1.f5081v = true;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.e1$c */
    /* loaded from: classes.dex */
    public class C2091c extends C2218o0.C2220b {
        public C2091c() {
            super();
        }

        @Override // com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            new C2099k().m9643a();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            C2088e1.this.f5078C = false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
            return new C2099k().m9642b(str);
        }
    }

    /* renamed from: com.adcolony.sdk.e1$d */
    /* loaded from: classes.dex */
    public class C2092d extends C2218o0.C2221c {
        public C2092d() {
            super();
        }

        @Override // com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            new C2099k().m9643a();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            C2088e1.this.f5078C = false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
            return new C2099k().m9642b(str);
        }
    }

    /* renamed from: com.adcolony.sdk.e1$e */
    /* loaded from: classes.dex */
    public class C2093e extends C2218o0.C2222d {
        public C2093e() {
            super();
        }

        @Override // com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            new C2097i().m9645a(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            C2088e1.this.f5078C = false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
            return new C2099k().m9642b(str);
        }
    }

    /* renamed from: com.adcolony.sdk.e1$f */
    /* loaded from: classes.dex */
    public class C2094f extends C2218o0.C2223e {
        public C2094f() {
            super(C2088e1.this);
        }

        @Override // com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            new C2097i().m9645a(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            C2088e1.this.f5078C = false;
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(24)
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            return new C2098j().m9644a(webResourceRequest);
        }
    }

    /* renamed from: com.adcolony.sdk.e1$g */
    /* loaded from: classes.dex */
    public class C2095g extends C2218o0.C2224f {
        public C2095g() {
            super();
        }

        @Override // com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            new C2097i().m9645a(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            C2088e1.this.f5078C = false;
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(24)
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            return new C2098j().m9644a(webResourceRequest);
        }
    }

    /* renamed from: com.adcolony.sdk.e1$h */
    /* loaded from: classes.dex */
    public static final class C2096h {
        @NotNull

        /* renamed from: a */
        public final WebMessagePort[] f5093a;

        @RequiresApi(23)
        public C2096h(@NotNull WebMessagePort[] webMessagePortArr) {
            this.f5093a = webMessagePortArr;
        }
    }

    /* renamed from: com.adcolony.sdk.e1$i */
    /* loaded from: classes.dex */
    public final class C2097i {
        public C2097i() {
        }

        @RequiresApi(23)
        /* renamed from: a */
        public final void m9645a(@Nullable String str) {
            WebMessagePort webMessagePort;
            C2088e1 c2088e1 = C2088e1.this;
            new C2099k().m9643a();
            if (str != null) {
                if (c2088e1.f5085z == null) {
                    WebMessagePort[] createWebMessageChannel = c2088e1.createWebMessageChannel();
                    C2096h c2096h = new C2096h(createWebMessageChannel);
                    C10843j.m430f(createWebMessageChannel, "<this>");
                    WebMessagePort webMessagePort2 = null;
                    if (createWebMessageChannel.length - 1 >= 0) {
                        webMessagePort = createWebMessageChannel[0];
                    } else {
                        webMessagePort = null;
                    }
                    if (webMessagePort != null) {
                        webMessagePort.setWebMessageCallback(new C2107f1(c2088e1));
                    }
                    WebMessagePort[] webMessagePortArr = new WebMessagePort[1];
                    C10843j.m430f(createWebMessageChannel, "<this>");
                    if (1 <= createWebMessageChannel.length - 1) {
                        webMessagePort2 = createWebMessageChannel[1];
                    }
                    webMessagePortArr[0] = webMessagePort2;
                    c2088e1.postWebMessage(new WebMessage("", webMessagePortArr), Uri.parse(str));
                    C10868p c10868p = C10868p.f21418a;
                    c2088e1.f5085z = c2096h;
                    return;
                }
                return;
            }
            C1169e.m11129c("ADCWebViewModule: initializeEventMessaging failed due to url = null", 0, 1, true);
        }
    }

    /* renamed from: com.adcolony.sdk.e1$j */
    /* loaded from: classes.dex */
    public final class C2098j {
        public C2098j() {
        }

        @RequiresApi(24)
        /* renamed from: a */
        public final boolean m9644a(@Nullable WebResourceRequest webResourceRequest) {
            boolean z;
            Uri parse;
            C2088e1 c2088e1 = C2088e1.this;
            int i = 0;
            if (c2088e1.getModuleInitialized()) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String clickOverride = c2088e1.getClickOverride();
                    if (clickOverride == null) {
                        parse = null;
                    } else {
                        parse = Uri.parse(clickOverride);
                    }
                    if (parse == null) {
                        parse = webResourceRequest.getUrl();
                    }
                    if (parse != null) {
                        C2232o6.m9554i(new Intent("android.intent.action.VIEW", parse), false);
                        C2367y1 c2367y1 = new C2367y1();
                        C2080d1.m9660h(c2367y1, ImagesContract.URL, parse.toString());
                        C2080d1.m9660h(c2367y1, "ad_session_id", c2088e1.getAdSessionId());
                        C2135i1 parentContainer = c2088e1.getParentContainer();
                        if (parentContainer != null) {
                            i = parentContainer.f5202k;
                        }
                        new C2100e2(i, c2367y1, "WebView.redirect_detected").m9640b();
                        C2332v5 m9702a = C2201m0.m9588d().m9702a();
                        String adSessionId = c2088e1.getAdSessionId();
                        m9702a.getClass();
                        C2332v5.m9478b(adSessionId);
                        C2332v5.m9476d(c2088e1.getAdSessionId());
                    } else {
                        C1169e.m11129c(C10843j.m425k(c2088e1.m9572m(), "shouldOverrideUrlLoading called with null request url, with ad id: "), 0, 0, true);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.adcolony.sdk.e1$k */
    /* loaded from: classes.dex */
    public final class C2099k {
        public C2099k() {
        }

        /* renamed from: a */
        public final void m9643a() {
            C2088e1 c2088e1 = C2088e1.this;
            if (c2088e1.getEnableMessages() && !c2088e1.getModuleInitialized()) {
                c2088e1.f5084y = C2232o6.m9559d();
                C2367y1 m9664d = C2080d1.m9664d(new C2367y1(), c2088e1.getInfo());
                C2080d1.m9660h(m9664d, "message_key", c2088e1.f5084y);
                c2088e1.m9573j("ADC3_init(" + c2088e1.getAdcModuleId() + ',' + m9664d + ");");
                c2088e1.f5078C = true;
            }
        }

        /* renamed from: b */
        public final boolean m9642b(@Nullable String str) {
            C2088e1 c2088e1 = C2088e1.this;
            int i = 0;
            if (!c2088e1.getModuleInitialized()) {
                return false;
            }
            String clickOverride = c2088e1.getClickOverride();
            if (clickOverride != null) {
                str = clickOverride;
            }
            if (str != null) {
                C2232o6.m9554i(new Intent("android.intent.action.VIEW", Uri.parse(str)), false);
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9660h(c2367y1, ImagesContract.URL, str);
                C2080d1.m9660h(c2367y1, "ad_session_id", c2088e1.getAdSessionId());
                C2135i1 parentContainer = c2088e1.getParentContainer();
                if (parentContainer != null) {
                    i = parentContainer.f5202k;
                }
                new C2100e2(i, c2367y1, "WebView.redirect_detected").m9640b();
                C2332v5 m9702a = C2201m0.m9588d().m9702a();
                String adSessionId = c2088e1.getAdSessionId();
                m9702a.getClass();
                C2332v5.m9478b(adSessionId);
                C2332v5.m9476d(c2088e1.getAdSessionId());
            } else {
                C1169e.m11129c(C10843j.m425k(c2088e1.m9572m(), "shouldOverrideUrlLoading called with null request url, with ad id: "), 0, 0, true);
            }
            return true;
        }
    }

    public C2088e1(@NotNull Context context, int i, @Nullable C2100e2 c2100e2) {
        super(context, i, c2100e2);
        this.f5082w = new Object();
        this.f5083x = new C2328v1();
        this.f5084y = "";
        this.f5076A = true;
        this.f5077B = new C2367y1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getClickOverride() {
        String str;
        C2249q interstitial = getInterstitial();
        if (interstitial == null) {
            str = null;
        } else {
            str = interstitial.f5485j;
        }
        if (str == null) {
            C2178k adView = getAdView();
            if (adView == null) {
                return null;
            }
            return adView.getClickOverride();
        }
        return str;
    }

    /* renamed from: s */
    public static final void m9647s(C2088e1 c2088e1, String str) {
        C2328v1 c2328v1;
        c2088e1.getClass();
        try {
            c2328v1 = new C2328v1(str);
        } catch (JSONException e) {
            C2201m0.m9588d().m9689n().m9706d(e.toString(), 0, 0, true);
            c2328v1 = new C2328v1();
        }
        for (C2367y1 c2367y1 : c2328v1.m9481f()) {
            C2201m0.m9588d().m9688o().m9629e(c2367y1);
        }
    }

    @Override // com.adcolony.sdk.InterfaceC2228o3
    /* renamed from: a */
    public final boolean mo9571a() {
        return (this.f5080u || this.f5081v) ? false : true;
    }

    @Override // com.adcolony.sdk.InterfaceC2228o3
    /* renamed from: b */
    public void mo9473b() {
        if (!getDestroyed()) {
            if (!this.f5408k) {
                this.f5408k = true;
                C2232o6.m9548o(new RunnableC2292t0(this));
            }
            C2232o6.m9548o(new RunnableC2116g1(this));
        }
    }

    @Override // com.adcolony.sdk.InterfaceC2228o3
    /* renamed from: c */
    public final void mo9570c(@NotNull C2367y1 c2367y1) {
        synchronized (this.f5082w) {
            if (this.f5081v) {
                m9646w(c2367y1);
                C10868p c10868p = C10868p.f21418a;
            } else {
                this.f5083x.m9486a(c2367y1);
            }
        }
    }

    @Override // com.adcolony.sdk.InterfaceC2228o3
    /* renamed from: d */
    public final void mo9569d() {
        if (C2201m0.m9587e() && this.f5078C && !this.f5080u && !this.f5081v) {
            String str = "";
            synchronized (this.f5082w) {
                if (this.f5083x.m9484c() > 0) {
                    if (getEnableMessages()) {
                        str = this.f5083x.toString();
                    }
                    this.f5083x = new C2328v1();
                }
                C10868p c10868p = C10868p.f21418a;
            }
            C2232o6.m9548o(new RunnableC2126h1(this, str));
        }
    }

    @Override // com.adcolony.sdk.InterfaceC2228o3
    public int getAdcModuleId() {
        return getAdc3ModuleId();
    }

    public final /* synthetic */ boolean getEnableMessages() {
        return this.f5076A;
    }

    public final /* synthetic */ C2367y1 getIab() {
        return this.f5077B;
    }

    @Override // 
    /* renamed from: getModuleId */
    public int getAdc3ModuleId() {
        return getWebViewModuleId();
    }

    public final /* synthetic */ boolean getModuleInitialized() {
        return this.f5078C;
    }

    @Override // com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C2092d();
    }

    @Override // com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C2093e();
    }

    @Override // com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C2094f();
    }

    @Override // com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C2095g();
    }

    @Override // com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C2091c();
    }

    @Override // com.adcolony.sdk.C2218o0
    /* renamed from: h */
    public void mo9517h(C2100e2 c2100e2, int i, C2135i1 c2135i1) {
        C2367y1 c2367y1 = c2100e2.f5098b;
        this.f5076A = c2367y1.m9444o("enable_messages");
        if (this.f5077B.m9449j()) {
            this.f5077B = c2367y1.m9439t("iab");
        }
        super.mo9517h(c2100e2, i, c2135i1);
    }

    @Override // com.adcolony.sdk.C2218o0
    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: n */
    public void mo9472n() {
        addJavascriptInterface(new C2090b(), "NativeLayer");
        C2117g2 m9688o = C2201m0.m9588d().m9688o();
        synchronized (m9688o.f5124a) {
            m9688o.f5124a.put(Integer.valueOf(getAdcModuleId()), this);
            m9688o.m9627g();
        }
        super.mo9472n();
    }

    /* renamed from: r */
    public final String m9648r(String str, String str2) {
        C2120g4 c2120g4;
        if (!this.f5077B.m9449j()) {
            C2249q interstitial = getInterstitial();
            C2120g4 c2120g42 = null;
            if (interstitial != null && !C10843j.m435a(getIab().m9436w("ad_type"), "video")) {
                C2367y1 iab = getIab();
                if (!iab.m9449j()) {
                    interstitial.f5480e = new C2120g4(iab, interstitial.f5482g);
                }
                c2120g4 = interstitial.f5480e;
            } else {
                c2120g4 = null;
            }
            if (c2120g4 == null) {
                AbstractC2187l abstractC2187l = C2201m0.m9588d().m9692k().f5267d.get(getAdSessionId());
                if (abstractC2187l != null) {
                    abstractC2187l.m9600a(new C2120g4(getIab(), getAdSessionId()));
                    c2120g42 = abstractC2187l.f5342c;
                }
            } else {
                c2120g42 = c2120g4;
            }
            if (c2120g42 != null && c2120g42.f5141e == 2) {
                boolean z = true;
                this.f5079D = true;
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    try {
                        C2201m0.m9588d().m9690m().getClass();
                        return C0561g.m12176g(C2298t5.m9498a(str2, false).toString(), str);
                    } catch (IOException e) {
                        mo9469t(e);
                    }
                }
            }
        }
        return str;
    }

    public final /* synthetic */ void setEnableMessages(boolean z) {
        this.f5076A = z;
    }

    public final /* synthetic */ void setIab(C2367y1 c2367y1) {
        this.f5077B = c2367y1;
    }

    /* renamed from: t */
    public void mo9469t(IOException iOException) {
        C1169e.m11129c(iOException.getClass().toString() + " during metadata injection w/ metadata = " + getInfo().m9436w("metadata"), 0, 0, true);
    }

    /* renamed from: u */
    public String mo9532u(C2367y1 c2367y1) {
        return c2367y1.m9436w("filepath");
    }

    /* renamed from: v */
    public /* synthetic */ String mo9468v(C2367y1 c2367y1) {
        return C10843j.m425k(mo9532u(c2367y1), "file:///");
    }

    @RequiresApi(23)
    /* renamed from: w */
    public final void m9646w(C2367y1 c2367y1) {
        WebMessagePort webMessagePort;
        String jSONArray;
        if (this.f5076A) {
            C2096h c2096h = this.f5085z;
            WebMessagePort webMessagePort2 = null;
            if (c2096h != null) {
                WebMessagePort[] webMessagePortArr = c2096h.f5093a;
                C10843j.m430f(webMessagePortArr, "<this>");
                if (webMessagePortArr.length - 1 >= 0) {
                    webMessagePort = webMessagePortArr[0];
                } else {
                    webMessagePort = null;
                }
                if (webMessagePort != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    synchronized (jSONArray2) {
                        jSONArray2.put(c2367y1.f5690a);
                    }
                    synchronized (jSONArray2) {
                        jSONArray = jSONArray2.toString();
                    }
                    webMessagePort.postMessage(new WebMessage(jSONArray));
                    webMessagePort2 = webMessagePort;
                }
            }
            if (webMessagePort2 == null) {
                C1169e.m11129c("Sending message before event messaging is initialized", 0, 1, true);
            }
        }
    }
}
