package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.AN */
/* loaded from: assets/audience_network.dex */
public class C4530AN extends AbstractC5216Lz {
    public static byte[] A01;
    public final /* synthetic */ C5671TM A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
    }

    public C4530AN(C5671TM c5671tm) {
        this.A00 = c5671tm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    /* renamed from: A02 */
    public final void A03(C439585 c439585) {
        InterfaceC5269Mq interfaceC5269Mq;
        interfaceC5269Mq = this.A00.A05;
        interfaceC5269Mq.A3t(A00(0, 21, 1), c439585);
    }
}
