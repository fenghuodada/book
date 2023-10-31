package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.internal.C11046k;
import kotlinx.coroutines.internal.C11048l;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n*L\n1#1,386:1\n1#2:387\n19#3:388\n*S KotlinDebug\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n380#1:388\n*E\n"})
/* renamed from: kotlinx.coroutines.k */
/* loaded from: classes3.dex */
public final class C11073k {
    @NotNull
    /* renamed from: a */
    public static final <T> C11020i<T> m226a(@NotNull InterfaceC10772d<? super T> interfaceC10772d) {
        C11020i<T> c11020i;
        C11020i<T> c11020i2;
        boolean z;
        boolean z2 = true;
        if (!(interfaceC10772d instanceof C11046k)) {
            return new C11020i<>(1, interfaceC10772d);
        }
        C11046k c11046k = (C11046k) interfaceC10772d;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11046k.f21640h;
            Object obj = atomicReferenceFieldUpdater.get(c11046k);
            C11034f0 c11034f0 = C11048l.f21646b;
            c11020i = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c11046k, c11034f0);
                c11020i2 = null;
                break;
            } else if (obj instanceof C11020i) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(c11046k, obj, c11034f0)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(c11046k) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    c11020i2 = (C11020i) obj;
                    break;
                }
            } else if (obj != c11034f0 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c11020i2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C11020i.f21609g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c11020i2);
            if ((obj2 instanceof C11101s) && ((C11101s) obj2).f21715d != null) {
                c11020i2.m290l();
                z2 = false;
            } else {
                C11020i.f21608f.set(c11020i2, 536870911);
                atomicReferenceFieldUpdater2.set(c11020i2, C10945b.f21497a);
            }
            if (z2) {
                c11020i = c11020i2;
            }
            if (c11020i != null) {
                return c11020i;
            }
        }
        return new C11020i<>(2, interfaceC10772d);
    }
}
