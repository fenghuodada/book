package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzedh implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzedh(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzedg zzb() {
        return new zzedg((Context) this.zza.zzb(), (zzcqa) this.zzb.zzb());
    }
}
