package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzakt implements Runnable {
    final /* synthetic */ zzali zza;
    final /* synthetic */ zzaku zzb;

    public zzakt(zzaku zzakuVar, zzali zzaliVar) {
        this.zzb = zzakuVar;
        this.zza = zzaliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
