package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzur implements zztx {
    private final zzfw zzc;
    private int zzd;
    private final zzuq zze;
    private final zzxq zzf;
    private final zzqi zzg;

    public zzur(zzfw zzfwVar, zzuq zzuqVar) {
        zzqi zzqiVar = new zzqi();
        zzxq zzxqVar = new zzxq();
        this.zzc = zzfwVar;
        this.zze = zzuqVar;
        this.zzg = zzqiVar;
        this.zzf = zzxqVar;
        this.zzd = 1048576;
    }

    public final zzur zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzut zzb(zzbq zzbqVar) {
        zzbqVar.zzd.getClass();
        return new zzut(zzbqVar, this.zzc, this.zze, zzqr.zza, this.zzf, this.zzd, null);
    }
}
