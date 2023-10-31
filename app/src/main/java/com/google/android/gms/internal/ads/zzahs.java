package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzahs {
    private zzabr zzb;
    private zzaar zzc;
    private zzahn zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzahl zza = new zzahl();
    private zzahp zzj = new zzahp();

    public abstract long zza(zzfd zzfdVar);

    public void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzahp();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean zzc(zzfd zzfdVar, long j, zzahp zzahpVar) throws IOException;

    public final int zze(zzaap zzaapVar, zzabk zzabkVar) throws IOException {
        zzdy.zzb(this.zzb);
        int i = zzfn.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzaapVar)) {
                long zzf = zzaapVar.zzf();
                long j = this.zzf;
                this.zzk = zzf - j;
                if (!zzc(this.zza.zza(), j, this.zzj)) {
                    zzam zzamVar = this.zzj.zza;
                    this.zzi = zzamVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzamVar);
                        this.zzm = true;
                    }
                    zzahn zzahnVar = this.zzj.zzb;
                    if (zzahnVar != null) {
                        this.zzd = zzahnVar;
                    } else if (zzaapVar.zzd() == -1) {
                        this.zzd = new zzahr(null);
                    } else {
                        zzahm zzb = this.zza.zzb();
                        this.zzd = new zzahg(this, this.zzf, zzaapVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzaapVar.zzf();
            }
            this.zzh = 3;
            return -1;
        } else if (i2 == 1) {
            ((zzaae) zzaapVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long zzd = this.zzd.zzd(zzaapVar);
            if (zzd >= 0) {
                zzabkVar.zza = zzd;
                return 1;
            }
            if (zzd < -1) {
                zzi(-(zzd + 2));
            }
            if (!this.zzl) {
                zzabn zze = this.zzd.zze();
                zzdy.zzb(zze);
                this.zzc.zzN(zze);
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zze(zzaapVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzfd zza = this.zza.zza();
            long zza2 = zza(zza);
            if (zza2 >= 0) {
                long j2 = this.zzg;
                if (j2 + zza2 >= this.zze) {
                    long zzf2 = zzf(j2);
                    zzabp.zzb(this.zzb, zza, zza.zzd());
                    this.zzb.zzs(zzf2, 1, zza.zzd(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zza2;
            return 0;
        }
    }

    public final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    public final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    public final void zzh(zzaar zzaarVar, zzabr zzabrVar) {
        this.zzc = zzaarVar;
        this.zzb = zzabrVar;
        zzb(true);
    }

    public void zzi(long j) {
        this.zzg = j;
    }

    public final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            long zzg = zzg(j2);
            this.zze = zzg;
            zzahn zzahnVar = this.zzd;
            int i = zzfn.zza;
            zzahnVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
