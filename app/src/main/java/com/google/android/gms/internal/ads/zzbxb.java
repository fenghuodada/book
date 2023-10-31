package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzbxb implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzbxb(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzbxa zzb() {
        return new zzbxa((Clock) this.zza.zzb(), (zzbwy) this.zzb.zzb());
    }
}
