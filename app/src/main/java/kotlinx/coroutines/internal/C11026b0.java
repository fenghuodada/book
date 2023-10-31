package kotlinx.coroutines.internal;

import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.C10783b;
import kotlin.coroutines.jvm.internal.InterfaceC10787d;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.AbstractC10936a;
import kotlinx.coroutines.C11154x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.b0 */
/* loaded from: classes3.dex */
public class C11026b0<T> extends AbstractC10936a<T> implements InterfaceC10787d {
    @JvmField
    @NotNull

    /* renamed from: d */
    public final InterfaceC10772d<T> f21618d;

    public C11026b0(@NotNull InterfaceC10772d interfaceC10772d, @NotNull InterfaceC10775f interfaceC10775f) {
        super(interfaceC10775f, true);
        this.f21618d = interfaceC10772d;
    }

    @Override // kotlinx.coroutines.C11084n1
    /* renamed from: Q */
    public final boolean mo204Q() {
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC10936a
    /* renamed from: c0 */
    public void mo225c0(@Nullable Object obj) {
        this.f21618d.resumeWith(C11154x.m108a(obj));
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC10787d
    @Nullable
    public final InterfaceC10787d getCallerFrame() {
        InterfaceC10772d<T> interfaceC10772d = this.f21618d;
        if (interfaceC10772d instanceof InterfaceC10787d) {
            return (InterfaceC10787d) interfaceC10772d;
        }
        return null;
    }

    @Override // kotlinx.coroutines.C11084n1
    /* renamed from: t */
    public void mo184t(@Nullable Object obj) {
        C11048l.m252a(C10783b.m455b(this.f21618d), C11154x.m108a(obj), null);
    }
}
