package com.facebook.ads.redexgen.p036X;

import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.Sz */
/* loaded from: assets/audience_network.dex */
public class C5648Sz extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C5366OQ A00;

    public C5648Sz(C5366OQ c5366oq) {
        this.A00 = c5366oq;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        C5366OQ c5366oq = this.A00;
        runnable = c5366oq.A08;
        i = this.A00.A07;
        c5366oq.postOnAnimationDelayed(runnable, i);
    }
}
