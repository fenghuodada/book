package com.qmuiteam.qmui.arch;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Stack;

/* renamed from: com.qmuiteam.qmui.arch.j */
/* loaded from: classes3.dex */
public final class C9035j implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c */
    public static C9035j f17257c;

    /* renamed from: a */
    public final Stack<Activity> f17258a = new Stack<>();

    /* renamed from: b */
    public Activity f17259b = null;

    /* renamed from: a */
    public final boolean m2786a() {
        Stack<Activity> stack = this.f17258a;
        return stack.size() > 2 || (stack.size() == 2 && !stack.get(0).isFinishing());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        if (this.f17259b == null) {
            this.f17259b = activity;
        }
        this.f17258a.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        Stack<Activity> stack = this.f17258a;
        stack.remove(activity);
        if (stack.isEmpty()) {
            this.f17259b = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        this.f17259b = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }
}
