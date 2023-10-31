package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzdud {
    private final zzfwc zza;
    private final zzfwc zzb;
    private final zzdvl zzc;
    private final zzgvi zzd;

    public zzdud(zzfwc zzfwcVar, zzfwc zzfwcVar2, zzdvl zzdvlVar, zzgvi zzgviVar) {
        this.zza = zzfwcVar;
        this.zzb = zzfwcVar2;
        this.zzc = zzdvlVar;
        this.zzd = zzgviVar;
    }

    public final /* synthetic */ zzfwb zza(zzbug zzbugVar, int i, zzdwc zzdwcVar) throws Exception {
        return ((zzdyj) this.zzd.zzb()).zzc(zzbugVar, i);
    }

    public final zzfwb zzb(final zzbug zzbugVar) {
        String str = zzbugVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        zzfwb zzg = com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfvr.zzg(new zzdwc(1)) : zzfvr.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdua
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdud.this.zzc(zzbugVar);
            }
        }), ExecutionException.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdub
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzfvr.zzg(((ExecutionException) obj).getCause());
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzfvr.zzf(zzg, zzdwc.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzduc
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdud.this.zza(zzbugVar, callingUid, (zzdwc) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ InputStream zzc(zzbug zzbugVar) throws Exception {
        zzcal zzcalVar;
        final zzdvl zzdvlVar = this.zzc;
        synchronized (zzdvlVar.zzb) {
            if (zzdvlVar.zzc) {
                zzcalVar = zzdvlVar.zza;
            } else {
                zzdvlVar.zzc = true;
                zzdvlVar.zze = zzbugVar;
                zzdvlVar.zzf.checkAvailabilityAndConnect();
                zzdvlVar.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdvl.this.zza();
                    }
                }, zzcag.zzf);
                zzcalVar = zzdvlVar.zza;
            }
        }
        return (InputStream) zzcalVar.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfk)).intValue(), TimeUnit.SECONDS);
    }
}
