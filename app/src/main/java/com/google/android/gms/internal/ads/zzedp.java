package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzedp implements zzebv {
    private final zzcqa zza;
    private final zzecw zzb;
    private final zzfwc zzc;
    private final zzcvk zzd;
    private final ScheduledExecutorService zze;

    public zzedp(zzcqa zzcqaVar, zzecw zzecwVar, zzcvk zzcvkVar, ScheduledExecutorService scheduledExecutorService, zzfwc zzfwcVar) {
        this.zza = zzcqaVar;
        this.zzb = zzecwVar;
        this.zzd = zzcvkVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzfwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(final zzezr zzezrVar, final zzezf zzezfVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzedp.this.zzc(zzezrVar, zzezfVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final boolean zzb(zzezr zzezrVar, zzezf zzezfVar) {
        return zzezrVar.zza.zza.zza() != null && this.zzb.zzb(zzezrVar, zzezfVar);
    }

    public final /* synthetic */ zzcpd zzc(final zzezr zzezrVar, final zzezf zzezfVar) throws Exception {
        return this.zza.zzb(new zzcru(zzezrVar, zzezfVar, null), new zzcqn(zzezrVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzedn
            @Override // java.lang.Runnable
            public final void run() {
                zzedp.this.zzf(zzezrVar, zzezfVar);
            }
        })).zza();
    }

    public final /* synthetic */ void zzf(zzezr zzezrVar, zzezf zzezfVar) {
        zzfvr.zzq(zzfvr.zzn(this.zzb.zza(zzezrVar, zzezfVar), zzezfVar.zzS, TimeUnit.SECONDS, this.zze), new zzedo(this), this.zzc);
    }
}
