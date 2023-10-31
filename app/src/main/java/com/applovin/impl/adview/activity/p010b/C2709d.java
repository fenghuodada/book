package com.applovin.impl.adview.activity.p010b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C2671a;
import com.applovin.impl.adview.C2776j;
import com.applovin.impl.adview.C2789m;
import com.applovin.impl.adview.C2803t;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.p008a.C2663j;
import com.applovin.impl.p008a.C2664k;
import com.applovin.impl.p008a.C2665l;
import com.applovin.impl.p008a.C2666m;
import com.applovin.impl.p008a.C2669n;
import com.applovin.impl.p008a.EnumC2658f;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p028a.C3049d;
import com.applovin.impl.sdk.p028a.C3053g;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.adview.activity.b.d */
/* loaded from: classes.dex */
public class C2709d extends C2724f {

    /* renamed from: C */
    private final C2649a f6459C;

    /* renamed from: D */
    private final Set<C2663j> f6460D;

    public C2709d(AbstractC3080e abstractC3080e, Activity activity, C3214m c3214m, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f6460D = hashSet;
        C2649a c2649a = (C2649a) abstractC3080e;
        this.f6459C = c2649a;
        C2649a.EnumC2653c enumC2653c = C2649a.EnumC2653c.VIDEO;
        hashSet.addAll(c2649a.m9305a(enumC2653c, C2664k.f6326a));
        m9117a(C2649a.EnumC2653c.IMPRESSION);
        m9115a(enumC2653c, "creativeView");
        c2649a.mo7884o().m8060d();
    }

    /* renamed from: A */
    private void m9118A() {
        if (!mo9050r() || this.f6460D.isEmpty()) {
            return;
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6407c;
            c3349v.m6851d("AppLovinFullscreenActivity", "Firing " + this.f6460D.size() + " un-fired video progress trackers when video was completed.");
        }
        m9111a(this.f6460D);
    }

    /* renamed from: a */
    private void m9117a(C2649a.EnumC2653c enumC2653c) {
        m9116a(enumC2653c, EnumC2658f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m9116a(C2649a.EnumC2653c enumC2653c, EnumC2658f enumC2658f) {
        m9114a(enumC2653c, "", enumC2658f);
    }

    /* renamed from: a */
    private void m9115a(C2649a.EnumC2653c enumC2653c, String str) {
        m9114a(enumC2653c, str, EnumC2658f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m9114a(C2649a.EnumC2653c enumC2653c, String str, EnumC2658f enumC2658f) {
        m9110a(this.f6459C.m9306a(enumC2653c, str), enumC2658f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9111a(Set<C2663j> set) {
        m9110a(set, EnumC2658f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m9110a(Set<C2663j> set, EnumC2658f enumC2658f) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(((C2724f) this).f6513s.getCurrentPosition());
        C2669n m9285n = this.f6459C.m9285n();
        Uri m9191a = m9285n != null ? m9285n.m9191a() : null;
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6407c;
            c3349v.m6855b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        C2665l.m9209a(set, seconds, m9191a, enumC2658f, this.f6406b);
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f
    /* renamed from: a */
    public void mo9085a(PointF pointF) {
        m9117a(C2649a.EnumC2653c.VIDEO_CLICK);
        this.f6459C.mo7884o().m8029o();
        super.mo9085a(pointF);
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f, com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: a */
    public void mo9062a(@Nullable ViewGroup viewGroup) {
        super.mo9062a(viewGroup);
        ((C2724f) this).f6519y.m8942a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new C2776j.InterfaceC2778a() { // from class: com.applovin.impl.adview.activity.b.d.1
            @Override // com.applovin.impl.adview.C2776j.InterfaceC2778a
            /* renamed from: a */
            public void mo8938a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(((C2724f) C2709d.this).f6498A - (((C2724f) C2709d.this).f6513s.getDuration() - ((C2724f) C2709d.this).f6513s.getCurrentPosition()));
                int m9064z = C2709d.this.m9064z();
                HashSet hashSet = new HashSet();
                Iterator it = new HashSet(C2709d.this.f6460D).iterator();
                while (it.hasNext()) {
                    C2663j c2663j = (C2663j) it.next();
                    if (c2663j.m9224a(seconds, m9064z)) {
                        hashSet.add(c2663j);
                        C2709d.this.f6460D.remove(c2663j);
                    }
                }
                C2709d.this.m9111a(hashSet);
                if (m9064z >= 25 && m9064z < 50) {
                    C2709d.this.f6459C.mo7884o().m8038f();
                } else if (m9064z >= 50 && m9064z < 75) {
                    C2709d.this.f6459C.mo7884o().m8037g();
                } else if (m9064z >= 75) {
                    C2709d.this.f6459C.mo7884o().m8036h();
                }
            }

            @Override // com.applovin.impl.adview.C2776j.InterfaceC2778a
            /* renamed from: b */
            public boolean mo8937b() {
                return !((C2724f) C2709d.this).f6499B;
            }
        });
        ArrayList arrayList = new ArrayList();
        C2671a c2671a = ((C2724f) this).f6514t;
        if (c2671a != null) {
            arrayList.add(new C3049d(c2671a, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        C2789m c2789m = ((C2724f) this).f6515u;
        if (c2789m != null) {
            arrayList.add(new C3049d(c2789m, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        ProgressBar progressBar = ((C2724f) this).f6518x;
        if (progressBar != null) {
            arrayList.add(new C3049d(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ImageView imageView = ((C2724f) this).f6516v;
        if (imageView != null) {
            arrayList.add(new C3049d(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        C2803t c2803t = ((C2724f) this).f6517w;
        if (c2803t != null) {
            arrayList.add(new C3049d(c2803t, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.f6459C.mo7884o().m8065a(((C2724f) this).f6513s, arrayList);
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f
    /* renamed from: c */
    public void mo9077c() {
        m9115a(C2649a.EnumC2653c.VIDEO, "skip");
        this.f6459C.mo7884o().m8030n();
        super.mo9077c();
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f
    /* renamed from: c */
    public void mo9076c(long j) {
        super.mo9076c(j);
        this.f6459C.mo7884o().m8045a((float) TimeUnit.MILLISECONDS.toSeconds(j), Utils.isVideoMutedInitially(this.f6406b));
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f
    /* renamed from: c */
    public void mo9074c(String str) {
        m9116a(C2649a.EnumC2653c.ERROR, EnumC2658f.MEDIA_FILE_ERROR);
        this.f6459C.mo7884o().m8064a(str);
        super.mo9074c(str);
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f, com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: d */
    public void mo9055d() {
        mo9062a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f, com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: e */
    public void mo9053e() {
        ((C2724f) this).f6519y.m8939c();
        super.mo9053e();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: f */
    public void mo9108f() {
        super.mo9108f();
        m9115a(((C2724f) this).f6499B ? C2649a.EnumC2653c.COMPANION : C2649a.EnumC2653c.VIDEO, "resume");
        this.f6459C.mo7884o().m8033k();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: g */
    public void mo9107g() {
        super.mo9107g();
        m9115a(((C2724f) this).f6499B ? C2649a.EnumC2653c.COMPANION : C2649a.EnumC2653c.VIDEO, "pause");
        this.f6459C.mo7884o().m8034j();
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f, com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: h */
    public void mo9052h() {
        if (this.f6459C != null) {
            m9115a(C2649a.EnumC2653c.VIDEO, "close");
            m9115a(C2649a.EnumC2653c.COMPANION, "close");
        }
        super.mo9052h();
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f, com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: u */
    public void mo9048u() {
        long m7925ae;
        int m7880s;
        long j = 0;
        if (this.f6459C.m7926ad() >= 0 || this.f6459C.m7925ae() >= 0) {
            if (this.f6459C.m7926ad() >= 0) {
                m7925ae = this.f6459C.m7926ad();
            } else {
                C2649a c2649a = this.f6459C;
                C2666m m9286m = c2649a.m9286m();
                if (m9286m == null || m9286m.m9196b() <= 0) {
                    long j2 = ((C2724f) this).f6498A;
                    if (j2 > 0) {
                        j = 0 + j2;
                    }
                } else {
                    j = 0 + TimeUnit.SECONDS.toMillis(m9286m.m9196b());
                }
                if (c2649a.m7924af() && (m7880s = (int) c2649a.m7880s()) > 0) {
                    j += TimeUnit.SECONDS.toMillis(m7880s);
                }
                m7925ae = (long) ((this.f6459C.m7925ae() / 100.0d) * j);
            }
            m9146b(m7925ae);
        }
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f
    /* renamed from: v */
    public void mo9068v() {
        super.mo9068v();
        C2649a c2649a = this.f6459C;
        if (c2649a != null) {
            c2649a.mo7884o().m8032l();
        }
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f
    /* renamed from: w */
    public void mo9067w() {
        super.mo9067w();
        C2649a c2649a = this.f6459C;
        if (c2649a != null) {
            c2649a.mo7884o().m8031m();
        }
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f
    /* renamed from: x */
    public void mo9066x() {
        super.mo9066x();
        m9115a(C2649a.EnumC2653c.VIDEO, ((C2724f) this).f6520z ? "mute" : "unmute");
        this.f6459C.mo7884o().m8041a(((C2724f) this).f6520z);
    }

    @Override // com.applovin.impl.adview.activity.p010b.C2724f
    /* renamed from: y */
    public void mo9065y() {
        m9118A();
        if (!C2665l.m9202c(this.f6459C)) {
            if (C3349v.m6862a()) {
                this.f6407c.m6855b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            mo9052h();
        } else if (((C2724f) this).f6499B) {
        } else {
            m9115a(C2649a.EnumC2653c.COMPANION, "creativeView");
            this.f6459C.mo7884o().m8035i();
            C3053g mo7884o = this.f6459C.mo7884o();
            AppLovinAdView appLovinAdView = this.f6410f;
            mo7884o.m8065a(appLovinAdView, Collections.singletonList(new C3049d(appLovinAdView, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.mo9065y();
        }
    }
}
