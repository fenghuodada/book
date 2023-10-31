package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.AbstractC1464h;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public final class FragmentC1502w extends Fragment {

    /* renamed from: b */
    public static final /* synthetic */ int f3479b = 0;
    @Nullable

    /* renamed from: a */
    public InterfaceC1503a f3480a;

    /* renamed from: androidx.lifecycle.w$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1503a {
        /* renamed from: a */
        void mo10523a();

        void onResume();

        void onStart();
    }

    /* renamed from: androidx.lifecycle.w$b */
    /* loaded from: classes.dex */
    public static final class C1504b {
        @JvmStatic
        /* renamed from: a */
        public static void m10522a(@NotNull Activity activity, @NotNull AbstractC1464h.EnumC1465a event) {
            C10843j.m430f(activity, "activity");
            C10843j.m430f(event, "event");
            if (activity instanceof InterfaceC1486o) {
                ((InterfaceC1486o) activity).getLifecycle().m10534f(event);
            } else if (activity instanceof InterfaceC1483m) {
                AbstractC1464h lifecycle = ((InterfaceC1483m) activity).getLifecycle();
                if (lifecycle instanceof C1484n) {
                    ((C1484n) lifecycle).m10534f(event);
                }
            }
        }

        @JvmStatic
        /* renamed from: b */
        public static void m10521b(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                C1505c.Companion.getClass();
                activity.registerActivityLifecycleCallbacks(new C1505c());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC1502w(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.lifecycle.w$c */
    /* loaded from: classes.dex */
    public static final class C1505c implements Application.ActivityLifecycleCallbacks {
        @NotNull
        public static final C1506a Companion = new C1506a();

        /* renamed from: androidx.lifecycle.w$c$a */
        /* loaded from: classes.dex */
        public static final class C1506a {
        }

        @JvmStatic
        public static final void registerIn(@NotNull Activity activity) {
            Companion.getClass();
            C10843j.m430f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new C1505c());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            C10843j.m430f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            C10843j.m430f(activity, "activity");
            int i = FragmentC1502w.f3479b;
            C1504b.m10522a(activity, AbstractC1464h.EnumC1465a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
            int i = FragmentC1502w.f3479b;
            C1504b.m10522a(activity, AbstractC1464h.EnumC1465a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
            int i = FragmentC1502w.f3479b;
            C1504b.m10522a(activity, AbstractC1464h.EnumC1465a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
            int i = FragmentC1502w.f3479b;
            C1504b.m10522a(activity, AbstractC1464h.EnumC1465a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
            int i = FragmentC1502w.f3479b;
            C1504b.m10522a(activity, AbstractC1464h.EnumC1465a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
            int i = FragmentC1502w.f3479b;
            C1504b.m10522a(activity, AbstractC1464h.EnumC1465a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            C10843j.m430f(activity, "activity");
            C10843j.m430f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
        }
    }

    /* renamed from: a */
    public final void m10524a(AbstractC1464h.EnumC1465a enumC1465a) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C10843j.m431e(activity, "activity");
            C1504b.m10522a(activity, enumC1465a);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        InterfaceC1503a interfaceC1503a = this.f3480a;
        if (interfaceC1503a != null) {
            interfaceC1503a.mo10523a();
        }
        m10524a(AbstractC1464h.EnumC1465a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m10524a(AbstractC1464h.EnumC1465a.ON_DESTROY);
        this.f3480a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m10524a(AbstractC1464h.EnumC1465a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1503a interfaceC1503a = this.f3480a;
        if (interfaceC1503a != null) {
            interfaceC1503a.onResume();
        }
        m10524a(AbstractC1464h.EnumC1465a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC1503a interfaceC1503a = this.f3480a;
        if (interfaceC1503a != null) {
            interfaceC1503a.onStart();
        }
        m10524a(AbstractC1464h.EnumC1465a.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m10524a(AbstractC1464h.EnumC1465a.ON_STOP);
    }
}
