package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* loaded from: classes.dex */
final class zzwn implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzwv zza;

    public zzwn(zzwo zzwoVar, zzwv zzwvVar) {
        this.zza = zzwvVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        zzwv.zzg(this.zza);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        zzwv.zzg(this.zza);
    }
}
