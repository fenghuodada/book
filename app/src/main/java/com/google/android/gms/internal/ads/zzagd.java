package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzagd {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfd zzf;
    private final zzfd zzg;
    private int zzh;
    private int zzi;

    public zzagd(zzfd zzfdVar, zzfd zzfdVar2, boolean z) throws zzce {
        this.zzg = zzfdVar;
        this.zzf = zzfdVar2;
        this.zze = z;
        zzfdVar2.zzF(12);
        this.zza = zzfdVar2.zzn();
        zzfdVar.zzF(12);
        this.zzi = zzfdVar.zzn();
        zzaas.zzb(zzfdVar.zze() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzt() : this.zzf.zzs();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzn();
            this.zzg.zzG(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzn() : -1;
        }
        return true;
    }
}
