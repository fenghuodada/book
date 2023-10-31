package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.di */
/* loaded from: assets/audience_network.dex */
public class C6306di implements InterfaceC42535f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C6301dd A01;
    public final /* synthetic */ C6301dd A02;
    public final /* synthetic */ C44649I A03;

    public C6306di(C6301dd c6301dd, int i, C44649I c44649i, C6301dd c6301dd2) {
        this.A01 = c6301dd;
        this.A00 = i;
        this.A03 = c44649i;
        this.A02 = c6301dd2;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42535f
    public final void AA1() {
        this.A01.A0B(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42535f
    public final void AA2() {
        InterfaceC39620v interfaceC39620v;
        interfaceC39620v = this.A01.A00;
        interfaceC39620v.ABC(this.A02, C5115KH.A00(AdErrorType.NO_FILL));
    }
}
