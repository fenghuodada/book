package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzefs implements zzgvo {
    private final zzefr zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;

    public zzefs(zzefr zzefrVar, zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4) {
        this.zza = zzefrVar;
        this.zzb = zzgwbVar;
        this.zzc = zzgwbVar2;
        this.zzd = zzgwbVar3;
        this.zze = zzgwbVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* synthetic */ Object zzb() {
        return this.zza.zza((Clock) this.zzb.zzb(), ((zzefm) this.zzc).zzb(), (zzeca) this.zzd.zzb(), (zzfgj) this.zze.zzb());
    }
}
