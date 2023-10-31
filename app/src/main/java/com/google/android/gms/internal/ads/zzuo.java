package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzuo implements zztj, zzaar, zzxr, zzxw, zzva {
    private static final Map zzb;
    private static final zzam zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzxq zzM;
    private final zzxm zzN;
    private final Uri zzd;
    private final zzfx zze;
    private final zzqr zzf;
    private final zztu zzg;
    private final zzql zzh;
    private final zzuk zzi;
    private final long zzj;
    private final zzue zzl;
    @Nullable
    private zzti zzq;
    @Nullable
    private zzado zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zzun zzx;
    private zzabn zzy;
    private final zzxz zzk = new zzxz("ProgressiveMediaPeriod");
    private final zzeb zzm = new zzeb(zzdz.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzuf
        @Override // java.lang.Runnable
        public final void run() {
            zzuo.this.zzT();
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzug
        @Override // java.lang.Runnable
        public final void run() {
            zzuo.this.zzD();
        }
    };
    private final Handler zzp = zzfn.zzs(null);
    private zzum[] zzt = new zzum[0];
    private zzvb[] zzs = new zzvb[0];
    private long zzH = -9223372036854775807L;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzak zzakVar = new zzak();
        zzakVar.zzH("icy");
        zzakVar.zzS("application/x-icy");
        zzc = zzakVar.zzY();
    }

    public zzuo(Uri uri, zzfx zzfxVar, zzue zzueVar, zzqr zzqrVar, zzql zzqlVar, zzxq zzxqVar, zztu zztuVar, zzuk zzukVar, zzxm zzxmVar, @Nullable String str, int i) {
        this.zzd = uri;
        this.zze = zzfxVar;
        this.zzf = zzqrVar;
        this.zzh = zzqlVar;
        this.zzM = zzxqVar;
        this.zzg = zztuVar;
        this.zzi = zzukVar;
        this.zzN = zzxmVar;
        this.zzj = i;
        this.zzl = zzueVar;
    }

    private final int zzP() {
        int i = 0;
        for (zzvb zzvbVar : this.zzs) {
            i += zzvbVar.zzc();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzQ(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzvb[] zzvbVarArr = this.zzs;
            if (i >= zzvbVarArr.length) {
                return j;
            }
            if (!z) {
                zzun zzunVar = this.zzx;
                zzunVar.getClass();
                i = zzunVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zzvbVarArr[i].zzg());
        }
    }

    private final zzabr zzR(zzum zzumVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zzumVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzvb zzvbVar = new zzvb(this.zzN, this.zzf, this.zzh);
        zzvbVar.zzu(this);
        int i2 = length + 1;
        zzum[] zzumVarArr = (zzum[]) Arrays.copyOf(this.zzt, i2);
        zzumVarArr[length] = zzumVar;
        int i3 = zzfn.zza;
        this.zzt = zzumVarArr;
        zzvb[] zzvbVarArr = (zzvb[]) Arrays.copyOf(this.zzs, i2);
        zzvbVarArr[length] = zzvbVar;
        this.zzs = zzvbVarArr;
        return zzvbVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzS() {
        zzdy.zzf(this.zzv);
        this.zzx.getClass();
        this.zzy.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        int i;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zzvb zzvbVar : this.zzs) {
            if (zzvbVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzcz[] zzczVarArr = new zzcz[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzam zzh = this.zzs[i2].zzh();
            zzh.getClass();
            String str = zzh.zzm;
            boolean zzf = zzcd.zzf(str);
            boolean z = zzf || zzcd.zzg(str);
            zArr[i2] = z;
            this.zzw = z | this.zzw;
            zzado zzadoVar = this.zzr;
            if (zzadoVar != null) {
                if (zzf || this.zzt[i2].zzb) {
                    zzca zzcaVar = zzh.zzk;
                    zzca zzcaVar2 = zzcaVar == null ? new zzca(-9223372036854775807L, zzadoVar) : zzcaVar.zzc(zzadoVar);
                    zzak zzb2 = zzh.zzb();
                    zzb2.zzM(zzcaVar2);
                    zzh = zzb2.zzY();
                }
                if (zzf && zzh.zzg == -1 && zzh.zzh == -1 && (i = zzadoVar.zza) != -1) {
                    zzak zzb3 = zzh.zzb();
                    zzb3.zzv(i);
                    zzh = zzb3.zzY();
                }
            }
            zzczVarArr[i2] = new zzcz(Integer.toString(i2), zzh.zzc(this.zzf.zza(zzh)));
        }
        this.zzx = new zzun(new zzvk(zzczVarArr), zArr);
        this.zzv = true;
        zzti zztiVar = this.zzq;
        zztiVar.getClass();
        zztiVar.zzi(this);
    }

    private final void zzU(int i) {
        zzS();
        zzun zzunVar = this.zzx;
        boolean[] zArr = zzunVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzam zzb2 = zzunVar.zza.zzb(i).zzb(0);
        this.zzg.zzc(new zzth(1, zzcd.zzb(zzb2.zzm), zzb2, 0, null, zzfn.zzq(this.zzG), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzV(int i) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzvb zzvbVar : this.zzs) {
                zzvbVar.zzp(false);
            }
            zzti zztiVar = this.zzq;
            zztiVar.getClass();
            zztiVar.zzg(this);
        }
    }

    private final void zzW() {
        zzuj zzujVar = new zzuj(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzdy.zzf(zzX());
            long j = this.zzz;
            if (j != -9223372036854775807L && this.zzH > j) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzabn zzabnVar = this.zzy;
            zzabnVar.getClass();
            zzuj.zzf(zzujVar, zzabnVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zzvb zzvbVar : this.zzs) {
                zzvbVar.zzt(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzP();
        long zza = this.zzk.zza(zzujVar, this, zzxq.zza(this.zzB));
        zzgc zzd = zzuj.zzd(zzujVar);
        this.zzg.zzg(new zztc(zzuj.zzb(zzujVar), zzd, zzd.zza, Collections.emptyMap(), zza, 0L, 0L), new zzth(1, -1, null, 0, null, zzfn.zzq(zzuj.zzc(zzujVar)), zzfn.zzq(this.zzz)));
    }

    private final boolean zzX() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzY() {
        return this.zzD || zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    public final /* synthetic */ void zzD() {
        if (this.zzL) {
            return;
        }
        zzti zztiVar = this.zzq;
        zztiVar.getClass();
        zztiVar.zzg(this);
    }

    public final /* synthetic */ void zzE() {
        this.zzF = true;
    }

    public final /* synthetic */ void zzF(zzabn zzabnVar) {
        this.zzy = this.zzr == null ? zzabnVar : new zzabm(-9223372036854775807L, 0L);
        this.zzz = zzabnVar.zze();
        boolean z = false;
        if (!this.zzF && zzabnVar.zze() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zza(this.zzz, zzabnVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzT();
    }

    public final void zzG() throws IOException {
        this.zzk.zzi(zzxq.zza(this.zzB));
    }

    public final void zzH(int i) throws IOException {
        this.zzs[i].zzm();
        zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final /* bridge */ /* synthetic */ void zzI(zzxv zzxvVar, long j, long j2, boolean z) {
        zzuj zzujVar = (zzuj) zzxvVar;
        zzgy zze = zzuj.zze(zzujVar);
        zztc zztcVar = new zztc(zzuj.zzb(zzujVar), zzuj.zzd(zzujVar), zze.zzh(), zze.zzi(), j, j2, zze.zzg());
        zzuj.zzb(zzujVar);
        this.zzg.zzd(zztcVar, new zzth(1, -1, null, 0, null, zzfn.zzq(zzuj.zzc(zzujVar)), zzfn.zzq(this.zzz)));
        if (z) {
            return;
        }
        for (zzvb zzvbVar : this.zzs) {
            zzvbVar.zzp(false);
        }
        if (this.zzE > 0) {
            zzti zztiVar = this.zzq;
            zztiVar.getClass();
            zztiVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final /* bridge */ /* synthetic */ void zzJ(zzxv zzxvVar, long j, long j2) {
        zzabn zzabnVar;
        if (this.zzz == -9223372036854775807L && (zzabnVar = this.zzy) != null) {
            boolean zzh = zzabnVar.zzh();
            long zzQ = zzQ(true);
            long j3 = zzQ == Long.MIN_VALUE ? 0L : zzQ + 10000;
            this.zzz = j3;
            this.zzi.zza(j3, zzh, this.zzA);
        }
        zzuj zzujVar = (zzuj) zzxvVar;
        zzgy zze = zzuj.zze(zzujVar);
        zztc zztcVar = new zztc(zzuj.zzb(zzujVar), zzuj.zzd(zzujVar), zze.zzh(), zze.zzi(), j, j2, zze.zzg());
        zzuj.zzb(zzujVar);
        this.zzg.zze(zztcVar, new zzth(1, -1, null, 0, null, zzfn.zzq(zzuj.zzc(zzujVar)), zzfn.zzq(this.zzz)));
        this.zzK = true;
        zzti zztiVar = this.zzq;
        zztiVar.getClass();
        zztiVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzK() {
        for (zzvb zzvbVar : this.zzs) {
            zzvbVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzL(zzam zzamVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if (this.zzv) {
            for (zzvb zzvbVar : this.zzs) {
                zzvbVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void zzN(final zzabn zzabnVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzui
            @Override // java.lang.Runnable
            public final void run() {
                zzuo.this.zzF(zzabnVar);
            }
        });
    }

    public final boolean zzO(int i) {
        return !zzY() && this.zzs[i].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zza(long j, zzlh zzlhVar) {
        zzS();
        if (this.zzy.zzh()) {
            zzabl zzg = this.zzy.zzg(j);
            long j2 = zzg.zza.zzb;
            long j3 = zzg.zzb.zzb;
            long j4 = zzlhVar.zzf;
            if (j4 == 0) {
                if (zzlhVar.zzg == 0) {
                    return j;
                }
                j4 = 0;
            }
            int i = zzfn.zza;
            long j5 = j - j4;
            long j6 = zzlhVar.zzg;
            long j7 = j + j6;
            long j8 = j ^ j7;
            long j9 = j6 ^ j7;
            if (((j4 ^ j) & (j ^ j5)) < 0) {
                j5 = Long.MIN_VALUE;
            }
            if ((j8 & j9) < 0) {
                j7 = Long.MAX_VALUE;
            }
            boolean z = true;
            boolean z2 = j5 <= j2 && j2 <= j7;
            if (j5 > j3 || j3 > j7) {
                z = false;
            }
            if (z2 && z) {
                if (Math.abs(j2 - j) > Math.abs(j3 - j)) {
                    return j3;
                }
            } else if (!z2) {
                return z ? j3 : j5;
            }
            return j2;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final long zzb() {
        long j;
        zzS();
        if (this.zzK || this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        if (zzX()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzun zzunVar = this.zzx;
                if (zzunVar.zzb[i] && zzunVar.zzc[i] && !this.zzs[i].zzw()) {
                    j = Math.min(j, this.zzs[i].zzg());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzQ(false);
        }
        return j == Long.MIN_VALUE ? this.zzG : j;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zzd() {
        if (this.zzD) {
            if (this.zzK || zzP() > this.zzJ) {
                this.zzD = false;
                return this.zzG;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zze(long j) {
        int i;
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzX()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            for (i = 0; i < length; i = i + 1) {
                i = (this.zzs[i].zzy(j, false) || (!zArr[i] && this.zzw)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        zzxz zzxzVar = this.zzk;
        if (zzxzVar.zzl()) {
            for (zzvb zzvbVar : this.zzs) {
                zzvbVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzxzVar.zzh();
            for (zzvb zzvbVar2 : this.zzs) {
                zzvbVar2.zzp(false);
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zzf(zzwx[] zzwxVarArr, boolean[] zArr, zzvc[] zzvcVarArr, boolean[] zArr2, long j) {
        boolean z;
        zzwx zzwxVar;
        int i;
        zzS();
        zzun zzunVar = this.zzx;
        zzvk zzvkVar = zzunVar.zza;
        boolean[] zArr3 = zzunVar.zzc;
        int i2 = this.zzE;
        int i3 = 0;
        for (int i4 = 0; i4 < zzwxVarArr.length; i4++) {
            zzvc zzvcVar = zzvcVarArr[i4];
            if (zzvcVar != null && (zzwxVarArr[i4] == null || !zArr[i4])) {
                i = ((zzul) zzvcVar).zzb;
                zzdy.zzf(zArr3[i]);
                this.zzE--;
                zArr3[i] = false;
                zzvcVarArr[i4] = null;
            }
        }
        if (this.zzC) {
            if (i2 != 0) {
                z = false;
            }
            z = true;
        } else {
            if (j == 0) {
                z = false;
                j = 0;
            }
            z = true;
        }
        for (int i5 = 0; i5 < zzwxVarArr.length; i5++) {
            if (zzvcVarArr[i5] == null && (zzwxVar = zzwxVarArr[i5]) != null) {
                zzdy.zzf(zzwxVar.zzc() == 1);
                zzdy.zzf(zzwxVar.zza(0) == 0);
                int zza = zzvkVar.zza(zzwxVar.zze());
                zzdy.zzf(!zArr3[zza]);
                this.zzE++;
                zArr3[zza] = true;
                zzvcVarArr[i5] = new zzul(this, zza);
                zArr2[i5] = true;
                if (!z) {
                    zzvb zzvbVar = this.zzs[zza];
                    z = (zzvbVar.zzy(j, true) || zzvbVar.zza() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzl()) {
                zzvb[] zzvbVarArr = this.zzs;
                int length = zzvbVarArr.length;
                while (i3 < length) {
                    zzvbVarArr[i3].zzj();
                    i3++;
                }
                this.zzk.zzg();
            } else {
                for (zzvb zzvbVar2 : this.zzs) {
                    zzvbVar2.zzp(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i3 < zzvcVarArr.length) {
                if (zzvcVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.zzC = true;
        return j;
    }

    public final int zzg(int i, zzkf zzkfVar, zzhi zzhiVar, int i2) {
        if (zzY()) {
            return -3;
        }
        zzU(i);
        int zzd = this.zzs[i].zzd(zzkfVar, zzhiVar, i2, this.zzK);
        if (zzd == -3) {
            zzV(i);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final zzvk zzh() {
        zzS();
        return this.zzx.zza;
    }

    public final int zzi(int i, long j) {
        if (zzY()) {
            return 0;
        }
        zzU(i);
        zzvb zzvbVar = this.zzs[i];
        int zzb2 = zzvbVar.zzb(j, this.zzK);
        zzvbVar.zzv(zzb2);
        if (zzb2 == 0) {
            zzV(i);
            return 0;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzj(long j, boolean z) {
        zzS();
        if (zzX()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzi(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzk() throws IOException {
        zzG();
        if (this.zzK && !this.zzv) {
            throw zzce.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzl(zzti zztiVar, long j) {
        this.zzq = zztiVar;
        this.zzm.zze();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final boolean zzo(long j) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zze = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zze;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    @Override // com.google.android.gms.internal.ads.zzxr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzxt zzt(com.google.android.gms.internal.ads.zzxv r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuo.zzt(com.google.android.gms.internal.ads.zzxv, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzxt");
    }

    public final zzabr zzu() {
        return zzR(new zzum(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final zzabr zzv(int i, int i2) {
        return zzR(new zzum(i, false));
    }
}
