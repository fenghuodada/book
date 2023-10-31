package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzdqr implements zzgvo {
    private final zzdqp zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdqr(zzdqp zzdqpVar, zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzdqpVar;
        this.zzb = zzgwbVar;
        this.zzc = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        Set zzb = zzdqp.zzb((zzdqz) this.zzb.zzb(), zzfwcVar);
        zzgvw.zzb(zzb);
        return zzb;
    }
}
