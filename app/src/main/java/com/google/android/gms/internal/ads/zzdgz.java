package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzdgz {
    @Nullable
    private zzben zza;

    public zzdgz(zzdgl zzdglVar) {
        this.zza = zzdglVar;
    }

    @Nullable
    public final synchronized zzben zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzben zzbenVar) {
        this.zza = zzbenVar;
    }
}
