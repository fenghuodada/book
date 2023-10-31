package com.facebook.ads.redexgen.p036X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Rl */
/* loaded from: assets/audience_network.dex */
public class C5572Rl extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C5483QK A00;

    public C5572Rl(C5483QK c5483qk) {
        this.A00 = c5483qk;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        boolean z;
        C44829b c44829b;
        Handler handler;
        int i;
        z = this.A00.A03;
        if (!z) {
            c44829b = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c44829b.A02(new AbstractC5292NE(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.84
            });
            handler = this.A00.A07;
            i = this.A00.A00;
            handler.postDelayed(this, i);
        }
    }
}
