package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzbw {
    @Nullable
    public final CharSequence zzc;
    @Nullable
    public final CharSequence zzd;
    @Nullable
    public final CharSequence zze;
    @Nullable
    public final CharSequence zzf;
    @Nullable
    public final CharSequence zzg;
    @Nullable
    public final byte[] zzh;
    @Nullable
    public final Integer zzi;
    @Nullable
    public final Integer zzj;
    @Nullable
    public final Integer zzk;
    @Nullable
    @Deprecated
    public final Integer zzl;
    @Nullable
    public final Boolean zzm;
    @Nullable
    @Deprecated
    public final Integer zzn;
    @Nullable
    public final Integer zzo;
    @Nullable
    public final Integer zzp;
    @Nullable
    public final Integer zzq;
    @Nullable
    public final Integer zzr;
    @Nullable
    public final Integer zzs;
    @Nullable
    public final Integer zzt;
    @Nullable
    public final CharSequence zzu;
    @Nullable
    public final CharSequence zzv;
    @Nullable
    public final CharSequence zzw;
    @Nullable
    public final CharSequence zzx;
    @Nullable
    public final CharSequence zzy;
    @Nullable
    public final Integer zzz;
    public static final zzbw zza = new zzbw(new zzbu());
    private static final String zzA = Integer.toString(0, 36);
    private static final String zzB = Integer.toString(1, 36);
    private static final String zzC = Integer.toString(2, 36);
    private static final String zzD = Integer.toString(3, 36);
    private static final String zzE = Integer.toString(4, 36);
    private static final String zzF = Integer.toString(5, 36);
    private static final String zzG = Integer.toString(6, 36);
    private static final String zzH = Integer.toString(8, 36);
    private static final String zzI = Integer.toString(9, 36);
    private static final String zzJ = Integer.toString(10, 36);
    private static final String zzK = Integer.toString(11, 36);
    private static final String zzL = Integer.toString(12, 36);
    private static final String zzM = Integer.toString(13, 36);
    private static final String zzN = Integer.toString(14, 36);
    private static final String zzO = Integer.toString(15, 36);
    private static final String zzP = Integer.toString(16, 36);
    private static final String zzQ = Integer.toString(17, 36);
    private static final String zzR = Integer.toString(18, 36);
    private static final String zzS = Integer.toString(19, 36);
    private static final String zzT = Integer.toString(20, 36);
    private static final String zzU = Integer.toString(21, 36);
    private static final String zzV = Integer.toString(22, 36);
    private static final String zzW = Integer.toString(23, 36);
    private static final String zzX = Integer.toString(24, 36);
    private static final String zzY = Integer.toString(25, 36);
    private static final String zzZ = Integer.toString(26, 36);
    private static final String zzaa = Integer.toString(27, 36);
    private static final String zzab = Integer.toString(28, 36);
    private static final String zzac = Integer.toString(29, 36);
    private static final String zzad = Integer.toString(30, 36);
    private static final String zzae = Integer.toString(31, 36);
    private static final String zzaf = Integer.toString(32, 36);
    private static final String zzag = Integer.toString(1000, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbs
    };

    private zzbw(zzbu zzbuVar) {
        Boolean bool;
        Integer num;
        Integer num2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        bool = zzbuVar.zzk;
        num = zzbuVar.zzj;
        num2 = zzbuVar.zzw;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    num = Integer.valueOf(i);
                }
                i = 0;
                num = Integer.valueOf(i);
            }
        } else if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        charSequence = zzbuVar.zza;
        this.zzc = charSequence;
        charSequence2 = zzbuVar.zzb;
        this.zzd = charSequence2;
        charSequence3 = zzbuVar.zzc;
        this.zze = charSequence3;
        charSequence4 = zzbuVar.zzd;
        this.zzf = charSequence4;
        charSequence5 = zzbuVar.zze;
        this.zzg = charSequence5;
        bArr = zzbuVar.zzf;
        this.zzh = bArr;
        num3 = zzbuVar.zzg;
        this.zzi = num3;
        num4 = zzbuVar.zzh;
        this.zzj = num4;
        num5 = zzbuVar.zzi;
        this.zzk = num5;
        this.zzl = num;
        this.zzm = bool;
        num6 = zzbuVar.zzl;
        this.zzn = num6;
        num7 = zzbuVar.zzl;
        this.zzo = num7;
        num8 = zzbuVar.zzm;
        this.zzp = num8;
        num9 = zzbuVar.zzn;
        this.zzq = num9;
        num10 = zzbuVar.zzo;
        this.zzr = num10;
        num11 = zzbuVar.zzp;
        this.zzs = num11;
        num12 = zzbuVar.zzq;
        this.zzt = num12;
        charSequence6 = zzbuVar.zzr;
        this.zzu = charSequence6;
        charSequence7 = zzbuVar.zzs;
        this.zzv = charSequence7;
        charSequence8 = zzbuVar.zzt;
        this.zzw = charSequence8;
        charSequence9 = zzbuVar.zzu;
        this.zzx = charSequence9;
        charSequence10 = zzbuVar.zzv;
        this.zzy = charSequence10;
        this.zzz = num2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbw.class == obj.getClass()) {
            zzbw zzbwVar = (zzbw) obj;
            if (zzfn.zzB(this.zzc, zzbwVar.zzc) && zzfn.zzB(this.zzd, zzbwVar.zzd) && zzfn.zzB(this.zze, zzbwVar.zze) && zzfn.zzB(this.zzf, zzbwVar.zzf) && zzfn.zzB(null, null) && zzfn.zzB(null, null) && zzfn.zzB(this.zzg, zzbwVar.zzg) && zzfn.zzB(null, null) && zzfn.zzB(null, null) && Arrays.equals(this.zzh, zzbwVar.zzh) && zzfn.zzB(this.zzi, zzbwVar.zzi) && zzfn.zzB(null, null) && zzfn.zzB(this.zzj, zzbwVar.zzj) && zzfn.zzB(this.zzk, zzbwVar.zzk) && zzfn.zzB(this.zzl, zzbwVar.zzl) && zzfn.zzB(this.zzm, zzbwVar.zzm) && zzfn.zzB(null, null) && zzfn.zzB(this.zzo, zzbwVar.zzo) && zzfn.zzB(this.zzp, zzbwVar.zzp) && zzfn.zzB(this.zzq, zzbwVar.zzq) && zzfn.zzB(this.zzr, zzbwVar.zzr) && zzfn.zzB(this.zzs, zzbwVar.zzs) && zzfn.zzB(this.zzt, zzbwVar.zzt) && zzfn.zzB(this.zzu, zzbwVar.zzu) && zzfn.zzB(this.zzv, zzbwVar.zzv) && zzfn.zzB(this.zzw, zzbwVar.zzw) && zzfn.zzB(null, null) && zzfn.zzB(null, null) && zzfn.zzB(this.zzx, zzbwVar.zzx) && zzfn.zzB(null, null) && zzfn.zzB(this.zzy, zzbwVar.zzy) && zzfn.zzB(this.zzz, zzbwVar.zzz)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, null, null, Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, null, this.zzj, this.zzk, this.zzl, this.zzm, null, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, null, null, this.zzx, null, this.zzy, this.zzz});
    }

    public final zzbu zza() {
        return new zzbu(this, null);
    }
}
