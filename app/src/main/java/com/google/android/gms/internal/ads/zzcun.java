package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class zzcun implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;
    private final zzgwb zzi;
    private final zzgwb zzj;
    private final zzgwb zzk;

    public zzcun(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6, zzgwb zzgwbVar7, zzgwb zzgwbVar8, zzgwb zzgwbVar9, zzgwb zzgwbVar10, zzgwb zzgwbVar11) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
        this.zzf = zzgwbVar6;
        this.zzg = zzgwbVar7;
        this.zzh = zzgwbVar8;
        this.zzi = zzgwbVar9;
        this.zzj = zzgwbVar10;
        this.zzk = zzgwbVar11;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzcum zzb() {
        zzfed zzfedVar = (zzfed) this.zza.zzb();
        zzbzz zza = ((zzchn) this.zzb).zza();
        ApplicationInfo zzb = ((zzdul) this.zzc).zzb();
        String zzb2 = ((zzdur) this.zzd).zzb();
        zzbbc zzbbcVar = zzbbk.zza;
        return new zzcum(zzfedVar, zza, zzb, zzb2, com.google.android.gms.ads.internal.client.zzba.zza().zza(), (PackageInfo) this.zzf.zzb(), zzgvn.zza(this.zzg), ((zzcha) this.zzh).zzb(), (String) this.zzi.zzb(), ((zzequ) this.zzj).zzb(), ((zzcuz) this.zzk).zza());
    }
}
