package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdkw implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdkw(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdku((Executor) this.zza.zzb(), (zzcoj) this.zzb.zzb(), (zzdcq) this.zzc.zzb());
    }
}
