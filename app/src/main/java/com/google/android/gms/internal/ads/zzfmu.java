package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzfmu {
    @SuppressLint({"RestrictedApi"})
    public static zzfmt zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzfmv(new zzfnb(context));
    }
}
