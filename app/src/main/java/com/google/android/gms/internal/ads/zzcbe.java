package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcbe implements Runnable {
    final /* synthetic */ zzcbg zza;

    public zzcbe(zzcbg zzcbgVar) {
        this.zza = zzcbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbh zzcbhVar;
        boolean z;
        zzcbh zzcbhVar2;
        zzcbh zzcbhVar3;
        zzcbg zzcbgVar = this.zza;
        zzcbhVar = zzcbgVar.zzq;
        if (zzcbhVar != null) {
            z = zzcbgVar.zzr;
            if (!z) {
                zzcbhVar3 = zzcbgVar.zzq;
                zzcbhVar3.zzg();
                this.zza.zzr = true;
            }
            zzcbhVar2 = this.zza.zzq;
            zzcbhVar2.zze();
        }
    }
}
