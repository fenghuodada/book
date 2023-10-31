package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdej implements zzgvo {
    private final zzddt zza;
    private final zzgwb zzb;

    public zzdej(zzddt zzddtVar, zzgwb zzgwbVar) {
        this.zza = zzddtVar;
        this.zzb = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
