package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.core.content.C0663f;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.p008a.C2656d;
import com.applovin.impl.p008a.C2660h;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3265i;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.C3075a;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3123d;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.d */
/* loaded from: classes.dex */
public class C2762d extends C2773h {
    @Nullable

    /* renamed from: c */
    private static WebView f6603c;

    /* renamed from: a */
    private final C3349v f6604a;

    /* renamed from: b */
    private final C3214m f6605b;

    /* renamed from: d */
    private C3123d f6606d;

    /* renamed from: e */
    private AbstractC3080e f6607e;

    /* renamed from: f */
    private boolean f6608f;

    public C2762d(C2768e c2768e, C3214m c3214m, Context context) {
        this(c2768e, c3214m, context, false);
    }

    public C2762d(C2768e c2768e, C3214m c3214m, Context context, boolean z) {
        super(context);
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f6605b = c3214m;
        this.f6604a = c3214m.m7487A();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(c2768e);
        setWebChromeClient(new C2761c(c2768e != null ? c2768e.m8965a() : null, c3214m));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (C3294g.m7018i() && ((Boolean) c3214m.m7456a(C3109b.f8015eK)).booleanValue()) {
            setWebViewRenderProcessClient(new C2770f(c3214m).m8955a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.d.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.d.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                if (C3349v.m6862a()) {
                    C2762d.this.f6604a.m6855b("AdWebView", "Received a LongClick event.");
                    return true;
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    private String m8970a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m8973a(final C3265i c3265i, final C3214m c3214m, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.3
            @Override // java.lang.Runnable
            public void run() {
                String m7325a = C3265i.this.m7325a();
                C2762d.m8966c();
                if (C2762d.f6603c == null) {
                    appLovinPostbackListener.onPostbackFailure(m7325a, -1);
                    return;
                }
                if (C3265i.this.m7319c() != null) {
                    m7325a = StringUtils.appendQueryParameters(m7325a, C3265i.this.m7319c(), ((Boolean) c3214m.m7456a(C3109b.f7984df)).booleanValue());
                }
                String m12005a = C0663f.m12005a("al_firePostback('", m7325a, "');");
                if (C3294g.m7024c()) {
                    C2762d.f6603c.evaluateJavascript(m12005a, null);
                } else {
                    WebView webView = C2762d.f6603c;
                    webView.loadUrl("javascript:" + m12005a);
                }
                appLovinPostbackListener.onPostbackSuccess(m7325a);
            }
        });
    }

    /* renamed from: a */
    private void m8969a(String str, String str2, String str3, C3214m c3214m) {
        String m8970a = m8970a(str3, str);
        if (StringUtils.isValidString(m8970a)) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("Rendering webview for VAST ad with resourceContents : ", m8970a, this.f6604a, "AdWebView");
            }
            loadDataWithBaseURL(str2, m8970a, "text/html", null, "");
            return;
        }
        String m8970a2 = m8970a((String) c3214m.m7456a(C3109b.f8035eg), str);
        if (StringUtils.isValidString(m8970a2)) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("Rendering webview for VAST ad with resourceContents : ", m8970a2, this.f6604a, "AdWebView");
            }
            loadDataWithBaseURL(str2, m8970a2, "text/html", null, "");
            return;
        }
        if (C3349v.m6862a()) {
            C2808x.m8855b("Rendering webview for VAST ad with resourceURL : ", str, this.f6604a, "AdWebView");
        }
        loadUrl(str);
    }

    /* renamed from: b */
    private void m8967b(AbstractC3080e abstractC3080e) {
        Boolean m8856n;
        Integer m8869a;
        loadUrl("about:blank");
        int m7904az = this.f6607e.m7904az();
        if (m7904az >= 0) {
            setLayerType(m7904az, null);
        }
        if (C3294g.m7025b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(abstractC3080e.m7908av());
        }
        if (C3294g.m7024c() && abstractC3080e.m7906ax()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        C2806v m7905ay = abstractC3080e.m7905ay();
        if (m7905ay != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState m8868b = m7905ay.m8868b();
            if (m8868b != null) {
                settings.setPluginState(m8868b);
            }
            Boolean m8867c = m7905ay.m8867c();
            if (m8867c != null) {
                settings.setAllowFileAccess(m8867c.booleanValue());
            }
            Boolean m8866d = m7905ay.m8866d();
            if (m8866d != null) {
                settings.setLoadWithOverviewMode(m8866d.booleanValue());
            }
            Boolean m8865e = m7905ay.m8865e();
            if (m8865e != null) {
                settings.setUseWideViewPort(m8865e.booleanValue());
            }
            Boolean m8864f = m7905ay.m8864f();
            if (m8864f != null) {
                settings.setAllowContentAccess(m8864f.booleanValue());
            }
            Boolean m8863g = m7905ay.m8863g();
            if (m8863g != null) {
                settings.setBuiltInZoomControls(m8863g.booleanValue());
            }
            Boolean m8862h = m7905ay.m8862h();
            if (m8862h != null) {
                settings.setDisplayZoomControls(m8862h.booleanValue());
            }
            Boolean m8861i = m7905ay.m8861i();
            if (m8861i != null) {
                settings.setSaveFormData(m8861i.booleanValue());
            }
            Boolean m8860j = m7905ay.m8860j();
            if (m8860j != null) {
                settings.setGeolocationEnabled(m8860j.booleanValue());
            }
            Boolean m8859k = m7905ay.m8859k();
            if (m8859k != null) {
                settings.setNeedInitialFocus(m8859k.booleanValue());
            }
            Boolean m8858l = m7905ay.m8858l();
            if (m8858l != null) {
                settings.setAllowFileAccessFromFileURLs(m8858l.booleanValue());
            }
            Boolean m8857m = m7905ay.m8857m();
            if (m8857m != null) {
                settings.setAllowUniversalAccessFromFileURLs(m8857m.booleanValue());
            }
            if (C3294g.m7023d() && (m8869a = m7905ay.m8869a()) != null) {
                settings.setMixedContentMode(m8869a.intValue());
            }
            if (!C3294g.m7022e() || (m8856n = m7905ay.m8856n()) == null) {
                return;
            }
            settings.setOffscreenPreRaster(m8856n.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m8966c() {
        if (f6603c != null) {
            return;
        }
        WebView tryToCreateWebView = Utils.tryToCreateWebView(C3214m.m7475M(), "postbacks");
        f6603c = tryToCreateWebView;
        if (tryToCreateWebView == null) {
            return;
        }
        tryToCreateWebView.getSettings().setJavaScriptEnabled(true);
        f6603c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
        f6603c.setWebViewClient(new WebViewClient() { // from class: com.applovin.impl.adview.d.4
            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (webView == C2762d.f6603c) {
                    C2762d.f6603c.destroy();
                    WebView unused = C2762d.f6603c = null;
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C2762d.m8966c();
                        }
                    });
                    return true;
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public void m8974a(AbstractC3080e abstractC3080e) {
        C3349v c3349v;
        String str;
        C3349v c3349v2;
        String str2;
        String str3;
        String m7907aw;
        String str4;
        String str5;
        String str6;
        String m7907aw2;
        C3214m c3214m;
        if (this.f6608f) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AdWebView", "Ad can not be loaded in a destroyed webview");
                return;
            }
            return;
        }
        this.f6607e = abstractC3080e;
        try {
            m8967b(abstractC3080e);
            if (Utils.isBML(abstractC3080e.getSize())) {
                setVisibility(0);
            }
            if (abstractC3080e instanceof C3075a) {
                C3075a c3075a = (C3075a) abstractC3080e;
                String m8006b = c3075a.m8006b();
                if (c3075a.isOpenMeasurementEnabled()) {
                    m8006b = this.f6605b.m7428al().m8052a(m8006b);
                }
                loadDataWithBaseURL(abstractC3080e.m7907aw(), m8006b, "text/html", null, "");
                if (!C3349v.m6862a()) {
                    return;
                }
                c3349v = this.f6604a;
                str = "AppLovinAd rendered";
            } else if (!(abstractC3080e instanceof C2649a)) {
                return;
            } else {
                C2649a c2649a = (C2649a) abstractC3080e;
                C2656d m9303aM = c2649a.m9303aM();
                if (m9303aM != null) {
                    C2660h m9248b = m9303aM.m9248b();
                    Uri m9228b = m9248b.m9228b();
                    String uri = m9228b != null ? m9228b.toString() : "";
                    String m9227c = m9248b.m9227c();
                    String m9301aO = c2649a.m9301aO();
                    if (!StringUtils.isValidString(uri) && !StringUtils.isValidString(m9227c)) {
                        if (C3349v.m6862a()) {
                            c3349v2 = this.f6604a;
                            str2 = "Unable to load companion ad. No resources provided.";
                            c3349v2.m6850e("AdWebView", str2);
                            return;
                        }
                        return;
                    }
                    if (m9248b.m9233a() == C2660h.EnumC2661a.STATIC) {
                        if (C3349v.m6862a()) {
                            this.f6604a.m6855b("AdWebView", "Rendering WebView for static VAST ad");
                        }
                        loadDataWithBaseURL(abstractC3080e.m7907aw(), m8970a((String) this.f6605b.m7456a(C3109b.f8034ef), uri), "text/html", null, "");
                        return;
                    } else if (m9248b.m9233a() == C2660h.EnumC2661a.HTML) {
                        if (!StringUtils.isValidString(m9227c)) {
                            if (StringUtils.isValidString(uri)) {
                                if (C3349v.m6862a()) {
                                    this.f6604a.m6855b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                m7907aw2 = abstractC3080e.m7907aw();
                                c3214m = this.f6605b;
                                m8969a(uri, m7907aw2, m9301aO, c3214m);
                                return;
                            }
                            return;
                        }
                        String m8970a = m8970a(m9301aO, m9227c);
                        str3 = StringUtils.isValidString(m8970a) ? m8970a : m9227c;
                        if (C3349v.m6862a()) {
                            C3349v c3349v3 = this.f6604a;
                            c3349v3.m6855b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                        }
                        m7907aw = abstractC3080e.m7907aw();
                        str4 = "text/html";
                        str5 = null;
                        str6 = "";
                        loadDataWithBaseURL(m7907aw, str3, str4, str5, str6);
                        return;
                    } else if (m9248b.m9233a() != C2660h.EnumC2661a.IFRAME) {
                        if (C3349v.m6862a()) {
                            c3349v2 = this.f6604a;
                            str2 = "Failed to render VAST companion ad of invalid type";
                            c3349v2.m6850e("AdWebView", str2);
                            return;
                        }
                        return;
                    } else if (StringUtils.isValidString(uri)) {
                        if (C3349v.m6862a()) {
                            this.f6604a.m6855b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                        }
                        m7907aw2 = abstractC3080e.m7907aw();
                        c3214m = this.f6605b;
                        m8969a(uri, m7907aw2, m9301aO, c3214m);
                        return;
                    } else if (StringUtils.isValidString(m9227c)) {
                        String m8970a2 = m8970a(m9301aO, m9227c);
                        str3 = StringUtils.isValidString(m8970a2) ? m8970a2 : m9227c;
                        if (C3349v.m6862a()) {
                            C3349v c3349v4 = this.f6604a;
                            c3349v4.m6855b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                        }
                        m7907aw = abstractC3080e.m7907aw();
                        str4 = "text/html";
                        str5 = null;
                        str6 = "";
                        loadDataWithBaseURL(m7907aw, str3, str4, str5, str6);
                        return;
                    } else {
                        return;
                    }
                } else if (!C3349v.m6862a()) {
                    return;
                } else {
                    c3349v = this.f6604a;
                    str = "No companion ad provided.";
                }
            }
            c3349v.m6855b("AdWebView", str);
        } catch (Throwable th) {
            String valueOf = abstractC3080e != null ? String.valueOf(abstractC3080e.getAdIdNumber()) : "null";
            throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
        }
    }

    /* renamed from: a */
    public void m8972a(String str) {
        m8971a(str, (Runnable) null);
    }

    /* renamed from: a */
    public void m8971a(String str, Runnable runnable) {
        try {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6604a;
                c3349v.m6855b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            }
            loadUrl(str);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                this.f6604a.m6854b("AdWebView", "Unable to forward to template", th);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f6608f = true;
        super.destroy();
    }

    public AbstractC3080e getCurrentAd() {
        return this.f6607e;
    }

    public C3123d getStatsManagerHelper() {
        return this.f6606d;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setStatsManagerHelper(C3123d c3123d) {
        this.f6606d = c3123d;
    }
}
