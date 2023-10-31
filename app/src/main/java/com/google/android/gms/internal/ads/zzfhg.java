package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzfhg {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfhg zza = new zzfhg();
    private Context zzb;

    private zzfhg() {
    }

    public static zzfhg zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
