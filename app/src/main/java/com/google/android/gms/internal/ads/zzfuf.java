package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0485b;
import androidx.core.provider.C0758e;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class zzfuf<V> extends zzfwu implements zzfwb<V> {
    private static final Logger zzaZ;
    private static final zza zzba;
    private static final Object zzbd;
    static final boolean zzd;
    @CheckForNull
    private volatile zzd listeners;
    @CheckForNull
    private volatile Object value;
    @CheckForNull
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class zza {
        public /* synthetic */ zza(zzfue zzfueVar) {
        }

        public abstract zzd zza(zzfuf zzfufVar, zzd zzdVar);

        public abstract zzk zzb(zzfuf zzfufVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzfuf zzfufVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzfuf zzfufVar, @CheckForNull Object obj, Object obj2);

        public abstract boolean zzg(zzfuf zzfufVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzb {
        @CheckForNull
        static final zzb zza;
        @CheckForNull
        static final zzb zzb;
        final boolean zzc;
        @CheckForNull
        final Throwable zzd;

        static {
            if (zzfuf.zzd) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, null);
            zza = new zzb(true, null);
        }

        public zzb(boolean z, @CheckForNull Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfuf.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzd {
        static final zzd zza = new zzd();
        @CheckForNull
        zzd next;
        @CheckForNull
        final Runnable zzb;
        @CheckForNull
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* loaded from: classes.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzfuf, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzfuf, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzfuf, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final zzd zza(zzfuf zzfufVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzfufVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final zzk zzb(zzfuf zzfufVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzfufVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final boolean zze(zzfuf zzfufVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfug.zza(this.zzd, zzfufVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final boolean zzf(zzfuf zzfufVar, @CheckForNull Object obj, Object obj2) {
            return zzfug.zza(this.zze, zzfufVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final boolean zzg(zzfuf zzfufVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzfug.zza(this.zzc, zzfufVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzf<V> implements Runnable {
        final zzfuf<V> zza;
        final zzfwb<? extends V> zzb;

        public zzf(zzfuf zzfufVar, zzfwb zzfwbVar) {
            this.zza = zzfufVar;
            this.zzb = zzfwbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfuf) this.zza).value != this) {
                return;
            }
            if (zzfuf.zzba.zzf(this.zza, this, zzfuf.zzf(this.zzb))) {
                zzfuf.zzy(this.zza, false);
            }
        }
    }

    /* loaded from: classes.dex */
    final class zzg extends zza {
        private zzg() {
            super(null);
        }

        public /* synthetic */ zzg(zzfuh zzfuhVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final zzd zza(zzfuf zzfufVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzfufVar) {
                zzdVar2 = zzfufVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzfufVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final zzk zzb(zzfuf zzfufVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzfufVar) {
                zzkVar2 = zzfufVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzfufVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final boolean zze(zzfuf zzfufVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzfufVar) {
                if (zzfufVar.listeners == zzdVar) {
                    zzfufVar.listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final boolean zzf(zzfuf zzfufVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzfufVar) {
                if (zzfufVar.value == obj) {
                    zzfufVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final boolean zzg(zzfuf zzfufVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            synchronized (zzfufVar) {
                if (zzfufVar.waiters == zzkVar) {
                    zzfufVar.waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface zzh<V> extends zzfwb<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class zzi<V> extends zzfuf<V> implements zzh<V> {
    }

    /* loaded from: classes.dex */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzfuf.zzj.1
                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                            Field[] declaredFields;
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzfuf.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzfuf.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzfuf.class.getDeclaredField("value"));
                    zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        private zzj() {
            super(null);
        }

        public /* synthetic */ zzj(zzfuj zzfujVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final zzd zza(zzfuf zzfufVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzfufVar.listeners;
                if (zzdVar == zzdVar2) {
                    return zzdVar2;
                }
            } while (!zze(zzfufVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final zzk zzb(zzfuf zzfufVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzfufVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzg(zzfufVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final boolean zze(zzfuf zzfufVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfui.zza(zza, zzfufVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final boolean zzf(zzfuf zzfufVar, @CheckForNull Object obj, Object obj2) {
            return zzfui.zza(zza, zzfufVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuf.zza
        public final boolean zzg(zzfuf zzfufVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzfui.zza(zza, zzfufVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        @CheckForNull
        volatile zzk next;
        @CheckForNull
        volatile Thread thread;

        public zzk() {
            zzfuf.zzba.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        zzaZ = Logger.getLogger(zzfuf.class.getName());
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th = null;
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzfuf.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfuf.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfuf.class, Object.class, "value"));
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                zzgVar = new zzg(null);
            }
        }
        zzba = zzgVar;
        if (th != null) {
            Logger logger = zzaZ;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzbd = new Object();
    }

    private final void zzA(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzba.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzB(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else {
            if (obj == zzbd) {
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object zzf(zzfwb zzfwbVar) {
        Throwable zzm;
        if (zzfwbVar instanceof zzh) {
            Object obj = ((zzfuf) zzfwbVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if (!(zzfwbVar instanceof zzfwu) || (zzm = ((zzfwu) zzfwbVar).zzm()) == null) {
            boolean isCancelled = zzfwbVar.isCancelled();
            if ((!zzd) && isCancelled) {
                zzb zzbVar2 = zzb.zzb;
                zzbVar2.getClass();
                return zzbVar2;
            }
            try {
                Object zzg2 = zzg(zzfwbVar);
                return isCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzfwbVar)))) : zzg2 == null ? zzbd : zzg2;
            } catch (Error e) {
                e = e;
                return new zzc(e);
            } catch (CancellationException e2) {
                return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzfwbVar)), e2)) : new zzb(false, e2);
            } catch (RuntimeException e3) {
                e = e3;
                return new zzc(e);
            } catch (ExecutionException e4) {
                return isCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzfwbVar)), e4)) : new zzc(e4.getCause());
            }
        } else {
            return new zzc(zzm);
        }
    }

    private static Object zzg(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzv(StringBuilder sb) {
        String hexString;
        String str = "]";
        try {
            Object zzg2 = zzg(this);
            sb.append("SUCCESS, result=[");
            if (zzg2 == null) {
                hexString = "null";
            } else if (zzg2 == this) {
                hexString = "this future";
            } else {
                sb.append(zzg2.getClass().getName());
                sb.append("@");
                hexString = Integer.toHexString(System.identityHashCode(zzg2));
            }
            sb.append(hexString);
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzw(java.lang.StringBuilder r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            java.lang.String r1 = "PENDING"
            r5.append(r1)
            java.lang.Object r1 = r4.value
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzfuf.zzf
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r5.append(r2)
            com.google.android.gms.internal.ads.zzfuf$zzf r1 = (com.google.android.gms.internal.ads.zzfuf.zzf) r1
            com.google.android.gms.internal.ads.zzfwb<? extends V> r1 = r1.zzb
            r4.zzx(r5, r1)
        L1d:
            r5.append(r3)
            goto L46
        L21:
            java.lang.String r1 = r4.zza()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfpo.zza(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L3b
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L3b:
            if (r1 == 0) goto L46
            java.lang.String r2 = ", info=["
            r5.append(r2)
            r5.append(r1)
            goto L1d
        L46:
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L56
            int r1 = r5.length()
            r5.delete(r0, r1)
            r4.zzv(r5)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfuf.zzw(java.lang.StringBuilder):void");
    }

    private final void zzx(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzy(zzfuf zzfufVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzba.zzb(zzfufVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzfufVar.zzr();
            }
            zzfufVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzba.zza(zzfufVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzfufVar = zzfVar.zza;
                    if (zzfufVar.value == zzfVar) {
                        if (zzba.zzf(zzfufVar, zzfVar, zzf(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    executor.getClass();
                    zzz(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    private static void zzz(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            zzaZ.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", C0758e.m11827a("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzfuf.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.ads.zzfuf.zzd
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzfuf$zzb r1 = new com.google.android.gms.internal.ads.zzfuf$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzfuf$zzb r1 = com.google.android.gms.internal.ads.zzfuf.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzfuf$zzb r1 = com.google.android.gms.internal.ads.zzfuf.zzb.zzb
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.zzfuf$zza r6 = com.google.android.gms.internal.ads.zzfuf.zzba
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzy(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfuf.zzf
            if (r4 == 0) goto L56
            com.google.android.gms.internal.ads.zzfuf$zzf r0 = (com.google.android.gms.internal.ads.zzfuf.zzf) r0
            com.google.android.gms.internal.ads.zzfwb<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfuf.zzh
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.ads.zzfuf r4 = (com.google.android.gms.internal.ads.zzfuf) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfuf.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r3
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r2 = r3
            goto L5f
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfuf.zzf
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfuf.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzB(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar == zzk.zza) {
            Object obj3 = this.value;
            obj3.getClass();
            return zzB(obj3);
        }
        zzk zzkVar2 = new zzk();
        do {
            zza zzaVar = zzba;
            zzaVar.zzc(zzkVar2, zzkVar);
            if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                do {
                    LockSupport.park(this);
                    if (Thread.interrupted()) {
                        zzA(zzkVar2);
                        throw new InterruptedException();
                    }
                    obj = this.value;
                } while (!((obj != null) & (!(obj instanceof zzf))));
                return zzB(obj);
            }
            zzkVar = this.waiters;
        } while (zzkVar != zzk.zza);
        Object obj32 = this.value;
        obj32.getClass();
        return zzB(obj32);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z4 = true;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & (!(obj instanceof zzf))) {
                return zzB(obj);
            }
            long j3 = 0;
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    while (true) {
                        zza zzaVar = zzba;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if (obj2 != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3 & (!(obj2 instanceof zzf))) {
                                        return zzB(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    zzA(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzA(zzkVar2);
                            j3 = 0;
                        } else {
                            zzkVar = this.waiters;
                            if (zzkVar == zzk.zza) {
                                break;
                            }
                        }
                    }
                }
                Object obj3 = this.value;
                obj3.getClass();
                return zzB(obj3);
            }
            while (nanos > j3) {
                Object obj4 = this.value;
                if (obj4 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 & (!(obj4 instanceof zzf))) {
                    return zzB(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                    j3 = 0;
                } else {
                    throw new InterruptedException();
                }
            }
            String zzfufVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z4 = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z4) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z4) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(C0485b.m12391a(str, " for ", zzfufVar));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof zzf));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzv(sb);
        } else {
            zzw(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @CheckForNull
    public String zza() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    public void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzfwb
    public void zzc(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfoz.zzc(runnable, "Runnable was null.");
        zzfoz.zzc(executor, "Executor was null.");
        if (isDone() || (zzdVar = this.listeners) == zzd.zza) {
            zzz(runnable, executor);
        }
        zzd zzdVar2 = new zzd(runnable, executor);
        do {
            zzdVar2.next = zzdVar;
            if (zzba.zze(this, zzdVar, zzdVar2)) {
                return;
            }
            zzdVar = this.listeners;
        } while (zzdVar != zzd.zza);
        zzz(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzbd;
        }
        if (zzba.zzf(this, null, obj)) {
            zzy(this, false);
            return true;
        }
        return false;
    }

    public boolean zze(Throwable th) {
        th.getClass();
        if (zzba.zzf(this, null, new zzc(th))) {
            zzy(this, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu
    @CheckForNull
    public final Throwable zzm() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    public void zzr() {
    }

    public final void zzs(@CheckForNull Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzu());
        }
    }

    public final boolean zzt(zzfwb zzfwbVar) {
        zzc zzcVar;
        zzfwbVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (zzfwbVar.isDone()) {
                if (zzba.zzf(this, null, zzf(zzfwbVar))) {
                    zzy(this, false);
                    return true;
                }
                return false;
            }
            zzf zzfVar = new zzf(this, zzfwbVar);
            if (zzba.zzf(this, null, zzfVar)) {
                try {
                    zzfwbVar.zzc(zzfVar, zzfvf.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        zzcVar = new zzc(e);
                    } catch (Error | RuntimeException unused) {
                        zzcVar = zzc.zza;
                    }
                    zzba.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzfwbVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzu() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }
}
