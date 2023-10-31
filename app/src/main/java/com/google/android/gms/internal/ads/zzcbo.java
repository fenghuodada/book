package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcbo implements Runnable {
    final /* synthetic */ zzcbq zza;

    public zzcbo(zzcbq zzcbqVar) {
        this.zza = zzcbqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
