package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcba implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcbg zzc;

    public zzcba(zzcbg zzcbgVar, String str, String str2) {
        this.zzc = zzcbgVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbh zzcbhVar;
        zzcbh zzcbhVar2;
        zzcbg zzcbgVar = this.zzc;
        zzcbhVar = zzcbgVar.zzq;
        if (zzcbhVar != null) {
            zzcbhVar2 = zzcbgVar.zzq;
            zzcbhVar2.zzb(this.zza, this.zzb);
        }
    }
}
