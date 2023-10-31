package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcpu implements zzgvo {
    private final zzcpk zza;
    private final zzgwb zzb;

    public zzcpu(zzcpk zzcpkVar, zzgwb zzgwbVar) {
        this.zza = zzcpkVar;
        this.zzb = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdco((zzcqu) this.zzb.zzb(), zzcag.zzf));
        zzgvw.zzb(singleton);
        return singleton;
    }
}
