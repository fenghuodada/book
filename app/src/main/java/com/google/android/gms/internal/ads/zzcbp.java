package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcbp implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbq zzb;

    public zzcbp(zzcbq zzcbqVar, boolean z) {
        this.zzb = zzcbqVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
