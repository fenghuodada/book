package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdfs implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;

    public zzdfs(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
        this.zzf = zzgwbVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcuq zza = ((zzcva) this.zzb).zza();
        zzdav zza2 = ((zzdbo) this.zzc).zza();
        zzdfh zza3 = ((zzdfj) this.zzd).zza();
        zzcxx zzb = ((zzcpc) this.zze).zzb();
        zzefk zzefkVar = (zzefk) this.zzf.zzb();
        zzcpz zzd = ((zzcgw) this.zza.zzb()).zzd();
        zzd.zzi(zza.zzj());
        zzd.zzf(zza2);
        zzd.zzd(zza3);
        zzd.zze(new zzeho(null));
        zzd.zzg(new zzcqx(zzb, null));
        zzd.zzc(new zzcpa(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdm)).booleanValue()) {
            zzd.zzj(zzefr.zzb(zzefkVar));
        }
        zzcri zzc = zzd.zzk().zzc();
        zzgvw.zzb(zzc);
        return zzc;
    }
}
