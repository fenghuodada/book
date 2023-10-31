package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

/* loaded from: classes.dex */
public class zzflv extends Handler {
    private final Looper zza;

    public zzflv() {
        this.zza = Looper.getMainLooper();
    }

    public zzflv(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    @CallSuper
    public void zza(Message message) {
        super.dispatchMessage(message);
    }
}
