package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzwr {
    public final int zza;
    public final zzcz zzb;
    public final int zzc;
    public final zzam zzd;

    public zzwr(int i, zzcz zzczVar, int i2) {
        this.zza = i;
        this.zzb = zzczVar;
        this.zzc = i2;
        this.zzd = zzczVar.zzb(i2);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzwr zzwrVar);
}
