package cn.hutool.core.codec;

import cn.hutool.core.util.C2030a;
import cn.hutool.core.util.C2031b;
import java.nio.charset.Charset;
import okio.Utf8;

/* renamed from: cn.hutool.core.codec.d */
/* loaded from: classes.dex */
public final class C2027d {

    /* renamed from: a */
    public static final Charset f4897a = C2030a.f4901a;

    /* renamed from: b */
    public static final byte[] f4898b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: a */
    public static byte[] m9719a(CharSequence charSequence) {
        boolean z;
        byte[] bArr;
        byte b;
        byte b2;
        byte b3;
        int i;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte[] m9717a = C2031b.m9717a(charSequence, f4897a);
        boolean z2 = true;
        if (m9717a != null && m9717a.length != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int length = m9717a.length;
            if (m9717a.length != 0) {
                z2 = false;
            }
            if (!z2) {
                int i2 = (length + 0) - 1;
                int i3 = (length * 3) / 4;
                byte[] bArr2 = new byte[i3];
                int i4 = 0;
                int i5 = 0;
                while (i4 <= i2) {
                    while (true) {
                        bArr = f4898b;
                        if (i4 <= i2) {
                            int i6 = i4 + 1;
                            byte b8 = m9717a[i4];
                            if (b8 > -1 && (b7 = bArr[b8]) > -1) {
                                b = b7;
                                i4 = i6;
                                break;
                            }
                            i4 = i6;
                        } else {
                            b = -2;
                            break;
                        }
                    }
                    while (true) {
                        if (i4 <= i2) {
                            int i7 = i4 + 1;
                            byte b9 = m9717a[i4];
                            if (b9 > -1 && (b6 = bArr[b9]) > -1) {
                                b2 = b6;
                                i4 = i7;
                                break;
                            }
                            i4 = i7;
                        } else {
                            b2 = -2;
                            break;
                        }
                    }
                    while (true) {
                        if (i4 <= i2) {
                            int i8 = i4 + 1;
                            byte b10 = m9717a[i4];
                            if (b10 > -1 && (b5 = bArr[b10]) > -1) {
                                b3 = b5;
                                i4 = i8;
                                break;
                            }
                            i4 = i8;
                        } else {
                            b3 = -2;
                            break;
                        }
                    }
                    while (true) {
                        if (i4 <= i2) {
                            i = i4 + 1;
                            byte b11 = m9717a[i4];
                            if (b11 > -1 && (b4 = bArr[b11]) > -1) {
                                break;
                            }
                            i4 = i;
                        } else {
                            i = i4;
                            b4 = -2;
                            break;
                        }
                    }
                    if (-2 != b2) {
                        bArr2[i5] = (byte) ((b << 2) | (b2 >>> 4));
                        i5++;
                    }
                    if (-2 != b3) {
                        bArr2[i5] = (byte) (((b2 & 15) << 4) | (b3 >>> 2));
                        i5++;
                    }
                    if (-2 != b4) {
                        bArr2[i5] = (byte) (b4 | ((b3 & 3) << 6));
                        i5++;
                    }
                    i4 = i;
                }
                if (i5 == i3) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i5];
                System.arraycopy(bArr2, 0, bArr3, 0, i5);
                return bArr3;
            }
            return m9717a;
        }
        return m9717a;
    }
}
