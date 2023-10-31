package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzctg implements zzgvo {
    private final zzctf zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzctg(zzctf zzctfVar, zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzctfVar;
        this.zzb = zzgwbVar;
        this.zzc = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zzb.zzb(), (zzbwu) this.zzc.zzb(), null);
    }
}
