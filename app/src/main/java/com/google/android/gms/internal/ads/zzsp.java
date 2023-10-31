package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzsp implements zzvc {
    public final zzvc zza;
    final /* synthetic */ zzsq zzb;
    private boolean zzc;

    public zzsp(zzsq zzsqVar, zzvc zzvcVar) {
        this.zzb = zzsqVar;
        this.zza = zzvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final int zza(zzkf zzkfVar, zzhi zzhiVar, int i) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhiVar.zzc(4);
            return -4;
        }
        int zza = this.zza.zza(zzkfVar, zzhiVar, i);
        if (zza == -5) {
            zzam zzamVar = zzkfVar.zza;
            zzamVar.getClass();
            int i2 = zzamVar.zzC;
            if (i2 == 0) {
                if (zzamVar.zzD != 0) {
                    i2 = 0;
                }
                return -5;
            }
            int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzamVar.zzD : 0;
            zzak zzb = zzamVar.zzb();
            zzb.zzC(i2);
            zzb.zzD(i3);
            zzkfVar.zza = zzb.zzY();
            return -5;
        }
        zzsq zzsqVar = this.zzb;
        long j = zzsqVar.zzb;
        if (j == Long.MIN_VALUE || ((zza != -4 || zzhiVar.zzd < j) && !(zza == -3 && zzsqVar.zzb() == Long.MIN_VALUE && !zzhiVar.zzc))) {
            return zza;
        }
        zzhiVar.zzb();
        zzhiVar.zzc(4);
        this.zzc = true;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
