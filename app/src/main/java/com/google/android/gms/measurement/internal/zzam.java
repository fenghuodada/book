package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzam implements Runnable {
    final /* synthetic */ zzgy zza;
    final /* synthetic */ zzan zzb;

    public zzam(zzan zzanVar, zzgy zzgyVar) {
        this.zzb = zzanVar;
        this.zza = zzgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzay();
        if (zzab.zza()) {
            this.zza.zzaB().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0L;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
