package com.applovin.impl.sdk.p033e;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.p008a.C2656d;
import com.applovin.impl.p008a.C2660h;
import com.applovin.impl.p008a.C2669n;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p032d.C3123d;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;

/* renamed from: com.applovin.impl.sdk.e.e */
/* loaded from: classes.dex */
class C3142e extends AbstractC3138c {

    /* renamed from: c */
    private final C2649a f8214c;

    public C3142e(C2649a c2649a, C3214m c3214m, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", c2649a, c3214m, appLovinAdLoadListener);
        this.f8214c = c2649a;
    }

    /* renamed from: j */
    private void m7654j() {
        String str;
        String str2;
        String str3;
        if (m7673b()) {
            return;
        }
        if (this.f8214c.m9299aQ()) {
            C2656d m9303aM = this.f8214c.m9303aM();
            if (m9303aM != null) {
                C2660h m9248b = m9303aM.m9248b();
                if (m9248b != null) {
                    Uri m9228b = m9248b.m9228b();
                    String uri = m9228b != null ? m9228b.toString() : "";
                    String m9227c = m9248b.m9227c();
                    if (!URLUtil.isValidUrl(uri) && !StringUtils.isValidString(m9227c)) {
                        if (C3349v.m6862a()) {
                            m7702c("Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    } else if (m9248b.m9233a() == C2660h.EnumC2661a.STATIC) {
                        if (C3349v.m6862a()) {
                            m7705a("Caching static companion ad at " + uri + "...");
                        }
                        Uri m7668c = m7668c(uri, Collections.emptyList(), false);
                        if (m7668c != null) {
                            m9248b.m9232a(m7668c);
                            this.f8214c.m7942a(true);
                            return;
                        } else if (!C3349v.m6862a()) {
                            return;
                        } else {
                            str2 = "Failed to cache static companion ad";
                        }
                    } else if (m9248b.m9233a() == C2660h.EnumC2661a.HTML) {
                        if (StringUtils.isValidString(uri)) {
                            if (C3349v.m6862a()) {
                                m7705a("Begin caching HTML companion ad. Fetching from " + uri + "...");
                            }
                            m9227c = m7665f(uri);
                            if (StringUtils.isValidString(m9227c)) {
                                if (C3349v.m6862a()) {
                                    str3 = "HTML fetched. Caching HTML now...";
                                    m7705a(str3);
                                }
                                m9248b.m9229a(m7675a(m9227c, Collections.emptyList(), this.f8214c));
                            } else if (!C3349v.m6862a()) {
                                return;
                            } else {
                                str2 = "Unable to load companion ad resources from " + uri;
                            }
                        } else {
                            if (C3349v.m6862a()) {
                                str3 = "Caching provided HTML for companion ad. No fetch required. HTML: " + m9227c;
                                m7705a(str3);
                            }
                            m9248b.m9229a(m7675a(m9227c, Collections.emptyList(), this.f8214c));
                        }
                        this.f8214c.m7942a(true);
                        return;
                    } else if (m9248b.m9233a() != C2660h.EnumC2661a.IFRAME || !C3349v.m6862a()) {
                        return;
                    } else {
                        str = "Skip caching of iFrame resource...";
                    }
                } else if (!C3349v.m6862a()) {
                    return;
                } else {
                    str2 = "Failed to retrieve non-video resources from companion ad. Skipping...";
                }
                m7700d(str2);
                return;
            } else if (!C3349v.m6862a()) {
                return;
            } else {
                str = "No companion ad provided. Skipping...";
            }
        } else if (!C3349v.m6862a()) {
            return;
        } else {
            str = "Companion ad caching disabled. Skipping...";
        }
        m7705a(str);
    }

    /* renamed from: k */
    private void m7653k() {
        C2669n m9285n;
        Uri m9187b;
        if (m7673b()) {
            return;
        }
        if (!this.f8214c.m9298aR()) {
            if (C3349v.m6862a()) {
                m7705a("Video caching disabled. Skipping...");
            }
        } else if (this.f8214c.m9286m() == null || (m9285n = this.f8214c.m9285n()) == null || (m9187b = m9285n.m9187b()) == null) {
        } else {
            Uri m7674a = m7674a(m9187b.toString(), Collections.emptyList(), false);
            if (m7674a != null) {
                if (C3349v.m6862a()) {
                    m7705a("Video file successfully cached into: " + m7674a);
                }
                m9285n.m9190a(m7674a);
            } else if (C3349v.m6862a()) {
                m7700d("Failed to cache video file: " + m9285n);
            }
        }
    }

    /* renamed from: l */
    private void m7652l() {
        String m9301aO;
        String str;
        if (m7673b()) {
            return;
        }
        if (this.f8214c.m9300aP() != null) {
            if (C3349v.m6862a()) {
                m7705a("Begin caching HTML template. Fetching from " + this.f8214c.m9300aP() + "...");
            }
            m9301aO = m7676a(this.f8214c.m9300aP().toString(), this.f8214c.m7967H());
        } else {
            m9301aO = this.f8214c.m9301aO();
        }
        if (StringUtils.isValidString(m9301aO)) {
            C2649a c2649a = this.f8214c;
            c2649a.m9304a(m7675a(m9301aO, c2649a.m7967H(), this.f8214c));
            if (!C3349v.m6862a()) {
                return;
            }
            str = "Finish caching HTML template " + this.f8214c.m9301aO() + " for ad #" + this.f8214c.getAdIdNumber();
        } else if (!C3349v.m6862a()) {
            return;
        } else {
            str = "Unable to load HTML template";
        }
        m7705a(str);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3138c
    /* renamed from: h */
    public void mo7656h() {
        this.f8214c.mo7884o().m8059e();
        super.mo7656h();
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3138c
    /* renamed from: i */
    public void mo7655i() {
        this.f8214c.mo7884o().mo8039c();
        super.mo7655i();
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3138c, java.lang.Runnable
    public void run() {
        super.run();
        if (this.f8214c.mo7890f()) {
            if (C3349v.m6862a()) {
                m7705a("Begin caching for VAST streaming ad #" + ((AbstractC3138c) this).f8200a.getAdIdNumber() + "...");
            }
            m7669c();
            if (this.f8214c.m9288i()) {
                mo7655i();
            }
            C2649a.EnumC2652b m9289g = this.f8214c.m9289g();
            C2649a.EnumC2652b enumC2652b = C2649a.EnumC2652b.COMPANION_AD;
            if (m9289g == enumC2652b) {
                m7654j();
                m7652l();
            } else {
                m7653k();
            }
            if (!this.f8214c.m9288i()) {
                mo7655i();
            }
            if (this.f8214c.m9289g() == enumC2652b) {
                m7653k();
            } else {
                m7654j();
                m7652l();
            }
        } else {
            if (C3349v.m6862a()) {
                m7705a("Begin caching for VAST ad #" + ((AbstractC3138c) this).f8200a.getAdIdNumber() + "...");
            }
            m7669c();
            m7654j();
            m7653k();
            m7652l();
            mo7655i();
        }
        if (C3349v.m6862a()) {
            m7705a("Finished caching VAST ad #" + this.f8214c.getAdIdNumber());
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f8214c.getCreatedAtMillis();
        C3123d.m7748a(this.f8214c, this.f8192b);
        C3123d.m7749a(currentTimeMillis, this.f8214c, this.f8192b);
        m7680a(this.f8214c);
        this.f8214c.m9292b();
        m7682a();
    }
}
