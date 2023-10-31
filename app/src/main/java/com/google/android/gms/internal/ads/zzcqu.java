package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzcqu implements zzcww, zzaty {
    private final zzezf zza;
    private final zzcwa zzb;
    private final zzcxf zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcqu(zzezf zzezfVar, zzcwa zzcwaVar, zzcxf zzcxfVar) {
        this.zza = zzezfVar;
        this.zzb = zzcwaVar;
        this.zzc = zzcxfVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void zzc(zzatx zzatxVar) {
        if (this.zza.zzf == 1 && zzatxVar.zzj) {
            zza();
        }
        if (zzatxVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final synchronized void zzn() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
