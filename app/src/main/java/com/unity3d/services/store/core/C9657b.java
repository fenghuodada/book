package com.unity3d.services.store.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.store.EnumC9649b;
import com.unity3d.services.store.gpbl.C9690c;
import com.unity3d.services.store.listeners.C9700e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.unity3d.services.store.core.b */
/* loaded from: classes3.dex */
public class C9657b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final ArrayList<String> f19196a;

    /* renamed from: b */
    private final C9690c f19197b;

    /* renamed from: c */
    private final C9700e f19198c = new C9700e(EnumC9649b.PURCHASES_ON_RESUME_RESULT, EnumC9649b.PURCHASES_ON_RESUME_ERROR);

    public C9657b(ArrayList<String> arrayList, C9690c c9690c) {
        this.f19196a = arrayList;
        this.f19197b = c9690c;
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
        try {
            Iterator<String> it = this.f19196a.iterator();
            while (it.hasNext()) {
                this.f19197b.m1680a(it.next(), this.f19198c);
            }
        } catch (ClassNotFoundException e) {
            C9549a.m2014e("Couldn't fetch purchases onActivityResumed. " + e.getMessage());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
