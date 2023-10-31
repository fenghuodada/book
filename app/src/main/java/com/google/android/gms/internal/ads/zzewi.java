package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzewi implements zzeww {
    private final zzfbm zza;
    private final Executor zzb;
    private final zzfvn zzc = new zzewg(this);

    public zzewi(zzfbm zzfbmVar, Executor executor) {
        this.zza = zzfbmVar;
        this.zzb = executor;
    }

    public final /* synthetic */ zzfwb zza(zzcup zzcupVar, zzewr zzewrVar) throws Exception {
        zzfbw zzfbwVar = zzewrVar.zzb;
        zzbug zzbugVar = zzewrVar.zza;
        zzfbv zzb = zzfbwVar != null ? this.zza.zzb(zzfbwVar) : null;
        if (zzfbwVar == null) {
            return zzfvr.zzh(null);
        }
        if (zzb != null && zzbugVar != null) {
            zzfvr.zzq(zzcupVar.zzb().zzh(zzbugVar), this.zzc, this.zzb);
        }
        return zzfvr.zzh(new zzewh(zzfbwVar, zzbugVar, zzb));
    }

    public final zzfwb zzb(zzewx zzewxVar, zzewv zzewvVar, final zzcup zzcupVar) {
        return zzfvr.zze(zzfvr.zzm(zzfvi.zzv(new zzews(this.zza, zzcupVar, this.zzb).zzc()), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzewe
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzewi.this.zza(zzcupVar, (zzewr) obj);
            }
        }, this.zzb), Exception.class, new zzewf(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeww
    public final /* bridge */ /* synthetic */ zzfwb zzc(zzewx zzewxVar, zzewv zzewvVar, Object obj) {
        return zzb(zzewxVar, zzewvVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeww
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
