package com.unity3d.services.core.lifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import java.util.ArrayList;

@TargetApi(14)
/* renamed from: com.unity3d.services.core.lifecycle.f */
/* loaded from: classes3.dex */
public class C9548f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private ArrayList<String> f18904a;

    public C9548f(ArrayList<String> arrayList) {
        this.f18904a = arrayList;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f18904a.contains("onActivityCreated") || C9620a.m1774c() == null) {
            return;
        }
        C9620a.m1774c().m1784a(EnumC9627b.LIFECYCLE, EnumC9547e.CREATED, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (!this.f18904a.contains("onActivityDestroyed") || C9620a.m1774c() == null) {
            return;
        }
        C9620a.m1774c().m1784a(EnumC9627b.LIFECYCLE, EnumC9547e.DESTROYED, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.f18904a.contains("onActivityPaused") || C9620a.m1774c() == null) {
            return;
        }
        C9620a.m1774c().m1784a(EnumC9627b.LIFECYCLE, EnumC9547e.PAUSED, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (!this.f18904a.contains("onActivityResumed") || C9620a.m1774c() == null) {
            return;
        }
        C9620a.m1774c().m1784a(EnumC9627b.LIFECYCLE, EnumC9547e.RESUMED, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (!this.f18904a.contains("onActivitySaveInstanceState") || C9620a.m1774c() == null) {
            return;
        }
        C9620a.m1774c().m1784a(EnumC9627b.LIFECYCLE, EnumC9547e.SAVE_INSTANCE_STATE, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (!this.f18904a.contains("onActivityStarted") || C9620a.m1774c() == null) {
            return;
        }
        C9620a.m1774c().m1784a(EnumC9627b.LIFECYCLE, EnumC9547e.STARTED, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (!this.f18904a.contains("onActivityStopped") || C9620a.m1774c() == null) {
            return;
        }
        C9620a.m1774c().m1784a(EnumC9627b.LIFECYCLE, EnumC9547e.STOPPED, activity.getClass().getName());
    }
}
