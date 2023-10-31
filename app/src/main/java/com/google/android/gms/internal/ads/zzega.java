package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzega implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzega(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzefz zzb() {
        return new zzefz((Context) this.zza.zzb(), (zzdmt) this.zzb.zzb());
    }
}
