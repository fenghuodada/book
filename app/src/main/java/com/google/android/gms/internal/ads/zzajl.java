package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzajl {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfl zza = new zzfl(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfd zzb = new zzfd();

    public zzajl(int i) {
    }

    private final int zze(zzaap zzaapVar) {
        zzfd zzfdVar = this.zzb;
        byte[] bArr = zzfn.zzf;
        int length = bArr.length;
        zzfdVar.zzD(bArr, 0);
        this.zzc = true;
        zzaapVar.zzj();
        return 0;
    }

    public final int zza(zzaap zzaapVar, zzabk zzabkVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzaapVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzaapVar.zzd();
            int min = (int) Math.min(112800L, zzd);
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
            int zzd2 = zzfdVar.zzd();
            int i2 = zzd2 - 188;
            while (true) {
                if (i2 < zzc) {
                    break;
                }
                byte[] zzH = zzfdVar.zzH();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < zzc || i5 >= zzd2 || zzH[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long zzb = zzajv.zzb(zzfdVar, i2, i);
                            if (zzb != -9223372036854775807L) {
                                j = zzb;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzaapVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzaapVar);
                return 0;
            }
            long zzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb2;
            if (zzb2 < 0) {
                zzer.zze("TsDurationReader", "Invalid duration: " + zzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzaapVar);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, zzaapVar.zzd());
            if (zzaapVar.zzf() != 0) {
                zzabkVar.zza = 0L;
                return 1;
            }
            this.zzb.zzC(min2);
            zzaapVar.zzj();
            ((zzaae) zzaapVar).zzm(this.zzb.zzH(), 0, min2, false);
            zzfd zzfdVar2 = this.zzb;
            int zzc2 = zzfdVar2.zzc();
            int zzd3 = zzfdVar2.zzd();
            while (true) {
                if (zzc2 >= zzd3) {
                    break;
                }
                if (zzfdVar2.zzH()[zzc2] == 71) {
                    long zzb3 = zzajv.zzb(zzfdVar2, zzc2, i);
                    if (zzb3 != -9223372036854775807L) {
                        j = zzb3;
                        break;
                    }
                }
                zzc2++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfl zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
