package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzlr {
    @Nullable
    private final WifiManager zza;

    public zzlr(Context context) {
        this.zza = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
