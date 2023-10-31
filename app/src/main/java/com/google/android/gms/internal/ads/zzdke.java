package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzdke implements zzgvo {
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
    private final zzgwb zzk;
    private final zzgwb zzl;
    private final zzgwb zzm;
    private final zzgwb zzn;
    private final zzgwb zzo;
    private final zzgwb zzp;

    public zzdke(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6, zzgwb zzgwbVar7, zzgwb zzgwbVar8, zzgwb zzgwbVar9, zzgwb zzgwbVar10, zzgwb zzgwbVar11, zzgwb zzgwbVar12, zzgwb zzgwbVar13, zzgwb zzgwbVar14, zzgwb zzgwbVar15, zzgwb zzgwbVar16) {
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
        this.zzk = zzgwbVar11;
        this.zzl = zzgwbVar12;
        this.zzm = zzgwbVar13;
        this.zzn = zzgwbVar14;
        this.zzo = zzgwbVar15;
        this.zzp = zzgwbVar16;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzdkd zzb() {
        Context context = (Context) this.zza.zzb();
        zzdjm zzdjmVar = (zzdjm) this.zzb.zzb();
        zzaqq zzaqqVar = (zzaqq) this.zzc.zzb();
        zzbzz zza = ((zzchn) this.zzd).zza();
        com.google.android.gms.ads.internal.zza zza2 = com.google.android.gms.ads.internal.zza.zza();
        zzawx zzawxVar = (zzawx) this.zzf.zzb();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzdkd(context, zzdjmVar, zzaqqVar, zza, zza2, zzawxVar, zzfwcVar, ((zzcuz) this.zzh).zza(), (zzdkv) this.zzi.zzb(), (zzdnk) this.zzj.zzb(), (ScheduledExecutorService) this.zzk.zzb(), (zzdqc) this.zzl.zzb(), (zzfen) this.zzm.zzb(), (zzfgj) this.zzn.zzb(), (zzebc) this.zzo.zzb(), (zzdmf) this.zzp.zzb());
    }
}
