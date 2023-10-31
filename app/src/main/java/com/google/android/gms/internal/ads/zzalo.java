package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzalo {
    @Nullable
    public final Object zza;
    @Nullable
    public final zzakr zzb;
    @Nullable
    public final zzalr zzc;
    public boolean zzd;

    private zzalo(zzalr zzalrVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzalrVar;
    }

    private zzalo(@Nullable Object obj, @Nullable zzakr zzakrVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzakrVar;
        this.zzc = null;
    }

    public static zzalo zza(zzalr zzalrVar) {
        return new zzalo(zzalrVar);
    }

    public static zzalo zzb(@Nullable Object obj, @Nullable zzakr zzakrVar) {
        return new zzalo(obj, zzakrVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
