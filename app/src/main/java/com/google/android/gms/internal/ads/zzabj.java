package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;

/* loaded from: classes.dex */
public final class zzabj {
    public static int zza(ByteBuffer byteBuffer) {
        int i = byteBuffer.get(26) + 27;
        return (int) ((zze(byteBuffer.get(i), byteBuffer.limit() > 1 ? byteBuffer.get(i + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        return (int) ((zze(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzc(byte[] bArr) {
        return zze(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List zzd(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzg(zzf(((bArr[11] & 255) << 8) | (bArr[10] & 255))));
        arrayList.add(zzg(zzf(3840L)));
        return arrayList;
    }

    private static long zze(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = i3 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        return i * (i5 >= 16 ? 2500 << i2 : i5 >= 12 ? 10000 << (i2 & 1) : (i5 & 3) == 3 ? 60000 : 10000 << i2);
    }

    private static long zzf(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] zzg(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
