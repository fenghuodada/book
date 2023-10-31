package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgcs {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j6 = j + (j2 >> 26);
                long j7 = j6 & 67108863;
                long j8 = j3 + (j6 >> 26);
                long j9 = j8 & 67108863;
                long j10 = j4 + (j8 >> 26);
                long j11 = j10 & 67108863;
                long j12 = ((j10 >> 26) * 5) + j5;
                long j13 = j12 >> 26;
                long j14 = j12 & 67108863;
                long j15 = j14 + 5;
                long j16 = (j2 & 67108863) + j13;
                long j17 = j16 + (j15 >> 26);
                long j18 = (j17 >> 26) + j7;
                long j19 = j9 + (j18 >> 26);
                long j20 = (j11 + (j19 >> 26)) - 67108864;
                long j21 = j20 >> 63;
                long j22 = ~j21;
                long j23 = (j16 & j21) | (j17 & 67108863 & j22);
                long j24 = (j7 & j21) | (j18 & 67108863 & j22);
                long j25 = (j9 & j21) | (j19 & 67108863 & j22);
                long j26 = (j11 & j21) | (j20 & j22);
                long zzc = (((j14 & j21) | (j15 & 67108863 & j22) | (j23 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = (((j23 >> 6) | (j24 << 20)) & 4294967295L) + zzc(bArr, 20);
                long zzc3 = (((j25 << 14) | (j24 >> 12)) & 4294967295L) + zzc(bArr, 24);
                long zzc4 = (((j25 >> 18) | (j26 << 8)) & 4294967295L) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                long j27 = zzc2 + (zzc >> 32);
                zzd(bArr4, j27 & 4294967295L, 4);
                long j28 = zzc3 + (j27 >> 32);
                zzd(bArr4, j28 & 4294967295L, 8);
                zzd(bArr4, (zzc4 + (j28 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i, (byte) 0);
            }
            long j29 = zzb5 * 5;
            long j30 = zzb4 * 5;
            long j31 = zzb3 * 5;
            long zzb6 = j5 + zzb(bArr3, 0, 0);
            long zzb7 = j2 + zzb(bArr3, 3, 2);
            long zzb8 = j + zzb(bArr3, 6, 4);
            long zzb9 = j3 + zzb(bArr3, 9, 6);
            long zzb10 = j4 + (zzb(bArr3, 12, 8) | (bArr3[16] << 24));
            long j32 = zzb7 * zzb;
            long j33 = zzb7 * zzb2;
            long j34 = zzb8 * zzb;
            long j35 = zzb7 * zzb3;
            long j36 = zzb8 * zzb2;
            long j37 = zzb9 * zzb;
            long j38 = zzb7 * zzb4;
            long j39 = zzb8 * zzb3;
            long j40 = zzb9 * zzb2;
            long j41 = zzb10 * zzb;
            long j42 = (zzb2 * 5 * zzb10) + (zzb9 * j31) + (zzb8 * j30) + (zzb7 * j29) + (zzb6 * zzb);
            long j43 = j42 & 67108863;
            long j44 = zzb9 * j30;
            long j45 = j31 * zzb10;
            long j46 = j45 + j44 + (zzb8 * j29) + (zzb6 * zzb2) + j32 + (j42 >> 26);
            long j47 = j30 * zzb10;
            long j48 = j47 + (zzb9 * j29) + (zzb6 * zzb3) + j33 + j34 + (j46 >> 26);
            long j49 = (zzb10 * j29) + (zzb6 * zzb4) + j35 + j36 + j37 + (j48 >> 26);
            long j50 = (zzb6 * zzb5) + j38 + j39 + j40 + j41 + (j49 >> 26);
            long j51 = ((j50 >> 26) * 5) + j43;
            j2 = (j46 & 67108863) + (j51 >> 26);
            i2 += 16;
            j = j48 & 67108863;
            j3 = j49 & 67108863;
            j4 = j50 & 67108863;
            i = 17;
            j5 = j51 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i, int i2) {
        return (zzc(bArr, i) >> i2) & 67108863;
    }

    private static long zzc(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return (((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
