package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcbb implements Runnable {
    final /* synthetic */ zzcbg zza;

    public zzcbb(zzcbg zzcbgVar) {
        this.zza = zzcbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbh zzcbhVar;
        zzcbh zzcbhVar2;
        zzcbg zzcbgVar = this.zza;
        zzcbhVar = zzcbgVar.zzq;
        if (zzcbhVar != null) {
            zzcbhVar2 = zzcbgVar.zzq;
            zzcbhVar2.zzh();
        }
    }
}
