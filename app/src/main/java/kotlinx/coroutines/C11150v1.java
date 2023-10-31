package kotlinx.coroutines;

import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C11084n1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1451:1\n1#2:1452\n*E\n"})
/* renamed from: kotlinx.coroutines.v1 */
/* loaded from: classes3.dex */
public final class C11150v1<T> extends AbstractC11081m1 {
    @NotNull

    /* renamed from: e */
    public final C11020i<T> f21811e;

    public C11150v1(@NotNull C11084n1.C11085a c11085a) {
        this.f21811e = c11085a;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final /* bridge */ /* synthetic */ C10868p invoke(Throwable th) {
        mo110l(th);
        return C10868p.f21418a;
    }

    @Override // kotlinx.coroutines.AbstractC11148v
    /* renamed from: l */
    public final void mo110l(@Nullable Throwable th) {
        Object m207M = m217m().m207M();
        this.f21811e.resumeWith(m207M instanceof C11137t ? C10864l.m419a(((C11137t) m207M).f21796a) : C11091o1.m172a(m207M));
    }
}
