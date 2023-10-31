package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcce implements Runnable {
    private final zzcbq zza;
    private boolean zzb = false;

    public zzcce(zzcbq zzcbqVar) {
        this.zza = zzcbqVar;
    }

    private final void zzc() {
        zzflv zzflvVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzflvVar.removeCallbacks(this);
        zzflvVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
