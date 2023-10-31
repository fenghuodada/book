package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.sdk.utils.AbstractC3287a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.a */
/* loaded from: classes.dex */
public class C3038a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final List<AbstractC3287a> f7563a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private WeakReference<Activity> f7564b;

    /* renamed from: c */
    private WeakReference<Activity> f7565c;

    public C3038a(Context context) {
        this.f7564b = new WeakReference<>(null);
        this.f7565c = new WeakReference<>(null);
        if (C3349v.m6862a()) {
            C3349v.m6849f("AppLovinSdk", "Attaching Activity lifecycle manager...");
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f7564b = new WeakReference<>(activity);
            if (activity.hasWindowFocus()) {
                this.f7565c = this.f7564b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public Activity m8070a() {
        return this.f7564b.get();
    }

    /* renamed from: a */
    public void m8069a(AbstractC3287a abstractC3287a) {
        this.f7563a.add(abstractC3287a);
    }

    /* renamed from: b */
    public Activity m8068b() {
        return this.f7565c.get();
    }

    /* renamed from: b */
    public void m8067b(AbstractC3287a abstractC3287a) {
        this.f7563a.remove(abstractC3287a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f7563a).iterator();
        while (it.hasNext()) {
            ((AbstractC3287a) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        Iterator it = new ArrayList(this.f7563a).iterator();
        while (it.hasNext()) {
            ((AbstractC3287a) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        this.f7565c = new WeakReference<>(null);
        Iterator it = new ArrayList(this.f7563a).iterator();
        while (it.hasNext()) {
            ((AbstractC3287a) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f7564b = weakReference;
        this.f7565c = weakReference;
        Iterator it = new ArrayList(this.f7563a).iterator();
        while (it.hasNext()) {
            ((AbstractC3287a) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        Iterator it = new ArrayList(this.f7563a).iterator();
        while (it.hasNext()) {
            ((AbstractC3287a) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        Iterator it = new ArrayList(this.f7563a).iterator();
        while (it.hasNext()) {
            ((AbstractC3287a) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        Iterator it = new ArrayList(this.f7563a).iterator();
        while (it.hasNext()) {
            ((AbstractC3287a) it.next()).onActivityStopped(activity);
        }
    }
}
