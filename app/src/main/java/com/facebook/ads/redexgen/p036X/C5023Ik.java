package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Ik */
/* loaded from: assets/audience_network.dex */
public final class C5023Ik {
    public static String[] A04 = {"c84vrcH31LBgkMTCK1bohHlXVMnz9AJR", "d1OdysF2oEJNIHjT9033ROKyCX5j9bI3", "fxcqndjlyXUHbVpCK9jm", "aT6eQk8J7bmxuuGVWtHexoeTGFRtLCio", "ywK9OdvkymoDgjlaSqX1MXgGISTKD1G", "kvGKIZl1lyVjOHyD1SwfLq7Qy0hyNYJA", "P5ZowT1yJlaZidguBbmn", "kEUPdIGxbWMHKqV30QNAKk8CqZCFjcZl"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C5023Ik(byte[] bArr, int i, int i2) {
        A08(bArr, i, i2);
    }

    private int A00() {
        int i = 0;
        while (!A0A()) {
            i++;
        }
        int i2 = (1 << i) - 1;
        if (A04[5].charAt(7) != 'Z') {
            String[] strArr = A04;
            strArr[1] = "EO6sj55N530JbeetbwPxyBKxcCLP9BzL";
            strArr[0] = "oyZlo8wPjIkpHiFdOrp6pSDhzRhw9ZCk";
            return i2 + (i > 0 ? A05(i) : 0);
        }
        throw new RuntimeException();
    }

    private void A01() {
        int i;
        int i2 = this.A02;
        C4997IK.A04(i2 >= 0 && (i2 < (i = this.A01) || (i2 == i && this.A00 == 0)));
    }

    private boolean A02(int i) {
        if (2 <= i && i < this.A01) {
            byte[] bArr = this.A03;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final int A03() {
        int A00 = A00();
        return (A00 % 2 == 0 ? -1 : 1) * ((A00 + 1) / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i) {
        int i2;
        int i3 = 0;
        this.A00 += i;
        while (true) {
            i2 = this.A00;
            if (i2 <= 8) {
                break;
            }
            this.A00 = i2 - 8;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            i3 |= (bArr[i4] & 255) << this.A00;
            if (!A02(i4 + 1)) {
                r4 = 1;
            }
            this.A02 = i4 + r4;
        }
        byte[] bArr2 = this.A03;
        int i5 = this.A02;
        int i6 = (i3 | ((bArr2[i5] & 255) >> (8 - i2))) & ((-1) >>> (32 - i));
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i5 + (A02(i5 + 1) ? 2 : 1);
        }
        A01();
        String[] strArr = A04;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[1] = "VwcsjLhlZd9I2ct9XMdPqerwWVhD9SnY";
        strArr2[0] = "SEOCmBzyD2oxYau0L8QhU7fYZrlA9WRm";
        return i6;
    }

    public final void A06() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            int i2 = this.A02;
            this.A02 = i2 + (A02(i2 + 1) ? 2 : 1);
        }
        A01();
    }

    public final void A07(int numBytes) {
        int i = this.A02;
        int i2 = numBytes / 8;
        this.A02 += i2;
        this.A00 += numBytes - (i2 * 8);
        int i3 = this.A00;
        if (i3 > 7) {
            this.A02++;
            this.A00 = i3 - 8;
        }
        while (true) {
            i++;
            int i4 = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[2].length()) {
                break;
            }
            String[] strArr2 = A04;
            strArr2[7] = "16ru2e8lXVuKccLj62CTuGGODJDTLMLs";
            strArr2[3] = "ss2rTXlJnNbrcKU9GLjWVNttz382myoQ";
            if (i <= i4) {
                boolean A02 = A02(i);
                String[] strArr3 = A04;
                if (strArr3[6].length() != strArr3[2].length()) {
                    break;
                }
                String[] strArr4 = A04;
                strArr4[6] = "8iP0ukDWZhsNH03XWb9d";
                strArr4[2] = "2ETrOFK8hCpKH2QuP6pQ";
                if (A02) {
                    this.A02++;
                    i += 2;
                }
            } else {
                A01();
                return;
            }
        }
        throw new RuntimeException();
    }

    public final void A08(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = 0;
        A01();
    }

    public final boolean A09() {
        int initialBitOffset = this.A02;
        int leadingZeros = this.A00;
        int i = 0;
        while (this.A02 < this.A01 && !A0A()) {
            i++;
        }
        boolean z = this.A02 == this.A01;
        this.A02 = initialBitOffset;
        this.A00 = leadingZeros;
        if (A04[5].charAt(7) != 'Z') {
            String[] strArr = A04;
            strArr[7] = "4CnifSrgKpd7e7K0x8WVIkfErouhzSPT";
            strArr[3] = "4ZydgevgZqNlOfL3PtmcBBhuPOTZ7C4b";
            return !z && A0B((i * 2) + 1);
        }
        throw new RuntimeException();
    }

    public final boolean A0A() {
        boolean z = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return z;
    }

    public final boolean A0B(int numBytes) {
        int newByteOffset = this.A02;
        int i = numBytes / 8;
        int i2 = this.A02 + i;
        int i3 = (this.A00 + numBytes) - (i * 8);
        if (i3 > 7) {
            i2++;
            i3 -= 8;
        }
        int i4 = newByteOffset + 1;
        while (i4 <= i2 && i2 < this.A01) {
            if (A02(i4)) {
                i2++;
                i4 += 2;
            }
            i4++;
        }
        int newBitOffset = this.A01;
        if (i2 >= newBitOffset) {
            return i2 == newBitOffset && i3 == 0;
        }
        return true;
    }
}
