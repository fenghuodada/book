package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n299#2,3:309\n299#2,3:312\n299#2,3:315\n299#2,3:318\n299#2,3:321\n299#2,3:325\n299#2,3:328\n1#3:324\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n91#1:309,3\n92#1:312,3\n107#1:315,3\n167#1:318,3\n200#1:321,3\n231#1:325,3\n247#1:328,3\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.t */
/* loaded from: classes3.dex */
public final class C11061t<E> {
    @NotNull

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f21666e = AtomicReferenceFieldUpdater.newUpdater(C11061t.class, Object.class, "_next");
    @NotNull

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f21667f = AtomicLongFieldUpdater.newUpdater(C11061t.class, "_state");
    @JvmField
    @NotNull

    /* renamed from: g */
    public static final C11034f0 f21668g = new C11034f0("REMOVE_FROZEN");
    @Volatile
    @Nullable
    private volatile Object _next;
    @Volatile
    private volatile long _state;

    /* renamed from: a */
    public final int f21669a;

    /* renamed from: b */
    public final boolean f21670b;

    /* renamed from: c */
    public final int f21671c;
    @NotNull

    /* renamed from: d */
    public final AtomicReferenceArray f21672d;

    /* renamed from: kotlinx.coroutines.internal.t$a */
    /* loaded from: classes3.dex */
    public static final class C11062a {
        @JvmField

        /* renamed from: a */
        public final int f21673a;

        public C11062a(int i) {
            this.f21673a = i;
        }
    }

    public C11061t(int i, boolean z) {
        this.f21669a = i;
        this.f21670b = z;
        int i2 = i - 1;
        this.f21671c = i2;
        this.f21672d = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m237a(@org.jetbrains.annotations.NotNull E r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
        L4:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.internal.C11061t.f21667f
            long r2 = r8.get(r6)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L1d
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L1c
            r1 = 2
        L1c:
            return r1
        L1d:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r11 = 0
            long r4 = r4 >> r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r12 = 30
            long r4 = r4 >> r12
            int r13 = (int) r4
            int r4 = r13 + 2
            int r14 = r6.f21671c
            r4 = r4 & r14
            r5 = r0 & r14
            if (r4 != r5) goto L38
            return r1
        L38:
            boolean r4 = r6.f21670b
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r6.f21672d
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L57
            r4 = r13 & r14
            java.lang.Object r4 = r15.get(r4)
            if (r4 == 0) goto L57
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r6.f21669a
            if (r3 < r2) goto L56
            int r13 = r13 - r0
            r0 = r13 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L4
        L56:
            return r1
        L57:
            int r0 = r13 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.C11061t.f21667f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r9 = (long) r0
            long r9 = r9 << r12
            long r4 = r4 | r9
            r0 = r1
            r1 = r16
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L4
            r0 = r13 & r14
            r15.set(r0, r7)
            r0 = r6
        L74:
            long r1 = r8.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L9f
            kotlinx.coroutines.internal.t r0 = r0.m235c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f21672d
            int r2 = r0.f21671c
            r2 = r2 & r13
            java.lang.Object r5 = r1.get(r2)
            boolean r9 = r5 instanceof kotlinx.coroutines.internal.C11061t.C11062a
            if (r9 == 0) goto L9c
            kotlinx.coroutines.internal.t$a r5 = (kotlinx.coroutines.internal.C11061t.C11062a) r5
            int r5 = r5.f21673a
            if (r5 != r13) goto L9c
            r1.set(r2, r7)
            goto L9d
        L9c:
            r0 = 0
        L9d:
            if (r0 != 0) goto L74
        L9f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11061t.m237a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final boolean m236b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f21667f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: c */
    public final C11061t<E> m235c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f21667f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) == 0) {
                long j2 = j | 1152921504606846976L;
                if (atomicLongFieldUpdater.compareAndSet(this, j, j2)) {
                    j = j2;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21666e;
            C11061t<E> c11061t = (C11061t) atomicReferenceFieldUpdater.get(this);
            if (c11061t != null) {
                return c11061t;
            }
            C11061t c11061t2 = new C11061t(this.f21669a * 2, this.f21670b);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f21671c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.f21672d.get(i4);
                if (obj == null) {
                    obj = new C11062a(i);
                }
                c11061t2.f21672d.set(c11061t2.f21671c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(c11061t2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c11061t2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    @Nullable
    /* renamed from: d */
    public final Object m234d() {
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f21667f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return f21668g;
            }
            int i2 = this.f21671c;
            int i3 = ((int) ((j & 1073741823) >> 0)) & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f21672d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = this.f21670b;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else if (obj instanceof C11062a) {
                return null;
            } else {
                long j2 = ((i + 1) & 1073741823) << 0;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                } else if (z) {
                    C11061t<E> c11061t = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f21667f;
                        long j3 = atomicLongFieldUpdater2.get(c11061t);
                        int i4 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c11061t = c11061t.m235c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(c11061t, j3, (j3 & (-1073741824)) | j2)) {
                                c11061t.f21672d.set(c11061t.f21671c & i4, null);
                                c11061t = null;
                            } else {
                                continue;
                            }
                        }
                        if (c11061t == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
