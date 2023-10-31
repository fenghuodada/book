package com.facebook.ads.redexgen.p036X;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.dm */
/* loaded from: assets/audience_network.dex */
public class C6310dm extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C39610u A00;

    public C6310dm(C39610u c39610u) {
        this.A00 = c39610u;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C39600t c39600t;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c39600t = this.A00.A02;
        c39600t.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
