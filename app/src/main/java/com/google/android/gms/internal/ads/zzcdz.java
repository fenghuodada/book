package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzcdz implements zzkg {
    private final zzxm zzb = new zzxm(true, 65536);
    private long zzc = 15000000;
    private long zzd = 30000000;
    private long zze = 2500000;
    private long zzf = 5000000;
    private int zzg;
    private boolean zzh;

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final /* synthetic */ void zze(zzcx zzcxVar, zzbx zzbxVar, zzle[] zzleVarArr, zzvk zzvkVar, zzwx[] zzwxVarArr) {
        int i = 0;
        this.zzg = 0;
        while (true) {
            int length = zzleVarArr.length;
            if (i >= 2) {
                this.zzb.zzf(this.zzg);
                return;
            }
            if (zzwxVarArr[i] != null) {
                this.zzg += zzleVarArr[i].zzb() != 1 ? 131072000 : 13107200;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzg(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = j2 > this.zzd ? false : j2 < this.zzc ? true : true;
        int zza = this.zzb.zza();
        int i = this.zzg;
        if (!z2 && (!z2 || !this.zzh || zza >= i)) {
            z = false;
        }
        this.zzh = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final /* synthetic */ boolean zzh(zzcx zzcxVar, zzbx zzbxVar, long j, float f, boolean z, long j2) {
        long j3 = z ? this.zzf : this.zze;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzxm zzi() {
        return this.zzb;
    }

    @VisibleForTesting
    public final void zzj(boolean z) {
        this.zzg = 0;
        this.zzh = false;
        if (z) {
            this.zzb.zze();
        }
    }

    public final synchronized void zzk(int i) {
        this.zze = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzf = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = i * 1000;
    }
}
