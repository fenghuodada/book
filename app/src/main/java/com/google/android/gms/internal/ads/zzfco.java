package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfco {
    private final zzfch zza;
    private final zzfwb zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfco(final zzfbm zzfbmVar, final zzfcg zzfcgVar, final zzfch zzfchVar) {
        this.zza = zzfchVar;
        this.zzb = zzfvr.zzf(zzfvr.zzm(zzfcgVar.zza(zzfchVar), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzfcm
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzfco.this.zzb(zzfcgVar, zzfbmVar, zzfchVar, (zzfbv) obj);
            }
        }, zzfchVar.zzb()), Exception.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzfcn
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzfco.this.zzc(zzfcgVar, (Exception) obj);
            }
        }, zzfchVar.zzb());
    }

    public final synchronized zzfwb zza(zzfch zzfchVar) {
        if (!this.zzd && !this.zzc) {
            if (this.zza.zza() != null && zzfchVar.zza() != null && this.zza.zza().equals(zzfchVar.zza())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ zzfwb zzb(zzfcg zzfcgVar, zzfbm zzfbmVar, zzfch zzfchVar, zzfbv zzfbvVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfcgVar.zzb(zzfbvVar);
            if (this.zzc) {
                return zzfvr.zzh(new zzfcf(zzfbvVar, zzfchVar));
            }
            zzfbmVar.zzd(zzfchVar.zza(), zzfbvVar);
            return zzfvr.zzh(null);
        }
    }

    public final /* synthetic */ zzfwb zzc(zzfcg zzfcgVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfvn zzfvnVar) {
        zzfvr.zzq(zzfvr.zzm(this.zzb, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzfcl
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                zzfcf zzfcfVar = (zzfcf) obj;
                return zzfvr.zzi();
            }
        }, this.zza.zzb()), zzfvnVar, this.zza.zzb());
    }
}
