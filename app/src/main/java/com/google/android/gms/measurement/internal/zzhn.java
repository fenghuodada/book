package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhn implements Runnable {
    final /* synthetic */ zzik zza;

    public zzhn(zzik zzikVar) {
        this.zza = zzikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzb();
    }
}
