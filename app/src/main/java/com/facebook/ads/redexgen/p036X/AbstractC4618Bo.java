package com.facebook.ads.redexgen.p036X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.Bo */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4618Bo implements InterfaceC5800VS {
    public static String[] A06 = {"xrToQ1M30eypgaiDt2KcbeXQSJmH4zEy", "FOMm0GJvPogulFgRKU73d9QQGInBRxBZ", "DAifx7fz7Oznb", "tEspMkbIuGZVzgapMfnbK02RMeMH6P5b", "hnmT", "jbKY175w2AZdEkpyONR9SNFucMTvW6Vd", "vt70xpgsPpIXmuxmiV", "wsDuhCL"};
    public long A00;
    public long A01;
    public C409030 A02;
    public final ArrayDeque<C409030> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC4619Bp> A04;
    public final PriorityQueue<C409030> A05;

    public abstract InterfaceC4889GY A0L();

    public abstract void A0P(C4627Bx c4627Bx);

    public abstract boolean A0R();

    public AbstractC4618Bo() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C409030());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.add(new C40892z(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C409030 c409030) {
        c409030.A07();
        this.A03.add(c409030);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4625Bv
    /* renamed from: A0M */
    public C4627Bx A4k() throws C4890GZ {
        C4997IK.A04(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4625Bv
    /* renamed from: A0N */
    public AbstractC4619Bp A4l() throws C4890GZ {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C5895X2) this.A05.peek()).A00 <= this.A00) {
            C409030 poll = this.A05.poll();
            if (poll.A04()) {
                AbstractC4619Bp pollFirst = this.A04.pollFirst();
                pollFirst.A00(4);
                if (A06[6].length() != 18) {
                    throw new RuntimeException();
                }
                A06[4] = "hAEA";
                A0K(poll);
                return pollFirst;
            }
            A0P(poll);
            if (A0R()) {
                InterfaceC4889GY A0L = A0L();
                if (!poll.A03()) {
                    AbstractC4619Bp pollFirst2 = this.A04.pollFirst();
                    pollFirst2.A09(((C5895X2) poll).A00, A0L, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst2;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4625Bv
    /* renamed from: A0O */
    public void ADW(C4627Bx c4627Bx) throws C4890GZ {
        C4997IK.A03(c4627Bx == this.A02);
        if (c4627Bx.A03()) {
            C409030 c409030 = this.A02;
            String[] strArr = A06;
            if (strArr[5].charAt(10) != strArr[3].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "0mhI93daunZi59PwiuGO0KbLyKVCPwQH";
            strArr2[3] = "r2E3xZENv7Zr1SQt92aJBQoSxSc5nrbU";
            A0K(c409030);
        } else {
            C409030 c4090302 = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            c4090302.A00 = j;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC4619Bp abstractC4619Bp) {
        abstractC4619Bp.A07();
        this.A04.add(abstractC4619Bp);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4625Bv
    public void ADm() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5800VS
    public void AEg(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4625Bv
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        C409030 c409030 = this.A02;
        if (c409030 != null) {
            A0K(c409030);
            this.A02 = null;
        }
    }
}
