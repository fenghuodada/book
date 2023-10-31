package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aN */
/* loaded from: assets/audience_network.dex */
public class C6102aN implements InterfaceC43306v {
    public static byte[] A01;
    public static String[] A02 = {"dNr6PPQsY9l", "RH2U4Hh24YJB1CaC1uFo9RGIyJZKKzLP", "dQYGehnAuPol14EFpizMkTDsN0LYSx6h", "7Q5ZVjGu0JJTpQG9POYIlRIj1jnsmDo", "fVmoe7EJsPLcTdm", "gOyCjpHNXOG3DgRDYrCD", "Bt7utfgyfoKMrlpwfOIMwYj8ykKc", "iv3XcVN43HhJpxh2FG4KyUlJf74g4nGs"};
    public final /* synthetic */ C6092aD A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {32, 31, 50, 50, 35, 48, 55, 29, 42, 45, 53};
        String[] strArr = A02;
        if (strArr[5].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A02[7] = "zsr7uVrJNcFH7kX5XxLPdtK6eEcZRxEm";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C6102aN(C6092aD c6092aD) {
        this.A00 = c6092aD;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        return this.A00.A0B(A00(0, 11, 124), false);
    }
}
