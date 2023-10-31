package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbnh {
    private final zzbmk zza;
    private zzfwb zzb;

    public zzbnh(zzbmk zzbmkVar) {
        this.zza = zzbmkVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcal zzcalVar = new zzcal();
            this.zzb = zzcalVar;
            this.zza.zzb(null).zzi(new zzcap() { // from class: com.google.android.gms.internal.ads.zzbnf
                @Override // com.google.android.gms.internal.ads.zzcap
                public final void zza(Object obj) {
                    zzcal.this.zzd((zzbml) obj);
                }
            }, new zzcan() { // from class: com.google.android.gms.internal.ads.zzbng
                @Override // com.google.android.gms.internal.ads.zzcan
                public final void zza() {
                    zzcal.this.zze(new zzbmn("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbnk zza(String str, zzbmr zzbmrVar, zzbmq zzbmqVar) {
        zzd();
        return new zzbnk(this.zzb, "google.afma.activeView.handleUpdate", zzbmrVar, zzbmqVar);
    }

    public final void zzb(final String str, final zzbii zzbiiVar) {
        zzd();
        this.zzb = zzfvr.zzm(this.zzb, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzbnd
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                zzbml zzbmlVar = (zzbml) obj;
                zzbmlVar.zzq(str, zzbiiVar);
                return zzfvr.zzh(zzbmlVar);
            }
        }, zzcag.zzf);
    }

    public final void zzc(final String str, final zzbii zzbiiVar) {
        this.zzb = zzfvr.zzl(this.zzb, new zzfon() { // from class: com.google.android.gms.internal.ads.zzbne
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                zzbml zzbmlVar = (zzbml) obj;
                zzbmlVar.zzr(str, zzbiiVar);
                return zzbmlVar;
            }
        }, zzcag.zzf);
    }
}
