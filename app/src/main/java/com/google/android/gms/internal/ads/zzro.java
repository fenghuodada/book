package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(29)
/* loaded from: classes.dex */
final class zzro {
    @DoNotInline
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = zzfn.zzb;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = zzfn.zzd;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
                    for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                        if (supportedPerformancePoints.get(i3).covers(performancePoint)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
