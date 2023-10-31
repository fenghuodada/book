package com.facebook.ads.redexgen.p036X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.7o */
/* loaded from: assets/audience_network.dex */
public class C43817o extends AbstractC5137Ke {
    public final /* synthetic */ C5126KT A00;

    public C43817o(C5126KT c5126kt) {
        this.A00 = c5126kt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    /* renamed from: A00 */
    public final void A03(C5148Kp c5148Kp) {
        C5483QK c5483qk;
        Handler handler;
        c5483qk = this.A00.A01;
        if (c5483qk == null || c5148Kp.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C5480QH(this));
    }
}
