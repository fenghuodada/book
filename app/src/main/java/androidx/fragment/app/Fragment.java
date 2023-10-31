package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.AbstractC0057c;
import androidx.activity.result.AbstractC0066g;
import androidx.activity.result.C0063d;
import androidx.activity.result.InterfaceC0056b;
import androidx.activity.result.InterfaceC0069h;
import androidx.activity.result.contract.AbstractC0058a;
import androidx.annotation.AnimRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.arch.core.util.InterfaceC0457a;
import androidx.collection.C0483j;
import androidx.core.app.AbstractC0631l0;
import androidx.core.app.C0608c;
import androidx.core.content.C0663f;
import androidx.core.text.C0780c;
import androidx.fragment.app.strictmode.C1416c;
import androidx.fragment.app.strictmode.C1420e;
import androidx.fragment.app.strictmode.C1421f;
import androidx.fragment.app.strictmode.C1422g;
import androidx.fragment.app.strictmode.C1424i;
import androidx.fragment.app.strictmode.C1425j;
import androidx.fragment.app.strictmode.C1426k;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1453c0;
import androidx.lifecycle.C1463g0;
import androidx.lifecycle.C1469h0;
import androidx.lifecycle.C1478j0;
import androidx.lifecycle.C1482l0;
import androidx.lifecycle.C1484n;
import androidx.lifecycle.C1489r;
import androidx.lifecycle.C1510z;
import androidx.lifecycle.InterfaceC1459f;
import androidx.lifecycle.InterfaceC1479k;
import androidx.lifecycle.InterfaceC1480k0;
import androidx.lifecycle.InterfaceC1483m;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.viewmodel.AbstractC1497a;
import androidx.lifecycle.viewmodel.C1500c;
import androidx.loader.app.AbstractC1515a;
import androidx.loader.app.C1516b;
import androidx.savedstate.C1689b;
import androidx.savedstate.C1692c;
import androidx.savedstate.C1694e;
import androidx.savedstate.InterfaceC1693d;
import com.ambrose.overwall.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C10843j;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1483m, InterfaceC1480k0, InterfaceC1459f, InterfaceC1693d {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    AnimationInfo mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    @NonNull
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    @LayoutRes
    private int mContentLayoutId;
    C1469h0.InterfaceC1471b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    FragmentHostCallback<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C1484n mLifecycleRegistry;
    AbstractC1464h.EnumC1468b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<OnPreAttachedListener> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final OnPreAttachedListener mSavedStateAttachListener;
    C1692c mSavedStateRegistryController;
    @Nullable
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    @Nullable
    FragmentViewLifecycleOwner mViewLifecycleOwner;
    C1489r<InterfaceC1483m> mViewLifecycleOwnerLiveData;
    @NonNull
    String mWho;

    /* loaded from: classes.dex */
    public static class AnimationInfo {
        Boolean mAllowEnterTransitionOverlap;
        Boolean mAllowReturnTransitionOverlap;
        View mAnimatingAway;
        @AnimRes
        int mEnterAnim;
        Object mEnterTransition = null;
        AbstractC0631l0 mEnterTransitionCallback;
        boolean mEnterTransitionPostponed;
        @AnimRes
        int mExitAnim;
        Object mExitTransition;
        AbstractC0631l0 mExitTransitionCallback;
        View mFocusedView;
        boolean mIsPop;
        int mNextTransition;
        @AnimRes
        int mPopEnterAnim;
        @AnimRes
        int mPopExitAnim;
        float mPostOnViewCreatedAlpha;
        Object mReenterTransition;
        Object mReturnTransition;
        Object mSharedElementEnterTransition;
        Object mSharedElementReturnTransition;
        ArrayList<String> mSharedElementSourceNames;
        ArrayList<String> mSharedElementTargetNames;

        public AnimationInfo() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.mReturnTransition = obj;
            this.mExitTransition = null;
            this.mReenterTransition = obj;
            this.mSharedElementEnterTransition = null;
            this.mSharedElementReturnTransition = obj;
            this.mEnterTransitionCallback = null;
            this.mExitTransitionCallback = null;
            this.mPostOnViewCreatedAlpha = 1.0f;
            this.mFocusedView = null;
        }
    }

    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class Api19Impl {
        private Api19Impl() {
        }

        public static void cancelPendingInputEvents(@NonNull View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@NonNull String str, @Nullable Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class OnPreAttachedListener {
        private OnPreAttachedListener() {
        }

        public abstract void onPreAttached();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.fragment.app.Fragment.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        final Bundle mState;

        public SavedState(Bundle bundle) {
            this.mState = bundle;
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.mState = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeBundle(this.mState);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() { // from class: androidx.fragment.app.Fragment.1
            @Override // java.lang.Runnable
            public void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = AbstractC1464h.EnumC1468b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C1489r<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new OnPreAttachedListener() { // from class: androidx.fragment.app.Fragment.2
            @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
            public void onPreAttached() {
                Fragment.this.mSavedStateRegistryController.m10048a();
                C1510z.m10517b(Fragment.this);
                Bundle bundle = Fragment.this.mSavedFragmentState;
                Fragment.this.mSavedStateRegistryController.m10047b(bundle != null ? bundle.getBundle("registryState") : null);
            }
        };
        initLifecycle();
    }

    @ContentView
    public Fragment(@LayoutRes int i) {
        this();
        this.mContentLayoutId = i;
    }

    private AnimationInfo ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new AnimationInfo();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        AbstractC1464h.EnumC1468b enumC1468b = this.mMaxState;
        return (enumC1468b == AbstractC1464h.EnumC1468b.INITIALIZED || this.mParentFragment == null) ? enumC1468b.ordinal() : Math.min(enumC1468b.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    @Nullable
    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            C1416c.C1418b c1418b = C1416c.f3347a;
            C1422g c1422g = new C1422g(this);
            C1416c.m10580c(c1422g);
            C1416c.C1418b m10582a = C1416c.m10582a(this);
            if (m10582a.f3359a.contains(C1416c.EnumC1417a.DETECT_TARGET_FRAGMENT_USAGE) && C1416c.m10578e(m10582a, getClass(), C1422g.class)) {
                C1416c.m10581b(m10582a, c1422g);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null && (str = this.mTargetWho) != null) {
            return fragmentManager.findActiveFragment(str);
        }
        return null;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C1484n(this);
        this.mSavedStateRegistryController = new C1692c(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment newInstance = FragmentFactory.loadFragmentClass(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new InstantiationException(C0663f.m12005a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (java.lang.InstantiationException e2) {
            throw new InstantiationException(C0663f.m12005a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException(C0663f.m12005a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException(C0663f.m12005a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performCreateView$0() {
        this.mViewLifecycleOwner.performRestore(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @NonNull
    private <I, O> AbstractC0057c<I> prepareCallInternal(@NonNull final AbstractC0058a<I, O> abstractC0058a, @NonNull final InterfaceC0457a<Void, AbstractC0066g> interfaceC0457a, @NonNull final InterfaceC0056b<O> interfaceC0056b) {
        if (this.mState <= 1) {
            final AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new OnPreAttachedListener() { // from class: androidx.fragment.app.Fragment.9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
                public void onPreAttached() {
                    atomicReference.set(((AbstractC0066g) interfaceC0457a.apply(null)).m13049c(Fragment.this.generateActivityResultKey(), Fragment.this, abstractC0058a, interfaceC0056b));
                }
            });
            return new AbstractC0057c<I>() { // from class: androidx.fragment.app.Fragment.10
                @Override // androidx.activity.result.AbstractC0057c
                @NonNull
                public AbstractC0058a<I, ?> getContract() {
                    return abstractC0058a;
                }

                @Override // androidx.activity.result.AbstractC0057c
                public void launch(I i, @Nullable C0608c c0608c) {
                    AbstractC0057c abstractC0057c = (AbstractC0057c) atomicReference.get();
                    if (abstractC0057c == null) {
                        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                    }
                    abstractC0057c.launch(i, c0608c);
                }

                @Override // androidx.activity.result.AbstractC0057c
                public void unregister() {
                    AbstractC0057c abstractC0057c = (AbstractC0057c) atomicReference.getAndSet(null);
                    if (abstractC0057c != null) {
                        abstractC0057c.unregister();
                    }
                }
            };
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(@NonNull OnPreAttachedListener onPreAttachedListener) {
        if (this.mState >= 0) {
            onPreAttachedListener.onPreAttached();
        } else {
            this.mOnPreAttachedListeners.add(onPreAttachedListener);
        }
    }

    private void restoreViewState() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo != null) {
            animationInfo.mEnterTransitionPostponed = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        final SpecialEffectsController orCreateController = SpecialEffectsController.getOrCreateController(viewGroup, fragmentManager);
        orCreateController.markPostponedState();
        if (z) {
            this.mHost.getHandler().post(new Runnable() { // from class: androidx.fragment.app.Fragment.4
                @Override // java.lang.Runnable
                public void run() {
                    orCreateController.executePendingOperations();
                }
            });
        } else {
            orCreateController.executePendingOperations();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public FragmentContainer createFragmentContainer() {
        return new FragmentContainer() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.fragment.app.FragmentContainer
            @Nullable
            public View onFindViewById(int i) {
                View view = Fragment.this.mView;
                if (view != null) {
                    return view.findViewById(i);
                }
                throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
            }

            @Override // androidx.fragment.app.FragmentContainer
            public boolean onHasView() {
                return Fragment.this.mView != null;
            }
        };
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC1515a.m10515a(this).m10514b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.dump(C0063d.m13053a(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.findFragmentByWho(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @Nullable
    public final FragmentActivity getActivity() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return (FragmentActivity) fragmentHostCallback.getActivity();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || (bool = animationInfo.mAllowEnterTransitionOverlap) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || (bool = animationInfo.mAllowReturnTransitionOverlap) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mAnimatingAway;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " has not been attached yet."));
    }

    @Nullable
    public Context getContext() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.getContext();
    }

    @Override // androidx.lifecycle.InterfaceC1459f
    @NonNull
    @CallSuper
    public AbstractC1497a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
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
        if (application == null && FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C1500c c1500c = new C1500c();
        LinkedHashMap linkedHashMap = c1500c.f3474a;
        if (application != null) {
            linkedHashMap.put(C1463g0.f3434a, application);
        }
        linkedHashMap.put(C1510z.f3488a, this);
        linkedHashMap.put(C1510z.f3489b, this);
        if (getArguments() != null) {
            linkedHashMap.put(C1510z.f3490c, getArguments());
        }
        return c1500c;
    }

    @Override // androidx.lifecycle.InterfaceC1459f
    @NonNull
    public C1469h0.InterfaceC1471b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
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
                if (application == null && FragmentManager.isLoggingEnabled(3)) {
                    Log.d(FragmentManager.TAG, "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new C1453c0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @AnimRes
    public int getEnterAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mEnterAnim;
    }

    @Nullable
    public Object getEnterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mEnterTransition;
    }

    public AbstractC0631l0 getEnterTransitionCallback() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mEnterTransitionCallback;
    }

    @AnimRes
    public int getExitAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mExitAnim;
    }

    @Nullable
    public Object getExitTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mExitTransition;
    }

    public AbstractC0631l0 getExitTransitionCallback() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mExitTransitionCallback;
    }

    public View getFocusedView() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mFocusedView;
    }

    @Nullable
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.onGetHost();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            LayoutInflater onGetLayoutInflater = fragmentHostCallback.onGetLayoutInflater();
            onGetLayoutInflater.setFactory2(this.mChildFragmentManager.getLayoutInflaterFactory());
            return onGetLayoutInflater;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Override // androidx.lifecycle.InterfaceC1483m
    @NonNull
    public AbstractC1464h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public AbstractC1515a getLoaderManager() {
        return AbstractC1515a.m10515a(this);
    }

    public int getNextTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mNextTransition;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.mIsPop;
    }

    @AnimRes
    public int getPopEnterAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mPopEnterAnim;
    }

    @AnimRes
    public int getPopExitAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mPopExitAnim;
    }

    public float getPostOnViewCreatedAlpha() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 1.0f;
        }
        return animationInfo.mPostOnViewCreatedAlpha;
    }

    @Nullable
    public Object getReenterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.mReenterTransition;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C1416c.C1418b c1418b = C1416c.f3347a;
        C1420e c1420e = new C1420e(this);
        C1416c.m10580c(c1420e);
        C1416c.C1418b m10582a = C1416c.m10582a(this);
        if (m10582a.f3359a.contains(C1416c.EnumC1417a.DETECT_RETAIN_INSTANCE_USAGE) && C1416c.m10578e(m10582a, getClass(), C1420e.class)) {
            C1416c.m10581b(m10582a, c1420e);
        }
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.mReturnTransition;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.InterfaceC1693d
    @NonNull
    public final C1689b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f4131b;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mSharedElementEnterTransition;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.mSharedElementReturnTransition;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        AnimationInfo animationInfo = this.mAnimationInfo;
        return (animationInfo == null || (arrayList = animationInfo.mSharedElementSourceNames) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        AnimationInfo animationInfo = this.mAnimationInfo;
        return (animationInfo == null || (arrayList = animationInfo.mSharedElementTargetNames) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(@StringRes int i) {
        return getResources().getString(i);
    }

    @NonNull
    public final String getString(@StringRes int i, @Nullable Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C1416c.C1418b c1418b = C1416c.f3347a;
        C1421f c1421f = new C1421f(this);
        C1416c.m10580c(c1421f);
        C1416c.C1418b m10582a = C1416c.m10582a(this);
        if (m10582a.f3359a.contains(C1416c.EnumC1417a.DETECT_TARGET_FRAGMENT_USAGE) && C1416c.m10578e(m10582a, getClass(), C1421f.class)) {
            C1416c.m10581b(m10582a, c1421f);
        }
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@StringRes int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    @MainThread
    public InterfaceC1483m getViewLifecycleOwner() {
        FragmentViewLifecycleOwner fragmentViewLifecycleOwner = this.mViewLifecycleOwner;
        if (fragmentViewLifecycleOwner != null) {
            return fragmentViewLifecycleOwner;
        }
        throw new IllegalStateException(C0780c.m11813a("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @NonNull
    public LiveData<InterfaceC1483m> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC1480k0
    @NonNull
    public C1478j0 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != 1) {
                return this.mFragmentManager.getViewModelStore(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.isParentHidden(this.mParentFragment));
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.isParentMenuVisible(this.mParentFragment));
    }

    public boolean isPostponed() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.mEnterTransitionPostponed;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.isStateSaved();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        Activity activity = fragmentHostCallback == null ? null : fragmentHostCallback.getActivity();
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    @MainThread
    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @CallSuper
    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.isStateAtLeast(1)) {
            return;
        }
        this.mChildFragmentManager.dispatchCreate();
    }

    @Nullable
    @MainThread
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @Nullable
    @MainThread
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @MainThread
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @Nullable ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @MainThread
    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @Nullable
    @MainThread
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @CallSuper
    @MainThread
    public void onDestroy() {
        this.mCalled = true;
    }

    @MainThread
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @CallSuper
    @MainThread
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @MainThread
    public void onHiddenChanged(boolean z) {
    }

    @CallSuper
    @UiThread
    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @CallSuper
    @UiThread
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        Activity activity = fragmentHostCallback == null ? null : fragmentHostCallback.getActivity();
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    @MainThread
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @MainThread
    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @MainThread
    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    @CallSuper
    @MainThread
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @MainThread
    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    @MainThread
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @CallSuper
    @MainThread
    public void onResume() {
        this.mCalled = true;
    }

    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @CallSuper
    @MainThread
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onStop() {
        this.mCalled = true;
    }

    @MainThread
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    @CallSuper
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.dispatchActivityCreated();
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<OnPreAttachedListener> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreAttached();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.attachController(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.getContext());
        if (this.mCalled) {
            this.mFragmentManager.dispatchOnAttachFragment(this);
            this.mChildFragmentManager.dispatchAttach();
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.dispatchContextItemSelected(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo10539a(new InterfaceC1479k() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.InterfaceC1479k
            public void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
                View view;
                if (enumC1465a != AbstractC1464h.EnumC1465a.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                Api19Impl.cancelPendingInputEvents(view);
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new FragmentViewLifecycleOwner(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.i
            @Override // java.lang.Runnable
            public final void run() {
                Fragment.this.lambda$performCreateView$0();
            }
        });
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.initialize();
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d(FragmentManager.TAG, "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            C1482l0.m10540a(this.mView, this.mViewLifecycleOwner);
            View view = this.mView;
            FragmentViewLifecycleOwner fragmentViewLifecycleOwner = this.mViewLifecycleOwner;
            C10843j.m430f(view, "<this>");
            view.setTag(R.id.view_tree_view_model_store_owner, fragmentViewLifecycleOwner);
            C1694e.m10045a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo10510i(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.isInitialized()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onDestroy()"));
    }

    public void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo10538b().m10546a(AbstractC1464h.EnumC1468b.CREATED)) {
            this.mViewLifecycleOwner.handleLifecycleEvent(AbstractC1464h.EnumC1465a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C0483j<C1516b.C1517a> c0483j = AbstractC1515a.m10515a(this).f3493b.f3495a;
            int i = c0483j.f1535c;
            for (int i2 = 0; i2 < i; i2++) {
                ((C1516b.C1517a) c0483j.f1534b[i2]).getClass();
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (!this.mChildFragmentManager.isDestroyed()) {
                this.mChildFragmentManager.dispatchDestroy();
                this.mChildFragmentManager = new FragmentManagerImpl();
                return;
            }
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onDetach()"));
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.dispatchOptionsItemSelected(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.dispatchPause();
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(AbstractC1464h.EnumC1465a.ON_PAUSE);
        }
        this.mLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onPause()"));
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean isPrimaryNavigation = this.mFragmentManager.isPrimaryNavigation(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != isPrimaryNavigation) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(isPrimaryNavigation);
            onPrimaryNavigationFragmentChanged(isPrimaryNavigation);
            this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C1484n c1484n = this.mLifecycleRegistry;
            AbstractC1464h.EnumC1465a enumC1465a = AbstractC1464h.EnumC1465a.ON_RESUME;
            c1484n.m10534f(enumC1465a);
            if (this.mView != null) {
                this.mViewLifecycleOwner.handleLifecycleEvent(enumC1465a);
            }
            this.mChildFragmentManager.dispatchResume();
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C1484n c1484n = this.mLifecycleRegistry;
            AbstractC1464h.EnumC1465a enumC1465a = AbstractC1464h.EnumC1465a.ON_START;
            c1484n.m10534f(enumC1465a);
            if (this.mView != null) {
                this.mViewLifecycleOwner.handleLifecycleEvent(enumC1465a);
            }
            this.mChildFragmentManager.dispatchStart();
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(AbstractC1464h.EnumC1465a.ON_STOP);
        }
        this.mLifecycleRegistry.m10534f(AbstractC1464h.EnumC1465a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onStop()"));
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.dispatchViewCreated();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().mEnterTransitionPostponed = true;
    }

    public final void postponeEnterTransition(long j, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().mEnterTransitionPostponed = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        this.mPostponedHandler = fragmentManager != null ? fragmentManager.getHost().getHandler() : new Handler(Looper.getMainLooper());
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @NonNull
    @MainThread
    public final <I, O> AbstractC0057c<I> registerForActivityResult(@NonNull AbstractC0058a<I, O> abstractC0058a, @NonNull InterfaceC0056b<O> interfaceC0056b) {
        return prepareCallInternal(abstractC0058a, new InterfaceC0457a<Void, AbstractC0066g>() { // from class: androidx.fragment.app.Fragment.7
            @Override // androidx.arch.core.util.InterfaceC0457a
            public AbstractC0066g apply(Void r3) {
                Fragment fragment = Fragment.this;
                FragmentHostCallback<?> fragmentHostCallback = fragment.mHost;
                return fragmentHostCallback instanceof InterfaceC0069h ? ((InterfaceC0069h) fragmentHostCallback).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
            }
        }, interfaceC0056b);
    }

    @NonNull
    @MainThread
    public final <I, O> AbstractC0057c<I> registerForActivityResult(@NonNull AbstractC0058a<I, O> abstractC0058a, @NonNull final AbstractC0066g abstractC0066g, @NonNull InterfaceC0056b<O> interfaceC0056b) {
        return prepareCallInternal(abstractC0058a, new InterfaceC0457a<Void, AbstractC0066g>() { // from class: androidx.fragment.app.Fragment.8
            @Override // androidx.arch.core.util.InterfaceC0457a
            public AbstractC0066g apply(Void r1) {
                return abstractC0066g;
            }
        }, interfaceC0056b);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().launchRequestPermissions(this, strArr, i);
            return;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " not attached to Activity"));
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " not attached to a context."));
    }

    @NonNull
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.restoreSaveStateInternal(bundle);
        this.mChildFragmentManager.dispatchCreate();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.handleLifecycleEvent(AbstractC1464h.EnumC1465a.ON_CREATE);
                return;
            }
            return;
        }
        throw new SuperNotCalledException(C0780c.m11813a("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().mAllowEnterTransitionOverlap = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().mAllowReturnTransitionOverlap = Boolean.valueOf(z);
    }

    public void setAnimations(@AnimRes int i, @AnimRes int i2, @AnimRes int i3, @AnimRes int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().mEnterAnim = i;
        ensureAnimationInfo().mExitAnim = i2;
        ensureAnimationInfo().mPopEnterAnim = i3;
        ensureAnimationInfo().mPopExitAnim = i4;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@Nullable AbstractC0631l0 abstractC0631l0) {
        ensureAnimationInfo().mEnterTransitionCallback = abstractC0631l0;
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().mEnterTransition = obj;
    }

    public void setExitSharedElementCallback(@Nullable AbstractC0631l0 abstractC0631l0) {
        ensureAnimationInfo().mExitTransitionCallback = abstractC0631l0;
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().mExitTransition = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().mFocusedView = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.onSupportInvalidateOptionsMenu();
        }
    }

    public void setInitialSavedState(@Nullable SavedState savedState) {
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        this.mSavedFragmentState = (savedState == null || (r2 = savedState.mState) == null) ? null : null;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.mNextTransition = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().mIsPop = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().mPostOnViewCreatedAlpha = f;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().mReenterTransition = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C1416c.C1418b c1418b = C1416c.f3347a;
        C1424i c1424i = new C1424i(this);
        C1416c.m10580c(c1424i);
        C1416c.C1418b m10582a = C1416c.m10582a(this);
        if (m10582a.f3359a.contains(C1416c.EnumC1417a.DETECT_RETAIN_INSTANCE_USAGE) && C1416c.m10578e(m10582a, getClass(), C1424i.class)) {
            C1416c.m10581b(m10582a, c1424i);
        }
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            if (z) {
                fragmentManager.addRetainedFragment(this);
                return;
            } else {
                fragmentManager.removeRetainedFragment(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().mReturnTransition = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().mSharedElementEnterTransition = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        AnimationInfo animationInfo = this.mAnimationInfo;
        animationInfo.mSharedElementSourceNames = arrayList;
        animationInfo.mSharedElementTargetNames = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().mSharedElementReturnTransition = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            C1416c.C1418b c1418b = C1416c.f3347a;
            C1425j c1425j = new C1425j(this, fragment, i);
            C1416c.m10580c(c1425j);
            C1416c.C1418b m10582a = C1416c.m10582a(this);
            if (m10582a.f3359a.contains(C1416c.EnumC1417a.DETECT_TARGET_FRAGMENT_USAGE) && C1416c.m10578e(m10582a, getClass(), C1425j.class)) {
                C1416c.m10581b(m10582a, c1425j);
            }
        }
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            throw new IllegalArgumentException(C0780c.m11813a("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
            this.mTargetRequestCode = i;
        }
        this.mTarget = null;
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        boolean z2;
        C1416c.C1418b c1418b = C1416c.f3347a;
        C1426k c1426k = new C1426k(this, z);
        C1416c.m10580c(c1426k);
        C1416c.C1418b m10582a = C1416c.m10582a(this);
        if (m10582a.f3359a.contains(C1416c.EnumC1417a.DETECT_SET_USER_VISIBLE_HINT) && C1416c.m10578e(m10582a, getClass(), C1426k.class)) {
            C1416c.m10581b(m10582a, c1426k);
        }
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.performPendingDeferredStart(fragmentManager.createOrGetFragmentStateManager(this));
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            return fragmentHostCallback.onShouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@NonNull Intent intent, @Nullable Bundle bundle) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            fragmentHostCallback.onStartActivityFromFragment(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().launchStartActivityForResult(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            getParentFragmentManager().launchStartIntentSenderForResult(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException(C0780c.m11813a("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().mEnterTransitionPostponed) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().mEnterTransitionPostponed = false;
        } else if (Looper.myLooper() != this.mHost.getHandler().getLooper()) {
            this.mHost.getHandler().postAtFrontOfQueue(new Runnable() { // from class: androidx.fragment.app.Fragment.3
                @Override // java.lang.Runnable
                public void run() {
                    Fragment.this.callStartTransitionListener(false);
                }
            });
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
