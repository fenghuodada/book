package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final /* synthetic */ class zzfug {
    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        boolean z;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
                z = true;
            } else if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                z = false;
            } else {
                continue;
            }
            if (z) {
                return true;
            }
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
    }
}
