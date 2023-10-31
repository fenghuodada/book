package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.U4 */
/* loaded from: assets/audience_network.dex */
public class C5714U4 extends AbstractRunnableC5165L8 {
    public static byte[] A01;
    public static String[] A02 = {"HdBP5Xz", "1x1Spdd4leaR6rMyIqz7jDuVALPBafGP", "axXL5TnL0HBMXsVKsrA9GDOWQxSG9OY6", "1dEgnVHIT0m43fI6JYH9hpNhfyiBWS6N", "iEi5yE", "UjLwzpYsoJIrFySVWBkKISpV5tCrd9dB", "Qbq65yz", "qKKFep347IAmJ8sue1lLg6VgEBnKG6W3"};
    public final /* synthetic */ C5143Kk A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            A02[7] = "vKWhPjbFalI70MxhKihYQQhrE25QXeUX";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{25, 28, 16, 14, 25, 12, 33, 21, 31, 28, 33, 33, 25, 18};
    }

    static {
        A02();
    }

    public C5714U4(C5143Kk c5143Kk) {
        this.A00 = c5143Kk;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5953Xy c5953Xy;
        c5953Xy = this.A00.A04;
        c5953Xy.A06().A8F(A00(0, 14, 84));
    }
}
