package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class zzdyk implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;

    public zzdyk(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6, zzgwb zzgwbVar7, zzgwb zzgwbVar8) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
        this.zzf = zzgwbVar6;
        this.zzg = zzgwbVar7;
        this.zzh = zzgwbVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzchc) this.zza).zza();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzdyj(zza, zzfwcVar, new zzbus(), ((zzchk) this.zzd).zzb(), ((zzdzc) this.zze).zzb(), (ArrayDeque) this.zzf.zzb(), new zzdyy(), (zzfft) this.zzh.zzb());
    }
}
