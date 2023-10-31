package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzdih implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzdih(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdig(((zzdgg) this.zza).zza(), (Clock) this.zzb.zzb());
    }
}
