package com.facebook.ads.redexgen.p036X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.7z */
/* loaded from: assets/audience_network.dex */
public class C43897z extends AbstractC5137Ke {
    public final /* synthetic */ C5130KX A00;

    public C43897z(C5130KX c5130kx) {
        this.A00 = c5130kx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    /* renamed from: A00 */
    public final void A03(C5148Kp c5148Kp) {
        C5483QK c5483qk;
        boolean z;
        Handler handler;
        boolean A0D;
        boolean z2;
        Handler handler2;
        int i;
        c5483qk = this.A00.A01;
        if (c5483qk == null) {
            return;
        }
        z = this.A00.A03;
        if (z || c5148Kp.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0D = this.A00.A0D(EnumC5491QS.A05);
        if (A0D) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        z2 = this.A00.A02;
        if (!z2) {
            return;
        }
        handler2 = this.A00.A05;
        C5131KY c5131ky = new C5131KY(this);
        i = this.A00.A00;
        handler2.postDelayed(c5131ky, i);
    }
}
