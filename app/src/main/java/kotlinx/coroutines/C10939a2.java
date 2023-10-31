package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC10775f;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.a2 */
/* loaded from: classes3.dex */
public final class C10939a2 extends AbstractC10946b0 {

    /* renamed from: c */
    public static final /* synthetic */ int f21492c = 0;

    static {
        new C10939a2();
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    /* renamed from: G */
    public final void mo100G(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Runnable runnable) {
        if (((C10978e2) interfaceC10775f.mo195a(C10978e2.f21549b)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    @NotNull
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
