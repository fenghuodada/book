package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes.dex */
public final class zzdqh extends zzdqj {
    private final zzfev zzf;

    public zzdqh(Executor executor, zzbzy zzbzyVar, zzfev zzfevVar, zzfex zzfexVar) {
        super(executor, zzbzyVar, zzfexVar);
        this.zzf = zzfevVar;
        zzfevVar.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
