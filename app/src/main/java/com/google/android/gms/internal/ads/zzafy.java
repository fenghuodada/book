package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0486c;

/* loaded from: classes.dex */
final class zzafy implements zzafx {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzafy(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    @Nullable
    public static zzafy zza(long j, long j2, zzabh zzabhVar, zzfd zzfdVar) {
        int i;
        int zzk;
        zzfdVar.zzG(10);
        int zze = zzfdVar.zze();
        if (zze <= 0) {
            return null;
        }
        int i2 = zzabhVar.zzd;
        if (i2 >= 32000) {
            i = 1152;
        } else {
            i = 576;
        }
        long zzp = zzfn.zzp(zze, i * 1000000, i2);
        int zzo = zzfdVar.zzo();
        int zzo2 = zzfdVar.zzo();
        int zzo3 = zzfdVar.zzo();
        zzfdVar.zzG(2);
        long j3 = j2 + zzabhVar.zzc;
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i3 = 0;
        long j4 = j2;
        while (i3 < zzo) {
            long j5 = zzp;
            jArr[i3] = (i3 * zzp) / zzo;
            jArr2[i3] = Math.max(j4, j3);
            if (zzo3 != 1) {
                if (zzo3 != 2) {
                    if (zzo3 != 3) {
                        if (zzo3 != 4) {
                            return null;
                        }
                        zzk = zzfdVar.zzn();
                    } else {
                        zzk = zzfdVar.zzm();
                    }
                } else {
                    zzk = zzfdVar.zzo();
                }
            } else {
                zzk = zzfdVar.zzk();
            }
            j4 += zzk * zzo2;
            i3++;
            zzp = j5;
        }
        long j6 = zzp;
        if (j != -1 && j != j4) {
            StringBuilder m12390a = C0486c.m12390a("VBRI data size mismatch: ", j, ", ");
            m12390a.append(j4);
            zzer.zze("VbriSeeker", m12390a.toString());
        }
        return new zzafy(jArr, jArr2, j6, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final long zzc(long j) {
        return this.zza[zzfn.zzc(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        int zzc = zzfn.zzc(this.zza, j, true, true);
        zzabo zzaboVar = new zzabo(this.zza[zzc], this.zzb[zzc]);
        if (zzaboVar.zzb < j) {
            long[] jArr = this.zza;
            if (zzc != jArr.length - 1) {
                int i = zzc + 1;
                return new zzabl(zzaboVar, new zzabo(jArr[i], this.zzb[i]));
            }
        }
        return new zzabl(zzaboVar, zzaboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return true;
    }
}
