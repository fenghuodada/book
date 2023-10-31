package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Tr */
/* loaded from: assets/audience_network.dex */
public class C5701Tr implements InterfaceC5225M8 {
    public int A00;
    public final InterfaceC5225M8 A01;
    public final InterfaceC5225M8 A02;

    public C5701Tr(InterfaceC5225M8 interfaceC5225M8, int i, InterfaceC5225M8 interfaceC5225M82) {
        this.A01 = interfaceC5225M8;
        this.A00 = i;
        this.A02 = interfaceC5225M82;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5225M8
    public final void ADK(String str) {
        if (this.A00 > 0) {
            this.A01.ADK(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.ADK(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5225M8
    public final void flush() {
        this.A02.flush();
    }
}
