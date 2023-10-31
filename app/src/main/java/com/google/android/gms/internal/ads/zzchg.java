package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzchg implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzchg(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzdzh zzdzhVar = (zzdzh) this.zza.zzb();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbS)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzid)).booleanValue()) {
                emptySet = Collections.singleton(new zzdco(zzdzhVar, zzfwcVar));
                zzgvw.zzb(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        zzgvw.zzb(emptySet);
        return emptySet;
    }
}
