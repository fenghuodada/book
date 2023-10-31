package com.iab.omid.library.vungle.p052b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.iab.omid.library.vungle.adsession.C8830i;
import com.iab.omid.library.vungle.publisher.AbstractC8850a;
import com.iab.omid.library.vungle.walking.C8855b;
import java.util.Collections;

/* renamed from: com.iab.omid.library.vungle.b.b */
/* loaded from: classes3.dex */
public final class C8833b implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    public static final C8833b f16832d = new C8833b();

    /* renamed from: a */
    public boolean f16833a;

    /* renamed from: b */
    public boolean f16834b;

    /* renamed from: c */
    public InterfaceC8834a f16835c;

    /* renamed from: com.iab.omid.library.vungle.b.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8834a {
    }

    /* renamed from: a */
    public final void m2939a(boolean z) {
        if (this.f16834b != z) {
            this.f16834b = z;
            if (this.f16833a) {
                m2938b();
                if (this.f16835c != null) {
                    if (!z) {
                        C8855b.f16863g.getClass();
                        C8855b.m2923a();
                        return;
                    }
                    C8855b.f16863g.getClass();
                    Handler handler = C8855b.f16865i;
                    if (handler != null) {
                        handler.removeCallbacks(C8855b.f16867k);
                        C8855b.f16865i = null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void m2938b() {
        boolean z;
        String str;
        boolean z2 = !this.f16834b;
        for (C8830i c8830i : Collections.unmodifiableCollection(C8832a.f16829c.f16830a)) {
            AbstractC8850a abstractC8850a = c8830i.f16824d;
            if (abstractC8850a.f16854a.get() != null) {
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
                C8838f.m2937a(abstractC8850a.m2927e(), "setState", str);
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
        m2939a(false);
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
        for (C8830i c8830i : Collections.unmodifiableCollection(C8832a.f16829c.f16831b)) {
            if (c8830i.f16825e && !c8830i.f16826f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (view = c8830i.f16823c.get()) != null && view.hasWindowFocus()) {
                z4 = false;
            }
        }
        m2939a((z && z4) ? false : false);
    }
}
