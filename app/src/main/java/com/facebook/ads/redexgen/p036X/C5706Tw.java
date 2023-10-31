package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tw */
/* loaded from: assets/audience_network.dex */
public class C5706Tw implements InterfaceC5171LE {
    public static byte[] A00;
    public static String[] A01 = {"8dTs7O5twSBYJQLkIxmvSEVrFVEvVCci", "69NA9D5Z6BuLX3eP6NdAfQAgnNKJrDbv", "acKGpr4PBH5WFf0tOIi0bMoNuU2uM3j", "PyBLhH8YgyLL4rtY0CuV5vjOqs5FO6aV", "QGo0VGIKP6OUkgre", "Fn5N", "qAtdKl9ehcjQMJLKj9xOFxL36VJ6lS2D", "CGei2tUyEESFCVHjI0JHW7BbjnmVvUdx"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {119, 115, 114, -90, -107, -102, -106, -97, -108, -106, Byte.MAX_VALUE, -106, -91, -88, -96, -93, -100, -42, -17, -20, -17, -16, -8, -17, -95, -26, -7, -28, -26, -15, -11, -22, -16, -17, -81};
        if (A01[5].length() != 4) {
            throw new RuntimeException();
        }
        A01[1] = "MK2VCqgBd9SNnNeGly9LCo5Q0MZYLIwM";
        A00 = bArr;
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5171LE
    public final void A8p(int i, Throwable th) {
        Log.e(A00(0, 17, 10), A00(17, 18, 90), th);
    }
}
