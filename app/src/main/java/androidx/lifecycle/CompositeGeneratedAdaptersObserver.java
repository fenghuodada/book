package androidx.lifecycle;

import androidx.lifecycle.AbstractC1464h;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m508d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/k;", "lifecycle-common"}, m507k = 1, m506mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements InterfaceC1479k {
    @NotNull

    /* renamed from: a */
    public final InterfaceC1456e[] f3376a;

    public CompositeGeneratedAdaptersObserver(@NotNull InterfaceC1456e[] interfaceC1456eArr) {
        this.f3376a = interfaceC1456eArr;
    }

    @Override // androidx.lifecycle.InterfaceC1479k
    public final void onStateChanged(@NotNull InterfaceC1483m interfaceC1483m, @NotNull AbstractC1464h.EnumC1465a enumC1465a) {
        new HashMap();
        InterfaceC1456e[] interfaceC1456eArr = this.f3376a;
        for (InterfaceC1456e interfaceC1456e : interfaceC1456eArr) {
            interfaceC1456e.m10553a();
        }
        for (InterfaceC1456e interfaceC1456e2 : interfaceC1456eArr) {
            interfaceC1456e2.m10553a();
        }
    }
}
