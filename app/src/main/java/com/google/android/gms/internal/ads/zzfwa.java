package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0485b;
import androidx.core.content.C0663f;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzfwa extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzfvz(null);
    private static final Runnable zzb = new zzfvz(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzfvx zzfvxVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzfvx)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzfvxVar = (zzfvx) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzfvxVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !zzg();
            if (z) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    try {
                        zzfwj.zza(th);
                        if (!compareAndSet(currentThread, zza)) {
                            zzc(currentThread);
                        }
                        zzd(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzc(currentThread);
                        }
                        zze(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzc(currentThread);
            }
            if (z) {
                zze(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzfvx) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = C0663f.m12005a("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return C0485b.m12391a(str, ", ", zzb());
    }

    public abstract Object zza() throws Exception;

    public abstract String zzb();

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzfvx zzfvxVar = new zzfvx(this, null);
            zzfvxVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzfvxVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
