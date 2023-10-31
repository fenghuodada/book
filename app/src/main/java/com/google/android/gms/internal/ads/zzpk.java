package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzpk {
    @Nullable
    private zzpm zzc;
    private zzoh zzb = zzoh.zza;
    final zzpj zza = zzpj.zza;

    public static /* bridge */ /* synthetic */ zzoh zza(zzpk zzpkVar) {
        return zzpkVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzpm zze(zzpk zzpkVar) {
        return zzpkVar.zzc;
    }

    @Deprecated
    public final zzpk zzb(zzoh zzohVar) {
        this.zzb = zzohVar;
        return this;
    }

    public final zzpk zzc(zzdr[] zzdrVarArr) {
        this.zzc = new zzpm(zzdrVarArr);
        return this;
    }

    public final zzpw zzd() {
        if (this.zzc == null) {
            this.zzc = new zzpm(new zzdr[0]);
        }
        return new zzpw(this, null);
    }
}
