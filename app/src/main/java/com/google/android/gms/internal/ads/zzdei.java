package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdei implements zzgvo {
    private final zzgwb zza;

    public zzdei(zzgwb zzgwbVar) {
        this.zza = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdco((zzdfb) this.zza.zzb(), zzcag.zzf));
        zzgvw.zzb(singleton);
        return singleton;
    }
}
