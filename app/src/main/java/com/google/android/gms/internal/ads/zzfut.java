package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfut extends zzfus {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    public zzfut(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final int zza(zzfuw zzfuwVar) {
        return this.zzb.decrementAndGet(zzfuwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final void zzb(zzfuw zzfuwVar, @CheckForNull Set set, Set set2) {
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.zza;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(zzfuwVar, null, set2)) {
                z = true;
            } else if (atomicReferenceFieldUpdater.get(zzfuwVar) != null) {
                z = false;
            } else {
                continue;
            }
            if (z || atomicReferenceFieldUpdater.get(zzfuwVar) != null) {
                return;
            }
        }
    }
}
