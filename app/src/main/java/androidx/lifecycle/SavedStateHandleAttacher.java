package androidx.lifecycle;

import androidx.lifecycle.AbstractC1464h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m508d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/k;", "lifecycle-viewmodel-savedstate_release"}, m507k = 1, m506mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1479k {
    @NotNull

    /* renamed from: a */
    public final C1446a0 f3402a;

    public SavedStateHandleAttacher(@NotNull C1446a0 c1446a0) {
        this.f3402a = c1446a0;
    }

    @Override // androidx.lifecycle.InterfaceC1479k
    public final void onStateChanged(@NotNull InterfaceC1483m interfaceC1483m, @NotNull AbstractC1464h.EnumC1465a enumC1465a) {
        boolean z;
        if (enumC1465a == AbstractC1464h.EnumC1465a.ON_CREATE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            interfaceC1483m.getLifecycle().mo10537c(this);
            C1446a0 c1446a0 = this.f3402a;
            if (!c1446a0.f3409b) {
                c1446a0.f3410c = c1446a0.f3408a.m10054a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                c1446a0.f3409b = true;
                C1451b0 c1451b0 = (C1451b0) c1446a0.f3411d.getValue();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC1465a).toString());
    }
}
