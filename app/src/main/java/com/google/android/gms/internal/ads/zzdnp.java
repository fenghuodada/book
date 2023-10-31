package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzdnp implements zzcwd {
    @Nullable
    private final zzcfb zza;

    public zzdnp(@Nullable zzcfb zzcfbVar) {
        this.zza = zzcfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbn(@Nullable Context context) {
        zzcfb zzcfbVar = this.zza;
        if (zzcfbVar != null) {
            zzcfbVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbp(@Nullable Context context) {
        zzcfb zzcfbVar = this.zza;
        if (zzcfbVar != null) {
            zzcfbVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbq(@Nullable Context context) {
        zzcfb zzcfbVar = this.zza;
        if (zzcfbVar != null) {
            zzcfbVar.onResume();
        }
    }
}
