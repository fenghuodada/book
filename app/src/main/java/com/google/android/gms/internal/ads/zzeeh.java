package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzeeh implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzeeh(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzeeg zzb() {
        return new zzeeg((Context) this.zza.zzb(), (zzdeq) this.zzb.zzb());
    }
}
