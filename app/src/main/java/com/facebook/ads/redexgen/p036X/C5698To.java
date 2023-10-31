package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.To */
/* loaded from: assets/audience_network.dex */
public class C5698To implements InterfaceC5225M8 {
    public int A00;
    public final InterfaceC5225M8 A01;

    public C5698To(InterfaceC5225M8 interfaceC5225M8, int i) {
        this.A01 = interfaceC5225M8;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5225M8
    public final void ADK(String str) {
        if (this.A00 > 0) {
            this.A01.ADK(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5225M8
    public final void flush() {
        this.A01.flush();
    }
}
