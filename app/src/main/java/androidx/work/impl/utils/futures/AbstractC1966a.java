package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.C0484a;
import com.google.common.util.concurrent.InterfaceFutureC8037a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.futures.a */
/* loaded from: classes.dex */
public abstract class AbstractC1966a<V> implements InterfaceFutureC8037a<V> {

    /* renamed from: d */
    public static final boolean f4772d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f4773e = Logger.getLogger(AbstractC1966a.class.getName());

    /* renamed from: f */
    public static final AbstractC1967a f4774f;

    /* renamed from: g */
    public static final Object f4775g;
    @Nullable

    /* renamed from: a */
    public volatile Object f4776a;
    @Nullable

    /* renamed from: b */
    public volatile C1971d f4777b;
    @Nullable

    /* renamed from: c */
    public volatile C1975h f4778c;

    /* renamed from: androidx.work.impl.utils.futures.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1967a {
        /* renamed from: a */
        public abstract boolean mo9755a(AbstractC1966a<?> abstractC1966a, C1971d c1971d, C1971d c1971d2);

        /* renamed from: b */
        public abstract boolean mo9754b(AbstractC1966a<?> abstractC1966a, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo9753c(AbstractC1966a<?> abstractC1966a, C1975h c1975h, C1975h c1975h2);

        /* renamed from: d */
        public abstract void mo9752d(C1975h c1975h, C1975h c1975h2);

        /* renamed from: e */
        public abstract void mo9751e(C1975h c1975h, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.a$b */
    /* loaded from: classes.dex */
    public static final class C1968b {

        /* renamed from: c */
        public static final C1968b f4779c;

        /* renamed from: d */
        public static final C1968b f4780d;

        /* renamed from: a */
        public final boolean f4781a;
        @Nullable

        /* renamed from: b */
        public final Throwable f4782b;

        static {
            if (AbstractC1966a.f4772d) {
                f4780d = null;
                f4779c = null;
                return;
            }
            f4780d = new C1968b(false, null);
            f4779c = new C1968b(true, null);
        }

        public C1968b(boolean z, @Nullable Throwable th) {
            this.f4781a = z;
            this.f4782b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$c */
    /* loaded from: classes.dex */
    public static final class C1969c {

        /* renamed from: b */
        public static final C1969c f4783b = new C1969c(new C1970a());

        /* renamed from: a */
        public final Throwable f4784a;

        /* renamed from: androidx.work.impl.utils.futures.a$c$a */
        /* loaded from: classes.dex */
        public class C1970a extends Throwable {
            public C1970a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C1969c(Throwable th) {
            boolean z = AbstractC1966a.f4772d;
            th.getClass();
            this.f4784a = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$d */
    /* loaded from: classes.dex */
    public static final class C1971d {

        /* renamed from: d */
        public static final C1971d f4785d = new C1971d(null, null);

        /* renamed from: a */
        public final Runnable f4786a;

        /* renamed from: b */
        public final Executor f4787b;
        @Nullable

        /* renamed from: c */
        public C1971d f4788c;

        public C1971d(Runnable runnable, Executor executor) {
            this.f4786a = runnable;
            this.f4787b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$e */
    /* loaded from: classes.dex */
    public static final class C1972e extends AbstractC1967a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C1975h, Thread> f4789a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C1975h, C1975h> f4790b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC1966a, C1975h> f4791c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC1966a, C1971d> f4792d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC1966a, Object> f4793e;

        public C1972e(AtomicReferenceFieldUpdater<C1975h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1975h, C1975h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC1966a, C1975h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC1966a, C1971d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC1966a, Object> atomicReferenceFieldUpdater5) {
            this.f4789a = atomicReferenceFieldUpdater;
            this.f4790b = atomicReferenceFieldUpdater2;
            this.f4791c = atomicReferenceFieldUpdater3;
            this.f4792d = atomicReferenceFieldUpdater4;
            this.f4793e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1966a.AbstractC1967a
        /* renamed from: a */
        public final boolean mo9755a(AbstractC1966a<?> abstractC1966a, C1971d c1971d, C1971d c1971d2) {
            AtomicReferenceFieldUpdater<AbstractC1966a, C1971d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f4792d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC1966a, c1971d, c1971d2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC1966a) == c1971d);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1966a.AbstractC1967a
        /* renamed from: b */
        public final boolean mo9754b(AbstractC1966a<?> abstractC1966a, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractC1966a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f4793e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC1966a, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC1966a) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1966a.AbstractC1967a
        /* renamed from: c */
        public final boolean mo9753c(AbstractC1966a<?> abstractC1966a, C1975h c1975h, C1975h c1975h2) {
            AtomicReferenceFieldUpdater<AbstractC1966a, C1975h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f4791c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC1966a, c1975h, c1975h2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC1966a) == c1975h);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1966a.AbstractC1967a
        /* renamed from: d */
        public final void mo9752d(C1975h c1975h, C1975h c1975h2) {
            this.f4790b.lazySet(c1975h, c1975h2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1966a.AbstractC1967a
        /* renamed from: e */
        public final void mo9751e(C1975h c1975h, Thread thread) {
            this.f4789a.lazySet(c1975h, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$f */
    /* loaded from: classes.dex */
    public static final class RunnableC1973f<V> implements Runnable {

        /* renamed from: a */
        public final AbstractC1966a<V> f4794a;

        /* renamed from: b */
        public final InterfaceFutureC8037a<? extends V> f4795b;

        public RunnableC1973f(AbstractC1966a<V> abstractC1966a, InterfaceFutureC8037a<? extends V> interfaceFutureC8037a) {
            this.f4794a = abstractC1966a;
            this.f4795b = interfaceFutureC8037a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f4794a.f4776a != this) {
                return;
            }
            if (AbstractC1966a.f4774f.mo9754b(this.f4794a, this, AbstractC1966a.m9758e(this.f4795b))) {
                AbstractC1966a.m9761b(this.f4794a);
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$g */
    /* loaded from: classes.dex */
    public static final class C1974g extends AbstractC1967a {
        @Override // androidx.work.impl.utils.futures.AbstractC1966a.AbstractC1967a
        /* renamed from: a */
        public final boolean mo9755a(AbstractC1966a<?> abstractC1966a, C1971d c1971d, C1971d c1971d2) {
            synchronized (abstractC1966a) {
                if (abstractC1966a.f4777b == c1971d) {
                    abstractC1966a.f4777b = c1971d2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1966a.AbstractC1967a
        /* renamed from: b */
        public final boolean mo9754b(AbstractC1966a<?> abstractC1966a, Object obj, Object obj2) {
            synchronized (abstractC1966a) {
                if (abstractC1966a.f4776a == obj) {
                    abstractC1966a.f4776a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1966a.AbstractC1967a
        /* renamed from: c */
        public final boolean mo9753c(AbstractC1966a<?> abstractC1966a, C1975h c1975h, C1975h c1975h2) {
            synchronized (abstractC1966a) {
                if (abstractC1966a.f4778c == c1975h) {
                    abstractC1966a.f4778c = c1975h2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1966a.AbstractC1967a
        /* renamed from: d */
        public final void mo9752d(C1975h c1975h, C1975h c1975h2) {
            c1975h.f4798b = c1975h2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1966a.AbstractC1967a
        /* renamed from: e */
        public final void mo9751e(C1975h c1975h, Thread thread) {
            c1975h.f4797a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$h */
    /* loaded from: classes.dex */
    public static final class C1975h {

        /* renamed from: c */
        public static final C1975h f4796c = new C1975h(0);
        @Nullable

        /* renamed from: a */
        public volatile Thread f4797a;
        @Nullable

        /* renamed from: b */
        public volatile C1975h f4798b;

        public C1975h() {
            AbstractC1966a.f4774f.mo9751e(this, Thread.currentThread());
        }

        public C1975h(int i) {
        }
    }

    static {
        AbstractC1967a c1974g;
        try {
            c1974g = new C1972e(AtomicReferenceFieldUpdater.newUpdater(C1975h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1975h.class, C1975h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1966a.class, C1975h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1966a.class, C1971d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1966a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1974g = new C1974g();
        }
        f4774f = c1974g;
        if (th != null) {
            f4773e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4775g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.work.impl.utils.futures.a$a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.work.impl.utils.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.work.impl.utils.futures.a] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.work.impl.utils.futures.a<V>, androidx.work.impl.utils.futures.a] */
    /* renamed from: b */
    public static void m9761b(AbstractC1966a<?> abstractC1966a) {
        C1971d c1971d;
        C1971d c1971d2;
        C1971d c1971d3 = null;
        while (true) {
            C1975h c1975h = ((AbstractC1966a) abstractC1966a).f4778c;
            if (f4774f.mo9753c((AbstractC1966a) abstractC1966a, c1975h, C1975h.f4796c)) {
                while (c1975h != null) {
                    Thread thread = c1975h.f4797a;
                    if (thread != null) {
                        c1975h.f4797a = null;
                        LockSupport.unpark(thread);
                    }
                    c1975h = c1975h.f4798b;
                }
                do {
                    c1971d = ((AbstractC1966a) abstractC1966a).f4777b;
                } while (!f4774f.mo9755a((AbstractC1966a) abstractC1966a, c1971d, C1971d.f4785d));
                while (true) {
                    c1971d2 = c1971d3;
                    c1971d3 = c1971d;
                    if (c1971d3 == null) {
                        break;
                    }
                    c1971d = c1971d3.f4788c;
                    c1971d3.f4788c = c1971d2;
                }
                while (c1971d2 != null) {
                    c1971d3 = c1971d2.f4788c;
                    Runnable runnable = c1971d2.f4786a;
                    if (runnable instanceof RunnableC1973f) {
                        RunnableC1973f runnableC1973f = (RunnableC1973f) runnable;
                        abstractC1966a = runnableC1973f.f4794a;
                        if (abstractC1966a.f4776a == runnableC1973f) {
                            if (f4774f.mo9754b(abstractC1966a, runnableC1973f, m9758e(runnableC1973f.f4795b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m9760c(runnable, c1971d2.f4787b);
                    }
                    c1971d2 = c1971d3;
                }
                return;
            }
        }
    }

    /* renamed from: c */
    public static void m9760c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            f4773e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: d */
    public static Object m9759d(Object obj) throws ExecutionException {
        if (!(obj instanceof C1968b)) {
            if (!(obj instanceof C1969c)) {
                if (obj == f4775g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C1969c) obj).f4784a);
        }
        Throwable th = ((C1968b) obj).f4782b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* renamed from: e */
    public static Object m9758e(InterfaceFutureC8037a<?> interfaceFutureC8037a) {
        Object obj;
        if (interfaceFutureC8037a instanceof AbstractC1966a) {
            Object obj2 = ((AbstractC1966a) interfaceFutureC8037a).f4776a;
            if (obj2 instanceof C1968b) {
                C1968b c1968b = (C1968b) obj2;
                if (c1968b.f4781a) {
                    if (c1968b.f4782b != null) {
                        return new C1968b(false, c1968b.f4782b);
                    }
                    return C1968b.f4780d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = interfaceFutureC8037a.isCancelled();
        boolean z = true;
        if ((!f4772d) & isCancelled) {
            return C1968b.f4780d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = interfaceFutureC8037a.get();
                    break;
                } catch (CancellationException e) {
                    if (!isCancelled) {
                        return new C1969c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC8037a, e));
                    }
                    return new C1968b(false, e);
                } catch (ExecutionException e2) {
                    return new C1969c(e2.getCause());
                } catch (Throwable th) {
                    return new C1969c(th);
                }
            } catch (InterruptedException unused) {
                z2 = z;
            } catch (Throwable th2) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return f4775g;
        }
        return obj;
    }

    /* renamed from: a */
    public final void m9762a(StringBuilder sb) {
        V v;
        String valueOf;
        String str = "]";
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (CancellationException unused) {
                    str = "CANCELLED";
                    sb.append(str);
                    return;
                } catch (RuntimeException e) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e.getClass());
                    str = " thrown from get()]";
                    sb.append(str);
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append(str);
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        if (v == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(v);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC8037a
    public final void addListener(Runnable runnable, Executor executor) {
        executor.getClass();
        C1971d c1971d = this.f4777b;
        C1971d c1971d2 = C1971d.f4785d;
        if (c1971d != c1971d2) {
            C1971d c1971d3 = new C1971d(runnable, executor);
            do {
                c1971d3.f4788c = c1971d;
                if (f4774f.mo9755a(this, c1971d, c1971d3)) {
                    return;
                }
                c1971d = this.f4777b;
            } while (c1971d != c1971d2);
            m9760c(runnable, executor);
        }
        m9760c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f4776a;
        if (!(obj == null) && !(obj instanceof RunnableC1973f)) {
            return false;
        }
        C1968b c1968b = f4772d ? new C1968b(z, new CancellationException("Future.cancel() was called.")) : z ? C1968b.f4779c : C1968b.f4780d;
        AbstractC1966a<V> abstractC1966a = this;
        boolean z2 = false;
        while (true) {
            if (f4774f.mo9754b(abstractC1966a, obj, c1968b)) {
                m9761b(abstractC1966a);
                if (!(obj instanceof RunnableC1973f)) {
                    return true;
                }
                InterfaceFutureC8037a<? extends V> interfaceFutureC8037a = ((RunnableC1973f) obj).f4795b;
                if (!(interfaceFutureC8037a instanceof AbstractC1966a)) {
                    interfaceFutureC8037a.cancel(z);
                    return true;
                }
                abstractC1966a = (AbstractC1966a) interfaceFutureC8037a;
                obj = abstractC1966a.f4776a;
                if (!(obj == null) && !(obj instanceof RunnableC1973f)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC1966a.f4776a;
                if (!(obj instanceof RunnableC1973f)) {
                    return z2;
                }
            }
        }
    }

    @Nullable
    /* renamed from: f */
    public final String m9757f() {
        String valueOf;
        Object obj = this.f4776a;
        if (obj instanceof RunnableC1973f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC8037a<? extends V> interfaceFutureC8037a = ((RunnableC1973f) obj).f4795b;
            if (interfaceFutureC8037a == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(interfaceFutureC8037a);
            }
            return C0484a.m12392a(sb, valueOf, "]");
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* renamed from: g */
    public final void m9756g(C1975h c1975h) {
        c1975h.f4797a = null;
        while (true) {
            C1975h c1975h2 = this.f4778c;
            if (c1975h2 == C1975h.f4796c) {
                return;
            }
            C1975h c1975h3 = null;
            while (c1975h2 != null) {
                C1975h c1975h4 = c1975h2.f4798b;
                if (c1975h2.f4797a != null) {
                    c1975h3 = c1975h2;
                } else if (c1975h3 != null) {
                    c1975h3.f4798b = c1975h4;
                    if (c1975h3.f4797a == null) {
                        break;
                    }
                } else if (!f4774f.mo9753c(this, c1975h2, c1975h4)) {
                    break;
                }
                c1975h2 = c1975h4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f4776a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC1973f))) {
            return (V) m9759d(obj2);
        }
        C1975h c1975h = this.f4778c;
        C1975h c1975h2 = C1975h.f4796c;
        if (c1975h != c1975h2) {
            C1975h c1975h3 = new C1975h();
            do {
                AbstractC1967a abstractC1967a = f4774f;
                abstractC1967a.mo9752d(c1975h3, c1975h);
                if (abstractC1967a.mo9753c(this, c1975h, c1975h3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m9756g(c1975h3);
                            throw new InterruptedException();
                        }
                        obj = this.f4776a;
                    } while (!((obj != null) & (!(obj instanceof RunnableC1973f))));
                    return (V) m9759d(obj);
                }
                c1975h = this.f4778c;
            } while (c1975h != c1975h2);
            return (V) m9759d(this.f4776a);
        }
        return (V) m9759d(this.f4776a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4776a instanceof C1968b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f4776a;
        return (!(obj instanceof RunnableC1973f)) & (obj != null);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4776a instanceof C1968b) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = m9757f();
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
            m9762a(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractC1966a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
