package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeik implements zzeju {
    final /* synthetic */ zzeil zza;

    public zzeik(zzeil zzeilVar) {
        this.zza = zzeilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpd zzcpdVar;
        zzcpd zzcpdVar2;
        zzcpd zzcpdVar3;
        zzcpd zzcpdVar4 = (zzcpd) obj;
        synchronized (this.zza) {
            zzeil zzeilVar = this.zza;
            zzcpdVar = zzeilVar.zzi;
            if (zzcpdVar != null) {
                zzcpdVar3 = zzeilVar.zzi;
                zzcpdVar3.zzb();
            }
            this.zza.zzi = zzcpdVar4;
            zzcpdVar2 = this.zza.zzi;
            zzcpdVar2.zzj();
        }
    }
}
