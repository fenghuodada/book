package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.AbstractC1497a;
import androidx.lifecycle.viewmodel.C1500c;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
/* renamed from: androidx.lifecycle.h0 */
/* loaded from: classes.dex */
public final class C1469h0 {
    @NotNull

    /* renamed from: a */
    public final C1478j0 f3442a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC1471b f3443b;
    @NotNull

    /* renamed from: c */
    public final AbstractC1497a f3444c;

    /* renamed from: androidx.lifecycle.h0$a */
    /* loaded from: classes.dex */
    public static class C1470a extends C1472c {
        @Nullable

        /* renamed from: c */
        public static C1470a f3445c;
        @Nullable

        /* renamed from: b */
        public final Application f3446b;

        public C1470a(Application application) {
            this.f3446b = application;
        }

        /* renamed from: a */
        public final <T extends AbstractC1460f0> T m10543a(Class<T> cls, Application application) {
            if (C1445a.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    C10843j.m431e(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.create(cls);
        }

        @Override // androidx.lifecycle.C1469h0.C1472c, androidx.lifecycle.C1469h0.InterfaceC1471b
        @NotNull
        public final <T extends AbstractC1460f0> T create(@NotNull Class<T> modelClass) {
            C10843j.m430f(modelClass, "modelClass");
            Application application = this.f3446b;
            if (application != null) {
                return (T) m10543a(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.C1469h0.C1472c, androidx.lifecycle.C1469h0.InterfaceC1471b
        @NotNull
        public final <T extends AbstractC1460f0> T create(@NotNull Class<T> cls, @NotNull AbstractC1497a abstractC1497a) {
            if (this.f3446b != null) {
                return (T) create(cls);
            }
            Application application = (Application) ((C1500c) abstractC1497a).f3474a.get(C1463g0.f3434a);
            if (application != null) {
                return (T) m10543a(cls, application);
            }
            if (!C1445a.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
    }

    /* renamed from: androidx.lifecycle.h0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1471b {
        @NotNull
        <T extends AbstractC1460f0> T create(@NotNull Class<T> cls);

        @NotNull
        <T extends AbstractC1460f0> T create(@NotNull Class<T> cls, @NotNull AbstractC1497a abstractC1497a);
    }

    /* renamed from: androidx.lifecycle.h0$c */
    /* loaded from: classes.dex */
    public static class C1472c implements InterfaceC1471b {
        @Nullable

        /* renamed from: a */
        public static C1472c f3447a;

        @Override // androidx.lifecycle.C1469h0.InterfaceC1471b
        @NotNull
        public <T extends AbstractC1460f0> T create(@NotNull Class<T> modelClass) {
            C10843j.m430f(modelClass, "modelClass");
            try {
                T newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                C10843j.m431e(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
            }
        }

        @Override // androidx.lifecycle.C1469h0.InterfaceC1471b
        public AbstractC1460f0 create(Class cls, AbstractC1497a abstractC1497a) {
            return create(cls);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: androidx.lifecycle.h0$d */
    /* loaded from: classes.dex */
    public static class C1473d {
        /* renamed from: a */
        public void mo10542a(@NotNull AbstractC1460f0 abstractC1460f0) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C1469h0(@NotNull C1478j0 store, @NotNull InterfaceC1471b factory) {
        this(store, factory, AbstractC1497a.C1498a.f3475b);
        C10843j.m430f(store, "store");
        C10843j.m430f(factory, "factory");
    }

    @JvmOverloads
    public C1469h0(@NotNull C1478j0 store, @NotNull InterfaceC1471b factory, @NotNull AbstractC1497a defaultCreationExtras) {
        C10843j.m430f(store, "store");
        C10843j.m430f(factory, "factory");
        C10843j.m430f(defaultCreationExtras, "defaultCreationExtras");
        this.f3442a = store;
        this.f3443b = factory;
        this.f3444c = defaultCreationExtras;
    }

    @MainThread
    @NotNull
    /* renamed from: a */
    public final <T extends AbstractC1460f0> T m10545a(@NotNull Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m10544b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @MainThread
    @NotNull
    /* renamed from: b */
    public final AbstractC1460f0 m10544b(@NotNull Class cls, @NotNull String key) {
        AbstractC1460f0 viewModel;
        C1473d c1473d;
        C10843j.m430f(key, "key");
        C1478j0 c1478j0 = this.f3442a;
        c1478j0.getClass();
        AbstractC1460f0 abstractC1460f0 = (AbstractC1460f0) c1478j0.f3450a.get(key);
        boolean isInstance = cls.isInstance(abstractC1460f0);
        InterfaceC1471b interfaceC1471b = this.f3443b;
        if (isInstance) {
            if (interfaceC1471b instanceof C1473d) {
                c1473d = (C1473d) interfaceC1471b;
            } else {
                c1473d = null;
            }
            if (c1473d != null) {
                C10843j.m433c(abstractC1460f0);
                c1473d.mo10542a(abstractC1460f0);
            }
            C10843j.m432d(abstractC1460f0, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return abstractC1460f0;
        }
        C1500c c1500c = new C1500c(this.f3444c);
        c1500c.f3474a.put(C1475i0.f3448a, key);
        try {
            viewModel = interfaceC1471b.create(cls, c1500c);
        } catch (AbstractMethodError unused) {
            viewModel = interfaceC1471b.create(cls);
        }
        C10843j.m430f(viewModel, "viewModel");
        AbstractC1460f0 abstractC1460f02 = (AbstractC1460f0) c1478j0.f3450a.put(key, viewModel);
        if (abstractC1460f02 != null) {
            abstractC1460f02.onCleared();
        }
        return viewModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1469h0(@NotNull InterfaceC1480k0 owner, @NotNull InterfaceC1471b interfaceC1471b) {
        this(owner.getViewModelStore(), interfaceC1471b, owner instanceof InterfaceC1459f ? ((InterfaceC1459f) owner).getDefaultViewModelCreationExtras() : AbstractC1497a.C1498a.f3475b);
        C10843j.m430f(owner, "owner");
    }
}
