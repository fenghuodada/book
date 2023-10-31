package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzdda {
    private final List zza;
    private final zzfgj zzb;
    private boolean zzc;

    public zzdda(zzezf zzezfVar, zzfgj zzfgjVar) {
        this.zza = zzezfVar.zzq;
        this.zzb = zzfgjVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
