package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes.dex */
public class zzcas {
    private final zzcal zza;
    private final AtomicInteger zzb;

    public zzcas() {
        zzcal zzcalVar = new zzcal();
        this.zza = zzcalVar;
        this.zzb = new AtomicInteger(0);
        zzfvr.zzq(zzcalVar, new zzcaq(this), zzcag.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zze(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzd(obj);
    }

    @Deprecated
    public final void zzi(zzcap zzcapVar, zzcan zzcanVar) {
        zzfvr.zzq(this.zza, new zzcar(this, zzcapVar, zzcanVar), zzcag.zzf);
    }
}
