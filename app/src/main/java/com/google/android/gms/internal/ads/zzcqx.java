package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcqx {
    private final zzcxx zza;
    @Nullable
    private final zzdae zzb;

    public zzcqx(zzcxx zzcxxVar, @Nullable zzdae zzdaeVar) {
        this.zza = zzcxxVar;
        this.zzb = zzdaeVar;
    }

    public final zzcxx zza() {
        return this.zza;
    }

    @Nullable
    public final zzdae zzb() {
        return this.zzb;
    }

    public final zzdco zzc() {
        zzdae zzdaeVar = this.zzb;
        return zzdaeVar != null ? new zzdco(zzdaeVar, zzcag.zzf) : new zzdco(new zzcqw(this), zzcag.zzf);
    }
}
