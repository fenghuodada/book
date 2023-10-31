package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzchh implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzchh(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdsg zzdsgVar = (zzdsg) this.zza.zzb();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbz)).booleanValue() ? Collections.singleton(new zzdco(zzdsgVar, zzfwcVar)) : Collections.emptySet();
        zzgvw.zzb(singleton);
        return singleton;
    }
}
