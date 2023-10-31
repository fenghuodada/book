package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes.dex */
final class zzyi {
    @DoNotInline
    public static boolean zza(Context context) {
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr) {
                hdrCapabilities = display.getHdrCapabilities();
                supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                for (int i : supportedHdrTypes) {
                    if (i == 1) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
