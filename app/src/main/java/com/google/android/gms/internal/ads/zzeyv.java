package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeyv implements zzeju {
    final /* synthetic */ zzeyw zza;

    public zzeyv(zzeyw zzeywVar) {
        this.zza = zzeywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdmo zzdmoVar;
        zzezs zzezsVar;
        synchronized (this.zza) {
            this.zza.zzi = (zzdmo) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdh)).booleanValue()) {
                zzezt zzd = ((zzdmo) obj).zzd();
                zzezsVar = this.zza.zzd;
                zzd.zza = zzezsVar;
            }
            zzdmoVar = this.zza.zzi;
            zzdmoVar.zzj();
        }
    }
}
