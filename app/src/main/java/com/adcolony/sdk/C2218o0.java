package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.concurrent.futures.C0484a;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.vungle.warren.VungleApiClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.C10868p;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10925n;
import kotlin.text.C10929r;
import libv2ray.V2rayConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.adcolony.sdk.o0 */
/* loaded from: classes.dex */
public class C2218o0 extends WebView {

    /* renamed from: a */
    public final int f5398a;
    @Nullable

    /* renamed from: b */
    public final C2100e2 f5399b;

    /* renamed from: c */
    public int f5400c;
    @NotNull

    /* renamed from: d */
    public String f5401d;
    @NotNull

    /* renamed from: e */
    public String f5402e;
    @NotNull

    /* renamed from: f */
    public String f5403f;
    @NotNull

    /* renamed from: g */
    public String f5404g;
    @NotNull

    /* renamed from: h */
    public String f5405h;
    @NotNull

    /* renamed from: i */
    public String f5406i;
    @NotNull

    /* renamed from: j */
    public C2367y1 f5407j;

    /* renamed from: k */
    public boolean f5408k;
    @Nullable

    /* renamed from: l */
    public C2135i1 f5409l;

    /* renamed from: m */
    public int f5410m;

    /* renamed from: n */
    public int f5411n;

    /* renamed from: o */
    public int f5412o;

    /* renamed from: p */
    public int f5413p;

    /* renamed from: q */
    public int f5414q;

    /* renamed from: r */
    public int f5415r;

    /* renamed from: s */
    public int f5416s;

    /* renamed from: t */
    public int f5417t;

    /* renamed from: com.adcolony.sdk.o0$a */
    /* loaded from: classes.dex */
    public final class C2219a extends WebChromeClient {
        public C2219a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0065, code lost:
            if (r6 != false) goto L52;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x007e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
        @Override // android.webkit.WebChromeClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onConsoleMessage(@org.jetbrains.annotations.Nullable android.webkit.ConsoleMessage r9) {
            /*
                Method dump skipped, instructions count: 202
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2218o0.C2219a.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable JsResult jsResult) {
            if (jsResult == null) {
                return true;
            }
            jsResult.confirm();
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.o0$b */
    /* loaded from: classes.dex */
    public class C2220b extends WebViewClient {
        public C2220b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            C10868p c10868p;
            C2367y1 c2367y1 = new C2367y1();
            C2218o0 c2218o0 = C2218o0.this;
            C2080d1.m9657k(c2218o0.f5400c, c2367y1, FacebookAdapter.KEY_ID);
            C2080d1.m9660h(c2367y1, ImagesContract.URL, str);
            C2135i1 parentContainer = c2218o0.getParentContainer();
            if (parentContainer == null) {
                c10868p = null;
            } else {
                C2080d1.m9660h(c2367y1, "ad_session_id", c2218o0.getAdSessionId());
                C2080d1.m9657k(parentContainer.f5201j, c2367y1, "container_id");
                new C2100e2(parentContainer.f5202k, c2367y1, "WebView.on_load").m9640b();
                c10868p = C10868p.f21418a;
            }
            if (c10868p == null) {
                new C2100e2(c2218o0.getWebViewModuleId(), c2367y1, "WebView.on_load").m9640b();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
            C2218o0.m9577e(C2218o0.this, i, str, str2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
            if (r3 == true) goto L4;
         */
        @Override // android.webkit.WebViewClient
        @androidx.annotation.RequiresApi(11)
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.webkit.WebResourceResponse shouldInterceptRequest(@org.jetbrains.annotations.Nullable android.webkit.WebView r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            /*
                r2 = this;
                if (r4 != 0) goto L3
                goto Ld
            L3:
                java.lang.String r3 = "mraid.js"
                boolean r3 = kotlin.text.C10925n.m399d(r4, r3)
                r4 = 1
                if (r3 != r4) goto Ld
                goto Le
            Ld:
                r4 = 0
            Le:
                if (r4 == 0) goto L35
                java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
                com.adcolony.sdk.o0 r4 = com.adcolony.sdk.C2218o0.this
                java.lang.String r4 = r4.f5402e
                java.nio.charset.Charset r0 = com.adcolony.sdk.C2108f2.f5107a
                if (r4 == 0) goto L2d
                byte[] r4 = r4.getBytes(r0)
                r3.<init>(r4)
                android.webkit.WebResourceResponse r4 = new android.webkit.WebResourceResponse
                java.lang.String r0 = r0.name()
                java.lang.String r1 = "text/javascript"
                r4.<init>(r1, r0, r3)
                return r4
            L2d:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
                r3.<init>(r4)
                throw r3
            L35:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2218o0.C2220b.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
        }
    }

    /* renamed from: com.adcolony.sdk.o0$c */
    /* loaded from: classes.dex */
    public class C2221c extends C2220b {
        public C2221c() {
            super();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
            if (kotlin.text.C10925n.m399d(r3, "mraid.js") == true) goto L8;
         */
        @Override // android.webkit.WebViewClient
        @androidx.annotation.RequiresApi(21)
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.webkit.WebResourceResponse shouldInterceptRequest(@org.jetbrains.annotations.Nullable android.webkit.WebView r3, @org.jetbrains.annotations.Nullable android.webkit.WebResourceRequest r4) {
            /*
                r2 = this;
                if (r4 != 0) goto L3
                goto L1b
            L3:
                android.net.Uri r3 = r4.getUrl()
                if (r3 != 0) goto La
                goto L1b
            La:
                java.lang.String r3 = r3.toString()
                if (r3 != 0) goto L11
                goto L1b
            L11:
                java.lang.String r4 = "mraid.js"
                boolean r3 = kotlin.text.C10925n.m399d(r3, r4)
                r4 = 1
                if (r3 != r4) goto L1b
                goto L1c
            L1b:
                r4 = 0
            L1c:
                if (r4 == 0) goto L43
                java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
                com.adcolony.sdk.o0 r4 = com.adcolony.sdk.C2218o0.this
                java.lang.String r4 = r4.f5402e
                java.nio.charset.Charset r0 = com.adcolony.sdk.C2108f2.f5107a
                if (r4 == 0) goto L3b
                byte[] r4 = r4.getBytes(r0)
                r3.<init>(r4)
                android.webkit.WebResourceResponse r4 = new android.webkit.WebResourceResponse
                java.lang.String r0 = r0.name()
                java.lang.String r1 = "text/javascript"
                r4.<init>(r1, r0, r3)
                return r4
            L3b:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
                r3.<init>(r4)
                throw r3
            L43:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2218o0.C2221c.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
        }

        @Override // com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        @RequiresApi(11)
        @Nullable
        public final WebResourceResponse shouldInterceptRequest(@Nullable WebView webView, @Nullable String str) {
            return null;
        }
    }

    /* renamed from: com.adcolony.sdk.o0$d */
    /* loaded from: classes.dex */
    public class C2222d extends C2221c {
        public C2222d() {
            super();
        }

        @Override // com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onReceivedError(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(23)
        public final void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            Uri url;
            if (webResourceError == null) {
                return;
            }
            C2218o0.m9577e(C2218o0.this, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString());
        }
    }

    /* renamed from: com.adcolony.sdk.o0$e */
    /* loaded from: classes.dex */
    public class C2223e extends C2222d {
        public C2223e(C2218o0 c2218o0) {
            super();
        }
    }

    /* renamed from: com.adcolony.sdk.o0$f */
    /* loaded from: classes.dex */
    public class C2224f extends C2223e {
        public C2224f() {
            super(C2218o0.this);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
        @Override // android.webkit.WebViewClient
        @androidx.annotation.RequiresApi(26)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onRenderProcessGone(@org.jetbrains.annotations.Nullable android.webkit.WebView r3, @org.jetbrains.annotations.Nullable android.webkit.RenderProcessGoneDetail r4) {
            /*
                r2 = this;
                r3 = 1
                if (r4 != 0) goto L4
                goto Lc
            L4:
                boolean r4 = androidx.core.view.accessibility.C0865f.m11570c(r4)
                if (r4 != r3) goto Lc
                r4 = r3
                goto Ld
            Lc:
                r4 = 0
            Ld:
                if (r4 == 0) goto L1b
                com.adcolony.sdk.y1 r4 = new com.adcolony.sdk.y1
                r4.<init>()
                java.lang.String r0 = "An error occurred while rendering the ad. Ad closing."
                com.adcolony.sdk.o0 r1 = com.adcolony.sdk.C2218o0.this
                r1.mo9516k(r4, r0)
            L1b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2218o0.C2224f.onRenderProcessGone(android.webkit.WebView, android.webkit.RenderProcessGoneDetail):boolean");
        }
    }

    /* renamed from: com.adcolony.sdk.o0$g */
    /* loaded from: classes.dex */
    public static final class RunnableC2225g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10809a f5423a;

        public RunnableC2225g(InterfaceC10809a interfaceC10809a) {
            this.f5423a = interfaceC10809a;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.f5423a.invoke();
        }
    }

    public C2218o0(@NotNull Context context, int i, @Nullable C2100e2 c2100e2) {
        super(context);
        this.f5398a = i;
        this.f5399b = c2100e2;
        this.f5401d = "";
        this.f5402e = "";
        this.f5403f = "";
        this.f5404g = "";
        this.f5405h = "";
        this.f5406i = "";
        this.f5407j = new C2367y1();
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    /* renamed from: a */
    public static final C2218o0 m9578a(@NotNull Context context, @NotNull C2100e2 c2100e2, int i, @NotNull C2135i1 c2135i1) {
        C2218o0 c2218o0;
        C2117g2 m9688o = C2201m0.m9588d().m9688o();
        int i2 = m9688o.f5125b;
        m9688o.f5125b = i2 + 1;
        C2367y1 c2367y1 = c2100e2.f5098b;
        if (c2367y1.m9444o("use_mraid_module")) {
            C2117g2 m9688o2 = C2201m0.m9588d().m9688o();
            int i3 = m9688o2.f5125b;
            m9688o2.f5125b = i3 + 1;
            c2218o0 = new C2257q3(context, i2, c2100e2, i3);
        } else if (c2367y1.m9444o("enable_messages")) {
            c2218o0 = new C2088e1(context, i2, c2100e2);
        } else {
            c2218o0 = new C2218o0(context, i2, c2100e2);
        }
        c2218o0.mo9517h(c2100e2, i, c2135i1);
        c2218o0.mo9472n();
        return c2218o0;
    }

    /* renamed from: e */
    public static final void m9577e(C2218o0 c2218o0, int i, String str, String str2) {
        C2135i1 c2135i1 = c2218o0.f5409l;
        if (c2135i1 != null) {
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9657k(c2218o0.f5400c, c2367y1, FacebookAdapter.KEY_ID);
            C2080d1.m9660h(c2367y1, "ad_session_id", c2218o0.getAdSessionId());
            C2080d1.m9657k(c2135i1.f5201j, c2367y1, "container_id");
            C2080d1.m9657k(i, c2367y1, "code");
            C2080d1.m9660h(c2367y1, "error", str);
            C2080d1.m9660h(c2367y1, ImagesContract.URL, str2);
            new C2100e2(c2135i1.f5202k, c2367y1, "WebView.on_error").m9640b();
        }
        if (str == null) {
            str = "WebViewErrorMessage: null description";
        }
        C1169e.m11129c("onReceivedError: ".concat(str), 0, 0, true);
    }

    /* renamed from: f */
    public static final void m9576f(C2218o0 c2218o0, C2100e2 c2100e2, InterfaceC10809a interfaceC10809a) {
        boolean z;
        String str;
        c2218o0.getClass();
        C2367y1 c2367y1 = c2100e2.f5098b;
        if (c2367y1.m9441r(FacebookAdapter.KEY_ID) == c2218o0.f5400c) {
            int m9441r = c2367y1.m9441r("container_id");
            C2135i1 c2135i1 = c2218o0.f5409l;
            if (c2135i1 != null && m9441r == c2135i1.f5201j) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String m9436w = c2367y1.m9436w("ad_session_id");
                C2135i1 c2135i12 = c2218o0.f5409l;
                if (c2135i12 == null) {
                    str = null;
                } else {
                    str = c2135i12.f5203l;
                }
                if (C10843j.m435a(m9436w, str)) {
                    C2232o6.m9548o(new RunnableC2225g(interfaceC10809a));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTransparent(boolean z) {
        setBackgroundColor(z ? 0 : -1);
    }

    public final /* synthetic */ String getAdSessionId() {
        return this.f5405h;
    }

    public final C2178k getAdView() {
        return C2201m0.m9588d().m9692k().f5269f.get(this.f5405h);
    }

    public final /* synthetic */ String getBaseUrl() {
        return this.f5404g;
    }

    @JvmName(name = "getCurrentHeight")
    public final int getCurrentHeight() {
        return this.f5413p;
    }

    @JvmName(name = "getCurrentWidth")
    public final int getCurrentWidth() {
        return this.f5412o;
    }

    @JvmName(name = "getCurrentX")
    public final int getCurrentX() {
        return this.f5410m;
    }

    @JvmName(name = "getCurrentY")
    public final int getCurrentY() {
        return this.f5411n;
    }

    public final /* synthetic */ boolean getDestroyed() {
        return this.f5408k;
    }

    public final /* synthetic */ C2367y1 getInfo() {
        return this.f5407j;
    }

    @JvmName(name = "getInitialHeight")
    public final int getInitialHeight() {
        return this.f5417t;
    }

    @JvmName(name = "getInitialWidth")
    public final int getInitialWidth() {
        return this.f5416s;
    }

    @JvmName(name = "getInitialX")
    public final int getInitialX() {
        return this.f5414q;
    }

    @JvmName(name = "getInitialY")
    public final int getInitialY() {
        return this.f5415r;
    }

    public final C2249q getInterstitial() {
        return C2201m0.m9588d().m9692k().f5266c.get(this.f5405h);
    }

    public final /* synthetic */ String getMUrl() {
        return this.f5403f;
    }

    public final /* synthetic */ C2100e2 getMessage() {
        return this.f5399b;
    }

    public final /* synthetic */ String getMraidFilepath() {
        return this.f5406i;
    }

    public final /* synthetic */ C2135i1 getParentContainer() {
        return this.f5409l;
    }

    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C2221c();
    }

    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C2222d();
    }

    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C2223e(this);
    }

    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C2224f();
    }

    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C2220b();
    }

    @JvmName(name = "getWebViewModuleId")
    public final int getWebViewModuleId() {
        return this.f5398a;
    }

    /* renamed from: h */
    public void mo9517h(C2100e2 c2100e2, int i, C2135i1 c2135i1) {
        this.f5400c = i;
        this.f5409l = c2135i1;
        C2367y1 c2367y1 = c2100e2.f5098b;
        String m9654n = C2080d1.m9654n(c2367y1, ImagesContract.URL);
        if (m9654n == null) {
            m9654n = c2367y1.m9436w("data");
        }
        this.f5403f = m9654n;
        this.f5404g = c2367y1.m9436w("base_url");
        this.f5401d = c2367y1.m9436w("custom_js");
        this.f5405h = c2367y1.m9436w("ad_session_id");
        this.f5407j = c2367y1.m9439t("info");
        this.f5406i = c2367y1.m9436w("mraid_filepath");
        this.f5412o = c2367y1.m9441r("width");
        this.f5413p = c2367y1.m9441r("height");
        this.f5410m = c2367y1.m9441r("x");
        int m9441r = c2367y1.m9441r("y");
        this.f5411n = m9441r;
        this.f5416s = this.f5412o;
        this.f5417t = this.f5413p;
        this.f5414q = this.f5410m;
        this.f5415r = m9441r;
        mo9470p();
        C2145j1 m9692k = C2201m0.m9588d().m9692k();
        String str = this.f5405h;
        C2135i1 c2135i12 = this.f5409l;
        m9692k.getClass();
        C2232o6.m9548o(new RunnableC2274r1(m9692k, str, this, c2135i12));
    }

    /* renamed from: i */
    public final void m9574i(Exception exc) {
        C1169e.m11129c(exc.getClass().toString() + " during metadata injection w/ metadata = " + this.f5407j.m9436w("metadata"), 0, 0, true);
        C2135i1 c2135i1 = this.f5409l;
        if (c2135i1 != null) {
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, getAdSessionId());
            new C2100e2(c2135i1.f5202k, c2367y1, "AdSession.on_error").m9640b();
        }
    }

    /* renamed from: j */
    public final void m9573j(String str) {
        if (this.f5408k) {
            C1169e.m11129c("Ignoring call to execute_js as WebView has been destroyed.", 0, 3, true);
            return;
        }
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            C2201m0.m9588d().m9689n().m9706d("Device reporting incorrect OS version, evaluateJavascript is not available. Disabling AdColony.", 0, 0, false);
            C2074d.m9671f();
        }
    }

    /* renamed from: k */
    public boolean mo9516k(C2367y1 c2367y1, String str) {
        ActivityC2209n0 activityC2209n0;
        Context context = C2201m0.f5363a;
        if (context instanceof ActivityC2209n0) {
            activityC2209n0 = (ActivityC2209n0) context;
        } else {
            activityC2209n0 = null;
        }
        if (activityC2209n0 == null) {
            return false;
        }
        C2201m0.m9588d().m9692k().getClass();
        C2145j1.m9609a(activityC2209n0, c2367y1, str);
        return true;
    }

    /* renamed from: l */
    public void mo9515l() {
        ArrayList<String> arrayList;
        ArrayList<InterfaceC2203m2> arrayList2;
        C2135i1 c2135i1 = this.f5409l;
        if (c2135i1 != null && (arrayList2 = c2135i1.f5210s) != null) {
            C2236p0 c2236p0 = new C2236p0(this);
            C2201m0.m9589c("WebView.execute_js", c2236p0);
            arrayList2.add(c2236p0);
            C2253q0 c2253q0 = new C2253q0(this);
            C2201m0.m9589c("WebView.set_visible", c2253q0);
            arrayList2.add(c2253q0);
            C2272r0 c2272r0 = new C2272r0(this);
            C2201m0.m9589c("WebView.set_bounds", c2272r0);
            arrayList2.add(c2272r0);
            C2282s0 c2282s0 = new C2282s0(this);
            C2201m0.m9589c("WebView.set_transparent", c2282s0);
            arrayList2.add(c2282s0);
        }
        C2135i1 c2135i12 = this.f5409l;
        if (c2135i12 != null && (arrayList = c2135i12.f5211t) != null) {
            arrayList.add("WebView.execute_js");
            arrayList.add("WebView.set_visible");
            arrayList.add("WebView.set_bounds");
            arrayList.add("WebView.set_transparent");
        }
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5412o, this.f5413p);
        layoutParams.setMargins(getCurrentX(), getCurrentY(), 0, 0);
        layoutParams.gravity = 0;
        C2135i1 c2135i13 = this.f5409l;
        if (c2135i13 != null) {
            c2135i13.addView(this, layoutParams);
        }
    }

    /* renamed from: m */
    public final String m9572m() {
        C2249q interstitial = getInterstitial();
        if (interstitial != null) {
            StringBuilder sb = new StringBuilder();
            String str = interstitial.f5483h;
            if (str == null) {
                str = "";
            }
            sb.append((Object) str);
            sb.append(" : ");
            sb.append(interstitial.f5484i);
            String sb2 = sb.toString();
            if (sb2 != null) {
                return sb2;
            }
        }
        return VungleApiClient.ConnectionTypeDetail.UNKNOWN;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: n */
    public void mo9472n() {
        WebViewClient webViewClientApi23;
        boolean z = true;
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        int i = Build.VERSION.SDK_INT;
        WebView.setWebContentsDebuggingEnabled(false);
        setWebChromeClient(new C2219a());
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setGeolocationEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        if (i >= 26) {
            webViewClientApi23 = getWebViewClientApi26();
        } else if (i >= 24) {
            webViewClientApi23 = getWebViewClientApi24();
        } else {
            webViewClientApi23 = getWebViewClientApi23();
        }
        setWebViewClient(webViewClientApi23);
        mo9471o();
        if (!(this instanceof C2190l2)) {
            mo9515l();
        }
        if (this.f5401d.length() <= 0) {
            z = false;
        }
        if (z) {
            m9573j(this.f5401d);
        }
    }

    /* renamed from: o */
    public /* synthetic */ void mo9471o() {
        if (!C10925n.m392k(this.f5403f, V2rayConfig.HTTP, false) && !C10925n.m392k(this.f5403f, "file", false)) {
            loadDataWithBaseURL(this.f5404g, this.f5403f, "text/html", null, null);
        } else if (!C10929r.m379m(this.f5403f, ".html") && C10925n.m392k(this.f5403f, "file", false)) {
            loadDataWithBaseURL(this.f5403f, C0484a.m12392a(new StringBuilder("<html><script src=\""), this.f5403f, "\"></script></html>"), "text/html", null, null);
        } else {
            loadUrl(this.f5403f);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        boolean z;
        if (motionEvent != null && motionEvent.getAction() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2178k adView = getAdView();
            if (adView != null && !adView.f5322n) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9660h(c2367y1, "ad_session_id", getAdSessionId());
                new C2100e2(1, c2367y1, "WebView.on_first_click").m9640b();
                adView.setUserInteraction(true);
            }
            C2249q interstitial = getInterstitial();
            if (interstitial != null) {
                interstitial.f5488m = true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void mo9470p() {
        boolean z;
        if (this.f5406i.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                C2298t5 m9690m = C2201m0.m9588d().m9690m();
                String str = this.f5406i;
                m9690m.getClass();
                this.f5402e = C2298t5.m9498a(str, false).toString();
                Pattern compile = Pattern.compile("bridge.os_name\\s*=\\s*\"\"\\s*;");
                C10843j.m431e(compile, "compile(pattern)");
                String replacement = "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.f5407j + ";\n";
                String input = this.f5402e;
                C10843j.m430f(input, "input");
                C10843j.m430f(replacement, "replacement");
                String replaceFirst = compile.matcher(input).replaceFirst(replacement);
                C10843j.m431e(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
                this.f5402e = replaceFirst;
            } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e) {
                m9574i(e);
            }
        }
    }

    public final /* synthetic */ void setAdSessionId(String str) {
        this.f5405h = str;
    }

    public final /* synthetic */ void setBaseUrl(String str) {
        this.f5404g = str;
    }

    public void setBounds(C2100e2 c2100e2) {
        C2367y1 c2367y1 = c2100e2.f5098b;
        this.f5410m = c2367y1.m9441r("x");
        this.f5411n = c2367y1.m9441r("y");
        this.f5412o = c2367y1.m9441r("width");
        this.f5413p = c2367y1.m9441r("height");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(getCurrentX(), getCurrentY(), 0, 0);
            layoutParams2.width = getCurrentWidth();
            layoutParams2.height = getCurrentHeight();
            C10868p c10868p = C10868p.f21418a;
            setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final /* synthetic */ void setInfo(C2367y1 c2367y1) {
        this.f5407j = c2367y1;
    }

    public final /* synthetic */ void setMUrl(String str) {
        this.f5403f = str;
    }

    public final /* synthetic */ void setMraidFilepath(String str) {
        this.f5406i = str;
    }

    public void setVisible(C2100e2 c2100e2) {
        int i;
        if (c2100e2.f5098b.m9444o("visible")) {
            i = 0;
        } else {
            i = 4;
        }
        setVisibility(i);
    }
}
