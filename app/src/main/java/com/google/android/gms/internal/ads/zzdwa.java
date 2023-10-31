package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzdwa implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdwa(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzdvz zzb() {
        Map zzd = ((zzgvv) this.zza).zzd();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzdvz(zzd, zzfwcVar, ((zzcyc) this.zzc).zzb());
    }
}
