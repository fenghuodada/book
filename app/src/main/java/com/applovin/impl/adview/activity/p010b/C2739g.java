package com.applovin.impl.adview.activity.p010b;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.support.p000v4.media.session.C0017a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.C2671a;
import com.applovin.impl.adview.C2789m;
import com.applovin.impl.adview.InterfaceC2772g;
import com.applovin.impl.adview.activity.p009a.C2686d;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p028a.AbstractC3040b;
import com.applovin.impl.sdk.p028a.C3049d;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.C3075a;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.C3393R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.g */
/* loaded from: classes.dex */
public class C2739g extends AbstractC2688a implements InterfaceC2772g {

    /* renamed from: A */
    private AtomicBoolean f6537A;

    /* renamed from: B */
    private boolean f6538B;

    /* renamed from: C */
    private long f6539C;

    /* renamed from: D */
    private long f6540D;

    /* renamed from: s */
    private final C2686d f6541s;
    @Nullable

    /* renamed from: t */
    private final C2789m f6542t;
    @Nullable

    /* renamed from: u */
    private final ImageView f6543u;
    @Nullable

    /* renamed from: v */
    private final C2671a f6544v;

    /* renamed from: w */
    private final boolean f6545w;

    /* renamed from: x */
    private double f6546x;

    /* renamed from: y */
    private double f6547y;

    /* renamed from: z */
    private AtomicBoolean f6548z;

    /* renamed from: com.applovin.impl.adview.activity.b.g$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2744a implements View.OnClickListener {
        private View$OnClickListenerC2744a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == C2739g.this.f6542t) {
                if (!C2739g.this.mo9049s()) {
                    C2739g.this.m9047v();
                    return;
                }
                C2739g.this.m9133p();
                C2739g.this.f6421q.m7831b();
            } else if (view == C2739g.this.f6543u) {
                C2739g.this.m9045x();
            } else if (C3349v.m6862a()) {
                C3349v c3349v = C2739g.this.f6407c;
                c3349v.m6850e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public C2739g(AbstractC3080e abstractC3080e, Activity activity, C3214m c3214m, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f6541s = new C2686d(this.f6405a, this.f6409e, this.f6406b);
        boolean mo7890f = this.f6405a.mo7890f();
        this.f6545w = mo7890f;
        this.f6548z = new AtomicBoolean();
        this.f6537A = new AtomicBoolean();
        this.f6538B = Utils.isVideoMutedInitially(this.f6406b);
        this.f6539C = -2L;
        this.f6540D = 0L;
        View$OnClickListenerC2744a view$OnClickListenerC2744a = new View$OnClickListenerC2744a();
        if (abstractC3080e.m7882q() >= 0) {
            C2789m c2789m = new C2789m(abstractC3080e.m7876w(), activity);
            this.f6542t = c2789m;
            c2789m.setVisibility(8);
            c2789m.setOnClickListener(view$OnClickListenerC2744a);
        } else {
            this.f6542t = null;
        }
        if (m9059a(this.f6538B, c3214m)) {
            ImageView imageView = new ImageView(activity);
            this.f6543u = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(view$OnClickListenerC2744a);
            m9054d(this.f6538B);
        } else {
            this.f6543u = null;
        }
        if (!mo7890f) {
            this.f6544v = null;
            return;
        }
        C2671a c2671a = new C2671a(activity, ((Integer) c3214m.m7456a(C3109b.f7902cB)).intValue(), 16842874);
        this.f6544v = c2671a;
        c2671a.setColor(Color.parseColor("#75FFFFFF"));
        c2671a.setBackgroundColor(Color.parseColor("#00000000"));
        c2671a.setVisibility(8);
    }

    /* renamed from: a */
    private static boolean m9059a(boolean z, C3214m c3214m) {
        if (((Boolean) c3214m.m7456a(C3109b.f7943cq)).booleanValue()) {
            if (!((Boolean) c3214m.m7456a(C3109b.f7944cr)).booleanValue() || z) {
                return true;
            }
            return ((Boolean) c3214m.m7456a(C3109b.f7946ct)).booleanValue();
        }
        return false;
    }

    /* renamed from: d */
    private void m9054d(boolean z) {
        if (C3294g.m7023d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f6409e.getDrawable(z ? C3393R.C3395drawable.unmute_to_mute : C3393R.C3395drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f6543u.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f6543u.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri m7939aC = z ? this.f6405a.m7939aC() : this.f6405a.m7938aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f6543u.setImageURI(m7939aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m9044y() {
        if (this.f6537A.compareAndSet(false, true)) {
            m9153a(this.f6542t, this.f6405a.m7882q(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.3
                @Override // java.lang.Runnable
                public void run() {
                    C2739g.this.f6539C = -1L;
                    C2739g.this.f6540D = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.p030b.C3097b.InterfaceC3104a
    /* renamed from: a */
    public void mo7826a() {
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.adview.InterfaceC2772g
    /* renamed from: a */
    public void mo8953a(double d) {
        m9144b("javascript:al_setVideoMuted(" + this.f6538B + ");");
        C2671a c2671a = this.f6544v;
        if (c2671a != null) {
            c2671a.m9179b();
        }
        if (this.f6542t != null) {
            m9044y();
        }
        this.f6410f.getController().m8996m();
        this.f6547y = d;
        mo9048u();
        if (this.f6405a.m7917am()) {
            this.f6421q.m7835a(this.f6405a, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: a */
    public void mo9063a(long j) {
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: a */
    public void mo9062a(@Nullable ViewGroup viewGroup) {
        this.f6541s.m9163a(this.f6543u, this.f6542t, this.f6411g, this.f6544v, this.f6410f, viewGroup);
        this.f6410f.getController().m9031a(this);
        m9148a(false);
        C2671a c2671a = this.f6544v;
        if (c2671a != null) {
            c2671a.m9180a();
        }
        this.f6410f.renderAd(this.f6405a);
        if (this.f6542t != null) {
            this.f6406b.m7469S().m7618a(new C3189z(this.f6406b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.1
                @Override // java.lang.Runnable
                public void run() {
                    C2739g.this.m9044y();
                }
            }), C3163o.EnumC3165a.MAIN, this.f6405a.m7881r(), true);
        }
        this.f6406b.m7469S().m7619a(new C3189z(this.f6406b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.2
            @Override // java.lang.Runnable
            public void run() {
                C2739g c2739g = C2739g.this;
                C2789m c2789m = c2739g.f6411g;
                AbstractC3040b mo7884o = c2739g.f6405a.mo7884o();
                if (c2789m == null) {
                    mo7884o.m8066a(C2739g.this.f6410f);
                    return;
                }
                C2739g c2739g2 = C2739g.this;
                mo7884o.m8065a(c2739g2.f6410f, Collections.singletonList(new C3049d(c2739g2.f6411g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            }
        }), C3163o.EnumC3165a.MAIN, 500L);
        super.m9143b(this.f6538B);
    }

    @Override // com.applovin.impl.adview.InterfaceC2772g
    /* renamed from: a_ */
    public void mo8952a_() {
        m9046w();
    }

    @Override // com.applovin.impl.sdk.p030b.C3097b.InterfaceC3104a
    /* renamed from: b */
    public void mo7825b() {
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        m9047v();
    }

    @Override // com.applovin.impl.adview.InterfaceC2772g
    /* renamed from: b */
    public void mo8951b(double d) {
        this.f6546x = d;
    }

    @Override // com.applovin.impl.adview.InterfaceC2772g
    /* renamed from: b_ */
    public void mo8950b_() {
        C2671a c2671a = this.f6544v;
        if (c2671a != null) {
            c2671a.m9180a();
        }
    }

    @Override // com.applovin.impl.adview.InterfaceC2772g
    /* renamed from: c */
    public void mo8949c() {
        C2671a c2671a = this.f6544v;
        if (c2671a != null) {
            c2671a.m9179b();
        }
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
        super.mo9052h();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: m */
    public void mo9051m() {
        super.m9156a((int) this.f6546x, this.f6545w, mo9050r(), this.f6539C);
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: r */
    public boolean mo9050r() {
        return this.f6546x >= ((double) this.f6405a.m7958Q());
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: s */
    public boolean mo9049s() {
        return m9131t() && !mo9050r();
    }

    @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a
    /* renamed from: u */
    public void mo9048u() {
        long m7925ae;
        long millis;
        if (this.f6405a.m7926ad() >= 0 || this.f6405a.m7925ae() >= 0) {
            if (this.f6405a.m7926ad() >= 0) {
                m7925ae = this.f6405a.m7926ad();
            } else {
                C3075a c3075a = (C3075a) this.f6405a;
                double d = this.f6547y;
                long millis2 = d > 0.0d ? 0 + TimeUnit.SECONDS.toMillis((long) d) : 0L;
                if (c3075a.m7924af()) {
                    int m8001l = (int) ((C3075a) this.f6405a).m8001l();
                    if (m8001l > 0) {
                        millis = TimeUnit.SECONDS.toMillis(m8001l);
                    } else {
                        int m7880s = (int) c3075a.m7880s();
                        if (m7880s > 0) {
                            millis = TimeUnit.SECONDS.toMillis(m7880s);
                        }
                    }
                    millis2 += millis;
                }
                m7925ae = (long) ((this.f6405a.m7925ae() / 100.0d) * millis2);
            }
            m9146b(m7925ae);
        }
    }

    /* renamed from: v */
    public void m9047v() {
        this.f6539C = SystemClock.elapsedRealtime() - this.f6540D;
        if (C3349v.m6862a()) {
            this.f6407c.m6855b("AppLovinFullscreenActivity", C0017a.m13071a(new StringBuilder("Skipping video with skip time: "), this.f6539C, "ms"));
        }
        this.f6408d.m7738f();
        this.f6414j++;
        if (this.f6405a.m7875x()) {
            mo9052h();
        } else {
            m9046w();
        }
    }

    /* renamed from: w */
    public void m9046w() {
        if (this.f6548z.compareAndSet(false, true)) {
            if (C3349v.m6862a()) {
                this.f6407c.m6855b("AppLovinFullscreenActivity", "Showing postitial...");
            }
            m9144b("javascript:al_showPostitial();");
            C2789m c2789m = this.f6542t;
            if (c2789m != null) {
                c2789m.setVisibility(8);
            }
            ImageView imageView = this.f6543u;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            C2671a c2671a = this.f6544v;
            if (c2671a != null) {
                c2671a.m9179b();
            }
            if (this.f6411g != null) {
                if (this.f6405a.m7880s() >= 0) {
                    m9153a(this.f6411g, this.f6405a.m7880s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.4
                        @Override // java.lang.Runnable
                        public void run() {
                            C2739g.this.f6413i = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.f6411g.setVisibility(0);
                }
            }
            this.f6410f.getController().m8994n();
        }
    }

    /* renamed from: x */
    public void m9045x() {
        this.f6538B = !this.f6538B;
        m9144b("javascript:al_setVideoMuted(" + this.f6538B + ");");
        m9054d(this.f6538B);
        m9147a(this.f6538B, 0L);
    }
}
