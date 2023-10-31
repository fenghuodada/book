package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzduy {
    private final ScheduledExecutorService zza;
    private final zzfwc zzb;
    private final zzfwc zzc;
    private final zzdvp zzd;
    private final zzgvi zze;

    public zzduy(ScheduledExecutorService scheduledExecutorService, zzfwc zzfwcVar, zzfwc zzfwcVar2, zzdvp zzdvpVar, zzgvi zzgviVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfwcVar;
        this.zzc = zzfwcVar2;
        this.zzd = zzdvpVar;
        this.zze = zzgviVar;
    }

    public final /* synthetic */ zzfwb zza(zzbug zzbugVar, int i, Throwable th) throws Exception {
        return ((zzdyj) this.zze.zzb()).zzd(zzbugVar, i);
    }

    public final zzfwb zzb(final zzbug zzbugVar) {
        zzfwb zzb;
        String str = zzbugVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzb = zzfvr.zzg(new zzdwc(1));
        } else {
            zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhl)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzduw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzduy.this.zzc(zzbugVar);
                }
            }) : this.zzd.zzb(zzbugVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfvr.zzf((zzfvi) zzfvr.zzn(zzfvi.zzv(zzb), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfk)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdux
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzduy.this.zza(zzbugVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ InputStream zzc(zzbug zzbugVar) throws Exception {
        return (InputStream) this.zzd.zzb(zzbugVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfk)).intValue(), TimeUnit.SECONDS);
    }
}
