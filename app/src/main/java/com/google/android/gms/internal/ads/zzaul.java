package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class zzaul implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzaul(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzaud(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(new zzauj(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(new zzaug(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(new zzauf(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzaui(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(new zzaue(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(new zzauh(this, activity));
    }

    public final void zza(zzauk zzaukVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzaukVar.zza(activityLifecycleCallbacks);
            } else if (this.zzc) {
            } else {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception e) {
            zzbzt.zzh("Error while dispatching lifecycle callback.", e);
        }
    }
}
