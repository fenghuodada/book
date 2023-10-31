package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzki {
    public final zztj zza;
    public final Object zzb;
    public final zzvc[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzkj zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzlf[] zzi;
    private final zzxd zzj;
    private final zzkx zzk;
    @Nullable
    private zzki zzl;
    private zzvk zzm;
    private zzxe zzn;
    private long zzo;

    public zzki(zzlf[] zzlfVarArr, long j, zzxd zzxdVar, zzxm zzxmVar, zzkx zzkxVar, zzkj zzkjVar, zzxe zzxeVar) {
        this.zzi = zzlfVarArr;
        this.zzo = j;
        this.zzj = zzxdVar;
        this.zzk = zzkxVar;
        zztl zztlVar = zzkjVar.zza;
        this.zzb = zztlVar.zza;
        this.zzf = zzkjVar;
        this.zzm = zzvk.zza;
        this.zzn = zzxeVar;
        this.zzc = new zzvc[2];
        this.zzh = new boolean[2];
        long j2 = zzkjVar.zzb;
        long j3 = zzkjVar.zzd;
        zztj zzo = zzkxVar.zzo(zztlVar, zzxmVar, j2);
        this.zza = j3 != -9223372036854775807L ? new zzsq(zzo, true, 0L, j3) : zzo;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzxe zzxeVar = this.zzn;
            if (i >= zzxeVar.zza) {
                return;
            }
            zzxeVar.zzb(i);
            zzwx zzwxVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzxe zzxeVar = this.zzn;
            if (i >= zzxeVar.zza) {
                return;
            }
            zzxeVar.zzb(i);
            zzwx zzwxVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzxe zzxeVar, long j, boolean z) {
        return zzb(zzxeVar, j, false, new boolean[2]);
    }

    public final long zzb(zzxe zzxeVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzxeVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzxeVar.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzlf[] zzlfVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzlfVarArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzxeVar;
        zzt();
        long zzf = this.zza.zzf(zzxeVar.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzlf[] zzlfVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzlfVarArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zzvc[] zzvcVarArr = this.zzc;
            if (i4 >= 2) {
                return zzf;
            }
            if (zzvcVarArr[i4] != null) {
                zzdy.zzf(zzxeVar.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzdy.zzf(zzxeVar.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (this.zzd) {
            long zzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
            return zzb == Long.MIN_VALUE ? this.zzf.zze : zzb;
        }
        return this.zzf.zzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    @Nullable
    public final zzki zzg() {
        return this.zzl;
    }

    public final zzvk zzh() {
        return this.zzm;
    }

    public final zzxe zzi() {
        return this.zzn;
    }

    public final zzxe zzj(float f, zzcx zzcxVar) throws zzia {
        zzwx[] zzwxVarArr;
        zzxe zzn = this.zzj.zzn(this.zzi, this.zzm, this.zzf.zza, zzcxVar);
        for (zzwx zzwxVar : zzn.zzc) {
        }
        return zzn;
    }

    public final void zzk(long j) {
        zzdy.zzf(zzu());
        this.zza.zzo(j - this.zzo);
    }

    public final void zzl(float f, zzcx zzcxVar) throws zzia {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzxe zzj = zzj(f, zzcxVar);
        zzkj zzkjVar = this.zzf;
        long j = zzkjVar.zzb;
        long j2 = zzkjVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zza = zza(zzj, j, false);
        long j3 = this.zzo;
        zzkj zzkjVar2 = this.zzf;
        this.zzo = (zzkjVar2.zzb - zza) + j3;
        this.zzf = zzkjVar2.zzb(zza);
    }

    public final void zzm(long j) {
        zzdy.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzkx zzkxVar = this.zzk;
        zztj zztjVar = this.zza;
        try {
            if (zztjVar instanceof zzsq) {
                zzkxVar.zzh(((zzsq) zztjVar).zza);
            } else {
                zzkxVar.zzh(zztjVar);
            }
        } catch (RuntimeException e) {
            zzer.zzc("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(@Nullable zzki zzkiVar) {
        if (zzkiVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzkiVar;
        zzt();
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zztj zztjVar = this.zza;
        if (zztjVar instanceof zzsq) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzsq) zztjVar).zzn(0L, j);
        }
    }

    public final boolean zzr() {
        if (this.zzd) {
            return !this.zze || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }
}
