package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.core.C0511i;
import androidx.core.p003os.C0740h;
import androidx.datastore.preferences.protobuf.C1194j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10859x;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.AbstractC10873c;
import kotlinx.coroutines.C11016h0;
import kotlinx.coroutines.internal.C11024a0;
import kotlinx.coroutines.internal.C11034f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1033:1\n285#1:1036\n283#1:1037\n283#1:1038\n285#1:1039\n280#1:1045\n281#1,5:1046\n291#1:1052\n283#1:1053\n284#1:1054\n283#1:1060\n284#1:1061\n280#1:1062\n288#1:1063\n283#1:1064\n283#1:1067\n284#1:1068\n285#1:1069\n90#2:1034\n90#2:1051\n1#3:1035\n28#4,4:1040\n28#4,4:1055\n20#5:1044\n20#5:1059\n87#6:1065\n610#7:1066\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n281#1:1036\n288#1:1037\n289#1:1038\n298#1:1039\n347#1:1045\n375#1:1046,5\n398#1:1052\n445#1:1053\n446#1:1054\n482#1:1060\n483#1:1061\n489#1:1062\n498#1:1063\n498#1:1064\n576#1:1067\n577#1:1068\n578#1:1069\n119#1:1034\n395#1:1051\n347#1:1040,4\n478#1:1055,4\n347#1:1044\n478#1:1059\n515#1:1065\n522#1:1066\n*E\n"})
/* renamed from: kotlinx.coroutines.scheduling.a */
/* loaded from: classes3.dex */
public final class ExecutorC11104a implements Executor, Closeable {
    @NotNull

    /* renamed from: h */
    public static final AtomicLongFieldUpdater f21719h = AtomicLongFieldUpdater.newUpdater(ExecutorC11104a.class, "parkedWorkersStack");
    @NotNull

    /* renamed from: i */
    public static final AtomicLongFieldUpdater f21720i = AtomicLongFieldUpdater.newUpdater(ExecutorC11104a.class, "controlState");
    @NotNull

    /* renamed from: j */
    public static final AtomicIntegerFieldUpdater f21721j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC11104a.class, "_isTerminated");
    @JvmField
    @NotNull

    /* renamed from: k */
    public static final C11034f0 f21722k = new C11034f0("NOT_IN_STACK");
    @Volatile
    private volatile int _isTerminated;
    @JvmField

    /* renamed from: a */
    public final int f21723a;
    @JvmField

    /* renamed from: b */
    public final int f21724b;
    @JvmField

    /* renamed from: c */
    public final long f21725c;
    @Volatile
    private volatile long controlState;
    @JvmField
    @NotNull

    /* renamed from: d */
    public final String f21726d;
    @JvmField
    @NotNull

    /* renamed from: e */
    public final C11108d f21727e;
    @JvmField
    @NotNull

    /* renamed from: f */
    public final C11108d f21728f;
    @JvmField
    @NotNull

    /* renamed from: g */
    public final C11024a0<C11105a> f21729g;
    @Volatile
    private volatile long parkedWorkersStack;

    @SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1033:1\n298#2:1034\n285#2:1035\n299#2,4:1036\n304#2:1040\n294#2,2:1041\n294#2,2:1045\n280#2:1052\n289#2:1053\n283#2:1054\n280#2:1055\n1#3:1043\n87#4:1044\n28#5,4:1047\n20#6:1051\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n665#1:1034\n665#1:1035\n665#1:1036,4\n679#1:1040\n753#1:1041,2\n807#1:1045,2\n855#1:1052\n881#1:1053\n881#1:1054\n963#1:1055\n790#1:1044\n851#1:1047,4\n851#1:1051\n*E\n"})
    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    /* loaded from: classes3.dex */
    public final class C11105a extends Thread {
        @NotNull

        /* renamed from: i */
        public static final AtomicIntegerFieldUpdater f21730i = AtomicIntegerFieldUpdater.newUpdater(C11105a.class, "workerCtl");
        @JvmField
        @NotNull

        /* renamed from: a */
        public final C11118n f21731a;
        @NotNull

        /* renamed from: b */
        public final C10859x<AbstractRunnableC11112h> f21732b;
        @JvmField
        @NotNull

        /* renamed from: c */
        public int f21733c;

        /* renamed from: d */
        public long f21734d;

        /* renamed from: e */
        public long f21735e;

        /* renamed from: f */
        public int f21736f;
        @JvmField

        /* renamed from: g */
        public boolean f21737g;
        private volatile int indexInArray;
        @Nullable
        private volatile Object nextParkedWorker;
        @Volatile
        private volatile int workerCtl;

        public C11105a() {
            throw null;
        }

        public C11105a(int i) {
            setDaemon(true);
            this.f21731a = new C11118n();
            this.f21732b = new C10859x<>();
            this.f21733c = 4;
            this.nextParkedWorker = ExecutorC11104a.f21722k;
            this.f21736f = AbstractC10873c.f21420a.mo416a();
            m152f(i);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlinx.coroutines.scheduling.AbstractRunnableC11112h m157a(boolean r11) {
            /*
                Method dump skipped, instructions count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.ExecutorC11104a.C11105a.m157a(boolean):kotlinx.coroutines.scheduling.h");
        }

        /* renamed from: b */
        public final int m156b() {
            return this.indexInArray;
        }

        @Nullable
        /* renamed from: c */
        public final Object m155c() {
            return this.nextParkedWorker;
        }

        /* renamed from: d */
        public final int m154d(int i) {
            int i2 = this.f21736f;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f21736f = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: e */
        public final AbstractRunnableC11112h m153e() {
            C11108d c11108d;
            int m154d = m154d(2);
            ExecutorC11104a executorC11104a = ExecutorC11104a.this;
            if (m154d == 0) {
                AbstractRunnableC11112h m238d = executorC11104a.f21727e.m238d();
                if (m238d != null) {
                    return m238d;
                }
                c11108d = executorC11104a.f21728f;
            } else {
                AbstractRunnableC11112h m238d2 = executorC11104a.f21728f.m238d();
                if (m238d2 != null) {
                    return m238d2;
                }
                c11108d = executorC11104a.f21727e;
            }
            return c11108d.m238d();
        }

        /* renamed from: f */
        public final void m152f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC11104a.this.f21726d);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: g */
        public final void m151g(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: h */
        public final boolean m150h(@NotNull int i) {
            int i2 = this.f21733c;
            boolean z = true;
            if (i2 != 1) {
                z = false;
            }
            if (z) {
                ExecutorC11104a.f21720i.addAndGet(ExecutorC11104a.this, 4398046511104L);
            }
            if (i2 != i) {
                this.f21733c = i;
            }
            return z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
            r7 = -2;
            r18 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
            r5 = -1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.h] */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [kotlinx.coroutines.scheduling.h] */
        /* JADX WARN: Type inference failed for: r9v9, types: [kotlinx.coroutines.scheduling.h] */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlinx.coroutines.scheduling.AbstractRunnableC11112h m149i(int r21) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.ExecutorC11104a.C11105a.m149i(int):kotlinx.coroutines.scheduling.h");
        }

        /* JADX WARN: Code restructure failed: missing block: B:130:0x0004, code lost:
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x0004, code lost:
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
            r20.f21735e = 0;
            r2 = r3.f21745b.mo147b();
            r20.f21734d = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
            if (r20.f21733c != 3) goto L101;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
            r20.f21733c = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
            r8 = r20.f21738h;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
            if (r2 != 0) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
            if (m150h(2) == false) goto L110;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
            if (r8.m158f() == false) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
            if (r8.m159e(kotlinx.coroutines.scheduling.ExecutorC11104a.f21720i.get(r8)) == false) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
            r8.m158f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
            r8.getClass();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
            if (r2 == 0) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
            kotlinx.coroutines.scheduling.ExecutorC11104a.f21720i.addAndGet(r8, -2097152);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
            if (r20.f21733c != 5) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
            r20.f21733c = 4;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.ExecutorC11104a.C11105a.run():void");
        }
    }

    public ExecutorC11104a(int i, int i2, @NotNull String str, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f21723a = i;
        this.f21724b = i2;
        this.f21725c = j;
        this.f21726d = str;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j > 0) {
                        this.f21727e = new C11108d();
                        this.f21728f = new C11108d();
                        this.f21729g = new C11024a0<>((i + 1) * 2);
                        this.controlState = i << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(C0740h.m11849a("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(C1194j.m11060a("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        throw new IllegalArgumentException(C0740h.m11849a("Core pool size ", i, " should be at least 1").toString());
    }

    /* renamed from: a */
    public final int m162a() {
        boolean z;
        boolean z2;
        synchronized (this.f21729g) {
            boolean z3 = false;
            if (f21721j.get(this) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f21720i;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f21723a) {
                return 0;
            }
            if (i >= this.f21724b) {
                return 0;
            }
            int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i3 > 0 && this.f21729g.m278b(i3) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C11105a c11105a = new C11105a(i3);
                this.f21729g.m277c(i3, c11105a);
                if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z3 = true;
                }
                if (z3) {
                    int i4 = i2 + 1;
                    c11105a.start();
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: c */
    public final void m161c(@NotNull Runnable runnable, @NotNull InterfaceC11113i interfaceC11113i, boolean z) {
        AbstractRunnableC11112h c11115k;
        boolean z2;
        long j;
        C11105a c11105a;
        boolean z3;
        C11108d c11108d;
        C11116l.f21753f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC11112h) {
            c11115k = (AbstractRunnableC11112h) runnable;
            c11115k.f21744a = nanoTime;
            c11115k.f21745b = interfaceC11113i;
        } else {
            c11115k = new C11115k(runnable, nanoTime, interfaceC11113i);
        }
        boolean z4 = false;
        if (c11115k.f21745b.mo147b() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f21720i;
        if (z2) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C11105a) {
            c11105a = (C11105a) currentThread;
        } else {
            c11105a = null;
        }
        if (c11105a == null || !C10843j.m435a(ExecutorC11104a.this, this)) {
            c11105a = null;
        }
        if (c11105a != null && c11105a.f21733c != 5 && (c11115k.f21745b.mo147b() != 0 || c11105a.f21733c != 2)) {
            c11105a.f21737g = true;
            C11118n c11118n = c11105a.f21731a;
            if (z) {
                c11115k = c11118n.m146a(c11115k);
            } else {
                c11118n.getClass();
                AbstractRunnableC11112h abstractRunnableC11112h = (AbstractRunnableC11112h) C11118n.f21757b.getAndSet(c11118n, c11115k);
                if (abstractRunnableC11112h == null) {
                    c11115k = null;
                } else {
                    c11115k = c11118n.m146a(abstractRunnableC11112h);
                }
            }
        }
        if (c11115k != null) {
            if (c11115k.f21745b.mo147b() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                c11108d = this.f21728f;
            } else {
                c11108d = this.f21727e;
            }
            if (!c11108d.m241a(c11115k)) {
                throw new RejectedExecutionException(C0484a.m12392a(new StringBuilder(), this.f21726d, " was terminated"));
            }
        }
        if (z && c11105a != null) {
            z4 = true;
        }
        if (z2) {
            if (!z4 && !m158f() && !m159e(j)) {
                m158f();
            }
        } else if (!z4 && !m158f() && !m159e(atomicLongFieldUpdater.get(this))) {
            m158f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[LOOP:0: B:21:0x0037->B:35:0x0077, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007a A[EDGE_INSN: B:64:0x007a->B:36:0x007a ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.ExecutorC11104a.f21721j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof kotlinx.coroutines.scheduling.ExecutorC11104a.C11105a
            r4 = 0
            if (r3 == 0) goto L18
            kotlinx.coroutines.scheduling.a$a r0 = (kotlinx.coroutines.scheduling.ExecutorC11104a.C11105a) r0
            goto L19
        L18:
            r0 = r4
        L19:
            if (r0 == 0) goto L24
            kotlinx.coroutines.scheduling.a r3 = kotlinx.coroutines.scheduling.ExecutorC11104a.this
            boolean r3 = kotlin.jvm.internal.C10843j.m435a(r3, r9)
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            kotlinx.coroutines.internal.a0<kotlinx.coroutines.scheduling.a$a> r3 = r9.f21729g
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = kotlinx.coroutines.scheduling.ExecutorC11104a.f21720i     // Catch: java.lang.Throwable -> Lc6
            long r5 = r5.get(r9)     // Catch: java.lang.Throwable -> Lc6
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L7a
            r3 = r2
        L37:
            kotlinx.coroutines.internal.a0<kotlinx.coroutines.scheduling.a$a> r6 = r9.f21729g
            java.lang.Object r6 = r6.m278b(r3)
            kotlin.jvm.internal.C10843j.m433c(r6)
            kotlinx.coroutines.scheduling.a$a r6 = (kotlinx.coroutines.scheduling.ExecutorC11104a.C11105a) r6
            if (r6 == r0) goto L75
        L44:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L44
        L53:
            kotlinx.coroutines.scheduling.n r6 = r6.f21731a
            kotlinx.coroutines.scheduling.d r7 = r9.f21728f
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.scheduling.C11118n.f21757b
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            kotlinx.coroutines.scheduling.h r8 = (kotlinx.coroutines.scheduling.AbstractRunnableC11112h) r8
            if (r8 == 0) goto L67
            r7.m241a(r8)
        L67:
            kotlinx.coroutines.scheduling.h r8 = r6.m145b()
            if (r8 != 0) goto L6f
            r8 = r1
            goto L73
        L6f:
            r7.m241a(r8)
            r8 = r2
        L73:
            if (r8 != 0) goto L67
        L75:
            if (r3 == r5) goto L7a
            int r3 = r3 + 1
            goto L37
        L7a:
            kotlinx.coroutines.scheduling.d r1 = r9.f21728f
            r1.m240b()
            kotlinx.coroutines.scheduling.d r1 = r9.f21727e
            r1.m240b()
        L84:
            if (r0 == 0) goto L8c
            kotlinx.coroutines.scheduling.h r1 = r0.m157a(r2)
            if (r1 != 0) goto Lb3
        L8c:
            kotlinx.coroutines.scheduling.d r1 = r9.f21727e
            java.lang.Object r1 = r1.m238d()
            kotlinx.coroutines.scheduling.h r1 = (kotlinx.coroutines.scheduling.AbstractRunnableC11112h) r1
            if (r1 != 0) goto Lb3
            kotlinx.coroutines.scheduling.d r1 = r9.f21728f
            java.lang.Object r1 = r1.m238d()
            kotlinx.coroutines.scheduling.h r1 = (kotlinx.coroutines.scheduling.AbstractRunnableC11112h) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            r1 = 5
            r0.m150h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.ExecutorC11104a.f21719h
            r1 = 0
            r0.set(r9, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.ExecutorC11104a.f21720i
            r0.set(r9, r1)
        Lb2:
            return
        Lb3:
            r1.run()     // Catch: java.lang.Throwable -> Lb7
            goto L84
        Lb7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> Lc4
            r4.uncaughtException(r3, r1)     // Catch: java.lang.Throwable -> Lc4
            goto L84
        Lc4:
            r0 = move-exception
            throw r0
        Lc6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.ExecutorC11104a.close():void");
    }

    /* renamed from: d */
    public final void m160d(@NotNull C11105a c11105a, int i, int i2) {
        while (true) {
            long j = f21719h.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    C11105a c11105a2 = c11105a;
                    while (true) {
                        Object m155c = c11105a2.m155c();
                        if (m155c == f21722k) {
                            i3 = -1;
                            break;
                        } else if (m155c == null) {
                            i3 = 0;
                            break;
                        } else {
                            c11105a2 = (C11105a) m155c;
                            int m156b = c11105a2.m156b();
                            if (m156b != 0) {
                                i3 = m156b;
                                break;
                            }
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && f21719h.compareAndSet(this, j, i3 | j2)) {
                return;
            }
        }
    }

    /* renamed from: e */
    public final boolean m159e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f21723a;
        if (i < i2) {
            int m162a = m162a();
            if (m162a == 1 && i2 > 1) {
                m162a();
            }
            if (m162a > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable runnable) {
        m161c(runnable, C11116l.f21754g, false);
    }

    /* renamed from: f */
    public final boolean m158f() {
        C11034f0 c11034f0;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f21719h;
            long j = atomicLongFieldUpdater.get(this);
            C11105a m278b = this.f21729g.m278b((int) (2097151 & j));
            if (m278b == null) {
                m278b = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                C11105a c11105a = m278b;
                while (true) {
                    Object m155c = c11105a.m155c();
                    c11034f0 = f21722k;
                    if (m155c == c11034f0) {
                        i = -1;
                        break;
                    } else if (m155c == null) {
                        i = 0;
                        break;
                    } else {
                        c11105a = (C11105a) m155c;
                        i = c11105a.m156b();
                        if (i != 0) {
                            break;
                        }
                    }
                }
                if (i >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | i)) {
                    m278b.m151g(c11034f0);
                }
            }
            if (m278b == null) {
                return false;
            }
            if (C11105a.f21730i.compareAndSet(m278b, -1, 0)) {
                LockSupport.unpark(m278b);
                return true;
            }
        }
    }

    @NotNull
    public final String toString() {
        int i;
        StringBuilder sb;
        char c;
        ArrayList arrayList = new ArrayList();
        C11024a0<C11105a> c11024a0 = this.f21729g;
        int m279a = c11024a0.m279a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < m279a; i7++) {
            C11105a m278b = c11024a0.m278b(i7);
            if (m278b != null) {
                C11118n c11118n = m278b.f21731a;
                c11118n.getClass();
                if (C11118n.f21757b.get(c11118n) != null) {
                    i = (C11118n.f21758c.get(c11118n) - C11118n.f21759d.get(c11118n)) + 1;
                } else {
                    i = C11118n.f21758c.get(c11118n) - C11118n.f21759d.get(c11118n);
                }
                int m12337b = C0511i.m12337b(m278b.f21733c);
                if (m12337b != 0) {
                    if (m12337b != 1) {
                        if (m12337b != 2) {
                            if (m12337b != 3) {
                                if (m12337b == 4) {
                                    i6++;
                                }
                            } else {
                                i5++;
                                if (i > 0) {
                                    sb = new StringBuilder();
                                    sb.append(i);
                                    c = 'd';
                                }
                            }
                        } else {
                            i4++;
                        }
                    } else {
                        i3++;
                        sb = new StringBuilder();
                        sb.append(i);
                        c = 'b';
                    }
                } else {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(i);
                    c = 'c';
                }
                sb.append(c);
                arrayList.add(sb.toString());
            }
        }
        long j = f21720i.get(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21726d);
        sb2.append('@');
        sb2.append(C11016h0.m298a(this));
        sb2.append("[Pool Size {core = ");
        int i8 = this.f21723a;
        sb2.append(i8);
        sb2.append(", max = ");
        sb2.append(this.f21724b);
        sb2.append("}, Worker States {CPU = ");
        sb2.append(i2);
        sb2.append(", blocking = ");
        sb2.append(i3);
        sb2.append(", parked = ");
        sb2.append(i4);
        sb2.append(", dormant = ");
        sb2.append(i5);
        sb2.append(", terminated = ");
        sb2.append(i6);
        sb2.append("}, running workers queues = ");
        sb2.append(arrayList);
        sb2.append(", global CPU queue size = ");
        sb2.append(this.f21727e.m239c());
        sb2.append(", global blocking queue size = ");
        sb2.append(this.f21728f.m239c());
        sb2.append(", Control State {created workers= ");
        sb2.append((int) (2097151 & j));
        sb2.append(", blocking tasks = ");
        sb2.append((int) ((4398044413952L & j) >> 21));
        sb2.append(", CPUs acquired = ");
        sb2.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb2.append("}]");
        return sb2.toString();
    }
}
