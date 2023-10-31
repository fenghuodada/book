package com.facebook.ads.redexgen.p036X;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.facebook.ads.redexgen.X.Ub */
/* loaded from: assets/audience_network.dex */
public class C5747Ub extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C5746Ua A00;

    public C5747Ub(C5746Ua c5746Ua) {
        this.A00 = c5746Ua;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        Runnable runnable;
        this.A00.A0C = false;
        threadPoolExecutor = this.A00.A0B;
        if (threadPoolExecutor.getQueue().isEmpty()) {
            threadPoolExecutor2 = this.A00.A0B;
            runnable = this.A00.A0A;
            threadPoolExecutor2.execute(runnable);
        }
    }
}
