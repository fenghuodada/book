package androidx.lifecycle;

import androidx.lifecycle.AbstractC1464h;
import androidx.savedstate.C1689b;
import androidx.savedstate.InterfaceC1693d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.g */
/* loaded from: classes.dex */
public final class C1461g {

    /* renamed from: androidx.lifecycle.g$a */
    /* loaded from: classes.dex */
    public static final class C1462a implements C1689b.InterfaceC1690a {
        @Override // androidx.savedstate.C1689b.InterfaceC1690a
        /* renamed from: a */
        public final void mo10050a(@NotNull InterfaceC1693d owner) {
            LinkedHashMap linkedHashMap;
            C10843j.m430f(owner, "owner");
            if (owner instanceof InterfaceC1480k0) {
                C1478j0 viewModelStore = ((InterfaceC1480k0) owner).getViewModelStore();
                C1689b savedStateRegistry = owner.getSavedStateRegistry();
                viewModelStore.getClass();
                Iterator it = new HashSet(viewModelStore.f3450a.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    linkedHashMap = viewModelStore.f3450a;
                    if (!hasNext) {
                        break;
                    }
                    String key = (String) it.next();
                    C10843j.m430f(key, "key");
                    AbstractC1460f0 abstractC1460f0 = (AbstractC1460f0) linkedHashMap.get(key);
                    C10843j.m433c(abstractC1460f0);
                    C1461g.m10551a(abstractC1460f0, savedStateRegistry, owner.getLifecycle());
                }
                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                    savedStateRegistry.m10051d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m10551a(@NotNull AbstractC1460f0 abstractC1460f0, @NotNull C1689b registry, @NotNull AbstractC1464h lifecycle) {
        C10843j.m430f(registry, "registry");
        C10843j.m430f(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC1460f0.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f3405c) {
            savedStateHandleController.m10567g(lifecycle, registry);
            m10550b(lifecycle, registry);
        }
    }

    /* renamed from: b */
    public static void m10550b(AbstractC1464h abstractC1464h, C1689b c1689b) {
        AbstractC1464h.EnumC1468b mo10538b = abstractC1464h.mo10538b();
        if (mo10538b == AbstractC1464h.EnumC1468b.INITIALIZED || mo10538b.m10546a(AbstractC1464h.EnumC1468b.STARTED)) {
            c1689b.m10051d();
        } else {
            abstractC1464h.mo10539a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC1464h, c1689b));
        }
    }
}
