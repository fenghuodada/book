package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.contextaware.C0040a;
import androidx.activity.contextaware.InterfaceC0041b;
import androidx.activity.result.AbstractC0057c;
import androidx.activity.result.AbstractC0066g;
import androidx.activity.result.C0070i;
import androidx.activity.result.InterfaceC0056b;
import androidx.activity.result.InterfaceC0069h;
import androidx.activity.result.contract.AbstractC0058a;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityC0629l;
import androidx.core.app.C0601b;
import androidx.core.app.C0628k0;
import androidx.core.app.C0632m;
import androidx.core.app.InterfaceC0607b0;
import androidx.core.app.InterfaceC0609c0;
import androidx.core.content.InterfaceC0664g;
import androidx.core.content.InterfaceC0665h;
import androidx.core.p003os.BuildCompat;
import androidx.core.util.InterfaceC0797a;
import androidx.core.view.C0983p;
import androidx.core.view.InterfaceC0895b0;
import androidx.core.view.InterfaceC0968m;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1453c0;
import androidx.lifecycle.C1463g0;
import androidx.lifecycle.C1469h0;
import androidx.lifecycle.C1478j0;
import androidx.lifecycle.C1482l0;
import androidx.lifecycle.C1484n;
import androidx.lifecycle.C1510z;
import androidx.lifecycle.FragmentC1502w;
import androidx.lifecycle.InterfaceC1459f;
import androidx.lifecycle.InterfaceC1479k;
import androidx.lifecycle.InterfaceC1480k0;
import androidx.lifecycle.InterfaceC1483m;
import androidx.lifecycle.viewmodel.AbstractC1497a;
import androidx.lifecycle.viewmodel.C1500c;
import androidx.savedstate.C1689b;
import androidx.savedstate.C1692c;
import androidx.savedstate.C1694e;
import androidx.savedstate.InterfaceC1693d;
import androidx.tracing.C1719b;
import com.ambrose.overwall.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10843j;

/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC0629l implements InterfaceC1480k0, InterfaceC1459f, InterfaceC1693d, InterfaceC0052n, InterfaceC0069h, InterfaceC0664g, InterfaceC0665h, InterfaceC0607b0, InterfaceC0609c0, InterfaceC0968m {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final AbstractC0066g mActivityResultRegistry;
    @LayoutRes
    private int mContentLayoutId;
    final C0040a mContextAwareHelper;
    private C1469h0.InterfaceC1471b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    @NonNull
    final C0049k mFullyDrawnReporter;
    private final C1484n mLifecycleRegistry;
    private final C0983p mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC0797a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0797a<C0632m>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0797a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC0797a<C0628k0>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0797a<Integer>> mOnTrimMemoryListeners;
    final InterfaceExecutorC0031e mReportFullyDrawnExecutor;
    final C1692c mSavedStateRegistryController;
    private C1478j0 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes.dex */
    public class RunnableC0027a implements Runnable {
        public RunnableC0027a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes.dex */
    public class C0028b extends AbstractC0066g {
        public C0028b() {
        }

        @Override // androidx.activity.result.AbstractC0066g
        /* renamed from: b */
        public final void mo13050b(int i, @NonNull AbstractC0058a abstractC0058a, Object obj) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC0058a.C0059a synchronousResult = abstractC0058a.getSynchronousResult(componentActivity, obj);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0044f(this, i, synchronousResult));
                return;
            }
            Intent createIntent = abstractC0058a.createIntent(componentActivity, obj);
            if (createIntent.getExtras() != null && createIntent.getExtras().getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(createIntent.getAction())) {
                String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C0601b.m12102c(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(createIntent.getAction())) {
                C0070i c0070i = (C0070i) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = c0070i.f127a;
                    Intent intent = c0070i.f128b;
                    int i2 = c0070i.f129c;
                    int i3 = c0070i.f130d;
                    int i4 = C0601b.f2263b;
                    C0601b.C0602a.m12099c(componentActivity, intentSender, i, intent, i2, i3, 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0045g(this, i, e));
                }
            } else {
                int i5 = C0601b.f2263b;
                C0601b.C0602a.m12100b(componentActivity, createIntent, i, bundle);
            }
        }
    }

    @RequiresApi(33)
    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: classes.dex */
    public static class C0029c {
        @DoNotInline
        /* renamed from: a */
        public static OnBackInvokedDispatcher m13066a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: classes.dex */
    public static final class C0030d {

        /* renamed from: a */
        public Object f50a;

        /* renamed from: b */
        public C1478j0 f51b;
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    /* loaded from: classes.dex */
    public interface InterfaceExecutorC0031e extends Executor {
        /* renamed from: g */
        void mo13064g(@NonNull View view);
    }

    @RequiresApi(16)
    /* renamed from: androidx.activity.ComponentActivity$f */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnDrawListenerC0032f implements InterfaceExecutorC0031e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b */
        public Runnable f53b;

        /* renamed from: a */
        public final long f52a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: c */
        public boolean f54c = false;

        public ViewTreeObserver$OnDrawListenerC0032f() {
        }

        /* renamed from: b */
        public final void m13065b() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f53b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f54c) {
                decorView.postOnAnimation(new RunnableC0046h(this, 0));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC0031e
        /* renamed from: g */
        public final void mo13064g(@NonNull View view) {
            if (this.f54c) {
                return;
            }
            this.f54c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            Runnable runnable = this.f53b;
            if (runnable != null) {
                runnable.run();
                this.f53b = null;
                C0049k c0049k = ComponentActivity.this.mFullyDrawnReporter;
                synchronized (c0049k.f98c) {
                    z = c0049k.f99d;
                }
                if (!z) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f52a) {
                return;
            }
            this.f54c = false;
            ComponentActivity.this.getWindow().getDecorView().post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.activity.c] */
    public ComponentActivity() {
        this.mContextAwareHelper = new C0040a();
        this.mMenuHostHelper = new C0983p(new RunnableC0038b(this, 0));
        this.mLifecycleRegistry = new C1484n(this);
        C1692c c1692c = new C1692c(this);
        this.mSavedStateRegistryController = c1692c;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC0027a());
        InterfaceExecutorC0031e createFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = createFullyDrawnExecutor;
        this.mFullyDrawnReporter = new C0049k(createFullyDrawnExecutor, new InterfaceC10809a() { // from class: androidx.activity.c
            @Override // kotlin.jvm.functions.InterfaceC10809a
            public final Object invoke() {
                C10868p lambda$new$0;
                lambda$new$0 = ComponentActivity.this.lambda$new$0();
                return lambda$new$0;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0028b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().mo10539a(new InterfaceC1479k() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.InterfaceC1479k
                public final void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
                    View view;
                    if (enumC1465a == AbstractC1464h.EnumC1465a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().mo10539a(new InterfaceC1479k() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.InterfaceC1479k
                public final void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
                    if (enumC1465a == AbstractC1464h.EnumC1465a.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.f80b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().m10541a();
                        }
                        ((ViewTreeObserver$OnDrawListenerC0032f) ComponentActivity.this.mReportFullyDrawnExecutor).m13065b();
                    }
                }
            });
            getLifecycle().mo10539a(new InterfaceC1479k() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.InterfaceC1479k
                public final void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
                    ComponentActivity componentActivity = ComponentActivity.this;
                    componentActivity.ensureViewModelStore();
                    componentActivity.getLifecycle().mo10537c(this);
                }
            });
            c1692c.m10048a();
            C1510z.m10517b(this);
            if (i <= 23) {
                getLifecycle().mo10539a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().m10052c(ACTIVITY_RESULT_TAG, new C1689b.InterfaceC1691b() { // from class: androidx.activity.d
                @Override // androidx.savedstate.C1689b.InterfaceC1691b
                /* renamed from: a */
                public final Bundle mo10049a() {
                    Bundle lambda$new$1;
                    lambda$new$1 = ComponentActivity.this.lambda$new$1();
                    return lambda$new$1;
                }
            });
            addOnContextAvailableListener(new InterfaceC0041b() { // from class: androidx.activity.e
                @Override // androidx.activity.contextaware.InterfaceC0041b
                /* renamed from: a */
                public final void mo10585a(Context context) {
                    ComponentActivity.this.lambda$new$2(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i) {
        this();
        this.mContentLayoutId = i;
    }

    private InterfaceExecutorC0031e createFullyDrawnExecutor() {
        return new ViewTreeObserver$OnDrawListenerC0032f();
    }

    private void initViewTreeOwners() {
        C1482l0.m10540a(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C10843j.m430f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        C1694e.m10045a(getWindow().getDecorView(), this);
        C0053o.m13054a(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        C10843j.m430f(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C10868p lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        AbstractC0066g abstractC0066g = this.mActivityResultRegistry;
        abstractC0066g.getClass();
        HashMap hashMap = abstractC0066g.f117c;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0066g.f119e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC0066g.f122h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", abstractC0066g.f115a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$2(Context context) {
        Bundle m10054a = getSavedStateRegistry().m10054a(ACTIVITY_RESULT_TAG);
        if (m10054a != null) {
            AbstractC0066g abstractC0066g = this.mActivityResultRegistry;
            abstractC0066g.getClass();
            ArrayList<Integer> integerArrayList = m10054a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = m10054a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                abstractC0066g.f119e = m10054a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                abstractC0066g.f115a = (Random) m10054a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = m10054a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = abstractC0066g.f122h;
                bundle2.putAll(bundle);
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    HashMap hashMap = abstractC0066g.f117c;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = abstractC0066g.f116b;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo13064g(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.InterfaceC0968m
    public void addMenuProvider(@NonNull InterfaceC0895b0 interfaceC0895b0) {
        C0983p c0983p = this.mMenuHostHelper;
        c0983p.f2663b.add(interfaceC0895b0);
        c0983p.f2662a.run();
    }

    @Override // androidx.core.content.InterfaceC0664g
    public final void addOnConfigurationChangedListener(@NonNull InterfaceC0797a<Configuration> interfaceC0797a) {
        this.mOnConfigurationChangedListeners.add(interfaceC0797a);
    }

    public final void addOnContextAvailableListener(@NonNull InterfaceC0041b listener) {
        C0040a c0040a = this.mContextAwareHelper;
        c0040a.getClass();
        C10843j.m430f(listener, "listener");
        Context context = c0040a.f80b;
        if (context != null) {
            listener.mo10585a(context);
        }
        c0040a.f79a.add(listener);
    }

    @Override // androidx.core.app.InterfaceC0607b0
    public final void addOnMultiWindowModeChangedListener(@NonNull InterfaceC0797a<C0632m> interfaceC0797a) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC0797a);
    }

    public final void addOnNewIntentListener(@NonNull InterfaceC0797a<Intent> interfaceC0797a) {
        this.mOnNewIntentListeners.add(interfaceC0797a);
    }

    @Override // androidx.core.app.InterfaceC0609c0
    public final void addOnPictureInPictureModeChangedListener(@NonNull InterfaceC0797a<C0628k0> interfaceC0797a) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC0797a);
    }

    @Override // androidx.core.content.InterfaceC0665h
    public final void addOnTrimMemoryListener(@NonNull InterfaceC0797a<Integer> interfaceC0797a) {
        this.mOnTrimMemoryListeners.add(interfaceC0797a);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0030d c0030d = (C0030d) getLastNonConfigurationInstance();
            if (c0030d != null) {
                this.mViewModelStore = c0030d.f51b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C1478j0();
            }
        }
    }

    @Override // androidx.activity.result.InterfaceC0069h
    @NonNull
    public final AbstractC0066g getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1459f
    @NonNull
    @CallSuper
    public AbstractC1497a getDefaultViewModelCreationExtras() {
        C1500c c1500c = new C1500c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c1500c.f3474a;
        if (application != null) {
            linkedHashMap.put(C1463g0.f3434a, getApplication());
        }
        linkedHashMap.put(C1510z.f3488a, this);
        linkedHashMap.put(C1510z.f3489b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(C1510z.f3490c, getIntent().getExtras());
        }
        return c1500c;
    }

    @Override // androidx.lifecycle.InterfaceC1459f
    @NonNull
    public C1469h0.InterfaceC1471b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C1453c0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @NonNull
    public C0049k getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0030d c0030d = (C0030d) getLastNonConfigurationInstance();
        if (c0030d != null) {
            return c0030d.f50a;
        }
        return null;
    }

    @Override // androidx.core.app.ActivityC0629l, androidx.lifecycle.InterfaceC1483m
    @NonNull
    public AbstractC1464h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.InterfaceC0052n
    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.InterfaceC1693d
    @NonNull
    public final C1689b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f4131b;
    }

    @Override // androidx.lifecycle.InterfaceC1480k0
    @NonNull
    public C1478j0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (this.mActivityResultRegistry.m13051a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @MainThread
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m13062b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC0797a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ActivityC0629l, android.app.Activity
    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.m10047b(bundle);
        C0040a c0040a = this.mContextAwareHelper;
        c0040a.getClass();
        c0040a.f80b = this;
        Iterator it = c0040a.f79a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0041b) it.next()).mo10585a(this);
        }
        super.onCreate(bundle);
        int i = FragmentC1502w.f3479b;
        FragmentC1502w.C1504b.m10521b(this);
        if (BuildCompat.m11866c()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.mOnBackPressedDispatcher;
            OnBackInvokedDispatcher invoker = C0029c.m13066a(this);
            onBackPressedDispatcher.getClass();
            C10843j.m430f(invoker, "invoker");
            onBackPressedDispatcher.f65e = invoker;
            onBackPressedDispatcher.m13061c();
        }
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            C0983p c0983p = this.mMenuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator<InterfaceC0895b0> it = c0983p.f2663b.iterator();
            while (it.hasNext()) {
                it.next().onCreateMenu(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator<InterfaceC0895b0> it = this.mMenuHostHelper.f2663b.iterator();
        while (it.hasNext()) {
            if (it.next().onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC0797a<C0632m>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0632m(z));
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z, @NonNull Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC0797a<C0632m>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0632m(z, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC0797a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        Iterator<InterfaceC0895b0> it = this.mMenuHostHelper.f2663b.iterator();
        while (it.hasNext()) {
            it.next().onMenuClosed(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC0797a<C0628k0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0628k0(z));
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z, @NonNull Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC0797a<C0628k0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0628k0(z, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator<InterfaceC0895b0> it = this.mMenuHostHelper.f2663b.iterator();
            while (it.hasNext()) {
                it.next().onPrepareMenu(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.mActivityResultRegistry.m13051a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Nullable
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        C0030d c0030d;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C1478j0 c1478j0 = this.mViewModelStore;
        if (c1478j0 == null && (c0030d = (C0030d) getLastNonConfigurationInstance()) != null) {
            c1478j0 = c0030d.f51b;
        }
        if (c1478j0 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0030d c0030d2 = new C0030d();
        c0030d2.f50a = onRetainCustomNonConfigurationInstance;
        c0030d2.f51b = c1478j0;
        return c0030d2;
    }

    @Override // androidx.core.app.ActivityC0629l, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        AbstractC1464h lifecycle = getLifecycle();
        if (lifecycle instanceof C1484n) {
            ((C1484n) lifecycle).m10532h(AbstractC1464h.EnumC1468b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m10046c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC0797a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f80b;
    }

    @NonNull
    public final <I, O> AbstractC0057c<I> registerForActivityResult(@NonNull AbstractC0058a<I, O> abstractC0058a, @NonNull InterfaceC0056b<O> interfaceC0056b) {
        return registerForActivityResult(abstractC0058a, this.mActivityResultRegistry, interfaceC0056b);
    }

    @NonNull
    public final <I, O> AbstractC0057c<I> registerForActivityResult(@NonNull AbstractC0058a<I, O> abstractC0058a, @NonNull AbstractC0066g abstractC0066g, @NonNull InterfaceC0056b<O> interfaceC0056b) {
        return abstractC0066g.m13049c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC0058a, interfaceC0056b);
    }

    @Override // androidx.core.view.InterfaceC0968m
    public void removeMenuProvider(@NonNull InterfaceC0895b0 interfaceC0895b0) {
        this.mMenuHostHelper.m11398a(interfaceC0895b0);
    }

    @Override // androidx.core.content.InterfaceC0664g
    public final void removeOnConfigurationChangedListener(@NonNull InterfaceC0797a<Configuration> interfaceC0797a) {
        this.mOnConfigurationChangedListeners.remove(interfaceC0797a);
    }

    public final void removeOnContextAvailableListener(@NonNull InterfaceC0041b listener) {
        C0040a c0040a = this.mContextAwareHelper;
        c0040a.getClass();
        C10843j.m430f(listener, "listener");
        c0040a.f79a.remove(listener);
    }

    @Override // androidx.core.app.InterfaceC0607b0
    public final void removeOnMultiWindowModeChangedListener(@NonNull InterfaceC0797a<C0632m> interfaceC0797a) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC0797a);
    }

    public final void removeOnNewIntentListener(@NonNull InterfaceC0797a<Intent> interfaceC0797a) {
        this.mOnNewIntentListeners.remove(interfaceC0797a);
    }

    @Override // androidx.core.app.InterfaceC0609c0
    public final void removeOnPictureInPictureModeChangedListener(@NonNull InterfaceC0797a<C0628k0> interfaceC0797a) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC0797a);
    }

    @Override // androidx.core.content.InterfaceC0665h
    public final void removeOnTrimMemoryListener(@NonNull InterfaceC0797a<Integer> interfaceC0797a) {
        this.mOnTrimMemoryListeners.remove(interfaceC0797a);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C1719b.m10011a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.m13055a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo13064g(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo13064g(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo13064g(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void addMenuProvider(@NonNull final InterfaceC0895b0 interfaceC0895b0, @NonNull InterfaceC1483m interfaceC1483m) {
        final C0983p c0983p = this.mMenuHostHelper;
        c0983p.f2663b.add(interfaceC0895b0);
        c0983p.f2662a.run();
        AbstractC1464h lifecycle = interfaceC1483m.getLifecycle();
        HashMap hashMap = c0983p.f2664c;
        C0983p.C0984a c0984a = (C0983p.C0984a) hashMap.remove(interfaceC0895b0);
        if (c0984a != null) {
            c0984a.f2665a.mo10537c(c0984a.f2666b);
            c0984a.f2666b = null;
        }
        hashMap.put(interfaceC0895b0, new C0983p.C0984a(lifecycle, new InterfaceC1479k() { // from class: androidx.core.view.n
            @Override // androidx.lifecycle.InterfaceC1479k
            public final void onStateChanged(InterfaceC1483m interfaceC1483m2, AbstractC1464h.EnumC1465a enumC1465a) {
                AbstractC1464h.EnumC1465a enumC1465a2 = AbstractC1464h.EnumC1465a.ON_DESTROY;
                C0983p c0983p2 = C0983p.this;
                if (enumC1465a == enumC1465a2) {
                    c0983p2.m11398a(interfaceC0895b0);
                } else {
                    c0983p2.getClass();
                }
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull final InterfaceC0895b0 interfaceC0895b0, @NonNull InterfaceC1483m interfaceC1483m, @NonNull final AbstractC1464h.EnumC1468b enumC1468b) {
        final C0983p c0983p = this.mMenuHostHelper;
        c0983p.getClass();
        AbstractC1464h lifecycle = interfaceC1483m.getLifecycle();
        HashMap hashMap = c0983p.f2664c;
        C0983p.C0984a c0984a = (C0983p.C0984a) hashMap.remove(interfaceC0895b0);
        if (c0984a != null) {
            c0984a.f2665a.mo10537c(c0984a.f2666b);
            c0984a.f2666b = null;
        }
        hashMap.put(interfaceC0895b0, new C0983p.C0984a(lifecycle, new InterfaceC1479k() { // from class: androidx.core.view.o
            @Override // androidx.lifecycle.InterfaceC1479k
            public final void onStateChanged(InterfaceC1483m interfaceC1483m2, AbstractC1464h.EnumC1465a enumC1465a) {
                AbstractC1464h.EnumC1465a enumC1465a2;
                C0983p c0983p2 = C0983p.this;
                c0983p2.getClass();
                AbstractC1464h.EnumC1465a.Companion.getClass();
                AbstractC1464h.EnumC1468b state = enumC1468b;
                C10843j.m430f(state, "state");
                int ordinal = state.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            enumC1465a2 = null;
                        } else {
                            enumC1465a2 = AbstractC1464h.EnumC1465a.ON_RESUME;
                        }
                    } else {
                        enumC1465a2 = AbstractC1464h.EnumC1465a.ON_START;
                    }
                } else {
                    enumC1465a2 = AbstractC1464h.EnumC1465a.ON_CREATE;
                }
                Runnable runnable = c0983p2.f2662a;
                CopyOnWriteArrayList<InterfaceC0895b0> copyOnWriteArrayList = c0983p2.f2663b;
                InterfaceC0895b0 interfaceC0895b02 = interfaceC0895b0;
                if (enumC1465a == enumC1465a2) {
                    copyOnWriteArrayList.add(interfaceC0895b02);
                    runnable.run();
                } else if (enumC1465a == AbstractC1464h.EnumC1465a.ON_DESTROY) {
                    c0983p2.m11398a(interfaceC0895b02);
                } else if (enumC1465a == AbstractC1464h.EnumC1465a.C1466a.m10548a(state)) {
                    copyOnWriteArrayList.remove(interfaceC0895b02);
                    runnable.run();
                }
            }
        }));
    }
}
