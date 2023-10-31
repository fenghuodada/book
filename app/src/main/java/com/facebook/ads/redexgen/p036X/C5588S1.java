package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.S1 */
/* loaded from: assets/audience_network.dex */
public class C5588S1 extends AbstractC5520Qv {
    public final /* synthetic */ C44068K A00;

    public C5588S1(C44068K c44068k) {
        this.A00 = c44068k;
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
        c5237mk = this.A00.A0D;
        if (!c5237mk.A07()) {
            C44068K c44068k = this.A00;
            c5237mk2 = c44068k.A0D;
            c44068k.setImpressionRecordingFlag(c5237mk2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                C5356OG c5356og = new C5356OG();
                c5521Qw = this.A00.A09;
                C5356OG A03 = c5356og.A03(c5521Qw);
                c5237mk3 = this.A00.A0D;
                C5356OG A02 = A03.A02(c5237mk3);
                c6281dJ = ((AbstractC5681TW) this.A00).A08;
                Map<String, String> A05 = A02.A04(c6281dJ.A0X()).A05();
                interfaceC5080Jh = ((AbstractC5681TW) this.A00).A0A;
                str2 = this.A00.A0A;
                interfaceC5080Jh.A93(str2, A05);
                c5953Xy = this.A00.A0C;
                c5953Xy.A0D().A2Y();
                c6281dJ2 = this.A00.A03;
                C403829.A00(c6281dJ2.A0W());
            }
        }
    }
}
