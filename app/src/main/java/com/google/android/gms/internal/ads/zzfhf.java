package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfhf {
    private final zzfim zza;
    private final String zzb;
    private final zzfgu zzc;
    private final String zzd = "Ad overlay";

    public zzfhf(View view, zzfgu zzfguVar, @Nullable String str) {
        this.zza = new zzfim(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfguVar;
    }

    public final zzfgu zza() {
        return this.zzc;
    }

    public final zzfim zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
