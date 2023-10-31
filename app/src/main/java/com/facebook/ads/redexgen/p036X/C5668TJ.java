package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.TJ */
/* loaded from: assets/audience_network.dex */
public class C5668TJ implements InterfaceC5303NP {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ AbstractC5301NN A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A02[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    static {
        A01();
    }

    public C5668TJ(AbstractC5301NN abstractC5301NN) {
        this.A00 = abstractC5301NN;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5303NP
    public final void A42() {
        InterfaceC5269Mq interfaceC5269Mq;
        InterfaceC5269Mq interfaceC5269Mq2;
        interfaceC5269Mq = this.A00.A07;
        if (interfaceC5269Mq != null) {
            interfaceC5269Mq2 = this.A00.A07;
            interfaceC5269Mq2.A3s(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5303NP
    public final void A43() {
        InterfaceC5270Mr interfaceC5270Mr;
        InterfaceC5270Mr interfaceC5270Mr2;
        this.A00.A0M();
        interfaceC5270Mr = this.A00.A08;
        if (interfaceC5270Mr != null) {
            interfaceC5270Mr2 = this.A00.A08;
            interfaceC5270Mr2.AC8(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5303NP
    public final void A7t() {
        C40462H c40462h;
        C40462H c40462h2;
        C40462H c40462h3;
        C5953Xy c5953Xy;
        c40462h = this.A00.A03;
        if (c40462h == null) {
            A43();
            return;
        }
        AbstractC5301NN.A01(this.A00);
        c40462h2 = this.A00.A03;
        if (c40462h2.A02() == null) {
            AbstractC5301NN abstractC5301NN = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            abstractC5301NN.A0C();
        } else {
            AbstractC5301NN abstractC5301NN2 = this.A00;
            c40462h3 = abstractC5301NN2.A03;
            abstractC5301NN2.A0E(c40462h3.A02());
        }
        if (Build.VERSION.SDK_INT >= 16) {
            c5953Xy = this.A00.A05;
            if (C5064JR.A1k(c5953Xy)) {
                this.A00.performAccessibilityAction(128, null);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5303NP
    public final void A8k() {
        C40422D c40422d;
        C40452G c40452g;
        C5953Xy c5953Xy;
        C40422D c40422d2;
        String str;
        c40422d = this.A00.A04;
        if (!TextUtils.isEmpty(c40422d.A0I())) {
            C5190LZ c5190lz = new C5190LZ();
            c5953Xy = this.A00.A05;
            c40422d2 = this.A00.A04;
            Uri A00 = C5191La.A00(c40422d2.A0I());
            str = this.A00.A09;
            C5190LZ.A0E(c5190lz, c5953Xy, A00, str);
        }
        c40452g = this.A00.A02;
        c40452g.A04();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5303NP
    public final void A8l() {
        InterfaceC5270Mr interfaceC5270Mr;
        C40422D c40422d;
        C40452G c40452g;
        C5953Xy c5953Xy;
        C40422D c40422d2;
        String str;
        InterfaceC5270Mr interfaceC5270Mr2;
        this.A00.A0M();
        interfaceC5270Mr = this.A00.A08;
        if (interfaceC5270Mr != null) {
            interfaceC5270Mr2 = this.A00.A08;
            interfaceC5270Mr2.AC8(true);
        }
        c40422d = this.A00.A04;
        if (!TextUtils.isEmpty(c40422d.A0C())) {
            C5190LZ c5190lz = new C5190LZ();
            c5953Xy = this.A00.A05;
            c40422d2 = this.A00.A04;
            Uri A00 = C5191La.A00(c40422d2.A0C());
            str = this.A00.A09;
            C5190LZ.A0E(c5190lz, c5953Xy, A00, str);
        }
        c40452g = this.A00.A02;
        c40452g.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5303NP
    public final void ABW(EnumC40442F enumC40442F) {
        EnumC40442F enumC40442F2;
        C40422D c40422d;
        C40462H A0B;
        C40422D c40422d2;
        AbstractC5301NN.A00(this.A00);
        this.A00.A01 = enumC40442F;
        enumC40442F2 = this.A00.A01;
        if (enumC40442F2 == EnumC40442F.A03) {
            c40422d2 = this.A00.A04;
            A0B = c40422d2.A0A();
        } else {
            c40422d = this.A00.A04;
            A0B = c40422d.A0B();
        }
        this.A00.A0E(A0B);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5303NP
    public final void ABf(C40462H c40462h) {
        C40452G c40452g;
        AbstractC5301NN.A00(this.A00);
        c40452g = this.A00.A02;
        c40452g.A07(c40462h.A01());
        if (!c40462h.A05().isEmpty()) {
            this.A00.A0E(c40462h);
        } else {
            this.A00.A0D(c40462h);
        }
    }
}
