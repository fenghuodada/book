package com.iab.omid.library.applovin.p046b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.adsession.C8773a;

/* renamed from: com.iab.omid.library.applovin.b.b */
/* loaded from: classes3.dex */
public class C8776b implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static C8776b f16696a = new C8776b();

    /* renamed from: b */
    private boolean f16697b;

    /* renamed from: c */
    private boolean f16698c;

    /* renamed from: d */
    private InterfaceC8777a f16699d;

    /* renamed from: com.iab.omid.library.applovin.b.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8777a {
        /* renamed from: a */
        void mo3084a(boolean z);
    }

    private C8776b() {
    }

    /* renamed from: a */
    public static C8776b m3119a() {
        return f16696a;
    }

    /* renamed from: a */
    private void m3116a(boolean z) {
        if (this.f16698c != z) {
            this.f16698c = z;
            if (this.f16697b) {
                m3112e();
                InterfaceC8777a interfaceC8777a = this.f16699d;
                if (interfaceC8777a != null) {
                    interfaceC8777a.mo3084a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m3112e() {
        boolean z = !this.f16698c;
        for (C8773a c8773a : C8775a.m3126a().m3124b()) {
            c8773a.getAdSessionStatePublisher().m3012a(z);
        }
    }

    /* renamed from: a */
    public void m3118a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void m3117a(InterfaceC8777a interfaceC8777a) {
        this.f16699d = interfaceC8777a;
    }

    /* renamed from: b */
    public void m3115b() {
        this.f16697b = true;
        this.f16698c = false;
        m3112e();
    }

    /* renamed from: c */
    public void m3114c() {
        this.f16697b = false;
        this.f16698c = false;
        this.f16699d = null;
    }

    @RequiresApi(api = 16)
    @VisibleForTesting
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo m3113d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m3116a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        View m3140e;
        boolean z = true;
        boolean z2 = m3113d().importance != 100;
        boolean z3 = true;
        for (C8773a c8773a : C8775a.m3126a().m3122c()) {
            if (c8773a.m3139f() && (m3140e = c8773a.m3140e()) != null && m3140e.hasWindowFocus()) {
                z3 = false;
            }
        }
        m3116a((z2 && z3) ? false : false);
    }
}
