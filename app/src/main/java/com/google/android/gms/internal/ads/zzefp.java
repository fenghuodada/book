package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzefp implements zzfuy {
    private final zzfed zza;
    private final zzcvk zzb;
    private final zzfgf zzc;
    private final zzfgj zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcri zzg;
    private final zzefk zzh;
    private final zzeca zzi;
    private final Context zzj;
    private final zzffq zzk;

    public zzefp(Context context, zzfed zzfedVar, zzefk zzefkVar, zzcvk zzcvkVar, zzfgf zzfgfVar, zzfgj zzfgjVar, zzcri zzcriVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeca zzecaVar, zzffq zzffqVar) {
        this.zzj = context;
        this.zza = zzfedVar;
        this.zzh = zzefkVar;
        this.zzb = zzcvkVar;
        this.zzc = zzfgfVar;
        this.zzd = zzfgjVar;
        this.zzg = zzcriVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzecaVar;
        this.zzk = zzffqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzfh)).booleanValue() == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    @Override // com.google.android.gms.internal.ads.zzfuy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfwb zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefp.zza(java.lang.Object):com.google.android.gms.internal.ads.zzfwb");
    }

    public final /* synthetic */ zzfwb zzb(zzezf zzezfVar, zzezr zzezrVar, zzebv zzebvVar, Throwable th) throws Exception {
        zzfff zza = zzffe.zza(this.zzj, 12);
        zza.zzd(zzezfVar.zzF);
        zza.zzh();
        zzefk zzefkVar = this.zzh;
        zzfwb zzn = zzfvr.zzn(zzebvVar.zza(zzezrVar, zzezfVar), zzezfVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzefkVar.zze(zzezrVar, zzezfVar, zzn, this.zzc);
        zzffp.zza(zzn, this.zzk, zza);
        return zzn;
    }
}
