package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public final class zzfhe implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfhe zza = new zzfhe();
    private boolean zzb;
    private boolean zzc;
    private zzfhj zzd;

    private zzfhe() {
    }

    public static zzfhe zza() {
        return zza;
    }

    private final void zze() {
        boolean z = this.zzc;
        for (zzfgs zzfgsVar : zzfhd.zza().zzc()) {
            zzfhp zzg = zzfgsVar.zzg();
            if (zzg.zzk()) {
                zzfhi.zza().zzb(zzg.zza(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    private final void zzf(boolean z) {
        if (this.zzc != z) {
            this.zzc = z;
            if (this.zzb) {
                zze();
                if (this.zzd != null) {
                    if (!z) {
                        zzfif.zzd().zzi();
                    } else {
                        zzfif.zzd().zzh();
                    }
                }
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
        zzf(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View zzf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z = true;
        boolean z2 = true;
        for (zzfgs zzfgsVar : zzfhd.zza().zzb()) {
            if (zzfgsVar.zzj() && (zzf = zzfgsVar.zzf()) != null && zzf.hasWindowFocus()) {
                z2 = false;
            }
        }
        zzf((i == 100 || !z2) ? false : false);
    }

    public final void zzb() {
        this.zzb = true;
        this.zzc = false;
        zze();
    }

    public final void zzc() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = null;
    }

    public final void zzd(zzfhj zzfhjVar) {
        this.zzd = zzfhjVar;
    }
}
