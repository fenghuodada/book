package com.iab.omid.library.vungle.publisher;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.C8823b;
import com.iab.omid.library.vungle.adsession.C8829h;
import com.iab.omid.library.vungle.adsession.C8830i;
import com.iab.omid.library.vungle.p052b.C8836d;
import com.iab.omid.library.vungle.p054d.C8846a;
import com.iab.omid.library.vungle.p055e.C8849b;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.publisher.c */
/* loaded from: classes3.dex */
public final class C8852c extends AbstractC8850a {

    /* renamed from: d */
    public WebView f16857d;

    /* renamed from: e */
    public Long f16858e = null;

    /* renamed from: f */
    public final Map<String, C8829h> f16859f;

    /* renamed from: g */
    public final String f16860g;

    /* renamed from: com.iab.omid.library.vungle.publisher.c$a */
    /* loaded from: classes3.dex */
    public class RunnableC8853a implements Runnable {

        /* renamed from: a */
        public final WebView f16861a;

        public RunnableC8853a(C8852c c8852c) {
            this.f16861a = c8852c.f16857d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16861a.destroy();
        }
    }

    public C8852c(Map<String, C8829h> map, String str) {
        this.f16859f = map;
        this.f16860g = str;
    }

    @Override // com.iab.omid.library.vungle.publisher.AbstractC8850a
    /* renamed from: a */
    public final void mo2926a() {
        WebView webView = new WebView(C8836d.f16836b.f16837a);
        this.f16857d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f16854a = new C8849b(this.f16857d);
        WebView webView2 = this.f16857d;
        if (webView2 != null) {
            String str = this.f16860g;
            if (!TextUtils.isEmpty(str)) {
                webView2.loadUrl("javascript: " + str);
            }
        }
        Map<String, C8829h> map = this.f16859f;
        Iterator<String> it = map.keySet().iterator();
        if (!it.hasNext()) {
            this.f16858e = Long.valueOf(System.nanoTime());
        } else {
            map.get(it.next()).getClass();
            throw null;
        }
    }

    @Override // com.iab.omid.library.vungle.publisher.AbstractC8850a
    /* renamed from: b */
    public final void mo2925b(C8830i c8830i, C8823b c8823b) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(c8823b.f16801d);
        for (String str : unmodifiableMap.keySet()) {
            C8846a.m2931c(jSONObject, str, (C8829h) unmodifiableMap.get(str));
        }
        m2928c(c8830i, c8823b, jSONObject);
    }

    @Override // com.iab.omid.library.vungle.publisher.AbstractC8850a
    /* renamed from: d */
    public final void mo2924d() {
        long convert;
        super.mo2924d();
        if (this.f16858e == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f16858e.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new RunnableC8853a(this), Math.max(4000 - convert, 2000L));
        this.f16857d = null;
    }
}
