package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
public final class zzfhj {
    private static zzfhj zza;
    private float zzb = 0.0f;
    private final zzfhc zzc;
    private final zzfha zzd;
    private zzfhb zze;
    private zzfhd zzf;

    public zzfhj(zzfhc zzfhcVar, zzfha zzfhaVar) {
        this.zzc = zzfhcVar;
        this.zzd = zzfhaVar;
    }

    public static zzfhj zzb() {
        if (zza == null) {
            zza = new zzfhj(new zzfhc(), new zzfha());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zze = new zzfhb(new Handler(), context, new zzfgz(), this);
    }

    public final void zzd(float f) {
        this.zzb = f;
        if (this.zzf == null) {
            this.zzf = zzfhd.zza();
        }
        for (zzfgs zzfgsVar : this.zzf.zzb()) {
            zzfgsVar.zzg().zzh(f);
        }
    }

    public final void zze() {
        zzfhe.zza().zzd(this);
        zzfhe.zza().zzb();
        zzfif.zzd().zzi();
        this.zze.zza();
    }

    public final void zzf() {
        zzfif.zzd().zzj();
        zzfhe.zza().zzc();
        this.zze.zzb();
    }
}
