package com.facebook.ads.redexgen.p036X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1R */
/* loaded from: assets/audience_network.dex */
public final class C39941R implements Serializable {
    public static byte[] A04 = null;
    public static String[] A05 = {"fMgCBjwnSPLlGmCQgsSLupdT7pqDzyp4", "yUS8gRlB2MWxUDhPAJrAYtkWaSt8qz4B", "dBasyOwTmlOZTCbIWWmvB1g7E", "RqaXhgYUvoqEq", "F0nm8JPdbdm", "Y401XUNRFDrr9SfWxNZZjZ9oz", "LA5HjnpgcUFB3", "MK9sfwjFqBk"};
    public static final long serialVersionUID = 351643298236575729L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{121, -7, -31, -13, -16, -16, -29, -20, -31, -9, -5, -23, -33, -29, -49, -36, -30, -41, -30, -25, -21};
    }

    static {
        A02();
    }

    public C39941R(C39931Q c39931q) {
        String str;
        String str2;
        String str3;
        String str4;
        str = c39931q.A02;
        this.A02 = str;
        str2 = c39931q.A03;
        this.A03 = str2;
        str3 = c39931q.A00;
        this.A00 = str3;
        str4 = c39931q.A01;
        this.A01 = str4;
    }

    public static String A01(String str, String str2, int i) {
        String quantityString = str.replace(A00(1, 10, 49), str2);
        String updatedString = A00(0, 0, 15);
        if (i > 0) {
            updatedString = i + A00(0, 1, 12);
        }
        String updatedString2 = quantityString.replace(A00(11, 10, 33), updatedString);
        if (A05[7].length() != 29) {
            A05[4] = "HwfJGa76I4tQ";
            return updatedString2;
        }
        throw new RuntimeException();
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }

    public final String A06(String str, int i) {
        return A01(this.A03, str, i);
    }
}
