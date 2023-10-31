package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;

/* loaded from: classes.dex */
public final class zzx {
    private int zza;
    private int zzb;

    public zzx(int i) {
    }

    public final zzx zzc(@IntRange(from = 0) int i) {
        this.zzb = i;
        return this;
    }

    public final zzx zzd(@IntRange(from = 0) int i) {
        this.zza = i;
        return this;
    }

    public final zzz zze() {
        zzdy.zzd(this.zza <= this.zzb);
        return new zzz(this, null);
    }
}
