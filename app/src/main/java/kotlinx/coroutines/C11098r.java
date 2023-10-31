package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.r */
/* loaded from: classes3.dex */
public final class C11098r<T> extends C11084n1 implements InterfaceC11095q<T> {
    public C11098r(@Nullable InterfaceC11017h1 interfaceC11017h1) {
        super(true);
        m205P(interfaceC11017h1);
    }

    @Override // kotlinx.coroutines.InterfaceC11095q
    /* renamed from: q */
    public final boolean mo168q(@NotNull Throwable th) {
        Object m194a0;
        C11137t c11137t = new C11137t(false, th);
        do {
            m194a0 = m194a0(m207M(), c11137t);
            if (m194a0 == C11091o1.f21701a) {
                return false;
            }
            if (m194a0 == C11091o1.f21702b) {
                break;
            }
        } while (m194a0 == C11091o1.f21703c);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC11095q
    /* renamed from: s */
    public final boolean mo167s(T t) {
        Object m194a0;
        do {
            m194a0 = m194a0(m207M(), t);
            if (m194a0 == C11091o1.f21701a) {
                return false;
            }
            if (m194a0 == C11091o1.f21702b) {
                break;
            }
        } while (m194a0 == C11091o1.f21703c);
        return true;
    }
}
