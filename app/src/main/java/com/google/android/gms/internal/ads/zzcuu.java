package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcuu implements zzgvo {
    private final zzcus zza;
    private final zzgwb zzb;

    public zzcuu(zzcus zzcusVar, zzgwb zzgwbVar) {
        this.zza = zzcusVar;
        this.zzb = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = this.zza.zza(((zzchc) this.zzb).zza());
        zzgvw.zzb(zza);
        return zza;
    }
}
