package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7500x0;
import com.google.android.exoplayer2.source.C7150c;
import com.google.android.exoplayer2.source.C7166g;
import com.google.android.exoplayer2.source.C7177k;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.source.InterfaceC7185n;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.trackselection.AbstractC7307m;
import com.google.android.exoplayer2.trackselection.C7308n;
import com.google.android.exoplayer2.trackselection.InterfaceC7296g;
import com.google.android.exoplayer2.upstream.C7367l;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7421n;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.exoplayer2.r0 */
/* loaded from: classes.dex */
public final class C7135r0 {

    /* renamed from: a */
    public final InterfaceC7185n f12674a;

    /* renamed from: b */
    public final Object f12675b;

    /* renamed from: c */
    public final SampleStream[] f12676c;

    /* renamed from: d */
    public boolean f12677d;

    /* renamed from: e */
    public boolean f12678e;

    /* renamed from: f */
    public C7137s0 f12679f;

    /* renamed from: g */
    public boolean f12680g;

    /* renamed from: h */
    public final boolean[] f12681h;

    /* renamed from: i */
    public final RendererCapabilities[] f12682i;

    /* renamed from: j */
    public final AbstractC7307m f12683j;

    /* renamed from: k */
    public final C7500x0 f12684k;
    @Nullable

    /* renamed from: l */
    public C7135r0 f12685l;

    /* renamed from: m */
    public C7178k0 f12686m;

    /* renamed from: n */
    public C7308n f12687n;

    /* renamed from: o */
    public long f12688o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.exoplayer2.source.c] */
    public C7135r0(RendererCapabilities[] rendererCapabilitiesArr, long j, AbstractC7307m abstractC7307m, C7367l c7367l, C7500x0 c7500x0, C7137s0 c7137s0, C7308n c7308n) {
        this.f12682i = rendererCapabilitiesArr;
        this.f12688o = j;
        this.f12683j = abstractC7307m;
        this.f12684k = c7500x0;
        InterfaceC7188p.C7189a c7189a = c7137s0.f12689a;
        this.f12675b = c7189a.f12928a;
        this.f12679f = c7137s0;
        this.f12686m = C7178k0.f12904d;
        this.f12687n = c7308n;
        this.f12676c = new SampleStream[rendererCapabilitiesArr.length];
        this.f12681h = new boolean[rendererCapabilitiesArr.length];
        c7500x0.getClass();
        int i = AbstractC6631a.f10551e;
        Pair pair = (Pair) c7189a.f12928a;
        Object obj = pair.first;
        InterfaceC7188p.C7189a m5379b = c7189a.m5379b(pair.second);
        C7500x0.C7503c c7503c = (C7500x0.C7503c) c7500x0.f14229c.get(obj);
        c7503c.getClass();
        c7500x0.f14234h.add(c7503c);
        C7500x0.C7502b c7502b = c7500x0.f14233g.get(c7503c);
        if (c7502b != null) {
            c7502b.f14242a.mo5381m(c7502b.f14243b);
        }
        c7503c.f14247c.add(m5379b);
        C7177k mo5380n = c7503c.f14245a.mo5380n(m5379b, c7367l, c7137s0.f12690b);
        c7500x0.f14228b.put(mo5380n, c7503c);
        c7500x0.m4888c();
        long j2 = c7137s0.f12692d;
        this.f12674a = j2 != -9223372036854775807L ? new C7150c(mo5380n, j2) : mo5380n;
    }

    /* renamed from: a */
    public final long m5500a(C7308n c7308n, long j, boolean z, boolean[] zArr) {
        RendererCapabilities[] rendererCapabilitiesArr;
        SampleStream[] sampleStreamArr;
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= c7308n.f13477a) {
                break;
            }
            if (z || !c7308n.m5254a(this.f12687n, i)) {
                z3 = false;
            }
            this.f12681h[i] = z3;
            i++;
        }
        int i2 = 0;
        while (true) {
            rendererCapabilitiesArr = this.f12682i;
            int length = rendererCapabilitiesArr.length;
            sampleStreamArr = this.f12676c;
            if (i2 >= length) {
                break;
            }
            if (((AbstractC6974h) rendererCapabilitiesArr[i2]).f12126a == 7) {
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
        m5499b();
        this.f12687n = c7308n;
        m5498c();
        long mo5400m = this.f12674a.mo5400m(c7308n.f13479c, this.f12681h, this.f12676c, zArr, j);
        for (int i3 = 0; i3 < rendererCapabilitiesArr.length; i3++) {
            if (((AbstractC6974h) rendererCapabilitiesArr[i3]).f12126a == 7 && this.f12687n.m5253b(i3)) {
                sampleStreamArr[i3] = new C7166g();
            }
        }
        this.f12678e = false;
        for (int i4 = 0; i4 < sampleStreamArr.length; i4++) {
            if (sampleStreamArr[i4] != null) {
                C7394a.m5131d(c7308n.m5253b(i4));
                if (((AbstractC6974h) rendererCapabilitiesArr[i4]).f12126a != 7) {
                    this.f12678e = true;
                }
            } else {
                if (c7308n.f13479c[i4] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C7394a.m5131d(z2);
            }
        }
        return mo5400m;
    }

    /* renamed from: b */
    public final void m5499b() {
        boolean z;
        int i = 0;
        if (this.f12685l == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        while (true) {
            C7308n c7308n = this.f12687n;
            if (i < c7308n.f13477a) {
                boolean m5253b = c7308n.m5253b(i);
                InterfaceC7296g interfaceC7296g = this.f12687n.f13479c[i];
                if (m5253b && interfaceC7296g != null) {
                    interfaceC7296g.mo5266e();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m5498c() {
        boolean z;
        int i = 0;
        if (this.f12685l == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        while (true) {
            C7308n c7308n = this.f12687n;
            if (i < c7308n.f13477a) {
                boolean m5253b = c7308n.m5253b(i);
                InterfaceC7296g interfaceC7296g = this.f12687n.f13479c[i];
                if (m5253b && interfaceC7296g != null) {
                    interfaceC7296g.mo5265g();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final long m5497d() {
        if (this.f12677d) {
            long mo5398q = this.f12678e ? this.f12674a.mo5398q() : Long.MIN_VALUE;
            return mo5398q == Long.MIN_VALUE ? this.f12679f.f12693e : mo5398q;
        }
        return this.f12679f.f12690b;
    }

    /* renamed from: e */
    public final long m5496e() {
        return this.f12679f.f12690b + this.f12688o;
    }

    /* renamed from: f */
    public final void m5495f() {
        m5499b();
        C7500x0 c7500x0 = this.f12684k;
        InterfaceC7185n interfaceC7185n = this.f12674a;
        try {
            if (interfaceC7185n instanceof C7150c) {
                interfaceC7185n = ((C7150c) interfaceC7185n).f12797a;
            }
            IdentityHashMap<InterfaceC7185n, C7500x0.C7503c> identityHashMap = c7500x0.f14228b;
            C7500x0.C7503c remove = identityHashMap.remove(interfaceC7185n);
            remove.getClass();
            remove.f14245a.mo5384j(interfaceC7185n);
            remove.f14247c.remove(((C7177k) interfaceC7185n).f12897a);
            if (!identityHashMap.isEmpty()) {
                c7500x0.m4888c();
            }
            c7500x0.m4887d(remove);
        } catch (RuntimeException e) {
            C7421n.m5056b("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: g */
    public final C7308n m5494g(float f, AbstractC6984j1 abstractC6984j1) throws ExoPlaybackException {
        InterfaceC7296g[] interfaceC7296gArr;
        C7178k0 c7178k0 = this.f12686m;
        InterfaceC7188p.C7189a c7189a = this.f12679f.f12689a;
        C7308n mo5255b = this.f12683j.mo5255b(this.f12682i, c7178k0);
        for (InterfaceC7296g interfaceC7296g : mo5255b.f13479c) {
            if (interfaceC7296g != null) {
                interfaceC7296g.mo5267d();
            }
        }
        return mo5255b;
    }

    /* renamed from: h */
    public final void m5493h() {
        InterfaceC7185n interfaceC7185n = this.f12674a;
        if (interfaceC7185n instanceof C7150c) {
            long j = this.f12679f.f12692d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C7150c c7150c = (C7150c) interfaceC7185n;
            c7150c.f12801e = 0L;
            c7150c.f12802f = j;
        }
    }
}
