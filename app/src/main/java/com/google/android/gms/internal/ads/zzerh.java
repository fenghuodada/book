package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzerh implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;

    public zzerh(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6, zzgwb zzgwbVar7) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
        this.zzf = zzgwbVar6;
        this.zzg = zzgwbVar7;
    }

    public static zzerf zza(zzbyt zzbytVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new zzerf(zzbytVar, context, scheduledExecutorService, executor, i, z, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzerf(new zzbyt(), ((zzchc) this.zzb).zza(), (ScheduledExecutorService) this.zzc.zzb(), zzfwcVar, ((zzetm) this.zze).zzb().intValue(), ((zzetn) this.zzf).zzb().booleanValue(), ((zzetp) this.zzg).zzb().booleanValue());
    }
}
