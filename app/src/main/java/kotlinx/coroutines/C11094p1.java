package kotlinx.coroutines;

import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.C10783b;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlinx.coroutines.internal.C11048l;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.p1 */
/* loaded from: classes3.dex */
public final class C11094p1 extends C11153w1 {
    @NotNull

    /* renamed from: d */
    public final InterfaceC10772d<C10868p> f21710d;

    public C11094p1(@NotNull InterfaceC10775f interfaceC10775f, @NotNull InterfaceC10824p<? super InterfaceC10976e0, ? super InterfaceC10772d<? super C10868p>, ? extends Object> interfaceC10824p) {
        super(interfaceC10775f, false);
        this.f21710d = C10783b.m456a(this, this, interfaceC10824p);
    }

    @Override // kotlinx.coroutines.C11084n1
    /* renamed from: W */
    public final void mo170W() {
        try {
            C11048l.m252a(C10783b.m455b(this.f21710d), C10868p.f21418a, null);
        } catch (Throwable th) {
            resumeWith(C10864l.m419a(th));
            throw th;
        }
    }
}
