package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.H2 */
/* loaded from: assets/audience_network.dex */
public final class C4919H2 {
    public static byte[] A02;
    public static String[] A03 = {"5moU6oTWlMaw1sDVAQ0KQ9vMfu", "p49r3ReMaXkyq3mZFz3vXo8SK9LaCwKA", "zB3eTtV", "qmKjW68jdxdUPQHo", "qXdLPSjDEI4OIDX4GQuIV", "", "iFy7tRn7HMov4f4CYUKnyhY2lj6xewaE", "7WU313Gqg3541KnskWJgurkNM7"};
    public static final Pattern A04;
    public final C5022Ij A00 = new C5022Ij();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[3].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "WbeGi2EdgzwyYonzf4wPzmwNCcWtg9MW";
            strArr[6] = "HcL7UN1N9oazqVf2QAldqbU1hHC9CZ0b";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            byte b = copyOfRange[i4];
            String[] strArr2 = A03;
            if (strArr2[7].length() != strArr2[0].length()) {
                String[] strArr3 = A03;
                strArr3[4] = "JF2Fp1R2vbvas833wDrB0";
                strArr3[5] = "";
                copyOfRange[i4] = (byte) ((b - i3) - 66);
                i4 += 0;
            } else {
                String[] strArr4 = A03;
                strArr4[1] = "nmNaQjGJyPE7mmPpZpQG0xjHlUJrvUW4";
                strArr4[6] = "jsP66PUWr33y4hLthtnL6xZSYxJtrhjf";
                copyOfRange[i4] = (byte) ((b - i3) - 86);
                i4++;
            }
        }
    }

    public static void A07() {
        A02 = new byte[]{-10, -76, -18, -81, -81, -40, -22, -38, -9, 12, -34, -38, -39, -12, -19, -25, -31, -29, -69, -96, -90, -39, -36, -96, -37, -88, -89, -96, -38, -37, 13, 12, 14, 22, 18, 29, 26, 32, 25, 15, -40, 14, 26, 23, 26, 29, -72, -59, -62, -70, 53, 65, 62, 65, 68, 33, 42, 41, 47, -24, 33, 28, 40, 36, 39, 52, -36, -27, -28, -22, -93, -23, -22, -17, -30, -37, -31, -22, -23, -17, -88, -14, -32, -28, -30, -29, -17, -15, -4, -23, -12, -15, -21, -5, -20, -1, -5, -76, -21, -20, -22, -10, -7, -24, -5, -16, -10, -11, 58, 51, 41, 42, 55, 49, 46, 51, 42, -34, -17};
    }

    static {
        A07();
        A04 = Pattern.compile(A01(11, 19, 40));
    }

    public static char A00(C5022Ij c5022Ij, int i) {
        return (char) c5022Ij.A00[i];
    }

    public static String A02(C5022Ij c5022Ij) {
        int limit = c5022Ij.A06();
        int A07 = c5022Ij.A07();
        int position = 0;
        while (limit < A07 && position == 0) {
            int i = limit + 1;
            int position2 = c5022Ij.A00[limit];
            int limit2 = (char) position2;
            position = limit2 == 41 ? 1 : 0;
            limit = i;
        }
        return c5022Ij.A0S((limit - 1) - c5022Ij.A06()).trim();
    }

    public static String A03(C5022Ij c5022Ij, StringBuilder sb) {
        sb.setLength(0);
        int A06 = c5022Ij.A06();
        int A07 = c5022Ij.A07();
        boolean z = false;
        while (A06 < A07 && !z) {
            char c = (char) c5022Ij.A00[A06];
            if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                A06++;
                sb.append(c);
            } else {
                z = true;
            }
        }
        c5022Ij.A0Z(A06 - c5022Ij.A06());
        return sb.toString();
    }

    public static String A04(C5022Ij c5022Ij, StringBuilder sb) {
        A0A(c5022Ij);
        if (c5022Ij.A04() == 0) {
            return null;
        }
        String A032 = A03(c5022Ij, sb);
        String A01 = A01(0, 0, 21);
        if (!A01.equals(A032)) {
            return A032;
        }
        return A01 + ((char) c5022Ij.A0E());
    }

    public static String A05(C5022Ij c5022Ij, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int A06 = c5022Ij.A06();
            String A042 = A04(c5022Ij, sb);
            if (A042 == null) {
                return null;
            }
            if (A01(118, 1, 28).equals(A042) || A01(8, 1, 102).equals(A042)) {
                c5022Ij.A0Y(A06);
                z = true;
            } else {
                sb2.append(A042);
            }
        }
        String sb3 = sb2.toString();
        String[] strArr = A03;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A03[2] = "Zajsfk5";
        return sb3;
    }

    public static String A06(C5022Ij c5022Ij, StringBuilder sb) {
        A0A(c5022Ij);
        if (c5022Ij.A04() < 5) {
            return null;
        }
        if (A01(3, 5, 31).equals(c5022Ij.A0S(5))) {
            int A06 = c5022Ij.A06();
            String A042 = A04(c5022Ij, sb);
            if (A042 == null) {
                return null;
            }
            String token = A01(117, 1, 13);
            if (token.equals(A042)) {
                c5022Ij.A0Y(A06);
                String token2 = A01(0, 0, 21);
                return token2;
            }
            String str = null;
            String token3 = A01(0, 1, 120);
            if (token3.equals(A042)) {
                str = A02(c5022Ij);
            }
            String A043 = A04(c5022Ij, sb);
            String token4 = A01(1, 1, 53);
            if (!token4.equals(A043) || A043 == null) {
                return null;
            }
            return str;
        }
        return null;
    }

    private void A08(C4923H6 c4923h6, String str) {
        if (A01(0, 0, 21).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Pattern pattern = A04;
            String[] strArr = A03;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "I8JZnIR9egwAM0HwkjEQFl8l1n";
            strArr2[0] = "OMVURqNL7mUYh9I5H6Apgp30fA";
            Matcher matcher = pattern.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c4923h6.A0K(matcher.group(1));
            }
            str = str.substring(0, indexOf);
        }
        String[] A0l = C5038Iz.A0l(str, A01(9, 2, 90));
        String str2 = A0l[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c4923h6.A0J(str2.substring(0, indexOf2));
            int idPrefixIndex = indexOf2 + 1;
            c4923h6.A0I(str2.substring(idPrefixIndex));
        } else {
            c4923h6.A0J(str2);
        }
        int idPrefixIndex2 = A0l.length;
        if (idPrefixIndex2 > 1) {
            int idPrefixIndex3 = A0l.length;
            c4923h6.A0L((String[]) Arrays.copyOfRange(A0l, 1, idPrefixIndex3));
        }
    }

    public static void A09(C5022Ij c5022Ij) {
        do {
        } while (!TextUtils.isEmpty(c5022Ij.A0P()));
    }

    public static void A0A(C5022Ij c5022Ij) {
        boolean z = true;
        while (c5022Ij.A04() > 0 && z) {
            if (!A0D(c5022Ij)) {
                boolean A0C = A0C(c5022Ij);
                String[] strArr = A03;
                if (strArr[4].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[7] = "hJK3qjOtPloIxgY8vJytqI0HGH";
                strArr2[0] = "GkPADoSnbvIPHM1na4c3lEMD25";
                if (!A0C) {
                    z = false;
                }
            }
            z = true;
        }
    }

    public static void A0B(C5022Ij c5022Ij, C4923H6 c4923h6, StringBuilder sb) {
        A0A(c5022Ij);
        String token = A03(c5022Ij, sb);
        String A01 = A01(0, 0, 21);
        if (A01.equals(token)) {
            return;
        }
        if (!A01(2, 1, 94).equals(A04(c5022Ij, sb))) {
            return;
        }
        A0A(c5022Ij);
        String A05 = A05(c5022Ij, sb);
        if (A05 == null || A01.equals(A05)) {
            return;
        }
        int A06 = c5022Ij.A06();
        String A042 = A04(c5022Ij, sb);
        if (!A01(8, 1, 102).equals(A042)) {
            if (A01(118, 1, 28).equals(A042)) {
                c5022Ij.A0Y(A06);
            } else {
                return;
            }
        }
        if (A01(50, 5, 124).equals(token)) {
            c4923h6.A0C(C5002IP.A02(A05));
        } else if (A01(30, 16, 85).equals(token)) {
            c4923h6.A0B(C5002IP.A02(A05));
        } else if (A01(93, 15, 49).equals(token)) {
            if (!A01(108, 9, 111).equals(A05)) {
                return;
            }
            c4923h6.A0G(true);
        } else if (A01(55, 11, 101).equals(token)) {
            c4923h6.A0D(A05);
        } else if (A01(76, 11, 37).equals(token)) {
            if (!A01(46, 4, 0).equals(A05)) {
                return;
            }
            c4923h6.A0E(true);
        } else if (!A01(66, 10, 32).equals(token) || !A01(87, 6, 50).equals(A05)) {
        } else {
            c4923h6.A0F(true);
        }
    }

    public static boolean A0C(C5022Ij c5022Ij) {
        int limit = c5022Ij.A06();
        int A07 = c5022Ij.A07();
        byte[] bArr = c5022Ij.A00;
        if (limit + 2 <= A07) {
            int i = limit + 1;
            if (bArr[limit] == 47) {
                int limit2 = i + 1;
                if (bArr[i] == 42) {
                    while (limit2 + 1 < A07) {
                        int i2 = limit2 + 1;
                        if (((char) bArr[limit2]) == '*' && ((char) bArr[i2]) == '/') {
                            A07 = i2 + 1;
                            String[] strArr = A03;
                            if (strArr[4].length() == strArr[5].length()) {
                                throw new RuntimeException();
                            }
                            A03[3] = "JvQuY0ttidF2MFD";
                            limit2 = A07;
                        } else {
                            limit2 = i2;
                        }
                    }
                    c5022Ij.A0Z(A07 - c5022Ij.A06());
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean A0D(C5022Ij c5022Ij) {
        char A00 = A00(c5022Ij, c5022Ij.A06());
        if (A00 != '\t' && A00 != '\n' && A00 != '\f' && A00 != '\r') {
            String[] strArr = A03;
            if (strArr[1].charAt(8) == strArr[6].charAt(8)) {
                throw new RuntimeException();
            }
            A03[2] = "XdMJqir";
            if (A00 != ' ') {
                return false;
            }
        }
        c5022Ij.A0Z(1);
        String[] strArr2 = A03;
        if (strArr2[1].charAt(8) == strArr2[6].charAt(8)) {
            A03[3] = "JQij4b";
            return true;
        }
        String[] strArr3 = A03;
        strArr3[7] = "YUo1DIFuEN1uIrNP3uzwlzTLm0";
        strArr3[0] = "TeHQYLZm1GheElXx48zfUEG6q3";
        return true;
    }

    public final C4923H6 A0E(C5022Ij c5022Ij) {
        this.A01.setLength(0);
        int A06 = c5022Ij.A06();
        A09(c5022Ij);
        this.A00.A0b(c5022Ij.A00, c5022Ij.A06());
        this.A00.A0Y(A06);
        String A062 = A06(this.A00, this.A01);
        if (A062 != null) {
            if (A01(117, 1, 13).equals(A04(this.A00, this.A01))) {
                C4923H6 c4923h6 = new C4923H6();
                A08(c4923h6, A062);
                String str = null;
                boolean z = false;
                while (true) {
                    String A01 = A01(118, 1, 28);
                    if (!z) {
                        C5022Ij c5022Ij2 = this.A00;
                        if (A03[2].length() != 7) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[7] = "P2Yqf81YsUpWwfjUTZqElTDCCY";
                        strArr[0] = "xGmVLGcPrtNhIWRwMqh3QWIima";
                        int A063 = c5022Ij2.A06();
                        str = A04(this.A00, this.A01);
                        z = str == null || A01.equals(str);
                        if (!z) {
                            this.A00.A0Y(A063);
                            A0B(this.A00, c4923h6, this.A01);
                        }
                    } else if (A01.equals(str)) {
                        return c4923h6;
                    } else {
                        return null;
                    }
                }
            }
        }
        return null;
    }
}
