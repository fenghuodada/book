package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(30)
/* loaded from: classes.dex */
final class zzys {
    @DoNotInline
    public static void zza(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            zzer.zzc("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
