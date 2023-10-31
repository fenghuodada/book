package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class zzfas {
    public static /* synthetic */ boolean zza(AtomicReference atomicReference, Object obj, Object obj2) {
        boolean z;
        while (true) {
            if (atomicReference.compareAndSet(null, obj2)) {
                z = true;
            } else if (atomicReference.get() != null) {
                z = false;
            } else {
                continue;
            }
            if (z) {
                return true;
            }
            if (atomicReference.get() != null) {
                return false;
            }
        }
    }
}
