package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.C10783b;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.functions.InterfaceC10825q;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C11016h0;
import kotlinx.coroutines.C11020i;
import kotlinx.coroutines.C11073k;
import kotlinx.coroutines.InterfaceC10974d2;
import kotlinx.coroutines.InterfaceC11015h;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.AbstractC11028c0;
import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.selects.InterfaceC11121b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n332#2,12:301\n1#3:313\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n168#1:301,12\n*E\n"})
/* renamed from: kotlinx.coroutines.sync.d */
/* loaded from: classes3.dex */
public final class C11126d extends C11134j implements InterfaceC11123a {
    @NotNull

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f21770h = AtomicReferenceFieldUpdater.newUpdater(C11126d.class, Object.class, "owner");
    @Volatile
    @Nullable
    private volatile Object owner;

    @SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
    /* renamed from: kotlinx.coroutines.sync.d$a */
    /* loaded from: classes3.dex */
    public final class C11127a implements InterfaceC11015h<C10868p>, InterfaceC10974d2 {
        @JvmField
        @NotNull

        /* renamed from: a */
        public final C11020i<C10868p> f21771a;
        @JvmField
        @Nullable

        /* renamed from: b */
        public final Object f21772b = null;

        public C11127a(@NotNull C11020i c11020i) {
            this.f21771a = c11020i;
        }

        @Override // kotlinx.coroutines.InterfaceC10974d2
        /* renamed from: b */
        public final void mo137b(@NotNull AbstractC11028c0<?> abstractC11028c0, int i) {
            this.f21771a.mo137b(abstractC11028c0, i);
        }

        @Override // kotlinx.coroutines.InterfaceC11015h
        /* renamed from: g */
        public final C11034f0 mo136g(Object obj, InterfaceC10820l interfaceC10820l) {
            C11126d c11126d = C11126d.this;
            C11125c c11125c = new C11125c(c11126d, this);
            C11034f0 mo136g = this.f21771a.mo136g((C10868p) obj, c11125c);
            if (mo136g != null) {
                C11126d.f21770h.set(c11126d, this.f21772b);
            }
            return mo136g;
        }

        @Override // kotlin.coroutines.InterfaceC10772d
        @NotNull
        public final InterfaceC10775f getContext() {
            return this.f21771a.f21612e;
        }

        @Override // kotlinx.coroutines.InterfaceC11015h
        /* renamed from: n */
        public final void mo135n(C10868p c10868p, InterfaceC10820l interfaceC10820l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11126d.f21770h;
            Object obj = this.f21772b;
            C11126d c11126d = C11126d.this;
            atomicReferenceFieldUpdater.set(c11126d, obj);
            C11124b c11124b = new C11124b(c11126d, this);
            this.f21771a.mo135n(c10868p, c11124b);
        }

        @Override // kotlinx.coroutines.InterfaceC11015h
        /* renamed from: p */
        public final boolean mo134p(@Nullable Throwable th) {
            return this.f21771a.mo134p(th);
        }

        @Override // kotlinx.coroutines.InterfaceC11015h
        @InternalCoroutinesApi
        /* renamed from: r */
        public final void mo133r(@NotNull Object obj) {
            this.f21771a.mo133r(obj);
        }

        @Override // kotlin.coroutines.InterfaceC10772d
        public final void resumeWith(@NotNull Object obj) {
            this.f21771a.resumeWith(obj);
        }
    }

    /* renamed from: kotlinx.coroutines.sync.d$b */
    /* loaded from: classes3.dex */
    public static final class C11128b extends AbstractC10844k implements InterfaceC10825q<InterfaceC11121b<?>, Object, Object, InterfaceC10820l<? super Throwable, ? extends C10868p>> {
        public C11128b() {
            super(3);
        }

        @Override // kotlin.jvm.functions.InterfaceC10825q
        /* renamed from: a */
        public final InterfaceC10820l<? super Throwable, ? extends C10868p> mo132a(InterfaceC11121b<?> interfaceC11121b, Object obj, Object obj2) {
            return new C11129e(C11126d.this, obj);
        }
    }

    public C11126d(boolean z) {
        super(z ? 1 : 0);
        this.owner = z ? null : C11130f.f21777a;
        new C11128b();
    }

    @Override // kotlinx.coroutines.sync.InterfaceC11123a
    /* renamed from: a */
    public final boolean mo140a() {
        return Math.max(C11134j.f21785g.get(this), 0) == 0;
    }

    @Override // kotlinx.coroutines.sync.InterfaceC11123a
    /* renamed from: b */
    public final void mo139b(@Nullable Object obj) {
        while (mo140a()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21770h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C11034f0 c11034f0 = C11130f.f21777a;
            if (obj2 != c11034f0) {
                boolean z = false;
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c11034f0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    m130e();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // kotlinx.coroutines.sync.InterfaceC11123a
    @Nullable
    /* renamed from: c */
    public final Object mo138c(@NotNull AbstractC10786c abstractC10786c) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C11134j.f21785g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f21786a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                z = false;
                if (i2 <= 0) {
                    z2 = false;
                    break;
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            f21770h.set(this, null);
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            if (!z3) {
                if (!z3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
        } else {
            z = true;
        }
        if (!z) {
            C11020i m226a = C11073k.m226a(C10783b.m455b(abstractC10786c));
            try {
                m131d(new C11127a(m226a));
                Object m288q = m226a.m288q();
                EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
                if (m288q != enumC10782a) {
                    m288q = C10868p.f21418a;
                }
                if (m288q == enumC10782a) {
                    return m288q;
                }
            } catch (Throwable th) {
                m226a.m281z();
                throw th;
            }
        }
        return C10868p.f21418a;
    }

    @NotNull
    public final String toString() {
        return "Mutex@" + C11016h0.m298a(this) + "[isLocked=" + mo140a() + ",owner=" + f21770h.get(this) + ']';
    }
}
