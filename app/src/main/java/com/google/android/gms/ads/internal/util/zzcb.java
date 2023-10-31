package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzcb {
    @Deprecated
    public static Object zza(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            zzbzt.zzh("Unexpected exception.", th);
            zzbsy.zza(context).zzf(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
