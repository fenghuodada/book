package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdjk implements zzgvo {
    private final zzdjd zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdjk(zzdjd zzdjdVar, zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzdjdVar;
        this.zzb = zzgwbVar;
        this.zzc = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdco(((zzdmk) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
