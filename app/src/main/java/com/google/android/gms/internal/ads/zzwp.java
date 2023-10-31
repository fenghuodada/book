package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzwp extends zzwr implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzwp(int i, zzcz zzczVar, int i2, zzwj zzwjVar, int i3, @Nullable String str) {
        super(i, zzczVar, i2);
        int i4;
        int i5 = 0;
        this.zzf = zzwv.zzm(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzwjVar.zzx;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzfrr zzm = zzwjVar.zzv.isEmpty() ? zzfrr.zzm("") : zzwjVar.zzv;
        int i8 = 0;
        while (true) {
            if (i8 >= zzm.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = zzwv.zza(this.zzd, (String) zzm.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i10 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzwv.zza(this.zzd, str, zzwv.zzf(str) == null);
        this.zzl = zza;
        boolean z = i4 > 0 || (zzwjVar.zzv.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzwv.zzm(i3, zzwjVar.zzQ) && z) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzwp zzwpVar) {
        zzfrg zzb = zzfrg.zzj().zzd(this.zzf, zzwpVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzwpVar.zzi), zzfta.zzc().zza()).zzb(this.zzj, zzwpVar.zzj).zzb(this.zzk, zzwpVar.zzk).zzd(this.zzg, zzwpVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzwpVar.zzh), this.zzj == 0 ? zzfta.zzc() : zzfta.zzc().zza()).zzb(this.zzl, zzwpVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final /* bridge */ /* synthetic */ boolean zzc(zzwr zzwrVar) {
        zzwp zzwpVar = (zzwp) zzwrVar;
        return false;
    }
}
