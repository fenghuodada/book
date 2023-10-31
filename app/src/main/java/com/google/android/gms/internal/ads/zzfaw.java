package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class zzfaw {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzfwc zzc;

    public zzfaw(Callable callable, zzfwc zzfwcVar) {
        this.zzb = callable;
        this.zzc = zzfwcVar;
    }

    public final synchronized zzfwb zza() {
        zzc(1);
        return (zzfwb) this.zza.poll();
    }

    public final synchronized void zzb(zzfwb zzfwbVar) {
        this.zza.addFirst(zzfwbVar);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
