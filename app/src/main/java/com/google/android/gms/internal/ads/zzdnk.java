package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzdnk {
    private final zzcfn zza;
    private final Context zzb;
    private final zzaqq zzc;
    private final zzbcm zzd;
    private final zzbzz zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzawx zzg;
    private final zzcxx zzh;

    public zzdnk(zzcfn zzcfnVar, Context context, zzaqq zzaqqVar, zzbcm zzbcmVar, zzbzz zzbzzVar, com.google.android.gms.ads.internal.zza zzaVar, zzawx zzawxVar, zzcxx zzcxxVar) {
        this.zza = zzcfnVar;
        this.zzb = context;
        this.zzc = zzaqqVar;
        this.zzd = zzbcmVar;
        this.zze = zzbzzVar;
        this.zzf = zzaVar;
        this.zzg = zzawxVar;
        this.zzh = zzcxxVar;
    }

    public final zzcfb zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzezf zzezfVar, zzezi zzeziVar) throws zzcfm {
        return zzcfn.zza(this.zzb, zzcgq.zzc(zzqVar), zzqVar.zza, false, false, this.zzc, this.zzd, this.zze, null, new zzdmz(this), this.zzf, this.zzg, zzezfVar, zzeziVar);
    }
}
