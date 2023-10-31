package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzddy implements zzgvo {
    private final zzddt zza;
    private final zzgwb zzb;

    public zzddy(zzddt zzddtVar, zzgwb zzgwbVar) {
        this.zza = zzddtVar;
        this.zzb = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdco((zzcuf) this.zzb.zzb(), zzcag.zzf));
        zzgvw.zzb(singleton);
        return singleton;
    }
}
