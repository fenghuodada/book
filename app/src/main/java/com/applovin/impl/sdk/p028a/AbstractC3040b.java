package com.applovin.impl.sdk.p028a;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0510h;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC3040b {

    /* renamed from: a */
    protected final AppLovinAdBase f7566a;

    /* renamed from: b */
    protected final C3214m f7567b;

    /* renamed from: c */
    protected final C3349v f7568c;

    /* renamed from: d */
    protected final String f7569d;

    /* renamed from: e */
    protected boolean f7570e;

    /* renamed from: f */
    protected AdSession f7571f;

    /* renamed from: g */
    protected AdEvents f7572g;

    public AbstractC3040b(AppLovinAdBase appLovinAdBase) {
        this.f7566a = appLovinAdBase;
        this.f7567b = appLovinAdBase.getSdk();
        this.f7568c = appLovinAdBase.getSdk().m7487A();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder m12339b = C0510h.m12339b(str, ":");
            m12339b.append(appLovinAdBase.getDspName());
            str = m12339b.toString();
        }
        this.f7569d = str;
    }

    @Nullable
    /* renamed from: a */
    public abstract AdSessionConfiguration mo8046a();

    @Nullable
    /* renamed from: a */
    public abstract AdSessionContext mo8044a(@Nullable WebView webView);

    /* renamed from: a */
    public void m8066a(View view) {
        m8065a(view, Collections.emptyList());
    }

    /* renamed from: a */
    public void m8065a(final View view, final List<C3049d> list) {
        m8063a("update main view: " + view, new Runnable() { // from class: com.applovin.impl.sdk.a.b.4
            @Override // java.lang.Runnable
            public void run() {
                AbstractC3040b.this.f7571f.registerAdView(view);
                AbstractC3040b.this.f7571f.removeAllFriendlyObstructions();
                for (C3049d c3049d : list) {
                    if (c3049d.m8058a() != null) {
                        try {
                            AbstractC3040b.this.f7571f.addFriendlyObstruction(c3049d.m8058a(), c3049d.m8057b(), c3049d.m8056c());
                        } catch (Throwable th) {
                            if (C3349v.m6862a()) {
                                AbstractC3040b abstractC3040b = AbstractC3040b.this;
                                C3349v c3349v = abstractC3040b.f7568c;
                                String str = abstractC3040b.f7569d;
                                c3349v.m6854b(str, "Failed to add friendly obstruction (" + c3049d + ")", th);
                            }
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo8042a(AdSession adSession) {
    }

    /* renamed from: a */
    public void m8064a(final String str) {
        m8063a("track error", new Runnable() { // from class: com.applovin.impl.sdk.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                AbstractC3040b.this.f7571f.error(ErrorType.VIDEO, str);
            }
        });
    }

    /* renamed from: a */
    public void m8063a(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (AbstractC3040b.this.f7570e) {
                        if (C3349v.m6862a()) {
                            AbstractC3040b abstractC3040b = AbstractC3040b.this;
                            C3349v c3349v = abstractC3040b.f7568c;
                            String str2 = abstractC3040b.f7569d;
                            c3349v.m6855b(str2, "Running operation: " + str);
                        }
                        runnable.run();
                    } else if (C3349v.m6862a()) {
                        AbstractC3040b abstractC3040b2 = AbstractC3040b.this;
                        C3349v c3349v2 = abstractC3040b2.f7568c;
                        String str3 = abstractC3040b2.f7569d;
                        c3349v2.m6850e(str3, "Failed to run operation: " + str);
                    }
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        AbstractC3040b abstractC3040b3 = AbstractC3040b.this;
                        C3349v c3349v3 = abstractC3040b3.f7568c;
                        String str4 = abstractC3040b3.f7569d;
                        c3349v3.m6854b(str4, "Failed to run operation: " + str, th);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void m8062b() {
        m8061b(null);
    }

    /* renamed from: b */
    public void m8061b(@Nullable final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                AdSessionContext mo8044a;
                if (!AbstractC3040b.this.f7566a.isOpenMeasurementEnabled()) {
                    if (C3349v.m6862a()) {
                        AbstractC3040b abstractC3040b = AbstractC3040b.this;
                        abstractC3040b.f7568c.m6853c(abstractC3040b.f7569d, "Skip starting session - Open Measurement disabled");
                    }
                } else if (AbstractC3040b.this.f7571f != null) {
                    if (C3349v.m6862a()) {
                        AbstractC3040b abstractC3040b2 = AbstractC3040b.this;
                        C3349v c3349v = abstractC3040b2.f7568c;
                        String str = abstractC3040b2.f7569d;
                        c3349v.m6851d(str, "Attempting to start session again for ad: " + AbstractC3040b.this.f7566a);
                    }
                } else {
                    if (C3349v.m6862a()) {
                        AbstractC3040b abstractC3040b3 = AbstractC3040b.this;
                        abstractC3040b3.f7568c.m6855b(abstractC3040b3.f7569d, "Starting session");
                    }
                    AdSessionConfiguration mo8046a = AbstractC3040b.this.mo8046a();
                    if (mo8046a == null || (mo8044a = AbstractC3040b.this.mo8044a(webView)) == null) {
                        return;
                    }
                    try {
                        AbstractC3040b.this.f7571f = AdSession.createAdSession(mo8046a, mo8044a);
                        try {
                            AbstractC3040b abstractC3040b4 = AbstractC3040b.this;
                            abstractC3040b4.f7572g = AdEvents.createAdEvents(abstractC3040b4.f7571f);
                            AbstractC3040b abstractC3040b5 = AbstractC3040b.this;
                            abstractC3040b5.mo8042a(abstractC3040b5.f7571f);
                            AbstractC3040b.this.f7571f.start();
                            AbstractC3040b.this.f7570e = true;
                            if (C3349v.m6862a()) {
                                AbstractC3040b abstractC3040b6 = AbstractC3040b.this;
                                abstractC3040b6.f7568c.m6855b(abstractC3040b6.f7569d, "Session started");
                            }
                        } catch (Throwable th) {
                            if (C3349v.m6862a()) {
                                AbstractC3040b abstractC3040b7 = AbstractC3040b.this;
                                abstractC3040b7.f7568c.m6854b(abstractC3040b7.f7569d, "Failed to create ad events", th);
                            }
                        }
                    } catch (Throwable th2) {
                        if (C3349v.m6862a()) {
                            AbstractC3040b abstractC3040b8 = AbstractC3040b.this;
                            abstractC3040b8.f7568c.m6854b(abstractC3040b8.f7569d, "Failed to create session", th2);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public void mo8039c() {
        m8063a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                AbstractC3040b.this.f7572g.loaded();
            }
        });
    }

    /* renamed from: d */
    public void m8060d() {
        m8063a("track impression event", new Runnable() { // from class: com.applovin.impl.sdk.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                AbstractC3040b.this.f7572g.impressionOccurred();
            }
        });
    }

    /* renamed from: e */
    public void m8059e() {
        m8063a("stop session", new Runnable() { // from class: com.applovin.impl.sdk.a.b.6
            @Override // java.lang.Runnable
            public void run() {
                AbstractC3040b abstractC3040b = AbstractC3040b.this;
                abstractC3040b.f7570e = false;
                abstractC3040b.f7571f.finish();
                AbstractC3040b.this.f7571f = null;
            }
        });
    }
}
