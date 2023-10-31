package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class zzbbz {
    private final long zza;
    @Nullable
    private final String zzb;
    @Nullable
    private final zzbbz zzc;

    public zzbbz(long j, @Nullable String str, @Nullable zzbbz zzbbzVar) {
        this.zza = j;
        this.zzb = str;
        this.zzc = zzbbzVar;
    }

    public final long zza() {
        return this.zza;
    }

    @Nullable
    public final zzbbz zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzb;
    }
}
