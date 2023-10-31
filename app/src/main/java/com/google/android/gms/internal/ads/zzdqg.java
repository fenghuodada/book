package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzdqg implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdqg(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdqf((zzdpx) this.zza.zzb(), ((zzgvz) this.zzb).zzb(), (Clock) this.zzc.zzb());
    }
}
