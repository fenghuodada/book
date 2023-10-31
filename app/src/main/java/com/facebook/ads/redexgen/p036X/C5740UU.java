package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.UU */
/* loaded from: assets/audience_network.dex */
public class C5740UU implements InterfaceC5528R3 {
    public static byte[] A01;
    public static String[] A02 = {"XEdsDf1ZbmPdObC9OTEW2z8", "P58GYLlTlw8ULSmid4", "Mge4MDnEmweXwYPX4YofvB", "Ml9Qgu3DLJEhAVMYvCD1k2vZQtwOfhBB", "E1ltw8QxIeAvk6pflmFLXm8YnaEq6i", "JKuYCHjaj2TXENBLxEiyXLq9QhlooG47", "FRLGU9mx00WiiljPewQioxO6UtPhxOrA", "0cr7cMD0TGsotYn7hqiGPP2awzQMRhBn"};
    public final /* synthetic */ C44148U A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 117;
            String[] strArr = A02;
            if (strArr[3].charAt(0) == strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "sKECfnlovjgTE3hUnC6hiyxfwSx6iZYU";
            strArr2[6] = "FWGh7KUlNSgjRKrBTTVWdRGVuB2lw617";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-12, 18, 31, -40, 37, -47, 21, 26, 36, 33, 18, 37, 20, 25, -47, 20, 32, 38, 31, 37, 22, 35, 36, -33, 1, 38, 48, 45, 30, 49, 32, 37, 34, 33, -35, 32, 44, 50, 43, 49, 34, 47, 48, -21, -35, 15, 34, 48, 45, 44, 43, 48, 34, -9, -35};
    }

    static {
        A01();
    }

    public C5740UU(C44148U c44148u) {
        this.A00 = c44148u;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5528R3
    public final void AAM(InterfaceC5526R1 interfaceC5526R1) {
        if (this.A00.A03().A8P() && interfaceC5526R1 != null) {
            String str = A00(24, 31, 72) + interfaceC5526R1.A5p();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5528R3
    public final void AAj(Exception exc) {
        if (this.A00.A03().A8P()) {
            Log.e(C5091Js.A00(), A00(0, 24, 60), exc);
        }
    }
}
