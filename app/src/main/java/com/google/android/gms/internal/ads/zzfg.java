package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfg implements zzdz {
    @Override // com.google.android.gms.internal.ads.zzdz
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzei zzb(Looper looper, @Nullable Handler.Callback callback) {
        return new zzfj(new Handler(looper, callback));
    }
}
