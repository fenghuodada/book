package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzait implements zzaih {
    private zzabr zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzfd zza = new zzfd(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zza(zzfd zzfdVar) {
        zzdy.zzb(this.zzb);
        if (this.zzc) {
            int zza = zzfdVar.zza();
            int i = this.zzf;
            if (i < 10) {
                int min = Math.min(zza, 10 - i);
                System.arraycopy(zzfdVar.zzH(), zzfdVar.zzc(), this.zza.zzH(), this.zzf, min);
                if (this.zzf + min == 10) {
                    this.zza.zzF(0);
                    if (this.zza.zzk() != 73 || this.zza.zzk() != 68 || this.zza.zzk() != 51) {
                        zzer.zze("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    }
                    this.zza.zzG(3);
                    this.zze = this.zza.zzj() + 10;
                }
            }
            int min2 = Math.min(zza, this.zze - this.zzf);
            this.zzb.zzq(zzfdVar, min2);
            this.zzf += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        zzajtVar.zzc();
        zzabr zzv = zzaarVar.zzv(zzajtVar.zza(), 5);
        this.zzb = zzv;
        zzak zzakVar = new zzak();
        zzakVar.zzH(zzajtVar.zzb());
        zzakVar.zzS("application/id3");
        zzv.zzk(zzakVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzc() {
        int i;
        zzdy.zzb(this.zzb);
        if (this.zzc && (i = this.zze) != 0 && this.zzf == i) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                this.zzb.zzs(j, 1, i, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j != -9223372036854775807L) {
            this.zzd = j;
        }
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
