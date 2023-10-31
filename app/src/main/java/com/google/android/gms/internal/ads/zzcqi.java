package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcqi implements zzgvo {
    private final zzgwb zza;

    public zzcqi(zzgwb zzgwbVar) {
        this.zza = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z = true;
        if (((zzcuz) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfl)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
