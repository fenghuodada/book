package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1469h0;
import androidx.lifecycle.C1508y;
import androidx.lifecycle.viewmodel.AbstractC1497a;
import androidx.lifecycle.viewmodel.C1500c;
import androidx.savedstate.C1689b;
import androidx.savedstate.InterfaceC1693d;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.lifecycle.c0 */
/* loaded from: classes.dex */
public final class C1453c0 extends C1469h0.C1473d implements C1469h0.InterfaceC1471b {
    @Nullable

    /* renamed from: a */
    public final Application f3421a;
    @NotNull

    /* renamed from: b */
    public final C1469h0.C1470a f3422b;
    @Nullable

    /* renamed from: c */
    public final Bundle f3423c;
    @Nullable

    /* renamed from: d */
    public final AbstractC1464h f3424d;
    @Nullable

    /* renamed from: e */
    public final C1689b f3425e;

    @SuppressLint({"LambdaLast"})
    public C1453c0(@Nullable Application application, @NotNull InterfaceC1693d owner, @Nullable Bundle bundle) {
        C1469h0.C1470a c1470a;
        C10843j.m430f(owner, "owner");
        this.f3425e = owner.getSavedStateRegistry();
        this.f3424d = owner.getLifecycle();
        this.f3423c = bundle;
        this.f3421a = application;
        if (application != null) {
            if (C1469h0.C1470a.f3445c == null) {
                C1469h0.C1470a.f3445c = new C1469h0.C1470a(application);
            }
            c1470a = C1469h0.C1470a.f3445c;
            C10843j.m433c(c1470a);
        } else {
            c1470a = new C1469h0.C1470a(null);
        }
        this.f3422b = c1470a;
    }

    @Override // androidx.lifecycle.C1469h0.C1473d
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: a */
    public final void mo10542a(@NotNull AbstractC1460f0 abstractC1460f0) {
        AbstractC1464h abstractC1464h = this.f3424d;
        if (abstractC1464h != null) {
            C1689b c1689b = this.f3425e;
            C10843j.m433c(c1689b);
            C1461g.m10551a(abstractC1460f0, c1689b, abstractC1464h);
        }
    }

    @NotNull
    /* renamed from: b */
    public final AbstractC1460f0 m10556b(@NotNull Class modelClass, @NotNull String str) {
        List<Class<?>> list;
        AbstractC1460f0 m10554b;
        C10843j.m430f(modelClass, "modelClass");
        AbstractC1464h abstractC1464h = this.f3424d;
        if (abstractC1464h != null) {
            boolean isAssignableFrom = C1445a.class.isAssignableFrom(modelClass);
            Application application = this.f3421a;
            if (isAssignableFrom && application != null) {
                list = C1455d0.f3426a;
            } else {
                list = C1455d0.f3427b;
            }
            Constructor m10555a = C1455d0.m10555a(modelClass, list);
            if (m10555a == null) {
                if (application != null) {
                    return this.f3422b.create(modelClass);
                }
                if (C1469h0.C1472c.f3447a == null) {
                    C1469h0.C1472c.f3447a = new C1469h0.C1472c();
                }
                C1469h0.C1472c c1472c = C1469h0.C1472c.f3447a;
                C10843j.m433c(c1472c);
                return c1472c.create(modelClass);
            }
            C1689b c1689b = this.f3425e;
            C10843j.m433c(c1689b);
            Bundle m10054a = c1689b.m10054a(str);
            Class<? extends Object>[] clsArr = C1508y.f3482f;
            C1508y m10519a = C1508y.C1509a.m10519a(m10054a, this.f3423c);
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, m10519a);
            savedStateHandleController.m10567g(abstractC1464h, c1689b);
            AbstractC1464h.EnumC1468b mo10538b = abstractC1464h.mo10538b();
            if (mo10538b != AbstractC1464h.EnumC1468b.INITIALIZED && !mo10538b.m10546a(AbstractC1464h.EnumC1468b.STARTED)) {
                abstractC1464h.mo10539a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC1464h, c1689b));
            } else {
                c1689b.m10051d();
            }
            if (isAssignableFrom && application != null) {
                m10554b = C1455d0.m10554b(modelClass, m10555a, application, m10519a);
            } else {
                m10554b = C1455d0.m10554b(modelClass, m10555a, m10519a);
            }
            m10554b.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
            return m10554b;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.C1469h0.InterfaceC1471b
    @NotNull
    public final <T extends AbstractC1460f0> T create(@NotNull Class<T> modelClass) {
        C10843j.m430f(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m10556b(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C1469h0.InterfaceC1471b
    @NotNull
    public final <T extends AbstractC1460f0> T create(@NotNull Class<T> cls, @NotNull AbstractC1497a abstractC1497a) {
        List<Class<?>> list;
        C1475i0 c1475i0 = C1475i0.f3448a;
        C1500c c1500c = (C1500c) abstractC1497a;
        LinkedHashMap linkedHashMap = c1500c.f3474a;
        String str = (String) linkedHashMap.get(c1475i0);
        if (str != null) {
            if (linkedHashMap.get(C1510z.f3488a) != null && linkedHashMap.get(C1510z.f3489b) != null) {
                Application application = (Application) linkedHashMap.get(C1463g0.f3434a);
                boolean isAssignableFrom = C1445a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    list = C1455d0.f3426a;
                } else {
                    list = C1455d0.f3427b;
                }
                Constructor m10555a = C1455d0.m10555a(cls, list);
                if (m10555a == null) {
                    return (T) this.f3422b.create(cls, abstractC1497a);
                }
                if (isAssignableFrom && application != null) {
                    return (T) C1455d0.m10554b(cls, m10555a, application, C1510z.m10518a(c1500c));
                }
                return (T) C1455d0.m10554b(cls, m10555a, C1510z.m10518a(c1500c));
            } else if (this.f3424d != null) {
                return (T) m10556b(cls, str);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
}
