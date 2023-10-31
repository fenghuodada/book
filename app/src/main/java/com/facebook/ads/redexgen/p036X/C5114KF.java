package com.facebook.ads.redexgen.p036X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.KF */
/* loaded from: assets/audience_network.dex */
public final class C5114KF {
    public final InterfaceC5112KD A0B;
    public final boolean A0F;
    public final String A0C = C5114KF.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C5113KE> A0D = new LinkedList();

    public C5114KF(C44148U c44148u, InterfaceC5112KD interfaceC5112KD) {
        int A0D = C5066JT.A0D(c44148u);
        if (A0D < 1) {
            this.A0F = false;
        } else {
            double sessionRandom = A0D;
            this.A0F = c44148u.A07().A00() < 1.0d / sessionRandom;
        }
        this.A0B = interfaceC5112KD;
    }

    private int A00() {
        return this.A0B.A6E();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C5113KE c5113ke) {
        synchronized (this.A0D) {
            this.A0D.add(c5113ke);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new C5113KE(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new C5113KE(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new C5113KE(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new C5113KE(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new C5113KE(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new C5113KE(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new C5113KE(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new C5113KE(A01(), 102, A00(), null));
    }

    public final void A0C(C44148U c44148u, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new C5113KE(A01(), 103, A00(), null));
        ExecutorC5250MX.A06.execute(new RunnableC5111KC(this, str, c44148u));
    }
}
