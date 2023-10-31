package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.InterfaceFutureC8037a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.concurrent.futures.d */
/* loaded from: classes.dex */
public abstract class AbstractC0487d<V> implements InterfaceFutureC8037a<V> {
    static final AbstractC0488a ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    @Nullable
    volatile C0492d listeners;
    @Nullable
    volatile Object value;
    @Nullable
    volatile C0496h waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(AbstractC0487d.class.getName());

    /* renamed from: androidx.concurrent.futures.d$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0488a {
        /* renamed from: a */
        public abstract boolean mo12389a(AbstractC0487d<?> abstractC0487d, C0492d c0492d, C0492d c0492d2);

        /* renamed from: b */
        public abstract boolean mo12388b(AbstractC0487d<?> abstractC0487d, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo12387c(AbstractC0487d<?> abstractC0487d, C0496h c0496h, C0496h c0496h2);

        /* renamed from: d */
        public abstract void mo12386d(C0496h c0496h, C0496h c0496h2);

        /* renamed from: e */
        public abstract void mo12385e(C0496h c0496h, Thread thread);
    }

    /* renamed from: androidx.concurrent.futures.d$b */
    /* loaded from: classes.dex */
    public static final class C0489b {

        /* renamed from: c */
        public static final C0489b f1536c;

        /* renamed from: d */
        public static final C0489b f1537d;

        /* renamed from: a */
        public final boolean f1538a;
        @Nullable

        /* renamed from: b */
        public final Throwable f1539b;

        static {
            if (AbstractC0487d.GENERATE_CANCELLATION_CAUSES) {
                f1537d = null;
                f1536c = null;
                return;
            }
            f1537d = new C0489b(false, null);
            f1536c = new C0489b(true, null);
        }

        public C0489b(boolean z, @Nullable Throwable th) {
            this.f1538a = z;
            this.f1539b = th;
        }
    }

    /* renamed from: androidx.concurrent.futures.d$c */
    /* loaded from: classes.dex */
    public static final class C0490c {

        /* renamed from: b */
        public static final C0490c f1540b = new C0490c(new C0491a());

        /* renamed from: a */
        public final Throwable f1541a;

        /* renamed from: androidx.concurrent.futures.d$c$a */
        /* loaded from: classes.dex */
        public class C0491a extends Throwable {
            public C0491a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C0490c(Throwable th) {
            this.f1541a = (Throwable) AbstractC0487d.checkNotNull(th);
        }
    }

    /* renamed from: androidx.concurrent.futures.d$d */
    /* loaded from: classes.dex */
    public static final class C0492d {

        /* renamed from: d */
        public static final C0492d f1542d = new C0492d(null, null);

        /* renamed from: a */
        public final Runnable f1543a;

        /* renamed from: b */
        public final Executor f1544b;
        @Nullable

        /* renamed from: c */
        public C0492d f1545c;

        public C0492d(Runnable runnable, Executor executor) {
            this.f1543a = runnable;
            this.f1544b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.d$e */
    /* loaded from: classes.dex */
    public static final class C0493e extends AbstractC0488a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C0496h, Thread> f1546a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C0496h, C0496h> f1547b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC0487d, C0496h> f1548c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC0487d, C0492d> f1549d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC0487d, Object> f1550e;

        public C0493e(AtomicReferenceFieldUpdater<C0496h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0496h, C0496h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0487d, C0496h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0487d, C0492d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0487d, Object> atomicReferenceFieldUpdater5) {
            this.f1546a = atomicReferenceFieldUpdater;
            this.f1547b = atomicReferenceFieldUpdater2;
            this.f1548c = atomicReferenceFieldUpdater3;
            this.f1549d = atomicReferenceFieldUpdater4;
            this.f1550e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractC0487d.AbstractC0488a
        /* renamed from: a */
        public final boolean mo12389a(AbstractC0487d<?> abstractC0487d, C0492d c0492d, C0492d c0492d2) {
            AtomicReferenceFieldUpdater<AbstractC0487d, C0492d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f1549d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC0487d, c0492d, c0492d2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC0487d) == c0492d);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractC0487d.AbstractC0488a
        /* renamed from: b */
        public final boolean mo12388b(AbstractC0487d<?> abstractC0487d, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractC0487d, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f1550e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC0487d, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC0487d) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractC0487d.AbstractC0488a
        /* renamed from: c */
        public final boolean mo12387c(AbstractC0487d<?> abstractC0487d, C0496h c0496h, C0496h c0496h2) {
            AtomicReferenceFieldUpdater<AbstractC0487d, C0496h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f1548c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC0487d, c0496h, c0496h2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC0487d) == c0496h);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractC0487d.AbstractC0488a
        /* renamed from: d */
        public final void mo12386d(C0496h c0496h, C0496h c0496h2) {
            this.f1547b.lazySet(c0496h, c0496h2);
        }

        @Override // androidx.concurrent.futures.AbstractC0487d.AbstractC0488a
        /* renamed from: e */
        public final void mo12385e(C0496h c0496h, Thread thread) {
            this.f1546a.lazySet(c0496h, thread);
        }
    }

    /* renamed from: androidx.concurrent.futures.d$f */
    /* loaded from: classes.dex */
    public static final class RunnableC0494f<V> implements Runnable {

        /* renamed from: a */
        public final AbstractC0487d<V> f1551a;

        /* renamed from: b */
        public final InterfaceFutureC8037a<? extends V> f1552b;

        public RunnableC0494f(AbstractC0487d<V> abstractC0487d, InterfaceFutureC8037a<? extends V> interfaceFutureC8037a) {
            this.f1551a = abstractC0487d;
            this.f1552b = interfaceFutureC8037a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f1551a.value != this) {
                return;
            }
            if (AbstractC0487d.ATOMIC_HELPER.mo12388b(this.f1551a, this, AbstractC0487d.getFutureValue(this.f1552b))) {
                AbstractC0487d.complete(this.f1551a);
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.d$g */
    /* loaded from: classes.dex */
    public static final class C0495g extends AbstractC0488a {
        @Override // androidx.concurrent.futures.AbstractC0487d.AbstractC0488a
        /* renamed from: a */
        public final boolean mo12389a(AbstractC0487d<?> abstractC0487d, C0492d c0492d, C0492d c0492d2) {
            synchronized (abstractC0487d) {
                if (abstractC0487d.listeners == c0492d) {
                    abstractC0487d.listeners = c0492d2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0487d.AbstractC0488a
        /* renamed from: b */
        public final boolean mo12388b(AbstractC0487d<?> abstractC0487d, Object obj, Object obj2) {
            synchronized (abstractC0487d) {
                if (abstractC0487d.value == obj) {
                    abstractC0487d.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0487d.AbstractC0488a
        /* renamed from: c */
        public final boolean mo12387c(AbstractC0487d<?> abstractC0487d, C0496h c0496h, C0496h c0496h2) {
            synchronized (abstractC0487d) {
                if (abstractC0487d.waiters == c0496h) {
                    abstractC0487d.waiters = c0496h2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0487d.AbstractC0488a
        /* renamed from: d */
        public final void mo12386d(C0496h c0496h, C0496h c0496h2) {
            c0496h.f1555b = c0496h2;
        }

        @Override // androidx.concurrent.futures.AbstractC0487d.AbstractC0488a
        /* renamed from: e */
        public final void mo12385e(C0496h c0496h, Thread thread) {
            c0496h.f1554a = thread;
        }
    }

    /* renamed from: androidx.concurrent.futures.d$h */
    /* loaded from: classes.dex */
    public static final class C0496h {

        /* renamed from: c */
        public static final C0496h f1553c = new C0496h(0);
        @Nullable

        /* renamed from: a */
        public volatile Thread f1554a;
        @Nullable

        /* renamed from: b */
        public volatile C0496h f1555b;

        public C0496h() {
            AbstractC0487d.ATOMIC_HELPER.mo12385e(this, Thread.currentThread());
        }

        public C0496h(int i) {
        }
    }

    static {
        AbstractC0488a c0495g;
        try {
            c0495g = new C0493e(AtomicReferenceFieldUpdater.newUpdater(C0496h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0496h.class, C0496h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0487d.class, C0496h.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0487d.class, C0492d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0487d.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0495g = new C0495g();
        }
        ATOMIC_HELPER = c0495g;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    private void addDoneString(StringBuilder sb) {
        String str = "]";
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
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

    private static CancellationException cancellationExceptionWithCause(@Nullable String str, @Nullable Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @NonNull
    static <T> T checkNotNull(@Nullable T t) {
        t.getClass();
        return t;
    }

    private C0492d clearListeners(C0492d c0492d) {
        C0492d c0492d2;
        do {
            c0492d2 = this.listeners;
        } while (!ATOMIC_HELPER.mo12389a(this, c0492d2, C0492d.f1542d));
        C0492d c0492d3 = c0492d;
        C0492d c0492d4 = c0492d2;
        while (c0492d4 != null) {
            C0492d c0492d5 = c0492d4.f1545c;
            c0492d4.f1545c = c0492d3;
            c0492d3 = c0492d4;
            c0492d4 = c0492d5;
        }
        return c0492d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.concurrent.futures.d$a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.concurrent.futures.d<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.concurrent.futures.d] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.concurrent.futures.d<V>, androidx.concurrent.futures.d] */
    public static void complete(AbstractC0487d<?> abstractC0487d) {
        C0492d c0492d = null;
        while (true) {
            abstractC0487d.releaseWaiters();
            abstractC0487d.afterDone();
            C0492d clearListeners = abstractC0487d.clearListeners(c0492d);
            while (clearListeners != null) {
                c0492d = clearListeners.f1545c;
                Runnable runnable = clearListeners.f1543a;
                if (runnable instanceof RunnableC0494f) {
                    RunnableC0494f runnableC0494f = (RunnableC0494f) runnable;
                    abstractC0487d = runnableC0494f.f1551a;
                    if (abstractC0487d.value == runnableC0494f) {
                        if (ATOMIC_HELPER.mo12388b(abstractC0487d, runnableC0494f, getFutureValue(runnableC0494f.f1552b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, clearListeners.f1544b);
                }
                clearListeners = c0492d;
            }
            return;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = log;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof C0489b) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((C0489b) obj).f1539b);
        }
        if (obj instanceof C0490c) {
            throw new ExecutionException(((C0490c) obj).f1541a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    static Object getFutureValue(InterfaceFutureC8037a<?> interfaceFutureC8037a) {
        if (interfaceFutureC8037a instanceof AbstractC0487d) {
            Object obj = ((AbstractC0487d) interfaceFutureC8037a).value;
            if (obj instanceof C0489b) {
                C0489b c0489b = (C0489b) obj;
                return c0489b.f1538a ? c0489b.f1539b != null ? new C0489b(false, c0489b.f1539b) : C0489b.f1537d : obj;
            }
            return obj;
        }
        boolean isCancelled = interfaceFutureC8037a.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            return C0489b.f1537d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(interfaceFutureC8037a);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e) {
            if (isCancelled) {
                return new C0489b(false, e);
            }
            return new C0490c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC8037a, e));
        } catch (ExecutionException e2) {
            return new C0490c(e2.getCause());
        } catch (Throwable th) {
            return new C0490c(th);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
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
        return v;
    }

    private void releaseWaiters() {
        C0496h c0496h;
        do {
            c0496h = this.waiters;
        } while (!ATOMIC_HELPER.mo12387c(this, c0496h, C0496h.f1553c));
        while (c0496h != null) {
            Thread thread = c0496h.f1554a;
            if (thread != null) {
                c0496h.f1554a = null;
                LockSupport.unpark(thread);
            }
            c0496h = c0496h.f1555b;
        }
    }

    private void removeWaiter(C0496h c0496h) {
        c0496h.f1554a = null;
        while (true) {
            C0496h c0496h2 = this.waiters;
            if (c0496h2 == C0496h.f1553c) {
                return;
            }
            C0496h c0496h3 = null;
            while (c0496h2 != null) {
                C0496h c0496h4 = c0496h2.f1555b;
                if (c0496h2.f1554a != null) {
                    c0496h3 = c0496h2;
                } else if (c0496h3 != null) {
                    c0496h3.f1555b = c0496h4;
                    if (c0496h3.f1554a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.mo12387c(this, c0496h2, c0496h4)) {
                    break;
                }
                c0496h2 = c0496h4;
            }
            return;
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC8037a
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        C0492d c0492d = this.listeners;
        C0492d c0492d2 = C0492d.f1542d;
        if (c0492d == c0492d2) {
            executeListener(runnable, executor);
        }
        C0492d c0492d3 = new C0492d(runnable, executor);
        do {
            c0492d3.f1545c = c0492d;
            if (ATOMIC_HELPER.mo12389a(this, c0492d, c0492d3)) {
                return;
            }
            c0492d = this.listeners;
        } while (c0492d != c0492d2);
        executeListener(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof RunnableC0494f)) {
            return false;
        }
        C0489b c0489b = GENERATE_CANCELLATION_CAUSES ? new C0489b(z, new CancellationException("Future.cancel() was called.")) : z ? C0489b.f1536c : C0489b.f1537d;
        AbstractC0487d<V> abstractC0487d = this;
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.mo12388b(abstractC0487d, obj, c0489b)) {
                if (z) {
                    abstractC0487d.interruptTask();
                }
                complete(abstractC0487d);
                if (!(obj instanceof RunnableC0494f)) {
                    return true;
                }
                InterfaceFutureC8037a<? extends V> interfaceFutureC8037a = ((RunnableC0494f) obj).f1552b;
                if (!(interfaceFutureC8037a instanceof AbstractC0487d)) {
                    interfaceFutureC8037a.cancel(z);
                    return true;
                }
                abstractC0487d = (AbstractC0487d) interfaceFutureC8037a;
                obj = abstractC0487d.value;
                if (!(obj == null) && !(obj instanceof RunnableC0494f)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC0487d.value;
                if (!(obj instanceof RunnableC0494f)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC0494f))) {
            return getDoneValue(obj2);
        }
        C0496h c0496h = this.waiters;
        C0496h c0496h2 = C0496h.f1553c;
        if (c0496h != c0496h2) {
            C0496h c0496h3 = new C0496h();
            do {
                AbstractC0488a abstractC0488a = ATOMIC_HELPER;
                abstractC0488a.mo12386d(c0496h3, c0496h);
                if (abstractC0488a.mo12387c(this, c0496h, c0496h3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            removeWaiter(c0496h3);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof RunnableC0494f))));
                    return getDoneValue(obj);
                }
                c0496h = this.waiters;
            } while (c0496h != c0496h2);
            return getDoneValue(this.value);
        }
        return getDoneValue(this.value);
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C0489b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof RunnableC0494f)) & (obj != null);
    }

    public final void maybePropagateCancellationTo(@Nullable Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    @Nullable
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof RunnableC0494f) {
            return C0484a.m12392a(new StringBuilder("setFuture=["), userObjectToString(((RunnableC0494f) obj).f1552b), "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public boolean set(@Nullable V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (ATOMIC_HELPER.mo12388b(this, null, v)) {
            complete(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable th) {
        if (ATOMIC_HELPER.mo12388b(this, null, new C0490c((Throwable) checkNotNull(th)))) {
            complete(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(InterfaceFutureC8037a<? extends V> interfaceFutureC8037a) {
        C0490c c0490c;
        checkNotNull(interfaceFutureC8037a);
        Object obj = this.value;
        if (obj == null) {
            if (interfaceFutureC8037a.isDone()) {
                if (ATOMIC_HELPER.mo12388b(this, null, getFutureValue(interfaceFutureC8037a))) {
                    complete(this);
                    return true;
                }
                return false;
            }
            RunnableC0494f runnableC0494f = new RunnableC0494f(this, interfaceFutureC8037a);
            if (ATOMIC_HELPER.mo12388b(this, null, runnableC0494f)) {
                try {
                    interfaceFutureC8037a.addListener(runnableC0494f, EnumC0497e.f1556a);
                } catch (Throwable th) {
                    try {
                        c0490c = new C0490c(th);
                    } catch (Throwable unused) {
                        c0490c = C0490c.f1540b;
                    }
                    ATOMIC_HELPER.mo12388b(this, runnableC0494f, c0490c);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof C0489b) {
            interfaceFutureC8037a.cancel(((C0489b) obj).f1538a);
        }
        return false;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = pendingToString();
                } catch (RuntimeException e) {
                    str = "Exception thrown from implementation: " + e.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "PENDING" : "PENDING";
            }
            addDoneString(sb);
            sb.append("]");
            return sb.toString();
        }
        str2 = "CANCELLED";
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof C0489b) && ((C0489b) obj).f1538a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a7 -> B:56:0x00ad). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(long r13, java.util.concurrent.TimeUnit r15) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractC0487d.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
