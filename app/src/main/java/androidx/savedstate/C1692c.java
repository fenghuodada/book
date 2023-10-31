package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.C0450b;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1479k;
import androidx.lifecycle.InterfaceC1483m;
import androidx.savedstate.C1689b;
import java.util.Map;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.savedstate.c */
/* loaded from: classes.dex */
public final class C1692c {
    @NotNull

    /* renamed from: a */
    public final InterfaceC1693d f4130a;
    @NotNull

    /* renamed from: b */
    public final C1689b f4131b = new C1689b();

    /* renamed from: c */
    public boolean f4132c;

    public C1692c(InterfaceC1693d interfaceC1693d) {
        this.f4130a = interfaceC1693d;
    }

    @MainThread
    /* renamed from: a */
    public final void m10048a() {
        boolean z;
        InterfaceC1693d interfaceC1693d = this.f4130a;
        AbstractC1464h lifecycle = interfaceC1693d.getLifecycle();
        if (lifecycle.mo10538b() == AbstractC1464h.EnumC1468b.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lifecycle.mo10539a(new Recreator(interfaceC1693d));
            final C1689b c1689b = this.f4131b;
            c1689b.getClass();
            if (!c1689b.f4125b) {
                lifecycle.mo10539a(new InterfaceC1479k() { // from class: androidx.savedstate.a
                    @Override // androidx.lifecycle.InterfaceC1479k
                    public final void onStateChanged(InterfaceC1483m interfaceC1483m, AbstractC1464h.EnumC1465a enumC1465a) {
                        boolean z2;
                        C1689b this$0 = C1689b.this;
                        C10843j.m430f(this$0, "this$0");
                        if (enumC1465a == AbstractC1464h.EnumC1465a.ON_START) {
                            z2 = true;
                        } else if (enumC1465a != AbstractC1464h.EnumC1465a.ON_STOP) {
                            return;
                        } else {
                            z2 = false;
                        }
                        this$0.f4129f = z2;
                    }
                });
                c1689b.f4125b = true;
                this.f4132c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    @MainThread
    /* renamed from: b */
    public final void m10047b(@Nullable Bundle bundle) {
        Bundle bundle2;
        if (!this.f4132c) {
            m10048a();
        }
        AbstractC1464h lifecycle = this.f4130a.getLifecycle();
        if (!lifecycle.mo10538b().m10546a(AbstractC1464h.EnumC1468b.STARTED)) {
            C1689b c1689b = this.f4131b;
            if (c1689b.f4125b) {
                if (!c1689b.f4127d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    c1689b.f4126c = bundle2;
                    c1689b.f4127d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo10538b()).toString());
    }

    @MainThread
    /* renamed from: c */
    public final void m10046c(@NotNull Bundle outBundle) {
        C10843j.m430f(outBundle, "outBundle");
        C1689b c1689b = this.f4131b;
        c1689b.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = c1689b.f4126c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C0450b<String, C1689b.InterfaceC1691b> c0450b = c1689b.f4124a;
        c0450b.getClass();
        C0450b.C0454d c0454d = new C0450b.C0454d();
        c0450b.f1447c.put(c0454d, Boolean.FALSE);
        while (c0454d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0454d.next();
            bundle.putBundle((String) entry.getKey(), ((C1689b.InterfaceC1691b) entry.getValue()).mo10049a());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
    }
}
