package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzlk implements zzkh {
    private final zzdz zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzci zze = zzci.zza;

    public zzlk(zzdz zzdzVar) {
        this.zza = zzdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final long zza() {
        long j = this.zzc;
        if (this.zzb) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
            zzci zzciVar = this.zze;
            return j + (zzciVar.zzc == 1.0f ? zzfn.zzo(elapsedRealtime) : zzciVar.zza(elapsedRealtime));
        }
        return j;
    }

    public final void zzb(long j) {
        this.zzc = j;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final zzci zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void zzg(zzci zzciVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzciVar;
    }
}
