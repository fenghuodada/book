package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzauq implements Application.ActivityLifecycleCallbacks {
    @Nullable
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private boolean zzd = true;
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            Activity activity2 = this.zza;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzavf) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzbzt.zzh("", e);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            for (zzavf zzavfVar : this.zzg) {
                try {
                    zzavfVar.zzb();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzbzt.zzh("", e);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        zzflv zzflvVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzaup zzaupVar = new zzaup(this);
        this.zzh = zzaupVar;
        zzflvVar.postDelayed(zzaupVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z = !this.zzd;
        this.zzd = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            for (zzavf zzavfVar : this.zzg) {
                try {
                    zzavfVar.zzc();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzbzt.zzh("", e);
                }
            }
            if (z) {
                for (zzaur zzaurVar : this.zzf) {
                    try {
                        zzaurVar.zza(true);
                    } catch (Exception e2) {
                        zzbzt.zzh("", e2);
                    }
                }
            } else {
                zzbzt.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Nullable
    public final Activity zza() {
        return this.zza;
    }

    @Nullable
    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzaur zzaurVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzaurVar);
        }
    }

    public final void zzg(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaP)).longValue();
        this.zzi = true;
    }

    public final void zzh(zzaur zzaurVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzaurVar);
        }
    }
}
