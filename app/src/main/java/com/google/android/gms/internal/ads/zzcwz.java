package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzcwz implements zzgvo {
    private final zzgwb zza;

    public zzcwz(zzgwb zzgwbVar) {
        this.zza = zzgwbVar;
    }

    public static zzcwy zzc(Set set) {
        return new zzcwy(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzcwy zzb() {
        return new zzcwy(((zzgvz) this.zza).zzb());
    }
}
