package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzn implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzv().zzQ(this.zza, this.zzb.zza.zzI());
    }
}
