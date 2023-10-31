package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* loaded from: classes.dex */
public final class zzaqu {
    private NetworkCapabilities zza;

    public zzaqu(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new zzaqt(this));
        } catch (RuntimeException unused) {
            synchronized (zzaqu.class) {
                this.zza = null;
            }
        }
    }

    public static zzaqu zzc(Context context) {
        if (context != null) {
            return new zzaqu((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zza() {
        synchronized (zzaqu.class) {
            NetworkCapabilities networkCapabilities = this.zza;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.zza.hasTransport(1)) {
                    return 1L;
                }
                if (this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }
}
