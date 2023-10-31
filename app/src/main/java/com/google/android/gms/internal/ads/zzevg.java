package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzevg implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;

    public zzevg(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6, zzgwb zzgwbVar7) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
        this.zzf = zzgwbVar6;
        this.zzg = zzgwbVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevf((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzcgw) this.zzc.zzb(), ((zzewy) this.zzd).zzb(), (zzevd) this.zze.zzb(), new zzezy(), ((zzchn) this.zzg).zza());
    }
}
