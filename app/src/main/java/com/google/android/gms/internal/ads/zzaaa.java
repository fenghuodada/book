package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public class zzaaa {
    protected final zzzu zza;
    protected final zzzz zzb;
    @Nullable
    protected zzzw zzc;
    private final int zzd;

    public zzaaa(zzzx zzzxVar, zzzz zzzzVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzzzVar;
        this.zzd = i;
        this.zza = new zzzu(zzzxVar, j, 0L, j3, j4, j5, j6);
    }

    public static final int zzf(zzaap zzaapVar, long j, zzabk zzabkVar) {
        if (j == zzaapVar.zzf()) {
            return 0;
        }
        zzabkVar.zza = j;
        return 1;
    }

    public static final boolean zzg(zzaap zzaapVar, long j) throws IOException {
        long zzf = j - zzaapVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzaae) zzaapVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzaap zzaapVar, zzabk zzabkVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            zzzw zzzwVar = this.zzc;
            zzdy.zzb(zzzwVar);
            j = zzzwVar.zzf;
            j2 = zzzwVar.zzg;
            j3 = zzzwVar.zzh;
            if (j2 - j <= this.zzd) {
                zzc(false, j);
                return zzf(zzaapVar, j, zzabkVar);
            } else if (!zzg(zzaapVar, j3)) {
                return zzf(zzaapVar, j3, zzabkVar);
            } else {
                zzaapVar.zzj();
                zzzz zzzzVar = this.zzb;
                j4 = zzzwVar.zzb;
                zzzy zza = zzzzVar.zza(zzaapVar, j4);
                i = zza.zzb;
                if (i == -3) {
                    zzc(false, j3);
                    return zzf(zzaapVar, j3, zzabkVar);
                } else if (i == -2) {
                    j10 = zza.zzc;
                    j11 = zza.zzd;
                    zzzw.zzh(zzzwVar, j10, j11);
                } else if (i != -1) {
                    j5 = zza.zzd;
                    zzg(zzaapVar, j5);
                    j6 = zza.zzd;
                    zzc(true, j6);
                    j7 = zza.zzd;
                    return zzf(zzaapVar, j7, zzabkVar);
                } else {
                    j8 = zza.zzc;
                    j9 = zza.zzd;
                    zzzw.zzg(zzzwVar, j8, j9);
                }
            }
        }
    }

    public final zzabn zzb() {
        return this.zza;
    }

    public final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzzw zzzwVar = this.zzc;
        if (zzzwVar != null) {
            j6 = zzzwVar.zza;
            if (j6 == j) {
                return;
            }
        }
        long zzf = this.zza.zzf(j);
        zzzu zzzuVar = this.zza;
        j2 = zzzuVar.zzc;
        j3 = zzzuVar.zzd;
        j4 = zzzuVar.zze;
        j5 = zzzuVar.zzf;
        this.zzc = new zzzw(j, zzf, 0L, j2, j3, j4, j5);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
