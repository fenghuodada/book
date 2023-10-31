package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfii {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfih zzd = null;

    public zzfii() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfih zzfihVar = (zzfih) this.zzc.poll();
        this.zzd = zzfihVar;
        if (zzfihVar != null) {
            zzfihVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfih zzfihVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfih zzfihVar) {
        zzfihVar.zzb(this);
        this.zzc.add(zzfihVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
