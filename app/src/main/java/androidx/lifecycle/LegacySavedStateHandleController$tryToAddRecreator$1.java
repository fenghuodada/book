package androidx.lifecycle;

import androidx.lifecycle.AbstractC1464h;
import androidx.savedstate.C1689b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m508d2 = {"androidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1", "Landroidx/lifecycle/k;", "lifecycle-viewmodel-savedstate_release"}, m507k = 1, m506mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements InterfaceC1479k {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1464h f3380a;

    /* renamed from: b */
    public final /* synthetic */ C1689b f3381b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(AbstractC1464h abstractC1464h, C1689b c1689b) {
        this.f3380a = abstractC1464h;
        this.f3381b = c1689b;
    }

    @Override // androidx.lifecycle.InterfaceC1479k
    public final void onStateChanged(@NotNull InterfaceC1483m interfaceC1483m, @NotNull AbstractC1464h.EnumC1465a enumC1465a) {
        if (enumC1465a == AbstractC1464h.EnumC1465a.ON_START) {
            this.f3380a.mo10537c(this);
            this.f3381b.m10051d();
        }
    }
}
