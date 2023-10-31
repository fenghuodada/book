package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class zzaf {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzaf zza(int i) {
        zzdy.zzf(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzah zzb() {
        zzdy.zzf(!this.zzb);
        this.zzb = true;
        return new zzah(this.zza, null);
    }
}
