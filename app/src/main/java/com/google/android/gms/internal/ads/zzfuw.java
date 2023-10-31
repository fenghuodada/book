package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfuf;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
abstract class zzfuw extends zzfuf.zzi {
    private static final zzfus zzbb;
    private static final Logger zzbc = Logger.getLogger(zzfuw.class.getName());
    private volatile int remaining;
    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzfus zzfuvVar;
        Throwable th;
        try {
            zzfuvVar = new zzfut(AtomicReferenceFieldUpdater.newUpdater(zzfuw.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfuw.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            zzfuvVar = new zzfuv(null);
            th = e;
        }
        zzbb = zzfuvVar;
        if (th != null) {
            zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzfuw(int i) {
        this.remaining = i;
    }

    public final int zzB() {
        return zzbb.zza(this);
    }

    public final Set zzD() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zzf(newSetFromMap);
            zzbb.zzb(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            set2.getClass();
            return set2;
        }
        return set;
    }

    public final void zzG() {
        this.seenExceptions = null;
    }

    public abstract void zzf(Set set);
}
