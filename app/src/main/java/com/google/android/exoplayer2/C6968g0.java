package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0510h;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.fragment.app.C1434w;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6548g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6553l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6558q;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.C6733b1;
import com.google.android.exoplayer2.C6989k0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C6642d0;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.source.C7180l;
import com.google.android.exoplayer2.source.InterfaceC7167g0;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.source.InterfaceC7199w;
import com.google.android.exoplayer2.trackselection.AbstractC7307m;
import com.google.android.exoplayer2.trackselection.C7303k;
import com.google.android.exoplayer2.trackselection.C7308n;
import com.google.android.exoplayer2.trackselection.InterfaceC7296g;
import com.google.android.exoplayer2.upstream.InterfaceC7352d;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7397b0;
import com.google.android.exoplayer2.util.C7399c0;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7409h;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.exoplayer2.util.InterfaceC7396b;
import com.google.android.exoplayer2.util.InterfaceC7412i;
import com.google.android.exoplayer2.video.C7496w;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.C7998n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.g0 */
/* loaded from: classes.dex */
public final class C6968g0 extends AbstractC6967g {

    /* renamed from: A */
    public InterfaceC7167g0 f12035A;

    /* renamed from: B */
    public Player.C6624a f12036B;

    /* renamed from: C */
    public MediaMetadata f12037C;

    /* renamed from: D */
    public C7508z0 f12038D;

    /* renamed from: E */
    public int f12039E;

    /* renamed from: F */
    public long f12040F;

    /* renamed from: b */
    public final C7308n f12041b;

    /* renamed from: c */
    public final Player.C6624a f12042c;

    /* renamed from: d */
    public final Renderer[] f12043d;

    /* renamed from: e */
    public final AbstractC7307m f12044e;

    /* renamed from: f */
    public final InterfaceC7412i f12045f;

    /* renamed from: g */
    public final C6558q f12046g;

    /* renamed from: h */
    public final C6989k0 f12047h;

    /* renamed from: i */
    public final C7417m<Player.InterfaceC6626b> f12048i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<InterfaceC7120n> f12049j;

    /* renamed from: k */
    public final AbstractC6984j1.C6986b f12050k;

    /* renamed from: l */
    public final ArrayList f12051l;

    /* renamed from: m */
    public final boolean f12052m;

    /* renamed from: n */
    public final InterfaceC7199w f12053n;
    @Nullable

    /* renamed from: o */
    public final C6642d0 f12054o;

    /* renamed from: p */
    public final Looper f12055p;

    /* renamed from: q */
    public final InterfaceC7352d f12056q;

    /* renamed from: r */
    public final long f12057r;

    /* renamed from: s */
    public final long f12058s;

    /* renamed from: t */
    public final InterfaceC7396b f12059t;

    /* renamed from: u */
    public int f12060u;

    /* renamed from: v */
    public boolean f12061v;

    /* renamed from: w */
    public int f12062w;

    /* renamed from: x */
    public int f12063x;

    /* renamed from: y */
    public boolean f12064y;

    /* renamed from: z */
    public int f12065z;

    /* renamed from: com.google.android.exoplayer2.g0$a */
    /* loaded from: classes.dex */
    public static final class C6969a implements InterfaceC7443v0 {

        /* renamed from: a */
        public final Object f12066a;

        /* renamed from: b */
        public AbstractC6984j1 f12067b;

        public C6969a(C7180l.C7181a c7181a, Object obj) {
            this.f12066a = obj;
            this.f12067b = c7181a;
        }

        @Override // com.google.android.exoplayer2.InterfaceC7443v0
        /* renamed from: a */
        public final Object mo4871a() {
            return this.f12066a;
        }

        @Override // com.google.android.exoplayer2.InterfaceC7443v0
        /* renamed from: b */
        public final AbstractC6984j1 mo4870b() {
            return this.f12067b;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C6968g0(Renderer[] rendererArr, AbstractC7307m abstractC7307m, InterfaceC7199w interfaceC7199w, C6998l c6998l, InterfaceC7352d interfaceC7352d, @Nullable final C6642d0 c6642d0, boolean z, C6966f1 c6966f1, long j, long j2, C6988k c6988k, long j3, C7397b0 c7397b0, Looper looper, @Nullable Player player, Player.C6624a c6624a) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = C7408g0.f13909e;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str, C0552c.m12193a(hexString, 30)), "Init ", hexString, " [ExoPlayerLib/2.15.1] [", str);
        m9043a.append("]");
        Log.i("ExoPlayerImpl", m9043a.toString());
        boolean z2 = true;
        C7394a.m5131d(rendererArr.length > 0);
        this.f12043d = rendererArr;
        abstractC7307m.getClass();
        this.f12044e = abstractC7307m;
        this.f12053n = interfaceC7199w;
        this.f12056q = interfaceC7352d;
        this.f12054o = c6642d0;
        this.f12052m = z;
        this.f12057r = j;
        this.f12058s = j2;
        this.f12055p = looper;
        this.f12059t = c7397b0;
        this.f12060u = 0;
        final Player player2 = player != null ? player : this;
        this.f12048i = new C7417m<>(looper, c7397b0, new C7309u(player2));
        this.f12049j = new CopyOnWriteArraySet<>();
        this.f12051l = new ArrayList();
        this.f12035A = new InterfaceC7167g0.C7168a();
        C7308n c7308n = new C7308n(new C6740d1[rendererArr.length], new InterfaceC7296g[rendererArr.length], null);
        this.f12041b = c7308n;
        this.f12050k = new AbstractC6984j1.C6986b();
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {1, 2, 12, 13, 14, 15, 16, 17, 18, 19};
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            C7394a.m5131d(!false);
            sparseBooleanArray.append(i2, true);
        }
        int i3 = 0;
        while (true) {
            C7409h c7409h = c6624a.f10540a;
            if (i3 >= c7409h.m5078b()) {
                break;
            }
            int m5079a = c7409h.m5079a(i3);
            C7394a.m5131d(true);
            sparseBooleanArray.append(m5079a, true);
            i3++;
        }
        C7394a.m5131d(true);
        Player.C6624a c6624a2 = new Player.C6624a(new C7409h(sparseBooleanArray));
        this.f12042c = c6624a2;
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        int i4 = 0;
        while (true) {
            C7409h c7409h2 = c6624a2.f10540a;
            if (i4 >= c7409h2.m5078b()) {
                break;
            }
            int m5079a2 = c7409h2.m5079a(i4);
            C7394a.m5131d(true);
            sparseBooleanArray2.append(m5079a2, true);
            i4++;
        }
        C7394a.m5131d(true);
        sparseBooleanArray2.append(3, true);
        C7394a.m5131d(true);
        sparseBooleanArray2.append(9, true);
        C7394a.m5131d(true);
        this.f12036B = new Player.C6624a(new C7409h(sparseBooleanArray2));
        this.f12037C = MediaMetadata.f10479D;
        this.f12039E = -1;
        this.f12045f = c7397b0.mo5126b(looper, null);
        C6558q c6558q = new C6558q(this);
        this.f12046g = c6558q;
        this.f12038D = C7508z0.m4860h(c7308n);
        if (c6642d0 != null) {
            if (c6642d0.f10577f != null && !c6642d0.f10574c.f10581b.isEmpty()) {
                z2 = false;
            }
            C7394a.m5131d(z2);
            c6642d0.f10577f = player2;
            c6642d0.f10578g = new C7399c0(new Handler(looper, null));
            C7417m<AnalyticsListener> c7417m = c6642d0.f10576e;
            c6642d0.f10576e = new C7417m<>(c7417m.f13931d, looper, c7417m.f13928a, new C7417m.InterfaceC7419b(player2) { // from class: com.google.android.exoplayer2.analytics.z
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7419b
                /* renamed from: b */
                public final void mo5058b(Object obj, C7409h c7409h3) {
                    AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                    SparseArray<AnalyticsListener.C6634a> sparseArray = C6642d0.this.f10575d;
                    SparseArray sparseArray2 = new SparseArray(c7409h3.m5078b());
                    for (int i5 = 0; i5 < c7409h3.m5078b(); i5++) {
                        int m5079a3 = c7409h3.m5079a(i5);
                        AnalyticsListener.C6634a c6634a = sparseArray.get(m5079a3);
                        c6634a.getClass();
                        sparseArray2.append(m5079a3, c6634a);
                    }
                    analyticsListener.m6196N();
                }
            });
            m5779W(c6642d0);
            interfaceC7352d.mo5162g(new Handler(looper), c6642d0);
        }
        this.f12047h = new C6989k0(rendererArr, abstractC7307m, c7308n, c6998l, interfaceC7352d, this.f12060u, this.f12061v, c6642d0, c6966f1, c6988k, j3, looper, c7397b0, c6558q);
    }

    /* renamed from: b0 */
    public static long m5774b0(C7508z0 c7508z0) {
        AbstractC6984j1.C6987c c6987c = new AbstractC6984j1.C6987c();
        AbstractC6984j1.C6986b c6986b = new AbstractC6984j1.C6986b();
        c7508z0.f14256a.mo5689g(c7508z0.f14257b.f12928a, c6986b);
        long j = c7508z0.f14258c;
        if (j == -9223372036854775807L) {
            return c7508z0.f14256a.m5686m(c6986b.f12154c, c6987c).f12173m;
        }
        return c6986b.f12156e + j;
    }

    /* renamed from: c0 */
    public static boolean m5773c0(C7508z0 c7508z0) {
        return c7508z0.f14260e == 3 && c7508z0.f14267l && c7508z0.f14268m == 0;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: B */
    public final void mo5767B(final int i) {
        if (this.f12060u != i) {
            this.f12060u = i;
            this.f12047h.f12213g.mo5071b(11, i, 0).m5122a();
            C7417m.InterfaceC7418a<Player.InterfaceC6626b> interfaceC7418a = new C7417m.InterfaceC7418a() { // from class: com.google.android.exoplayer2.t
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
                public final void invoke(Object obj) {
                    ((Player.InterfaceC6626b) obj).onRepeatModeChanged(i);
                }
            };
            C7417m<Player.InterfaceC6626b> c7417m = this.f12048i;
            c7417m.m5060b(9, interfaceC7418a);
            m5769g0();
            c7417m.m5061a();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: C */
    public final void mo5766C(@Nullable SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: D */
    public final int mo5765D() {
        return this.f12038D.f14268m;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: E */
    public final C7178k0 mo5764E() {
        return this.f12038D.f14263h;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: F */
    public final int mo5763F() {
        return this.f12060u;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: G */
    public final AbstractC6984j1 mo5762G() {
        return this.f12038D.f14256a;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: H */
    public final Looper mo5761H() {
        return this.f12055p;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: I */
    public final boolean mo5760I() {
        return this.f12061v;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: J */
    public final long mo5759J() {
        if (this.f12038D.f14256a.m5685p()) {
            return this.f12040F;
        }
        C7508z0 c7508z0 = this.f12038D;
        if (c7508z0.f14266k.f12931d != c7508z0.f14257b.f12931d) {
            return C6622C.m6216c(c7508z0.f14256a.m5686m(mo5730p(), this.f12034a).f12174n);
        }
        long j = c7508z0.f14272q;
        if (this.f12038D.f14266k.m5394a()) {
            C7508z0 c7508z02 = this.f12038D;
            AbstractC6984j1.C6986b mo5689g = c7508z02.f14256a.mo5689g(c7508z02.f14266k.f12928a, this.f12050k);
            long j2 = mo5689g.f12158g.m5472a(this.f12038D.f14266k.f12929b).f12774a;
            if (j2 == Long.MIN_VALUE) {
                j = mo5689g.f12155d;
            } else {
                j = j2;
            }
        }
        C7508z0 c7508z03 = this.f12038D;
        AbstractC6984j1 abstractC6984j1 = c7508z03.f14256a;
        Object obj = c7508z03.f14266k.f12928a;
        AbstractC6984j1.C6986b c6986b = this.f12050k;
        abstractC6984j1.mo5689g(obj, c6986b);
        return C6622C.m6216c(j + c6986b.f12156e);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: M */
    public final void mo5758M(@Nullable TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: N */
    public final C7303k mo5757N() {
        return new C7303k(this.f12038D.f14264i.f13479c);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: P */
    public final MediaMetadata mo5756P() {
        return this.f12037C;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: Q */
    public final long mo5755Q() {
        return this.f12057r;
    }

    /* renamed from: W */
    public final void m5779W(Player.InterfaceC6626b interfaceC6626b) {
        C7417m<Player.InterfaceC6626b> c7417m = this.f12048i;
        if (!c7417m.f13934g) {
            interfaceC6626b.getClass();
            c7417m.f13931d.add(new C7417m.C7420c<>(interfaceC6626b));
        }
    }

    /* renamed from: X */
    public final C6733b1 m5778X(C6733b1.InterfaceC6735b interfaceC6735b) {
        return new C6733b1(this.f12047h, interfaceC6735b, this.f12038D.f14256a, mo5730p(), this.f12059t, this.f12047h.f12215i);
    }

    /* renamed from: Y */
    public final long m5777Y(C7508z0 c7508z0) {
        if (c7508z0.f14256a.m5685p()) {
            return C6622C.m6217b(this.f12040F);
        }
        if (c7508z0.f14257b.m5394a()) {
            return c7508z0.f14274s;
        }
        AbstractC6984j1 abstractC6984j1 = c7508z0.f14256a;
        InterfaceC7188p.C7189a c7189a = c7508z0.f14257b;
        long j = c7508z0.f14274s;
        Object obj = c7189a.f12928a;
        AbstractC6984j1.C6986b c6986b = this.f12050k;
        abstractC6984j1.mo5689g(obj, c6986b);
        return j + c6986b.f12156e;
    }

    /* renamed from: Z */
    public final int m5776Z() {
        if (this.f12038D.f14256a.m5685p()) {
            return this.f12039E;
        }
        C7508z0 c7508z0 = this.f12038D;
        return c7508z0.f14256a.mo5689g(c7508z0.f14257b.f12928a, this.f12050k).f12154c;
    }

    @Nullable
    /* renamed from: a0 */
    public final Pair<Object, Long> m5775a0(AbstractC6984j1 abstractC6984j1, int i, long j) {
        if (abstractC6984j1.m5685p()) {
            this.f12039E = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f12040F = j;
            return null;
        }
        if (i == -1 || i >= abstractC6984j1.mo5409o()) {
            i = abstractC6984j1.mo5425a(this.f12061v);
            j = C6622C.m6216c(abstractC6984j1.m5686m(i, this.f12034a).f12173m);
        }
        return abstractC6984j1.m5688i(this.f12034a, this.f12050k, i, C6622C.m6217b(j));
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: c */
    public final C6633a1 mo5748c() {
        return this.f12038D.f14269n;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: d */
    public final boolean mo5746d() {
        return this.f12038D.f14257b.m5394a();
    }

    /* renamed from: d0 */
    public final C7508z0 m5772d0(C7508z0 c7508z0, AbstractC6984j1 abstractC6984j1, @Nullable Pair<Object, Long> pair) {
        boolean z;
        InterfaceC7188p.C7189a c7189a;
        C7178k0 c7178k0;
        C7308n c7308n;
        List<C7042a> list;
        int i;
        C7508z0 m4866b;
        long j;
        long j2;
        if (!abstractC6984j1.m5685p() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        C7394a.m5134a(z);
        AbstractC6984j1 abstractC6984j12 = c7508z0.f14256a;
        C7508z0 m4861g = c7508z0.m4861g(abstractC6984j1);
        if (abstractC6984j1.m5685p()) {
            InterfaceC7188p.C7189a c7189a2 = C7508z0.f14255t;
            long m6217b = C6622C.m6217b(this.f12040F);
            C7178k0 c7178k02 = C7178k0.f12904d;
            C7308n c7308n2 = this.f12041b;
            AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
            C7508z0 m4867a = m4861g.m4866b(c7189a2, m6217b, m6217b, m6217b, 0L, c7178k02, c7308n2, C7998n0.f15785e).m4867a(c7189a2);
            m4867a.f14272q = m4867a.f14274s;
            return m4867a;
        }
        Object obj = m4861g.f14257b.f12928a;
        int i2 = C7408g0.f13905a;
        boolean z2 = !obj.equals(pair.first);
        if (z2) {
            c7189a = new InterfaceC7188p.C7189a(pair.first);
        } else {
            c7189a = m4861g.f14257b;
        }
        InterfaceC7188p.C7189a c7189a3 = c7189a;
        long longValue = ((Long) pair.second).longValue();
        long m6217b2 = C6622C.m6217b(mo5727t());
        if (!abstractC6984j12.m5685p()) {
            m6217b2 -= abstractC6984j12.mo5689g(obj, this.f12050k).f12156e;
        }
        if (!z2 && longValue >= m6217b2) {
            if (i == 0) {
                int mo5414b = abstractC6984j1.mo5414b(m4861g.f14266k.f12928a);
                if (mo5414b == -1 || abstractC6984j1.mo5413f(mo5414b, this.f12050k, false).f12154c != abstractC6984j1.mo5689g(c7189a3.f12928a, this.f12050k).f12154c) {
                    abstractC6984j1.mo5689g(c7189a3.f12928a, this.f12050k);
                    if (c7189a3.m5394a()) {
                        j2 = this.f12050k.m5684a(c7189a3.f12929b, c7189a3.f12930c);
                    } else {
                        j2 = this.f12050k.f12155d;
                    }
                    m4866b = m4861g.m4866b(c7189a3, m4861g.f14274s, m4861g.f14274s, m4861g.f14259d, j2 - m4861g.f14274s, m4861g.f14263h, m4861g.f14264i, m4861g.f14265j).m4867a(c7189a3);
                    j = j2;
                } else {
                    return m4861g;
                }
            } else {
                C7394a.m5131d(!c7189a3.m5394a());
                long max = Math.max(0L, m4861g.f14273r - (longValue - m6217b2));
                long j3 = m4861g.f14272q;
                if (m4861g.f14266k.equals(m4861g.f14257b)) {
                    j3 = longValue + max;
                }
                m4866b = m4861g.m4866b(c7189a3, longValue, longValue, longValue, max, m4861g.f14263h, m4861g.f14264i, m4861g.f14265j);
                j = j3;
            }
            m4866b.f14272q = j;
            return m4866b;
        }
        C7394a.m5131d(!c7189a3.m5394a());
        if (z2) {
            c7178k0 = C7178k0.f12904d;
        } else {
            c7178k0 = m4861g.f14263h;
        }
        C7178k0 c7178k03 = c7178k0;
        if (z2) {
            c7308n = this.f12041b;
        } else {
            c7308n = m4861g.f14264i;
        }
        C7308n c7308n3 = c7308n;
        if (z2) {
            AbstractC8013s.C8015b c8015b2 = AbstractC8013s.f15817b;
            list = C7998n0.f15785e;
        } else {
            list = m4861g.f14265j;
        }
        C7508z0 m4867a2 = m4861g.m4866b(c7189a3, longValue, longValue, longValue, 0L, c7178k03, c7308n3, list).m4867a(c7189a3);
        m4867a2.f14272q = longValue;
        return m4867a2;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: e */
    public final long mo5744e() {
        return C6622C.m6216c(this.f12038D.f14273r);
    }

    /* renamed from: e0 */
    public final void m5771e0(Player.InterfaceC6626b interfaceC6626b) {
        C7417m<Player.InterfaceC6626b> c7417m = this.f12048i;
        CopyOnWriteArraySet<C7417m.C7420c<Player.InterfaceC6626b>> copyOnWriteArraySet = c7417m.f13931d;
        Iterator<C7417m.C7420c<Player.InterfaceC6626b>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C7417m.C7420c<Player.InterfaceC6626b> next = it.next();
            if (next.f13935a.equals(interfaceC6626b)) {
                next.f13938d = true;
                if (next.f13937c) {
                    C7409h m5076b = next.f13936b.m5076b();
                    c7417m.f13930c.mo5058b(next.f13935a, m5076b);
                }
                copyOnWriteArraySet.remove(next);
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: f */
    public final void mo5742f(int i, long j) {
        AbstractC6984j1 abstractC6984j1 = this.f12038D.f14256a;
        if (i >= 0 && (abstractC6984j1.m5685p() || i < abstractC6984j1.mo5409o())) {
            int i2 = 1;
            this.f12062w++;
            if (mo5746d()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C6989k0.C6993d c6993d = new C6989k0.C6993d(this.f12038D);
                c6993d.m5619a(1);
                C6968g0 c6968g0 = (C6968g0) this.f12046g.f10359b;
                c6968g0.getClass();
                c6968g0.f12045f.mo5069d(new RunnableC7442v(0, c6968g0, c6993d));
                return;
            }
            if (this.f12038D.f14260e != 1) {
                i2 = 2;
            }
            int mo5730p = mo5730p();
            C7508z0 m5772d0 = m5772d0(this.f12038D.m4862f(i2), abstractC6984j1, m5775a0(abstractC6984j1, i, j));
            long m6217b = C6622C.m6217b(j);
            C6989k0 c6989k0 = this.f12047h;
            c6989k0.getClass();
            c6989k0.f12213g.mo5063j(3, new C6989k0.C6996g(abstractC6984j1, i, m6217b)).m5122a();
            m5768h0(m5772d0, 0, 1, true, true, 1, m5777Y(m5772d0), mo5730p);
            return;
        }
        throw new C7123o0();
    }

    /* renamed from: f0 */
    public final void m5770f0(int i, int i2, boolean z) {
        C7508z0 c7508z0 = this.f12038D;
        if (c7508z0.f14267l == z && c7508z0.f14268m == i) {
            return;
        }
        this.f12062w++;
        C7508z0 m4864d = c7508z0.m4864d(i, z);
        C6989k0 c6989k0 = this.f12047h;
        c6989k0.getClass();
        c6989k0.f12213g.mo5071b(1, z ? 1 : 0, i).m5122a();
        m5768h0(m4864d, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: g */
    public final boolean mo5740g() {
        return this.f12038D.f14267l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d4, code lost:
        if (r2 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5769g0() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C6968g0.m5769g0():void");
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        return C6622C.m6216c(m5777Y(this.f12038D));
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
        if (mo5746d()) {
            C7508z0 c7508z0 = this.f12038D;
            InterfaceC7188p.C7189a c7189a = c7508z0.f14257b;
            Object obj = c7189a.f12928a;
            AbstractC6984j1 abstractC6984j1 = c7508z0.f14256a;
            AbstractC6984j1.C6986b c6986b = this.f12050k;
            abstractC6984j1.mo5689g(obj, c6986b);
            return C6622C.m6216c(c6986b.m5684a(c7189a.f12929b, c7189a.f12930c));
        }
        AbstractC6984j1 abstractC6984j12 = this.f12038D.f14256a;
        if (abstractC6984j12.m5685p()) {
            return -9223372036854775807L;
        }
        return C6622C.m6216c(abstractC6984j12.m5686m(mo5730p(), this.f12034a).f12174n);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: h */
    public final void mo5738h(final boolean z) {
        if (this.f12061v != z) {
            this.f12061v = z;
            this.f12047h.f12213g.mo5071b(12, z ? 1 : 0, 0).m5122a();
            C7417m.InterfaceC7418a<Player.InterfaceC6626b> interfaceC7418a = new C7417m.InterfaceC7418a() { // from class: com.google.android.exoplayer2.w
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
                public final void invoke(Object obj) {
                    ((Player.InterfaceC6626b) obj).onShuffleModeEnabledChanged(z);
                }
            };
            C7417m<Player.InterfaceC6626b> c7417m = this.f12048i;
            c7417m.m5060b(10, interfaceC7418a);
            m5769g0();
            c7417m.m5061a();
        }
    }

    /* renamed from: h0 */
    public final void m5768h0(final C7508z0 c7508z0, int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        Pair pair;
        int i5;
        final C7127q0 c7127q0;
        int i6;
        Object obj;
        Object obj2;
        int i7;
        long j2;
        long j3;
        Object obj3;
        Object obj4;
        int i8;
        C7508z0 c7508z02 = this.f12038D;
        this.f12038D = c7508z0;
        boolean z3 = !c7508z02.f14256a.equals(c7508z0.f14256a);
        AbstractC6984j1 abstractC6984j1 = c7508z02.f14256a;
        AbstractC6984j1 abstractC6984j12 = c7508z0.f14256a;
        if (abstractC6984j12.m5685p() && abstractC6984j1.m5685p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (abstractC6984j12.m5685p() != abstractC6984j1.m5685p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            InterfaceC7188p.C7189a c7189a = c7508z02.f14257b;
            Object obj5 = c7189a.f12928a;
            AbstractC6984j1.C6986b c6986b = this.f12050k;
            int i9 = abstractC6984j1.mo5689g(obj5, c6986b).f12154c;
            AbstractC6984j1.C6987c c6987c = this.f12034a;
            Object obj6 = abstractC6984j1.m5686m(i9, c6987c).f12161a;
            InterfaceC7188p.C7189a c7189a2 = c7508z0.f14257b;
            if (obj6.equals(abstractC6984j12.m5686m(abstractC6984j12.mo5689g(c7189a2.f12928a, c6986b).f12154c, c6987c).f12161a)) {
                pair = (z2 && i3 == 0 && c7189a.f12931d < c7189a2.f12931d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z2 && i3 == 0) {
                    i5 = 1;
                } else if (z2 && i3 == 1) {
                    i5 = 2;
                } else if (!z3) {
                    throw new IllegalStateException();
                } else {
                    i5 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        MediaMetadata mediaMetadata = this.f12037C;
        if (booleanValue) {
            C7127q0 c7127q02 = !c7508z0.f14256a.m5685p() ? c7508z0.f14256a.m5686m(c7508z0.f14256a.mo5689g(c7508z0.f14257b.f12928a, this.f12050k).f12154c, this.f12034a).f12163c : null;
            c7127q0 = c7127q02;
            mediaMetadata = c7127q02 != null ? c7127q02.f12644d : MediaMetadata.f10479D;
        } else {
            c7127q0 = null;
        }
        if (!c7508z02.f14265j.equals(c7508z0.f14265j)) {
            mediaMetadata.getClass();
            MediaMetadata.C6623a c6623a = new MediaMetadata.C6623a(mediaMetadata);
            List<C7042a> list = c7508z0.f14265j;
            for (int i10 = 0; i10 < list.size(); i10++) {
                C7042a c7042a = list.get(i10);
                int i11 = 0;
                while (true) {
                    C7042a.InterfaceC7044b[] interfaceC7044bArr = c7042a.f12490a;
                    if (i11 < interfaceC7044bArr.length) {
                        interfaceC7044bArr[i11].mo5509a(c6623a);
                        i11++;
                    }
                }
            }
            mediaMetadata = new MediaMetadata(c6623a);
        }
        boolean z4 = !mediaMetadata.equals(this.f12037C);
        this.f12037C = mediaMetadata;
        if (!c7508z02.f14256a.equals(c7508z0.f14256a)) {
            this.f12048i.m5060b(0, new C7122o(c7508z0, i));
        }
        if (z2) {
            AbstractC6984j1.C6986b c6986b2 = new AbstractC6984j1.C6986b();
            if (c7508z02.f14256a.m5685p()) {
                i6 = i4;
                obj = null;
                obj2 = null;
                i7 = -1;
            } else {
                Object obj7 = c7508z02.f14257b.f12928a;
                c7508z02.f14256a.mo5689g(obj7, c6986b2);
                int i12 = c6986b2.f12154c;
                obj2 = obj7;
                i6 = i12;
                i7 = c7508z02.f14256a.mo5414b(obj7);
                obj = c7508z02.f14256a.m5686m(i12, this.f12034a).f12161a;
            }
            if (i3 == 0) {
                j2 = c6986b2.f12156e + c6986b2.f12155d;
                if (c7508z02.f14257b.m5394a()) {
                    InterfaceC7188p.C7189a c7189a3 = c7508z02.f14257b;
                    j2 = c6986b2.m5684a(c7189a3.f12929b, c7189a3.f12930c);
                    j3 = m5774b0(c7508z02);
                } else {
                    if (c7508z02.f14257b.f12932e != -1 && this.f12038D.f14257b.m5394a()) {
                        j2 = m5774b0(this.f12038D);
                    }
                    j3 = j2;
                }
            } else if (c7508z02.f14257b.m5394a()) {
                j2 = c7508z02.f14274s;
                j3 = m5774b0(c7508z02);
            } else {
                j2 = c6986b2.f12156e + c7508z02.f14274s;
                j3 = j2;
            }
            long m6216c = C6622C.m6216c(j2);
            long m6216c2 = C6622C.m6216c(j3);
            InterfaceC7188p.C7189a c7189a4 = c7508z02.f14257b;
            final Player.C6629e c6629e = new Player.C6629e(obj, i6, obj2, i7, m6216c, m6216c2, c7189a4.f12929b, c7189a4.f12930c);
            int mo5730p = mo5730p();
            if (this.f12038D.f14256a.m5685p()) {
                obj3 = null;
                obj4 = null;
                i8 = -1;
            } else {
                C7508z0 c7508z03 = this.f12038D;
                Object obj8 = c7508z03.f14257b.f12928a;
                c7508z03.f14256a.mo5689g(obj8, this.f12050k);
                i8 = this.f12038D.f14256a.mo5414b(obj8);
                obj4 = obj8;
                obj3 = this.f12038D.f14256a.m5686m(mo5730p, this.f12034a).f12161a;
            }
            long m6216c3 = C6622C.m6216c(j);
            long m6216c4 = this.f12038D.f14257b.m5394a() ? C6622C.m6216c(m5774b0(this.f12038D)) : m6216c3;
            InterfaceC7188p.C7189a c7189a5 = this.f12038D.f14257b;
            final Player.C6629e c6629e2 = new Player.C6629e(obj3, mo5730p, obj4, i8, m6216c3, m6216c4, c7189a5.f12929b, c7189a5.f12930c);
            this.f12048i.m5060b(12, new C7417m.InterfaceC7418a() { // from class: com.google.android.exoplayer2.d0
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
                public final void invoke(Object obj9) {
                    Player.InterfaceC6626b interfaceC6626b = (Player.InterfaceC6626b) obj9;
                    int i13 = i3;
                    interfaceC6626b.onPositionDiscontinuity(i13);
                    interfaceC6626b.onPositionDiscontinuity(c6629e, c6629e2, i13);
                }
            });
        }
        if (booleanValue) {
            this.f12048i.m5060b(1, new C7417m.InterfaceC7418a() { // from class: com.google.android.exoplayer2.e0
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
                public final void invoke(Object obj9) {
                    ((Player.InterfaceC6626b) obj9).onMediaItemTransition(C7127q0.this, intValue);
                }
            });
        }
        if (c7508z02.f14261f != c7508z0.f14261f) {
            this.f12048i.m5060b(11, new C7417m.InterfaceC7418a() { // from class: com.google.android.exoplayer2.f0
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
                public final void invoke(Object obj9) {
                    ((Player.InterfaceC6626b) obj9).onPlayerErrorChanged(C7508z0.this.f14261f);
                }
            });
            if (c7508z0.f14261f != null) {
                this.f12048i.m5060b(11, new C1434w(c7508z0));
            }
        }
        C7308n c7308n = c7508z02.f14264i;
        C7308n c7308n2 = c7508z0.f14264i;
        if (c7308n != c7308n2) {
            this.f12044e.mo5256a(c7308n2.f13480d);
            this.f12048i.m5060b(2, new C6548g(1, c7508z0, new C7303k(c7508z0.f14264i.f13479c)));
        }
        if (!c7508z02.f14265j.equals(c7508z0.f14265j)) {
            this.f12048i.m5060b(3, new C7124p(c7508z0));
        }
        if (z4) {
            this.f12048i.m5060b(15, new C7126q(this.f12037C, 0));
        }
        if (c7508z02.f14262g != c7508z0.f14262g) {
            this.f12048i.m5060b(4, new C7134r(c7508z0));
        }
        if (c7508z02.f14260e != c7508z0.f14260e || c7508z02.f14267l != c7508z0.f14267l) {
            this.f12048i.m5060b(-1, new C6553l(c7508z0));
        }
        if (c7508z02.f14260e != c7508z0.f14260e) {
            this.f12048i.m5060b(5, new C7417m.InterfaceC7418a() { // from class: com.google.android.exoplayer2.y
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
                public final void invoke(Object obj9) {
                    ((Player.InterfaceC6626b) obj9).onPlaybackStateChanged(C7508z0.this.f14260e);
                }
            });
        }
        if (c7508z02.f14267l != c7508z0.f14267l) {
            this.f12048i.m5060b(6, new C7417m.InterfaceC7418a() { // from class: com.google.android.exoplayer2.z
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
                public final void invoke(Object obj9) {
                    ((Player.InterfaceC6626b) obj9).onPlayWhenReadyChanged(C7508z0.this.f14267l, i2);
                }
            });
        }
        if (c7508z02.f14268m != c7508z0.f14268m) {
            this.f12048i.m5060b(7, new C7417m.InterfaceC7418a() { // from class: com.google.android.exoplayer2.a0
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
                public final void invoke(Object obj9) {
                    ((Player.InterfaceC6626b) obj9).onPlaybackSuppressionReasonChanged(C7508z0.this.f14268m);
                }
            });
        }
        if (m5773c0(c7508z02) != m5773c0(c7508z0)) {
            this.f12048i.m5060b(8, new C7417m.InterfaceC7418a() { // from class: com.google.android.exoplayer2.b0
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
                public final void invoke(Object obj9) {
                    ((Player.InterfaceC6626b) obj9).onIsPlayingChanged(C6968g0.m5773c0(C7508z0.this));
                }
            });
        }
        if (!c7508z02.f14269n.equals(c7508z0.f14269n)) {
            this.f12048i.m5060b(13, new C7417m.InterfaceC7418a() { // from class: com.google.android.exoplayer2.c0
                @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
                public final void invoke(Object obj9) {
                    ((Player.InterfaceC6626b) obj9).onPlaybackParametersChanged(C7508z0.this.f14269n);
                }
            });
        }
        if (z) {
            this.f12048i.m5060b(-1, new C0510h());
        }
        m5769g0();
        this.f12048i.m5061a();
        if (c7508z02.f14270o != c7508z0.f14270o) {
            Iterator<InterfaceC7120n> it = this.f12049j.iterator();
            while (it.hasNext()) {
                it.next().mo5505b();
            }
        }
        if (c7508z02.f14271p != c7508z0.f14271p) {
            Iterator<InterfaceC7120n> it2 = this.f12049j.iterator();
            while (it2.hasNext()) {
                it2.next().mo5504l();
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: i */
    public final void mo5737i() {
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: j */
    public final int mo5736j() {
        if (this.f12038D.f14256a.m5685p()) {
            return 0;
        }
        C7508z0 c7508z0 = this.f12038D;
        return c7508z0.f14256a.mo5414b(c7508z0.f14257b.f12928a);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: k */
    public final void mo5735k(@Nullable TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: l */
    public final C7496w mo5734l() {
        return C7496w.f14218e;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: m */
    public final void mo5733m(Player.InterfaceC6628d interfaceC6628d) {
        m5771e0(interfaceC6628d);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: n */
    public final int mo5732n() {
        if (mo5746d()) {
            return this.f12038D.f14257b.f12930c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: o */
    public final void mo5731o(@Nullable SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: p */
    public final int mo5730p() {
        int m5776Z = m5776Z();
        if (m5776Z == -1) {
            return 0;
        }
        return m5776Z;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void prepare() {
        int i;
        C7508z0 c7508z0 = this.f12038D;
        if (c7508z0.f14260e != 1) {
            return;
        }
        C7508z0 m4863e = c7508z0.m4863e(null);
        if (m4863e.f14256a.m5685p()) {
            i = 4;
        } else {
            i = 2;
        }
        C7508z0 m4862f = m4863e.m4862f(i);
        this.f12062w++;
        this.f12047h.f12213g.mo5068e(0).m5122a();
        m5768h0(m4862f, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: r */
    public final void mo5729r(boolean z) {
        m5770f0(0, 1, z);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: s */
    public final long mo5728s() {
        return this.f12058s;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: t */
    public final long mo5727t() {
        if (mo5746d()) {
            C7508z0 c7508z0 = this.f12038D;
            AbstractC6984j1 abstractC6984j1 = c7508z0.f14256a;
            Object obj = c7508z0.f14257b.f12928a;
            AbstractC6984j1.C6986b c6986b = this.f12050k;
            abstractC6984j1.mo5689g(obj, c6986b);
            C7508z0 c7508z02 = this.f12038D;
            if (c7508z02.f14258c == -9223372036854775807L) {
                return C6622C.m6216c(c7508z02.f14256a.m5686m(mo5730p(), this.f12034a).f12173m);
            }
            return C6622C.m6216c(c6986b.f12156e) + C6622C.m6216c(this.f12038D.f14258c);
        }
        return getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: u */
    public final void mo5726u(Player.InterfaceC6628d interfaceC6628d) {
        m5779W(interfaceC6628d);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: v */
    public final int mo5725v() {
        return this.f12038D.f14260e;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: w */
    public final List mo5724w() {
        AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
        return C7998n0.f15785e;
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    /* renamed from: x */
    public final ExoPlaybackException mo5723x() {
        return this.f12038D.f14261f;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: y */
    public final int mo5722y() {
        if (mo5746d()) {
            return this.f12038D.f14257b.f12929b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: z */
    public final Player.C6624a mo5721z() {
        return this.f12036B;
    }
}
