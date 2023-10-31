package com.adcolony.sdk;

import com.ambrose.overwall.R;
import java.util.Arrays;

/* renamed from: com.adcolony.sdk.e4 */
/* loaded from: classes.dex */
public final class C2102e4 implements InterfaceC2356w5 {

    /* renamed from: a */
    public static final int[] f5100a = {R.attr.resize_mode};

    /* renamed from: b */
    public static byte[] m9639b(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            byte b = 0;
            long m9638c = (m9638c(0, bArr) >> 0) & 67108863 & 67108863;
            long m9638c2 = (m9638c(3, bArr) >> 2) & 67108863 & 67108611;
            long m9638c3 = (m9638c(6, bArr) >> 4) & 67108863 & 67092735;
            long m9638c4 = (m9638c(9, bArr) >> 6) & 67108863 & 66076671;
            long m9638c5 = (m9638c(12, bArr) >> 8) & 67108863 & 1048575;
            long j = m9638c2 * 5;
            long j2 = m9638c3 * 5;
            long j3 = m9638c4 * 5;
            long j4 = m9638c5 * 5;
            int i = 17;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            int i2 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (i2 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i2);
                System.arraycopy(bArr2, i2, bArr3, b, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i, b);
                }
                long m9638c6 = j9 + ((m9638c(b, bArr3) >> b) & 67108863);
                long m9638c7 = j5 + ((m9638c(3, bArr3) >> 2) & 67108863);
                long m9638c8 = j6 + ((m9638c(6, bArr3) >> 4) & 67108863);
                long m9638c9 = j7 + ((m9638c(9, bArr3) >> 6) & 67108863);
                long m9638c10 = j8 + (((m9638c(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
                long j10 = (m9638c10 * j) + (m9638c9 * j2) + (m9638c8 * j3) + (m9638c7 * j4) + (m9638c6 * m9638c);
                long j11 = (m9638c10 * j2) + (m9638c9 * j3) + (m9638c8 * j4) + (m9638c7 * m9638c) + (m9638c6 * m9638c2);
                long j12 = (m9638c10 * j3) + (m9638c9 * j4) + (m9638c8 * m9638c) + (m9638c7 * m9638c2) + (m9638c6 * m9638c3);
                long j13 = (m9638c9 * m9638c) + (m9638c8 * m9638c2) + (m9638c7 * m9638c3) + (m9638c6 * m9638c4);
                long j14 = m9638c9 * m9638c2;
                long j15 = m9638c10 * m9638c;
                long j16 = j11 + (j10 >> 26);
                long j17 = j12 + (j16 >> 26);
                long j18 = (m9638c10 * j4) + j13 + (j17 >> 26);
                long j19 = j15 + j14 + (m9638c8 * m9638c3) + (m9638c7 * m9638c4) + (m9638c6 * m9638c5) + (j18 >> 26);
                long j20 = j19 >> 26;
                j8 = j19 & 67108863;
                long j21 = (j20 * 5) + (j10 & 67108863);
                i2 += 16;
                j6 = j17 & 67108863;
                j7 = j18 & 67108863;
                j9 = j21 & 67108863;
                j5 = (j16 & 67108863) + (j21 >> 26);
                b = 0;
                i = 17;
            }
            long j22 = j6 + (j5 >> 26);
            long j23 = j22 & 67108863;
            long j24 = j7 + (j22 >> 26);
            long j25 = j24 & 67108863;
            long j26 = j8 + (j24 >> 26);
            long j27 = j26 & 67108863;
            long j28 = ((j26 >> 26) * 5) + j9;
            long j29 = j28 >> 26;
            long j30 = j28 & 67108863;
            long j31 = (j5 & 67108863) + j29;
            long j32 = j30 + 5;
            long j33 = j32 & 67108863;
            long j34 = j31 + (j32 >> 26);
            long j35 = j23 + (j34 >> 26);
            long j36 = j25 + (j35 >> 26);
            long j37 = (j27 + (j36 >> 26)) - 67108864;
            long j38 = j37 >> 63;
            long j39 = ~j38;
            long j40 = (j31 & j38) | (j34 & 67108863 & j39);
            long j41 = (j23 & j38) | (j35 & 67108863 & j39);
            long j42 = (j36 & 67108863 & j39) | (j25 & j38);
            long j43 = (j37 & j39) | (j27 & j38);
            long m9638c11 = m9638c(16, bArr) + (((j30 & j38) | (j33 & j39) | (j40 << 26)) & 4294967295L);
            long j44 = m9638c11 & 4294967295L;
            long m9638c12 = m9638c(20, bArr) + (((j40 >> 6) | (j41 << 20)) & 4294967295L) + (m9638c11 >> 32);
            long m9638c13 = m9638c(24, bArr) + (((j41 >> 12) | (j42 << 14)) & 4294967295L) + (m9638c12 >> 32);
            long m9638c14 = m9638c(28, bArr);
            byte[] bArr4 = new byte[16];
            m9637d(bArr4, j44, 0);
            m9637d(bArr4, m9638c12 & 4294967295L, 4);
            m9637d(bArr4, m9638c13 & 4294967295L, 8);
            m9637d(bArr4, (m9638c14 + (((j42 >> 18) | (j43 << 8)) & 4294967295L) + (m9638c13 >> 32)) & 4294967295L, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    /* renamed from: c */
    public static long m9638c(int i, byte[] bArr) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    /* renamed from: d */
    public static void m9637d(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    @Override // com.adcolony.sdk.InterfaceC2356w5
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo9462a(Object obj) {
        C2061b4 c2061b4 = (C2061b4) obj;
    }
}
