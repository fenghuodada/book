package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Tg */
/* loaded from: assets/audience_network.dex */
public class C5690Tg implements InterfaceC421957 {
    public final /* synthetic */ C5687Td A00;

    public C5690Tg(C5687Td c5687Td) {
        this.A00 = c5687Td;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC421957
    public final boolean A8M() {
        C5663TE c5663te;
        C5663TE c5663te2;
        c5663te = this.A00.A0B;
        if (c5663te.canGoBack()) {
            c5663te2 = this.A00.A0B;
            c5663te2.goBack();
            return true;
        }
        return false;
    }
}
