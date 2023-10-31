package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.bY */
/* loaded from: assets/audience_network.dex */
public class C6175bY extends AbstractRunnableC5153Kv {
    public final /* synthetic */ C6174bX A00;

    public C6175bY(C6174bX c6174bX) {
        this.A00 = c6174bX;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5153Kv
    public final void A01() {
        C42385Q c42385q;
        C42385Q c42385q2;
        c42385q = this.A00.A01.A00;
        if (c42385q.A00() != null) {
            c42385q2 = this.A00.A01.A00;
            c42385q2.A00().onAdsLoaded();
        }
    }
}
