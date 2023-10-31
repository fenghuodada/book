package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaje {
    private final zzaih zza;
    private final zzfl zzb;
    private final zzfc zzc = new zzfc(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaje(zzaih zzaihVar, zzfl zzflVar) {
        this.zza = zzaihVar;
        this.zzb = zzflVar;
    }

    public final void zza(zzfd zzfdVar) throws zzce {
        long j;
        char c;
        zzfdVar.zzB(this.zzc.zza, 0, 3);
        this.zzc.zzj(0);
        this.zzc.zzl(8);
        this.zzd = this.zzc.zzn();
        this.zze = this.zzc.zzn();
        this.zzc.zzl(6);
        zzfdVar.zzB(this.zzc.zza, 0, this.zzc.zzd(8));
        this.zzc.zzj(0);
        if (this.zzd) {
            this.zzc.zzl(4);
            long zzd = this.zzc.zzd(3);
            this.zzc.zzl(1);
            int zzd2 = this.zzc.zzd(15) << 15;
            this.zzc.zzl(1);
            long zzd3 = this.zzc.zzd(15);
            this.zzc.zzl(1);
            if (this.zzf || !this.zze) {
                c = 30;
            } else {
                this.zzc.zzl(4);
                this.zzc.zzl(1);
                this.zzc.zzl(1);
                long zzd4 = this.zzc.zzd(15);
                this.zzc.zzl(1);
                this.zzb.zzb((this.zzc.zzd(15) << 15) | (this.zzc.zzd(3) << 30) | zzd4);
                this.zzf = true;
                c = 30;
            }
            j = this.zzb.zzb((zzd << c) | zzd2 | zzd3);
        } else {
            j = 0;
        }
        this.zza.zzd(j, 4);
        this.zza.zza(zzfdVar);
        this.zza.zzc();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
