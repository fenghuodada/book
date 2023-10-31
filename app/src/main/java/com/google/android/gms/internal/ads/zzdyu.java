package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzdyu implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;

    public zzdyu(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6, zzgwb zzgwbVar7) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
        this.zzf = zzgwbVar6;
        this.zzg = zzgwbVar7;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.google.android.gms.internal.ads.zzery] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzerw, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzchc) this.zza).zza();
        ?? zzb = this.zzb.zzb();
        ?? zzb2 = this.zzc.zzb();
        zzdyy zzdyyVar = new zzdyy();
        zzdzb zzb3 = ((zzdzc) this.zze).zzb();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzdyt(zza, zzb, zzb2, zzdyyVar, zzb3, zzfwcVar, new zzbus());
    }
}
