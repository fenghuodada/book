package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0052n;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.contextaware.InterfaceC0041b;
import androidx.activity.result.AbstractC0066g;
import androidx.activity.result.InterfaceC0069h;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.AbstractC0631l0;
import androidx.core.app.C0601b;
import androidx.core.app.C0628k0;
import androidx.core.app.C0632m;
import androidx.core.app.InterfaceC0607b0;
import androidx.core.app.InterfaceC0609c0;
import androidx.core.content.InterfaceC0664g;
import androidx.core.content.InterfaceC0665h;
import androidx.core.p003os.BuildCompat;
import androidx.core.util.InterfaceC0797a;
import androidx.core.view.InterfaceC0895b0;
import androidx.core.view.InterfaceC0968m;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1478j0;
import androidx.lifecycle.C1484n;
import androidx.lifecycle.InterfaceC1480k0;
import androidx.lifecycle.InterfaceC1483m;
import androidx.loader.app.AbstractC1515a;
import androidx.savedstate.C1689b;
import androidx.savedstate.InterfaceC1693d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements C0601b.InterfaceC0605d {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C1484n mFragmentLifecycleRegistry;
    final FragmentController mFragments;
    boolean mResumed;
    boolean mStopped;

    /* loaded from: classes.dex */
    public class HostCallbacks extends FragmentHostCallback<FragmentActivity> implements InterfaceC0664g, InterfaceC0665h, InterfaceC0607b0, InterfaceC0609c0, InterfaceC1480k0, InterfaceC0052n, InterfaceC0069h, InterfaceC1693d, FragmentOnAttachListener, InterfaceC0968m {
        public HostCallbacks() {
            super(FragmentActivity.this);
        }

        @Override // androidx.core.view.InterfaceC0968m
        public void addMenuProvider(@NonNull InterfaceC0895b0 interfaceC0895b0) {
            FragmentActivity.this.addMenuProvider(interfaceC0895b0);
        }

        public void addMenuProvider(@NonNull InterfaceC0895b0 interfaceC0895b0, @NonNull InterfaceC1483m interfaceC1483m) {
            FragmentActivity.this.addMenuProvider(interfaceC0895b0, interfaceC1483m);
        }

        public void addMenuProvider(@NonNull InterfaceC0895b0 interfaceC0895b0, @NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC1464h.EnumC1468b enumC1468b) {
            FragmentActivity.this.addMenuProvider(interfaceC0895b0, interfaceC1483m, enumC1468b);
        }

        @Override // androidx.core.content.InterfaceC0664g
        public void addOnConfigurationChangedListener(@NonNull InterfaceC0797a<Configuration> interfaceC0797a) {
            FragmentActivity.this.addOnConfigurationChangedListener(interfaceC0797a);
        }

        @Override // androidx.core.app.InterfaceC0607b0
        public void addOnMultiWindowModeChangedListener(@NonNull InterfaceC0797a<C0632m> interfaceC0797a) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(interfaceC0797a);
        }

        @Override // androidx.core.app.InterfaceC0609c0
        public void addOnPictureInPictureModeChangedListener(@NonNull InterfaceC0797a<C0628k0> interfaceC0797a) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(interfaceC0797a);
        }

        @Override // androidx.core.content.InterfaceC0665h
        public void addOnTrimMemoryListener(@NonNull InterfaceC0797a<Integer> interfaceC0797a) {
            FragmentActivity.this.addOnTrimMemoryListener(interfaceC0797a);
        }

        @Override // androidx.activity.result.InterfaceC0069h
        @NonNull
        public AbstractC0066g getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC1483m
        @NonNull
        public AbstractC1464h getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.InterfaceC0052n
        @NonNull
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.savedstate.InterfaceC1693d
        @NonNull
        public C1689b getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC1480k0
        @NonNull
        public C1478j0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        public void invalidateMenu() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public void onAttachFragment(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onDump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        @Nullable
        public View onFindViewById(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.fragment.app.FragmentHostCallback
        public FragmentActivity onGetHost() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        @NonNull
        public LayoutInflater onGetLayoutInflater() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public int onGetWindowAnimations() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public boolean onHasView() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onHasWindowAnimations() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldSaveFragmentState(@NonNull Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldShowRequestPermissionRationale(@NonNull String str) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            int i = C0601b.f2263b;
            if (!BuildCompat.m11866c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return false;
            }
            return C0601b.C0604c.m12091c(fragmentActivity, str);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onSupportInvalidateOptionsMenu() {
            invalidateMenu();
        }

        @Override // androidx.core.view.InterfaceC0968m
        public void removeMenuProvider(@NonNull InterfaceC0895b0 interfaceC0895b0) {
            FragmentActivity.this.removeMenuProvider(interfaceC0895b0);
        }

        @Override // androidx.core.content.InterfaceC0664g
        public void removeOnConfigurationChangedListener(@NonNull InterfaceC0797a<Configuration> interfaceC0797a) {
            FragmentActivity.this.removeOnConfigurationChangedListener(interfaceC0797a);
        }

        @Override // androidx.core.app.InterfaceC0607b0
        public void removeOnMultiWindowModeChangedListener(@NonNull InterfaceC0797a<C0632m> interfaceC0797a) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(interfaceC0797a);
        }

        @Override // androidx.core.app.InterfaceC0609c0
        public void removeOnPictureInPictureModeChangedListener(@NonNull InterfaceC0797a<C0628k0> interfaceC0797a) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(interfaceC0797a);
        }

        @Override // androidx.core.content.InterfaceC0665h
        public void removeOnTrimMemoryListener(@NonNull InterfaceC0797a<Integer> interfaceC0797a) {
            FragmentActivity.this.removeOnTrimMemoryListener(interfaceC0797a);
        }
    }

    public FragmentActivity() {
        this.mFragments = FragmentController.createController(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new C1484n(this);
        this.mStopped = true;
        init();
    }

    @ContentView
    public FragmentActivity(@LayoutRes int i) {
        super(i);
        this.mFragments = FragmentController.createController(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new C1484n(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m10052c(LIFECYCLE_TAG, new C1689b.InterfaceC1691b() { // from class: androidx.fragment.app.j
            @Override // androidx.savedstate.C1689b.InterfaceC1691b
            /* renamed from: a */
            public final Bundle mo10049a() {
                Bundle lambda$init$0;
                lambda$init$0 = FragmentActivity.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnConfigurationChangedListener(new InterfaceC0797a() { // from class: androidx.fragment.app.k
            @Override // androidx.core.util.InterfaceC0797a
            public final void accept(Object obj) {
                FragmentActivity.this.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new InterfaceC0797a() { // from class: androidx.fragment.app.l
            @Override // androidx.core.util.InterfaceC0797a
            public final void accept(Object obj) {
                FragmentActivity.this.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new InterfaceC0041b() { // from class: androidx.fragment.app.m
            @Override // androidx.activity.contextaware.InterfaceC0041b
            /* renamed from: a */
            public final void mo10585a(Context context) {
                FragmentActivity.this.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.noteStateNotSaved();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.noteStateNotSaved();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.attachHost(null);
    }

    private static boolean markState(FragmentManager fragmentManager, AbstractC1464h.EnumC1468b enumC1468b) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), enumC1468b);
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.mViewLifecycleOwner;
                AbstractC1464h.EnumC1468b enumC1468b2 = AbstractC1464h.EnumC1468b.STARTED;
                if (fragmentViewLifecycleOwner != null && fragmentViewLifecycleOwner.getLifecycle().mo10538b().m10546a(enumC1468b2)) {
                    fragment.mViewLifecycleOwner.setCurrentState(enumC1468b);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.f3453c.m10546a(enumC1468b2)) {
                    fragment.mLifecycleRegistry.m10532h(enumC1468b);
                    z = true;
                }
            }
        }
        return z;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AbstractC1515a.m10515a(this).m10514b(str2, printWriter);
            }
            this.mFragments.getSupportFragmentManager().dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    @NonNull
    @Deprecated
    public AbstractC1515a getSupportLoaderManager() {
        return AbstractC1515a.m10515a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), AbstractC1464h.EnumC1468b.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.noteStateNotSaved();
        super.onActivityResult(i, i2, intent);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0629l, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_CREATE);
        this.mFragments.dispatchCreate();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.dispatchDestroy();
        this.mFragmentLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.dispatchContextItemSelected(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.dispatchPause();
        this.mFragmentLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.noteStateNotSaved();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.noteStateNotSaved();
        super.onResume();
        this.mResumed = true;
        this.mFragments.execPendingActions();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_RESUME);
        this.mFragments.dispatchResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.noteStateNotSaved();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.dispatchActivityCreated();
        }
        this.mFragments.execPendingActions();
        this.mFragmentLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_START);
        this.mFragments.dispatchStart();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.dispatchStop();
        this.mFragmentLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable AbstractC0631l0 abstractC0631l0) {
        C0601b.SharedElementCallbackC0606e sharedElementCallbackC0606e;
        int i = C0601b.f2263b;
        if (abstractC0631l0 != null) {
            sharedElementCallbackC0606e = new C0601b.SharedElementCallbackC0606e(abstractC0631l0);
        } else {
            sharedElementCallbackC0606e = null;
        }
        C0601b.C0603b.m12096c(this, sharedElementCallbackC0606e);
    }

    public void setExitSharedElementCallback(@Nullable AbstractC0631l0 abstractC0631l0) {
        C0601b.SharedElementCallbackC0606e sharedElementCallbackC0606e;
        int i = C0601b.f2263b;
        if (abstractC0631l0 != null) {
            sharedElementCallbackC0606e = new C0601b.SharedElementCallbackC0606e(abstractC0631l0);
        } else {
            sharedElementCallbackC0606e = null;
        }
        C0601b.C0603b.m12095d(this, sharedElementCallbackC0606e);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            int i2 = C0601b.f2263b;
            C0601b.C0602a.m12100b(this, intent, -1, bundle);
            return;
        }
        fragment.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            int i5 = C0601b.f2263b;
            C0601b.C0602a.m12099c(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void supportFinishAfterTransition() {
        int i = C0601b.f2263b;
        C0601b.C0603b.m12098a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i = C0601b.f2263b;
        C0601b.C0603b.m12097b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i = C0601b.f2263b;
        C0601b.C0603b.m12094e(this);
    }

    @Override // androidx.core.app.C0601b.InterfaceC0605d
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
