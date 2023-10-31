package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
abstract class zzgsc {
    public static final String zzd(ByteBuffer byteBuffer, int i, int i2) throws zzgpi {
        if ((((byteBuffer.limit() - i) - i2) | i | i2) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!zzgsb.zzd(b)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (zzgsb.zzd(b2)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    i = i6;
                    while (true) {
                        i5 = i7;
                        if (i < i3) {
                            byte b3 = byteBuffer.get(i);
                            if (zzgsb.zzd(b3)) {
                                i++;
                                i7 = i5 + 1;
                                cArr[i5] = (char) b3;
                            }
                        }
                    }
                } else if (zzgsb.zzf(b2)) {
                    if (i6 >= i3) {
                        throw zzgpi.zzd();
                    }
                    zzgsb.zzc(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (zzgsb.zze(b2)) {
                    if (i6 >= i3 - 1) {
                        throw zzgpi.zzd();
                    }
                    int i8 = i6 + 1;
                    zzgsb.zzb(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else if (i6 >= i3 - 2) {
                    throw zzgpi.zzd();
                } else {
                    int i9 = i6 + 1;
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i9 + 1;
                    zzgsb.zza(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                    i = i10 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public abstract int zza(int i, byte[] bArr, int i2, int i3);

    public abstract String zzb(byte[] bArr, int i, int i2) throws zzgpi;

    public final boolean zzc(byte[] bArr, int i, int i2) {
        return zza(0, bArr, i, i2) == 0;
    }
}
