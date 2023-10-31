package com.facebook.ads.redexgen.p036X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qz */
/* loaded from: assets/audience_network.dex */
public class C5524Qz extends AbstractRunnableC5165L8 {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C5483QK A02;
    public final /* synthetic */ EnumC5518Qt A03;

    public C5524Qz(C5483QK c5483qk, EnumC5518Qt enumC5518Qt, int i, int i2) {
        this.A02 = c5483qk;
        this.A03 = enumC5518Qt;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5953Xy c5953Xy;
        Handler handler;
        C44829b c44829b;
        C5953Xy c5953Xy2;
        C44829b c44829b2;
        C5150Kr c5150Kr;
        Handler handler2;
        C5953Xy c5953Xy3;
        C44829b c44829b3;
        Handler handler3;
        C5953Xy c5953Xy4;
        C5953Xy c5953Xy5;
        C44829b c44829b4;
        C5215Ly c5215Ly;
        Handler handler4;
        C5953Xy c5953Xy6;
        C5953Xy c5953Xy7;
        Handler handler5;
        C44829b c44829b5;
        C44829b c44829b6;
        C5284N5 c5284n5;
        C5953Xy c5953Xy8;
        C44829b c44829b7;
        if (this.A03 == EnumC5518Qt.A07) {
            this.A02.A0L(EnumC5087Jo.A0q);
            c5953Xy8 = this.A02.A0A;
            c5953Xy8.A0D().A2w();
            c44829b7 = this.A02.A0B;
            c44829b7.A02(C5483QK.A0C());
        } else if (this.A03 == EnumC5518Qt.A03) {
            this.A02.A0L(EnumC5087Jo.A0l);
            this.A02.A03 = true;
            c44829b6 = this.A02.A0B;
            c5284n5 = C5483QK.A0G;
            c44829b6.A02(c5284n5);
            this.A02.A0K(this.A00);
        } else {
            EnumC5518Qt enumC5518Qt = this.A03;
            EnumC5518Qt enumC5518Qt2 = EnumC5518Qt.A06;
            String[] strArr = A04;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
            if (enumC5518Qt == enumC5518Qt2) {
                this.A02.A0L(EnumC5087Jo.A0k);
                c5953Xy7 = this.A02.A0A;
                c5953Xy7.A0D().A2o();
                this.A02.A03 = true;
                handler5 = this.A02.A07;
                handler5.removeCallbacksAndMessages(null);
                c44829b5 = this.A02.A0B;
                int i = this.A01;
                c44829b5.A02(new C439788(i, i));
                this.A02.A0K(this.A01);
            } else if (this.A03 == EnumC5518Qt.A0A) {
                c5953Xy4 = this.A02.A0A;
                if (C5064JR.A1I(c5953Xy4)) {
                    c5953Xy6 = this.A02.A0A;
                    c5953Xy6.A09().ACr();
                }
                this.A02.A0L(EnumC5087Jo.A0o);
                c5953Xy5 = this.A02.A0A;
                c5953Xy5.A0D().A33();
                c44829b4 = this.A02.A0B;
                c5215Ly = C5483QK.A0H;
                c44829b4.A02(c5215Ly);
                handler4 = this.A02.A07;
                handler4.removeCallbacksAndMessages(null);
                this.A02.A0H();
            } else if (this.A03 == EnumC5518Qt.A05) {
                this.A02.A0L(EnumC5087Jo.A0n);
                c5953Xy3 = this.A02.A0A;
                c5953Xy3.A0D().A2s();
                c44829b3 = this.A02.A0B;
                final int i2 = this.A00;
                c44829b3.A02(new AbstractC5292NE(i2) { // from class: com.facebook.ads.redexgen.X.85
                });
                handler3 = this.A02.A07;
                handler3.removeCallbacksAndMessages(null);
                this.A02.A0K(this.A00);
            } else if (this.A03 == EnumC5518Qt.A04) {
                this.A02.A0L(EnumC5087Jo.A0m);
                c5953Xy2 = this.A02.A0A;
                c5953Xy2.A0D().A2p();
                c44829b2 = this.A02.A0B;
                c5150Kr = C5483QK.A0K;
                c44829b2.A02(c5150Kr);
                handler2 = this.A02.A07;
                handler2.removeCallbacksAndMessages(null);
            } else if (this.A03 == EnumC5518Qt.A09) {
                this.A02.A0L(EnumC5087Jo.A0k);
                c5953Xy = this.A02.A0A;
                c5953Xy.A0D().A2y();
                this.A02.A03 = true;
                handler = this.A02.A07;
                handler.removeCallbacksAndMessages(null);
                c44829b = this.A02.A0B;
                c44829b.A02(new C439788(this.A00, this.A01));
                this.A02.A0K(this.A00);
            }
        }
    }
}
