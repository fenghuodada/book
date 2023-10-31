package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzaiv implements zzaih {
    private final zzfd zza;
    private final zzabh zzb;
    @Nullable
    private final String zzc;
    private zzabr zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzaiv() {
        this(null);
    }

    public zzaiv(@Nullable String str) {
        this.zzf = 0;
        zzfd zzfdVar = new zzfd(4);
        this.zza = zzfdVar;
        zzfdVar.zzH()[0] = -1;
        this.zzb = new zzabh();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zza(zzfd zzfdVar) {
        zzabh zzabhVar;
        zzdy.zzb(this.zzd);
        while (zzfdVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                byte[] zzH = zzfdVar.zzH();
                int zzd = zzfdVar.zzd();
                for (int zzc = zzfdVar.zzc(); zzc < zzd; zzc++) {
                    byte b = zzH[zzc];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.zzi && (b & 224) == 224;
                    this.zzi = z;
                    if (z2) {
                        zzfdVar.zzF(zzc + 1);
                        this.zzi = false;
                        this.zza.zzH()[1] = zzH[zzc];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                        break;
                    }
                }
                zzfdVar.zzF(zzd);
            } else if (i != 1) {
                int min = Math.min(zzfdVar.zza(), this.zzk - this.zzg);
                this.zzd.zzq(zzfdVar, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 >= i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzs(j, 1, i3, 0, null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int min2 = Math.min(zzfdVar.zza(), 4 - this.zzg);
                zzfdVar.zzB(this.zza.zzH(), this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 >= 4) {
                    this.zza.zzF(0);
                    if (!this.zzb.zza(this.zza.zze())) {
                        this.zzg = 0;
                        this.zzf = 1;
                        break;
                    }
                    this.zzk = this.zzb.zzc;
                    if (!this.zzh) {
                        this.zzj = (zzabhVar.zzg * 1000000) / zzabhVar.zzd;
                        zzak zzakVar = new zzak();
                        zzakVar.zzH(this.zze);
                        zzakVar.zzS(this.zzb.zzb);
                        zzakVar.zzL(4096);
                        zzakVar.zzw(this.zzb.zze);
                        zzakVar.zzT(this.zzb.zzd);
                        zzakVar.zzK(this.zzc);
                        this.zzd.zzk(zzakVar.zzY());
                        this.zzh = true;
                    }
                    this.zza.zzF(0);
                    this.zzd.zzq(this.zza, 4);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        zzajtVar.zzc();
        this.zze = zzajtVar.zzb();
        this.zzd = zzaarVar.zzv(zzajtVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }
}
