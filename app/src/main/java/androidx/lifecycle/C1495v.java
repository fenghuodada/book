package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1492u;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.lifecycle.v */
/* loaded from: classes.dex */
public final class C1495v extends C1454d {
    final /* synthetic */ C1492u this$0;

    /* renamed from: androidx.lifecycle.v$a */
    /* loaded from: classes.dex */
    public static final class C1496a extends C1454d {
        final /* synthetic */ C1492u this$0;

        public C1496a(C1492u c1492u) {
            this.this$0 = c1492u;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
            this.this$0.m10526a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            C10843j.m430f(activity, "activity");
            C1492u c1492u = this.this$0;
            int i = c1492u.f3465a + 1;
            c1492u.f3465a = i;
            if (i == 1 && c1492u.f3468d) {
                c1492u.f3470f.m10534f(AbstractC1464h.EnumC1465a.ON_START);
                c1492u.f3468d = false;
            }
        }
    }

    public C1495v(C1492u c1492u) {
        this.this$0 = c1492u;
    }

    @Override // androidx.lifecycle.C1454d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        C10843j.m430f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC1502w.f3479b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C10843j.m432d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC1502w) findFragmentByTag).f3480a = this.this$0.f3472h;
        }
    }

    @Override // androidx.lifecycle.C1454d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        C10843j.m430f(activity, "activity");
        C1492u c1492u = this.this$0;
        int i = c1492u.f3466b - 1;
        c1492u.f3466b = i;
        if (i == 0) {
            Handler handler = c1492u.f3469e;
            C10843j.m433c(handler);
            handler.postDelayed(c1492u.f3471g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @RequiresApi(29)
    public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        C10843j.m430f(activity, "activity");
        C1492u.C1493a.m10525a(activity, new C1496a(this.this$0));
    }

    @Override // androidx.lifecycle.C1454d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        C10843j.m430f(activity, "activity");
        C1492u c1492u = this.this$0;
        int i = c1492u.f3465a - 1;
        c1492u.f3465a = i;
        if (i == 0 && c1492u.f3467c) {
            c1492u.f3470f.m10534f(AbstractC1464h.EnumC1465a.ON_STOP);
            c1492u.f3468d = true;
        }
    }
}
