package com.facebook.ads.redexgen.p036X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.J1 */
/* loaded from: assets/audience_network.dex */
public final class C5040J1 {
    public static byte[] A05;
    public static String[] A06 = {"6HhNm3cPNapwaqbb", "rETS2R3vEEslStUJRpCBgfLkJK0S9xqh", "MEYGBk1oMmhBWHD5huW8XB9PkOXmJxmW", "Ebyfs41o5airltqaiKadsdL394JDYdET", "45eNA9gLGf59sMGZ1iMI", "", "A0Zue4QITY9ZnpF1VrB6IK97BmW1DYMt", "lY4WeGl5g11cW0QvoH9uVkbc4B0XWsja"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            String[] strArr = A06;
            if (strArr[2].charAt(1) != strArr[1].charAt(1)) {
                throw new RuntimeException();
            }
            A06[3] = "kNkKJeUYPfq8eMd2tA59MaBH22H8N5Ts";
            copyOfRange[i4] = (byte) ((b - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{13, 58, 58, 55, 58, -24, 56, 41, 58, 59, 49, 54, 47, -24, 9, 30, 11, -24, 43, 55, 54, 46, 49, 47};
    }

    static {
        A02();
    }

    public C5040J1(List<byte[]> initializationData, int i, int i2, int i3, float f) {
        this.A04 = initializationData;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
    }

    public static C5040J1 A00(C5022Ij c5022Ij) throws C4547Af {
        try {
            c5022Ij.A0Z(4);
            int A0E = (c5022Ij.A0E() & 3) + 1;
            if (A0E != 3) {
                ArrayList arrayList = new ArrayList();
                int numSequenceParameterSets = c5022Ij.A0E() & 31;
                for (int j = 0; j < numSequenceParameterSets; j++) {
                    arrayList.add(A03(c5022Ij));
                }
                int A0E2 = c5022Ij.A0E();
                for (int numPictureParameterSets = 0; numPictureParameterSets < A0E2; numPictureParameterSets++) {
                    arrayList.add(A03(c5022Ij));
                }
                int i = -1;
                int i2 = -1;
                float f = 1.0f;
                int width = A06[4].length();
                if (width != 27) {
                    String[] strArr = A06;
                    strArr[2] = "yEkjaL4nSOxIxbdygxb0eg7rmaPMv2Rh";
                    strArr[1] = "JEi8k2PtpDNktftvz60xHr0NAbywlG3U";
                    if (numSequenceParameterSets > 0) {
                        int height = ((byte[]) arrayList.get(0)).length;
                        C5017Ie A062 = C5018If.A06((byte[]) arrayList.get(0), A0E, height);
                        i = A062.A06;
                        i2 = A062.A02;
                        f = A062.A00;
                    }
                    return new C5040J1(arrayList, A0E, i, i2, f);
                }
                throw new RuntimeException();
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C4547Af(A01(0, 24, 119), e);
        }
    }

    public static byte[] A03(C5022Ij c5022Ij) {
        int offset = c5022Ij.A0I();
        int A062 = c5022Ij.A06();
        c5022Ij.A0Z(offset);
        return C5001IO.A08(c5022Ij.A00, A062, offset);
    }
}
