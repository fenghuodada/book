package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzki implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzkp zzb;

    public zzki(zzkp zzkpVar, long j) {
        this.zzb = zzkpVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp.zzj(this.zzb, this.zza);
    }
}
