package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzejm implements zzeju {
    final /* synthetic */ zzejn zza;

    public zzejm(zzejn zzejnVar) {
        this.zza = zzejnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzddp zzddpVar;
        zzddp zzddpVar2 = (zzddp) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzddpVar2;
            zzddpVar = this.zza.zzj;
            zzddpVar.zzj();
        }
    }
}
