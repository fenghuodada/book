package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzdsf implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;
    private final zzgwb zzi;
    private final zzgwb zzj;

    public zzdsf(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6, zzgwb zzgwbVar7, zzgwb zzgwbVar8, zzgwb zzgwbVar9, zzgwb zzgwbVar10) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
        this.zzf = zzgwbVar6;
        this.zzg = zzgwbVar7;
        this.zzh = zzgwbVar8;
        this.zzi = zzgwbVar9;
        this.zzj = zzgwbVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.zza.zzb();
        Context zza = ((zzchc) this.zzb).zza();
        WeakReference zza2 = ((zzchd) this.zzc).zza();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzdse(executor, zza, zza2, zzfwcVar, (zzdnx) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb(), (zzdql) this.zzg.zzb(), ((zzchn) this.zzh).zza(), ((zzdca) this.zzi).zzb(), (zzfft) this.zzj.zzb());
    }
}
