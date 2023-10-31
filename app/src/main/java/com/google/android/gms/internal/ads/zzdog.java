package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzdog implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;

    public zzdog(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzchc) this.zza).zza();
        final String zzb = ((zzdur) this.zzb).zzb();
        zzbzz zza2 = ((zzchn) this.zzc).zza();
        final zzaxh zzaxhVar = (zzaxh) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzawx zzawxVar = new zzawx(new zzaxd(zza));
        zzazw zza3 = zzazx.zza();
        zza3.zza(zza2.zzb);
        zza3.zzc(zza2.zzc);
        zza3.zzb(true != zza2.zzd ? 2 : 0);
        final zzazx zzazxVar = (zzazx) zza3.zzal();
        zzawxVar.zzb(new zzaww() { // from class: com.google.android.gms.internal.ads.zzdof
            @Override // com.google.android.gms.internal.ads.zzaww
            public final void zza(zzaym zzaymVar) {
                zzaxh zzaxhVar2 = zzaxh.this;
                String str2 = zzb;
                zzazx zzazxVar2 = zzazxVar;
                String str3 = str;
                zzaxi zzaxiVar = (zzaxi) zzaymVar.zza().zzaB();
                zzaxiVar.zza(zzaxhVar2);
                zzaymVar.zze(zzaxiVar);
                zzaye zzayeVar = (zzaye) zzaymVar.zzb().zzaB();
                zzayeVar.zza(str2);
                zzayeVar.zzb(zzazxVar2);
                zzaymVar.zzg(zzayeVar);
                zzaymVar.zzh(str3);
            }
        });
        return zzawxVar;
    }
}
