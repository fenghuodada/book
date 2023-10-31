package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.internal.C11046k;
import kotlinx.coroutines.internal.C11048l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.m */
/* loaded from: classes3.dex */
public final class C11079m extends AbstractC11072j1 {
    @JvmField
    @NotNull

    /* renamed from: e */
    public final C11020i<?> f21684e;

    public C11079m(@NotNull C11020i<?> c11020i) {
        this.f21684e = c11020i;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final /* bridge */ /* synthetic */ C10868p invoke(Throwable th) {
        mo110l(th);
        return C10868p.f21418a;
    }

    @Override // kotlinx.coroutines.AbstractC11148v
    /* renamed from: l */
    public final void mo110l(@Nullable Throwable th) {
        boolean z;
        C11084n1 m217m = m217m();
        C11020i<?> c11020i = this.f21684e;
        Throwable mo180o = c11020i.mo180o(m217m);
        boolean z2 = false;
        if (c11020i.m283w()) {
            InterfaceC10772d<?> interfaceC10772d = c11020i.f21611d;
            C10843j.m432d(interfaceC10772d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            C11046k c11046k = (C11046k) interfaceC10772d;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11046k.f21640h;
                Object obj = atomicReferenceFieldUpdater.get(c11046k);
                C11034f0 c11034f0 = C11048l.f21646b;
                boolean z3 = true;
                if (C10843j.m435a(obj, c11034f0)) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(c11046k, c11034f0, mo180o)) {
                            z = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(c11046k) != c11034f0) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                } else if (obj instanceof Throwable) {
                    break;
                } else {
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(c11046k, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(c11046k) != obj) {
                                z3 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z3) {
                        break;
                    }
                }
            }
            z2 = true;
        }
        if (!z2) {
            c11020i.mo134p(mo180o);
            if (!c11020i.m283w()) {
                c11020i.m290l();
            }
        }
    }
}
