package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jp */
/* loaded from: assets/audience_network.dex */
public final class C5088Jp {
    public static byte[] A02;
    public static String[] A03 = {"0EK1zjbC0rvKFRySirHuNeKu7O6M1c2K", "EZ3WTNSY5ayWns4cE", "iOTwBXJJn2mTXQ1MI7WizzznsNyhmcwj", "DnXRTJeCR1MDANpnyW3y9Xegmk", "0BaBrbX1x0DXsftKwoONmcZPElrNX48m", "JdhHjDAP4IE4TNrXk8Fag99Jau", "kO1FJ5pbtA78NTGKnINecVB8MAIDEUuG", "0uD1E8KeZOnBJibGqVh9DEewsO4i87jr"};
    public final InterfaceC5080Jh A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[4].charAt(5) != 'b') {
                throw new RuntimeException();
            }
            A03[4] = "OpSsMbmoyiuJLyOxEkBMoj5ebplLMUgU";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{24, 30, 9, 31, 18, 27, 14};
    }

    static {
        A01();
    }

    public C5088Jp(String str, InterfaceC5080Jh interfaceC5080Jh) {
        this.A01 = str;
        this.A00 = interfaceC5080Jh;
    }

    public final void A02(EnumC5087Jo enumC5087Jo, @Nullable Map<String, String> map) {
        A03(enumC5087Jo.A02(), map);
    }

    public final void A03(String str, @Nullable Map<String, String> map) {
        if (!C5090Jr.A0B(this.A01, str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(A00(0, 7, 67), str);
        InterfaceC5080Jh interfaceC5080Jh = this.A00;
        String str2 = this.A01;
        if (A03[4].charAt(5) != 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[0] = "vT3nRtW3uRS5jX4JEmaR2PdDFOqNzjtW";
        strArr[7] = "IECj1aNSpXIXDwy92hzTd369PO3PVRtC";
        interfaceC5080Jh.A91(str2, map);
    }
}
