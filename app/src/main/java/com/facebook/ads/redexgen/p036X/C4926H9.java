package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.H9 */
/* loaded from: assets/audience_network.dex */
public final class C4926H9 {
    public static byte[] A04;
    public static String[] A05 = {"zFpRfifZkCIQawK1FUSg1K3EtGdV6Nz", "WEmq", "TVYpI9shQgf8MMEfvFWnKjXtFk1mYiaB", "WCXJZ", "VBPbo", "2erUCN4YfMxeKpPmRmxhBeZiE0shrr6A", "I2AaOQprvAMyyOLMUfVLbbt0mFwKyNVO", "ZVSAIqFm1ddnxSH"};
    public static final String[] A06;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String[] A03;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[5].charAt(16) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "hhyK";
            strArr[4] = "wZqiL";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 6);
            i4++;
        }
    }

    public static void A03() {
        A04 = new byte[]{36, 114, 0};
    }

    static {
        A03();
        A06 = new String[0];
    }

    public C4926H9(String str, int i, String str2, String[] strArr) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = strArr;
    }

    public static C4926H9 A00() {
        String A02 = A02(0, 0, 1);
        return new C4926H9(A02, 0, A02, new String[0]);
    }

    public static C4926H9 A01(String str, int i) {
        String trim;
        String[] strArr;
        String name = str.trim();
        if (name.isEmpty()) {
            return null;
        }
        int voiceStartIndex = name.indexOf(A02(0, 1, 2));
        if (voiceStartIndex == -1) {
            trim = A02(0, 0, 1);
        } else {
            trim = name.substring(voiceStartIndex).trim();
            String[] strArr2 = A05;
            if (strArr2[1].length() == strArr2[4].length()) {
                throw new RuntimeException();
            }
            A05[5] = "Nr5OesO8C9sIOUHXRuAUw2kYPHmeguzx";
            name = name.substring(0, voiceStartIndex);
        }
        String[] A0l = C5038Iz.A0l(name, A02(1, 2, 40));
        String str2 = A0l[0];
        if (A0l.length > 1) {
            strArr = (String[]) Arrays.copyOfRange(A0l, 1, A0l.length);
        } else {
            strArr = A06;
        }
        return new C4926H9(str2, i, trim, strArr);
    }
}
