package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1453c0;
import androidx.lifecycle.C1463g0;
import androidx.lifecycle.C1469h0;
import androidx.lifecycle.C1478j0;
import androidx.lifecycle.C1484n;
import androidx.lifecycle.C1510z;
import androidx.lifecycle.InterfaceC1459f;
import androidx.lifecycle.InterfaceC1480k0;
import androidx.lifecycle.viewmodel.AbstractC1497a;
import androidx.lifecycle.viewmodel.C1500c;
import androidx.savedstate.C1689b;
import androidx.savedstate.C1692c;
import androidx.savedstate.InterfaceC1693d;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FragmentViewLifecycleOwner implements InterfaceC1459f, InterfaceC1693d, InterfaceC1480k0 {
    private C1469h0.InterfaceC1471b mDefaultFactory;
    private final Fragment mFragment;
    private final Runnable mRestoreViewSavedStateRunnable;
    private final C1478j0 mViewModelStore;
    private C1484n mLifecycleRegistry = null;
    private C1692c mSavedStateRegistryController = null;

    public FragmentViewLifecycleOwner(@NonNull Fragment fragment, @NonNull C1478j0 c1478j0, @NonNull Runnable runnable) {
        this.mFragment = fragment;
        this.mViewModelStore = c1478j0;
        this.mRestoreViewSavedStateRunnable = runnable;
    }

    @Override // androidx.lifecycle.InterfaceC1459f
    @NonNull
    @CallSuper
    public AbstractC1497a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.mFragment.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        C1500c c1500c = new C1500c();
        LinkedHashMap linkedHashMap = c1500c.f3474a;
        if (application != null) {
            linkedHashMap.put(C1463g0.f3434a, application);
        }
        linkedHashMap.put(C1510z.f3488a, this.mFragment);
        linkedHashMap.put(C1510z.f3489b, this);
        if (this.mFragment.getArguments() != null) {
            linkedHashMap.put(C1510z.f3490c, this.mFragment.getArguments());
        }
        return c1500c;
    }

    @Override // androidx.lifecycle.InterfaceC1459f
    @NonNull
    public C1469h0.InterfaceC1471b getDefaultViewModelProviderFactory() {
        Application application;
        C1469h0.InterfaceC1471b defaultViewModelProviderFactory = this.mFragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.mFragment.mDefaultFactory)) {
            this.mDefaultFactory = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = this.mFragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            Fragment fragment = this.mFragment;
            this.mDefaultFactory = new C1453c0(application, fragment, fragment.getArguments());
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.lifecycle.InterfaceC1483m
    @NonNull
    public AbstractC1464h getLifecycle() {
        initialize();
        return this.mLifecycleRegistry;
    }

    @Override // androidx.savedstate.InterfaceC1693d
    @NonNull
    public C1689b getSavedStateRegistry() {
        initialize();
        return this.mSavedStateRegistryController.f4131b;
    }

    @Override // androidx.lifecycle.InterfaceC1480k0
    @NonNull
    public C1478j0 getViewModelStore() {
        initialize();
        return this.mViewModelStore;
    }

    public void handleLifecycleEvent(@NonNull AbstractC1464h.EnumC1465a enumC1465a) {
        this.mLifecycleRegistry.m10534f(enumC1465a);
    }

    public void initialize() {
        if (this.mLifecycleRegistry == null) {
            this.mLifecycleRegistry = new C1484n(this);
            C1692c c1692c = new C1692c(this);
            this.mSavedStateRegistryController = c1692c;
            c1692c.m10048a();
            this.mRestoreViewSavedStateRunnable.run();
        }
    }

    public boolean isInitialized() {
        return this.mLifecycleRegistry != null;
    }

    public void performRestore(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.m10047b(bundle);
    }

    public void performSave(@NonNull Bundle bundle) {
        this.mSavedStateRegistryController.m10046c(bundle);
    }

    public void setCurrentState(@NonNull AbstractC1464h.EnumC1468b enumC1468b) {
        this.mLifecycleRegistry.m10532h(enumC1468b);
    }
}
