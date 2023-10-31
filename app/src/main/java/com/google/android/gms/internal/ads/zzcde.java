package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcde implements Runnable {
    final /* synthetic */ zzcdf zza;

    public zzcde(zzcdf zzcdfVar) {
        this.zza = zzcdfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzy().zzc(this.zza);
    }
}
