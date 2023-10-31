package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class zzfhw {
    public static float zza(View view) {
        return view.getZ();
    }

    public static String zzb(View view) {
        if (view.isAttachedToWindow()) {
            int visibility = view.getVisibility();
            if (visibility == 8) {
                return "viewGone";
            }
            if (visibility == 4) {
                return "viewInvisible";
            }
            if (visibility != 0) {
                return "viewNotVisible";
            }
            if (view.getAlpha() == 0.0f) {
                return "viewAlphaZero";
            }
            return null;
        }
        return "notAttached";
    }
}
