package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.6O */
/* loaded from: assets/audience_network.dex */
public final class C42976O {
    public static InterfaceC42966N A00;
    public static byte[] A01;
    public static String[] A02 = {"sp1TByEGG7e0GADwDzlASPV0aap3ieHh", "uzFI86KB8SuPvllmns5EhrThmrxeiZB", "WffZMJDQYz5YPWrNy4ctgABXEOCgIES3", "xNvoCKy4p7HAo2gXsjU", "die", "gYyZIkzjV9FAWz0BtKI", "Id5RyLkBfkqUUkVvBGvirNkAkhkz8uh0", "U7WQUa4wbg5Ag319WkF2HwzvOv4zz"};
    public static final String A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {20, 71, 50, 52, Utf8.REPLACEMENT_BYTE, 67, 56, 62, 61, -17, 51, 68, 65, 56, 61, 54, -17, 52, 71, 52, 50, 68, 67, 56, 62, 61, -3};
        String[] strArr = A02;
        if (strArr[3].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[0] = "lreKiDhdf1OAP";
        A01 = bArr;
    }

    static {
        A01();
        A03 = C42976O.class.getSimpleName();
    }

    public static void A02(InterfaceC42966N interfaceC42966N) {
        A00 = interfaceC42966N;
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public static void A03(Throwable th) {
        InterfaceC42966N interfaceC42966N = A00;
        if (interfaceC42966N != null) {
            interfaceC42966N.AE3(th);
        } else {
            Log.e(A03, A00(0, 27, 89), th);
        }
    }
}
