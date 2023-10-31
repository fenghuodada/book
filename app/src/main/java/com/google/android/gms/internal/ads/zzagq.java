package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzagq {
    public final zzabr zza;
    public zzahd zzd;
    public zzagm zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzahc zzb = new zzahc();
    public final zzfd zzc = new zzfd();
    private final zzfd zzj = new zzfd(1);
    private final zzfd zzk = new zzfd();

    public zzagq(zzabr zzabrVar, zzahd zzahdVar, zzagm zzagmVar) {
        this.zza = zzabrVar;
        this.zzd = zzahdVar;
        this.zze = zzagmVar;
        zzh(zzahdVar, zzagmVar);
    }

    public final int zza() {
        int i = !this.zzl ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzfd zzfdVar;
        zzahb zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i3 = zzf.zzd;
        if (i3 != 0) {
            zzfdVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i4 = zzfn.zza;
            zzfd zzfdVar2 = this.zzk;
            int length = bArr.length;
            zzfdVar2.zzD(bArr, length);
            zzfdVar = this.zzk;
            i3 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z = zzb || i2 != 0;
        zzfd zzfdVar3 = this.zzj;
        zzfdVar3.zzH()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzfdVar3.zzF(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzfdVar, i3, 1);
        if (z) {
            if (!zzb) {
                this.zzc.zzC(8);
                zzfd zzfdVar4 = this.zzc;
                byte[] zzH = zzfdVar4.zzH();
                zzH[0] = 0;
                zzH[1] = 1;
                zzH[2] = 0;
                zzH[3] = (byte) i2;
                zzH[4] = (byte) ((i >> 24) & 255);
                zzH[5] = (byte) ((i >> 16) & 255);
                zzH[6] = (byte) ((i >> 8) & 255);
                zzH[7] = (byte) (i & 255);
                this.zza.zzr(zzfdVar4, 8, 1);
                return i3 + 9;
            }
            zzfd zzfdVar5 = this.zzb.zzn;
            int zzo = zzfdVar5.zzo();
            zzfdVar5.zzG(-2);
            int i5 = (zzo * 6) + 2;
            if (i2 != 0) {
                this.zzc.zzC(i5);
                byte[] zzH2 = this.zzc.zzH();
                zzfdVar5.zzB(zzH2, 0, i5);
                int i6 = (((zzH2[2] & 255) << 8) | (zzH2[3] & 255)) + i2;
                zzH2[2] = (byte) ((i6 >> 8) & 255);
                zzH2[3] = (byte) (i6 & 255);
                zzfdVar5 = this.zzc;
            }
            this.zza.zzr(zzfdVar5, i5, 1);
            return i3 + 1 + i5;
        }
        return i3 + 1;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (this.zzl) {
            zzahc zzahcVar = this.zzb;
            return zzahcVar.zzi[this.zzf];
        }
        return this.zzd.zzf[this.zzf];
    }

    @Nullable
    public final zzahb zzf() {
        if (this.zzl) {
            zzahc zzahcVar = this.zzb;
            zzagm zzagmVar = zzahcVar.zza;
            int i = zzfn.zza;
            int i2 = zzagmVar.zza;
            zzahb zzahbVar = zzahcVar.zzm;
            if (zzahbVar == null) {
                zzahbVar = this.zzd.zza.zza(i2);
            }
            if (zzahbVar == null || !zzahbVar.zza) {
                return null;
            }
            return zzahbVar;
        }
        return null;
    }

    public final void zzh(zzahd zzahdVar, zzagm zzagmVar) {
        this.zzd = zzahdVar;
        this.zze = zzagmVar;
        this.zza.zzk(zzahdVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzahc zzahcVar = this.zzb;
        zzahcVar.zzd = 0;
        zzahcVar.zzp = 0L;
        zzahcVar.zzq = false;
        zzahcVar.zzk = false;
        zzahcVar.zzo = false;
        zzahcVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (this.zzl) {
            int i = this.zzg + 1;
            this.zzg = i;
            int[] iArr = this.zzb.zzg;
            int i2 = this.zzh;
            if (i == iArr[i2]) {
                this.zzh = i2 + 1;
                this.zzg = 0;
                return false;
            }
            return true;
        }
        return false;
    }
}
