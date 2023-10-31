package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes.dex */
public final class zzdqc {
    private final zzdqh zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdqc(zzdqh zzdqhVar, Executor executor) {
        this.zza = zzdqhVar;
        this.zzc = zzdqhVar.zza();
        this.zzb = executor;
    }

    public final zzdqb zza() {
        zzdqb zzdqbVar = new zzdqb(this);
        zzdqb.zza(zzdqbVar);
        return zzdqbVar;
    }

    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjW)).booleanValue()) {
            zzdqb zza = zza();
            zza.zzb("action", "pecr");
            zza.zzg();
        }
    }
}
