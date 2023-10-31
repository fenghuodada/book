package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzejp implements zzeju {
    final /* synthetic */ zzejq zza;

    public zzejp(zzejq zzejqVar) {
        this.zza = zzejqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzcrf) obj).zzl();
            ((zzcrf) obj).zzj();
        }
    }
}
