package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaus {
    private final Object zza = new Object();
    private zzauq zzb = null;
    private boolean zzc = false;

    @Nullable
    public final Activity zza() {
        synchronized (this.zza) {
            zzauq zzauqVar = this.zzb;
            if (zzauqVar != null) {
                return zzauqVar.zza();
            }
            return null;
        }
    }

    @Nullable
    public final Context zzb() {
        synchronized (this.zza) {
            zzauq zzauqVar = this.zzb;
            if (zzauqVar != null) {
                return zzauqVar.zzb();
            }
            return null;
        }
    }

    public final void zzc(zzaur zzaurVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzauq();
            }
            this.zzb.zzf(zzaurVar);
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzbzt.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzauq();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzaur zzaurVar) {
        synchronized (this.zza) {
            zzauq zzauqVar = this.zzb;
            if (zzauqVar == null) {
                return;
            }
            zzauqVar.zzh(zzaurVar);
        }
    }
}
