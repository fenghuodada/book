package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzhr implements zzle, zzlf {
    private final int zzb;
    @Nullable
    private zzlg zzd;
    private int zze;
    private zzof zzf;
    private int zzg;
    @Nullable
    private zzvc zzh;
    @Nullable
    private zzam[] zzi;
    private long zzj;
    private boolean zzl;
    private boolean zzm;
    private final Object zza = new Object();
    private final zzkf zzc = new zzkf();
    private long zzk = Long.MIN_VALUE;

    public zzhr(int i) {
        this.zzb = i;
    }

    private final void zzR(long j, boolean z) throws zzia {
        this.zzl = false;
        this.zzk = j;
        zzv(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzA() {
        zzdy.zzf(this.zzg == 0);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzB(zzam[] zzamVarArr, zzvc zzvcVar, long j, long j2) throws zzia {
        zzdy.zzf(!this.zzl);
        this.zzh = zzvcVar;
        if (this.zzk == Long.MIN_VALUE) {
            this.zzk = j;
        }
        this.zzi = zzamVarArr;
        this.zzj = j2;
        zzz(zzamVarArr, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzC() {
        zzdy.zzf(this.zzg == 0);
        zzkf zzkfVar = this.zzc;
        zzkfVar.zzb = null;
        zzkfVar.zza = null;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzD(long j) throws zzia {
        zzR(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzE() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public /* synthetic */ void zzF(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzG() throws zzia {
        zzdy.zzf(this.zzg == 1);
        this.zzg = 2;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzH() {
        zzdy.zzf(this.zzg == 2);
        this.zzg = 1;
        zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final boolean zzI() {
        return this.zzk == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final boolean zzJ() {
        return this.zzl;
    }

    public final boolean zzK() {
        if (zzI()) {
            return this.zzl;
        }
        zzvc zzvcVar = this.zzh;
        zzvcVar.getClass();
        return zzvcVar.zze();
    }

    public final zzam[] zzL() {
        zzam[] zzamVarArr = this.zzi;
        zzamVarArr.getClass();
        return zzamVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzle, com.google.android.gms.internal.ads.zzlf
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final int zzbc() {
        return this.zzg;
    }

    public final int zzbd(zzkf zzkfVar, zzhi zzhiVar, int i) {
        zzvc zzvcVar = this.zzh;
        zzvcVar.getClass();
        int zza = zzvcVar.zza(zzkfVar, zzhiVar, i);
        if (zza == -4) {
            if (zzhiVar.zzg()) {
                this.zzk = Long.MIN_VALUE;
                return this.zzl ? -4 : -3;
            }
            long j = zzhiVar.zzd + this.zzj;
            zzhiVar.zzd = j;
            this.zzk = Math.max(this.zzk, j);
        } else if (zza == -5) {
            zzam zzamVar = zzkfVar.zza;
            zzamVar.getClass();
            long j2 = zzamVar.zzq;
            if (j2 != Long.MAX_VALUE) {
                zzak zzb = zzamVar.zzb();
                zzb.zzW(j2 + this.zzj);
                zzkfVar.zza = zzb.zzY();
                return -5;
            }
        }
        return zza;
    }

    public final zzia zzbe(Throwable th, @Nullable zzam zzamVar, boolean z, int i) {
        int i2 = 4;
        if (zzamVar != null && !this.zzm) {
            this.zzm = true;
            try {
                i2 = zzQ(zzamVar) & 7;
            } catch (zzia unused) {
            } catch (Throwable th2) {
                this.zzm = false;
                throw th2;
            }
            this.zzm = false;
        }
        return zzia.zzb(th, zzM(), this.zze, zzamVar, i2, z, i);
    }

    public final int zzd(long j) {
        zzvc zzvcVar = this.zzh;
        zzvcVar.getClass();
        return zzvcVar.zzb(j - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzlf
    public int zze() throws zzia {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final long zzf() {
        return this.zzk;
    }

    public final zzkf zzh() {
        zzkf zzkfVar = this.zzc;
        zzkfVar.zzb = null;
        zzkfVar.zza = null;
        return zzkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    @Nullable
    public zzkh zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final zzlf zzj() {
        return this;
    }

    public final zzlg zzk() {
        zzlg zzlgVar = this.zzd;
        zzlgVar.getClass();
        return zzlgVar;
    }

    public final zzof zzl() {
        zzof zzofVar = this.zzf;
        zzofVar.getClass();
        return zzofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    @Nullable
    public final zzvc zzm() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzlf
    public final void zzn() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzo() {
        zzdy.zzf(this.zzg == 1);
        zzkf zzkfVar = this.zzc;
        zzkfVar.zzb = null;
        zzkfVar.zza = null;
        this.zzg = 0;
        this.zzh = null;
        this.zzi = null;
        this.zzl = false;
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzp(zzlg zzlgVar, zzam[] zzamVarArr, zzvc zzvcVar, long j, boolean z, boolean z2, long j2, long j3) throws zzia {
        zzdy.zzf(this.zzg == 0);
        this.zzd = zzlgVar;
        this.zzg = 1;
        zzu(z, z2);
        zzB(zzamVarArr, zzvcVar, j2, j3);
        zzR(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public void zzq(int i, @Nullable Object obj) throws zzia {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzr(int i, zzof zzofVar) {
        this.zze = i;
        this.zzf = zzofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzs() throws IOException {
        zzvc zzvcVar = this.zzh;
        zzvcVar.getClass();
        zzvcVar.zzd();
    }

    public void zzt() {
        throw null;
    }

    public void zzu(boolean z, boolean z2) throws zzia {
    }

    public void zzv(long j, boolean z) throws zzia {
        throw null;
    }

    public void zzw() {
    }

    public void zzx() throws zzia {
    }

    public void zzy() {
    }

    public void zzz(zzam[] zzamVarArr, long j, long j2) throws zzia {
        throw null;
    }
}
