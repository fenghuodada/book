package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdur implements zzgvo {
    private final zzgwb zza;

    public zzdur(zzgwb zzgwbVar) {
        this.zza = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final String zzb() {
        String packageName = ((zzchc) this.zza).zza().getPackageName();
        zzgvw.zzb(packageName);
        return packageName;
    }
}
