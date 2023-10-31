package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* loaded from: classes.dex */
public final class zzbbp {
    public static Object zza(zzfpp zzfppVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfppVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
