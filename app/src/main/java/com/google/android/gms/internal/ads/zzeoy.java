package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class zzeoy implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzeoy(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeox(((zzdul) this.zza).zzb(), (PackageInfo) this.zzb.zzb());
    }
}
