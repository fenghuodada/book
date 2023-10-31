package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzclr implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzclr(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* synthetic */ Object zzb() {
        zzbnn zzbnnVar = new zzbnn();
        String str = (String) this.zzb.zzb();
        return ((Boolean) zzbdf.zza.zze()).booleanValue() ? new zzbnm(zzbnnVar, str) : new zzbzy(str);
    }
}
