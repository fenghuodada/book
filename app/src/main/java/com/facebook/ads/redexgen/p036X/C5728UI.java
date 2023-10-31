package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.UI */
/* loaded from: assets/audience_network.dex */
public class C5728UI implements InterfaceC43577M {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ C6298da A00;
    public final /* synthetic */ C5721UB A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 14, 25, 33, 24, 22, 25, 11, 14, -54, 11, -54, 23, 15, 14, 19, 11, -40};
    }

    static {
        A01();
    }

    public C5728UI(C5721UB c5721ub, C6298da c6298da, boolean z) {
        this.A01 = c5721ub;
        this.A00 = c6298da;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43577M
    public final void AAH() {
        C5953Xy c5953Xy;
        long j;
        InterfaceC5720UA interfaceC5720UA;
        InterfaceC5720UA interfaceC5720UA2;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 110);
        c5953Xy = this.A01.A0c;
        InterfaceC39330R A0D = c5953Xy.A0D();
        j = this.A01.A00;
        A0D.A2a(C5236MJ.A01(j), adErrorType.getErrorCode(), A00);
        interfaceC5720UA = this.A01.A0G;
        if (interfaceC5720UA != null) {
            C5721UB c5721ub = this.A01;
            String[] strArr = A04;
            String str = strArr[4];
            String errorMessage = strArr[7];
            if (str.length() != errorMessage.length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            interfaceC5720UA2 = c5721ub.A0G;
            interfaceC5720UA2.AAi(C5115KH.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43577M
    public final void AAO() {
        InterfaceC5720UA interfaceC5720UA;
        EnumC5098Jz enumC5098Jz;
        C5953Xy c5953Xy;
        InterfaceC5720UA interfaceC5720UA2;
        C5953Xy c5953Xy2;
        boolean A0q;
        InterfaceC5720UA interfaceC5720UA3;
        C4819FO c4819fo;
        C4819FO c4819fo2;
        C5721UB c5721ub = this.A01;
        c5721ub.A0a = this.A00;
        if (this.A02) {
            c4819fo = c5721ub.A0A;
            if (c4819fo != null) {
                c4819fo2 = this.A01.A0A;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "vb7V14ygc";
                strArr2[7] = "eJXYUqUMt";
                c4819fo2.A0F();
            }
        }
        interfaceC5720UA = this.A01.A0G;
        if (interfaceC5720UA != null) {
            enumC5098Jz = this.A01.A0E;
            if (enumC5098Jz.equals(EnumC5098Jz.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    interfaceC5720UA3 = this.A01.A0G;
                    interfaceC5720UA3.ABT();
                }
            }
            if (this.A02) {
                c5953Xy = this.A01.A0c;
                if (!C5064JR.A1C(c5953Xy) || this.A01.A0z() == null || !this.A01.A0z().A0r()) {
                    interfaceC5720UA2 = this.A01.A0G;
                    interfaceC5720UA2.A9w();
                    return;
                }
                C5721UB c5721ub2 = this.A01;
                c5953Xy2 = c5721ub2.A0c;
                c5721ub2.A0M = C5412PB.A01(c5953Xy2, this.A01.A0z(), 4, new C5729UJ(this));
            }
        }
    }
}
