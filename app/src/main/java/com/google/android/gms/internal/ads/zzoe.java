package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes.dex */
final class zzoe {
    public static final zzoe zza;
    public final LogSessionId zzb;

    static {
        LogSessionId logSessionId;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        zza = new zzoe(logSessionId);
    }

    public zzoe(LogSessionId logSessionId) {
        this.zzb = logSessionId;
    }
}
