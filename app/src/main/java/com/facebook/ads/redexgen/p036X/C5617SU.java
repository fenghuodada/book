package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.SU */
/* loaded from: assets/audience_network.dex */
public class C5617SU extends AbstractC5520Qv {
    public final /* synthetic */ AbstractC5613SQ A00;

    public C5617SU(AbstractC5613SQ abstractC5613SQ) {
        this.A00 = abstractC5613SQ;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5520Qv
    public final void A02() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A01.A0U())) {
                this.A00.A04.A93(this.A00.A01.A0U(), new C5356OG().A03(this.A00.A0A).A02(this.A00.A06).A04(this.A00.A01.A0X()).A05());
                this.A00.A03.A0D().A2Y();
                C403829.A00(this.A00.A01.A0W());
                this.A00.A08.A3s(this.A00.A09.A6m());
            }
        }
    }
}
