package com.google.android.exoplayer2;

import com.google.android.exoplayer2.AbstractC6984j1;

/* renamed from: com.google.android.exoplayer2.g */
/* loaded from: classes.dex */
public abstract class AbstractC6967g implements Player {

    /* renamed from: a */
    public final AbstractC6984j1.C6987c f12034a = new AbstractC6984j1.C6987c();

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: A */
    public final boolean mo5791A(int i) {
        return mo5721z().f10540a.f13916a.get(i);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: K */
    public final void mo5790K() {
        boolean z;
        if (!mo5762G().m5685p() && !mo5746d()) {
            boolean z2 = true;
            if (m5782a() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int m5782a = m5782a();
                if (m5782a != -1) {
                    mo5742f(m5782a, -9223372036854775807L);
                }
            } else if (m5787R()) {
                AbstractC6984j1 mo5762G = mo5762G();
                if (mo5762G.m5685p() || !mo5762G.m5686m(mo5730p(), this.f12034a).f12169i) {
                    z2 = false;
                }
                if (z2) {
                    mo5742f(mo5730p(), -9223372036854775807L);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: L */
    public final void mo5789L() {
        m5784U(mo5728s());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: O */
    public final void mo5788O() {
        m5784U(-mo5755Q());
    }

    /* renamed from: R */
    public final boolean m5787R() {
        AbstractC6984j1 mo5762G = mo5762G();
        return !mo5762G.m5685p() && mo5762G.m5686m(mo5730p(), this.f12034a).m5680a();
    }

    /* renamed from: S */
    public final boolean m5786S() {
        AbstractC6984j1 mo5762G = mo5762G();
        return !mo5762G.m5685p() && mo5762G.m5686m(mo5730p(), this.f12034a).f12168h;
    }

    /* renamed from: T */
    public final void m5785T(long j) {
        mo5742f(mo5730p(), j);
    }

    /* renamed from: U */
    public final void m5784U(long j) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        m5785T(Math.max(currentPosition, 0L));
    }

    /* renamed from: V */
    public final void m5783V() {
        int m5781b = m5781b();
        if (m5781b != -1) {
            mo5742f(m5781b, -9223372036854775807L);
        }
    }

    /* renamed from: a */
    public final int m5782a() {
        AbstractC6984j1 mo5762G = mo5762G();
        if (mo5762G.m5685p()) {
            return -1;
        }
        int mo5730p = mo5730p();
        int mo5763F = mo5763F();
        if (mo5763F == 1) {
            mo5763F = 0;
        }
        return mo5762G.mo5423e(mo5730p, mo5763F, mo5760I());
    }

    /* renamed from: b */
    public final int m5781b() {
        AbstractC6984j1 mo5762G = mo5762G();
        if (mo5762G.m5685p()) {
            return -1;
        }
        int mo5730p = mo5730p();
        int mo5763F = mo5763F();
        if (mo5763F == 1) {
            mo5763F = 0;
        }
        return mo5762G.mo5422k(mo5730p, mo5763F, mo5760I());
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlaying() {
        return mo5725v() == 3 && mo5740g() && mo5765D() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r0 <= 3000) goto L13;
     */
    @Override // com.google.android.exoplayer2.Player
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5780q() {
        /*
            r4 = this;
            com.google.android.exoplayer2.j1 r0 = r4.mo5762G()
            boolean r0 = r0.m5685p()
            if (r0 != 0) goto L43
            boolean r0 = r4.mo5746d()
            if (r0 == 0) goto L11
            goto L43
        L11:
            int r0 = r4.m5781b()
            r1 = -1
            if (r0 == r1) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            boolean r1 = r4.m5787R()
            if (r1 == 0) goto L2a
            boolean r1 = r4.m5786S()
            if (r1 != 0) goto L2a
            if (r0 == 0) goto L43
            goto L3a
        L2a:
            if (r0 == 0) goto L3e
            long r0 = r4.getCurrentPosition()
            r4.mo5737i()
            r2 = 3000(0xbb8, float:4.204E-42)
            long r2 = (long) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L3e
        L3a:
            r4.m5783V()
            goto L43
        L3e:
            r0 = 0
            r4.m5785T(r0)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.AbstractC6967g.mo5780q():void");
    }
}
