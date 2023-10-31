package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzecp implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzecp(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzeco zzb() {
        return new zzeco((Context) this.zza.zzb(), (zzcor) this.zzb.zzb());
    }
}
