package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzdgh implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzdgh(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcq((Context) this.zza.zzb(), new HashSet(), ((zzcrv) this.zzb).zza());
    }
}
