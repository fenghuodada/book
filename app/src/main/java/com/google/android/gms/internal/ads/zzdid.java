package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdid implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;
    private final zzgwb zzi;

    public zzdid(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6, zzgwb zzgwbVar7, zzgwb zzgwbVar8, zzgwb zzgwbVar9) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
        this.zzf = zzgwbVar6;
        this.zzg = zzgwbVar7;
        this.zzh = zzgwbVar8;
        this.zzi = zzgwbVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzdic zzb() {
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzdic(((zzcha) this.zza).zzb(), ((zzcuz) this.zzb).zza(), (zzdhh) this.zzc.zzb(), ((zzdhv) this.zzd).zza(), (zzdio) this.zze.zzb(), (zzdiw) this.zzf.zzb(), (Executor) this.zzg.zzb(), zzfwcVar, (zzdgz) this.zzi.zzb());
    }
}
