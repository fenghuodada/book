package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcti implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzcti(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdco((zzczp) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
