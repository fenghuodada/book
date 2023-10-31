package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import androidx.annotation.GuardedBy;

/* loaded from: classes.dex */
public abstract class zzd {
    @GuardedBy("AppComponent.class")
    private static zzd zza;

    public static zzd zza(Context context) {
        zzd zzdVar;
        synchronized (zzd.class) {
            if (zza == null) {
                zzag zzagVar = new zzag(null);
                zzagVar.zzb((Application) context.getApplicationContext());
                zza = zzagVar.zza();
            }
            zzdVar = zza;
        }
        return zzdVar;
    }

    public abstract zzk zzb();

    public abstract zzba zzc();
}
