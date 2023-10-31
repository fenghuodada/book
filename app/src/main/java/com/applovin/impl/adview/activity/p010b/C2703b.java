package com.applovin.impl.adview.activity.p010b;

import android.app.Activity;
import android.os.SystemClock;
import android.support.p000v4.media.session.C0017a;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.C2789m;
import com.applovin.impl.adview.activity.p009a.C2681b;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p028a.AbstractC3040b;
import com.applovin.impl.sdk.p028a.C3049d;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.C3075a;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.C3291e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.b */
/* loaded from: classes.dex */
public class C2703b extends AbstractC2688a {

    /* renamed from: s */
    private final C2681b f6449s;

    /* renamed from: t */
    private C3291e f6450t;

    /* renamed from: u */
    private long f6451u;

    /* renamed from: v */
    private AtomicBoolean f6452v;

    public C2703b(AbstractC3080e abstractC3080e, Activity activity, C3214m c3214m, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f6449s = new C2681b(this.f6405a, this.f6409e, this.f6406b);
        this.f6452v = new AtomicBoolean();
    }

    /* renamed from: c */
    private long m9129c() {
        AbstractC3080e abstractC3080e = this.f6405a;
        if (abstractC3080e instanceof C3075a) {
            float m8001l = ((C3075a) abstractC3080e).m8001l();
            if (m8001l <= 0.0f) {
                m8001l = (float) this.f6405a.m7880s();
            }
            return (long) ((this.f6405a.m7957R() / 100.0d) * Utils.secondsToMillisLong(m8001l));
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.p030b.C3097b.InterfaceC3104a
    /* renamed from: a */
    public void mo7826a() {
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: a */
    public void mo9063a(long j) {
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: a */
    public void mo9062a(@Nullable ViewGroup viewGroup) {
        this.f6449s.m9166a(this.f6411g, this.f6410f, viewGroup);
        m9148a(false);
        this.f6410f.renderAd(this.f6405a);
        m9149a("javascript:al_onPoststitialShow();", this.f6405a.m7956S());
        if (m9131t()) {
            long m9129c = m9129c();
            this.f6451u = m9129c;
            if (m9129c > 0) {
                if (C3349v.m6862a()) {
                    this.f6407c.m6855b("AppLovinFullscreenActivity", C0017a.m13071a(new StringBuilder("Scheduling timer for ad fully watched in "), this.f6451u, "ms..."));
                }
                this.f6450t = C3291e.m7031a(this.f6451u, this.f6406b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C3349v.m6862a()) {
                            C2703b.this.f6407c.m6855b("AppLovinFullscreenActivity", "Marking ad as fully watched");
                        }
                        C2703b.this.f6452v.set(true);
                    }
                });
            }
        }
        if (this.f6411g != null) {
            if (this.f6405a.m7880s() >= 0) {
                m9153a(this.f6411g, this.f6405a.m7880s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C2703b.this.f6413i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f6411g.setVisibility(0);
            }
        }
        mo9048u();
        this.f6406b.m7469S().m7619a(new C3189z(this.f6406b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                C2703b c2703b = C2703b.this;
                C2789m c2789m = c2703b.f6411g;
                AbstractC3040b mo7884o = c2703b.f6405a.mo7884o();
                if (c2789m == null) {
                    mo7884o.m8066a(C2703b.this.f6410f);
                    return;
                }
                C2703b c2703b2 = C2703b.this;
                mo7884o.m8065a(c2703b2.f6410f, Collections.singletonList(new C3049d(c2703b2.f6411g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            }
        }), C3163o.EnumC3165a.MAIN, TimeUnit.SECONDS.toMillis(1L));
        super.m9143b(Utils.isVideoMutedInitially(this.f6406b));
    }

    @Override // com.applovin.impl.sdk.p030b.C3097b.InterfaceC3104a
    /* renamed from: b */
    public void mo7825b() {
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: d */
    public void mo9055d() {
        mo9062a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: e */
    public void mo9053e() {
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: h */
    public void mo9052h() {
        mo9051m();
        C3291e c3291e = this.f6450t;
        if (c3291e != null) {
            c3291e.m7032a();
            this.f6450t = null;
        }
        super.mo9052h();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: m */
    public void mo9051m() {
        C3291e c3291e;
        boolean mo9050r = mo9050r();
        int i = 100;
        if (m9131t()) {
            if (!mo9050r && (c3291e = this.f6450t) != null) {
                i = (int) Math.min(100.0d, ((this.f6451u - c3291e.m7030b()) / this.f6451u) * 100.0d);
            }
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6407c;
                c3349v.m6855b("AppLovinFullscreenActivity", "Ad engaged at " + i + "%");
            }
        }
        super.m9156a(i, false, mo9050r, -2L);
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: r */
    public boolean mo9050r() {
        if (m9131t()) {
            return this.f6452v.get();
        }
        return true;
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: s */
    public boolean mo9049s() {
        return false;
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: u */
    public void mo9048u() {
        long m7925ae;
        int m8001l;
        long j = 0;
        if (this.f6405a.m7926ad() >= 0 || this.f6405a.m7925ae() >= 0) {
            if (this.f6405a.m7926ad() >= 0) {
                m7925ae = this.f6405a.m7926ad();
            } else {
                if (this.f6405a.m7924af() && ((m8001l = (int) ((C3075a) this.f6405a).m8001l()) > 0 || (m8001l = (int) this.f6405a.m7880s()) > 0)) {
                    j = 0 + TimeUnit.SECONDS.toMillis(m8001l);
                }
                m7925ae = (long) ((this.f6405a.m7925ae() / 100.0d) * j);
            }
            m9146b(m7925ae);
        }
    }
}
