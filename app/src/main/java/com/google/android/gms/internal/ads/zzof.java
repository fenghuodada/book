package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class zzof {
    public static final zzof zza;
    @Nullable
    private final zzoe zzb;

    static {
        zza = zzfn.zza < 31 ? new zzof() : new zzof(zzoe.zza);
    }

    public zzof() {
        this.zzb = null;
        zzdy.zzf(zzfn.zza < 31);
    }

    @RequiresApi(31)
    public zzof(LogSessionId logSessionId) {
        this.zzb = new zzoe(logSessionId);
    }

    private zzof(@Nullable zzoe zzoeVar) {
        this.zzb = zzoeVar;
    }

    @RequiresApi(31)
    public final LogSessionId zza() {
        zzoe zzoeVar = this.zzb;
        zzoeVar.getClass();
        return zzoeVar.zzb;
    }
}
