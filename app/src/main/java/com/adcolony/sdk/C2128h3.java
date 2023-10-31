package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.adcolony.sdk.h3 */
/* loaded from: classes.dex */
public final class C2128h3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final HashSet f5166a = new HashSet();

    /* renamed from: b */
    public final /* synthetic */ C2058b3 f5167b;

    public C2128h3(C2058b3 c2058b3) {
        this.f5167b = c2058b3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        C2383z4 c2383z4 = this.f5167b.f4985c;
        if (!c2383z4.f5725f) {
            c2383z4.m9424c(true);
        }
        C2201m0.f5363a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
        C2201m0.f5366d = false;
        this.f5167b.f4985c.m9423d(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        ScheduledExecutorService scheduledExecutorService;
        this.f5166a.add(Integer.valueOf(activity.hashCode()));
        C2201m0.f5366d = true;
        C2201m0.f5363a = activity;
        C2058b3 c2058b3 = this.f5167b;
        C2323u4 c2323u4 = c2058b3.m9689n().f4926e;
        Context context = C2201m0.f5363a;
        if (context != null && c2058b3.f4985c.f5723d && (context instanceof ActivityC2209n0) && !((ActivityC2209n0) context).f5379d) {
            return;
        }
        C2201m0.f5363a = activity;
        C2100e2 c2100e2 = c2058b3.f5001s;
        if (c2100e2 != null) {
            if (!Objects.equals(c2100e2.f5098b.m9436w("m_origin"), "")) {
                C2100e2 c2100e22 = c2058b3.f5001s;
                c2100e22.m9641a(c2100e22.f5098b).m9640b();
            }
            c2058b3.f5001s = null;
        }
        c2058b3.f4960B = false;
        C2383z4 c2383z4 = c2058b3.f4985c;
        c2383z4.f5729j = false;
        if (c2058b3.f4963E && !c2383z4.f5725f) {
            c2383z4.m9424c(true);
        }
        c2058b3.f4985c.m9423d(true);
        C2264q4 c2264q4 = c2058b3.f4987e;
        C2100e2 c2100e23 = c2264q4.f5514a;
        if (c2100e23 != null) {
            c2264q4.m9512a(c2100e23);
            c2264q4.f5514a = null;
        }
        if (c2323u4 == null || (scheduledExecutorService = c2323u4.f5629b) == null || scheduledExecutorService.isShutdown() || scheduledExecutorService.isTerminated()) {
            C2074d.m9675b(activity, C2201m0.m9588d().f5000r);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        C2383z4 c2383z4 = this.f5167b.f4985c;
        if (!c2383z4.f5726g) {
            c2383z4.f5726g = true;
            c2383z4.f5727h = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        HashSet hashSet = this.f5166a;
        hashSet.remove(Integer.valueOf(activity.hashCode()));
        if (hashSet.isEmpty()) {
            C2383z4 c2383z4 = this.f5167b.f4985c;
            if (c2383z4.f5726g) {
                c2383z4.f5726g = false;
                c2383z4.f5727h = true;
                c2383z4.m9426a(false);
            }
        }
    }
}
