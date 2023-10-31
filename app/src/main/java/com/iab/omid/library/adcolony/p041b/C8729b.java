package com.iab.omid.library.adcolony.p041b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.iab.omid.library.adcolony.adsession.C8722l;
import com.iab.omid.library.adcolony.publisher.AbstractC8746a;
import com.iab.omid.library.adcolony.walking.C8751b;
import java.util.Collections;

/* renamed from: com.iab.omid.library.adcolony.b.b */
/* loaded from: classes3.dex */
public final class C8729b implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    public static final C8729b f16594d = new C8729b();

    /* renamed from: a */
    public boolean f16595a;

    /* renamed from: b */
    public boolean f16596b;

    /* renamed from: c */
    public InterfaceC8730a f16597c;

    /* renamed from: com.iab.omid.library.adcolony.b.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8730a {
    }

    /* renamed from: a */
    public final void m3184a(boolean z) {
        if (this.f16596b != z) {
            this.f16596b = z;
            if (this.f16595a) {
                m3183b();
                if (this.f16597c != null) {
                    if (!z) {
                        C8751b.f16637h.getClass();
                        C8751b.m3165a();
                        return;
                    }
                    C8751b.f16637h.getClass();
                    Handler handler = C8751b.f16639j;
                    if (handler != null) {
                        handler.removeCallbacks(C8751b.f16641l);
                        C8751b.f16639j = null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void m3183b() {
        boolean z;
        String str;
        boolean z2 = !this.f16596b;
        for (C8722l c8722l : Collections.unmodifiableCollection(C8728a.f16591c.f16592a)) {
            AbstractC8746a abstractC8746a = c8722l.f16573e;
            if (abstractC8746a.f16626a.get() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (z2) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                C8734f.m3182a(abstractC8746a.m3169f(), "setState", str);
            }
        }
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
        m3184a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean z;
        boolean z2;
        View view;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z3 = true;
        if (runningAppProcessInfo.importance != 100) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = true;
        for (C8722l c8722l : Collections.unmodifiableCollection(C8728a.f16591c.f16593b)) {
            if (c8722l.f16574f && !c8722l.f16575g) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (view = c8722l.f16572d.get()) != null && view.hasWindowFocus()) {
                z4 = false;
            }
        }
        m3184a((z && z4) ? false : false);
    }
}
