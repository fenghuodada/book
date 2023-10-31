package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.C10868p;
import kotlin.collections.C10749e;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.internal.C11045j0;
import kotlinx.coroutines.internal.C11061t;
import kotlinx.coroutines.internal.InterfaceC11047k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n60#2:544\n61#2,7:550\n28#3,4:545\n20#4:549\n56#5:557\n1#6:558\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n269#1:544\n269#1:550,7\n269#1:545,4\n269#1:549\n280#1:557\n*E\n"})
/* renamed from: kotlinx.coroutines.u0 */
/* loaded from: classes3.dex */
public abstract class AbstractC11144u0 extends AbstractC11149v0 implements InterfaceC11074k0 {
    @NotNull

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f21805g = AtomicReferenceFieldUpdater.newUpdater(AbstractC11144u0.class, Object.class, "_queue");
    @NotNull

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f21806h = AtomicReferenceFieldUpdater.newUpdater(AbstractC11144u0.class, Object.class, "_delayed");
    @NotNull

    /* renamed from: i */
    public static final AtomicIntegerFieldUpdater f21807i = AtomicIntegerFieldUpdater.newUpdater(AbstractC11144u0.class, "_isCompleted");
    @Volatile
    @Nullable
    private volatile Object _delayed;
    @Volatile
    private volatile int _isCompleted = 0;
    @Volatile
    @Nullable
    private volatile Object _queue;

    @SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,543:1\n28#2,4:544\n28#2,4:550\n28#2,4:562\n20#3:548\n20#3:554\n20#3:566\n72#4:549\n73#4,7:555\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n437#1:544,4\n439#1:550,4\n479#1:562,4\n437#1:548\n439#1:554\n479#1:566\n439#1:549\n439#1:555,7\n*E\n"})
    /* renamed from: kotlinx.coroutines.u0$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractRunnableC11145a implements Runnable, Comparable<AbstractRunnableC11145a>, InterfaceC11096q0, InterfaceC11047k0 {
        @Nullable
        private volatile Object _heap;
        @JvmField

        /* renamed from: a */
        public long f21808a;

        /* renamed from: b */
        public int f21809b;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0037, code lost:
            if ((r9 - r11.f21810c) > 0) goto L32;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [T extends kotlinx.coroutines.internal.k0 & java.lang.Comparable<? super T>[]] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m117a(long r9, @org.jetbrains.annotations.NotNull kotlinx.coroutines.AbstractC11144u0.C11146b r11, @org.jetbrains.annotations.NotNull kotlinx.coroutines.RunnableC11021i0 r12) {
            /*
                r8 = this;
                monitor-enter(r8)
                java.lang.Object r0 = r8._heap     // Catch: java.lang.Throwable -> L4e
                kotlinx.coroutines.internal.f0 r1 = kotlinx.coroutines.C11152w0.f21812a     // Catch: java.lang.Throwable -> L4e
                if (r0 != r1) goto La
                monitor-exit(r8)
                r9 = 2
                return r9
            La:
                monitor-enter(r11)     // Catch: java.lang.Throwable -> L4e
                T extends kotlinx.coroutines.internal.k0 & java.lang.Comparable<? super T>[] r0 = r11.f21639a     // Catch: java.lang.Throwable -> L13
                r1 = 0
                if (r0 == 0) goto L15
                r0 = r0[r1]     // Catch: java.lang.Throwable -> L13
                goto L16
            L13:
                r9 = move-exception
                goto L4c
            L15:
                r0 = 0
            L16:
                kotlinx.coroutines.u0$a r0 = (kotlinx.coroutines.AbstractC11144u0.AbstractRunnableC11145a) r0     // Catch: java.lang.Throwable -> L13
                boolean r12 = kotlinx.coroutines.AbstractC11144u0.m122O(r12)     // Catch: java.lang.Throwable -> L13
                if (r12 == 0) goto L22
                monitor-exit(r11)     // Catch: java.lang.Throwable -> L4e
                monitor-exit(r8)
                r9 = 1
                return r9
            L22:
                r2 = 0
                if (r0 != 0) goto L27
                goto L39
            L27:
                long r4 = r0.f21808a     // Catch: java.lang.Throwable -> L13
                long r6 = r4 - r9
                int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r12 < 0) goto L30
                goto L31
            L30:
                r9 = r4
            L31:
                long r4 = r11.f21810c     // Catch: java.lang.Throwable -> L13
                long r4 = r9 - r4
                int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r12 <= 0) goto L3b
            L39:
                r11.f21810c = r9     // Catch: java.lang.Throwable -> L13
            L3b:
                long r9 = r8.f21808a     // Catch: java.lang.Throwable -> L13
                long r4 = r11.f21810c     // Catch: java.lang.Throwable -> L13
                long r9 = r9 - r4
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 >= 0) goto L46
                r8.f21808a = r4     // Catch: java.lang.Throwable -> L13
            L46:
                r11.m259a(r8)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r11)     // Catch: java.lang.Throwable -> L4e
                monitor-exit(r8)
                return r1
            L4c:
                monitor-exit(r11)     // Catch: java.lang.Throwable -> L4e
                throw r9     // Catch: java.lang.Throwable -> L4e
            L4e:
                r9 = move-exception
                monitor-exit(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC11144u0.AbstractRunnableC11145a.m117a(long, kotlinx.coroutines.u0$b, kotlinx.coroutines.i0):int");
        }

        @Override // kotlinx.coroutines.InterfaceC11096q0
        /* renamed from: b */
        public final void mo116b() {
            synchronized (this) {
                Object obj = this._heap;
                C11034f0 c11034f0 = C11152w0.f21812a;
                if (obj == c11034f0) {
                    return;
                }
                C11146b c11146b = obj instanceof C11146b ? (C11146b) obj : null;
                if (c11146b != null) {
                    c11146b.m256d(this);
                }
                this._heap = c11034f0;
                C10868p c10868p = C10868p.f21418a;
            }
        }

        @Override // kotlinx.coroutines.internal.InterfaceC11047k0
        @Nullable
        /* renamed from: c */
        public final C11045j0<?> mo115c() {
            Object obj = this._heap;
            if (obj instanceof C11045j0) {
                return (C11045j0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(AbstractRunnableC11145a abstractRunnableC11145a) {
            int i = ((this.f21808a - abstractRunnableC11145a.f21808a) > 0L ? 1 : ((this.f21808a - abstractRunnableC11145a.f21808a) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC11047k0
        /* renamed from: f */
        public final void mo114f(@Nullable C11146b c11146b) {
            if (!(this._heap != C11152w0.f21812a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = c11146b;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC11047k0
        public final int getIndex() {
            return this.f21809b;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC11047k0
        public final void setIndex(int i) {
            this.f21809b = i;
        }

        @NotNull
        public final String toString() {
            return "Delayed[nanos=" + this.f21808a + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.u0$b */
    /* loaded from: classes3.dex */
    public static final class C11146b extends C11045j0<AbstractRunnableC11145a> {
        @JvmField

        /* renamed from: c */
        public long f21810c;

        public C11146b(long j) {
            this.f21810c = j;
        }
    }

    /* renamed from: O */
    public static final boolean m122O(RunnableC11021i0 runnableC11021i0) {
        runnableC11021i0.getClass();
        if (f21807i.get(runnableC11021i0) != 0) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    /* renamed from: G */
    public final void mo100G(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Runnable runnable) {
        mo121P(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlinx.coroutines.u0, kotlinx.coroutines.t0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v9, types: [T extends kotlinx.coroutines.internal.k0 & java.lang.Comparable<? super T>[]] */
    @Override // kotlinx.coroutines.AbstractC11138t0
    /* renamed from: K */
    public final long mo123K() {
        long j;
        AbstractRunnableC11145a m257c;
        boolean z;
        boolean z2;
        AbstractRunnableC11145a abstractRunnableC11145a;
        boolean z3;
        boolean z4;
        AbstractRunnableC11145a abstractRunnableC11145a2;
        if (m125L()) {
            return 0L;
        }
        C11146b c11146b = (C11146b) f21806h.get(this);
        Runnable runnable = null;
        boolean z5 = true;
        if (c11146b != null) {
            if (c11146b.m258b() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (c11146b) {
                        ?? r8 = c11146b.f21639a;
                        if (r8 != 0) {
                            abstractRunnableC11145a = r8[0];
                        } else {
                            abstractRunnableC11145a = null;
                        }
                        if (abstractRunnableC11145a == null) {
                            abstractRunnableC11145a2 = null;
                        } else {
                            AbstractRunnableC11145a abstractRunnableC11145a3 = abstractRunnableC11145a;
                            if (nanoTime - abstractRunnableC11145a3.f21808a >= 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                z4 = m120Q(abstractRunnableC11145a3);
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                abstractRunnableC11145a2 = c11146b.m255e(0);
                            } else {
                                abstractRunnableC11145a2 = null;
                            }
                        }
                    }
                } while (abstractRunnableC11145a2 != null);
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21805g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            } else if (obj instanceof C11061t) {
                C11061t c11061t = (C11061t) obj;
                Object m234d = c11061t.m234d();
                if (m234d != C11061t.f21668g) {
                    runnable = (Runnable) m234d;
                    break;
                }
                C11061t m235c = c11061t.m235c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m235c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (obj == C11152w0.f21813b) {
                break;
            } else {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        C10749e<AbstractC11080m0<?>> c10749e = this.f21800e;
        if (c10749e == null || c10749e.isEmpty()) {
            j = Long.MAX_VALUE;
        } else {
            j = 0;
        }
        if (j == 0) {
            return 0L;
        }
        Object obj2 = f21805g.get(this);
        if (obj2 != null) {
            if (obj2 instanceof C11061t) {
                long j2 = C11061t.f21667f.get((C11061t) obj2);
                if (((int) ((1073741823 & j2) >> 0)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                    z5 = false;
                }
                if (!z5) {
                    return 0L;
                }
            } else {
                if (obj2 != C11152w0.f21813b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        C11146b c11146b2 = (C11146b) f21806h.get(this);
        if (c11146b2 != null && (m257c = c11146b2.m257c()) != null) {
            long nanoTime2 = m257c.f21808a - System.nanoTime();
            if (nanoTime2 < 0) {
                return 0L;
            }
            return nanoTime2;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: P */
    public void mo121P(@NotNull Runnable runnable) {
        if (m120Q(runnable)) {
            Thread mo112M = mo112M();
            if (Thread.currentThread() != mo112M) {
                LockSupport.unpark(mo112M);
                return;
            }
            return;
        }
        RunnableC11021i0.f21613j.mo121P(runnable);
    }

    /* renamed from: Q */
    public final boolean m120Q(Runnable runnable) {
        boolean z;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21805g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z2 = false;
            if (f21807i.get(this) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            if (obj == null) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z2 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            } else if (obj instanceof C11061t) {
                C11061t c11061t = (C11061t) obj;
                int m237a = c11061t.m237a(runnable);
                if (m237a == 0) {
                    return true;
                }
                if (m237a != 1) {
                    if (m237a == 2) {
                        return false;
                    }
                } else {
                    C11061t m235c = c11061t.m235c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m235c) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                }
            } else if (obj == C11152w0.f21813b) {
                return false;
            } else {
                C11061t c11061t2 = new C11061t(8, true);
                c11061t2.m237a((Runnable) obj);
                c11061t2.m237a(runnable);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c11061t2)) {
                        z2 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
    }

    /* renamed from: R */
    public final boolean m119R() {
        boolean z;
        boolean z2;
        C10749e<AbstractC11080m0<?>> c10749e = this.f21800e;
        if (c10749e != null) {
            z = c10749e.isEmpty();
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        C11146b c11146b = (C11146b) f21806h.get(this);
        if (c11146b != null) {
            if (c11146b.m258b() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        Object obj = f21805g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C11061t) {
            long j = C11061t.f21667f.get((C11061t) obj);
            if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == C11152w0.f21813b) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public final void m118S(long j, @NotNull AbstractRunnableC11145a abstractRunnableC11145a) {
        boolean z;
        int m117a;
        Thread mo112M;
        boolean z2 = true;
        if (f21807i.get(this) != 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractRunnableC11145a abstractRunnableC11145a2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21806h;
        if (z) {
            m117a = 1;
        } else {
            C11146b c11146b = (C11146b) atomicReferenceFieldUpdater.get(this);
            if (c11146b == null) {
                C11146b c11146b2 = new C11146b(j);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c11146b2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                C10843j.m433c(obj);
                c11146b = (C11146b) obj;
            }
            m117a = abstractRunnableC11145a.m117a(j, c11146b, (RunnableC11021i0) this);
        }
        if (m117a != 0) {
            if (m117a != 1) {
                if (m117a != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            mo111N(j, abstractRunnableC11145a);
            return;
        }
        C11146b c11146b3 = (C11146b) atomicReferenceFieldUpdater.get(this);
        if (c11146b3 != null) {
            abstractRunnableC11145a2 = c11146b3.m257c();
        }
        if (abstractRunnableC11145a2 != abstractRunnableC11145a) {
            z2 = false;
        }
        if (z2 && Thread.currentThread() != (mo112M = mo112M())) {
            LockSupport.unpark(mo112M);
        }
    }

    @Override // kotlinx.coroutines.AbstractC11138t0
    public void shutdown() {
        boolean z;
        AbstractRunnableC11145a abstractRunnableC11145a;
        boolean z2;
        ThreadLocal<AbstractC11138t0> threadLocal = C11164z1.f21819a;
        C11164z1.f21819a.set(null);
        f21807i.set(this, 1);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21805g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C11034f0 c11034f0 = C11152w0.f21813b;
            if (obj == null) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c11034f0)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else if (obj instanceof C11061t) {
                ((C11061t) obj).m236b();
                break;
            } else if (obj == c11034f0) {
                break;
            } else {
                C11061t c11061t = new C11061t(8, true);
                c11061t.m237a((Runnable) obj);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c11061t)) {
                        z2 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    break;
                }
            }
        }
        do {
        } while (mo123K() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C11146b c11146b = (C11146b) f21806h.get(this);
            if (c11146b != null) {
                synchronized (c11146b) {
                    if (c11146b.m258b() > 0) {
                        abstractRunnableC11145a = c11146b.m255e(0);
                    } else {
                        abstractRunnableC11145a = null;
                    }
                }
                AbstractRunnableC11145a abstractRunnableC11145a2 = abstractRunnableC11145a;
                if (abstractRunnableC11145a2 != null) {
                    mo111N(nanoTime, abstractRunnableC11145a2);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
