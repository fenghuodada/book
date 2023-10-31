package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcjl implements zzevu {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzcir zzd;
    private final zzcjl zze = this;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;
    private final zzgwb zzi;
    private final zzgwb zzj;
    private final zzgwb zzk;

    public /* synthetic */ zzcjl(zzcir zzcirVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcjk zzcjkVar) {
        zzgwb zzgwbVar;
        zzgwb zzgwbVar2;
        zzgwb zzgwbVar3;
        this.zzd = zzcirVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzgvo zza = zzgvp.zza(context);
        this.zzf = zza;
        zzgvo zza2 = zzgvp.zza(zzqVar);
        this.zzg = zza2;
        zzgwbVar = zzcirVar.zzo;
        zzgwb zzc = zzgvn.zzc(new zzejg(zzgwbVar));
        this.zzh = zzc;
        zzgwb zzc2 = zzgvn.zzc(zzejl.zza());
        this.zzi = zzc2;
        zzgwb zzc3 = zzgvn.zzc(zzdag.zza());
        this.zzj = zzc3;
        zzgwbVar2 = zzcirVar.zzp;
        zzgwbVar3 = zzcirVar.zzU;
        this.zzk = zzgvn.zzc(new zzevs(zza, zzgwbVar2, zza2, zzgwbVar3, zzc, zzc2, zzfac.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzevu
    public final zzeil zza() {
        zzcgz zzcgzVar;
        zzgwb zzgwbVar;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb;
        String str = this.zzc;
        zzevr zzevrVar = (zzevr) this.zzk.zzb();
        zzejf zzejfVar = (zzejf) this.zzh.zzb();
        zzcgzVar = this.zzd.zza;
        zzbzz zzd = zzcgzVar.zzd();
        zzgvw.zzb(zzd);
        zzgwbVar = this.zzd.zzZ;
        return new zzeil(context, zzqVar, str, zzevrVar, zzejfVar, zzd, (zzdqc) zzgwbVar.zzb());
    }
}
