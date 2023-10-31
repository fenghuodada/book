package com.unity3d.services.core.lifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

@TargetApi(14)
/* renamed from: com.unity3d.services.core.lifecycle.c */
/* loaded from: classes3.dex */
public class C9545c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private EnumC9547e f18889a = EnumC9547e.RESUMED;

    /* renamed from: b */
    private boolean f18890b = true;

    /* renamed from: c */
    private Set<InterfaceC9544b> f18891c = new HashSet();

    /* renamed from: a */
    public synchronized void m2032a(InterfaceC9544b interfaceC9544b) {
        this.f18891c.add(interfaceC9544b);
    }

    /* renamed from: a */
    public boolean m2033a() {
        return this.f18890b;
    }

    /* renamed from: b */
    public synchronized void m2031b() {
        EnumC9547e enumC9547e = this.f18890b ? EnumC9547e.RESUMED : EnumC9547e.PAUSED;
        for (InterfaceC9544b interfaceC9544b : this.f18891c) {
            interfaceC9544b.mo1808a(enumC9547e);
        }
    }

    /* renamed from: b */
    public synchronized void m2030b(InterfaceC9544b interfaceC9544b) {
        this.f18891c.remove(interfaceC9544b);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f18889a = EnumC9547e.CREATED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f18889a = EnumC9547e.DESTROYED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f18889a = EnumC9547e.PAUSED;
        this.f18890b = false;
        m2031b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f18889a = EnumC9547e.RESUMED;
        this.f18890b = true;
        m2031b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f18889a = EnumC9547e.SAVE_INSTANCE_STATE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f18889a = EnumC9547e.STARTED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f18889a = EnumC9547e.STOPPED;
    }
}
