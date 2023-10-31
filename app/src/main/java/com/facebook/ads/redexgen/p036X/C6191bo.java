package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.bo */
/* loaded from: assets/audience_network.dex */
public class C6191bo extends AbstractRunnableC5153Kv {
    public final /* synthetic */ C6189bm A00;

    public C6191bo(C6189bm c6189bm) {
        this.A00 = c6189bm;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5153Kv
    public final void A01() {
        C421654 c421654;
        C421654 c4216542;
        C421654 c4216543;
        c421654 = this.A00.A01;
        if (c421654.A06() != null) {
            c4216542 = this.A00.A01;
            AdListener A06 = c4216542.A06();
            c4216543 = this.A00.A01;
            A06.onAdClicked(c4216543.A07());
        }
    }
}
