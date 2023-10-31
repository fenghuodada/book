package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzesm implements zzeqq {
    private final Context zza;
    private final zzbzc zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzbyt zzf;

    public zzesm(zzbyt zzbytVar, int i, Context context, zzbzc zzbzcVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zzf = zzbytVar;
        this.zza = context;
        this.zzb = zzbzcVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zze((zzfvi) zzfvr.zzn(zzfvr.zzl(zzfvi.zzv(zzfvr.zzk(new zzfux() { // from class: com.google.android.gms.internal.ads.zzesj
            @Override // com.google.android.gms.internal.ads.zzfux
            public final zzfwb zza() {
                return zzfvr.zzh(null);
            }
        }, this.zzd)), new zzfon() { // from class: com.google.android.gms.internal.ads.zzesk
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzesn(str);
            }
        }, this.zzd), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaS)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfon() { // from class: com.google.android.gms.internal.ads.zzesl
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                zzesm.this.zzc((Exception) obj);
                return null;
            }
        }, zzfwi.zzb());
    }

    public final /* synthetic */ zzesn zzc(Exception exc) {
        this.zzb.zzu(exc, "AttestationTokenSignal");
        return null;
    }
}
