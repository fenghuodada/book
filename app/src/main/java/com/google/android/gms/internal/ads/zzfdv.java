package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class zzfdv {
    private static final zzfwb zza = zzfvr.zzh(null);
    private final zzfwc zzb;
    private final ScheduledExecutorService zzc;
    private final zzfdw zzd;

    public zzfdv(zzfwc zzfwcVar, ScheduledExecutorService scheduledExecutorService, zzfdw zzfdwVar) {
        this.zzb = zzfwcVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfdwVar;
    }

    public final zzfdl zza(Object obj, zzfwb... zzfwbVarArr) {
        return new zzfdl(this, obj, Arrays.asList(zzfwbVarArr), null);
    }

    public final zzfdu zzb(Object obj, zzfwb zzfwbVar) {
        return new zzfdu(this, obj, zzfwbVar, Collections.singletonList(zzfwbVar), zzfwbVar);
    }

    public abstract String zzf(Object obj);
}
