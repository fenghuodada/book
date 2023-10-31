package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class zzauf implements zzauk {
    final /* synthetic */ Activity zza;

    public zzauf(zzaul zzaulVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.zza);
    }
}
