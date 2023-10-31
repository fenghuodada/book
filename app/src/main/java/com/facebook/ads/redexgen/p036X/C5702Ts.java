package com.facebook.ads.redexgen.p036X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Ts */
/* loaded from: assets/audience_network.dex */
public class C5702Ts extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C5202Ll A00;

    public C5702Ts(C5202Ll c5202Ll) {
        this.A00 = c5202Ll;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        Handler handler;
        if (this.A00.A05()) {
            this.A00.A01();
            handler = this.A00.A03;
            handler.postDelayed(this, 250L);
        }
    }
}
