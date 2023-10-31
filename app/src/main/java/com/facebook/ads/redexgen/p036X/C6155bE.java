package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bE */
/* loaded from: assets/audience_network.dex */
public class C6155bE extends AbstractRunnableC5165L8 {
    public static byte[] A03;
    public final /* synthetic */ C42866D A00;
    public final /* synthetic */ C5952Xx A01;
    public final /* synthetic */ String A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{53, 55, 60, 55, 32, 59, 49};
    }

    public C6155bE(C42866D c42866d, String str, C5952Xx c5952Xx) {
        this.A00 = c42866d;
        this.A02 = str;
        this.A01 = c5952Xx;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        try {
            this.A00.A06(this.A02);
        } catch (Throwable th) {
            this.A01.A06().A8y(A00(0, 7, 2), C44458z.A1F, new C444690(th));
        }
    }
}
