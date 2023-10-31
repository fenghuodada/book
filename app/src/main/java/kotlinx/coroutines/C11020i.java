package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10862k;
import kotlin.C10868p;
import kotlin.PublishedApi;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.jvm.internal.InterfaceC10787d;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC11017h1;
import kotlinx.coroutines.internal.AbstractC11028c0;
import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.internal.C11046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@PublishedApi
@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,662:1\n230#1,2:666\n232#1,8:669\n230#1,10:677\n230#1,10:688\n1#2:663\n24#3:664\n24#3:665\n22#3:687\n21#3:698\n22#3,3:699\n21#3:702\n22#3,3:703\n22#3:711\n21#3,4:712\n22#4:668\n13#4:710\n61#5,2:706\n61#5,2:708\n61#5,2:716\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n246#1:666,2\n246#1:669,8\n249#1:677,10\n254#1:688,10\n72#1:664\n158#1:665\n252#1:687\n277#1:698\n278#1:699,3\n287#1:702\n288#1:703,3\n389#1:711\n392#1:712,4\n246#1:668\n350#1:710\n329#1:706,2\n339#1:708,2\n613#1:716,2\n*E\n"})
/* renamed from: kotlinx.coroutines.i */
/* loaded from: classes3.dex */
public class C11020i<T> extends AbstractC11080m0<T> implements InterfaceC11015h<T>, InterfaceC10787d, InterfaceC10974d2 {
    @NotNull

    /* renamed from: f */
    public static final AtomicIntegerFieldUpdater f21608f = AtomicIntegerFieldUpdater.newUpdater(C11020i.class, "_decisionAndIndex");
    @NotNull

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f21609g = AtomicReferenceFieldUpdater.newUpdater(C11020i.class, Object.class, "_state");
    @NotNull

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f21610h = AtomicReferenceFieldUpdater.newUpdater(C11020i.class, Object.class, "_parentHandle");
    @Volatile
    private volatile int _decisionAndIndex;
    @Volatile
    @Nullable
    private volatile Object _parentHandle;
    @Volatile
    @Nullable
    private volatile Object _state;
    @NotNull

    /* renamed from: d */
    public final InterfaceC10772d<T> f21611d;
    @NotNull

    /* renamed from: e */
    public final InterfaceC10775f f21612e;

    public C11020i(int i, @NotNull InterfaceC10772d interfaceC10772d) {
        super(i);
        this.f21611d = interfaceC10772d;
        this.f21612e = interfaceC10772d.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C10945b.f21497a;
    }

    /* renamed from: B */
    public static Object m294B(InterfaceC11139t1 interfaceC11139t1, Object obj, int i, InterfaceC10820l interfaceC10820l) {
        if (obj instanceof C11137t) {
            return obj;
        }
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            if (interfaceC10820l != null || (interfaceC11139t1 instanceof AbstractC10980f)) {
                return new C11101s(obj, interfaceC11139t1 instanceof AbstractC10980f ? (AbstractC10980f) interfaceC11139t1 : null, interfaceC10820l, (CancellationException) null, 16);
            }
            return obj;
        }
        return obj;
    }

    /* renamed from: x */
    public static void m282x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0021, code lost:
        continue;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m295A(java.lang.Object r7, int r8, kotlin.jvm.functions.InterfaceC10820l<? super java.lang.Throwable, kotlin.C10868p> r9) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.C11020i.f21609g
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r1 instanceof kotlinx.coroutines.InterfaceC11139t1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            r2 = r1
            kotlinx.coroutines.t1 r2 = (kotlinx.coroutines.InterfaceC11139t1) r2
            java.lang.Object r2 = m294B(r2, r7, r8, r9)
        L13:
            boolean r5 = r0.compareAndSet(r6, r1, r2)
            if (r5 == 0) goto L1b
            r3 = r4
            goto L21
        L1b:
            java.lang.Object r5 = r0.get(r6)
            if (r5 == r1) goto L13
        L21:
            if (r3 == 0) goto L0
            boolean r7 = r6.m283w()
            if (r7 != 0) goto L2c
            r6.m290l()
        L2c:
            r6.m289m(r8)
            return
        L30:
            boolean r8 = r1 instanceof kotlinx.coroutines.C11076l
            if (r8 == 0) goto L49
            kotlinx.coroutines.l r1 = (kotlinx.coroutines.C11076l) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = kotlinx.coroutines.C11076l.f21682c
            boolean r8 = r8.compareAndSet(r1, r3, r4)
            if (r8 == 0) goto L49
            if (r9 == 0) goto L48
            java.lang.Throwable r7 = r1.f21796a
            r6.m292j(r9, r7)
        L48:
            return
        L49:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Already resumed, but proposed with update "
            r9.<init>(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C11020i.m295A(java.lang.Object, int, kotlin.jvm.functions.l):void");
    }

    @Override // kotlinx.coroutines.AbstractC11080m0
    /* renamed from: a */
    public final void mo223a(@Nullable Object obj, @NotNull CancellationException cancellationException) {
        boolean z;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21609g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC11139t1)) {
                if (obj2 instanceof C11137t) {
                    return;
                }
                boolean z2 = true;
                if (obj2 instanceof C11101s) {
                    C11101s c11101s = (C11101s) obj2;
                    if (c11101s.f21716e != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C11101s m166a = C11101s.m166a(c11101s, null, cancellationException, 15);
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m166a)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z2) {
                            AbstractC10980f abstractC10980f = c11101s.f21713b;
                            if (abstractC10980f != null) {
                                m293i(abstractC10980f, cancellationException);
                            }
                            InterfaceC10820l<Throwable, C10868p> interfaceC10820l = c11101s.f21714c;
                            if (interfaceC10820l != null) {
                                m292j(interfaceC10820l, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    C11101s c11101s2 = new C11101s(obj2, (AbstractC10980f) null, (InterfaceC10820l) null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c11101s2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                z2 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z2) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC10974d2
    /* renamed from: b */
    public final void mo137b(@NotNull AbstractC11028c0<?> abstractC11028c0, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f21608f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (!((i2 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m284v(abstractC11028c0);
    }

    @Override // kotlinx.coroutines.AbstractC11080m0
    @NotNull
    /* renamed from: c */
    public final InterfaceC10772d<T> mo222c() {
        return this.f21611d;
    }

    @Override // kotlinx.coroutines.AbstractC11080m0
    @Nullable
    /* renamed from: d */
    public final Throwable mo221d(@Nullable Object obj) {
        Throwable mo221d = super.mo221d(obj);
        if (mo221d != null) {
            return mo221d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.AbstractC11080m0
    /* renamed from: e */
    public final <T> T mo220e(@Nullable Object obj) {
        return obj instanceof C11101s ? (T) ((C11101s) obj).f21712a : obj;
    }

    @Override // kotlinx.coroutines.InterfaceC11015h
    @Nullable
    /* renamed from: g */
    public final C11034f0 mo136g(Object obj, @Nullable InterfaceC10820l interfaceC10820l) {
        C11034f0 c11034f0;
        boolean z;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21609g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof InterfaceC11139t1;
            c11034f0 = C11070j.f21679a;
            if (z2) {
                Object m294B = m294B((InterfaceC11139t1) obj2, obj, this.f21685c, interfaceC10820l);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, m294B)) {
                        z = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z = false;
                        continue;
                        break;
                    }
                }
            } else {
                boolean z3 = obj2 instanceof C11101s;
                return null;
            }
        } while (!z);
        if (!m283w()) {
            m290l();
            return c11034f0;
        }
        return c11034f0;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC10787d
    @Nullable
    public final InterfaceC10787d getCallerFrame() {
        InterfaceC10772d<T> interfaceC10772d = this.f21611d;
        if (interfaceC10772d instanceof InterfaceC10787d) {
            return (InterfaceC10787d) interfaceC10772d;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC10772d
    @NotNull
    public final InterfaceC10775f getContext() {
        return this.f21612e;
    }

    @Override // kotlinx.coroutines.AbstractC11080m0
    @Nullable
    /* renamed from: h */
    public final Object mo218h() {
        return f21609g.get(this);
    }

    /* renamed from: i */
    public final void m293i(@NotNull AbstractC10980f abstractC10980f, @Nullable Throwable th) {
        try {
            abstractC10980f.mo143d(th);
        } catch (Throwable th2) {
            C10972d0.m311a(this.f21612e, new C11151w("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: j */
    public final void m292j(@NotNull InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l, @NotNull Throwable th) {
        try {
            interfaceC10820l.invoke(th);
        } catch (Throwable th2) {
            C10972d0.m311a(this.f21612e, new C11151w("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: k */
    public final void m291k(AbstractC11028c0<?> abstractC11028c0, Throwable th) {
        InterfaceC10775f interfaceC10775f = this.f21612e;
        int i = f21608f.get(this) & 536870911;
        if (!(i != 536870911)) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            abstractC11028c0.mo128g(i, interfaceC10775f);
        } catch (Throwable th2) {
            C10972d0.m311a(interfaceC10775f, new C11151w("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: l */
    public final void m290l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21610h;
        InterfaceC11096q0 interfaceC11096q0 = (InterfaceC11096q0) atomicReferenceFieldUpdater.get(this);
        if (interfaceC11096q0 == null) {
            return;
        }
        interfaceC11096q0.mo116b();
        atomicReferenceFieldUpdater.set(this, C11103s1.f21718a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r10 != 4) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        r1 = r9.f21611d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        if ((r1 instanceof kotlinx.coroutines.internal.C11046k) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r10 == 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r10 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        r5 = r9.f21685c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
        if (r5 == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
        if (r5 != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
        if (r10 != r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
        r10 = ((kotlinx.coroutines.internal.C11046k) r1).f21641d;
        r0 = r1.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
        if (r10.mo352H() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
        r10.mo100G(r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
        r10 = kotlinx.coroutines.C11164z1.m99a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
        if (r10.f21798c < 4294967296L) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r4 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
        r0 = r10.f21800e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
        r0 = new kotlin.collections.C10749e<>();
        r10.f21800e = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0080, code lost:
        r0.addLast(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
        r10.m126J(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
        kotlinx.coroutines.C11083n0.m216a(r9, r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
        if (r10.m125L() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
        kotlinx.coroutines.C11083n0.m216a(r9, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a2, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m289m(int r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.C11020i.f21608f
            int r1 = r0.get(r9)
            int r2 = r1 >> 29
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            if (r2 != r3) goto L10
            r0 = r4
            goto L2a
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L1c:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r1
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = r2 + r5
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 == 0) goto L0
            r0 = r3
        L2a:
            if (r0 == 0) goto L2d
            return
        L2d:
            r0 = 4
            if (r10 != r0) goto L32
            r0 = r3
            goto L33
        L32:
            r0 = r4
        L33:
            kotlin.coroutines.d<T> r1 = r9.f21611d
            if (r0 != 0) goto L9f
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.C11046k
            if (r2 == 0) goto L9f
            r2 = 2
            if (r10 == r3) goto L43
            if (r10 != r2) goto L41
            goto L43
        L41:
            r10 = r4
            goto L44
        L43:
            r10 = r3
        L44:
            int r5 = r9.f21685c
            if (r5 == r3) goto L4d
            if (r5 != r2) goto L4b
            goto L4d
        L4b:
            r2 = r4
            goto L4e
        L4d:
            r2 = r3
        L4e:
            if (r10 != r2) goto L9f
            r10 = r1
            kotlinx.coroutines.internal.k r10 = (kotlinx.coroutines.internal.C11046k) r10
            kotlinx.coroutines.b0 r10 = r10.f21641d
            kotlin.coroutines.f r0 = r1.getContext()
            boolean r2 = r10.mo352H()
            if (r2 == 0) goto L63
            r10.mo100G(r0, r9)
            goto La2
        L63:
            kotlinx.coroutines.t0 r10 = kotlinx.coroutines.C11164z1.m99a()
            long r5 = r10.f21798c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L73
            r4 = r3
        L73:
            if (r4 == 0) goto L84
            kotlin.collections.e<kotlinx.coroutines.m0<?>> r0 = r10.f21800e
            if (r0 != 0) goto L80
            kotlin.collections.e r0 = new kotlin.collections.e
            r0.<init>()
            r10.f21800e = r0
        L80:
            r0.addLast(r9)
            goto La2
        L84:
            r10.m126J(r3)
            kotlinx.coroutines.C11083n0.m216a(r9, r1, r3)     // Catch: java.lang.Throwable -> L91
        L8a:
            boolean r0 = r10.m125L()     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L8a
            goto L96
        L91:
            r0 = move-exception
            r1 = 0
            r9.m219f(r0, r1)     // Catch: java.lang.Throwable -> L9a
        L96:
            r10.m127I(r3)
            goto La2
        L9a:
            r0 = move-exception
            r10.m127I(r3)
            throw r0
        L9f:
            kotlinx.coroutines.C11083n0.m216a(r9, r1, r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C11020i.m289m(int):void");
    }

    @Override // kotlinx.coroutines.InterfaceC11015h
    /* renamed from: n */
    public final void mo135n(T t, @Nullable InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l) {
        m295A(t, this.f21685c, interfaceC10820l);
    }

    @NotNull
    /* renamed from: o */
    public Throwable mo180o(@NotNull C11084n1 c11084n1) {
        return c11084n1.mo188j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x002c, code lost:
        continue;
     */
    @Override // kotlinx.coroutines.InterfaceC11015h
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo134p(@org.jetbrains.annotations.Nullable java.lang.Throwable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.C11020i.f21609g
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r1 instanceof kotlinx.coroutines.InterfaceC11139t1
            r3 = 0
            if (r2 != 0) goto Lc
            return r3
        Lc:
            kotlinx.coroutines.l r2 = new kotlinx.coroutines.l
            boolean r4 = r1 instanceof kotlinx.coroutines.AbstractC10980f
            r5 = 1
            if (r4 != 0) goto L1a
            boolean r4 = r1 instanceof kotlinx.coroutines.internal.AbstractC11028c0
            if (r4 == 0) goto L18
            goto L1a
        L18:
            r4 = r3
            goto L1b
        L1a:
            r4 = r5
        L1b:
            r2.<init>(r6, r7, r4)
        L1e:
            boolean r4 = r0.compareAndSet(r6, r1, r2)
            if (r4 == 0) goto L26
            r3 = r5
            goto L2c
        L26:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L1e
        L2c:
            if (r3 == 0) goto L0
            r0 = r1
            kotlinx.coroutines.t1 r0 = (kotlinx.coroutines.InterfaceC11139t1) r0
            boolean r2 = r0 instanceof kotlinx.coroutines.AbstractC10980f
            if (r2 == 0) goto L3b
            kotlinx.coroutines.f r1 = (kotlinx.coroutines.AbstractC10980f) r1
            r6.m293i(r1, r7)
            goto L44
        L3b:
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.AbstractC11028c0
            if (r0 == 0) goto L44
            kotlinx.coroutines.internal.c0 r1 = (kotlinx.coroutines.internal.AbstractC11028c0) r1
            r6.m291k(r1, r7)
        L44:
            boolean r7 = r6.m283w()
            if (r7 != 0) goto L4d
            r6.m290l()
        L4d:
            int r7 = r6.f21685c
            r6.m289m(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C11020i.mo134p(java.lang.Throwable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r1 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (((kotlinx.coroutines.InterfaceC11096q0) kotlinx.coroutines.C11020i.f21610h.get(r8)) != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        m286t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        m281z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        return kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        m281z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        r0 = kotlinx.coroutines.C11020i.f21609g.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        if ((r0 instanceof kotlinx.coroutines.C11137t) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        r1 = r8.f21685c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r1 == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (r1 != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        r1 = (kotlinx.coroutines.InterfaceC11017h1) r8.f21612e.mo195a(kotlinx.coroutines.InterfaceC11017h1.C11019b.f21607a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (r1.mo191c() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
        r1 = r1.mo188j();
        mo223a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        return mo220e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        throw ((kotlinx.coroutines.C11137t) r0).f21796a;
     */
    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m288q() {
        /*
            r8 = this;
            boolean r0 = r8.m283w()
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.C11020i.f21608f
            int r2 = r1.get(r8)
            int r3 = r2 >> 29
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L21
            if (r3 != r6) goto L15
            r1 = r4
            goto L2f
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L21:
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r3 & r2
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            int r3 = r3 + r7
            boolean r1 = r1.compareAndSet(r8, r2, r3)
            if (r1 == 0) goto L4
            r1 = r5
        L2f:
            if (r1 == 0) goto L46
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.C11020i.f21610h
            java.lang.Object r1 = r1.get(r8)
            kotlinx.coroutines.q0 r1 = (kotlinx.coroutines.InterfaceC11096q0) r1
            if (r1 != 0) goto L3e
            r8.m286t()
        L3e:
            if (r0 == 0) goto L43
            r8.m281z()
        L43:
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            return r0
        L46:
            if (r0 == 0) goto L4b
            r8.m281z()
        L4b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.C11020i.f21609g
            java.lang.Object r0 = r0.get(r8)
            boolean r1 = r0 instanceof kotlinx.coroutines.C11137t
            if (r1 != 0) goto L7e
            int r1 = r8.f21685c
            if (r1 == r5) goto L5b
            if (r1 != r6) goto L5c
        L5b:
            r4 = r5
        L5c:
            if (r4 == 0) goto L79
            kotlinx.coroutines.h1$b r1 = kotlinx.coroutines.InterfaceC11017h1.C11019b.f21607a
            kotlin.coroutines.f r2 = r8.f21612e
            kotlin.coroutines.f$b r1 = r2.mo195a(r1)
            kotlinx.coroutines.h1 r1 = (kotlinx.coroutines.InterfaceC11017h1) r1
            if (r1 == 0) goto L79
            boolean r2 = r1.mo191c()
            if (r2 == 0) goto L71
            goto L79
        L71:
            java.util.concurrent.CancellationException r1 = r1.mo188j()
            r8.mo223a(r0, r1)
            throw r1
        L79:
            java.lang.Object r0 = r8.mo220e(r0)
            return r0
        L7e:
            kotlinx.coroutines.t r0 = (kotlinx.coroutines.C11137t) r0
            java.lang.Throwable r0 = r0.f21796a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C11020i.m288q():java.lang.Object");
    }

    @Override // kotlinx.coroutines.InterfaceC11015h
    /* renamed from: r */
    public final void mo133r(@NotNull Object obj) {
        m289m(this.f21685c);
    }

    @Override // kotlin.coroutines.InterfaceC10772d
    public final void resumeWith(@NotNull Object obj) {
        Throwable m420a = C10862k.m420a(obj);
        if (m420a != null) {
            obj = new C11137t(false, m420a);
        }
        m295A(obj, this.f21685c, null);
    }

    /* renamed from: s */
    public final void m287s() {
        InterfaceC11096q0 m286t = m286t();
        if (m286t != null && (!(f21609g.get(this) instanceof InterfaceC11139t1))) {
            m286t.mo116b();
            f21610h.set(this, C11103s1.f21718a);
        }
    }

    /* renamed from: t */
    public final InterfaceC11096q0 m286t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC11017h1 interfaceC11017h1 = (InterfaceC11017h1) this.f21612e.mo195a(InterfaceC11017h1.C11019b.f21607a);
        if (interfaceC11017h1 == null) {
            return null;
        }
        InterfaceC11096q0 m296a = InterfaceC11017h1.C11018a.m296a(interfaceC11017h1, true, new C11079m(this), 2);
        do {
            atomicReferenceFieldUpdater = f21610h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m296a)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m296a;
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo179y());
        sb.append('(');
        sb.append(C11016h0.m297b(this.f21611d));
        sb.append("){");
        Object obj = f21609g.get(this);
        if (obj instanceof InterfaceC11139t1) {
            str = "Active";
        } else if (obj instanceof C11076l) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C11016h0.m298a(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final void m285u(@NotNull InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l) {
        AbstractC10980f c10977e1;
        if (interfaceC10820l instanceof AbstractC10980f) {
            c10977e1 = (AbstractC10980f) interfaceC10820l;
        } else {
            c10977e1 = new C10977e1(interfaceC10820l);
        }
        m284v(c10977e1);
    }

    /* renamed from: v */
    public final void m284v(Object obj) {
        boolean z;
        boolean z2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21609g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = true;
            if (obj2 instanceof C10945b) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z3 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z3) {
                    return;
                }
            } else {
                if (obj2 instanceof AbstractC10980f) {
                    z = true;
                } else {
                    z = obj2 instanceof AbstractC11028c0;
                }
                Throwable th = null;
                if (!z) {
                    boolean z4 = obj2 instanceof C11137t;
                    if (z4) {
                        C11137t c11137t = (C11137t) obj2;
                        c11137t.getClass();
                        if (C11137t.f21795b.compareAndSet(c11137t, 0, 1)) {
                            if (obj2 instanceof C11076l) {
                                if (!z4) {
                                    c11137t = null;
                                }
                                if (c11137t != null) {
                                    th = c11137t.f21796a;
                                }
                                if (obj instanceof AbstractC10980f) {
                                    m293i((AbstractC10980f) obj, th);
                                    return;
                                }
                                C10843j.m432d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                m291k((AbstractC11028c0) obj, th);
                                return;
                            }
                            return;
                        }
                        m282x(obj, obj2);
                        throw null;
                    } else if (obj2 instanceof C11101s) {
                        C11101s c11101s = (C11101s) obj2;
                        if (c11101s.f21713b == null) {
                            if (obj instanceof AbstractC11028c0) {
                                return;
                            }
                            C10843j.m432d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            AbstractC10980f abstractC10980f = (AbstractC10980f) obj;
                            Throwable th2 = c11101s.f21716e;
                            if (th2 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                m293i(abstractC10980f, th2);
                                return;
                            }
                            C11101s m166a = C11101s.m166a(c11101s, abstractC10980f, null, 29);
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m166a)) {
                                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                        z3 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z3) {
                                return;
                            }
                        } else {
                            m282x(obj, obj2);
                            throw null;
                        }
                    } else if (obj instanceof AbstractC11028c0) {
                        return;
                    } else {
                        C10843j.m432d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        C11101s c11101s2 = new C11101s(obj2, (AbstractC10980f) obj, (InterfaceC10820l) null, (CancellationException) null, 28);
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c11101s2)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z3 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z3) {
                            return;
                        }
                    }
                } else {
                    m282x(obj, obj2);
                    throw null;
                }
            }
        }
    }

    /* renamed from: w */
    public final boolean m283w() {
        boolean z;
        boolean z2;
        if (this.f21685c == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC10772d<T> interfaceC10772d = this.f21611d;
            C10843j.m432d(interfaceC10772d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (C11046k.f21640h.get((C11046k) interfaceC10772d) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: y */
    public String mo179y() {
        return "CancellableContinuation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        m290l();
        mo134p(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0027, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m281z() {
        /*
            r7 = this;
            kotlin.coroutines.d<T> r0 = r7.f21611d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.C11046k
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.C11046k) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L6f
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C11046k.f21640h
            java.lang.Object r3 = r1.get(r0)
            kotlinx.coroutines.internal.f0 r4 = kotlinx.coroutines.internal.C11048l.f21646b
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L2a
        L19:
            boolean r3 = r1.compareAndSet(r0, r4, r7)
            if (r3 == 0) goto L21
            r5 = r6
            goto L27
        L21:
            java.lang.Object r3 = r1.get(r0)
            if (r3 == r4) goto L19
        L27:
            if (r5 == 0) goto Ld
            goto L41
        L2a:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L57
        L2e:
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L36
            r5 = r6
            goto L3c
        L36:
            java.lang.Object r4 = r1.get(r0)
            if (r4 == r3) goto L2e
        L3c:
            if (r5 == 0) goto L4b
            r2 = r3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L41:
            if (r2 != 0) goto L44
            goto L6f
        L44:
            r7.m290l()
            r7.mo134p(r2)
            return
        L4b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistent state "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C11020i.m281z():void");
    }
}
