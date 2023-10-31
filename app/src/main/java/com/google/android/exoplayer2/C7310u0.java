package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.analytics.C6642d0;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.C7394a;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.C7998n0;

/* renamed from: com.google.android.exoplayer2.u0 */
/* loaded from: classes.dex */
public final class C7310u0 {

    /* renamed from: a */
    public final AbstractC6984j1.C6986b f13482a = new AbstractC6984j1.C6986b();

    /* renamed from: b */
    public final AbstractC6984j1.C6987c f13483b = new AbstractC6984j1.C6987c();
    @Nullable

    /* renamed from: c */
    public final C6642d0 f13484c;

    /* renamed from: d */
    public final Handler f13485d;

    /* renamed from: e */
    public long f13486e;

    /* renamed from: f */
    public int f13487f;

    /* renamed from: g */
    public boolean f13488g;
    @Nullable

    /* renamed from: h */
    public C7135r0 f13489h;
    @Nullable

    /* renamed from: i */
    public C7135r0 f13490i;
    @Nullable

    /* renamed from: j */
    public C7135r0 f13491j;

    /* renamed from: k */
    public int f13492k;
    @Nullable

    /* renamed from: l */
    public Object f13493l;

    /* renamed from: m */
    public long f13494m;

    public C7310u0(@Nullable C6642d0 c6642d0, Handler handler) {
        this.f13484c = c6642d0;
        this.f13485d = handler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
        if (r8 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[LOOP:0: B:3:0x0011->B:20:0x003c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003f A[EDGE_INSN: B:43:0x003f->B:21:0x003f ?: BREAK  , SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.source.InterfaceC7188p.C7189a m5240m(com.google.android.exoplayer2.AbstractC6984j1 r14, java.lang.Object r15, long r16, long r18, com.google.android.exoplayer2.AbstractC6984j1.C6986b r20) {
        /*
            r1 = r15
            r2 = r16
            r0 = r14
            r4 = r20
            r14.mo5689g(r15, r4)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r4.f12158g
            long r5 = r4.f12155d
            int r7 = r0.f12769b
            r8 = 1
            int r7 = r7 - r8
        L11:
            r9 = 0
            if (r7 < 0) goto L3f
            r10 = -9223372036854775808
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 != 0) goto L1b
            goto L39
        L1b:
            com.google.android.exoplayer2.source.ads.AdPlaybackState$a r12 = r0.m5472a(r7)
            long r12 = r12.f12774a
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 != 0) goto L33
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 == 0) goto L37
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 >= 0) goto L39
            goto L37
        L33:
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r10 >= 0) goto L39
        L37:
            r10 = r8
            goto L3a
        L39:
            r10 = r9
        L3a:
            if (r10 == 0) goto L3f
            int r7 = r7 + (-1)
            goto L11
        L3f:
            r5 = -1
            if (r7 < 0) goto L5e
            com.google.android.exoplayer2.source.ads.AdPlaybackState$a r0 = r0.m5472a(r7)
            int r6 = r0.f12775b
            if (r6 != r5) goto L4b
            goto L5b
        L4b:
            r10 = r9
        L4c:
            if (r10 >= r6) goto L5a
            int[] r11 = r0.f12777d
            r11 = r11[r10]
            if (r11 == 0) goto L5b
            if (r11 != r8) goto L57
            goto L5b
        L57:
            int r10 = r10 + 1
            goto L4c
        L5a:
            r8 = r9
        L5b:
            if (r8 == 0) goto L5e
            goto L5f
        L5e:
            r7 = r5
        L5f:
            if (r7 != r5) goto L6d
            int r0 = r4.m5683b(r2)
            com.google.android.exoplayer2.source.p$a r2 = new com.google.android.exoplayer2.source.p$a
            r5 = r18
            r2.<init>(r15, r5, r0)
            return r2
        L6d:
            r5 = r18
            int r3 = r4.m5682c(r7)
            com.google.android.exoplayer2.source.p$a r8 = new com.google.android.exoplayer2.source.p$a
            r0 = r8
            r1 = r15
            r2 = r7
            r4 = r18
            r0.<init>(r1, r2, r3, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C7310u0.m5240m(com.google.android.exoplayer2.j1, java.lang.Object, long, long, com.google.android.exoplayer2.j1$b):com.google.android.exoplayer2.source.p$a");
    }

    @Nullable
    /* renamed from: a */
    public final C7135r0 m5252a() {
        C7135r0 c7135r0 = this.f13489h;
        if (c7135r0 == null) {
            return null;
        }
        if (c7135r0 == this.f13490i) {
            this.f13490i = c7135r0.f12685l;
        }
        c7135r0.m5495f();
        int i = this.f13492k - 1;
        this.f13492k = i;
        if (i == 0) {
            this.f13491j = null;
            C7135r0 c7135r02 = this.f13489h;
            this.f13493l = c7135r02.f12675b;
            this.f13494m = c7135r02.f12679f.f12689a.f12931d;
        }
        this.f13489h = this.f13489h.f12685l;
        m5243j();
        return this.f13489h;
    }

    /* renamed from: b */
    public final void m5251b() {
        if (this.f13492k == 0) {
            return;
        }
        C7135r0 c7135r0 = this.f13489h;
        C7394a.m5130e(c7135r0);
        this.f13493l = c7135r0.f12675b;
        this.f13494m = c7135r0.f12679f.f12689a.f12931d;
        while (c7135r0 != null) {
            c7135r0.m5495f();
            c7135r0 = c7135r0.f12685l;
        }
        this.f13489h = null;
        this.f13491j = null;
        this.f13490i = null;
        this.f13492k = 0;
        m5243j();
    }

    @Nullable
    /* renamed from: c */
    public final C7137s0 m5250c(AbstractC6984j1 abstractC6984j1, C7135r0 c7135r0, long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        C7137s0 c7137s0 = c7135r0.f12679f;
        long j6 = (c7135r0.f12688o + c7137s0.f12693e) - j;
        long j7 = 0;
        boolean z = c7137s0.f12695g;
        AbstractC6984j1.C6986b c6986b = this.f13482a;
        InterfaceC7188p.C7189a c7189a = c7137s0.f12689a;
        if (z) {
            int m5690d = abstractC6984j1.m5690d(abstractC6984j1.mo5414b(c7189a.f12928a), this.f13482a, this.f13483b, this.f13487f, this.f13488g);
            if (m5690d == -1) {
                return null;
            }
            int i = abstractC6984j1.mo5413f(m5690d, c6986b, true).f12154c;
            Object obj = c6986b.f12153b;
            if (abstractC6984j1.m5686m(i, this.f13483b).f12175o == m5690d) {
                Pair<Object, Long> m5687j = abstractC6984j1.m5687j(this.f13483b, this.f13482a, i, -9223372036854775807L, Math.max(0L, j6));
                if (m5687j == null) {
                    return null;
                }
                obj = m5687j.first;
                long longValue = ((Long) m5687j.second).longValue();
                C7135r0 c7135r02 = c7135r0.f12685l;
                if (c7135r02 != null && c7135r02.f12675b.equals(obj)) {
                    j4 = c7135r02.f12679f.f12689a.f12931d;
                } else {
                    j4 = this.f13486e;
                    this.f13486e = 1 + j4;
                }
                j5 = longValue;
                j7 = -9223372036854775807L;
            } else {
                j4 = c7189a.f12931d;
                j5 = 0;
            }
            return m5249d(abstractC6984j1, m5240m(abstractC6984j1, obj, j5, j4, this.f13482a), j7, j5);
        }
        abstractC6984j1.mo5689g(c7189a.f12928a, c6986b);
        boolean m5394a = c7189a.m5394a();
        Object obj2 = c7189a.f12928a;
        if (m5394a) {
            int i2 = c7189a.f12929b;
            int i3 = c6986b.f12158g.m5472a(i2).f12775b;
            if (i3 == -1) {
                return null;
            }
            int m5471a = c6986b.f12158g.m5472a(i2).m5471a(c7189a.f12930c);
            if (m5471a < i3) {
                return m5248e(abstractC6984j1, c7189a.f12928a, i2, m5471a, c7137s0.f12691c, c7189a.f12931d);
            }
            long j8 = c7137s0.f12691c;
            if (j8 == -9223372036854775807L) {
                Pair<Object, Long> m5687j2 = abstractC6984j1.m5687j(this.f13483b, c6986b, c6986b.f12154c, -9223372036854775807L, Math.max(0L, j6));
                if (m5687j2 == null) {
                    return null;
                }
                j8 = ((Long) m5687j2.second).longValue();
            }
            abstractC6984j1.mo5689g(obj2, c6986b);
            AdPlaybackState adPlaybackState = c6986b.f12158g;
            int i4 = c7189a.f12929b;
            long j9 = adPlaybackState.m5472a(i4).f12774a;
            if (j9 == Long.MIN_VALUE) {
                j3 = c6986b.f12155d;
            } else {
                j3 = c6986b.f12158g.m5472a(i4).f12779f + j9;
            }
            return m5247f(abstractC6984j1, c7189a.f12928a, Math.max(j3, j8), c7137s0.f12691c, c7189a.f12931d);
        }
        int i5 = c7189a.f12932e;
        int m5682c = c6986b.m5682c(i5);
        if (m5682c == c6986b.f12158g.m5472a(i5).f12775b) {
            abstractC6984j1.mo5689g(obj2, c6986b);
            long j10 = c6986b.f12158g.m5472a(i5).f12774a;
            if (j10 == Long.MIN_VALUE) {
                j2 = c6986b.f12155d;
            } else {
                j2 = j10 + c6986b.f12158g.m5472a(i5).f12779f;
            }
            return m5247f(abstractC6984j1, c7189a.f12928a, j2, c7137s0.f12693e, c7189a.f12931d);
        }
        return m5248e(abstractC6984j1, c7189a.f12928a, c7189a.f12932e, m5682c, c7137s0.f12693e, c7189a.f12931d);
    }

    @Nullable
    /* renamed from: d */
    public final C7137s0 m5249d(AbstractC6984j1 abstractC6984j1, InterfaceC7188p.C7189a c7189a, long j, long j2) {
        abstractC6984j1.mo5689g(c7189a.f12928a, this.f13482a);
        boolean m5394a = c7189a.m5394a();
        Object obj = c7189a.f12928a;
        return m5394a ? m5248e(abstractC6984j1, obj, c7189a.f12929b, c7189a.f12930c, j, c7189a.f12931d) : m5247f(abstractC6984j1, obj, j2, j, c7189a.f12931d);
    }

    /* renamed from: e */
    public final C7137s0 m5248e(AbstractC6984j1 abstractC6984j1, Object obj, int i, int i2, long j, long j2) {
        long j3;
        long j4;
        InterfaceC7188p.C7189a c7189a = new InterfaceC7188p.C7189a(obj, i, i2, j2);
        AbstractC6984j1.C6986b c6986b = this.f13482a;
        long m5684a = abstractC6984j1.mo5689g(obj, c6986b).m5684a(i, i2);
        if (i2 == c6986b.m5682c(i)) {
            j3 = c6986b.f12158g.f12770c;
        } else {
            j3 = 0;
        }
        boolean m5681d = c6986b.m5681d(i);
        if (m5684a != -9223372036854775807L && j3 >= m5684a) {
            j4 = Math.max(0L, m5684a - 1);
        } else {
            j4 = j3;
        }
        return new C7137s0(c7189a, j4, j, -9223372036854775807L, m5684a, m5681d, false, false, false);
    }

    /* renamed from: f */
    public final C7137s0 m5247f(AbstractC6984j1 abstractC6984j1, Object obj, long j, long j2, long j3) {
        boolean z;
        boolean z2;
        long j4;
        long j5;
        long j6 = j;
        AbstractC6984j1.C6986b c6986b = this.f13482a;
        abstractC6984j1.mo5689g(obj, c6986b);
        int m5683b = c6986b.m5683b(j6);
        InterfaceC7188p.C7189a c7189a = new InterfaceC7188p.C7189a(obj, j3, m5683b);
        if (!c7189a.m5394a() && m5683b == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean m5244i = m5244i(abstractC6984j1, c7189a);
        boolean m5245h = m5245h(abstractC6984j1, c7189a, z);
        if (m5683b != -1 && c6986b.m5681d(m5683b)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m5683b != -1) {
            j4 = c6986b.f12158g.m5472a(m5683b).f12774a;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L && j4 != Long.MIN_VALUE) {
            j5 = j4;
        } else {
            j5 = c6986b.f12155d;
        }
        if (j5 != -9223372036854775807L && j6 >= j5) {
            j6 = Math.max(0L, j5 - 1);
        }
        return new C7137s0(c7189a, j6, j2, j4, j5, z2, z, m5244i, m5245h);
    }

    /* renamed from: g */
    public final C7137s0 m5246g(AbstractC6984j1 abstractC6984j1, C7137s0 c7137s0) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        InterfaceC7188p.C7189a c7189a = c7137s0.f12689a;
        if (!c7189a.m5394a() && c7189a.f12932e == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean m5244i = m5244i(abstractC6984j1, c7189a);
        boolean m5245h = m5245h(abstractC6984j1, c7189a, z);
        Object obj = c7137s0.f12689a.f12928a;
        AbstractC6984j1.C6986b c6986b = this.f13482a;
        abstractC6984j1.mo5689g(obj, c6986b);
        boolean m5394a = c7189a.m5394a();
        int i = c7189a.f12932e;
        if (!m5394a && i != -1) {
            j = c6986b.f12158g.m5472a(i).f12774a;
        } else {
            j = -9223372036854775807L;
        }
        boolean m5394a2 = c7189a.m5394a();
        int i2 = c7189a.f12929b;
        if (m5394a2) {
            j2 = c6986b.m5684a(i2, c7189a.f12930c);
        } else if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            j2 = j;
        } else {
            j2 = c6986b.f12155d;
        }
        if (c7189a.m5394a()) {
            z2 = c6986b.m5681d(i2);
        } else if (i != -1 && c6986b.m5681d(i)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new C7137s0(c7189a, c7137s0.f12690b, c7137s0.f12691c, j, j2, z2, z, m5244i, m5245h);
    }

    /* renamed from: h */
    public final boolean m5245h(AbstractC6984j1 abstractC6984j1, InterfaceC7188p.C7189a c7189a, boolean z) {
        boolean z2;
        int mo5414b = abstractC6984j1.mo5414b(c7189a.f12928a);
        if (abstractC6984j1.m5686m(abstractC6984j1.mo5413f(mo5414b, this.f13482a, false).f12154c, this.f13483b).f12169i) {
            return false;
        }
        if (abstractC6984j1.m5690d(mo5414b, this.f13482a, this.f13483b, this.f13487f, this.f13488g) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m5244i(AbstractC6984j1 abstractC6984j1, InterfaceC7188p.C7189a c7189a) {
        boolean z;
        if (!c7189a.m5394a() && c7189a.f12932e == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        Object obj = c7189a.f12928a;
        if (abstractC6984j1.m5686m(abstractC6984j1.mo5689g(obj, this.f13482a).f12154c, this.f13483b).f12176p == abstractC6984j1.mo5414b(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m5243j() {
        final InterfaceC7188p.C7189a c7189a;
        if (this.f13484c != null) {
            AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
            final AbstractC8013s.C8014a c8014a = new AbstractC8013s.C8014a();
            for (C7135r0 c7135r0 = this.f13489h; c7135r0 != null; c7135r0 = c7135r0.f12685l) {
                c8014a.m4242b(c7135r0.f12679f.f12689a);
            }
            C7135r0 c7135r02 = this.f13490i;
            if (c7135r02 == null) {
                c7189a = null;
            } else {
                c7189a = c7135r02.f12679f.f12689a;
            }
            this.f13485d.post(new Runnable() { // from class: com.google.android.exoplayer2.t0
                @Override // java.lang.Runnable
                public final void run() {
                    C7310u0 c7310u0 = C7310u0.this;
                    c7310u0.getClass();
                    C7998n0 m4241c = c8014a.m4241c();
                    C6642d0 c6642d0 = c7310u0.f13484c;
                    Player player = c6642d0.f10577f;
                    player.getClass();
                    C6642d0.C6643a c6643a = c6642d0.f10574c;
                    c6643a.getClass();
                    c6643a.f10581b = AbstractC8013s.m4246p(m4241c);
                    if (!m4241c.isEmpty()) {
                        c6643a.f10584e = (InterfaceC7188p.C7189a) m4241c.get(0);
                        InterfaceC7188p.C7189a c7189a2 = c7189a;
                        c7189a2.getClass();
                        c6643a.f10585f = c7189a2;
                    }
                    if (c6643a.f10583d == null) {
                        c6643a.f10583d = C6642d0.C6643a.m6135b(player, c6643a.f10581b, c6643a.f10584e, c6643a.f10580a);
                    }
                    c6643a.m6133d(player.mo5762G());
                }
            });
        }
    }

    /* renamed from: k */
    public final boolean m5242k(C7135r0 c7135r0) {
        boolean z;
        boolean z2 = false;
        if (c7135r0 != null) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        if (c7135r0.equals(this.f13491j)) {
            return false;
        }
        this.f13491j = c7135r0;
        while (true) {
            c7135r0 = c7135r0.f12685l;
            if (c7135r0 == null) {
                break;
            }
            if (c7135r0 == this.f13490i) {
                this.f13490i = this.f13489h;
                z2 = true;
            }
            c7135r0.m5495f();
            this.f13492k--;
        }
        C7135r0 c7135r02 = this.f13491j;
        if (c7135r02.f12685l != null) {
            c7135r02.m5499b();
            c7135r02.f12685l = null;
            c7135r02.m5498c();
        }
        m5243j();
        return z2;
    }

    /* renamed from: l */
    public final InterfaceC7188p.C7189a m5241l(AbstractC6984j1 abstractC6984j1, Object obj, long j) {
        long j2;
        int mo5414b;
        AbstractC6984j1.C6986b c6986b = this.f13482a;
        int i = abstractC6984j1.mo5689g(obj, c6986b).f12154c;
        Object obj2 = this.f13493l;
        if (obj2 != null && (mo5414b = abstractC6984j1.mo5414b(obj2)) != -1 && abstractC6984j1.mo5413f(mo5414b, c6986b, false).f12154c == i) {
            j2 = this.f13494m;
        } else {
            C7135r0 c7135r0 = this.f13489h;
            while (true) {
                if (c7135r0 != null) {
                    if (c7135r0.f12675b.equals(obj)) {
                        break;
                    }
                    c7135r0 = c7135r0.f12685l;
                } else {
                    c7135r0 = this.f13489h;
                    while (c7135r0 != null) {
                        int mo5414b2 = abstractC6984j1.mo5414b(c7135r0.f12675b);
                        if (mo5414b2 == -1 || abstractC6984j1.mo5413f(mo5414b2, c6986b, false).f12154c != i) {
                            c7135r0 = c7135r0.f12685l;
                        }
                    }
                    j2 = this.f13486e;
                    this.f13486e = 1 + j2;
                    if (this.f13489h == null) {
                        this.f13493l = obj;
                        this.f13494m = j2;
                    }
                }
            }
            j2 = c7135r0.f12679f.f12689a.f12931d;
        }
        return m5240m(abstractC6984j1, obj, j, j2, this.f13482a);
    }

    /* renamed from: n */
    public final boolean m5239n(AbstractC6984j1 abstractC6984j1) {
        C7135r0 c7135r0;
        C7135r0 c7135r02 = this.f13489h;
        if (c7135r02 == null) {
            return true;
        }
        int mo5414b = abstractC6984j1.mo5414b(c7135r02.f12675b);
        while (true) {
            mo5414b = abstractC6984j1.m5690d(mo5414b, this.f13482a, this.f13483b, this.f13487f, this.f13488g);
            while (true) {
                c7135r0 = c7135r02.f12685l;
                if (c7135r0 == null || c7135r02.f12679f.f12695g) {
                    break;
                }
                c7135r02 = c7135r0;
            }
            if (mo5414b == -1 || c7135r0 == null || abstractC6984j1.mo5414b(c7135r0.f12675b) != mo5414b) {
                break;
            }
            c7135r02 = c7135r0;
        }
        boolean m5242k = m5242k(c7135r02);
        c7135r02.f12679f = m5246g(abstractC6984j1, c7135r02.f12679f);
        return !m5242k;
    }

    /* renamed from: o */
    public final boolean m5238o(AbstractC6984j1 abstractC6984j1, long j, long j2) {
        boolean m5242k;
        boolean z;
        C7137s0 c7137s0;
        boolean z2;
        long j3;
        boolean z3;
        C7135r0 c7135r0 = null;
        for (C7135r0 c7135r02 = this.f13489h; c7135r02 != null; c7135r02 = c7135r02.f12685l) {
            C7137s0 c7137s02 = c7135r02.f12679f;
            if (c7135r0 == null) {
                c7137s0 = m5246g(abstractC6984j1, c7137s02);
            } else {
                C7137s0 m5250c = m5250c(abstractC6984j1, c7135r0, j);
                if (m5250c == null) {
                    m5242k = m5242k(c7135r0);
                } else {
                    if (c7137s02.f12690b == m5250c.f12690b && c7137s02.f12689a.equals(m5250c.f12689a)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        m5242k = m5242k(c7135r0);
                    } else {
                        c7137s0 = m5250c;
                    }
                }
                return !m5242k;
            }
            c7135r02.f12679f = c7137s0.m5490a(c7137s02.f12691c);
            long j4 = c7137s02.f12693e;
            int i = (j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1));
            long j5 = c7137s0.f12693e;
            if (i != 0 && j4 != j5) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                c7135r02.m5493h();
                if (j5 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = c7135r02.f12688o + j5;
                }
                if (c7135r02 == this.f13490i && !c7135r02.f12679f.f12694f && (j2 == Long.MIN_VALUE || j2 >= j3)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!m5242k(c7135r02) && !z3) {
                    return true;
                }
                return false;
            }
            c7135r0 = c7135r02;
        }
        return true;
    }
}
