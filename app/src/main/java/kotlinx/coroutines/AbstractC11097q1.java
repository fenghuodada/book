package kotlinx.coroutines;

import kotlinx.coroutines.internal.C11064v;
import kotlinx.coroutines.scheduling.C11107c;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.q1 */
/* loaded from: classes3.dex */
public abstract class AbstractC11097q1 extends AbstractC10946b0 {
    @NotNull
    /* renamed from: I */
    public abstract AbstractC11097q1 mo169I();

    @Override // kotlinx.coroutines.AbstractC10946b0
    @NotNull
    public String toString() {
        AbstractC11097q1 abstractC11097q1;
        String str;
        C11107c c11107c = C11093p0.f21708a;
        AbstractC11097q1 abstractC11097q12 = C11064v.f21674a;
        if (this == abstractC11097q12) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC11097q1 = abstractC11097q12.mo169I();
            } catch (UnsupportedOperationException unused) {
                abstractC11097q1 = null;
            }
            if (this == abstractC11097q1) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            return getClass().getSimpleName() + '@' + C11016h0.m298a(this);
        }
        return str;
    }
}
