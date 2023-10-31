package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.C10783b;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.internal.C11026b0;
import kotlinx.coroutines.internal.C11048l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.l0 */
/* loaded from: classes3.dex */
public final class C11077l0<T> extends C11026b0<T> {
    @NotNull

    /* renamed from: e */
    public static final AtomicIntegerFieldUpdater f21683e = AtomicIntegerFieldUpdater.newUpdater(C11077l0.class, "_decision");
    @Volatile
    private volatile int _decision;

    public C11077l0(@NotNull InterfaceC10772d interfaceC10772d, @NotNull InterfaceC10775f interfaceC10775f) {
        super(interfaceC10772d, interfaceC10775f);
    }

    @Override // kotlinx.coroutines.internal.C11026b0, kotlinx.coroutines.AbstractC10936a
    /* renamed from: c0 */
    public final void mo225c0(@Nullable Object obj) {
        boolean z;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21683e;
            int i = atomicIntegerFieldUpdater.get(this);
            z = false;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        C11048l.m252a(C10783b.m455b(this.f21618d), C11154x.m108a(obj), null);
    }

    @Override // kotlinx.coroutines.internal.C11026b0, kotlinx.coroutines.C11084n1
    /* renamed from: t */
    public final void mo184t(@Nullable Object obj) {
        mo225c0(obj);
    }
}
