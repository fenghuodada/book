package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
final class zzfic implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfif.zzc;
        if (handler != null) {
            handler2 = zzfif.zzc;
            runnable = zzfif.zzd;
            handler2.post(runnable);
            handler3 = zzfif.zzc;
            runnable2 = zzfif.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
