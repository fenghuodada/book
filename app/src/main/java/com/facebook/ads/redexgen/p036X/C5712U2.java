package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.U2 */
/* loaded from: assets/audience_network.dex */
public class C5712U2 extends AbstractRunnableC5165L8 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5140Kh A01;
    public final /* synthetic */ C5143Kk A02;
    public final /* synthetic */ String A03;

    public C5712U2(C5143Kk c5143Kk, String str, long j, C5140Kh c5140Kh) {
        this.A02 = c5143Kk;
        this.A03 = str;
        this.A00 = j;
        this.A01 = c5140Kh;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        this.A02.A0M(this.A03, this.A00, this.A01);
    }
}
