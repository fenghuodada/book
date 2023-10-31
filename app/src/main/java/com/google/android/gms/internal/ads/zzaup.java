package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzaup implements Runnable {
    final /* synthetic */ zzauq zza;

    public zzaup(zzauq zzauqVar) {
        this.zza = zzauqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzaur> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzauq zzauqVar = this.zza;
            z = zzauqVar.zzd;
            if (z) {
                z2 = zzauqVar.zze;
                if (z2) {
                    zzauqVar.zzd = false;
                    zzbzt.zze("App went background");
                    list = this.zza.zzf;
                    for (zzaur zzaurVar : list) {
                        try {
                            zzaurVar.zza(false);
                        } catch (Exception e) {
                            zzbzt.zzh("", e);
                        }
                    }
                }
            }
            zzbzt.zze("App is still foreground");
        }
    }
}
