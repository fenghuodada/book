package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdor implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzdor(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeE)).booleanValue() ? Collections.singleton(new zzdco(((zzdpk) this.zzb).zzb(), zzfwcVar)) : Collections.emptySet();
        zzgvw.zzb(singleton);
        return singleton;
    }
}
