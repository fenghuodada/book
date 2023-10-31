package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzajc {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfl zza = new zzfl(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfd zzb = new zzfd();

    public static long zzc(zzfd zzfdVar) {
        int zzc = zzfdVar.zzc();
        if (zzfdVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfdVar.zzB(bArr, 0, 9);
        zzfdVar.zzF(zzc);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((255 & bArr[3]) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzaap zzaapVar) {
        zzfd zzfdVar = this.zzb;
        byte[] bArr = zzfn.zzf;
        int length = bArr.length;
        zzfdVar.zzD(bArr, 0);
        this.zzc = true;
        zzaapVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzaap zzaapVar, zzabk zzabkVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzaapVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j2 = zzd - min;
            if (zzaapVar.zzf() != j2) {
                zzabkVar.zza = j2;
                return 1;
            }
            this.zzb.zzC(min);
            zzaapVar.zzj();
            ((zzaae) zzaapVar).zzm(this.zzb.zzH(), 0, min, false);
            zzfd zzfdVar = this.zzb;
            int zzc = zzfdVar.zzc();
            int zzd2 = zzfdVar.zzd() - 4;
            while (true) {
                if (zzd2 < zzc) {
                    break;
                }
                if (zzg(zzfdVar.zzH(), zzd2) == 442) {
                    zzfdVar.zzF(zzd2 + 4);
                    long zzc2 = zzc(zzfdVar);
                    if (zzc2 != -9223372036854775807L) {
                        j = zzc2;
                        break;
                    }
                }
                zzd2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzaapVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzaapVar);
                return 0;
            }
            long zzb = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb;
            if (zzb < 0) {
                zzer.zze("PsDurationReader", "Invalid duration: " + zzb + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zzf(zzaapVar);
            return 0;
        } else {
            int min2 = (int) Math.min(20000L, zzaapVar.zzd());
            if (zzaapVar.zzf() != 0) {
                zzabkVar.zza = 0L;
                return 1;
            }
            this.zzb.zzC(min2);
            zzaapVar.zzj();
            ((zzaae) zzaapVar).zzm(this.zzb.zzH(), 0, min2, false);
            zzfd zzfdVar2 = this.zzb;
            int zzc3 = zzfdVar2.zzc();
            int zzd3 = zzfdVar2.zzd();
            while (true) {
                if (zzc3 >= zzd3 - 3) {
                    break;
                }
                if (zzg(zzfdVar2.zzH(), zzc3) == 442) {
                    zzfdVar2.zzF(zzc3 + 4);
                    long zzc4 = zzc(zzfdVar2);
                    if (zzc4 != -9223372036854775807L) {
                        j = zzc4;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfl zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
