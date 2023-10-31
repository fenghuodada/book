package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzbu {
    @Nullable
    private CharSequence zza;
    @Nullable
    private CharSequence zzb;
    @Nullable
    private CharSequence zzc;
    @Nullable
    private CharSequence zzd;
    @Nullable
    private CharSequence zze;
    @Nullable
    private byte[] zzf;
    @Nullable
    private Integer zzg;
    @Nullable
    private Integer zzh;
    @Nullable
    private Integer zzi;
    @Nullable
    private Integer zzj;
    @Nullable
    private Boolean zzk;
    @Nullable
    private Integer zzl;
    @Nullable
    private Integer zzm;
    @Nullable
    private Integer zzn;
    @Nullable
    private Integer zzo;
    @Nullable
    private Integer zzp;
    @Nullable
    private Integer zzq;
    @Nullable
    private CharSequence zzr;
    @Nullable
    private CharSequence zzs;
    @Nullable
    private CharSequence zzt;
    @Nullable
    private CharSequence zzu;
    @Nullable
    private CharSequence zzv;
    @Nullable
    private Integer zzw;

    public zzbu() {
    }

    public /* synthetic */ zzbu(zzbw zzbwVar, zzbt zzbtVar) {
        this.zza = zzbwVar.zzc;
        this.zzb = zzbwVar.zzd;
        this.zzc = zzbwVar.zze;
        this.zzd = zzbwVar.zzf;
        this.zze = zzbwVar.zzg;
        this.zzf = zzbwVar.zzh;
        this.zzg = zzbwVar.zzi;
        this.zzh = zzbwVar.zzj;
        this.zzi = zzbwVar.zzk;
        this.zzj = zzbwVar.zzl;
        this.zzk = zzbwVar.zzm;
        this.zzl = zzbwVar.zzo;
        this.zzm = zzbwVar.zzp;
        this.zzn = zzbwVar.zzq;
        this.zzo = zzbwVar.zzr;
        this.zzp = zzbwVar.zzs;
        this.zzq = zzbwVar.zzt;
        this.zzr = zzbwVar.zzu;
        this.zzs = zzbwVar.zzv;
        this.zzt = zzbwVar.zzw;
        this.zzu = zzbwVar.zzx;
        this.zzv = zzbwVar.zzy;
        this.zzw = zzbwVar.zzz;
    }

    public final zzbu zza(byte[] bArr, int i) {
        if (this.zzf == null || zzfn.zzB(Integer.valueOf(i), 3) || !zzfn.zzB(this.zzg, 3)) {
            this.zzf = (byte[]) bArr.clone();
            this.zzg = Integer.valueOf(i);
        }
        return this;
    }

    public final zzbu zzb(@Nullable zzbw zzbwVar) {
        if (zzbwVar == null) {
            return this;
        }
        CharSequence charSequence = zzbwVar.zzc;
        if (charSequence != null) {
            this.zza = charSequence;
        }
        CharSequence charSequence2 = zzbwVar.zzd;
        if (charSequence2 != null) {
            this.zzb = charSequence2;
        }
        CharSequence charSequence3 = zzbwVar.zze;
        if (charSequence3 != null) {
            this.zzc = charSequence3;
        }
        CharSequence charSequence4 = zzbwVar.zzf;
        if (charSequence4 != null) {
            this.zzd = charSequence4;
        }
        CharSequence charSequence5 = zzbwVar.zzg;
        if (charSequence5 != null) {
            this.zze = charSequence5;
        }
        byte[] bArr = zzbwVar.zzh;
        if (bArr != null) {
            Integer num = zzbwVar.zzi;
            this.zzf = (byte[]) bArr.clone();
            this.zzg = num;
        }
        Integer num2 = zzbwVar.zzj;
        if (num2 != null) {
            this.zzh = num2;
        }
        Integer num3 = zzbwVar.zzk;
        if (num3 != null) {
            this.zzi = num3;
        }
        Integer num4 = zzbwVar.zzl;
        if (num4 != null) {
            this.zzj = num4;
        }
        Boolean bool = zzbwVar.zzm;
        if (bool != null) {
            this.zzk = bool;
        }
        Integer num5 = zzbwVar.zzn;
        if (num5 != null) {
            this.zzl = num5;
        }
        Integer num6 = zzbwVar.zzo;
        if (num6 != null) {
            this.zzl = num6;
        }
        Integer num7 = zzbwVar.zzp;
        if (num7 != null) {
            this.zzm = num7;
        }
        Integer num8 = zzbwVar.zzq;
        if (num8 != null) {
            this.zzn = num8;
        }
        Integer num9 = zzbwVar.zzr;
        if (num9 != null) {
            this.zzo = num9;
        }
        Integer num10 = zzbwVar.zzs;
        if (num10 != null) {
            this.zzp = num10;
        }
        Integer num11 = zzbwVar.zzt;
        if (num11 != null) {
            this.zzq = num11;
        }
        CharSequence charSequence6 = zzbwVar.zzu;
        if (charSequence6 != null) {
            this.zzr = charSequence6;
        }
        CharSequence charSequence7 = zzbwVar.zzv;
        if (charSequence7 != null) {
            this.zzs = charSequence7;
        }
        CharSequence charSequence8 = zzbwVar.zzw;
        if (charSequence8 != null) {
            this.zzt = charSequence8;
        }
        CharSequence charSequence9 = zzbwVar.zzx;
        if (charSequence9 != null) {
            this.zzu = charSequence9;
        }
        CharSequence charSequence10 = zzbwVar.zzy;
        if (charSequence10 != null) {
            this.zzv = charSequence10;
        }
        Integer num12 = zzbwVar.zzz;
        if (num12 != null) {
            this.zzw = num12;
        }
        return this;
    }

    public final zzbu zzc(@Nullable CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzbu zzd(@Nullable CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzbu zze(@Nullable CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzbu zzf(@Nullable CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzbu zzg(@Nullable CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzbu zzh(@Nullable CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzbu zzi(@Nullable CharSequence charSequence) {
        this.zzu = charSequence;
        return this;
    }

    public final zzbu zzj(@IntRange(from = 1, m13044to = 31) @Nullable Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzbu zzk(@IntRange(from = 1, m13044to = 12) @Nullable Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzbu zzl(@Nullable Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzbu zzm(@IntRange(from = 1, m13044to = 31) @Nullable Integer num) {
        this.zzq = num;
        return this;
    }

    public final zzbu zzn(@IntRange(from = 1, m13044to = 12) @Nullable Integer num) {
        this.zzp = num;
        return this;
    }

    public final zzbu zzo(@Nullable Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzbu zzp(@Nullable CharSequence charSequence) {
        this.zzv = charSequence;
        return this;
    }

    public final zzbu zzq(@Nullable CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzbu zzr(@Nullable Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzbu zzs(@Nullable Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzbu zzt(@Nullable CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzbw zzu() {
        return new zzbw(this);
    }
}
