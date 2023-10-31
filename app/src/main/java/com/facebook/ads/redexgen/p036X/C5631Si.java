package com.facebook.ads.redexgen.p036X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Si */
/* loaded from: assets/audience_network.dex */
public class C5631Si extends AbstractC5520Qv {
    public final /* synthetic */ C4509A2 A00;

    public C5631Si(C4509A2 c4509a2) {
        this.A00 = c4509a2;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5520Qv
    public final void A02() {
        C5237MK c5237mk;
        C5237MK c5237mk2;
        C5521Qw c5521Qw;
        C5237MK c5237mk3;
        InterfaceC5080Jh interfaceC5080Jh;
        AbstractC397518 abstractC397518;
        C5953Xy c5953Xy;
        AbstractC397518 abstractC3975182;
        InterfaceC5269Mq interfaceC5269Mq;
        InterfaceC5269Mq interfaceC5269Mq2;
        InterfaceC5296NI interfaceC5296NI;
        c5237mk = this.A00.A0B;
        if (!c5237mk.A07()) {
            c5237mk2 = this.A00.A0B;
            c5237mk2.A05();
            C5356OG c5356og = new C5356OG();
            c5521Qw = this.A00.A0H;
            C5356OG A03 = c5356og.A03(c5521Qw);
            c5237mk3 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(c5237mk3).A05();
            interfaceC5080Jh = this.A00.A08;
            abstractC397518 = this.A00.A06;
            interfaceC5080Jh.A93(abstractC397518.A0U(), A05);
            c5953Xy = this.A00.A07;
            c5953Xy.A0D().A2Y();
            abstractC3975182 = this.A00.A06;
            C403829.A00(abstractC3975182.A0W());
            interfaceC5269Mq = this.A00.A0C;
            if (interfaceC5269Mq != null) {
                interfaceC5269Mq2 = this.A00.A0C;
                interfaceC5296NI = this.A00.A0D;
                interfaceC5269Mq2.A3s(interfaceC5296NI.A6m());
            }
        }
    }
}
