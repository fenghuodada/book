package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzgvy {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzgvy(int i, int i2, zzgvx zzgvxVar) {
        this.zza = zzgvl.zzc(i);
        this.zzb = zzgvl.zzc(i2);
    }

    public final zzgvy zza(zzgwb zzgwbVar) {
        this.zzb.add(zzgwbVar);
        return this;
    }

    public final zzgvy zzb(zzgwb zzgwbVar) {
        this.zza.add(zzgwbVar);
        return this;
    }

    public final zzgvz zzc() {
        return new zzgvz(this.zza, this.zzb, null);
    }
}
