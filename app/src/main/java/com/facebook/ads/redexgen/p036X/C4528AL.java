package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.AL */
/* loaded from: assets/audience_network.dex */
public class C4528AL extends AbstractC5285N6 {
    public static byte[] A01;
    public static String[] A02 = {"OtZHHid0c6Ryk9CDDBq47ngXcNldIUWH", "JwrlVwQ54E2WwwQvkywQUOYHwL6g1bho", "WFiM5IPZvaQ4xMZm5xgvQ3FNROoMY2Kr", "al6ZIECO6LO12zMiuvYELaWNpYKDhozx", "wYAPbQwhGVteNN6MGdL8gA6824n9AnKf", "jTihIhEYsz4XSFMEjn7OlZEBUOzI3KNS", "mXaQIkSzTCVxPQuz9HLogqhmhIjgMyMR", "pEgzTi4rZbqmTwficQat67UuNHBZNbaD"};
    public final /* synthetic */ C5671TM A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {17, 4, -1, 0, 10, -28, 9, 15, 0, 13, 14, 15, 4, 15, -4, 7, -32, 17, 0, 9, 15};
        String[] strArr = A02;
        if (strArr[6].charAt(4) != strArr[3].charAt(4)) {
            throw new RuntimeException();
        }
        A02[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C4528AL(C5671TM c5671tm) {
        this.A00 = c5671tm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    /* renamed from: A02 */
    public final void A03(C439788 c439788) {
        InterfaceC5269Mq interfaceC5269Mq;
        interfaceC5269Mq = this.A00.A05;
        interfaceC5269Mq.A3t(A00(0, 21, 69), c439788);
    }
}
