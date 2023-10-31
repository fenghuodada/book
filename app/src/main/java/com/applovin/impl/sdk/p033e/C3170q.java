package com.applovin.impl.sdk.p033e;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.adview.C2762d;
import com.applovin.impl.adview.C2768e;
import com.applovin.impl.mediation.C3025h;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.C3075a;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.q */
/* loaded from: classes.dex */
public class C3170q extends AbstractRunnableC3131a implements C3025h.InterfaceC3026a {

    /* renamed from: a */
    private final C3075a f8279a;

    /* renamed from: c */
    private AppLovinAdLoadListener f8280c;

    /* renamed from: d */
    private C2762d f8281d;

    /* renamed from: com.applovin.impl.sdk.e.q$a */
    /* loaded from: classes.dex */
    public class C3172a extends C2768e {
        private C3172a(C3214m c3214m) {
            super(null, c3214m);
        }

        /* renamed from: a */
        private boolean m7597a(String str, C3109b<String> c3109b) {
            for (String str2 : C3170q.this.f8192b.m7423b(c3109b)) {
                if (str2.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.impl.adview.C2768e
        /* renamed from: a */
        public boolean mo7598a(WebView webView, String str, boolean z) {
            if (C3349v.m6862a()) {
                C3170q c3170q = C3170q.this;
                c3170q.m7703b("Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof C2762d)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (m7597a(scheme, C3109b.f7927ca)) {
                if (m7597a(host, C3109b.f7928cb)) {
                    if (C3349v.m6862a()) {
                        C3170q.this.m7705a("Ad load succeeded");
                    }
                    if (C3170q.this.f8280c == null) {
                        return true;
                    }
                    C3170q.this.f8280c.adReceived(C3170q.this.f8279a);
                } else if (!m7597a(host, C3109b.f7929cc)) {
                    if (C3349v.m6862a()) {
                        C3170q.this.m7700d("Unrecognized webview event");
                        return true;
                    }
                    return true;
                } else {
                    if (C3349v.m6862a()) {
                        C3170q.this.m7705a("Ad load failed");
                    }
                    if (C3170q.this.f8280c == null) {
                        return true;
                    }
                    C3170q.this.f8280c.failedToReceiveAd(204);
                }
                C3170q.this.f8280c = null;
                return true;
            }
            return true;
        }
    }

    public C3170q(JSONObject jSONObject, JSONObject jSONObject2, EnumC3076b enumC3076b, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        super("TaskProcessJavaScriptTagAd", c3214m);
        this.f8279a = new C3075a(jSONObject, jSONObject2, enumC3076b, c3214m);
        this.f8280c = appLovinAdLoadListener;
        c3214m.m7480H().m8113a(this);
    }

    @Override // com.applovin.impl.mediation.C3025h.InterfaceC3026a
    /* renamed from: a */
    public void mo7604a(AbstractC2823a abstractC2823a) {
        if (abstractC2823a.m8798f().equalsIgnoreCase(this.f8279a.m7961N())) {
            this.f8192b.m7480H().m8112b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f8280c;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f8279a);
                this.f8280c = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C3349v.m6862a()) {
            m7705a("Rendering AppLovin ad #" + this.f8279a.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.q.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C3170q c3170q = C3170q.this;
                    C3170q c3170q2 = C3170q.this;
                    C3172a c3172a = new C3172a(c3170q2.f8192b);
                    C3170q c3170q3 = C3170q.this;
                    c3170q.f8281d = new C2762d(c3172a, c3170q3.f8192b, c3170q3.m7698f());
                    C3170q.this.f8281d.loadDataWithBaseURL(C3170q.this.f8279a.m7907aw(), C3170q.this.f8279a.m8006b(), "text/html", null, "");
                } catch (Throwable th) {
                    C3170q.this.f8192b.m7480H().m8112b(C3170q.this);
                    if (C3349v.m6862a()) {
                        C3170q.this.m7704a("Failed to initialize WebView", th);
                    }
                    if (C3170q.this.f8280c != null) {
                        C3170q.this.f8280c.failedToReceiveAd(-1);
                        C3170q.this.f8280c = null;
                    }
                }
            }
        });
    }
}
