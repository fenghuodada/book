package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzky {
    private static final zztl zzt = new zztl(new Object());
    public final zzcx zza;
    public final zztl zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    @Nullable
    public final zzia zzf;
    public final boolean zzg;
    public final zzvk zzh;
    public final zzxe zzi;
    public final List zzj;
    public final zztl zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzci zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzky(zzcx zzcxVar, zztl zztlVar, long j, long j2, int i, @Nullable zzia zziaVar, boolean z, zzvk zzvkVar, zzxe zzxeVar, List list, zztl zztlVar2, boolean z2, int i2, zzci zzciVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzcxVar;
        this.zzb = zztlVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zziaVar;
        this.zzg = z;
        this.zzh = zzvkVar;
        this.zzi = zzxeVar;
        this.zzj = list;
        this.zzk = zztlVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzciVar;
        this.zzp = j3;
        this.zzq = j4;
        this.zzr = j5;
        this.zzs = j6;
        this.zzo = z3;
    }

    public static zzky zzi(zzxe zzxeVar) {
        zzcx zzcxVar = zzcx.zza;
        zztl zztlVar = zzt;
        return new zzky(zzcxVar, zztlVar, -9223372036854775807L, 0L, 1, null, false, zzvk.zza, zzxeVar, zzfrr.zzl(), zztlVar, false, 0, zzci.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zztl zzj() {
        return zzt;
    }

    public final long zza() {
        long j;
        long j2;
        if (zzk()) {
            do {
                j = this.zzs;
                j2 = this.zzr;
            } while (j != this.zzs);
            return zzfn.zzo(zzfn.zzq(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * this.zzn.zzc));
        }
        return this.zzr;
    }

    @CheckResult
    public final zzky zzb() {
        return new zzky(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, zza(), SystemClock.elapsedRealtime(), this.zzo);
    }

    @CheckResult
    public final zzky zzc(zztl zztlVar) {
        return new zzky(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zztlVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    @CheckResult
    public final zzky zzd(zztl zztlVar, long j, long j2, long j3, long j4, zzvk zzvkVar, zzxe zzxeVar, List list) {
        return new zzky(this.zza, zztlVar, j2, j3, this.zze, this.zzf, this.zzg, zzvkVar, zzxeVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, j4, j, SystemClock.elapsedRealtime(), this.zzo);
    }

    @CheckResult
    public final zzky zze(boolean z, int i) {
        return new zzky(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    @CheckResult
    public final zzky zzf(@Nullable zzia zziaVar) {
        return new zzky(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zziaVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    @CheckResult
    public final zzky zzg(int i) {
        return new zzky(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    @CheckResult
    public final zzky zzh(zzcx zzcxVar) {
        return new zzky(zzcxVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final boolean zzk() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
