package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzfgn {
    private boolean zza;

    public final void zza(Context context) {
        zzfhv.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfhj.zzb().zzc(context);
        zzfhe zza = zzfhe.zza();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(zza);
        }
        zzfht.zzd(context);
        zzfhg.zzb().zzc(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
