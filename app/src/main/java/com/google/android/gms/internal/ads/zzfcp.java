package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class zzfcp implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, C0235r.m12816a("AdWorker(NG) #", this.zza.getAndIncrement()));
    }
}
