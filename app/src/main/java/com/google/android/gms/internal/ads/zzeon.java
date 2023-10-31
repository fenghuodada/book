package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class zzeon implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;

    public zzeon(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzeol(zzfwcVar, ((zzcuz) this.zzb).zza(), (PackageInfo) this.zzc.zzb(), ((zzcha) this.zzd).zzb());
    }
}
