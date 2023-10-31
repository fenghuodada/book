package androidx.savedstate;

import android.os.Bundle;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.core.content.C0663f;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1479k;
import androidx.lifecycle.InterfaceC1483m;
import androidx.savedstate.C1689b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m508d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/k;", "a", "savedstate_release"}, m507k = 1, m506mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC1479k {
    @NotNull

    /* renamed from: a */
    public final InterfaceC1693d f4121a;

    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes.dex */
    public static final class C1687a implements C1689b.InterfaceC1691b {
        @NotNull

        /* renamed from: a */
        public final LinkedHashSet f4122a;

        public C1687a(@NotNull C1689b registry) {
            C10843j.m430f(registry, "registry");
            this.f4122a = new LinkedHashSet();
            registry.m10052c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.C1689b.InterfaceC1691b
        @NotNull
        /* renamed from: a */
        public final Bundle mo10049a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4122a));
            return bundle;
        }
    }

    public Recreator(@NotNull InterfaceC1693d owner) {
        C10843j.m430f(owner, "owner");
        this.f4121a = owner;
    }

    @Override // androidx.lifecycle.InterfaceC1479k
    public final void onStateChanged(@NotNull InterfaceC1483m interfaceC1483m, @NotNull AbstractC1464h.EnumC1465a enumC1465a) {
        if (enumC1465a == AbstractC1464h.EnumC1465a.ON_CREATE) {
            interfaceC1483m.getLifecycle().mo10537c(this);
            InterfaceC1693d interfaceC1693d = this.f4121a;
            Bundle m10054a = interfaceC1693d.getSavedStateRegistry().m10054a("androidx.savedstate.Restarter");
            if (m10054a == null) {
                return;
            }
            ArrayList<String> stringArrayList = m10054a.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C1689b.InterfaceC1690a.class);
                        C10843j.m431e(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                C10843j.m431e(newInstance, "{\n                constr…wInstance()\n            }");
                                ((C1689b.InterfaceC1690a) newInstance).mo10050a(interfaceC1693d);
                            } catch (Exception e) {
                                throw new RuntimeException(C0552c.m12192b("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(C0663f.m12005a("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
