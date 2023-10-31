package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfdu {
    final /* synthetic */ zzfdv zza;
    private final Object zzb;
    @Nullable
    private final String zzc;
    private final zzfwb zzd;
    private final List zze;
    private final zzfwb zzf;

    private zzfdu(zzfdv zzfdvVar, Object obj, String str, zzfwb zzfwbVar, List list, zzfwb zzfwbVar2) {
        this.zza = zzfdvVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzfwbVar;
        this.zze = list;
        this.zzf = zzfwbVar2;
    }

    public final zzfdi zza() {
        zzfdw zzfdwVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfdi zzfdiVar = new zzfdi(obj, str, this.zzf);
        zzfdwVar = this.zza.zzd;
        zzfdwVar.zza(zzfdiVar);
        zzfwb zzfwbVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdo
            @Override // java.lang.Runnable
            public final void run() {
                zzfdw zzfdwVar2;
                zzfdu zzfduVar = zzfdu.this;
                zzfdi zzfdiVar2 = zzfdiVar;
                zzfdwVar2 = zzfduVar.zza.zzd;
                zzfdwVar2.zzc(zzfdiVar2);
            }
        };
        zzfwc zzfwcVar = zzcag.zzf;
        zzfwbVar.zzc(runnable, zzfwcVar);
        zzfvr.zzq(zzfdiVar, new zzfds(this, zzfdiVar), zzfwcVar);
        return zzfdiVar;
    }

    public final zzfdu zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfdu zzc(Class cls, zzfuy zzfuyVar) {
        zzfwc zzfwcVar;
        zzfdv zzfdvVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfwb zzfwbVar = this.zzd;
        List list = this.zze;
        zzfwb zzfwbVar2 = this.zzf;
        zzfwcVar = zzfdvVar.zzb;
        return new zzfdu(zzfdvVar, obj, str, zzfwbVar, list, zzfvr.zzf(zzfwbVar2, cls, zzfuyVar, zzfwcVar));
    }

    public final zzfdu zzd(final zzfwb zzfwbVar) {
        return zzg(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzfdp
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzfwb.this;
            }
        }, zzcag.zzf);
    }

    public final zzfdu zze(final zzfdg zzfdgVar) {
        return zzf(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzfdr
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzfvr.zzh(zzfdg.this.zza(obj));
            }
        });
    }

    public final zzfdu zzf(zzfuy zzfuyVar) {
        zzfwc zzfwcVar;
        zzfwcVar = this.zza.zzb;
        return zzg(zzfuyVar, zzfwcVar);
    }

    public final zzfdu zzg(zzfuy zzfuyVar, Executor executor) {
        return new zzfdu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfvr.zzm(this.zzf, zzfuyVar, executor));
    }

    public final zzfdu zzh(String str) {
        return new zzfdu(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfdu zzi(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        zzfdv zzfdvVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfwb zzfwbVar = this.zzd;
        List list = this.zze;
        zzfwb zzfwbVar2 = this.zzf;
        scheduledExecutorService = zzfdvVar.zzc;
        return new zzfdu(zzfdvVar, obj, str, zzfwbVar, list, zzfvr.zzn(zzfwbVar2, j, timeUnit, scheduledExecutorService));
    }
}
