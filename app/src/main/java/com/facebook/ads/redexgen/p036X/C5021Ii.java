package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Ii */
/* loaded from: assets/audience_network.dex */
public final class C5021Ii {
    public static String[] A04 = {"RHSjJGYddlOPzslamo8j", "no2wrOKISs4wdINa", "E7xZIMZbElFQthX5cbe1zXMBiqq9Oct2", "NQ4djAykaRRiHV2nkQWoiztobM3LGBfO", "EDikhWaymQH2jtWvDyx1vViO84FhvN", "TllFBKS94wZfNNX6FcczOhdwmX6snrOZ", "CS63JXje", "QpZzHKHty24GTaxrVVV4B8DIrBZ4Gw8P"};
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C5021Ii() {
    }

    public C5021Ii(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C5021Ii(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A02 = i;
    }

    private void A00() {
        int i;
        int i2 = this.A03;
        C4997IK.A04(i2 >= 0 && (i2 < (i = this.A02) || (i2 == i && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        C4997IK.A04(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int returnValue) {
        int i;
        if (returnValue == 0) {
            return 0;
        }
        int i2 = 0;
        this.A01 += returnValue;
        while (true) {
            i = this.A01;
            if (i <= 8) {
                break;
            }
            this.A01 = i - 8;
            byte[] bArr = this.A00;
            int i3 = this.A03;
            this.A03 = i3 + 1;
            i2 |= (bArr[i3] & 255) << this.A01;
        }
        byte[] bArr2 = this.A00;
        int i4 = this.A03;
        int i5 = (i2 | ((bArr2[i4] & 255) >> (8 - i))) & ((-1) >>> (32 - returnValue));
        if (i == 8) {
            this.A01 = 0;
            this.A03 = i4 + 1;
        }
        A00();
        return i5;
    }

    public final void A05() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A06() {
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A07(int i) {
        this.A03 = i / 8;
        this.A01 = i - (this.A03 * 8);
        A00();
    }

    public final void A08(int i) {
        int i2 = i / 8;
        this.A03 += i2;
        this.A01 += i - (i2 * 8);
        int i3 = this.A01;
        if (i3 > 7) {
            this.A03++;
            this.A01 = i3 - 8;
        }
        A00();
    }

    public final void A09(int i) {
        C4997IK.A04(this.A01 == 0);
        this.A03 += i;
        A00();
    }

    public final void A0A(int i, int firstByteReadSize) {
        if (firstByteReadSize < 32) {
            i &= (1 << firstByteReadSize) - 1;
        }
        int min = Math.min(8 - this.A01, firstByteReadSize);
        int firstByteRightPaddingSize = this.A01;
        int i2 = (8 - firstByteRightPaddingSize) - min;
        byte[] bArr = this.A00;
        int i3 = this.A03;
        bArr[i3] = (byte) (bArr[i3] & ((65280 >> firstByteRightPaddingSize) | ((1 << i2) - 1)));
        int firstByteInputBits = bArr[i3];
        bArr[i3] = (byte) (firstByteInputBits | ((i >>> (firstByteReadSize - min)) << i2));
        int i4 = firstByteReadSize - min;
        int i5 = i3 + 1;
        while (i4 > 8) {
            this.A00[i5] = (byte) (i >>> (i4 - 8));
            i4 -= 8;
            i5++;
        }
        int currentByteIndex = 8 - i4;
        byte[] bArr2 = this.A00;
        bArr2[i5] = (byte) (bArr2[i5] & ((1 << currentByteIndex) - 1));
        int lastByteInput = i & ((1 << i4) - 1);
        byte b = (byte) (bArr2[i5] | (lastByteInput << currentByteIndex));
        if (A04[3].charAt(20) != 'i') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[4] = "HDn8cIfTWSkx257fNKtZvpUDi4vYZW";
        strArr[6] = "YQkUGCO4";
        bArr2[i5] = b;
        A08(firstByteReadSize);
        A00();
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i;
    }

    public final void A0D(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.A00;
            int i4 = this.A03;
            this.A03 = i4 + 1;
            byte b = bArr2[i4];
            int i5 = this.A01;
            bArr[i] = (byte) (b << i5);
            bArr[i] = (byte) (((255 & bArr2[this.A03]) >> (8 - i5)) | bArr[i]);
            i++;
        }
        int i6 = i2 & 7;
        if (i6 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i6));
            int i7 = this.A01;
            if (i7 + i6 > 8) {
                int i8 = bArr[i3];
                byte[] bArr3 = this.A00;
                int i9 = this.A03;
                this.A03 = i9 + 1;
                bArr[i3] = (byte) (i8 | ((bArr3[i9] & 255) << i7));
                this.A01 = i7 - 8;
            }
            this.A01 += i6;
            byte[] bArr4 = this.A00;
            int i10 = this.A03;
            int i11 = this.A01;
            bArr[i3] = (byte) (bArr[i3] | ((byte) (((255 & bArr4[i10]) >> (8 - i11)) << (8 - i6))));
            if (i11 == 8) {
                this.A01 = 0;
                this.A03 = i10 + 1;
            }
            A00();
        }
    }

    public final void A0E(byte[] bArr, int i, int i2) {
        C4997IK.A04(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i, i2);
        this.A03 += i2;
        A00();
    }

    public final boolean A0F() {
        boolean z = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A06();
        return z;
    }
}
