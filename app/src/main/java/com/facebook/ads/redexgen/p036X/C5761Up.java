package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Up */
/* loaded from: assets/audience_network.dex */
public final class C5761Up implements InterfaceC4954Hd {
    public final int A00;
    @Nullable
    public final InterfaceC4952Hb A01;
    public final InterfaceC4954Hd A02;
    public final InterfaceC4954Hd A03;
    public final InterfaceC4981I4 A04;
    @Nullable
    public final InterfaceC4983I6 A05;

    public C5761Up(InterfaceC4981I4 interfaceC4981I4, InterfaceC4954Hd interfaceC4954Hd, InterfaceC4954Hd interfaceC4954Hd2, InterfaceC4952Hb interfaceC4952Hb, int i, InterfaceC4983I6 interfaceC4983I6) {
        this.A04 = interfaceC4981I4;
        this.A03 = interfaceC4954Hd;
        this.A02 = interfaceC4954Hd2;
        this.A01 = interfaceC4952Hb;
        this.A00 = i;
        this.A05 = interfaceC4983I6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4954Hd
    /* renamed from: A00 */
    public final C5762Uq A4E() {
        InterfaceC4981I4 interfaceC4981I4 = this.A04;
        InterfaceC4955He A4E = this.A03.A4E();
        InterfaceC4955He A4E2 = this.A02.A4E();
        InterfaceC4952Hb interfaceC4952Hb = this.A01;
        return new C5762Uq(interfaceC4981I4, A4E, A4E2, interfaceC4952Hb != null ? interfaceC4952Hb.createDataSink() : null, this.A00, this.A05);
    }
}
