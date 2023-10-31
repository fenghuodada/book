package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.S8 */
/* loaded from: assets/audience_network.dex */
public class C5595S8 extends AbstractC5520Qv {
    public final /* synthetic */ C44078L A00;

    public C5595S8(C44078L c44078l) {
        this.A00 = c44078l;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5520Qv
    public final void A02() {
        C5237MK c5237mk;
        C5237MK c5237mk2;
        String str;
        C5521Qw c5521Qw;
        C5237MK c5237mk3;
        C6281dJ c6281dJ;
        InterfaceC5080Jh interfaceC5080Jh;
        String str2;
        C5953Xy c5953Xy;
        C6281dJ c6281dJ2;
        c5237mk = this.A00.A0H;
        if (!c5237mk.A07()) {
            C44078L c44078l = this.A00;
            c5237mk2 = c44078l.A0H;
            c44078l.setImpressionRecordingFlag(c5237mk2);
            str = this.A00.A0C;
            if (!TextUtils.isEmpty(str)) {
                C5356OG c5356og = new C5356OG();
                c5521Qw = this.A00.A0B;
                C5356OG A03 = c5356og.A03(c5521Qw);
                c5237mk3 = this.A00.A0H;
                C5356OG A02 = A03.A02(c5237mk3);
                c6281dJ = ((AbstractC5681TW) this.A00).A08;
                Map<String, String> A05 = A02.A04(c6281dJ.A0X()).A05();
                interfaceC5080Jh = ((AbstractC5681TW) this.A00).A0A;
                str2 = this.A00.A0C;
                interfaceC5080Jh.A93(str2, A05);
                c5953Xy = this.A00.A0G;
                c5953Xy.A0D().A2Y();
                c6281dJ2 = this.A00.A04;
                C403829.A00(c6281dJ2.A0W());
            }
        }
    }
}
