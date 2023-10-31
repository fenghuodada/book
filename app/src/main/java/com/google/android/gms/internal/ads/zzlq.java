package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzlq {
    @Nullable
    private final PowerManager zza;

    public zzlq(Context context) {
        this.zza = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
