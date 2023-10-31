package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6558q;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.C6733b1;
import com.google.android.exoplayer2.C7001m;
import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.C7500x0;
import com.google.android.exoplayer2.analytics.C6642d0;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.source.InterfaceC7167g0;
import com.google.android.exoplayer2.source.InterfaceC7185n;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.text.C7240j;
import com.google.android.exoplayer2.trackselection.AbstractC7307m;
import com.google.android.exoplayer2.trackselection.C7308n;
import com.google.android.exoplayer2.trackselection.InterfaceC7296g;
import com.google.android.exoplayer2.upstream.C7365j;
import com.google.android.exoplayer2.upstream.C7367l;
import com.google.android.exoplayer2.upstream.C7369n;
import com.google.android.exoplayer2.upstream.InterfaceC7352d;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7395a0;
import com.google.android.exoplayer2.util.C7397b0;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.android.exoplayer2.util.InterfaceC7396b;
import com.google.android.exoplayer2.util.InterfaceC7412i;
import com.google.android.exoplayer2.util.InterfaceC7423p;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.C7998n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.exoplayer2.k0 */
/* loaded from: classes.dex */
public final class C6989k0 implements Handler.Callback, InterfaceC7185n.InterfaceC7186a, C7500x0.InterfaceC7504d, C7001m.InterfaceC7002a, C6733b1.InterfaceC6734a {

    /* renamed from: A */
    public boolean f12193A;

    /* renamed from: B */
    public boolean f12194B;

    /* renamed from: C */
    public boolean f12195C;

    /* renamed from: D */
    public int f12196D;

    /* renamed from: E */
    public boolean f12197E;

    /* renamed from: F */
    public boolean f12198F;

    /* renamed from: G */
    public boolean f12199G;

    /* renamed from: H */
    public boolean f12200H;

    /* renamed from: I */
    public int f12201I;
    @Nullable

    /* renamed from: J */
    public C6996g f12202J;

    /* renamed from: K */
    public long f12203K;

    /* renamed from: L */
    public int f12204L;

    /* renamed from: M */
    public boolean f12205M;
    @Nullable

    /* renamed from: N */
    public ExoPlaybackException f12206N;

    /* renamed from: a */
    public final Renderer[] f12207a;

    /* renamed from: b */
    public final RendererCapabilities[] f12208b;

    /* renamed from: c */
    public final AbstractC7307m f12209c;

    /* renamed from: d */
    public final C7308n f12210d;

    /* renamed from: e */
    public final C6998l f12211e;

    /* renamed from: f */
    public final InterfaceC7352d f12212f;

    /* renamed from: g */
    public final InterfaceC7412i f12213g;

    /* renamed from: h */
    public final HandlerThread f12214h;

    /* renamed from: i */
    public final Looper f12215i;

    /* renamed from: j */
    public final AbstractC6984j1.C6987c f12216j;

    /* renamed from: k */
    public final AbstractC6984j1.C6986b f12217k;

    /* renamed from: l */
    public final long f12218l;

    /* renamed from: n */
    public final C7001m f12220n;

    /* renamed from: o */
    public final ArrayList<C6992c> f12221o;

    /* renamed from: p */
    public final InterfaceC7396b f12222p;

    /* renamed from: q */
    public final InterfaceC6994e f12223q;

    /* renamed from: r */
    public final C7310u0 f12224r;

    /* renamed from: s */
    public final C7500x0 f12225s;

    /* renamed from: t */
    public final InterfaceC7125p0 f12226t;

    /* renamed from: u */
    public final long f12227u;

    /* renamed from: v */
    public C6966f1 f12228v;

    /* renamed from: w */
    public C7508z0 f12229w;

    /* renamed from: x */
    public C6993d f12230x;

    /* renamed from: y */
    public boolean f12231y;

    /* renamed from: z */
    public boolean f12232z = false;

    /* renamed from: m */
    public final boolean f12219m = false;

    /* renamed from: com.google.android.exoplayer2.k0$a */
    /* loaded from: classes.dex */
    public static final class C6990a {

        /* renamed from: a */
        public final List<C7500x0.C7503c> f12233a;

        /* renamed from: b */
        public final InterfaceC7167g0 f12234b;

        /* renamed from: c */
        public final int f12235c;

        /* renamed from: d */
        public final long f12236d;

        public C6990a(ArrayList arrayList, InterfaceC7167g0 interfaceC7167g0, int i, long j) {
            this.f12233a = arrayList;
            this.f12234b = interfaceC7167g0;
            this.f12235c = i;
            this.f12236d = j;
        }
    }

    /* renamed from: com.google.android.exoplayer2.k0$b */
    /* loaded from: classes.dex */
    public static class C6991b {
    }

    /* renamed from: com.google.android.exoplayer2.k0$c */
    /* loaded from: classes.dex */
    public static final class C6992c implements Comparable<C6992c> {
        public C6992c() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(C6992c c6992c) {
            c6992c.getClass();
            return 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.k0$d */
    /* loaded from: classes.dex */
    public static final class C6993d {

        /* renamed from: a */
        public boolean f12237a;

        /* renamed from: b */
        public C7508z0 f12238b;

        /* renamed from: c */
        public int f12239c;

        /* renamed from: d */
        public boolean f12240d;

        /* renamed from: e */
        public int f12241e;

        /* renamed from: f */
        public boolean f12242f;

        /* renamed from: g */
        public int f12243g;

        public C6993d(C7508z0 c7508z0) {
            this.f12238b = c7508z0;
        }

        /* renamed from: a */
        public final void m5619a(int i) {
            this.f12237a |= i > 0;
            this.f12239c += i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.k0$e */
    /* loaded from: classes.dex */
    public interface InterfaceC6994e {
    }

    /* renamed from: com.google.android.exoplayer2.k0$f */
    /* loaded from: classes.dex */
    public static final class C6995f {

        /* renamed from: a */
        public final InterfaceC7188p.C7189a f12244a;

        /* renamed from: b */
        public final long f12245b;

        /* renamed from: c */
        public final long f12246c;

        /* renamed from: d */
        public final boolean f12247d;

        /* renamed from: e */
        public final boolean f12248e;

        /* renamed from: f */
        public final boolean f12249f;

        public C6995f(InterfaceC7188p.C7189a c7189a, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f12244a = c7189a;
            this.f12245b = j;
            this.f12246c = j2;
            this.f12247d = z;
            this.f12248e = z2;
            this.f12249f = z3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.k0$g */
    /* loaded from: classes.dex */
    public static final class C6996g {

        /* renamed from: a */
        public final AbstractC6984j1 f12250a;

        /* renamed from: b */
        public final int f12251b;

        /* renamed from: c */
        public final long f12252c;

        public C6996g(AbstractC6984j1 abstractC6984j1, int i, long j) {
            this.f12250a = abstractC6984j1;
            this.f12251b = i;
            this.f12252c = j;
        }
    }

    public C6989k0(Renderer[] rendererArr, AbstractC7307m abstractC7307m, C7308n c7308n, C6998l c6998l, InterfaceC7352d interfaceC7352d, int i, boolean z, @Nullable C6642d0 c6642d0, C6966f1 c6966f1, C6988k c6988k, long j, Looper looper, C7397b0 c7397b0, C6558q c6558q) {
        this.f12223q = c6558q;
        this.f12207a = rendererArr;
        this.f12209c = abstractC7307m;
        this.f12210d = c7308n;
        this.f12211e = c6998l;
        this.f12212f = interfaceC7352d;
        this.f12196D = i;
        this.f12197E = z;
        this.f12228v = c6966f1;
        this.f12226t = c6988k;
        this.f12227u = j;
        this.f12222p = c7397b0;
        this.f12218l = c6998l.f12259g;
        C7508z0 m4860h = C7508z0.m4860h(c7308n);
        this.f12229w = m4860h;
        this.f12230x = new C6993d(m4860h);
        this.f12208b = new RendererCapabilities[rendererArr.length];
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].setIndex(i2);
            this.f12208b[i2] = rendererArr[i2].mo5705j();
        }
        this.f12220n = new C7001m(this, c7397b0);
        this.f12221o = new ArrayList<>();
        this.f12216j = new AbstractC6984j1.C6987c();
        this.f12217k = new AbstractC6984j1.C6986b();
        abstractC7307m.f13476a = interfaceC7352d;
        this.f12205M = true;
        Handler handler = new Handler(looper);
        this.f12224r = new C7310u0(c6642d0, handler);
        this.f12225s = new C7500x0(this, c6642d0, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f12214h = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f12215i = looper2;
        this.f12213g = c7397b0.mo5126b(looper2, this);
    }

    @Nullable
    /* renamed from: G */
    public static Pair<Object, Long> m5671G(AbstractC6984j1 abstractC6984j1, C6996g c6996g, boolean z, int i, boolean z2, AbstractC6984j1.C6987c c6987c, AbstractC6984j1.C6986b c6986b) {
        Pair<Object, Long> m5688i;
        Object m5670H;
        AbstractC6984j1 abstractC6984j12 = c6996g.f12250a;
        if (abstractC6984j1.m5685p()) {
            return null;
        }
        AbstractC6984j1 abstractC6984j13 = abstractC6984j12.m5685p() ? abstractC6984j1 : abstractC6984j12;
        try {
            m5688i = abstractC6984j13.m5688i(c6987c, c6986b, c6996g.f12251b, c6996g.f12252c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC6984j1.equals(abstractC6984j13)) {
            return m5688i;
        }
        if (abstractC6984j1.mo5414b(m5688i.first) != -1) {
            return (abstractC6984j13.mo5689g(m5688i.first, c6986b).f12157f && abstractC6984j13.m5686m(c6986b.f12154c, c6987c).f12175o == abstractC6984j13.mo5414b(m5688i.first)) ? abstractC6984j1.m5688i(c6987c, c6986b, abstractC6984j1.mo5689g(m5688i.first, c6986b).f12154c, c6996g.f12252c) : m5688i;
        }
        if (z && (m5670H = m5670H(c6987c, c6986b, i, z2, m5688i.first, abstractC6984j13, abstractC6984j1)) != null) {
            return abstractC6984j1.m5688i(c6987c, c6986b, abstractC6984j1.mo5689g(m5670H, c6986b).f12154c, -9223372036854775807L);
        }
        return null;
    }

    @Nullable
    /* renamed from: H */
    public static Object m5670H(AbstractC6984j1.C6987c c6987c, AbstractC6984j1.C6986b c6986b, int i, boolean z, Object obj, AbstractC6984j1 abstractC6984j1, AbstractC6984j1 abstractC6984j12) {
        int mo5414b = abstractC6984j1.mo5414b(obj);
        int mo5412h = abstractC6984j1.mo5412h();
        int i2 = mo5414b;
        int i3 = -1;
        for (int i4 = 0; i4 < mo5412h && i3 == -1; i4++) {
            i2 = abstractC6984j1.m5690d(i2, c6986b, c6987c, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = abstractC6984j12.mo5414b(abstractC6984j1.mo5411l(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return abstractC6984j12.mo5411l(i3);
    }

    /* renamed from: N */
    public static void m5664N(Renderer renderer, long j) {
        renderer.mo5706i();
        if (renderer instanceof C7240j) {
            C7240j c7240j = (C7240j) renderer;
            C7394a.m5131d(c7240j.f12135j);
            c7240j.f13169z = j;
        }
    }

    /* renamed from: r */
    public static boolean m5628r(Renderer renderer) {
        return renderer.getState() != 0;
    }

    /* renamed from: A */
    public final void m5677A(int i, int i2, InterfaceC7167g0 interfaceC7167g0) throws ExoPlaybackException {
        boolean z = true;
        this.f12230x.m5619a(1);
        C7500x0 c7500x0 = this.f12225s;
        c7500x0.getClass();
        if (i < 0 || i > i2 || i2 > c7500x0.f14227a.size()) {
            z = false;
        }
        C7394a.m5134a(z);
        c7500x0.f14235i = interfaceC7167g0;
        c7500x0.m4885f(i, i2);
        m5633m(c7500x0.m4889b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0046 A[SYNTHETIC] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5676B() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C6989k0.m5676B():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (r4.equals(r35.f12229w.f14257b) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5675C(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C6989k0.m5675C(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: D */
    public final void m5674D() {
        boolean z;
        C7135r0 c7135r0 = this.f12224r.f13489h;
        if (c7135r0 != null && c7135r0.f12679f.f12696h && this.f12232z) {
            z = true;
        } else {
            z = false;
        }
        this.f12193A = z;
    }

    /* renamed from: E */
    public final void m5673E(long j) throws ExoPlaybackException {
        C7310u0 c7310u0;
        Renderer[] rendererArr;
        InterfaceC7296g[] interfaceC7296gArr;
        C7135r0 c7135r0 = this.f12224r.f13489h;
        if (c7135r0 != null) {
            j += c7135r0.f12688o;
        }
        this.f12203K = j;
        this.f12220n.f12264a.m5128a(j);
        for (Renderer renderer : this.f12207a) {
            if (m5628r(renderer)) {
                renderer.mo5701s(this.f12203K);
            }
        }
        for (C7135r0 c7135r02 = c7310u0.f13489h; c7135r02 != null; c7135r02 = c7135r02.f12685l) {
            for (InterfaceC7296g interfaceC7296g : c7135r02.f12687n.f13479c) {
                if (interfaceC7296g != null) {
                    interfaceC7296g.mo5263j();
                }
            }
        }
    }

    /* renamed from: F */
    public final void m5672F(AbstractC6984j1 abstractC6984j1, AbstractC6984j1 abstractC6984j12) {
        if (abstractC6984j1.m5685p() && abstractC6984j12.m5685p()) {
            return;
        }
        ArrayList<C6992c> arrayList = this.f12221o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    /* renamed from: I */
    public final void m5669I(boolean z) throws ExoPlaybackException {
        InterfaceC7188p.C7189a c7189a = this.f12224r.f13489h.f12679f.f12689a;
        long m5667K = m5667K(c7189a, this.f12229w.f14274s, true, false);
        if (m5667K != this.f12229w.f14274s) {
            C7508z0 c7508z0 = this.f12229w;
            this.f12229w = m5630p(c7189a, m5667K, c7508z0.f14258c, c7508z0.f14259d, z, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7 A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:22:0x009d, B:24:0x00a7, B:27:0x00ad, B:29:0x00b3, B:30:0x00b6, B:32:0x00bb, B:34:0x00c5, B:36:0x00cb, B:40:0x00d3, B:42:0x00dd, B:44:0x00ed, B:48:0x00f7, B:53:0x010b, B:57:0x0114, B:61:0x011f), top: B:75:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5668J(com.google.android.exoplayer2.C6989k0.C6996g r20) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C6989k0.m5668J(com.google.android.exoplayer2.k0$g):void");
    }

    /* renamed from: K */
    public final long m5667K(InterfaceC7188p.C7189a c7189a, long j, boolean z, boolean z2) throws ExoPlaybackException {
        m5648c0();
        this.f12194B = false;
        if (z2 || this.f12229w.f14260e == 3) {
            m5654X(2);
        }
        C7310u0 c7310u0 = this.f12224r;
        C7135r0 c7135r0 = c7310u0.f13489h;
        C7135r0 c7135r02 = c7135r0;
        while (c7135r02 != null && !c7189a.equals(c7135r02.f12679f.f12689a)) {
            c7135r02 = c7135r02.f12685l;
        }
        if (z || c7135r0 != c7135r02 || (c7135r02 != null && c7135r02.f12688o + j < 0)) {
            Renderer[] rendererArr = this.f12207a;
            for (Renderer renderer : rendererArr) {
                m5647d(renderer);
            }
            if (c7135r02 != null) {
                while (c7310u0.f13489h != c7135r02) {
                    c7310u0.m5252a();
                }
                c7310u0.m5242k(c7135r02);
                c7135r02.f12688o = 0L;
                m5643f(new boolean[rendererArr.length]);
            }
        }
        if (c7135r02 != null) {
            c7310u0.m5242k(c7135r02);
            if (!c7135r02.f12677d) {
                c7135r02.f12679f = c7135r02.f12679f.m5489b(j);
            } else if (c7135r02.f12678e) {
                InterfaceC7185n interfaceC7185n = c7135r02.f12674a;
                j = interfaceC7185n.mo5406f(j);
                interfaceC7185n.mo5397r(j - this.f12218l, this.f12219m);
            }
            m5673E(j);
            m5626t();
        } else {
            c7310u0.m5251b();
            m5673E(j);
        }
        m5634l(false);
        this.f12213g.mo5064i(2);
        return j;
    }

    /* renamed from: L */
    public final void m5666L(C6733b1 c6733b1) throws ExoPlaybackException {
        Looper looper = c6733b1.f10886f;
        Looper looper2 = this.f12215i;
        InterfaceC7412i interfaceC7412i = this.f12213g;
        if (looper == looper2) {
            synchronized (c6733b1) {
            }
            try {
                c6733b1.f10881a.mo4917p(c6733b1.f10884d, c6733b1.f10885e);
                c6733b1.m6024b(true);
                int i = this.f12229w.f14260e;
                if (i == 3 || i == 2) {
                    interfaceC7412i.mo5064i(2);
                    return;
                }
                return;
            } catch (Throwable th) {
                c6733b1.m6024b(true);
                throw th;
            }
        }
        interfaceC7412i.mo5063j(15, c6733b1).m5122a();
    }

    /* renamed from: M */
    public final void m5665M(final C6733b1 c6733b1) {
        Looper looper = c6733b1.f10886f;
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            c6733b1.m6024b(false);
            return;
        }
        this.f12222p.mo5126b(looper, null).mo5069d(new Runnable() { // from class: com.google.android.exoplayer2.i0
            @Override // java.lang.Runnable
            public final void run() {
                C6733b1 c6733b12 = c6733b1;
                C6989k0.this.getClass();
                try {
                    synchronized (c6733b12) {
                    }
                    c6733b12.f10881a.mo4917p(c6733b12.f10884d, c6733b12.f10885e);
                    c6733b12.m6024b(true);
                } catch (ExoPlaybackException e) {
                    C7421n.m5056b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            }
        });
    }

    /* renamed from: O */
    public final void m5663O(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        Renderer[] rendererArr;
        if (this.f12198F != z) {
            this.f12198F = z;
            if (!z) {
                for (Renderer renderer : this.f12207a) {
                    if (!m5628r(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: P */
    public final void m5662P(C6990a c6990a) throws ExoPlaybackException {
        this.f12230x.m5619a(1);
        int i = c6990a.f12235c;
        InterfaceC7167g0 interfaceC7167g0 = c6990a.f12234b;
        List<C7500x0.C7503c> list = c6990a.f12233a;
        if (i != -1) {
            this.f12202J = new C6996g(new C6737c1(list, interfaceC7167g0), c6990a.f12235c, c6990a.f12236d);
        }
        C7500x0 c7500x0 = this.f12225s;
        ArrayList arrayList = c7500x0.f14227a;
        c7500x0.m4885f(0, arrayList.size());
        m5633m(c7500x0.m4890a(arrayList.size(), list, interfaceC7167g0), false);
    }

    /* renamed from: Q */
    public final void m5661Q(boolean z) {
        if (z == this.f12200H) {
            return;
        }
        this.f12200H = z;
        C7508z0 c7508z0 = this.f12229w;
        int i = c7508z0.f14260e;
        if (z || i == 4 || i == 1) {
            this.f12229w = c7508z0.m4865c(z);
        } else {
            this.f12213g.mo5064i(2);
        }
    }

    /* renamed from: R */
    public final void m5660R(boolean z) throws ExoPlaybackException {
        this.f12232z = z;
        m5674D();
        if (this.f12193A) {
            C7310u0 c7310u0 = this.f12224r;
            if (c7310u0.f13490i != c7310u0.f13489h) {
                m5669I(true);
                m5634l(false);
            }
        }
    }

    /* renamed from: S */
    public final void m5659S(int i, int i2, boolean z, boolean z2) throws ExoPlaybackException {
        InterfaceC7296g[] interfaceC7296gArr;
        this.f12230x.m5619a(z2 ? 1 : 0);
        C6993d c6993d = this.f12230x;
        c6993d.f12237a = true;
        c6993d.f12242f = true;
        c6993d.f12243g = i2;
        this.f12229w = this.f12229w.m4864d(i, z);
        this.f12194B = false;
        for (C7135r0 c7135r0 = this.f12224r.f13489h; c7135r0 != null; c7135r0 = c7135r0.f12685l) {
            for (InterfaceC7296g interfaceC7296g : c7135r0.f12687n.f13479c) {
                if (interfaceC7296g != null) {
                    interfaceC7296g.mo5268a();
                }
            }
        }
        if (!m5653Y()) {
            m5648c0();
            m5640g0();
            return;
        }
        int i3 = this.f12229w.f14260e;
        if (i3 == 3) {
            m5651a0();
        } else if (i3 != 2) {
            return;
        }
        this.f12213g.mo5064i(2);
    }

    /* renamed from: T */
    public final void m5658T(C6633a1 c6633a1) throws ExoPlaybackException {
        C7001m c7001m = this.f12220n;
        c7001m.mo5051f(c6633a1);
        C6633a1 mo5052c = c7001m.mo5052c();
        m5631o(mo5052c, mo5052c.f10557a, true, true);
    }

    /* renamed from: U */
    public final void m5657U(int i) throws ExoPlaybackException {
        this.f12196D = i;
        AbstractC6984j1 abstractC6984j1 = this.f12229w.f14256a;
        C7310u0 c7310u0 = this.f12224r;
        c7310u0.f13487f = i;
        if (!c7310u0.m5239n(abstractC6984j1)) {
            m5669I(true);
        }
        m5634l(false);
    }

    /* renamed from: V */
    public final void m5656V(boolean z) throws ExoPlaybackException {
        this.f12197E = z;
        AbstractC6984j1 abstractC6984j1 = this.f12229w.f14256a;
        C7310u0 c7310u0 = this.f12224r;
        c7310u0.f13488g = z;
        if (!c7310u0.m5239n(abstractC6984j1)) {
            m5669I(true);
        }
        m5634l(false);
    }

    /* renamed from: W */
    public final void m5655W(InterfaceC7167g0 interfaceC7167g0) throws ExoPlaybackException {
        this.f12230x.m5619a(1);
        C7500x0 c7500x0 = this.f12225s;
        int size = c7500x0.f14227a.size();
        if (interfaceC7167g0.getLength() != size) {
            interfaceC7167g0 = interfaceC7167g0.mo5426g().mo5428e(size);
        }
        c7500x0.f14235i = interfaceC7167g0;
        m5633m(c7500x0.m4889b(), false);
    }

    /* renamed from: X */
    public final void m5654X(int i) {
        C7508z0 c7508z0 = this.f12229w;
        if (c7508z0.f14260e != i) {
            this.f12229w = c7508z0.m4862f(i);
        }
    }

    /* renamed from: Y */
    public final boolean m5653Y() {
        C7508z0 c7508z0 = this.f12229w;
        return c7508z0.f14267l && c7508z0.f14268m == 0;
    }

    /* renamed from: Z */
    public final boolean m5652Z(AbstractC6984j1 abstractC6984j1, InterfaceC7188p.C7189a c7189a) {
        if (c7189a.m5394a() || abstractC6984j1.m5685p()) {
            return false;
        }
        int i = abstractC6984j1.mo5689g(c7189a.f12928a, this.f12217k).f12154c;
        AbstractC6984j1.C6987c c6987c = this.f12216j;
        abstractC6984j1.m5686m(i, c6987c);
        return c6987c.m5680a() && c6987c.f12169i && c6987c.f12166f != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7164f0.InterfaceC7165a
    /* renamed from: a */
    public final void mo5420a(InterfaceC7185n interfaceC7185n) {
        this.f12213g.mo5063j(9, interfaceC7185n).m5122a();
    }

    /* renamed from: a0 */
    public final void m5651a0() throws ExoPlaybackException {
        Renderer[] rendererArr;
        this.f12194B = false;
        C7001m c7001m = this.f12220n;
        c7001m.f12269f = true;
        C7395a0 c7395a0 = c7001m.f12264a;
        if (!c7395a0.f13879b) {
            c7395a0.f13881d = c7395a0.f13878a.elapsedRealtime();
            c7395a0.f13879b = true;
        }
        for (Renderer renderer : this.f12207a) {
            if (m5628r(renderer)) {
                renderer.start();
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n.InterfaceC7186a
    /* renamed from: b */
    public final void mo5395b(InterfaceC7185n interfaceC7185n) {
        this.f12213g.mo5063j(8, interfaceC7185n).m5122a();
    }

    /* renamed from: b0 */
    public final void m5650b0(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.f12198F) {
            z3 = false;
        } else {
            z3 = true;
        }
        m5675C(z3, false, true, false);
        this.f12230x.m5619a(z2 ? 1 : 0);
        this.f12211e.m5617b(true);
        m5654X(1);
    }

    /* renamed from: c */
    public final void m5649c(C6990a c6990a, int i) throws ExoPlaybackException {
        this.f12230x.m5619a(1);
        C7500x0 c7500x0 = this.f12225s;
        if (i == -1) {
            i = c7500x0.f14227a.size();
        }
        m5633m(c7500x0.m4890a(i, c6990a.f12233a, c6990a.f12234b), false);
    }

    /* renamed from: c0 */
    public final void m5648c0() throws ExoPlaybackException {
        Renderer[] rendererArr;
        C7001m c7001m = this.f12220n;
        c7001m.f12269f = false;
        C7395a0 c7395a0 = c7001m.f12264a;
        if (c7395a0.f13879b) {
            c7395a0.m5128a(c7395a0.mo5050k());
            c7395a0.f13879b = false;
        }
        for (Renderer renderer : this.f12207a) {
            if (m5628r(renderer) && renderer.getState() == 2) {
                renderer.stop();
            }
        }
    }

    /* renamed from: d */
    public final void m5647d(Renderer renderer) throws ExoPlaybackException {
        boolean z;
        if (renderer.getState() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        C7001m c7001m = this.f12220n;
        if (renderer == c7001m.f12266c) {
            c7001m.f12267d = null;
            c7001m.f12266c = null;
            c7001m.f12268e = true;
        }
        if (renderer.getState() == 2) {
            renderer.stop();
        }
        renderer.mo5709e();
        this.f12201I--;
    }

    /* renamed from: d0 */
    public final void m5646d0() {
        boolean z;
        C7135r0 c7135r0 = this.f12224r.f13491j;
        if (!this.f12195C && (c7135r0 == null || !c7135r0.f12674a.mo5404h())) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        C7508z0 c7508z0 = this.f12229w;
        if (z2 != c7508z0.f14262g) {
            this.f12229w = new C7508z0(c7508z0.f14256a, c7508z0.f14257b, c7508z0.f14258c, c7508z0.f14259d, c7508z0.f14260e, c7508z0.f14261f, z2, c7508z0.f14263h, c7508z0.f14264i, c7508z0.f14265j, c7508z0.f14266k, c7508z0.f14267l, c7508z0.f14268m, c7508z0.f14269n, c7508z0.f14272q, c7508z0.f14273r, c7508z0.f14274s, c7508z0.f14270o, c7508z0.f14271p);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r0.f13492k < 100) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0527, code lost:
        if (r10 == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
        if (r10 != (-9223372036854775807L)) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x02ed A[EDGE_INSN: B:447:0x02ed->B:201:0x02ed ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x036b A[EDGE_INSN: B:454:0x036b->B:226:0x036b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5645e() throws com.google.android.exoplayer2.ExoPlaybackException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C6989k0.m5645e():void");
    }

    /* renamed from: e0 */
    public final void m5644e0(AbstractC6984j1 abstractC6984j1, InterfaceC7188p.C7189a c7189a, AbstractC6984j1 abstractC6984j12, InterfaceC7188p.C7189a c7189a2, long j) {
        Object obj;
        if (!abstractC6984j1.m5685p() && m5652Z(abstractC6984j1, c7189a)) {
            Object obj2 = c7189a.f12928a;
            AbstractC6984j1.C6986b c6986b = this.f12217k;
            int i = abstractC6984j1.mo5689g(obj2, c6986b).f12154c;
            AbstractC6984j1.C6987c c6987c = this.f12216j;
            abstractC6984j1.m5686m(i, c6987c);
            C7127q0.C7132e c7132e = c6987c.f12171k;
            int i2 = C7408g0.f13905a;
            C6988k c6988k = (C6988k) this.f12226t;
            c6988k.getClass();
            c6988k.f12181d = C6622C.m6217b(c7132e.f12662a);
            c6988k.f12184g = C6622C.m6217b(c7132e.f12663b);
            c6988k.f12185h = C6622C.m6217b(c7132e.f12664c);
            float f = c7132e.f12665d;
            if (f == -3.4028235E38f) {
                f = 0.97f;
            }
            c6988k.f12188k = f;
            float f2 = c7132e.f12666e;
            if (f2 == -3.4028235E38f) {
                f2 = 1.03f;
            }
            c6988k.f12187j = f2;
            c6988k.m5678a();
            if (j != -9223372036854775807L) {
                c6988k.f12182e = m5641g(abstractC6984j1, obj2, j);
            } else {
                Object obj3 = c6987c.f12161a;
                if (!abstractC6984j12.m5685p()) {
                    obj = abstractC6984j12.m5686m(abstractC6984j12.mo5689g(c7189a2.f12928a, c6986b).f12154c, c6987c).f12161a;
                } else {
                    obj = null;
                }
                if (!C7408g0.m5105a(obj, obj3)) {
                    c6988k.f12182e = -9223372036854775807L;
                } else {
                    return;
                }
            }
            c6988k.m5678a();
            return;
        }
        C7001m c7001m = this.f12220n;
        float f3 = c7001m.mo5052c().f10557a;
        C6633a1 c6633a1 = this.f12229w.f14269n;
        if (f3 != c6633a1.f10557a) {
            c7001m.mo5051f(c6633a1);
        }
    }

    /* renamed from: f */
    public final void m5643f(boolean[] zArr) throws ExoPlaybackException {
        Renderer[] rendererArr;
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        InterfaceC7423p interfaceC7423p;
        C7310u0 c7310u0 = this.f12224r;
        C7135r0 c7135r0 = c7310u0.f13490i;
        C7308n c7308n = c7135r0.f12687n;
        int i3 = 0;
        while (true) {
            rendererArr = this.f12207a;
            if (i3 >= rendererArr.length) {
                break;
            }
            if (!c7308n.m5253b(i3)) {
                rendererArr[i3].reset();
            }
            i3++;
        }
        int i4 = 0;
        while (i4 < rendererArr.length) {
            if (c7308n.m5253b(i4)) {
                boolean z4 = zArr[i4];
                Renderer renderer = rendererArr[i4];
                if (!m5628r(renderer)) {
                    C7135r0 c7135r02 = c7310u0.f13490i;
                    if (c7135r02 == c7310u0.f13489h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C7308n c7308n2 = c7135r02.f12687n;
                    C6740d1 c6740d1 = c7308n2.f13478b[i4];
                    InterfaceC7296g interfaceC7296g = c7308n2.f13479c[i4];
                    if (interfaceC7296g != null) {
                        i2 = interfaceC7296g.length();
                    } else {
                        i2 = 0;
                    }
                    C7003m0[] c7003m0Arr = new C7003m0[i2];
                    for (int i5 = 0; i5 < i2; i5++) {
                        c7003m0Arr[i5] = interfaceC7296g.mo5259f(i5);
                    }
                    if (m5653Y() && this.f12229w.f14260e == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z4 && z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.f12201I++;
                    i = i4;
                    renderer.mo5704m(c6740d1, c7003m0Arr, c7135r02.f12676c[i4], this.f12203K, z3, z, c7135r02.m5496e(), c7135r02.f12688o);
                    renderer.mo4917p(103, new C6983j0(this));
                    C7001m c7001m = this.f12220n;
                    c7001m.getClass();
                    InterfaceC7423p mo5699u = renderer.mo5699u();
                    if (mo5699u != null && mo5699u != (interfaceC7423p = c7001m.f12267d)) {
                        if (interfaceC7423p == null) {
                            c7001m.f12267d = mo5699u;
                            c7001m.f12266c = renderer;
                            mo5699u.mo5051f(c7001m.f12264a.f13882e);
                        } else {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z2) {
                        renderer.start();
                    }
                    i4 = i + 1;
                }
            }
            i = i4;
            i4 = i + 1;
        }
        c7135r0.f12680g = true;
    }

    /* renamed from: f0 */
    public final void m5642f0(C7308n c7308n) {
        InterfaceC7296g[] interfaceC7296gArr = c7308n.f13479c;
        C6998l c6998l = this.f12211e;
        int i = c6998l.f12258f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                Renderer[] rendererArr = this.f12207a;
                int i4 = 13107200;
                if (i2 < rendererArr.length) {
                    if (interfaceC7296gArr[i2] != null) {
                        int mo5698v = rendererArr[i2].mo5698v();
                        if (mo5698v != 0) {
                            if (mo5698v != 1) {
                                if (mo5698v != 2) {
                                    if (mo5698v != 3 && mo5698v != 5 && mo5698v != 6) {
                                        if (mo5698v == 7) {
                                            i4 = 0;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    } else {
                                        i4 = 131072;
                                    }
                                } else {
                                    i4 = 131072000;
                                }
                            }
                        } else {
                            i4 = 144310272;
                        }
                        i3 += i4;
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                    break;
                }
            }
        }
        c6998l.f12260h = i;
        c6998l.f12253a.m5170b(i);
    }

    /* renamed from: g */
    public final long m5641g(AbstractC6984j1 abstractC6984j1, Object obj, long j) {
        long elapsedRealtime;
        AbstractC6984j1.C6986b c6986b = this.f12217k;
        int i = abstractC6984j1.mo5689g(obj, c6986b).f12154c;
        AbstractC6984j1.C6987c c6987c = this.f12216j;
        abstractC6984j1.m5686m(i, c6987c);
        if (c6987c.f12166f == -9223372036854775807L || !c6987c.m5680a() || !c6987c.f12169i) {
            return -9223372036854775807L;
        }
        long j2 = c6987c.f12167g;
        int i2 = C7408g0.f13905a;
        if (j2 == -9223372036854775807L) {
            elapsedRealtime = System.currentTimeMillis();
        } else {
            elapsedRealtime = j2 + SystemClock.elapsedRealtime();
        }
        return C6622C.m6217b(elapsedRealtime - c6987c.f12166f) - (j + c6986b.f12156e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ab, code lost:
        if (r4 > r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013e, code lost:
        if (0 > r0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x012a -> B:66:0x012e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0142 -> B:74:0x0144). Please submit an issue!!! */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5640g0() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C6989k0.m5640g0():void");
    }

    /* renamed from: h */
    public final long m5639h() {
        C7135r0 c7135r0 = this.f12224r.f13490i;
        if (c7135r0 == null) {
            return 0L;
        }
        long j = c7135r0.f12688o;
        if (!c7135r0.f12677d) {
            return j;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.f12207a;
            if (i < rendererArr.length) {
                if (m5628r(rendererArr[i]) && rendererArr[i].getStream() == c7135r0.f12676c[i]) {
                    long mo5702r = rendererArr[i].mo5702r();
                    if (mo5702r == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j = Math.max(mo5702r, j);
                }
                i++;
            } else {
                return j;
            }
        }
    }

    /* renamed from: h0 */
    public final synchronized void m5638h0(C6975h0 c6975h0, long j) {
        long elapsedRealtime = this.f12222p.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) c6975h0.get()).booleanValue() && j > 0) {
            try {
                this.f12222p.mo5125c();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - this.f12222p.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ExoPlaybackException exoPlaybackException;
        int i;
        int i2;
        IOException iOException;
        C7135r0 c7135r0;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 0:
                    m5622x();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m5659S(message.arg2, 1, z, true);
                    break;
                case 2:
                    m5645e();
                    break;
                case 3:
                    m5668J((C6996g) message.obj);
                    break;
                case 4:
                    m5658T((C6633a1) message.obj);
                    break;
                case 5:
                    this.f12228v = (C6966f1) message.obj;
                    break;
                case 6:
                    m5650b0(false, true);
                    break;
                case 7:
                    m5620z();
                    return true;
                case 8:
                    m5632n((InterfaceC7185n) message.obj);
                    break;
                case 9:
                    m5636j((InterfaceC7185n) message.obj);
                    break;
                case 10:
                    m5676B();
                    break;
                case 11:
                    m5657U(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m5656V(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    m5663O(z3, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C6733b1 c6733b1 = (C6733b1) message.obj;
                    c6733b1.getClass();
                    m5666L(c6733b1);
                    break;
                case 15:
                    m5665M((C6733b1) message.obj);
                    break;
                case 16:
                    C6633a1 c6633a1 = (C6633a1) message.obj;
                    m5631o(c6633a1, c6633a1.f10557a, true, false);
                    break;
                case 17:
                    m5662P((C6990a) message.obj);
                    break;
                case 18:
                    m5649c((C6990a) message.obj, message.arg1);
                    break;
                case 19:
                    m5623w((C6991b) message.obj);
                    break;
                case 20:
                    m5677A(message.arg1, message.arg2, (InterfaceC7167g0) message.obj);
                    break;
                case 21:
                    m5655W((InterfaceC7167g0) message.obj);
                    break;
                case 22:
                    m5624v();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    m5660R(z4);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    m5661Q(z5);
                    break;
                case 25:
                    m5669I(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.f10472c == 1 && (c7135r0 = this.f12224r.f13490i) != null) {
                e = e.m6214a(c7135r0.f12679f.f12689a);
            }
            exoPlaybackException = e;
            if (exoPlaybackException.f10478i && this.f12206N == null) {
                C7421n.m5055c("ExoPlayerImplInternal", "Recoverable renderer error", exoPlaybackException);
                this.f12206N = exoPlaybackException;
                InterfaceC7412i interfaceC7412i = this.f12213g;
                interfaceC7412i.mo5065h(interfaceC7412i.mo5063j(25, exoPlaybackException));
            } else {
                ExoPlaybackException exoPlaybackException2 = this.f12206N;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.f12206N;
                }
                C7421n.m5056b("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
                m5650b0(true, false);
                this.f12229w = this.f12229w.m4863e(exoPlaybackException);
            }
        } catch (DrmSession.C6760a e2) {
            i = e2.f10978a;
            iOException = e2;
            m5635k(iOException, i);
        } catch (C7365j e3) {
            i = e3.f13771a;
            iOException = e3;
            m5635k(iOException, i);
        } catch (C7506y0 e4) {
            boolean z6 = e4.f14251a;
            int i4 = e4.f14252b;
            if (i4 == 1) {
                if (z6) {
                    i2 = AdError.MEDIATION_ERROR_CODE;
                } else {
                    i2 = 3003;
                }
            } else {
                if (i4 == 4) {
                    if (z6) {
                        i2 = 3002;
                    } else {
                        i2 = 3004;
                    }
                }
                m5635k(e4, i3);
            }
            i3 = i2;
            m5635k(e4, i3);
        } catch (IOException e5) {
            i = AdError.SERVER_ERROR_CODE;
            iOException = e5;
            m5635k(iOException, i);
        } catch (RuntimeException e6) {
            exoPlaybackException = new ExoPlaybackException(2, e6, ((e6 instanceof IllegalStateException) || (e6 instanceof IllegalArgumentException)) ? 1004 : 1004);
            C7421n.m5056b("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
            m5650b0(true, false);
            this.f12229w = this.f12229w.m4863e(exoPlaybackException);
        }
        m5625u();
        return true;
    }

    /* renamed from: i */
    public final Pair<InterfaceC7188p.C7189a, Long> m5637i(AbstractC6984j1 abstractC6984j1) {
        long j = 0;
        if (abstractC6984j1.m5685p()) {
            return Pair.create(C7508z0.f14255t, 0L);
        }
        Pair<Object, Long> m5688i = abstractC6984j1.m5688i(this.f12216j, this.f12217k, abstractC6984j1.mo5425a(this.f12197E), -9223372036854775807L);
        InterfaceC7188p.C7189a m5241l = this.f12224r.m5241l(abstractC6984j1, m5688i.first, 0L);
        long longValue = ((Long) m5688i.second).longValue();
        if (m5241l.m5394a()) {
            Object obj = m5241l.f12928a;
            AbstractC6984j1.C6986b c6986b = this.f12217k;
            abstractC6984j1.mo5689g(obj, c6986b);
            if (m5241l.f12930c == c6986b.m5682c(m5241l.f12929b)) {
                j = c6986b.f12158g.f12770c;
            }
            longValue = j;
        }
        return Pair.create(m5241l, Long.valueOf(longValue));
    }

    /* renamed from: j */
    public final void m5636j(InterfaceC7185n interfaceC7185n) {
        boolean z;
        C7135r0 c7135r0 = this.f12224r.f13491j;
        boolean z2 = true;
        if (c7135r0 != null && c7135r0.f12674a == interfaceC7185n) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        long j = this.f12203K;
        if (c7135r0 != null) {
            if (c7135r0.f12685l != null) {
                z2 = false;
            }
            C7394a.m5131d(z2);
            if (c7135r0.f12677d) {
                c7135r0.f12674a.mo5396s(j - c7135r0.f12688o);
            }
        }
        m5626t();
    }

    /* renamed from: k */
    public final void m5635k(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        C7135r0 c7135r0 = this.f12224r.f13489h;
        if (c7135r0 != null) {
            exoPlaybackException = exoPlaybackException.m6214a(c7135r0.f12679f.f12689a);
        }
        C7421n.m5056b("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        m5650b0(false, false);
        this.f12229w = this.f12229w.m4863e(exoPlaybackException);
    }

    /* renamed from: l */
    public final void m5634l(boolean z) {
        InterfaceC7188p.C7189a c7189a;
        long m5497d;
        C7135r0 c7135r0 = this.f12224r.f13491j;
        if (c7135r0 == null) {
            c7189a = this.f12229w.f14257b;
        } else {
            c7189a = c7135r0.f12679f.f12689a;
        }
        boolean z2 = !this.f12229w.f14266k.equals(c7189a);
        if (z2) {
            this.f12229w = this.f12229w.m4867a(c7189a);
        }
        C7508z0 c7508z0 = this.f12229w;
        if (c7135r0 == null) {
            m5497d = c7508z0.f14274s;
        } else {
            m5497d = c7135r0.m5497d();
        }
        c7508z0.f14272q = m5497d;
        C7508z0 c7508z02 = this.f12229w;
        long j = c7508z02.f14272q;
        C7135r0 c7135r02 = this.f12224r.f13491j;
        long j2 = 0;
        if (c7135r02 != null) {
            j2 = Math.max(0L, j - (this.f12203K - c7135r02.f12688o));
        }
        c7508z02.f14273r = j2;
        if ((z2 || z) && c7135r0 != null && c7135r0.f12677d) {
            m5642f0(c7135r0.f12687n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0363 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e7  */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5633m(com.google.android.exoplayer2.AbstractC6984j1 r39, boolean r40) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C6989k0.m5633m(com.google.android.exoplayer2.j1, boolean):void");
    }

    /* renamed from: n */
    public final void m5632n(InterfaceC7185n interfaceC7185n) throws ExoPlaybackException {
        boolean z;
        C7310u0 c7310u0 = this.f12224r;
        C7135r0 c7135r0 = c7310u0.f13491j;
        if (c7135r0 != null && c7135r0.f12674a == interfaceC7185n) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        float f = this.f12220n.mo5052c().f10557a;
        AbstractC6984j1 abstractC6984j1 = this.f12229w.f14256a;
        c7135r0.f12677d = true;
        c7135r0.f12686m = c7135r0.f12674a.mo5399n();
        C7308n m5494g = c7135r0.m5494g(f, abstractC6984j1);
        C7137s0 c7137s0 = c7135r0.f12679f;
        long j = c7137s0.f12690b;
        long j2 = c7137s0.f12693e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long m5500a = c7135r0.m5500a(m5494g, j, false, new boolean[c7135r0.f12682i.length]);
        long j3 = c7135r0.f12688o;
        C7137s0 c7137s02 = c7135r0.f12679f;
        c7135r0.f12688o = (c7137s02.f12690b - m5500a) + j3;
        c7135r0.f12679f = c7137s02.m5489b(m5500a);
        m5642f0(c7135r0.f12687n);
        if (c7135r0 == c7310u0.f13489h) {
            m5673E(c7135r0.f12679f.f12690b);
            m5643f(new boolean[this.f12207a.length]);
            C7508z0 c7508z0 = this.f12229w;
            InterfaceC7188p.C7189a c7189a = c7508z0.f14257b;
            long j4 = c7135r0.f12679f.f12690b;
            this.f12229w = m5630p(c7189a, j4, c7508z0.f14258c, j4, false, 5);
        }
        m5626t();
    }

    /* renamed from: o */
    public final void m5631o(C6633a1 c6633a1, float f, boolean z, boolean z2) throws ExoPlaybackException {
        int i;
        C6989k0 c6989k0 = this;
        if (z) {
            if (z2) {
                c6989k0.f12230x.m5619a(1);
            }
            C7508z0 c7508z0 = c6989k0.f12229w;
            c6989k0 = this;
            c6989k0.f12229w = new C7508z0(c7508z0.f14256a, c7508z0.f14257b, c7508z0.f14258c, c7508z0.f14259d, c7508z0.f14260e, c7508z0.f14261f, c7508z0.f14262g, c7508z0.f14263h, c7508z0.f14264i, c7508z0.f14265j, c7508z0.f14266k, c7508z0.f14267l, c7508z0.f14268m, c6633a1, c7508z0.f14272q, c7508z0.f14273r, c7508z0.f14274s, c7508z0.f14270o, c7508z0.f14271p);
        }
        float f2 = c6633a1.f10557a;
        C7135r0 c7135r0 = c6989k0.f12224r.f13489h;
        while (true) {
            i = 0;
            if (c7135r0 == null) {
                break;
            }
            InterfaceC7296g[] interfaceC7296gArr = c7135r0.f12687n.f13479c;
            int length = interfaceC7296gArr.length;
            while (i < length) {
                InterfaceC7296g interfaceC7296g = interfaceC7296gArr[i];
                if (interfaceC7296g != null) {
                    interfaceC7296g.mo5267d();
                }
                i++;
            }
            c7135r0 = c7135r0.f12685l;
        }
        Renderer[] rendererArr = c6989k0.f12207a;
        int length2 = rendererArr.length;
        while (i < length2) {
            Renderer renderer = rendererArr[i];
            if (renderer != null) {
                renderer.mo4939l(f, c6633a1.f10557a);
            }
            i++;
        }
    }

    @CheckResult
    /* renamed from: p */
    public final C7508z0 m5630p(InterfaceC7188p.C7189a c7189a, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        C7178k0 c7178k0;
        C7308n c7308n;
        C7998n0 c7998n0;
        long max;
        boolean z3;
        C7178k0 c7178k02;
        C7308n c7308n2;
        C7998n0 c7998n02;
        if (!this.f12205M && j == this.f12229w.f14274s && c7189a.equals(this.f12229w.f14257b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f12205M = z2;
        m5674D();
        C7508z0 c7508z0 = this.f12229w;
        C7178k0 c7178k03 = c7508z0.f14263h;
        C7308n c7308n3 = c7508z0.f14264i;
        List<C7042a> list = c7508z0.f14265j;
        if (this.f12225s.f14236j) {
            C7135r0 c7135r0 = this.f12224r.f13489h;
            if (c7135r0 == null) {
                c7178k02 = C7178k0.f12904d;
            } else {
                c7178k02 = c7135r0.f12686m;
            }
            if (c7135r0 == null) {
                c7308n2 = this.f12210d;
            } else {
                c7308n2 = c7135r0.f12687n;
            }
            InterfaceC7296g[] interfaceC7296gArr = c7308n2.f13479c;
            AbstractC8013s.C8014a c8014a = new AbstractC8013s.C8014a();
            boolean z4 = false;
            for (InterfaceC7296g interfaceC7296g : interfaceC7296gArr) {
                if (interfaceC7296g != null) {
                    C7042a c7042a = interfaceC7296g.mo5259f(0).f12285j;
                    if (c7042a == null) {
                        c8014a.m4242b(new C7042a(new C7042a.InterfaceC7044b[0]));
                    } else {
                        c8014a.m4242b(c7042a);
                        z4 = true;
                    }
                }
            }
            if (z4) {
                c7998n02 = c8014a.m4241c();
            } else {
                AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
                c7998n02 = C7998n0.f15785e;
            }
            if (c7135r0 != null) {
                C7137s0 c7137s0 = c7135r0.f12679f;
                if (c7137s0.f12691c != j2) {
                    c7135r0.f12679f = c7137s0.m5490a(j2);
                }
            }
            c7998n0 = c7998n02;
            c7178k0 = c7178k02;
            c7308n = c7308n2;
        } else if (!c7189a.equals(c7508z0.f14257b)) {
            C7178k0 c7178k04 = C7178k0.f12904d;
            C7308n c7308n4 = this.f12210d;
            AbstractC8013s.C8015b c8015b2 = AbstractC8013s.f15817b;
            c7178k0 = c7178k04;
            c7308n = c7308n4;
            c7998n0 = C7998n0.f15785e;
        } else {
            c7178k0 = c7178k03;
            c7308n = c7308n3;
            c7998n0 = list;
        }
        if (z) {
            C6993d c6993d = this.f12230x;
            if (c6993d.f12240d && c6993d.f12241e != 5) {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C7394a.m5134a(z3);
            } else {
                c6993d.f12237a = true;
                c6993d.f12240d = true;
                c6993d.f12241e = i;
            }
        }
        C7508z0 c7508z02 = this.f12229w;
        long j4 = c7508z02.f14272q;
        C7135r0 c7135r02 = this.f12224r.f13491j;
        if (c7135r02 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j4 - (this.f12203K - c7135r02.f12688o));
        }
        return c7508z02.m4866b(c7189a, j, j2, j3, max, c7178k0, c7308n, c7998n0);
    }

    /* renamed from: q */
    public final boolean m5629q() {
        long mo5408c;
        C7135r0 c7135r0 = this.f12224r.f13491j;
        if (c7135r0 == null) {
            return false;
        }
        if (!c7135r0.f12677d) {
            mo5408c = 0;
        } else {
            mo5408c = c7135r0.f12674a.mo5408c();
        }
        if (mo5408c == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m5627s() {
        C7135r0 c7135r0 = this.f12224r.f13489h;
        long j = c7135r0.f12679f.f12693e;
        if (c7135r0.f12677d && (j == -9223372036854775807L || this.f12229w.f14274s < j || !m5653Y())) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final void m5626t() {
        long mo5408c;
        int i;
        boolean z;
        boolean z2;
        boolean m5629q = m5629q();
        C7310u0 c7310u0 = this.f12224r;
        boolean z3 = true;
        if (!m5629q) {
            z2 = false;
        } else {
            C7135r0 c7135r0 = c7310u0.f13491j;
            long j = 0;
            if (!c7135r0.f12677d) {
                mo5408c = 0;
            } else {
                mo5408c = c7135r0.f12674a.mo5408c();
            }
            C7135r0 c7135r02 = this.f12224r.f13491j;
            if (c7135r02 != null) {
                j = Math.max(0L, mo5408c - (this.f12203K - c7135r02.f12688o));
            }
            if (c7135r0 != c7310u0.f13489h) {
                long j2 = c7135r0.f12679f.f12690b;
            }
            float f = this.f12220n.mo5052c().f10557a;
            C6998l c6998l = this.f12211e;
            C7367l c7367l = c6998l.f12253a;
            synchronized (c7367l) {
                i = c7367l.f13781e * c7367l.f13778b;
            }
            if (i >= c6998l.f12260h) {
                z = true;
            } else {
                z = false;
            }
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            long j3 = c6998l.f12255c;
            long j4 = c6998l.f12254b;
            if (i2 > 0) {
                j4 = Math.min(C7408g0.m5093m(j4, f), j3);
            }
            if (j < Math.max(j4, 500000L)) {
                boolean z4 = !z;
                c6998l.f12261i = z4;
                if (!z4 && j < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (j >= j3 || z) {
                c6998l.f12261i = false;
            }
            z2 = c6998l.f12261i;
        }
        this.f12195C = z2;
        if (z2) {
            C7135r0 c7135r03 = c7310u0.f13491j;
            long j5 = this.f12203K;
            if (c7135r03.f12685l != null) {
                z3 = false;
            }
            C7394a.m5131d(z3);
            c7135r03.f12674a.mo5405g(j5 - c7135r03.f12688o);
        }
        m5646d0();
    }

    /* renamed from: u */
    public final void m5625u() {
        boolean z;
        C6993d c6993d = this.f12230x;
        C7508z0 c7508z0 = this.f12229w;
        boolean z2 = c6993d.f12237a;
        if (c6993d.f12238b != c7508z0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        c6993d.f12237a = z3;
        c6993d.f12238b = c7508z0;
        if (z3) {
            C6968g0 c6968g0 = (C6968g0) ((C6558q) this.f12223q).f10359b;
            c6968g0.getClass();
            c6968g0.f12045f.mo5069d(new RunnableC7442v(0, c6968g0, c6993d));
            this.f12230x = new C6993d(this.f12229w);
        }
    }

    /* renamed from: v */
    public final void m5624v() throws ExoPlaybackException {
        m5633m(this.f12225s.m4889b(), true);
    }

    /* renamed from: w */
    public final void m5623w(C6991b c6991b) throws ExoPlaybackException {
        boolean z = true;
        this.f12230x.m5619a(1);
        c6991b.getClass();
        C7500x0 c7500x0 = this.f12225s;
        c7500x0.getClass();
        if (c7500x0.f14227a.size() < 0) {
            z = false;
        }
        C7394a.m5134a(z);
        c7500x0.f14235i = null;
        m5633m(c7500x0.m4889b(), false);
    }

    /* renamed from: x */
    public final void m5622x() {
        int i;
        this.f12230x.m5619a(1);
        int i2 = 0;
        m5675C(false, false, false, true);
        this.f12211e.m5617b(false);
        if (this.f12229w.f14256a.m5685p()) {
            i = 4;
        } else {
            i = 2;
        }
        m5654X(i);
        C7369n mo5165d = this.f12212f.mo5165d();
        C7500x0 c7500x0 = this.f12225s;
        C7394a.m5131d(!c7500x0.f14236j);
        c7500x0.f14237k = mo5165d;
        while (true) {
            ArrayList arrayList = c7500x0.f14227a;
            if (i2 < arrayList.size()) {
                C7500x0.C7503c c7503c = (C7500x0.C7503c) arrayList.get(i2);
                c7500x0.m4886e(c7503c);
                c7500x0.f14234h.add(c7503c);
                i2++;
            } else {
                c7500x0.f14236j = true;
                this.f12213g.mo5064i(2);
                return;
            }
        }
    }

    /* renamed from: y */
    public final synchronized boolean m5621y() {
        if (!this.f12231y && this.f12214h.isAlive()) {
            this.f12213g.mo5064i(7);
            m5638h0(new C6975h0(this), this.f12227u);
            return this.f12231y;
        }
        return true;
    }

    /* renamed from: z */
    public final void m5620z() {
        m5675C(true, false, true, false);
        this.f12211e.m5617b(true);
        m5654X(1);
        this.f12214h.quit();
        synchronized (this) {
            this.f12231y = true;
            notifyAll();
        }
    }
}
