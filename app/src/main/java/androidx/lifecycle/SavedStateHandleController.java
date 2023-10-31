package androidx.lifecycle;

import androidx.lifecycle.AbstractC1464h;
import androidx.savedstate.C1689b;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m508d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/k;", "lifecycle-viewmodel-savedstate_release"}, m507k = 1, m506mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC1479k {
    @NotNull

    /* renamed from: a */
    public final String f3403a;
    @NotNull

    /* renamed from: b */
    public final C1508y f3404b;

    /* renamed from: c */
    public boolean f3405c;

    public SavedStateHandleController(@NotNull String str, @NotNull C1508y c1508y) {
        this.f3403a = str;
        this.f3404b = c1508y;
    }

    /* renamed from: g */
    public final void m10567g(@NotNull AbstractC1464h lifecycle, @NotNull C1689b registry) {
        C10843j.m430f(registry, "registry");
        C10843j.m430f(lifecycle, "lifecycle");
        if (!this.f3405c) {
            this.f3405c = true;
            lifecycle.mo10539a(this);
            registry.m10052c(this.f3403a, this.f3404b.f3487e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    @Override // androidx.lifecycle.InterfaceC1479k
    public final void onStateChanged(@NotNull InterfaceC1483m interfaceC1483m, @NotNull AbstractC1464h.EnumC1465a enumC1465a) {
        if (enumC1465a == AbstractC1464h.EnumC1465a.ON_DESTROY) {
            this.f3405c = false;
            interfaceC1483m.getLifecycle().mo10537c(this);
        }
    }
}
