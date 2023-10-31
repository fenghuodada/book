package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes.dex */
final class zzcbx implements Runnable {
    public zzcbx(zzcbz zzcbzVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
