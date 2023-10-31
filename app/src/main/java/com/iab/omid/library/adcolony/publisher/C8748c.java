package com.iab.omid.library.adcolony.publisher;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.C8714d;
import com.iab.omid.library.adcolony.adsession.C8721k;
import com.iab.omid.library.adcolony.adsession.C8722l;
import com.iab.omid.library.adcolony.p041b.C8732d;
import com.iab.omid.library.adcolony.p043d.C8742a;
import com.iab.omid.library.adcolony.p044e.C8745b;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.publisher.c */
/* loaded from: classes3.dex */
public final class C8748c extends AbstractC8746a {

    /* renamed from: f */
    public WebView f16631f;

    /* renamed from: g */
    public Long f16632g = null;

    /* renamed from: h */
    public final Map<String, C8721k> f16633h;

    /* renamed from: i */
    public final String f16634i;

    /* renamed from: com.iab.omid.library.adcolony.publisher.c$a */
    /* loaded from: classes3.dex */
    public class RunnableC8749a implements Runnable {

        /* renamed from: a */
        public final WebView f16635a;

        public RunnableC8749a(C8748c c8748c) {
            this.f16635a = c8748c.f16631f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16635a.destroy();
        }
    }

    public C8748c(Map<String, C8721k> map, String str) {
        this.f16633h = map;
        this.f16634i = str;
    }

    @Override // com.iab.omid.library.adcolony.publisher.AbstractC8746a
    /* renamed from: a */
    public final void mo3168a() {
        WebView webView = new WebView(C8732d.f16602b.f16603a);
        this.f16631f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f16626a = new C8745b(this.f16631f);
        WebView webView2 = this.f16631f;
        if (webView2 != null) {
            String str = this.f16634i;
            if (!TextUtils.isEmpty(str)) {
                webView2.loadUrl("javascript: " + str);
            }
        }
        Map<String, C8721k> map = this.f16633h;
        for (String str2 : map.keySet()) {
            String externalForm = map.get(str2).f16566b.toExternalForm();
            WebView webView3 = this.f16631f;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.f16632g = Long.valueOf(System.nanoTime());
    }

    @Override // com.iab.omid.library.adcolony.publisher.AbstractC8746a
    /* renamed from: b */
    public final void mo3167b(C8722l c8722l, C8714d c8714d) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(c8714d.f16537d);
        for (String str : unmodifiableMap.keySet()) {
            C8742a.m3174c(jSONObject, str, (C8721k) unmodifiableMap.get(str));
        }
        m3171c(c8722l, c8714d, jSONObject);
    }

    @Override // com.iab.omid.library.adcolony.publisher.AbstractC8746a
    /* renamed from: e */
    public final void mo3166e() {
        long convert;
        super.mo3166e();
        if (this.f16632g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f16632g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new RunnableC8749a(this), Math.max(4000 - convert, 2000L));
        this.f16631f = null;
    }
}
