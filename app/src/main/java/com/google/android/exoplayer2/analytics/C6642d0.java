package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.os.SystemClock;
import android.support.p000v4.media.session.C0017a;
import android.util.SparseArray;
import androidx.activity.result.C0063d;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.C0171d;
import androidx.appcompat.view.menu.C0235r;
import androidx.appcompat.widget.C0406q1;
import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.core.C0499a;
import androidx.core.content.C0663f;
import androidx.core.p003os.C0740h;
import androidx.datastore.preferences.C1151g;
import androidx.datastore.preferences.protobuf.C1169e;
import androidx.fragment.app.C1431t;
import com.adcolony.sdk.C2362x3;
import com.ambrose.overwall.C2391a;
import com.ambrose.overwall.fragment.C2402a;
import com.applovin.impl.sdk.p033e.C3132a0;
import com.bumptech.glide.load.engine.C3541k;
import com.bumptech.glide.request.C3824d;
import com.facebook.ads.AdError;
import com.google.android.datatransport.runtime.backends.C6486h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6548g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6552k;
import com.google.android.datatransport.runtime.scheduling.persistence.C6595o;
import com.google.android.datatransport.runtime.scheduling.persistence.C6605y;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.C6633a1;
import com.google.android.exoplayer2.C6964f;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7126q;
import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.C7499x;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.InterfaceC6718s;
import com.google.android.exoplayer2.decoder.C6747e;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.source.C7174j;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.source.C7184m;
import com.google.android.exoplayer2.source.C7187o;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.source.InterfaceC7196v;
import com.google.android.exoplayer2.trackselection.C7303k;
import com.google.android.exoplayer2.upstream.InterfaceC7352d;
import com.google.android.exoplayer2.util.C7397b0;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.exoplayer2.util.InterfaceC7396b;
import com.google.android.exoplayer2.util.InterfaceC7412i;
import com.google.android.exoplayer2.video.C7496w;
import com.google.android.exoplayer2.video.InterfaceC7494v;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.AbstractC8021u;
import com.google.common.collect.C7998n0;
import com.google.common.collect.C8000o0;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.exoplayer2.analytics.d0 */
/* loaded from: classes.dex */
public final class C6642d0 implements Player.InterfaceC6628d, InterfaceC6718s, InterfaceC7494v, InterfaceC7196v, InterfaceC7352d.InterfaceC7353a, InterfaceC6789n {

    /* renamed from: a */
    public final AbstractC6984j1.C6986b f10572a;

    /* renamed from: b */
    public final AbstractC6984j1.C6987c f10573b;

    /* renamed from: c */
    public final C6643a f10574c;

    /* renamed from: d */
    public final SparseArray<AnalyticsListener.C6634a> f10575d;

    /* renamed from: e */
    public C7417m<AnalyticsListener> f10576e;

    /* renamed from: f */
    public Player f10577f;

    /* renamed from: g */
    public InterfaceC7412i f10578g;

    /* renamed from: h */
    public boolean f10579h;

    /* renamed from: com.google.android.exoplayer2.analytics.d0$a */
    /* loaded from: classes.dex */
    public static final class C6643a {

        /* renamed from: a */
        public final AbstractC6984j1.C6986b f10580a;

        /* renamed from: b */
        public AbstractC8013s<InterfaceC7188p.C7189a> f10581b;

        /* renamed from: c */
        public C8000o0 f10582c;
        @Nullable

        /* renamed from: d */
        public InterfaceC7188p.C7189a f10583d;

        /* renamed from: e */
        public InterfaceC7188p.C7189a f10584e;

        /* renamed from: f */
        public InterfaceC7188p.C7189a f10585f;

        public C6643a(AbstractC6984j1.C6986b c6986b) {
            this.f10580a = c6986b;
            AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
            this.f10581b = C7998n0.f15785e;
            this.f10582c = C8000o0.f15789g;
        }

        @Nullable
        /* renamed from: b */
        public static InterfaceC7188p.C7189a m6135b(Player player, AbstractC8013s<InterfaceC7188p.C7189a> abstractC8013s, @Nullable InterfaceC7188p.C7189a c7189a, AbstractC6984j1.C6986b c6986b) {
            Object mo5411l;
            int i;
            AbstractC6984j1 mo5762G = player.mo5762G();
            int mo5736j = player.mo5736j();
            if (mo5762G.m5685p()) {
                mo5411l = null;
            } else {
                mo5411l = mo5762G.mo5411l(mo5736j);
            }
            if (!player.mo5746d() && !mo5762G.m5685p()) {
                i = mo5762G.mo5413f(mo5736j, c6986b, false).m5683b(C6622C.m6217b(player.getCurrentPosition()) - c6986b.f12156e);
            } else {
                i = -1;
            }
            for (int i2 = 0; i2 < abstractC8013s.size(); i2++) {
                InterfaceC7188p.C7189a c7189a2 = abstractC8013s.get(i2);
                if (m6134c(c7189a2, mo5411l, player.mo5746d(), player.mo5722y(), player.mo5732n(), i)) {
                    return c7189a2;
                }
            }
            if (abstractC8013s.isEmpty() && c7189a != null) {
                if (m6134c(c7189a, mo5411l, player.mo5746d(), player.mo5722y(), player.mo5732n(), i)) {
                    return c7189a;
                }
            }
            return null;
        }

        /* renamed from: c */
        public static boolean m6134c(InterfaceC7188p.C7189a c7189a, @Nullable Object obj, boolean z, int i, int i2, int i3) {
            if (c7189a.f12928a.equals(obj)) {
                int i4 = c7189a.f12929b;
                return (z && i4 == i && c7189a.f12930c == i2) || (!z && i4 == -1 && c7189a.f12932e == i3);
            }
            return false;
        }

        /* renamed from: a */
        public final void m6136a(AbstractC8021u.C8022a<InterfaceC7188p.C7189a, AbstractC6984j1> c8022a, @Nullable InterfaceC7188p.C7189a c7189a, AbstractC6984j1 abstractC6984j1) {
            if (c7189a == null) {
                return;
            }
            if (abstractC6984j1.mo5414b(c7189a.f12928a) == -1 && (abstractC6984j1 = (AbstractC6984j1) this.f10582c.get(c7189a)) == null) {
                return;
            }
            c8022a.m4228b(c7189a, abstractC6984j1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (com.google.common.base.C7937f.m4290a(r3.f10583d, r3.f10585f) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
            if (r3.f10581b.contains(r3.f10583d) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
            m6136a(r0, r3.f10583d, r4);
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m6133d(com.google.android.exoplayer2.AbstractC6984j1 r4) {
            /*
                r3 = this;
                com.google.common.collect.u$a r0 = new com.google.common.collect.u$a
                r1 = 4
                r0.<init>(r1)
                com.google.common.collect.s<com.google.android.exoplayer2.source.p$a> r1 = r3.f10581b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L37
                com.google.android.exoplayer2.source.p$a r1 = r3.f10584e
                r3.m6136a(r0, r1, r4)
                com.google.android.exoplayer2.source.p$a r1 = r3.f10585f
                com.google.android.exoplayer2.source.p$a r2 = r3.f10584e
                boolean r1 = com.google.common.base.C7937f.m4290a(r1, r2)
                if (r1 != 0) goto L22
                com.google.android.exoplayer2.source.p$a r1 = r3.f10585f
                r3.m6136a(r0, r1, r4)
            L22:
                com.google.android.exoplayer2.source.p$a r1 = r3.f10583d
                com.google.android.exoplayer2.source.p$a r2 = r3.f10584e
                boolean r1 = com.google.common.base.C7937f.m4290a(r1, r2)
                if (r1 != 0) goto L5d
                com.google.android.exoplayer2.source.p$a r1 = r3.f10583d
                com.google.android.exoplayer2.source.p$a r2 = r3.f10585f
                boolean r1 = com.google.common.base.C7937f.m4290a(r1, r2)
                if (r1 != 0) goto L5d
                goto L58
            L37:
                r1 = 0
            L38:
                com.google.common.collect.s<com.google.android.exoplayer2.source.p$a> r2 = r3.f10581b
                int r2 = r2.size()
                if (r1 >= r2) goto L4e
                com.google.common.collect.s<com.google.android.exoplayer2.source.p$a> r2 = r3.f10581b
                java.lang.Object r2 = r2.get(r1)
                com.google.android.exoplayer2.source.p$a r2 = (com.google.android.exoplayer2.source.InterfaceC7188p.C7189a) r2
                r3.m6136a(r0, r2, r4)
                int r1 = r1 + 1
                goto L38
            L4e:
                com.google.common.collect.s<com.google.android.exoplayer2.source.p$a> r1 = r3.f10581b
                com.google.android.exoplayer2.source.p$a r2 = r3.f10583d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L5d
            L58:
                com.google.android.exoplayer2.source.p$a r1 = r3.f10583d
                r3.m6136a(r0, r1, r4)
            L5d:
                com.google.common.collect.o0 r4 = r0.m4229a()
                r3.f10582c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.C6642d0.C6643a.m6133d(com.google.android.exoplayer2.j1):void");
        }
    }

    public C6642d0() {
        C7397b0 c7397b0 = InterfaceC7396b.f13883a;
        int i = C7408g0.f13905a;
        Looper myLooper = Looper.myLooper();
        this.f10576e = new C7417m<>(myLooper == null ? Looper.getMainLooper() : myLooper, c7397b0, new C6605y());
        AbstractC6984j1.C6986b c6986b = new AbstractC6984j1.C6986b();
        this.f10572a = c6986b;
        this.f10573b = new AbstractC6984j1.C6987c();
        this.f10574c = new C6643a(c6986b);
        this.f10575d = new SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.device.InterfaceC6753a
    /* renamed from: A */
    public final /* synthetic */ void mo5196A() {
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: B */
    public final void mo4903B(final C6747e c6747e) {
        final AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1020, new C7417m.InterfaceC7418a(m6138U, c6747e) { // from class: com.google.android.exoplayer2.analytics.r
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.m6177d0();
                analyticsListener.m6201I();
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: C */
    public final void mo4902C(final C7003m0 c7003m0, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1022, new C7417m.InterfaceC7418a(m6138U, c7003m0, decoderReuseEvaluation) { // from class: com.google.android.exoplayer2.analytics.e
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.m6176e();
                analyticsListener.m6146w();
                analyticsListener.m6209A();
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: D */
    public final void mo5720D(long j) {
        AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1011, new C0406q1(m6138U, j));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
    /* renamed from: E */
    public final void mo4884E(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
        AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, 1031, new C7499x(m6139T, 1));
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: F */
    public final void mo5719F(final Exception exc) {
        final AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1037, new C7417m.InterfaceC7418a(m6138U, exc) { // from class: com.google.android.exoplayer2.analytics.s
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6182a0();
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: G */
    public final void mo4901G(Exception exc) {
        AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1038, new C3541k(m6138U, exc));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7196v
    /* renamed from: H */
    public final void mo4883H(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m) {
        AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, 1001, new C0484a(m6139T, c7174j, c7184m));
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: I */
    public final void mo4900I(final long j, final Object obj) {
        final AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1027, new C7417m.InterfaceC7418a(m6138U, obj, j) { // from class: com.google.android.exoplayer2.analytics.f

            /* renamed from: b */
            public final /* synthetic */ Object f10586b;

            {
                this.f10586b = obj;
            }

            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj2) {
                ((AnalyticsListener) obj2).m6181b();
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: J */
    public final void mo4899J(C6747e c6747e) {
        AnalyticsListener.C6634a m6140S = m6140S(this.f10574c.f10584e);
        m6137V(m6140S, 1025, new C2402a(m6140S, c6747e));
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7465l
    /* renamed from: K */
    public final void mo4926K(final int i, final int i2) {
        final AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1029, new C7417m.InterfaceC7418a(m6138U, i, i2) { // from class: com.google.android.exoplayer2.analytics.h
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6154p();
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
    /* renamed from: L */
    public final void mo4882L(int i, @Nullable InterfaceC7188p.C7189a c7189a, int i2) {
        AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, 1030, new C0740h(m6139T, i2));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
    /* renamed from: M */
    public final void mo4881M(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
        AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, 1035, new C7126q(m6139T, 1));
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: N */
    public final void mo5718N(int i, long j, long j2) {
        AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1012, new C0063d(m6138U, i, j, j2));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7196v
    /* renamed from: O */
    public final void mo4880O(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m, IOException iOException, boolean z) {
        AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, 1003, new C2362x3(m6139T, c7174j, c7184m, iOException, z));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
    /* renamed from: P */
    public final void mo4879P(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
        AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, 1033, new C6663x(m6139T));
    }

    /* renamed from: Q */
    public final AnalyticsListener.C6634a m6142Q() {
        return m6140S(this.f10574c.f10583d);
    }

    @RequiresNonNull({"player"})
    /* renamed from: R */
    public final AnalyticsListener.C6634a m6141R(AbstractC6984j1 abstractC6984j1, int i, @Nullable InterfaceC7188p.C7189a c7189a) {
        InterfaceC7188p.C7189a c7189a2;
        boolean z;
        long m6216c;
        if (abstractC6984j1.m5685p()) {
            c7189a2 = null;
        } else {
            c7189a2 = c7189a;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = true;
        if (abstractC6984j1.equals(this.f10577f.mo5762G()) && i == this.f10577f.mo5730p()) {
            z = true;
        } else {
            z = false;
        }
        if (c7189a2 != null && c7189a2.m5394a()) {
            if (!z || this.f10577f.mo5722y() != c7189a2.f12929b || this.f10577f.mo5732n() != c7189a2.f12930c) {
                z2 = false;
            }
            if (z2) {
                m6216c = this.f10577f.getCurrentPosition();
            }
            m6216c = 0;
        } else if (z) {
            m6216c = this.f10577f.mo5727t();
        } else {
            if (!abstractC6984j1.m5685p()) {
                m6216c = C6622C.m6216c(abstractC6984j1.m5686m(i, this.f10573b).f12173m);
            }
            m6216c = 0;
        }
        return new AnalyticsListener.C6634a(elapsedRealtime, abstractC6984j1, i, c7189a2, m6216c, this.f10577f.mo5762G(), this.f10577f.mo5730p(), this.f10574c.f10583d, this.f10577f.getCurrentPosition(), this.f10577f.mo5744e());
    }

    /* renamed from: S */
    public final AnalyticsListener.C6634a m6140S(@Nullable InterfaceC7188p.C7189a c7189a) {
        AbstractC6984j1 abstractC6984j1;
        boolean z;
        this.f10577f.getClass();
        if (c7189a == null) {
            abstractC6984j1 = null;
        } else {
            abstractC6984j1 = (AbstractC6984j1) this.f10574c.f10582c.get(c7189a);
        }
        if (c7189a != null && abstractC6984j1 != null) {
            return m6141R(abstractC6984j1, abstractC6984j1.mo5689g(c7189a.f12928a, this.f10572a).f12154c, c7189a);
        }
        int mo5730p = this.f10577f.mo5730p();
        AbstractC6984j1 mo5762G = this.f10577f.mo5762G();
        if (mo5730p < mo5762G.mo5409o()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo5762G = AbstractC6984j1.f12151a;
        }
        return m6141R(mo5762G, mo5730p, null);
    }

    /* renamed from: T */
    public final AnalyticsListener.C6634a m6139T(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
        this.f10577f.getClass();
        boolean z = true;
        if (c7189a != null) {
            if (((AbstractC6984j1) this.f10574c.f10582c.get(c7189a)) == null) {
                z = false;
            }
            if (z) {
                return m6140S(c7189a);
            }
            return m6141R(AbstractC6984j1.f12151a, i, c7189a);
        }
        AbstractC6984j1 mo5762G = this.f10577f.mo5762G();
        if (i >= mo5762G.mo5409o()) {
            z = false;
        }
        if (!z) {
            mo5762G = AbstractC6984j1.f12151a;
        }
        return m6141R(mo5762G, i, null);
    }

    /* renamed from: U */
    public final AnalyticsListener.C6634a m6138U() {
        return m6140S(this.f10574c.f10585f);
    }

    /* renamed from: V */
    public final void m6137V(AnalyticsListener.C6634a c6634a, int i, C7417m.InterfaceC7418a<AnalyticsListener> interfaceC7418a) {
        this.f10575d.put(i, c6634a);
        C7417m<AnalyticsListener> c7417m = this.f10576e;
        c7417m.m5060b(i, interfaceC7418a);
        c7417m.m5061a();
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6696g, com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: a */
    public final void mo5195a(final boolean z) {
        final AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1017, new C7417m.InterfaceC7418a(m6138U, z) { // from class: com.google.android.exoplayer2.analytics.v
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6148u();
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7465l
    /* renamed from: b */
    public final /* synthetic */ void mo4925b() {
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7465l, com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: c */
    public final void mo4898c(final C7496w c7496w) {
        final AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1028, new C7417m.InterfaceC7418a(m6138U, c7496w) { // from class: com.google.android.exoplayer2.analytics.c0

            /* renamed from: b */
            public final /* synthetic */ C7496w f10571b;

            {
                this.f10571b = c7496w;
            }

            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.m6174f();
                int i = this.f10571b.f14219a;
                analyticsListener.m6186X();
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: d */
    public final /* synthetic */ void mo5717d() {
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: e */
    public final /* synthetic */ void mo4897e() {
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7465l
    /* renamed from: f */
    public final /* synthetic */ void mo4924f() {
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
    /* renamed from: g */
    public final /* synthetic */ void mo4877g() {
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: h */
    public final void mo5716h(final C6747e c6747e) {
        final AnalyticsListener.C6634a m6140S = m6140S(this.f10574c.f10584e);
        m6137V(m6140S, 1014, new C7417m.InterfaceC7418a(m6140S, c6747e) { // from class: com.google.android.exoplayer2.analytics.a
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.m6168i();
                analyticsListener.m6162l();
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: i */
    public final void mo4896i(String str) {
        AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1024, new C0235r(m6138U, str));
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: j */
    public final void mo5715j(final C6747e c6747e) {
        final AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1008, new C7417m.InterfaceC7418a(m6138U, c6747e) { // from class: com.google.android.exoplayer2.analytics.j
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.m6160m();
                analyticsListener.m6201I();
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: k */
    public final void mo4895k(final int i, final long j) {
        final AnalyticsListener.C6634a m6140S = m6140S(this.f10574c.f10584e);
        m6137V(m6140S, 1026, new C7417m.InterfaceC7418a(i, j, m6140S) { // from class: com.google.android.exoplayer2.analytics.g
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6175e0();
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7196v
    /* renamed from: l */
    public final void mo4876l(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7184m c7184m) {
        AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, 1004, new C6552k(m6139T, c7184m));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7196v
    /* renamed from: m */
    public final void mo4875m(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m) {
        AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new C0017a(m6139T, c7174j, c7184m));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
    /* renamed from: n */
    public final void mo4874n(int i, @Nullable InterfaceC7188p.C7189a c7189a, final Exception exc) {
        final AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, 1032, new C7417m.InterfaceC7418a(m6139T, exc) { // from class: com.google.android.exoplayer2.analytics.y
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6151r();
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6696g
    /* renamed from: o */
    public final void mo5194o(float f) {
        AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1019, new C6486h(m6138U, f));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onAvailableCommandsChanged(Player.C6624a c6624a) {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 14, new C6548g(2, m6142Q, c6624a));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final /* synthetic */ void onEvents(Player player, Player.C6627c c6627c) {
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onIsLoadingChanged(boolean z) {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 4, new C6656q(m6142Q, z));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onIsPlayingChanged(boolean z) {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 8, new C1169e(m6142Q, z));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final /* synthetic */ void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onMediaItemTransition(@Nullable C7127q0 c7127q0, int i) {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 1, new C6652m(m6142Q, c7127q0, i));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 15, new C2391a(m6142Q, mediaMetadata));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 6, new C7417m.InterfaceC7418a(m6142Q, z, i) { // from class: com.google.android.exoplayer2.analytics.b
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6183a();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onPlaybackParametersChanged(C6633a1 c6633a1) {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 13, new C0663f(m6142Q, c6633a1));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onPlaybackStateChanged(int i) {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 5, new C1151g(m6142Q, i));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 7, new C7417m.InterfaceC7418a(m6142Q, i) { // from class: com.google.android.exoplayer2.analytics.b0
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6167i0();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onPlayerError(PlaybackException playbackException) {
        C7187o c7187o;
        AnalyticsListener.C6634a m6140S = (!(playbackException instanceof ExoPlaybackException) || (c7187o = ((ExoPlaybackException) playbackException).f10477h) == null) ? null : m6140S(new InterfaceC7188p.C7189a(c7187o));
        if (m6140S == null) {
            m6140S = m6142Q();
        }
        m6137V(m6140S, 11, new C0499a(m6140S, (ExoPlaybackException) playbackException));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, -1, new C7417m.InterfaceC7418a(m6142Q, z, i) { // from class: com.google.android.exoplayer2.analytics.c
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6200J();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onPositionDiscontinuity(Player.C6629e c6629e, Player.C6629e c6629e2, int i) {
        if (i == 1) {
            this.f10579h = false;
        }
        Player player = this.f10577f;
        player.getClass();
        C6643a c6643a = this.f10574c;
        c6643a.f10583d = C6643a.m6135b(player, c6643a.f10581b, c6643a.f10584e, c6643a.f10580a);
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 12, new C6654o(i, c6629e, c6629e2, m6142Q));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onRepeatModeChanged(int i) {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 9, new C1431t(m6142Q, i));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onSeekProcessed() {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, -1, new C6636a0(m6142Q));
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 10, new C7417m.InterfaceC7418a(m6142Q, z) { // from class: com.google.android.exoplayer2.analytics.i
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6150s();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    @Deprecated
    public final void onStaticMetadataChanged(final List<C7042a> list) {
        final AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 3, new C7417m.InterfaceC7418a(m6142Q, list) { // from class: com.google.android.exoplayer2.analytics.k

            /* renamed from: b */
            public final /* synthetic */ List f10587b;

            {
                this.f10587b = list;
            }

            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6164k();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onTimelineChanged(AbstractC6984j1 abstractC6984j1, final int i) {
        Player player = this.f10577f;
        player.getClass();
        C6643a c6643a = this.f10574c;
        c6643a.f10583d = C6643a.m6135b(player, c6643a.f10581b, c6643a.f10584e, c6643a.f10580a);
        c6643a.m6133d(player.mo5762G());
        final AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 0, new C7417m.InterfaceC7418a(m6142Q, i) { // from class: com.google.android.exoplayer2.analytics.d
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6208B();
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
    public final void onTracksChanged(C7178k0 c7178k0, C7303k c7303k) {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 2, new C6964f(m6142Q, c7178k0, c7303k));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7196v
    /* renamed from: p */
    public final void mo4873p(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m) {
        AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, 1000, new C6651l(m6139T, c7174j, c7184m));
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: q */
    public final void mo5714q(String str) {
        AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1013, new C3824d(m6138U, str));
    }

    @Override // com.google.android.exoplayer2.metadata.InterfaceC7052e
    /* renamed from: r */
    public final void mo5193r(C7042a c7042a) {
        AnalyticsListener.C6634a m6142Q = m6142Q();
        m6137V(m6142Q, 1007, new C3132a0(m6142Q, c7042a));
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: s */
    public final void mo4894s(int i, long j) {
        AnalyticsListener.C6634a m6140S = m6140S(this.f10574c.f10584e);
        m6137V(m6140S, 1023, new C0171d(i, j, m6140S));
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7494v
    /* renamed from: t */
    public final void mo4893t(long j, String str, long j2) {
        AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1021, new C6660u(m6138U, str, j2, j));
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: u */
    public final void mo5713u(C7003m0 c7003m0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1010, new C6595o(m6138U, c7003m0, decoderReuseEvaluation));
    }

    @Override // com.google.android.exoplayer2.device.InterfaceC6753a
    /* renamed from: v */
    public final /* synthetic */ void mo5192v() {
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
    /* renamed from: w */
    public final void mo4872w(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
        AnalyticsListener.C6634a m6139T = m6139T(i, c7189a);
        m6137V(m6139T, 1034, new C6662w(m6139T));
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: x */
    public final void mo5712x(final long j, final String str, final long j2) {
        final AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1009, new C7417m.InterfaceC7418a(m6138U, str, j2, j) { // from class: com.google.android.exoplayer2.analytics.n
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.m6155o0();
                analyticsListener.m6184Z();
                analyticsListener.m6185Y();
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6718s
    /* renamed from: y */
    public final void mo5711y(final Exception exc) {
        final AnalyticsListener.C6634a m6138U = m6138U();
        m6137V(m6138U, 1018, new C7417m.InterfaceC7418a(m6138U, exc) { // from class: com.google.android.exoplayer2.analytics.p
            @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).m6143z();
            }
        });
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7239i
    /* renamed from: z */
    public final /* synthetic */ void mo5191z(List list) {
    }
}
