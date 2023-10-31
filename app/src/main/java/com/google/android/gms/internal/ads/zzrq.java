package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes.dex */
final class zzrq {
    @DoNotInline
    public static void zza(zzrk zzrkVar, zzof zzofVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        LogSessionId zza = zzofVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = zzrkVar.zzb;
        stringId = zza.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
