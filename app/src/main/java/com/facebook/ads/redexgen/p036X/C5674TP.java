package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.TP */
/* loaded from: assets/audience_network.dex */
public class C5674TP implements InterfaceC5446Pj {
    public final /* synthetic */ C5673TO A00;

    public C5674TP(C5673TO c5673to) {
        this.A00 = c5673to;
    }

    public /* synthetic */ C5674TP(C5673TO c5673to, C5680TV c5680tv) {
        this(c5673to);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5446Pj
    public final void AAQ() {
        this.A00.A0X(true);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5446Pj
    public final void AAz() {
        AbstractC397518 abstractC397518;
        InterfaceC5269Mq interfaceC5269Mq;
        InterfaceC5296NI interfaceC5296NI;
        InterfaceC5080Jh interfaceC5080Jh;
        AbstractC397518 abstractC3975182;
        C5448Pl c5448Pl;
        C5448Pl c5448Pl2;
        AbstractC397518 abstractC3975183;
        C5953Xy c5953Xy;
        abstractC397518 = this.A00.A0D;
        if (!TextUtils.isEmpty(abstractC397518.A0U())) {
            interfaceC5080Jh = this.A00.A0H;
            abstractC3975182 = this.A00.A0D;
            String A0U = abstractC3975182.A0U();
            C5356OG c5356og = new C5356OG();
            c5448Pl = this.A00.A06;
            C5356OG A03 = c5356og.A03(c5448Pl.getViewabilityChecker());
            c5448Pl2 = this.A00.A06;
            interfaceC5080Jh.A93(A0U, A03.A02(c5448Pl2.getTouchDataRecorder()).A05());
            abstractC3975183 = this.A00.A0D;
            C403829.A00(abstractC3975183.A0W());
            c5953Xy = this.A00.A0G;
            c5953Xy.A0D().A2Y();
        }
        interfaceC5269Mq = this.A00.A0L;
        interfaceC5296NI = this.A00.A0M;
        interfaceC5269Mq.A3s(interfaceC5296NI.A6m());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5446Pj
    public final void ABK() {
        InterfaceC5269Mq interfaceC5269Mq;
        InterfaceC5296NI interfaceC5296NI;
        interfaceC5269Mq = this.A00.A0L;
        interfaceC5296NI = this.A00.A0M;
        interfaceC5269Mq.A3s(interfaceC5296NI.A6Z());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5446Pj
    public final void ACu() {
        InterfaceC5269Mq interfaceC5269Mq;
        interfaceC5269Mq = this.A00.A0L;
        interfaceC5269Mq.AAF(15);
    }
}
