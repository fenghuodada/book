package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdps implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdps(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdqf zzdqfVar = (zzdqf) this.zza.zzb();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzid)).booleanValue() ? new zzdco((zzdzm) this.zzc.zzb(), zzfwcVar) : new zzdco(zzdqfVar, zzfwcVar);
    }
}
