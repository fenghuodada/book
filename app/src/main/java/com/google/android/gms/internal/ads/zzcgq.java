package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcgq {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgq(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcgq zza() {
        return new zzcgq(0, 0, 0);
    }

    public static zzcgq zzb(int i, int i2) {
        return new zzcgq(1, i, i2);
    }

    public static zzcgq zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzqVar.zzd ? new zzcgq(3, 0, 0) : zzqVar.zzi ? new zzcgq(2, 0, 0) : zzqVar.zzh ? zza() : zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzcgq zzd() {
        return new zzcgq(5, 0, 0);
    }

    public static zzcgq zze() {
        return new zzcgq(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
