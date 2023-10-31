package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class zzcqj implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcqj(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcql.zzi(this.zza);
    }
}
