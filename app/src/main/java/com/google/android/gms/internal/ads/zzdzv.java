package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzdzv {
    private final zzdzr zza;
    private final zzfwc zzb;

    public zzdzv(zzdzr zzdzrVar, zzfwc zzfwcVar) {
        this.zza = zzdzrVar;
        this.zzb = zzfwcVar;
    }

    public final void zza(zzfdg zzfdgVar) {
        zzfwc zzfwcVar = this.zzb;
        final zzdzr zzdzrVar = this.zza;
        zzfvr.zzq(zzfwcVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdzr.this.getWritableDatabase();
            }
        }), new zzdzu(this, zzfdgVar), this.zzb);
    }
}
