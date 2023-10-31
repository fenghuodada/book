package com.ambrose.overwall;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1492u;
import androidx.lifecycle.InterfaceC1481l;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes.dex */
public class AppOpenManager implements InterfaceC1481l, Application.ActivityLifecycleCallbacks {
    public AppOpenManager(MyApplication myApplication) {
        myApplication.registerActivityLifecycleCallbacks(this);
        C1492u.f3464i.f3470f.mo10539a(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @OnLifecycleEvent(AbstractC1464h.EnumC1465a.ON_START)
    public void onStart() {
    }
}
