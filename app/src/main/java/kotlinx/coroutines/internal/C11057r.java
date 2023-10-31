package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10852q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C11016h0;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalCoroutinesApi
@SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n73#1,3:369\n1#2:368\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n*L\n134#1:369,3\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.r */
/* loaded from: classes3.dex */
public class C11057r {
    @NotNull

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f21660a = AtomicReferenceFieldUpdater.newUpdater(C11057r.class, Object.class, "_next");
    @NotNull

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f21661b = AtomicReferenceFieldUpdater.newUpdater(C11057r.class, Object.class, "_prev");
    @NotNull

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f21662c = AtomicReferenceFieldUpdater.newUpdater(C11057r.class, Object.class, "_removedRef");
    @Volatile
    @Nullable
    private volatile Object _next = this;
    @Volatile
    @Nullable
    private volatile Object _prev = this;
    @Volatile
    @Nullable
    private volatile Object _removedRef;

    @PublishedApi
    /* renamed from: kotlinx.coroutines.internal.r$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC11058a extends AbstractC11025b<C11057r> {
        @JvmField
        @NotNull

        /* renamed from: b */
        public final C11057r f21663b;
        @JvmField
        @Nullable

        /* renamed from: c */
        public C11057r f21664c;

        public AbstractC11058a(@NotNull C11057r c11057r) {
            this.f21663b = c11057r;
        }

        @Override // kotlinx.coroutines.internal.AbstractC11025b
        /* renamed from: b */
        public final void mo242b(C11057r c11057r, Object obj) {
            boolean z;
            C11057r c11057r2;
            C11057r c11057r3 = c11057r;
            boolean z2 = true;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            C11057r c11057r4 = this.f21663b;
            if (z) {
                c11057r2 = c11057r4;
            } else {
                c11057r2 = this.f21664c;
            }
            if (c11057r2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11057r.f21660a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(c11057r3, this, c11057r2)) {
                        if (atomicReferenceFieldUpdater.get(c11057r3) != this) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z2 && z) {
                    C11057r c11057r5 = this.f21664c;
                    C10843j.m433c(c11057r5);
                    c11057r4.m247g(c11057r5);
                }
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.r$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C11059b extends C10852q {
        public C11059b(Object obj) {
            super(obj);
        }

        @Override // kotlin.reflect.InterfaceC10893i
        @Nullable
        public final Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        r6 = ((kotlinx.coroutines.internal.C11068z) r6).f21678a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (r5.compareAndSet(r4, r2, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
        if (r5.get(r4) == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
        if (r7 != false) goto L28;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.C11057r m248f() {
        /*
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C11057r.f21661b
            java.lang.Object r1 = r0.get(r11)
            kotlinx.coroutines.internal.r r1 = (kotlinx.coroutines.internal.C11057r) r1
            r2 = r1
        L9:
            r3 = 0
            r4 = r3
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C11057r.f21660a
            java.lang.Object r6 = r5.get(r2)
            r7 = 0
            r8 = 1
            if (r6 != r11) goto L2a
            if (r1 != r2) goto L18
            return r2
        L18:
            boolean r3 = r0.compareAndSet(r11, r1, r2)
            if (r3 == 0) goto L20
            r7 = r8
            goto L26
        L20:
            java.lang.Object r3 = r0.get(r11)
            if (r3 == r1) goto L18
        L26:
            if (r7 != 0) goto L29
            goto L0
        L29:
            return r2
        L2a:
            boolean r9 = r11.mo243k()
            if (r9 == 0) goto L31
            return r3
        L31:
            if (r6 != 0) goto L34
            return r2
        L34:
            boolean r9 = r6 instanceof kotlinx.coroutines.internal.AbstractC11067y
            if (r9 == 0) goto L3e
            kotlinx.coroutines.internal.y r6 = (kotlinx.coroutines.internal.AbstractC11067y) r6
            r6.mo228a(r2)
            goto L0
        L3e:
            boolean r9 = r6 instanceof kotlinx.coroutines.internal.C11068z
            if (r9 == 0) goto L62
            if (r4 == 0) goto L5b
            kotlinx.coroutines.internal.z r6 = (kotlinx.coroutines.internal.C11068z) r6
            kotlinx.coroutines.internal.r r6 = r6.f21678a
        L48:
            boolean r3 = r5.compareAndSet(r4, r2, r6)
            if (r3 == 0) goto L50
            r7 = r8
            goto L56
        L50:
            java.lang.Object r3 = r5.get(r4)
            if (r3 == r2) goto L48
        L56:
            if (r7 != 0) goto L59
            goto L0
        L59:
            r2 = r4
            goto L9
        L5b:
            java.lang.Object r2 = r0.get(r2)
            kotlinx.coroutines.internal.r r2 = (kotlinx.coroutines.internal.C11057r) r2
            goto Lb
        L62:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.C10843j.m432d(r6, r4)
            r4 = r6
            kotlinx.coroutines.internal.r r4 = (kotlinx.coroutines.internal.C11057r) r4
            r10 = r4
            r4 = r2
            r2 = r10
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11057r.m248f():kotlinx.coroutines.internal.r");
    }

    /* renamed from: g */
    public final void m247g(C11057r c11057r) {
        boolean z;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21661b;
            C11057r c11057r2 = (C11057r) atomicReferenceFieldUpdater.get(c11057r);
            if (m246h() == c11057r) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(c11057r, c11057r2, this)) {
                        if (atomicReferenceFieldUpdater.get(c11057r) != c11057r2) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z);
        if (mo243k()) {
            c11057r.m248f();
        }
    }

    @NotNull
    /* renamed from: h */
    public final Object m246h() {
        while (true) {
            Object obj = f21660a.get(this);
            if (!(obj instanceof AbstractC11067y)) {
                return obj;
            }
            ((AbstractC11067y) obj).mo228a(this);
        }
    }

    @NotNull
    /* renamed from: i */
    public final C11057r m245i() {
        C11068z c11068z;
        C11057r c11057r;
        Object m246h = m246h();
        if (m246h instanceof C11068z) {
            c11068z = (C11068z) m246h;
        } else {
            c11068z = null;
        }
        if (c11068z == null || (c11057r = c11068z.f21678a) == null) {
            C10843j.m432d(m246h, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (C11057r) m246h;
        }
        return c11057r;
    }

    @NotNull
    /* renamed from: j */
    public final C11057r m244j() {
        C11057r m248f = m248f();
        if (m248f == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21661b;
            Object obj = atomicReferenceFieldUpdater.get(this);
            while (true) {
                m248f = (C11057r) obj;
                if (!m248f.mo243k()) {
                    break;
                }
                obj = atomicReferenceFieldUpdater.get(m248f);
            }
        }
        return m248f;
    }

    /* renamed from: k */
    public boolean mo243k() {
        return m246h() instanceof C11068z;
    }

    @NotNull
    public String toString() {
        return new C11059b(this) + '@' + C11016h0.m298a(this);
    }
}
