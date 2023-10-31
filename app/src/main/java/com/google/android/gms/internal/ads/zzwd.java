package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzwd extends zzwr implements Comparable {
    private final int zze;
    private final boolean zzf;
    @Nullable
    private final String zzg;
    private final zzwj zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzwd(int i, zzcz zzczVar, int i2, zzwj zzwjVar, int i3, boolean z, zzfpa zzfpaVar) {
        super(i, zzczVar, i2);
        int i4;
        int i5;
        String[] strArr;
        int i6;
        boolean z2;
        LocaleList locales;
        String languageTags;
        this.zzh = zzwjVar;
        this.zzg = zzwv.zzf(this.zzd.zzd);
        int i7 = 0;
        this.zzi = zzwv.zzm(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= zzwjVar.zzq.size()) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            i5 = zzwv.zza(this.zzd, (String) zzwjVar.zzq.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.zzk = i8;
        this.zzj = i5;
        int i9 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzam zzamVar = this.zzd;
        int i10 = zzamVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzamVar.zze & 1);
        this.zzq = zzamVar.zzz;
        this.zzr = zzamVar.zzA;
        this.zzs = zzamVar.zzi;
        this.zzf = zzfpaVar.zza(zzamVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (zzfn.zza >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            strArr = new String[]{zzfn.zzw(configuration.locale)};
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = zzfn.zzy(strArr[i11]);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= strArr.length) {
                i6 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            }
            i6 = zzwv.zza(this.zzd, strArr[i12], false);
            if (i6 > 0) {
                break;
            }
            i12++;
        }
        this.zzn = i12;
        this.zzo = i6;
        int i13 = 0;
        while (true) {
            if (i13 >= zzwjVar.zzu.size()) {
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzwjVar.zzu.get(i13))) {
                i4 = i13;
                break;
            }
            i13++;
        }
        this.zzt = i4;
        this.zzu = (i3 & 384) == 128;
        this.zzv = (i3 & 64) == 64;
        zzwj zzwjVar2 = this.zzh;
        if (zzwv.zzm(i3, zzwjVar2.zzQ) && ((z2 = this.zzf) || zzwjVar2.zzK)) {
            i7 = (!zzwv.zzm(i3, false) || !z2 || this.zzd.zzi == -1 || (!zzwjVar2.zzS && z)) ? 1 : 2;
        }
        this.zze = i7;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzwd zzwdVar) {
        zzfta zzftaVar;
        zzfta zza;
        zzfta zzftaVar2;
        if (this.zzf && this.zzi) {
            zza = zzwv.zzc;
        } else {
            zzftaVar = zzwv.zzc;
            zza = zzftaVar.zza();
        }
        zzfrg zzc = zzfrg.zzj().zzd(this.zzi, zzwdVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzwdVar.zzk), zzfta.zzc().zza()).zzb(this.zzj, zzwdVar.zzj).zzb(this.zzl, zzwdVar.zzl).zzd(this.zzp, zzwdVar.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzwdVar.zzn), zzfta.zzc().zza()).zzb(this.zzo, zzwdVar.zzo).zzd(this.zzf, zzwdVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzwdVar.zzt), zzfta.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzwdVar.zzs);
        boolean z = this.zzh.zzz;
        zzftaVar2 = zzwv.zzd;
        zzfrg zzc2 = zzc.zzc(valueOf, valueOf2, zzftaVar2).zzd(this.zzu, zzwdVar.zzu).zzd(this.zzv, zzwdVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzwdVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzwdVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzwdVar.zzs);
        if (!zzfn.zzB(this.zzg, zzwdVar.zzg)) {
            zza = zzwv.zzd;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final /* bridge */ /* synthetic */ boolean zzc(zzwr zzwrVar) {
        String str;
        zzwd zzwdVar = (zzwd) zzwrVar;
        boolean z = this.zzh.zzN;
        zzam zzamVar = this.zzd;
        int i = zzamVar.zzz;
        if (i != -1) {
            zzam zzamVar2 = zzwdVar.zzd;
            if (i == zzamVar2.zzz && (str = zzamVar.zzm) != null && TextUtils.equals(str, zzamVar2.zzm)) {
                boolean z2 = this.zzh.zzM;
                int i2 = this.zzd.zzA;
                return i2 != -1 && i2 == zzwdVar.zzd.zzA && this.zzu == zzwdVar.zzu && this.zzv == zzwdVar.zzv;
            }
            return false;
        }
        return false;
    }
}
