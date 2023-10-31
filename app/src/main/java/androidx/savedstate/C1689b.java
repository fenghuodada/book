package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.C0450b;
import androidx.lifecycle.C1461g;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"RestrictedApi"})
@SourceDebugExtension({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* renamed from: androidx.savedstate.b */
/* loaded from: classes.dex */
public final class C1689b {

    /* renamed from: b */
    public boolean f4125b;
    @Nullable

    /* renamed from: c */
    public Bundle f4126c;

    /* renamed from: d */
    public boolean f4127d;
    @Nullable

    /* renamed from: e */
    public Recreator.C1687a f4128e;
    @NotNull

    /* renamed from: a */
    public final C0450b<String, InterfaceC1691b> f4124a = new C0450b<>();

    /* renamed from: f */
    public boolean f4129f = true;

    /* renamed from: androidx.savedstate.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1690a {
        /* renamed from: a */
        void mo10050a(@NotNull InterfaceC1693d interfaceC1693d);
    }

    /* renamed from: androidx.savedstate.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1691b {
        @NotNull
        /* renamed from: a */
        Bundle mo10049a();
    }

    @MainThread
    @Nullable
    /* renamed from: a */
    public final Bundle m10054a(@NotNull String str) {
        if (this.f4127d) {
            Bundle bundle = this.f4126c;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                Bundle bundle3 = this.f4126c;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.f4126c;
                if (!((bundle4 == null || bundle4.isEmpty()) ? false : true)) {
                    this.f4126c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    @Nullable
    /* renamed from: b */
    public final InterfaceC1691b m10053b() {
        Map.Entry components;
        InterfaceC1691b interfaceC1691b;
        Iterator<Map.Entry<String, InterfaceC1691b>> it = this.f4124a.iterator();
        do {
            C0450b.AbstractC0455e abstractC0455e = (C0450b.AbstractC0455e) it;
            if (!abstractC0455e.hasNext()) {
                return null;
            }
            components = (Map.Entry) abstractC0455e.next();
            C10843j.m431e(components, "components");
            interfaceC1691b = (InterfaceC1691b) components.getValue();
        } while (!C10843j.m435a((String) components.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC1691b;
    }

    @MainThread
    /* renamed from: c */
    public final void m10052c(@NotNull String key, @NotNull InterfaceC1691b provider) {
        C10843j.m430f(key, "key");
        C10843j.m430f(provider, "provider");
        if (!(this.f4124a.mo12445b(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @MainThread
    /* renamed from: d */
    public final void m10051d() {
        if (this.f4129f) {
            Recreator.C1687a c1687a = this.f4128e;
            if (c1687a == null) {
                c1687a = new Recreator.C1687a(this);
            }
            this.f4128e = c1687a;
            try {
                C1461g.C1462a.class.getDeclaredConstructor(new Class[0]);
                Recreator.C1687a c1687a2 = this.f4128e;
                if (c1687a2 != null) {
                    c1687a2.f4122a.add(C1461g.C1462a.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + C1461g.C1462a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
