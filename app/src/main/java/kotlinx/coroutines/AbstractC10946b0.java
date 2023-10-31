package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExperimentalStdlibApi;
import kotlin.coroutines.AbstractC10768a;
import kotlin.coroutines.AbstractC10769b;
import kotlin.coroutines.C10781g;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10773e;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.internal.C11046k;
import kotlinx.coroutines.internal.C11048l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.b0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10946b0 extends AbstractC10768a implements InterfaceC10773e {
    @NotNull

    /* renamed from: b */
    public static final C10947a f21498b = new C10947a();

    @ExperimentalStdlibApi
    /* renamed from: kotlinx.coroutines.b0$a */
    /* loaded from: classes3.dex */
    public static final class C10947a extends AbstractC10769b<InterfaceC10773e, AbstractC10946b0> {

        /* renamed from: kotlinx.coroutines.b0$a$a */
        /* loaded from: classes3.dex */
        public static final class C10948a extends AbstractC10844k implements InterfaceC10820l<InterfaceC10775f.InterfaceC10778b, AbstractC10946b0> {

            /* renamed from: a */
            public static final C10948a f21499a = new C10948a();

            public C10948a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.InterfaceC10820l
            public final AbstractC10946b0 invoke(InterfaceC10775f.InterfaceC10778b interfaceC10778b) {
                InterfaceC10775f.InterfaceC10778b interfaceC10778b2 = interfaceC10778b;
                if (interfaceC10778b2 instanceof AbstractC10946b0) {
                    return (AbstractC10946b0) interfaceC10778b2;
                }
                return null;
            }
        }

        public C10947a() {
            super(InterfaceC10773e.C10774a.f21375a, C10948a.f21499a);
        }
    }

    public AbstractC10946b0() {
        super(InterfaceC10773e.C10774a.f21375a);
    }

    /* renamed from: G */
    public abstract void mo100G(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Runnable runnable);

    /* renamed from: H */
    public boolean mo352H() {
        return !(this instanceof C10939a2);
    }

    @Override // kotlin.coroutines.AbstractC10768a, kotlin.coroutines.InterfaceC10775f.InterfaceC10778b, kotlin.coroutines.InterfaceC10775f
    @Nullable
    /* renamed from: a */
    public final <E extends InterfaceC10775f.InterfaceC10778b> E mo195a(@NotNull InterfaceC10775f.InterfaceC10780c<E> key) {
        boolean z;
        C10843j.m430f(key, "key");
        if (key instanceof AbstractC10769b) {
            AbstractC10769b abstractC10769b = (AbstractC10769b) key;
            InterfaceC10775f.InterfaceC10780c<?> key2 = this.f21368a;
            C10843j.m430f(key2, "key");
            if (key2 != abstractC10769b && abstractC10769b.f21370b != key2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                E e = (E) abstractC10769b.m461a(this);
                if (e instanceof InterfaceC10775f.InterfaceC10778b) {
                    return e;
                }
            }
        } else if (InterfaceC10773e.C10774a.f21375a == key) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC10773e
    /* renamed from: d */
    public final void mo351d(@NotNull InterfaceC10772d<?> interfaceC10772d) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C11020i c11020i;
        C11046k c11046k = (C11046k) interfaceC10772d;
        do {
            atomicReferenceFieldUpdater = C11046k.f21640h;
        } while (atomicReferenceFieldUpdater.get(c11046k) == C11048l.f21646b);
        Object obj = atomicReferenceFieldUpdater.get(c11046k);
        if (obj instanceof C11020i) {
            c11020i = (C11020i) obj;
        } else {
            c11020i = null;
        }
        if (c11020i != null) {
            c11020i.m290l();
        }
    }

    @Override // kotlin.coroutines.InterfaceC10773e
    @NotNull
    /* renamed from: e */
    public final C11046k mo350e(@NotNull InterfaceC10772d interfaceC10772d) {
        return new C11046k(this, interfaceC10772d);
    }

    @Override // kotlin.coroutines.AbstractC10768a, kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: l */
    public final InterfaceC10775f mo186l(@NotNull InterfaceC10775f.InterfaceC10780c<?> key) {
        boolean z;
        C10843j.m430f(key, "key");
        boolean z2 = key instanceof AbstractC10769b;
        C10781g c10781g = C10781g.f21377a;
        if (z2) {
            AbstractC10769b abstractC10769b = (AbstractC10769b) key;
            InterfaceC10775f.InterfaceC10780c<?> key2 = this.f21368a;
            C10843j.m430f(key2, "key");
            if (key2 != abstractC10769b && abstractC10769b.f21370b != key2) {
                z = false;
            } else {
                z = true;
            }
            if (z && abstractC10769b.m461a(this) != null) {
                return c10781g;
            }
        } else if (InterfaceC10773e.C10774a.f21375a == key) {
            return c10781g;
        }
        return this;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + C11016h0.m298a(this);
    }
}
