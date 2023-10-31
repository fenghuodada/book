package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(31)
/* loaded from: classes.dex */
public final class zzji {
    @DoNotInline
    public static zzof zza(Context context, zzjt zzjtVar, boolean z) {
        LogSessionId logSessionId;
        zzob zzb = zzob.zzb(context);
        if (zzb == null) {
            zzer.zze("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zzof(logSessionId);
        }
        if (z) {
            zzjtVar.zzz(zzb);
        }
        return new zzof(zzb.zza());
    }
}
