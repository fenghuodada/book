package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzuv {
    private final zzfd zza = new zzfd(32);
    private zzuu zzb;
    private zzuu zzc;
    private zzuu zzd;
    private long zze;
    private final zzxm zzf;

    public zzuv(zzxm zzxmVar) {
        this.zzf = zzxmVar;
        zzuu zzuuVar = new zzuu(0L, 65536);
        this.zzb = zzuuVar;
        this.zzc = zzuuVar;
        this.zzd = zzuuVar;
    }

    private final int zzi(int i) {
        zzuu zzuuVar = this.zzd;
        if (zzuuVar.zzc == null) {
            zzxf zzb = this.zzf.zzb();
            zzuu zzuuVar2 = new zzuu(this.zzd.zzb, 65536);
            zzuuVar.zzc = zzb;
            zzuuVar.zzd = zzuuVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzuu zzj(zzuu zzuuVar, long j) {
        while (j >= zzuuVar.zzb) {
            zzuuVar = zzuuVar.zzd;
        }
        return zzuuVar;
    }

    private static zzuu zzk(zzuu zzuuVar, long j, ByteBuffer byteBuffer, int i) {
        zzuu zzj = zzj(zzuuVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzuu zzl(zzuu zzuuVar, long j, byte[] bArr, int i) {
        zzuu zzj = zzj(zzuuVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzuu zzm(zzuu zzuuVar, zzhi zzhiVar, zzux zzuxVar, zzfd zzfdVar) {
        zzuu zzuuVar2;
        if (zzhiVar.zzl()) {
            long j = zzuxVar.zzb;
            int i = 1;
            zzfdVar.zzC(1);
            zzuu zzl = zzl(zzuuVar, j, zzfdVar.zzH(), 1);
            long j2 = j + 1;
            byte b = zzfdVar.zzH()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            zzhf zzhfVar = zzhiVar.zza;
            byte[] bArr = zzhfVar.zza;
            if (bArr == null) {
                zzhfVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzuuVar2 = zzl(zzl, j2, zzhfVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzfdVar.zzC(2);
                zzuuVar2 = zzl(zzuuVar2, j3, zzfdVar.zzH(), 2);
                j3 += 2;
                i = zzfdVar.zzo();
            }
            int i4 = i;
            int[] iArr = zzhfVar.zzd;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhfVar.zze;
            if (iArr3 == null || iArr3.length < i4) {
                iArr3 = new int[i4];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i5 = i4 * 6;
                zzfdVar.zzC(i5);
                zzuuVar2 = zzl(zzuuVar2, j3, zzfdVar.zzH(), i5);
                j3 += i5;
                zzfdVar.zzF(0);
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr2[i6] = zzfdVar.zzo();
                    iArr4[i6] = zzfdVar.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzuxVar.zza - ((int) (j3 - zzuxVar.zzb));
            }
            zzabq zzabqVar = zzuxVar.zzc;
            int i7 = zzfn.zza;
            zzhfVar.zzc(i4, iArr2, iArr4, zzabqVar.zzb, zzhfVar.zza, zzabqVar.zza, zzabqVar.zzc, zzabqVar.zzd);
            long j4 = zzuxVar.zzb;
            int i8 = (int) (j3 - j4);
            zzuxVar.zzb = j4 + i8;
            zzuxVar.zza -= i8;
        } else {
            zzuuVar2 = zzuuVar;
        }
        if (!zzhiVar.zze()) {
            zzhiVar.zzj(zzuxVar.zza);
            return zzk(zzuuVar2, zzuxVar.zzb, zzhiVar.zzb, zzuxVar.zza);
        }
        zzfdVar.zzC(4);
        zzuu zzl2 = zzl(zzuuVar2, zzuxVar.zzb, zzfdVar.zzH(), 4);
        int zzn = zzfdVar.zzn();
        zzuxVar.zzb += 4;
        zzuxVar.zza -= 4;
        zzhiVar.zzj(zzn);
        zzuu zzk = zzk(zzl2, zzuxVar.zzb, zzhiVar.zzb, zzn);
        zzuxVar.zzb += zzn;
        int i9 = zzuxVar.zza - zzn;
        zzuxVar.zza = i9;
        ByteBuffer byteBuffer = zzhiVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            zzhiVar.zze = ByteBuffer.allocate(i9);
        } else {
            zzhiVar.zze.clear();
        }
        return zzk(zzk, zzuxVar.zzb, zzhiVar.zze, zzuxVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzuu zzuuVar = this.zzd;
        if (j == zzuuVar.zzb) {
            this.zzd = zzuuVar.zzd;
        }
    }

    public final int zza(zzt zztVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzuu zzuuVar = this.zzd;
        int zza = zztVar.zza(zzuuVar.zzc.zza, zzuuVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzuu zzuuVar;
        if (j != -1) {
            while (true) {
                zzuuVar = this.zzb;
                if (j < zzuuVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzuuVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzuuVar.zza) {
                this.zzc = zzuuVar;
            }
        }
    }

    public final void zzd(zzhi zzhiVar, zzux zzuxVar) {
        zzm(this.zzc, zzhiVar, zzuxVar, this.zza);
    }

    public final void zze(zzhi zzhiVar, zzux zzuxVar) {
        this.zzc = zzm(this.zzc, zzhiVar, zzuxVar, this.zza);
    }

    public final void zzf() {
        zzuu zzuuVar = this.zzb;
        if (zzuuVar.zzc != null) {
            this.zzf.zzd(zzuuVar);
            zzuuVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzuu zzuuVar2 = this.zzb;
        this.zzc = zzuuVar2;
        this.zzd = zzuuVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfd zzfdVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzuu zzuuVar = this.zzd;
            zzfdVar.zzB(zzuuVar.zzc.zza, zzuuVar.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
