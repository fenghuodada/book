package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.FU */
/* loaded from: assets/audience_network.dex */
public final class C4825FU {
    public static byte[] A03;
    public static String[] A04 = {"bxXiKI", "1uDei3qzNnKNtNYr8Y2Djp0HGajvtEV5", "mOXymc7srnaPPj6rkYKERyI3NxuvjHfL", "eLJeQSRGsG8qXjpz5HdRmaYCfpHE06ps", "tIHnpnFG5Gy9TDLwgByCKCMlkPhTptnY", "feqrkYPgdz0GJjq4", "3AbGJoGZCQZs42EqNNbBdZ7jf", "CWkuEW"};
    public InterfaceC4658Cc A00;
    public final InterfaceC4660Ce A01;
    public final InterfaceC4658Cc[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
            String[] strArr = A04;
            if (strArr[1].charAt(6) == strArr[3].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "mNEvNMISV2TsjErCZLDNSt4mIeKbSMWU";
            strArr2[2] = "pkwADRIgEHU8NI8rqtSVQew0tEayD06s";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{94, 87, 20, 24, 2, 27, 19, 87, 5, 18, 22, 19, 87, 3, 31, 18, 87, 4, 3, 5, 18, 22, 26, 89, 65, 96, 97, 106, 47, 96, 105, 47, 123, 103, 106, 47, 110, 121, 110, 102, 99, 110, 109, 99, 106, 47, 106, 119, 123, 125, 110, 108, 123, 96, 125, 124, 47, 39};
    }

    static {
        A01();
    }

    public C4825FU(InterfaceC4658Cc[] interfaceC4658CcArr, InterfaceC4660Ce interfaceC4660Ce) {
        this.A02 = interfaceC4658CcArr;
        this.A01 = interfaceC4660Ce;
    }

    public final InterfaceC4658Cc A02(InterfaceC4659Cd interfaceC4659Cd, Uri uri) throws IOException, InterruptedException {
        InterfaceC4658Cc interfaceC4658Cc = this.A00;
        if (interfaceC4658Cc != null) {
            return interfaceC4658Cc;
        }
        InterfaceC4658Cc[] interfaceC4658CcArr = this.A02;
        int length = interfaceC4658CcArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            InterfaceC4658Cc interfaceC4658Cc2 = interfaceC4658CcArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC4659Cd.AEB();
                throw th;
            }
            if (interfaceC4658Cc2.AEv(interfaceC4659Cd)) {
                this.A00 = interfaceC4658Cc2;
                interfaceC4659Cd.AEB();
                break;
            }
            continue;
            interfaceC4659Cd.AEB();
            i++;
        }
        InterfaceC4658Cc interfaceC4658Cc3 = this.A00;
        if (A04[6].length() != 13) {
            String[] strArr = A04;
            strArr[0] = "fQ5Ua6";
            strArr[7] = "HZXGBz";
            if (interfaceC4658Cc3 != null) {
                interfaceC4658Cc3.A8I(this.A01);
                return this.A00;
            }
            throw new C5801VT(A00(24, 34, 125) + C5038Iz.A0S(this.A02) + A00(0, 24, 5), uri);
        }
        throw new RuntimeException();
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
