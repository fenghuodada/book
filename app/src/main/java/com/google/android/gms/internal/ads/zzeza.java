package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzeza implements zzeju {
    final /* synthetic */ zzezc zza;

    public zzeza(zzezc zzezcVar) {
        this.zza = zzezcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdmo zzdmoVar;
        zzezs zzezsVar;
        synchronized (this.zza) {
            this.zza.zzd = (zzdmo) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdh)).booleanValue()) {
                zzezt zzd = ((zzdmo) obj).zzd();
                zzezsVar = this.zza.zzc;
                zzd.zza = zzezsVar;
            }
            zzdmoVar = this.zza.zzd;
            zzdmoVar.zzj();
        }
    }
}
