package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.AbstractC11031e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n107#1,7:270\n1#2:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n115#1:270,7\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.e */
/* loaded from: classes3.dex */
public abstract class AbstractC11031e<N extends AbstractC11031e<N>> {
    @NotNull

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f21623a = AtomicReferenceFieldUpdater.newUpdater(AbstractC11031e.class, Object.class, "_next");
    @NotNull

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f21624b = AtomicReferenceFieldUpdater.newUpdater(AbstractC11031e.class, Object.class, "_prev");
    @Volatile
    @Nullable
    private volatile Object _next;
    @Volatile
    @Nullable
    private volatile Object _prev;

    public AbstractC11031e(@Nullable N n) {
        this._prev = n;
    }

    /* renamed from: a */
    public final void m270a() {
        f21624b.lazySet(this, null);
    }

    @Nullable
    /* renamed from: b */
    public final N m269b() {
        Object obj = f21623a.get(this);
        if (obj == C11029d.f21622a) {
            return null;
        }
        return (N) obj;
    }

    /* renamed from: c */
    public abstract boolean mo268c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlinx.coroutines.internal.e] */
    /* renamed from: d */
    public final void m267d() {
        boolean z;
        AbstractC11031e abstractC11031e;
        boolean z2;
        boolean z3;
        ?? m269b;
        if (m269b() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21624b;
            AbstractC11031e abstractC11031e2 = (AbstractC11031e) atomicReferenceFieldUpdater.get(this);
            while (abstractC11031e2 != null && abstractC11031e2.mo268c()) {
                abstractC11031e2 = (AbstractC11031e) atomicReferenceFieldUpdater.get(abstractC11031e2);
            }
            N m269b2 = m269b();
            C10843j.m433c(m269b2);
            while (m269b2.mo268c() && (m269b = m269b2.m269b()) != 0) {
                m269b2 = m269b;
            }
            do {
                Object obj = atomicReferenceFieldUpdater.get(m269b2);
                if (((AbstractC11031e) obj) == null) {
                    abstractC11031e = null;
                } else {
                    abstractC11031e = abstractC11031e2;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(m269b2, obj, abstractC11031e)) {
                        z2 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(m269b2) != obj) {
                        z2 = false;
                        continue;
                        break;
                    }
                }
            } while (!z2);
            if (abstractC11031e2 != null) {
                f21623a.set(abstractC11031e2, m269b2);
            }
            if (m269b2.mo268c()) {
                if (m269b2.m269b() == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    continue;
                }
            }
            if (abstractC11031e2 == null || !abstractC11031e2.mo268c()) {
                return;
            }
        }
    }
}
