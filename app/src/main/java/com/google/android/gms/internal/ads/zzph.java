package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes.dex */
final class zzph {
    @DoNotInline
    public static void zza(AudioTrack audioTrack, zzof zzofVar) {
        LogSessionId logSessionId;
        boolean equals;
        LogSessionId zza = zzofVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(zza);
    }
}
