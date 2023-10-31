package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import com.adcolony.sdk.C2362x3;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzam {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private int zzan;
    @Nullable
    public final String zzb;
    @Nullable
    public final String zzc;
    @Nullable
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    @Nullable
    public final String zzj;
    @Nullable
    public final zzca zzk;
    @Nullable
    public final String zzl;
    @Nullable
    public final String zzm;
    public final int zzn;
    public final List zzo;
    @Nullable
    public final zzad zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    @Nullable
    public final byte[] zzw;
    public final int zzx;
    @Nullable
    public final zzs zzy;
    public final int zzz;
    private static final zzam zzG = new zzam(new zzak());
    private static final String zzH = Integer.toString(0, 36);
    private static final String zzI = Integer.toString(1, 36);
    private static final String zzJ = Integer.toString(2, 36);
    private static final String zzK = Integer.toString(3, 36);
    private static final String zzL = Integer.toString(4, 36);
    private static final String zzM = Integer.toString(5, 36);
    private static final String zzN = Integer.toString(6, 36);
    private static final String zzO = Integer.toString(7, 36);
    private static final String zzP = Integer.toString(8, 36);
    private static final String zzQ = Integer.toString(9, 36);
    private static final String zzR = Integer.toString(10, 36);
    private static final String zzS = Integer.toString(11, 36);
    private static final String zzT = Integer.toString(12, 36);
    private static final String zzU = Integer.toString(13, 36);
    private static final String zzV = Integer.toString(14, 36);
    private static final String zzW = Integer.toString(15, 36);
    private static final String zzX = Integer.toString(16, 36);
    private static final String zzY = Integer.toString(17, 36);
    private static final String zzZ = Integer.toString(18, 36);
    private static final String zzaa = Integer.toString(19, 36);
    private static final String zzab = Integer.toString(20, 36);
    private static final String zzac = Integer.toString(21, 36);
    private static final String zzad = Integer.toString(22, 36);
    private static final String zzae = Integer.toString(23, 36);
    private static final String zzaf = Integer.toString(24, 36);
    private static final String zzag = Integer.toString(25, 36);
    private static final String zzah = Integer.toString(26, 36);
    private static final String zzai = Integer.toString(27, 36);
    private static final String zzaj = Integer.toString(28, 36);
    private static final String zzak = Integer.toString(29, 36);
    private static final String zzal = Integer.toString(30, 36);
    private static final String zzam = Integer.toString(31, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzai
    };

    private zzam(zzak zzakVar) {
        this.zzb = zzak.zzac(zzakVar);
        this.zzc = zzak.zzad(zzakVar);
        this.zzd = zzfn.zzy(zzak.zzae(zzakVar));
        this.zze = zzak.zzo(zzakVar);
        this.zzf = 0;
        int zzd = zzak.zzd(zzakVar);
        this.zzg = zzd;
        int zzl = zzak.zzl(zzakVar);
        this.zzh = zzl;
        this.zzi = zzl != -1 ? zzl : zzd;
        this.zzj = zzak.zzaa(zzakVar);
        this.zzk = zzak.zzZ(zzakVar);
        this.zzl = zzak.zzab(zzakVar);
        this.zzm = zzak.zzaf(zzakVar);
        this.zzn = zzak.zzj(zzakVar);
        this.zzo = zzak.zzag(zzakVar) == null ? Collections.emptyList() : zzak.zzag(zzakVar);
        zzad zzt = zzak.zzt(zzakVar);
        this.zzp = zzt;
        this.zzq = zzak.zzr(zzakVar);
        this.zzr = zzak.zzq(zzakVar);
        this.zzs = zzak.zzi(zzakVar);
        this.zzt = zzak.zza(zzakVar);
        this.zzu = zzak.zzm(zzakVar) == -1 ? 0 : zzak.zzm(zzakVar);
        this.zzv = zzak.zzb(zzakVar) == -1.0f ? 1.0f : zzak.zzb(zzakVar);
        this.zzw = zzak.zzah(zzakVar);
        this.zzx = zzak.zzp(zzakVar);
        this.zzy = zzak.zzs(zzakVar);
        this.zzz = zzak.zze(zzakVar);
        this.zzA = zzak.zzn(zzakVar);
        this.zzB = zzak.zzk(zzakVar);
        this.zzC = zzak.zzg(zzakVar) == -1 ? 0 : zzak.zzg(zzakVar);
        this.zzD = zzak.zzh(zzakVar) != -1 ? zzak.zzh(zzakVar) : 0;
        this.zzE = zzak.zzc(zzakVar);
        this.zzF = (zzak.zzf(zzakVar) != 0 || zzt == null) ? zzak.zzf(zzakVar) : 1;
    }

    public final boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzam.class == obj.getClass()) {
            zzam zzamVar = (zzam) obj;
            int i2 = this.zzan;
            if ((i2 == 0 || (i = zzamVar.zzan) == 0 || i2 == i) && this.zze == zzamVar.zze && this.zzg == zzamVar.zzg && this.zzh == zzamVar.zzh && this.zzn == zzamVar.zzn && this.zzq == zzamVar.zzq && this.zzr == zzamVar.zzr && this.zzs == zzamVar.zzs && this.zzu == zzamVar.zzu && this.zzx == zzamVar.zzx && this.zzz == zzamVar.zzz && this.zzA == zzamVar.zzA && this.zzB == zzamVar.zzB && this.zzC == zzamVar.zzC && this.zzD == zzamVar.zzD && this.zzE == zzamVar.zzE && this.zzF == zzamVar.zzF && Float.compare(this.zzt, zzamVar.zzt) == 0 && Float.compare(this.zzv, zzamVar.zzv) == 0 && zzfn.zzB(this.zzb, zzamVar.zzb) && zzfn.zzB(this.zzc, zzamVar.zzc) && zzfn.zzB(this.zzj, zzamVar.zzj) && zzfn.zzB(this.zzl, zzamVar.zzl) && zzfn.zzB(this.zzm, zzamVar.zzm) && zzfn.zzB(this.zzd, zzamVar.zzd) && Arrays.equals(this.zzw, zzamVar.zzw) && zzfn.zzB(this.zzk, zzamVar.zzk) && zzfn.zzB(this.zzy, zzamVar.zzy) && zzfn.zzB(this.zzp, zzamVar.zzp) && zzd(zzamVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzan;
        if (i == 0) {
            String str = this.zzb;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.zzc;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            int i2 = hashCode + 527;
            String str3 = this.zzd;
            int hashCode3 = (((((((((i2 * 31) + hashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh;
            String str4 = this.zzj;
            int hashCode4 = ((hashCode3 * 31) + (str4 == null ? 0 : str4.hashCode())) * 31;
            zzca zzcaVar = this.zzk;
            int hashCode5 = (hashCode4 + (zzcaVar == null ? 0 : zzcaVar.hashCode())) * 31;
            String str5 = this.zzl;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.zzm;
            int hashCode7 = str6 != null ? str6.hashCode() : 0;
            int floatToIntBits = ((((((((((((((((((((Float.floatToIntBits(this.zzv) + ((((Float.floatToIntBits(this.zzt) + ((((((((((hashCode6 + hashCode7) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31)) * 31) + this.zzu) * 31)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) - 1) * 31) - 1) * 31) + this.zzF;
            this.zzan = floatToIntBits;
            return floatToIntBits;
        }
        return i;
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzl;
        String str4 = this.zzm;
        String str5 = this.zzj;
        int i = this.zzi;
        String str6 = this.zzd;
        int i2 = this.zzr;
        int i3 = this.zzs;
        float f = this.zzt;
        String valueOf = String.valueOf(this.zzy);
        int i4 = this.zzz;
        int i5 = this.zzA;
        StringBuilder m9460b = C2362x3.m9460b("Format(", str, ", ", str2, ", ");
        m9460b.append(str3);
        m9460b.append(", ");
        m9460b.append(str4);
        m9460b.append(", ");
        m9460b.append(str5);
        m9460b.append(", ");
        m9460b.append(i);
        m9460b.append(", ");
        m9460b.append(str6);
        m9460b.append(", [");
        m9460b.append(i2);
        m9460b.append(", ");
        m9460b.append(i3);
        m9460b.append(", ");
        m9460b.append(f);
        m9460b.append(", ");
        m9460b.append(valueOf);
        m9460b.append("], [");
        m9460b.append(i4);
        m9460b.append(", ");
        return C0539e.m12264b(m9460b, i5, "])");
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzak zzb() {
        return new zzak(this, null);
    }

    public final zzam zzc(int i) {
        zzak zzakVar = new zzak(this, null);
        zzakVar.zzA(i);
        return new zzam(zzakVar);
    }

    public final boolean zzd(zzam zzamVar) {
        if (this.zzo.size() == zzamVar.zzo.size()) {
            for (int i = 0; i < this.zzo.size(); i++) {
                if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzamVar.zzo.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
