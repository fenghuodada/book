package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzchw implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzchw(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzbur zzb() {
        Context zza = ((zzchc) this.zza).zza();
        zzfft zzfftVar = (zzfft) this.zzb.zzb();
        zzbmy zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzbzz.zza(), zzfftVar);
        zzbms zzbmsVar = zzbmv.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbmsVar, zzbmsVar);
        return new zzbuq(zza, com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzbzz.zza(), zzfftVar).zza("google.afma.sdkConstants.getSdkConstants", zzbmsVar, zzbmsVar));
    }
}
