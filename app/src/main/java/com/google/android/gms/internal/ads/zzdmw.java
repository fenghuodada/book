package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdmw implements zzgvo {
    private final zzgwb zza;

    public zzdmw(zzgwb zzgwbVar) {
        this.zza = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzaxh zzaxhVar = ((zzcuz) this.zza).zza().zzo.zza == 3 ? zzaxh.REWARDED_INTERSTITIAL : zzaxh.REWARD_BASED_VIDEO_AD;
        zzgvw.zzb(zzaxhVar);
        return zzaxhVar;
    }
}
