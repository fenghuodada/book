package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbzk extends Thread {
    final /* synthetic */ String zza;

    public zzbzk(zzbzm zzbzmVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzbzy(null).zza(this.zza);
    }
}
