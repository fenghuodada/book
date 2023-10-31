package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0235r;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbxv implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzbxv(zzbxy zzbxyVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, C0235r.m12816a("AdWorker(SCION_TASK_EXECUTOR) #", this.zza.getAndIncrement()));
    }
}
