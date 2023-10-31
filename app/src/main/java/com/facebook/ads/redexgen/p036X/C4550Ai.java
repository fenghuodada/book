package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ai */
/* loaded from: assets/audience_network.dex */
public class C4550Ai extends AbstractC5200Lj {
    public static byte[] A01;
    public static String[] A02 = {"AyjpfVMH4abbuU", "C4f54F5689i8nguXYuZVyawidNrV99tP", "", "kvcj7JPhLleA0fC5", "qT9ER7mxQyIS", "DVCseFxiIzNfwa", "yADVvB6XdmuuqrvB", "b9AAn0hyeOBCYK5qzyR18"};
    public final /* synthetic */ C5671TM A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[1].charAt(16) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "MNhPeHQbaIIJpJ20hNozP";
            strArr[2] = "";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{35, 22, 17, 18, 28, -10, 27, 33, 18, 31, 32, 33, 22, 33, 14, 25, -14, 35, 18, 27, 33};
    }

    static {
        A01();
    }

    public C4550Ai(C5671TM c5671tm) {
        this.A00 = c5671tm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    /* renamed from: A02 */
    public final void A03(C5215Ly c5215Ly) {
        InterfaceC5269Mq interfaceC5269Mq;
        interfaceC5269Mq = this.A00.A05;
        interfaceC5269Mq.A3t(A00(0, 21, 113), c5215Ly);
    }
}
