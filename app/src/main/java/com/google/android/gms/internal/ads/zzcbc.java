package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcbc implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcbg zzc;

    public zzcbc(zzcbg zzcbgVar, int i, int i2) {
        this.zzc = zzcbgVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbh zzcbhVar;
        zzcbh zzcbhVar2;
        zzcbg zzcbgVar = this.zzc;
        zzcbhVar = zzcbgVar.zzq;
        if (zzcbhVar != null) {
            zzcbhVar2 = zzcbgVar.zzq;
            zzcbhVar2.zzj(this.zza, this.zzb);
        }
    }
}
