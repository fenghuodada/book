package kotlinx.coroutines;

import kotlinx.coroutines.internal.C11038h0;
import kotlinx.coroutines.internal.C11064v;
import kotlinx.coroutines.scheduling.C11107c;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.j0 */
/* loaded from: classes3.dex */
public final class C11071j0 {
    @NotNull

    /* renamed from: a */
    public static final InterfaceC11074k0 f21680a;

    static {
        String str;
        boolean z;
        InterfaceC11074k0 interfaceC11074k0;
        int i = C11038h0.f21629a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (z) {
            C11107c c11107c = C11093p0.f21708a;
            AbstractC11097q1 abstractC11097q1 = C11064v.f21674a;
            abstractC11097q1.mo169I();
            if (abstractC11097q1 instanceof InterfaceC11074k0) {
                interfaceC11074k0 = (InterfaceC11074k0) abstractC11097q1;
                f21680a = interfaceC11074k0;
            }
        }
        interfaceC11074k0 = RunnableC11021i0.f21613j;
        f21680a = interfaceC11074k0;
    }
}
