package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Tf */
/* loaded from: assets/audience_network.dex */
public class C5689Tf implements InterfaceC5340O0 {
    public final /* synthetic */ InterfaceC5269Mq A00;
    public final /* synthetic */ C5687Td A01;

    public C5689Tf(C5687Td c5687Td, InterfaceC5269Mq interfaceC5269Mq) {
        this.A01 = c5687Td;
        this.A00 = interfaceC5269Mq;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5340O0
    public final void ABg(String str) {
        C5333Nt c5333Nt;
        c5333Nt = this.A01.A0A;
        c5333Nt.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5340O0
    public final void ABi(String str) {
        C5332Ns c5332Ns;
        this.A01.A05 = true;
        c5332Ns = this.A01.A09;
        c5332Ns.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5340O0
    public final void ABz(int i) {
        boolean z;
        C5333Nt c5333Nt;
        z = this.A01.A05;
        if (z) {
            c5333Nt = this.A01.A0A;
            c5333Nt.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5340O0
    public final void AC4(String str) {
        C5332Ns c5332Ns;
        c5332Ns = this.A01.A09;
        c5332Ns.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5340O0
    public final void AC6() {
        this.A00.AAF(14);
    }
}
