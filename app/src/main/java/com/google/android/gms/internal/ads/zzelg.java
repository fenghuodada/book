package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzelg {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    @Nullable
    private zzelf zzb;

    @Nullable
    public final zzelf zza() {
        return this.zzb;
    }

    public final void zzb(zzelf zzelfVar) {
        this.zzb = zzelfVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
