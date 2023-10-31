package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzdqo implements zzgvo {
    private final zzgwb zza;

    public zzdqo(zzgwb zzgwbVar) {
        this.zza = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdqn((Clock) this.zza.zzb());
    }
}
