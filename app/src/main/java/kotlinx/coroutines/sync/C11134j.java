package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10868p;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC11015h;
import kotlinx.coroutines.internal.AbstractC11028c0;
import kotlinx.coroutines.internal.C11029d;
import kotlinx.coroutines.internal.C11030d0;
import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.selects.InterfaceC11121b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n205#1,10:411\n205#1,10:421\n1#2:398\n332#3,12:399\n72#4,3:431\n46#4,8:434\n72#4,3:445\n46#4,8:448\n375#5:442\n375#5:443\n367#5:444\n378#5:456\n367#5:457\n375#5:458\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n197#1:411,10\n221#1:421,10\n187#1:399,12\n289#1:431,3\n289#1:434,8\n322#1:445,3\n322#1:448,8\n293#1:442\n299#1:443\n313#1:444\n328#1:456\n334#1:457\n337#1:458\n*E\n"})
/* renamed from: kotlinx.coroutines.sync.j */
/* loaded from: classes3.dex */
public class C11134j {
    @NotNull

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f21781c = AtomicReferenceFieldUpdater.newUpdater(C11134j.class, Object.class, "head");
    @NotNull

    /* renamed from: d */
    public static final AtomicLongFieldUpdater f21782d = AtomicLongFieldUpdater.newUpdater(C11134j.class, "deqIdx");
    @NotNull

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f21783e = AtomicReferenceFieldUpdater.newUpdater(C11134j.class, Object.class, "tail");
    @NotNull

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f21784f = AtomicLongFieldUpdater.newUpdater(C11134j.class, "enqIdx");
    @NotNull

    /* renamed from: g */
    public static final AtomicIntegerFieldUpdater f21785g = AtomicIntegerFieldUpdater.newUpdater(C11134j.class, "_availablePermits");
    @Volatile
    private volatile int _availablePermits;

    /* renamed from: a */
    public final int f21786a = 1;
    @NotNull

    /* renamed from: b */
    public final C11132h f21787b;
    @Volatile
    private volatile long deqIdx;
    @Volatile
    private volatile long enqIdx;
    @Volatile
    @Nullable
    private volatile Object head;
    @Volatile
    @Nullable
    private volatile Object tail;

    public C11134j(int i) {
        if (!(i >= 0 && i <= 1)) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        C11136l c11136l = new C11136l(0L, null, 2);
        this.head = c11136l;
        this.tail = c11136l;
        this._availablePermits = 1 - i;
        this.f21787b = new C11132h(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0004 A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m131d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.C11126d.C11127a r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.C11134j.f21785g
            int r2 = r2.getAndDecrement(r0)
            int r3 = r0.f21786a
            if (r2 > r3) goto L4
            kotlinx.coroutines.sync.h r3 = r0.f21787b
            if (r2 <= 0) goto L19
            kotlin.p r2 = kotlin.C10868p.f21418a
            r1.mo135n(r2, r3)
            goto Lc9
        L19:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.C11134j.f21783e
            java.lang.Object r4 = r2.get(r0)
            kotlinx.coroutines.sync.l r4 = (kotlinx.coroutines.sync.C11136l) r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = kotlinx.coroutines.sync.C11134j.f21784f
            long r5 = r5.getAndIncrement(r0)
            kotlinx.coroutines.sync.g r7 = kotlinx.coroutines.sync.C11131g.f21778a
            int r8 = kotlinx.coroutines.sync.C11135k.f21793f
            long r8 = (long) r8
            long r8 = r5 / r8
        L2e:
            java.lang.Object r10 = kotlinx.coroutines.internal.C11029d.m273a(r4, r8, r7)
            boolean r11 = kotlinx.coroutines.internal.C11030d0.m271b(r10)
            if (r11 != 0) goto L85
            kotlinx.coroutines.internal.c0 r11 = kotlinx.coroutines.internal.C11030d0.m272a(r10)
        L3c:
            java.lang.Object r14 = r2.get(r0)
            kotlinx.coroutines.internal.c0 r14 = (kotlinx.coroutines.internal.AbstractC11028c0) r14
            long r12 = r14.f21621c
            r15 = r7
            r16 = r8
            long r7 = r11.f21621c
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 < 0) goto L4e
            goto L70
        L4e:
            boolean r7 = r11.m274i()
            if (r7 != 0) goto L56
            r7 = 0
            goto L71
        L56:
            boolean r7 = r2.compareAndSet(r0, r14, r11)
            if (r7 == 0) goto L5e
            r7 = 1
            goto L65
        L5e:
            java.lang.Object r7 = r2.get(r0)
            if (r7 == r14) goto L56
            r7 = 0
        L65:
            if (r7 == 0) goto L78
            boolean r7 = r14.m276e()
            if (r7 == 0) goto L70
            r14.m267d()
        L70:
            r7 = 1
        L71:
            if (r7 == 0) goto L74
            goto L85
        L74:
            r7 = r15
            r8 = r16
            goto L2e
        L78:
            boolean r7 = r11.m276e()
            if (r7 == 0) goto L81
            r11.m267d()
        L81:
            r7 = r15
            r8 = r16
            goto L3c
        L85:
            kotlinx.coroutines.internal.c0 r2 = kotlinx.coroutines.internal.C11030d0.m272a(r10)
            kotlinx.coroutines.sync.l r2 = (kotlinx.coroutines.sync.C11136l) r2
            int r4 = kotlinx.coroutines.sync.C11135k.f21793f
            long r7 = (long) r4
            long r5 = r5 % r7
            int r4 = (int) r5
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.f21794e
        L92:
            r6 = 0
            boolean r6 = r5.compareAndSet(r4, r6, r1)
            if (r6 == 0) goto L9b
            r5 = 1
            goto La2
        L9b:
            java.lang.Object r6 = r5.get(r4)
            if (r6 == 0) goto L92
            r5 = 0
        La2:
            if (r5 == 0) goto La8
            r1.mo137b(r2, r4)
            goto Lc4
        La8:
            kotlinx.coroutines.internal.f0 r6 = kotlinx.coroutines.sync.C11135k.f21789b
            kotlinx.coroutines.internal.f0 r7 = kotlinx.coroutines.sync.C11135k.f21790c
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r2.f21794e
        Lae:
            boolean r2 = r8.compareAndSet(r4, r6, r7)
            if (r2 == 0) goto Lb6
            r2 = 1
            goto Lbd
        Lb6:
            java.lang.Object r2 = r8.get(r4)
            if (r2 == r6) goto Lae
            r2 = 0
        Lbd:
            if (r2 == 0) goto Lc6
            kotlin.p r2 = kotlin.C10868p.f21418a
            r1.mo135n(r2, r3)
        Lc4:
            r12 = 1
            goto Lc7
        Lc6:
            r12 = 0
        Lc7:
            if (r12 == 0) goto L4
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C11134j.m131d(kotlinx.coroutines.sync.d$a):void");
    }

    /* renamed from: e */
    public final void m130e() {
        int i;
        Object m273a;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21785g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f21786a;
            if (andIncrement < i2) {
                if (andIncrement >= 0) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21781c;
                C11136l c11136l = (C11136l) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = f21782d.getAndIncrement(this);
                long j = andIncrement2 / C11135k.f21793f;
                C11133i c11133i = C11133i.f21780a;
                do {
                    m273a = C11029d.m273a(c11136l, j, c11133i);
                    if (C11030d0.m271b(m273a)) {
                        break;
                    }
                    AbstractC11028c0 m272a = C11030d0.m272a(m273a);
                    while (true) {
                        AbstractC11028c0 abstractC11028c0 = (AbstractC11028c0) atomicReferenceFieldUpdater.get(this);
                        if (abstractC11028c0.f21621c >= m272a.f21621c) {
                            break;
                        } else if (!m272a.m274i()) {
                            z4 = false;
                            continue;
                            break;
                        } else {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC11028c0, m272a)) {
                                    z5 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater.get(this) != abstractC11028c0) {
                                    z5 = false;
                                    break;
                                }
                            }
                            if (z5) {
                                if (abstractC11028c0.m276e()) {
                                    abstractC11028c0.m267d();
                                }
                            } else if (m272a.m276e()) {
                                m272a.m267d();
                            }
                        }
                    }
                    z4 = true;
                    continue;
                } while (!z4);
                C11136l c11136l2 = (C11136l) C11030d0.m272a(m273a);
                c11136l2.m270a();
                if (c11136l2.f21621c <= j) {
                    int i3 = (int) (andIncrement2 % C11135k.f21793f);
                    C11034f0 c11034f0 = C11135k.f21789b;
                    AtomicReferenceArray atomicReferenceArray = c11136l2.f21794e;
                    Object andSet = atomicReferenceArray.getAndSet(i3, c11034f0);
                    if (andSet == null) {
                        int i4 = C11135k.f21788a;
                        int i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                if (atomicReferenceArray.get(i3) == C11135k.f21790c) {
                                    z = true;
                                    continue;
                                    break;
                                }
                                i5++;
                            } else {
                                C11034f0 c11034f02 = C11135k.f21789b;
                                C11034f0 c11034f03 = C11135k.f21791d;
                                while (true) {
                                    if (atomicReferenceArray.compareAndSet(i3, c11034f02, c11034f03)) {
                                        z2 = true;
                                        z3 = true;
                                        break;
                                    } else if (atomicReferenceArray.get(i3) != c11034f02) {
                                        z2 = true;
                                        z3 = false;
                                        break;
                                    }
                                }
                                z = z3 ^ z2;
                                continue;
                            }
                        }
                    } else if (andSet != C11135k.f21792e) {
                        if (andSet instanceof InterfaceC11015h) {
                            InterfaceC11015h interfaceC11015h = (InterfaceC11015h) andSet;
                            C11034f0 mo136g = interfaceC11015h.mo136g(C10868p.f21418a, this.f21787b);
                            if (mo136g != null) {
                                interfaceC11015h.mo133r(mo136g);
                                z = true;
                                continue;
                            }
                        } else if (andSet instanceof InterfaceC11121b) {
                            z = ((InterfaceC11121b) andSet).mo141c(this, C10868p.f21418a);
                            continue;
                        } else {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                    }
                }
                z = false;
                continue;
            } else {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
        } while (!z);
    }
}
