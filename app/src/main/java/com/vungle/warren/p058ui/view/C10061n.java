package com.vungle.warren.p058ui.view;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.concurrent.futures.C0485b;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.C8695r;
import com.iab.omid.library.vungle.C8817a;
import com.iab.omid.library.vungle.adsession.C8822a;
import com.iab.omid.library.vungle.adsession.C8823b;
import com.iab.omid.library.vungle.adsession.C8828g;
import com.iab.omid.library.vungle.adsession.C8830i;
import com.unity3d.ads.metadata.MediationMetaData;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.omsdk.C9908c;
import com.vungle.warren.omsdk.InterfaceC9910d;
import com.vungle.warren.p058ui.presenter.C10019d;
import com.vungle.warren.p058ui.view.InterfaceC10066p;
import com.vungle.warren.utility.C10111y;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import libv2ray.V2rayConfig;

/* renamed from: com.vungle.warren.ui.view.n */
/* loaded from: classes3.dex */
public final class C10061n extends WebViewClient implements InterfaceC10066p {

    /* renamed from: o */
    public static final /* synthetic */ int f20256o = 0;

    /* renamed from: a */
    public final ExecutorService f20257a;

    /* renamed from: b */
    public final Advertisement f20258b;

    /* renamed from: c */
    public final Placement f20259c;

    /* renamed from: d */
    public InterfaceC10066p.InterfaceC10067a f20260d;

    /* renamed from: e */
    public boolean f20261e;

    /* renamed from: f */
    public WebView f20262f;

    /* renamed from: g */
    public boolean f20263g;

    /* renamed from: h */
    public String f20264h;

    /* renamed from: i */
    public String f20265i;

    /* renamed from: j */
    public String f20266j;

    /* renamed from: k */
    public String f20267k;

    /* renamed from: l */
    public Boolean f20268l;

    /* renamed from: m */
    public InterfaceC10066p.InterfaceC10068b f20269m;
    @Nullable

    /* renamed from: n */
    public InterfaceC9910d f20270n;

    /* renamed from: com.vungle.warren.ui.view.n$a */
    /* loaded from: classes3.dex */
    public class RunnableC10062a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f20271a;

        /* renamed from: b */
        public final /* synthetic */ C8695r f20272b;

        /* renamed from: c */
        public final /* synthetic */ Handler f20273c;

        /* renamed from: d */
        public final /* synthetic */ WebView f20274d;

        /* renamed from: com.vungle.warren.ui.view.n$a$a */
        /* loaded from: classes3.dex */
        public class RunnableC10063a implements Runnable {
            public RunnableC10063a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC10062a runnableC10062a = RunnableC10062a.this;
                C10061n c10061n = C10061n.this;
                WebView webView = runnableC10062a.f20274d;
                int i = C10061n.f20256o;
                c10061n.getClass();
                webView.evaluateJavascript("window.vungle.mraidBridge.notifyCommandComplete()", null);
            }
        }

        public RunnableC10062a(String str, C8695r c8695r, Handler handler, WebView webView) {
            this.f20271a = str;
            this.f20272b = c8695r;
            this.f20273c = handler;
            this.f20274d = webView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC10066p.InterfaceC10067a interfaceC10067a = C10061n.this.f20260d;
            if (((C10019d) interfaceC10067a).m1328q(this.f20271a, this.f20272b)) {
                this.f20273c.post(new RunnableC10063a());
            }
        }
    }

    @RequiresApi(29)
    /* renamed from: com.vungle.warren.ui.view.n$b */
    /* loaded from: classes3.dex */
    public static class C10064b extends WebViewRenderProcessClient {

        /* renamed from: a */
        public final InterfaceC10066p.InterfaceC10068b f20277a;

        public C10064b(InterfaceC10066p.InterfaceC10068b interfaceC10068b) {
            this.f20277a = interfaceC10068b;
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            int i = C10061n.f20256o;
            StringBuilder sb = new StringBuilder("onRenderProcessUnresponsive(Title = ");
            sb.append(webView.getTitle());
            sb.append(", URL = ");
            sb.append(webView.getOriginalUrl());
            sb.append(", (webViewRenderProcess != null) = ");
            sb.append(webViewRenderProcess != null);
            Log.w("n", sb.toString());
            InterfaceC10066p.InterfaceC10068b interfaceC10068b = this.f20277a;
            if (interfaceC10068b != null) {
                interfaceC10068b.mo1292f();
            }
        }
    }

    public C10061n(Advertisement advertisement, Placement placement, C10111y c10111y) {
        this.f20258b = advertisement;
        this.f20259c = placement;
        this.f20257a = c10111y;
    }

    /* renamed from: a */
    public final void m1295a(String str, String str2) {
        boolean z;
        Advertisement advertisement;
        if (!TextUtils.isEmpty(str2) && (advertisement = this.f20258b) != null) {
            z = advertisement.m1470d().containsValue(str2);
        } else {
            z = false;
        }
        String m12391a = C0485b.m12391a(str2, " ", str);
        InterfaceC10066p.InterfaceC10068b interfaceC10068b = this.f20269m;
        if (interfaceC10068b != null) {
            interfaceC10068b.mo1291g(m12391a, z);
        }
    }

    /* renamed from: b */
    public final void m1294b(boolean z) {
        int i;
        if (this.f20262f != null) {
            C8695r c8695r = new C8695r();
            C8695r c8695r2 = new C8695r();
            c8695r2.m3216t("width", Integer.valueOf(this.f20262f.getWidth()));
            c8695r2.m3216t("height", Integer.valueOf(this.f20262f.getHeight()));
            C8695r c8695r3 = new C8695r();
            boolean z2 = false;
            c8695r3.m3216t("x", 0);
            c8695r3.m3216t("y", 0);
            c8695r3.m3216t("width", Integer.valueOf(this.f20262f.getWidth()));
            c8695r3.m3216t("height", Integer.valueOf(this.f20262f.getHeight()));
            C8695r c8695r4 = new C8695r();
            Boolean bool = Boolean.FALSE;
            c8695r4.m3217s("sms", bool);
            c8695r4.m3217s("tel", bool);
            c8695r4.m3217s("calendar", bool);
            c8695r4.m3217s("storePicture", bool);
            c8695r4.m3217s("inlineVideo", bool);
            c8695r.m3218r(c8695r2, "maxSize");
            c8695r.m3218r(c8695r2, "screenSize");
            c8695r.m3218r(c8695r3, "defaultPosition");
            c8695r.m3218r(c8695r3, "currentPosition");
            c8695r.m3218r(c8695r4, "supports");
            Advertisement advertisement = this.f20258b;
            c8695r.m3215u("placementType", advertisement.f19718F);
            Boolean bool2 = this.f20268l;
            if (bool2 != null) {
                c8695r.m3217s("isViewable", bool2);
            }
            c8695r.m3215u("os", "android");
            c8695r.m3215u("osVersion", Integer.toString(Build.VERSION.SDK_INT));
            Placement placement = this.f20259c;
            c8695r.m3217s("incentivized", Boolean.valueOf(placement.f19771c));
            if (placement.f19771c) {
                i = advertisement.f19746k;
            } else {
                i = advertisement.f19745j;
            }
            if (i * 1000 == 0) {
                z2 = true;
            }
            c8695r.m3217s("enableBackImmediately", Boolean.valueOf(z2));
            c8695r.m3215u(MediationMetaData.KEY_VERSION, "1.0");
            if (this.f20261e) {
                c8695r.m3217s("consentRequired", Boolean.TRUE);
                c8695r.m3215u("consentTitleText", this.f20264h);
                c8695r.m3215u("consentBodyText", this.f20265i);
                c8695r.m3215u("consentAcceptButtonText", this.f20266j);
                c8695r.m3215u("consentDenyButtonText", this.f20267k);
            } else {
                c8695r.m3217s("consentRequired", bool);
            }
            c8695r.m3215u("sdkVersion", "6.11.0");
            Log.d("n", "loadJsjavascript:window.vungle.mraidBridge.notifyPropertiesChange(" + c8695r + "," + z + ")");
            this.f20262f.evaluateJavascript("window.vungle.mraidBridge.notifyPropertiesChange(" + c8695r + "," + z + ")", null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        int i = this.f20258b.f19737b;
        if (i != 0) {
            if (i == 1) {
                this.f20262f = webView;
                webView.setVisibility(0);
                m1294b(true);
            } else {
                throw new IllegalArgumentException("Unknown Client Type!");
            }
        } else {
            webView.evaluateJavascript("function actionClicked(action){Android.performAction(action);};", null);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new C10064b(this.f20269m));
        }
        InterfaceC9910d interfaceC9910d = this.f20270n;
        if (interfaceC9910d != null) {
            C9908c c9908c = (C9908c) interfaceC9910d;
            if (c9908c.f19899b && c9908c.f19900c == null) {
                C8822a c8822a = new C8822a();
                if (!TextUtils.isEmpty("Vungle")) {
                    if (!TextUtils.isEmpty("6.11.0")) {
                        C8828g c8828g = new C8828g();
                        if (webView != null) {
                            C8823b c8823b = new C8823b(c8828g, webView);
                            if (C8817a.f16787a.f16846a) {
                                C8830i c8830i = new C8830i(c8822a, c8823b);
                                c9908c.f19900c = c8830i;
                                c8830i.m2941c(webView);
                                c9908c.f19900c.m2940d();
                                return;
                            }
                            throw new IllegalStateException("Method called before OM SDK activation");
                        }
                        throw new IllegalArgumentException("WebView is null");
                    }
                    throw new IllegalArgumentException("Version is null or empty");
                }
                throw new IllegalArgumentException("Name is null or empty");
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        Log.e("n", "Error desc " + webResourceError.getDescription().toString());
        Log.e("n", "Error for URL " + webResourceRequest.getUrl().toString());
        m1295a(webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Log.e("n", "Error desc " + webResourceResponse.getStatusCode());
        Log.e("n", "Error for URL " + webResourceRequest.getUrl().toString());
        m1295a(String.valueOf(webResourceResponse.getStatusCode()), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("n", "onRenderProcessGone url: " + webView.getUrl() + ",  did crash: " + renderProcessGoneDetail.didCrash());
        this.f20262f = null;
        InterfaceC10066p.InterfaceC10068b interfaceC10068b = this.f20269m;
        if (interfaceC10068b != null) {
            renderProcessGoneDetail.didCrash();
            interfaceC10068b.mo1290j();
            return true;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Log.d("n", "MRAID Command " + str);
        if (TextUtils.isEmpty(str)) {
            Log.e("n", "Invalid URL ");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null) {
            String scheme = parse.getScheme();
            if (scheme.equals("mraid")) {
                String host = parse.getHost();
                if (host == null) {
                    return false;
                }
                if ("propertiesChangeCompleted".equals(host) && !this.f20263g) {
                    Advertisement advertisement = this.f20258b;
                    if (advertisement.f19713A != null) {
                        HashMap hashMap = new HashMap(advertisement.f19713A);
                        for (Map.Entry<String, Pair<String, String>> entry : advertisement.f19715C.entrySet()) {
                            hashMap.put(entry.getKey(), entry.getValue().first);
                        }
                        if (!advertisement.f19714B.isEmpty()) {
                            hashMap.putAll(advertisement.f19714B);
                        }
                        HashMap hashMap2 = advertisement.f19716D;
                        if (!hashMap2.isEmpty()) {
                            hashMap.putAll(hashMap2);
                        }
                        String str2 = "true";
                        if (!"true".equalsIgnoreCase((String) hashMap.get("START_MUTED"))) {
                            if ((advertisement.f19757v.m1424b() & 1) == 0) {
                                str2 = "false";
                            }
                            hashMap.put("START_MUTED", str2);
                        }
                        C8695r c8695r = new C8695r();
                        for (Map.Entry entry2 : hashMap.entrySet()) {
                            c8695r.m3215u((String) entry2.getKey(), (String) entry2.getValue());
                        }
                        VungleLogger.m1600f("Advertisement", "mraid_args", c8695r.toString());
                        webView.evaluateJavascript("window.vungle.mraidBridge.notifyReadyEvent(" + c8695r + ")", null);
                        this.f20263g = true;
                    } else {
                        throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
                    }
                } else if (this.f20260d != null) {
                    C8695r c8695r2 = new C8695r();
                    for (String str3 : parse.getQueryParameterNames()) {
                        c8695r2.m3215u(str3, parse.getQueryParameter(str3));
                    }
                    this.f20257a.submit(new RunnableC10062a(host, c8695r2, new Handler(), webView));
                }
                return true;
            } else if (V2rayConfig.HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                Log.d("n", "Open URL" + str);
                if (this.f20260d != null) {
                    C8695r c8695r3 = new C8695r();
                    c8695r3.m3215u(ImagesContract.URL, str);
                    ((C10019d) this.f20260d).m1328q("openNonMraid", c8695r3);
                }
                return true;
            }
        }
        return false;
    }
}
