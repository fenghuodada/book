package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class zzde {
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzJ;
    private static final String zzK;
    private static final String zzL;
    private static final String zzM;
    private static final String zzN;
    private static final String zzO;
    private static final String zzP;
    private static final String zzQ;
    private static final String zzR;
    private static final String zzS;
    private static final String zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    public static final zzde zza;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    @Deprecated
    public static final zzde zzb;
    @Deprecated
    public static final zzn zzc;
    public final boolean zzA;
    public final zzfru zzB;
    public final zzfrw zzC;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfrr zzo;
    public final int zzp;
    public final zzfrr zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzfrr zzu;
    public final zzfrr zzv;
    public final int zzw;
    public final int zzx;
    public final boolean zzy;
    public final boolean zzz;

    static {
        zzde zzdeVar = new zzde(new zzdd());
        zza = zzdeVar;
        zzb = zzdeVar;
        zzD = Integer.toString(1, 36);
        zzE = Integer.toString(2, 36);
        zzF = Integer.toString(3, 36);
        zzG = Integer.toString(4, 36);
        zzH = Integer.toString(5, 36);
        zzI = Integer.toString(6, 36);
        zzJ = Integer.toString(7, 36);
        zzK = Integer.toString(8, 36);
        zzL = Integer.toString(9, 36);
        zzM = Integer.toString(10, 36);
        zzN = Integer.toString(11, 36);
        zzO = Integer.toString(12, 36);
        zzP = Integer.toString(13, 36);
        zzQ = Integer.toString(14, 36);
        zzR = Integer.toString(15, 36);
        zzS = Integer.toString(16, 36);
        zzT = Integer.toString(17, 36);
        zzU = Integer.toString(18, 36);
        zzV = Integer.toString(19, 36);
        zzW = Integer.toString(20, 36);
        zzX = Integer.toString(21, 36);
        zzY = Integer.toString(22, 36);
        zzZ = Integer.toString(23, 36);
        zzaa = Integer.toString(24, 36);
        zzab = Integer.toString(25, 36);
        zzac = Integer.toString(26, 36);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzdc
        };
    }

    public zzde(zzdd zzddVar) {
        int i;
        int i2;
        boolean z;
        zzfrr zzfrrVar;
        zzfrr zzfrrVar2;
        zzfrr zzfrrVar3;
        zzfrr zzfrrVar4;
        int i3;
        HashMap hashMap;
        HashSet hashSet;
        i = zzddVar.zze;
        this.zzl = i;
        i2 = zzddVar.zzf;
        this.zzm = i2;
        z = zzddVar.zzg;
        this.zzn = z;
        zzfrrVar = zzddVar.zzh;
        this.zzo = zzfrrVar;
        this.zzp = 0;
        zzfrrVar2 = zzddVar.zzi;
        this.zzq = zzfrrVar2;
        this.zzr = 0;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        zzfrrVar3 = zzddVar.zzl;
        this.zzu = zzfrrVar3;
        zzfrrVar4 = zzddVar.zzm;
        this.zzv = zzfrrVar4;
        i3 = zzddVar.zzn;
        this.zzw = i3;
        this.zzx = 0;
        this.zzy = false;
        this.zzz = false;
        this.zzA = false;
        hashMap = zzddVar.zzo;
        this.zzB = zzfru.zzc(hashMap);
        hashSet = zzddVar.zzp;
        this.zzC = zzfrw.zzl(hashSet);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzde zzdeVar = (zzde) obj;
            if (this.zzn == zzdeVar.zzn && this.zzl == zzdeVar.zzl && this.zzm == zzdeVar.zzm && this.zzo.equals(zzdeVar.zzo) && this.zzq.equals(zzdeVar.zzq) && this.zzu.equals(zzdeVar.zzu) && this.zzv.equals(zzdeVar.zzv) && this.zzw == zzdeVar.zzw && this.zzB.equals(zzdeVar.zzB) && this.zzC.equals(zzdeVar.zzC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.zzn ? 1 : 0) - 1048002209) * 31) + this.zzl) * 31) + this.zzm) * 31) + this.zzo.hashCode()) * 961) + this.zzq.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.zzu.hashCode()) * 31) + this.zzv.hashCode()) * 31) + this.zzw) * 28629151) + this.zzB.hashCode()) * 31) + this.zzC.hashCode();
    }
}
