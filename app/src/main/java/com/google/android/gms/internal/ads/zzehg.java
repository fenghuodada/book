package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzehg implements com.google.android.gms.ads.internal.zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcvg zzb;
    private final zzcwa zzc;
    private final zzdcy zzd;
    private final zzdcq zze;
    private final zzcnz zzf;

    public zzehg(zzcvg zzcvgVar, zzcwa zzcwaVar, zzdcy zzdcyVar, zzdcq zzdcqVar, zzcnz zzcnzVar) {
        this.zzb = zzcvgVar;
        this.zzc = zzcwaVar;
        this.zzd = zzdcyVar;
        this.zze = zzdcqVar;
        this.zzf = zzcnzVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzl();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
