package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcbn implements Runnable {
    final /* synthetic */ zzcbq zza;

    public zzcbn(zzcbq zzcbqVar) {
        this.zza = zzcbqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceCreated", new String[0]);
    }
}
