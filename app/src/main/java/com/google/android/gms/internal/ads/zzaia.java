package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzaia implements zzaih {
    private final zzfc zza;
    private final zzfd zzb;
    @Nullable
    private final String zzc;
    private String zzd;
    private zzabr zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzam zzj;
    private int zzk;
    private long zzl;

    public zzaia() {
        this(null);
    }

    public zzaia(@Nullable String str) {
        zzfc zzfcVar = new zzfc(new byte[16], 16);
        this.zza = zzfcVar;
        this.zzb = new zzfd(zzfcVar.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zza(zzfd zzfdVar) {
        zzdy.zzb(this.zze);
        while (zzfdVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (zzfdVar.zza() > 0) {
                    if (this.zzh) {
                        int zzk = zzfdVar.zzk();
                        this.zzh = zzk == 172;
                        if (zzk != 64) {
                            if (zzk == 65) {
                                zzk = 65;
                            }
                        }
                        this.zzf = 1;
                        zzfd zzfdVar2 = this.zzb;
                        zzfdVar2.zzH()[0] = -84;
                        zzfdVar2.zzH()[1] = zzk == 65 ? (byte) 65 : (byte) 64;
                        this.zzg = 2;
                    } else {
                        this.zzh = zzfdVar.zzk() == 172;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzfdVar.zza(), this.zzk - this.zzg);
                this.zze.zzq(zzfdVar, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 == i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zze.zzs(j, 1, i3, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] zzH = this.zzb.zzH();
                int min2 = Math.min(zzfdVar.zza(), 16 - this.zzg);
                zzfdVar.zzB(zzH, this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 == 16) {
                    this.zza.zzj(0);
                    zzzr zza = zzzs.zza(this.zza);
                    zzam zzamVar = this.zzj;
                    if (zzamVar == null || zzamVar.zzz != 2 || zza.zza != zzamVar.zzA || !"audio/ac4".equals(zzamVar.zzm)) {
                        zzak zzakVar = new zzak();
                        zzakVar.zzH(this.zzd);
                        zzakVar.zzS("audio/ac4");
                        zzakVar.zzw(2);
                        zzakVar.zzT(zza.zza);
                        zzakVar.zzK(this.zzc);
                        zzam zzY = zzakVar.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zza.zzb;
                    this.zzi = (zza.zzc * 1000000) / this.zzj.zzA;
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 16);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        zzajtVar.zzc();
        this.zzd = zzajtVar.zzb();
        this.zze = zzaarVar.zzv(zzajtVar.zza(), 1);
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
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }
}
