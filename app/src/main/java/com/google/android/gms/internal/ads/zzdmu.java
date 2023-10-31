package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdmu implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdmu(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* synthetic */ Object zzb() {
        zzgwb zzgwbVar = this.zza;
        zzgwb zzgwbVar2 = this.zzb;
        int i = ((zzcuz) this.zzc).zza().zzo.zza;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? ((zzehb) zzgwbVar2).zzb() : ((zzehb) zzgwbVar).zzb();
        }
        throw null;
    }
}
