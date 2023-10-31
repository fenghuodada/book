package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkd implements Handler.Callback, zzti, zzxc, zzkw, zzhx, zzkz {
    private boolean zzA;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    @Nullable
    private zzkc zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    @Nullable
    private zzia zzL;
    private final zzjg zzN;
    private final zzhv zzO;
    private final zzle[] zza;
    private final Set zzb;
    private final zzlf[] zzc;
    private final zzxd zzd;
    private final zzxe zze;
    private final zzkg zzf;
    private final zzxl zzg;
    private final zzei zzh;
    @Nullable
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcw zzk;
    private final zzcu zzl;
    private final long zzm;
    private final zzhy zzn;
    private final ArrayList zzo;
    private final zzdz zzp;
    private final zzkl zzq;
    private final zzkx zzr;
    private final long zzs;
    private zzlh zzt;
    private zzky zzu;
    private zzkb zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzB = 0;
    private boolean zzC = false;
    private boolean zzx = false;
    private long zzM = -9223372036854775807L;

    public zzkd(zzle[] zzleVarArr, zzxd zzxdVar, zzxe zzxeVar, zzkg zzkgVar, zzxl zzxlVar, int i, boolean z, zzls zzlsVar, zzlh zzlhVar, zzhv zzhvVar, long j, boolean z2, Looper looper, zzdz zzdzVar, zzjg zzjgVar, zzof zzofVar, Looper looper2) {
        this.zzN = zzjgVar;
        this.zza = zzleVarArr;
        this.zzd = zzxdVar;
        this.zze = zzxeVar;
        this.zzf = zzkgVar;
        this.zzg = zzxlVar;
        this.zzt = zzlhVar;
        this.zzO = zzhvVar;
        this.zzs = j;
        this.zzp = zzdzVar;
        this.zzm = zzkgVar.zza();
        zzkgVar.zzf();
        zzky zzi = zzky.zzi(zzxeVar);
        this.zzu = zzi;
        this.zzv = new zzkb(zzi);
        int length = zzleVarArr.length;
        this.zzc = new zzlf[2];
        for (int i2 = 0; i2 < 2; i2++) {
            zzleVarArr[i2].zzr(i2, zzofVar);
            this.zzc[i2] = zzleVarArr[i2].zzj();
        }
        this.zzn = new zzhy(this, zzdzVar);
        this.zzo = new ArrayList();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzcw();
        this.zzl = new zzcu();
        zzxdVar.zzq(this, zzxlVar);
        this.zzK = true;
        zzei zzb = zzdzVar.zzb(looper, null);
        this.zzq = new zzkl(zzlsVar, zzb);
        this.zzr = new zzkx(this, zzlsVar, zzb, zzofVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzj = looper3;
        this.zzh = zzdzVar.zzb(looper3, this);
    }

    private final void zzA(zzle zzleVar) throws zzia {
        if (zzad(zzleVar)) {
            this.zzn.zzd(zzleVar);
            zzak(zzleVar);
            zzleVar.zzo();
            this.zzG--;
        }
    }

    private final void zzB() throws zzia {
        int length = this.zza.length;
        zzC(new boolean[2]);
    }

    private final void zzC(boolean[] zArr) throws zzia {
        zzki zze = this.zzq.zze();
        zzxe zzi = zze.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                break;
            }
            if (!zzi.zzb(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzC();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i2 >= 2) {
                zze.zzg = true;
                return;
            }
            if (zzi.zzb(i2)) {
                boolean z = zArr[i2];
                zzle zzleVar = this.zza[i2];
                if (!zzad(zzleVar)) {
                    zzki zze2 = this.zzq.zze();
                    boolean z2 = zze2 == this.zzq.zzd();
                    zzxe zzi2 = zze2.zzi();
                    zzlg zzlgVar = zzi2.zzb[i2];
                    zzam[] zzai = zzai(zzi2.zzc[i2]);
                    boolean z3 = zzag() && this.zzu.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzG++;
                    this.zzb.add(zzleVar);
                    zzleVar.zzp(zzlgVar, zzai, zze2.zzc[i2], this.zzI, z4, z2, zze2.zzf(), zze2.zze());
                    zzleVar.zzq(11, new zzjw(this));
                    this.zzn.zze(zzleVar);
                    if (z3) {
                        zzleVar.zzG();
                    }
                }
            }
            i2++;
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzia zzc = zzia.zzc(iOException, i);
        zzki zzd = this.zzq.zzd();
        if (zzd != null) {
            zzc = zzc.zza(zzd.zzf.zza);
        }
        zzer.zzc("ExoPlayerImplInternal", "Playback error", zzc);
        zzV(false, false);
        this.zzu = this.zzu.zzf(zzc);
    }

    private final void zzE(boolean z) {
        zzki zzc = this.zzq.zzc();
        zztl zztlVar = zzc == null ? this.zzu.zzb : zzc.zzf.zza;
        boolean z2 = !this.zzu.zzk.equals(zztlVar);
        if (z2) {
            this.zzu = this.zzu.zzc(zztlVar);
        }
        zzky zzkyVar = this.zzu;
        zzkyVar.zzp = zzc == null ? zzkyVar.zzr : zzc.zzc();
        this.zzu.zzq = zzt();
        if ((z2 || z) && zzc != null && zzc.zzd) {
            zzY(zzc.zzf.zza, zzc.zzh(), zzc.zzi());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0364 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzF(com.google.android.gms.internal.ads.zzcx r28, boolean r29) throws com.google.android.gms.internal.ads.zzia {
        /*
            Method dump skipped, instructions count: 949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkd.zzF(com.google.android.gms.internal.ads.zzcx, boolean):void");
    }

    private final void zzG(zzci zzciVar, boolean z) throws zzia {
        zzH(zzciVar, zzciVar.zzc, true, z);
    }

    private final void zzH(zzci zzciVar, float f, boolean z, boolean z2) throws zzia {
        int i;
        zzkd zzkdVar = this;
        if (z) {
            if (z2) {
                zzkdVar.zzv.zza(1);
            }
            zzky zzkyVar = zzkdVar.zzu;
            zzkdVar = this;
            zzkdVar.zzu = new zzky(zzkyVar.zza, zzkyVar.zzb, zzkyVar.zzc, zzkyVar.zzd, zzkyVar.zze, zzkyVar.zzf, zzkyVar.zzg, zzkyVar.zzh, zzkyVar.zzi, zzkyVar.zzj, zzkyVar.zzk, zzkyVar.zzl, zzkyVar.zzm, zzciVar, zzkyVar.zzp, zzkyVar.zzq, zzkyVar.zzr, zzkyVar.zzs, zzkyVar.zzo);
        }
        float f2 = zzciVar.zzc;
        zzki zzd = zzkdVar.zzq.zzd();
        while (true) {
            i = 0;
            if (zzd == null) {
                break;
            }
            zzwx[] zzwxVarArr = zzd.zzi().zzc;
            int length = zzwxVarArr.length;
            while (i < length) {
                zzwx zzwxVar = zzwxVarArr[i];
                i++;
            }
            zzd = zzd.zzg();
        }
        zzle[] zzleVarArr = zzkdVar.zza;
        int length2 = zzleVarArr.length;
        while (i < 2) {
            zzle zzleVar = zzleVarArr[i];
            if (zzleVar != null) {
                zzleVar.zzF(f, zzciVar.zzc);
            }
            i++;
        }
    }

    private final void zzI() {
        long zze;
        long j;
        boolean z = false;
        if (zzac()) {
            zzki zzc = this.zzq.zzc();
            long zzu = zzu(zzc.zzd());
            if (zzc == this.zzq.zzd()) {
                zze = this.zzI;
                j = zzc.zze();
            } else {
                zze = this.zzI - zzc.zze();
                j = zzc.zzf.zzb;
            }
            long j2 = zze - j;
            boolean zzg = this.zzf.zzg(j2, zzu, this.zzn.zzc().zzc);
            if (zzg || zzu >= 500000 || this.zzm <= 0) {
                z = zzg;
            } else {
                this.zzq.zzd().zza.zzj(this.zzu.zzr, false);
                z = this.zzf.zzg(j2, zzu, this.zzn.zzc().zzc);
            }
        }
        this.zzA = z;
        if (z) {
            this.zzq.zzc().zzk(this.zzI);
        }
        zzX();
    }

    private final void zzJ() {
        boolean z;
        this.zzv.zzc(this.zzu);
        z = this.zzv.zzg;
        if (z) {
            zzjg zzjgVar = this.zzN;
            zzjgVar.zza.zzY(this.zzv);
            this.zzv = new zzkb(this.zzu);
        }
    }

    private final void zzK() throws zzia {
        int i;
        float f = this.zzn.zzc().zzc;
        zzki zze = this.zzq.zze();
        boolean z = true;
        for (zzki zzd = this.zzq.zzd(); zzd != null && zzd.zzd; zzd = zzd.zzg()) {
            zzxe zzj = zzd.zzj(f, this.zzu.zza);
            zzxe zzi = zzd.zzi();
            boolean z2 = false;
            if (zzi != null && zzi.zzc.length == zzj.zzc.length) {
                for (int i2 = 0; i2 < zzj.zzc.length; i2++) {
                    if (zzj.zza(zzi, i2)) {
                    }
                }
                if (zzd != zze) {
                    z2 = true;
                }
                z &= z2;
            }
            if (z) {
                zzki zzd2 = this.zzq.zzd();
                boolean zzm = this.zzq.zzm(zzd2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                long zzb = zzd2.zzb(zzj, this.zzu.zzr, zzm, zArr);
                zzky zzkyVar = this.zzu;
                boolean z3 = (zzkyVar.zze == 4 || zzb == zzkyVar.zzr) ? false : true;
                zzky zzkyVar2 = this.zzu;
                i = 2;
                this.zzu = zzz(zzkyVar2.zzb, zzb, zzkyVar2.zzc, zzkyVar2.zzd, z3, 5);
                if (z3) {
                    zzN(zzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (true) {
                    zzle[] zzleVarArr = this.zza;
                    int length3 = zzleVarArr.length;
                    if (i3 >= 2) {
                        break;
                    }
                    zzle zzleVar = zzleVarArr[i3];
                    boolean zzad = zzad(zzleVar);
                    zArr2[i3] = zzad;
                    zzvc zzvcVar = zzd2.zzc[i3];
                    if (zzad) {
                        if (zzvcVar != zzleVar.zzm()) {
                            zzA(zzleVar);
                        } else if (zArr[i3]) {
                            zzleVar.zzD(this.zzI);
                        }
                    }
                    i3++;
                }
                zzC(zArr2);
            } else {
                i = 2;
                this.zzq.zzm(zzd);
                if (zzd.zzd) {
                    zzd.zza(zzj, Math.max(zzd.zzf.zzb, this.zzI - zzd.zze()), false);
                }
            }
            zzE(true);
            if (this.zzu.zze != 4) {
                zzI();
                zzZ();
                this.zzh.zzi(i);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzL(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkd.zzL(boolean, boolean, boolean, boolean):void");
    }

    private final void zzM() {
        zzki zzd = this.zzq.zzd();
        boolean z = false;
        if (zzd != null && zzd.zzf.zzh && this.zzx) {
            z = true;
        }
        this.zzy = z;
    }

    private final void zzN(long j) throws zzia {
        zzwx[] zzwxVarArr;
        zzki zzd = this.zzq.zzd();
        long zze = j + (zzd == null ? 1000000000000L : zzd.zze());
        this.zzI = zze;
        this.zzn.zzf(zze);
        zzle[] zzleVarArr = this.zza;
        int length = zzleVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzle zzleVar = zzleVarArr[i];
            if (zzad(zzleVar)) {
                zzleVar.zzD(this.zzI);
            }
        }
        for (zzki zzd2 = this.zzq.zzd(); zzd2 != null; zzd2 = zzd2.zzg()) {
            for (zzwx zzwxVar : zzd2.zzi().zzc) {
            }
        }
    }

    private final void zzO(zzcx zzcxVar, zzcx zzcxVar2) {
        if (zzcxVar.zzo() && zzcxVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        Object obj = ((zzka) this.zzo.get(size)).zzb;
        int i = zzfn.zza;
        throw null;
    }

    private final void zzP(long j, long j2) {
        this.zzh.zzj(2, j + j2);
    }

    private final void zzQ(boolean z) throws zzia {
        zztl zztlVar = this.zzq.zzd().zzf.zza;
        long zzw = zzw(zztlVar, this.zzu.zzr, true, false);
        if (zzw != this.zzu.zzr) {
            zzky zzkyVar = this.zzu;
            this.zzu = zzz(zztlVar, zzw, zzkyVar.zzc, zzkyVar.zzd, z, 5);
        }
    }

    private final void zzR(zzci zzciVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzciVar);
    }

    private final void zzS(boolean z, int i, boolean z2, int i2) throws zzia {
        zzwx[] zzwxVarArr;
        this.zzv.zza(z2 ? 1 : 0);
        this.zzv.zzb(i2);
        this.zzu = this.zzu.zze(z, i);
        this.zzz = false;
        for (zzki zzd = this.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
            for (zzwx zzwxVar : zzd.zzi().zzc) {
            }
        }
        if (!zzag()) {
            zzW();
            zzZ();
            return;
        }
        int i3 = this.zzu.zze;
        if (i3 == 3) {
            zzU();
            this.zzh.zzi(2);
        } else if (i3 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzT(int i) {
        zzky zzkyVar = this.zzu;
        if (zzkyVar.zze != i) {
            if (i != 2) {
                this.zzM = -9223372036854775807L;
            }
            this.zzu = zzkyVar.zzg(i);
        }
    }

    private final void zzU() throws zzia {
        this.zzz = false;
        this.zzn.zzh();
        zzle[] zzleVarArr = this.zza;
        int length = zzleVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzle zzleVar = zzleVarArr[i];
            if (zzad(zzleVar)) {
                zzleVar.zzG();
            }
        }
    }

    private final void zzV(boolean z, boolean z2) {
        zzL(z || !this.zzD, false, true, false);
        this.zzv.zza(z2 ? 1 : 0);
        this.zzf.zzd();
        zzT(1);
    }

    private final void zzW() throws zzia {
        this.zzn.zzi();
        zzle[] zzleVarArr = this.zza;
        int length = zzleVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzle zzleVar = zzleVarArr[i];
            if (zzad(zzleVar)) {
                zzak(zzleVar);
            }
        }
    }

    private final void zzX() {
        zzki zzc = this.zzq.zzc();
        boolean z = this.zzA || (zzc != null && zzc.zza.zzp());
        zzky zzkyVar = this.zzu;
        if (z != zzkyVar.zzg) {
            this.zzu = new zzky(zzkyVar.zza, zzkyVar.zzb, zzkyVar.zzc, zzkyVar.zzd, zzkyVar.zze, zzkyVar.zzf, z, zzkyVar.zzh, zzkyVar.zzi, zzkyVar.zzj, zzkyVar.zzk, zzkyVar.zzl, zzkyVar.zzm, zzkyVar.zzn, zzkyVar.zzp, zzkyVar.zzq, zzkyVar.zzr, zzkyVar.zzs, zzkyVar.zzo);
        }
    }

    private final void zzY(zztl zztlVar, zzvk zzvkVar, zzxe zzxeVar) {
        this.zzf.zze(this.zzu.zza, zztlVar, this.zza, zzvkVar, zzxeVar.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r5 > 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r0 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r0 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r3 >= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        if (r5 <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        r7 = (com.google.android.gms.internal.ads.zzka) r11.zzo.get(r5 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if (r5 >= r11.zzo.size()) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
        r0 = (com.google.android.gms.internal.ads.zzka) r11.zzo.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
        r11.zzJ = r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:37:0x00ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a1 -> B:29:0x0091). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzZ() throws com.google.android.gms.internal.ads.zzia {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkd.zzZ():void");
    }

    private final void zzaa(zzcx zzcxVar, zztl zztlVar, zzcx zzcxVar2, zztl zztlVar2, long j, boolean z) throws zzia {
        if (!zzah(zzcxVar, zztlVar)) {
            zzci zzciVar = zztlVar.zzb() ? zzci.zza : this.zzu.zzn;
            if (this.zzn.zzc().equals(zzciVar)) {
                return;
            }
            zzR(zzciVar);
            zzH(this.zzu.zzn, zzciVar.zzc, false, false);
            return;
        }
        zzcxVar.zze(zzcxVar.zzn(zztlVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzhv zzhvVar = this.zzO;
        zzbg zzbgVar = this.zzk.zzk;
        int i = zzfn.zza;
        zzhvVar.zzd(zzbgVar);
        if (j != -9223372036854775807L) {
            this.zzO.zze(zzs(zzcxVar, zztlVar.zza, j));
            return;
        }
        if (!zzfn.zzB(!zzcxVar2.zzo() ? zzcxVar2.zze(zzcxVar2.zzn(zztlVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc) || z) {
            this.zzO.zze(-9223372036854775807L);
        }
    }

    private final synchronized void zzab(zzfpp zzfppVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((zzju) zzfppVar).zza.zzw).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzac() {
        zzki zzc = this.zzq.zzc();
        return (zzc == null || zzc.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzad(zzle zzleVar) {
        return zzleVar.zzbc() != 0;
    }

    private final boolean zzae() {
        zzki zzd = this.zzq.zzd();
        long j = zzd.zzf.zze;
        if (zzd.zzd) {
            if (j == -9223372036854775807L || this.zzu.zzr < j) {
                return true;
            }
            return !zzag();
        }
        return false;
    }

    private static boolean zzaf(zzky zzkyVar, zzcu zzcuVar) {
        zztl zztlVar = zzkyVar.zzb;
        zzcx zzcxVar = zzkyVar.zza;
        return zzcxVar.zzo() || zzcxVar.zzn(zztlVar.zza, zzcuVar).zzg;
    }

    private final boolean zzag() {
        zzky zzkyVar = this.zzu;
        return zzkyVar.zzl && zzkyVar.zzm == 0;
    }

    private final boolean zzah(zzcx zzcxVar, zztl zztlVar) {
        if (!zztlVar.zzb() && !zzcxVar.zzo()) {
            zzcxVar.zze(zzcxVar.zzn(zztlVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcw zzcwVar = this.zzk;
                if (zzcwVar.zzi && zzcwVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzam[] zzai(zzwx zzwxVar) {
        int zzc = zzwxVar != null ? zzwxVar.zzc() : 0;
        zzam[] zzamVarArr = new zzam[zzc];
        for (int i = 0; i < zzc; i++) {
            zzamVarArr[i] = zzwxVar.zzd(i);
        }
        return zzamVarArr;
    }

    private static final void zzaj(zzlb zzlbVar) throws zzia {
        zzlbVar.zzj();
        try {
            zzlbVar.zzc().zzq(zzlbVar.zza(), zzlbVar.zzg());
        } finally {
            zzlbVar.zzh(true);
        }
    }

    private static final void zzak(zzle zzleVar) {
        if (zzleVar.zzbc() == 2) {
            zzleVar.zzH();
        }
    }

    private static final void zzal(zzle zzleVar, long j) {
        zzleVar.zzE();
        if (zzleVar instanceof zzvo) {
            zzvo zzvoVar = (zzvo) zzleVar;
            throw null;
        }
    }

    @Nullable
    public static Object zze(zzcw zzcwVar, zzcu zzcuVar, int i, boolean z, Object obj, zzcx zzcxVar, zzcx zzcxVar2) {
        int zza = zzcxVar.zza(obj);
        int zzb = zzcxVar.zzb();
        int i2 = 0;
        int i3 = zza;
        int i4 = -1;
        while (true) {
            if (i2 >= zzb || i4 != -1) {
                break;
            }
            i3 = zzcxVar.zzi(i3, zzcuVar, zzcwVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzcxVar2.zza(zzcxVar.zzf(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return zzcxVar2.zzf(i4);
    }

    public static final /* synthetic */ void zzr(zzlb zzlbVar) {
        try {
            zzaj(zzlbVar);
        } catch (zzia e) {
            zzer.zzc("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzcx zzcxVar, Object obj, long j) {
        zzcxVar.zze(zzcxVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcw zzcwVar = this.zzk;
        if (zzcwVar.zzf != -9223372036854775807L && zzcwVar.zzb()) {
            zzcw zzcwVar2 = this.zzk;
            if (zzcwVar2.zzi) {
                long j2 = zzcwVar2.zzg;
                return zzfn.zzo((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.zzk.zzf) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzu.zzp);
    }

    private final long zzu(long j) {
        zzki zzc = this.zzq.zzc();
        if (zzc == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzI - zzc.zze()));
    }

    private final long zzv(zztl zztlVar, long j, boolean z) throws zzia {
        return zzw(zztlVar, j, this.zzq.zzd() != this.zzq.zze(), z);
    }

    private final long zzw(zztl zztlVar, long j, boolean z, boolean z2) throws zzia {
        zzW();
        this.zzz = false;
        if (z2 || this.zzu.zze == 3) {
            zzT(2);
        }
        zzki zzd = this.zzq.zzd();
        zzki zzkiVar = zzd;
        while (zzkiVar != null && !zztlVar.equals(zzkiVar.zzf.zza)) {
            zzkiVar = zzkiVar.zzg();
        }
        if (z || zzd != zzkiVar || (zzkiVar != null && zzkiVar.zze() + j < 0)) {
            zzle[] zzleVarArr = this.zza;
            int length = zzleVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzA(zzleVarArr[i]);
            }
            if (zzkiVar != null) {
                while (this.zzq.zzd() != zzkiVar) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzkiVar);
                zzkiVar.zzp(1000000000000L);
                zzB();
            }
        }
        zzkl zzklVar = this.zzq;
        if (zzkiVar != null) {
            zzklVar.zzm(zzkiVar);
            if (!zzkiVar.zzd) {
                zzkiVar.zzf = zzkiVar.zzf.zzb(j);
            } else if (zzkiVar.zze) {
                j = zzkiVar.zza.zze(j);
                zzkiVar.zza.zzj(j - this.zzm, false);
            }
            zzN(j);
            zzI();
        } else {
            zzklVar.zzi();
            zzN(j);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j;
    }

    private final Pair zzx(zzcx zzcxVar) {
        long j = 0;
        if (zzcxVar.zzo()) {
            return Pair.create(zzky.zzj(), 0L);
        }
        Pair zzl = zzcxVar.zzl(this.zzk, this.zzl, zzcxVar.zzg(this.zzC), -9223372036854775807L);
        zztl zzh = this.zzq.zzh(zzcxVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzh.zzb()) {
            zzcxVar.zzn(zzh.zza, this.zzl);
            if (zzh.zzc == this.zzl.zze(zzh.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzh, Long.valueOf(j));
    }

    @Nullable
    private static Pair zzy(zzcx zzcxVar, zzkc zzkcVar, boolean z, int i, boolean z2, zzcw zzcwVar, zzcu zzcuVar) {
        Pair zzl;
        int i2;
        long j;
        zzcx zzcxVar2 = zzkcVar.zza;
        if (zzcxVar.zzo()) {
            return null;
        }
        zzcx zzcxVar3 = true == zzcxVar2.zzo() ? zzcxVar : zzcxVar2;
        try {
            zzl = zzcxVar3.zzl(zzcwVar, zzcuVar, zzkcVar.zzb, zzkcVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzcxVar.equals(zzcxVar3)) {
            return zzl;
        }
        if (zzcxVar.zza(zzl.first) == -1) {
            Object zze = zze(zzcwVar, zzcuVar, i, z2, zzl.first, zzcxVar3, zzcxVar);
            if (zze != null) {
                i2 = zzcxVar.zzn(zze, zzcuVar).zzd;
                j = -9223372036854775807L;
            }
            return null;
        } else if (!zzcxVar3.zzn(zzl.first, zzcuVar).zzg || zzcxVar3.zze(zzcuVar.zzd, zzcwVar, 0L).zzo != zzcxVar3.zza(zzl.first)) {
            return zzl;
        } else {
            i2 = zzcxVar.zzn(zzl.first, zzcuVar).zzd;
            j = zzkcVar.zzc;
        }
        return zzcxVar.zzl(zzcwVar, zzcuVar, i2, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    @androidx.annotation.CheckResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzky zzz(com.google.android.gms.internal.ads.zztl r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkd.zzz(com.google.android.gms.internal.ads.zztl, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzky");
    }

    /* JADX WARN: Code restructure failed: missing block: B:405:0x07a7, code lost:
        if (zzae() != false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0848, code lost:
        if (r3 == false) goto L525;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05c5 A[Catch: RuntimeException -> 0x09db, IOException -> 0x0a05, zzsn -> 0x0a0a, zzfy -> 0x0a0f, zzce -> 0x0a14, zzqj -> 0x0a2b, zzia -> 0x0a35, TryCatch #9 {zzce -> 0x0a14, zzfy -> 0x0a0f, zzia -> 0x0a35, zzqj -> 0x0a2b, zzsn -> 0x0a0a, IOException -> 0x0a05, RuntimeException -> 0x09db, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0035, B:20:0x003a, B:24:0x0041, B:26:0x004a, B:28:0x0058, B:29:0x005b, B:30:0x0060, B:31:0x006b, B:32:0x007a, B:33:0x007f, B:34:0x0093, B:35:0x00a5, B:37:0x00b4, B:38:0x00b8, B:39:0x00c5, B:41:0x00d4, B:42:0x00f0, B:43:0x0100, B:44:0x0109, B:46:0x011b, B:47:0x0127, B:48:0x0137, B:50:0x0143, B:53:0x014e, B:54:0x0152, B:55:0x015f, B:59:0x0166, B:61:0x016e, B:63:0x0172, B:65:0x0178, B:67:0x0180, B:69:0x0188, B:70:0x018b, B:72:0x0190, B:79:0x019d, B:80:0x019e, B:84:0x01a5, B:86:0x01b3, B:87:0x01b8, B:89:0x01c8, B:90:0x01cd, B:91:0x01d2, B:93:0x01de, B:94:0x01e5, B:95:0x01ea, B:97:0x01f6, B:99:0x0222, B:100:0x0243, B:101:0x0247, B:103:0x024c, B:104:0x025d, B:106:0x0269, B:107:0x026c, B:114:0x0277, B:115:0x0278, B:117:0x027e, B:118:0x0285, B:119:0x0296, B:121:0x02bd, B:187:0x03d4, B:171:0x03a1, B:170:0x039d, B:196:0x03e5, B:197:0x03f2, B:122:0x02df, B:126:0x02f2, B:128:0x0302, B:130:0x0319, B:132:0x0323, B:198:0x03f3, B:200:0x0407, B:203:0x0411, B:205:0x0420, B:207:0x042c, B:209:0x045b, B:210:0x0460, B:211:0x0464, B:213:0x0468, B:215:0x0475, B:284:0x05bd, B:286:0x05c5, B:288:0x05cd, B:291:0x05d2, B:292:0x05de, B:294:0x05e4, B:296:0x05ec, B:299:0x05fc, B:301:0x0602, B:302:0x061c, B:304:0x0622, B:306:0x0627, B:308:0x062c, B:310:0x0630, B:312:0x0636, B:314:0x063a, B:316:0x0642, B:318:0x0648, B:320:0x0652, B:323:0x0658, B:324:0x065b, B:326:0x0664, B:328:0x0676, B:330:0x067f, B:332:0x0687, B:337:0x0691, B:218:0x0484, B:220:0x048a, B:223:0x0490, B:226:0x049b, B:228:0x04a0, B:231:0x04ae, B:233:0x04b4, B:234:0x04bc, B:235:0x04bf, B:237:0x04c7, B:239:0x04d5, B:241:0x0511, B:243:0x051b, B:246:0x0526, B:248:0x052e, B:249:0x0531, B:251:0x0535, B:253:0x053b, B:255:0x0547, B:257:0x0551, B:259:0x0562, B:261:0x0568, B:262:0x0573, B:263:0x0578, B:265:0x0583, B:268:0x0588, B:270:0x058e, B:272:0x0596, B:274:0x059c, B:276:0x05a2, B:280:0x05b0, B:282:0x05b7, B:283:0x05ba, B:214:0x0472, B:339:0x06bb, B:343:0x06c6, B:345:0x06d0, B:346:0x06d5, B:348:0x06e5, B:349:0x06fa, B:351:0x0700, B:353:0x0708, B:355:0x070f, B:359:0x0718, B:364:0x0727, B:370:0x0734, B:372:0x073a, B:382:0x074d, B:383:0x0750, B:385:0x075c, B:387:0x0762, B:391:0x076f, B:393:0x0777, B:395:0x077b, B:396:0x0786, B:398:0x078c, B:452:0x087c, B:455:0x0884, B:457:0x0889, B:459:0x0891, B:461:0x089f, B:462:0x08a6, B:463:0x08aa, B:465:0x08b0, B:467:0x08b9, B:469:0x08bf, B:471:0x08ca, B:472:0x08ce, B:479:0x08ed, B:481:0x08f3, B:485:0x08fc, B:487:0x0900, B:492:0x0909, B:494:0x090f, B:496:0x096f, B:498:0x0974, B:507:0x0985, B:509:0x0989, B:510:0x0991, B:511:0x0998, B:473:0x08d1, B:476:0x08df, B:477:0x08e6, B:399:0x0795, B:434:0x0837, B:436:0x083d, B:438:0x0841, B:442:0x084a, B:444:0x0858, B:446:0x0860, B:448:0x086a, B:449:0x086f, B:450:0x0874, B:451:0x0879, B:402:0x079f, B:404:0x07a3, B:431:0x0827, B:433:0x0833, B:408:0x07ae, B:410:0x07b2, B:412:0x07c6, B:414:0x07d4, B:416:0x07e0, B:420:0x07e9, B:422:0x07f3, B:428:0x07fe, B:384:0x0755, B:512:0x099d, B:516:0x09a4, B:517:0x09ac, B:521:0x09ca), top: B:592:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05e4 A[Catch: RuntimeException -> 0x09db, IOException -> 0x0a05, zzsn -> 0x0a0a, zzfy -> 0x0a0f, zzce -> 0x0a14, zzqj -> 0x0a2b, zzia -> 0x0a35, TryCatch #9 {zzce -> 0x0a14, zzfy -> 0x0a0f, zzia -> 0x0a35, zzqj -> 0x0a2b, zzsn -> 0x0a0a, IOException -> 0x0a05, RuntimeException -> 0x09db, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0035, B:20:0x003a, B:24:0x0041, B:26:0x004a, B:28:0x0058, B:29:0x005b, B:30:0x0060, B:31:0x006b, B:32:0x007a, B:33:0x007f, B:34:0x0093, B:35:0x00a5, B:37:0x00b4, B:38:0x00b8, B:39:0x00c5, B:41:0x00d4, B:42:0x00f0, B:43:0x0100, B:44:0x0109, B:46:0x011b, B:47:0x0127, B:48:0x0137, B:50:0x0143, B:53:0x014e, B:54:0x0152, B:55:0x015f, B:59:0x0166, B:61:0x016e, B:63:0x0172, B:65:0x0178, B:67:0x0180, B:69:0x0188, B:70:0x018b, B:72:0x0190, B:79:0x019d, B:80:0x019e, B:84:0x01a5, B:86:0x01b3, B:87:0x01b8, B:89:0x01c8, B:90:0x01cd, B:91:0x01d2, B:93:0x01de, B:94:0x01e5, B:95:0x01ea, B:97:0x01f6, B:99:0x0222, B:100:0x0243, B:101:0x0247, B:103:0x024c, B:104:0x025d, B:106:0x0269, B:107:0x026c, B:114:0x0277, B:115:0x0278, B:117:0x027e, B:118:0x0285, B:119:0x0296, B:121:0x02bd, B:187:0x03d4, B:171:0x03a1, B:170:0x039d, B:196:0x03e5, B:197:0x03f2, B:122:0x02df, B:126:0x02f2, B:128:0x0302, B:130:0x0319, B:132:0x0323, B:198:0x03f3, B:200:0x0407, B:203:0x0411, B:205:0x0420, B:207:0x042c, B:209:0x045b, B:210:0x0460, B:211:0x0464, B:213:0x0468, B:215:0x0475, B:284:0x05bd, B:286:0x05c5, B:288:0x05cd, B:291:0x05d2, B:292:0x05de, B:294:0x05e4, B:296:0x05ec, B:299:0x05fc, B:301:0x0602, B:302:0x061c, B:304:0x0622, B:306:0x0627, B:308:0x062c, B:310:0x0630, B:312:0x0636, B:314:0x063a, B:316:0x0642, B:318:0x0648, B:320:0x0652, B:323:0x0658, B:324:0x065b, B:326:0x0664, B:328:0x0676, B:330:0x067f, B:332:0x0687, B:337:0x0691, B:218:0x0484, B:220:0x048a, B:223:0x0490, B:226:0x049b, B:228:0x04a0, B:231:0x04ae, B:233:0x04b4, B:234:0x04bc, B:235:0x04bf, B:237:0x04c7, B:239:0x04d5, B:241:0x0511, B:243:0x051b, B:246:0x0526, B:248:0x052e, B:249:0x0531, B:251:0x0535, B:253:0x053b, B:255:0x0547, B:257:0x0551, B:259:0x0562, B:261:0x0568, B:262:0x0573, B:263:0x0578, B:265:0x0583, B:268:0x0588, B:270:0x058e, B:272:0x0596, B:274:0x059c, B:276:0x05a2, B:280:0x05b0, B:282:0x05b7, B:283:0x05ba, B:214:0x0472, B:339:0x06bb, B:343:0x06c6, B:345:0x06d0, B:346:0x06d5, B:348:0x06e5, B:349:0x06fa, B:351:0x0700, B:353:0x0708, B:355:0x070f, B:359:0x0718, B:364:0x0727, B:370:0x0734, B:372:0x073a, B:382:0x074d, B:383:0x0750, B:385:0x075c, B:387:0x0762, B:391:0x076f, B:393:0x0777, B:395:0x077b, B:396:0x0786, B:398:0x078c, B:452:0x087c, B:455:0x0884, B:457:0x0889, B:459:0x0891, B:461:0x089f, B:462:0x08a6, B:463:0x08aa, B:465:0x08b0, B:467:0x08b9, B:469:0x08bf, B:471:0x08ca, B:472:0x08ce, B:479:0x08ed, B:481:0x08f3, B:485:0x08fc, B:487:0x0900, B:492:0x0909, B:494:0x090f, B:496:0x096f, B:498:0x0974, B:507:0x0985, B:509:0x0989, B:510:0x0991, B:511:0x0998, B:473:0x08d1, B:476:0x08df, B:477:0x08e6, B:399:0x0795, B:434:0x0837, B:436:0x083d, B:438:0x0841, B:442:0x084a, B:444:0x0858, B:446:0x0860, B:448:0x086a, B:449:0x086f, B:450:0x0874, B:451:0x0879, B:402:0x079f, B:404:0x07a3, B:431:0x0827, B:433:0x0833, B:408:0x07ae, B:410:0x07b2, B:412:0x07c6, B:414:0x07d4, B:416:0x07e0, B:420:0x07e9, B:422:0x07f3, B:428:0x07fe, B:384:0x0755, B:512:0x099d, B:516:0x09a4, B:517:0x09ac, B:521:0x09ca), top: B:592:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0636 A[Catch: RuntimeException -> 0x09db, IOException -> 0x0a05, zzsn -> 0x0a0a, zzfy -> 0x0a0f, zzce -> 0x0a14, zzqj -> 0x0a2b, zzia -> 0x0a35, TryCatch #9 {zzce -> 0x0a14, zzfy -> 0x0a0f, zzia -> 0x0a35, zzqj -> 0x0a2b, zzsn -> 0x0a0a, IOException -> 0x0a05, RuntimeException -> 0x09db, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0035, B:20:0x003a, B:24:0x0041, B:26:0x004a, B:28:0x0058, B:29:0x005b, B:30:0x0060, B:31:0x006b, B:32:0x007a, B:33:0x007f, B:34:0x0093, B:35:0x00a5, B:37:0x00b4, B:38:0x00b8, B:39:0x00c5, B:41:0x00d4, B:42:0x00f0, B:43:0x0100, B:44:0x0109, B:46:0x011b, B:47:0x0127, B:48:0x0137, B:50:0x0143, B:53:0x014e, B:54:0x0152, B:55:0x015f, B:59:0x0166, B:61:0x016e, B:63:0x0172, B:65:0x0178, B:67:0x0180, B:69:0x0188, B:70:0x018b, B:72:0x0190, B:79:0x019d, B:80:0x019e, B:84:0x01a5, B:86:0x01b3, B:87:0x01b8, B:89:0x01c8, B:90:0x01cd, B:91:0x01d2, B:93:0x01de, B:94:0x01e5, B:95:0x01ea, B:97:0x01f6, B:99:0x0222, B:100:0x0243, B:101:0x0247, B:103:0x024c, B:104:0x025d, B:106:0x0269, B:107:0x026c, B:114:0x0277, B:115:0x0278, B:117:0x027e, B:118:0x0285, B:119:0x0296, B:121:0x02bd, B:187:0x03d4, B:171:0x03a1, B:170:0x039d, B:196:0x03e5, B:197:0x03f2, B:122:0x02df, B:126:0x02f2, B:128:0x0302, B:130:0x0319, B:132:0x0323, B:198:0x03f3, B:200:0x0407, B:203:0x0411, B:205:0x0420, B:207:0x042c, B:209:0x045b, B:210:0x0460, B:211:0x0464, B:213:0x0468, B:215:0x0475, B:284:0x05bd, B:286:0x05c5, B:288:0x05cd, B:291:0x05d2, B:292:0x05de, B:294:0x05e4, B:296:0x05ec, B:299:0x05fc, B:301:0x0602, B:302:0x061c, B:304:0x0622, B:306:0x0627, B:308:0x062c, B:310:0x0630, B:312:0x0636, B:314:0x063a, B:316:0x0642, B:318:0x0648, B:320:0x0652, B:323:0x0658, B:324:0x065b, B:326:0x0664, B:328:0x0676, B:330:0x067f, B:332:0x0687, B:337:0x0691, B:218:0x0484, B:220:0x048a, B:223:0x0490, B:226:0x049b, B:228:0x04a0, B:231:0x04ae, B:233:0x04b4, B:234:0x04bc, B:235:0x04bf, B:237:0x04c7, B:239:0x04d5, B:241:0x0511, B:243:0x051b, B:246:0x0526, B:248:0x052e, B:249:0x0531, B:251:0x0535, B:253:0x053b, B:255:0x0547, B:257:0x0551, B:259:0x0562, B:261:0x0568, B:262:0x0573, B:263:0x0578, B:265:0x0583, B:268:0x0588, B:270:0x058e, B:272:0x0596, B:274:0x059c, B:276:0x05a2, B:280:0x05b0, B:282:0x05b7, B:283:0x05ba, B:214:0x0472, B:339:0x06bb, B:343:0x06c6, B:345:0x06d0, B:346:0x06d5, B:348:0x06e5, B:349:0x06fa, B:351:0x0700, B:353:0x0708, B:355:0x070f, B:359:0x0718, B:364:0x0727, B:370:0x0734, B:372:0x073a, B:382:0x074d, B:383:0x0750, B:385:0x075c, B:387:0x0762, B:391:0x076f, B:393:0x0777, B:395:0x077b, B:396:0x0786, B:398:0x078c, B:452:0x087c, B:455:0x0884, B:457:0x0889, B:459:0x0891, B:461:0x089f, B:462:0x08a6, B:463:0x08aa, B:465:0x08b0, B:467:0x08b9, B:469:0x08bf, B:471:0x08ca, B:472:0x08ce, B:479:0x08ed, B:481:0x08f3, B:485:0x08fc, B:487:0x0900, B:492:0x0909, B:494:0x090f, B:496:0x096f, B:498:0x0974, B:507:0x0985, B:509:0x0989, B:510:0x0991, B:511:0x0998, B:473:0x08d1, B:476:0x08df, B:477:0x08e6, B:399:0x0795, B:434:0x0837, B:436:0x083d, B:438:0x0841, B:442:0x084a, B:444:0x0858, B:446:0x0860, B:448:0x086a, B:449:0x086f, B:450:0x0874, B:451:0x0879, B:402:0x079f, B:404:0x07a3, B:431:0x0827, B:433:0x0833, B:408:0x07ae, B:410:0x07b2, B:412:0x07c6, B:414:0x07d4, B:416:0x07e0, B:420:0x07e9, B:422:0x07f3, B:428:0x07fe, B:384:0x0755, B:512:0x099d, B:516:0x09a4, B:517:0x09ac, B:521:0x09ca), top: B:592:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0658 A[Catch: RuntimeException -> 0x09db, IOException -> 0x0a05, zzsn -> 0x0a0a, zzfy -> 0x0a0f, zzce -> 0x0a14, zzqj -> 0x0a2b, zzia -> 0x0a35, TryCatch #9 {zzce -> 0x0a14, zzfy -> 0x0a0f, zzia -> 0x0a35, zzqj -> 0x0a2b, zzsn -> 0x0a0a, IOException -> 0x0a05, RuntimeException -> 0x09db, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0035, B:20:0x003a, B:24:0x0041, B:26:0x004a, B:28:0x0058, B:29:0x005b, B:30:0x0060, B:31:0x006b, B:32:0x007a, B:33:0x007f, B:34:0x0093, B:35:0x00a5, B:37:0x00b4, B:38:0x00b8, B:39:0x00c5, B:41:0x00d4, B:42:0x00f0, B:43:0x0100, B:44:0x0109, B:46:0x011b, B:47:0x0127, B:48:0x0137, B:50:0x0143, B:53:0x014e, B:54:0x0152, B:55:0x015f, B:59:0x0166, B:61:0x016e, B:63:0x0172, B:65:0x0178, B:67:0x0180, B:69:0x0188, B:70:0x018b, B:72:0x0190, B:79:0x019d, B:80:0x019e, B:84:0x01a5, B:86:0x01b3, B:87:0x01b8, B:89:0x01c8, B:90:0x01cd, B:91:0x01d2, B:93:0x01de, B:94:0x01e5, B:95:0x01ea, B:97:0x01f6, B:99:0x0222, B:100:0x0243, B:101:0x0247, B:103:0x024c, B:104:0x025d, B:106:0x0269, B:107:0x026c, B:114:0x0277, B:115:0x0278, B:117:0x027e, B:118:0x0285, B:119:0x0296, B:121:0x02bd, B:187:0x03d4, B:171:0x03a1, B:170:0x039d, B:196:0x03e5, B:197:0x03f2, B:122:0x02df, B:126:0x02f2, B:128:0x0302, B:130:0x0319, B:132:0x0323, B:198:0x03f3, B:200:0x0407, B:203:0x0411, B:205:0x0420, B:207:0x042c, B:209:0x045b, B:210:0x0460, B:211:0x0464, B:213:0x0468, B:215:0x0475, B:284:0x05bd, B:286:0x05c5, B:288:0x05cd, B:291:0x05d2, B:292:0x05de, B:294:0x05e4, B:296:0x05ec, B:299:0x05fc, B:301:0x0602, B:302:0x061c, B:304:0x0622, B:306:0x0627, B:308:0x062c, B:310:0x0630, B:312:0x0636, B:314:0x063a, B:316:0x0642, B:318:0x0648, B:320:0x0652, B:323:0x0658, B:324:0x065b, B:326:0x0664, B:328:0x0676, B:330:0x067f, B:332:0x0687, B:337:0x0691, B:218:0x0484, B:220:0x048a, B:223:0x0490, B:226:0x049b, B:228:0x04a0, B:231:0x04ae, B:233:0x04b4, B:234:0x04bc, B:235:0x04bf, B:237:0x04c7, B:239:0x04d5, B:241:0x0511, B:243:0x051b, B:246:0x0526, B:248:0x052e, B:249:0x0531, B:251:0x0535, B:253:0x053b, B:255:0x0547, B:257:0x0551, B:259:0x0562, B:261:0x0568, B:262:0x0573, B:263:0x0578, B:265:0x0583, B:268:0x0588, B:270:0x058e, B:272:0x0596, B:274:0x059c, B:276:0x05a2, B:280:0x05b0, B:282:0x05b7, B:283:0x05ba, B:214:0x0472, B:339:0x06bb, B:343:0x06c6, B:345:0x06d0, B:346:0x06d5, B:348:0x06e5, B:349:0x06fa, B:351:0x0700, B:353:0x0708, B:355:0x070f, B:359:0x0718, B:364:0x0727, B:370:0x0734, B:372:0x073a, B:382:0x074d, B:383:0x0750, B:385:0x075c, B:387:0x0762, B:391:0x076f, B:393:0x0777, B:395:0x077b, B:396:0x0786, B:398:0x078c, B:452:0x087c, B:455:0x0884, B:457:0x0889, B:459:0x0891, B:461:0x089f, B:462:0x08a6, B:463:0x08aa, B:465:0x08b0, B:467:0x08b9, B:469:0x08bf, B:471:0x08ca, B:472:0x08ce, B:479:0x08ed, B:481:0x08f3, B:485:0x08fc, B:487:0x0900, B:492:0x0909, B:494:0x090f, B:496:0x096f, B:498:0x0974, B:507:0x0985, B:509:0x0989, B:510:0x0991, B:511:0x0998, B:473:0x08d1, B:476:0x08df, B:477:0x08e6, B:399:0x0795, B:434:0x0837, B:436:0x083d, B:438:0x0841, B:442:0x084a, B:444:0x0858, B:446:0x0860, B:448:0x086a, B:449:0x086f, B:450:0x0874, B:451:0x0879, B:402:0x079f, B:404:0x07a3, B:431:0x0827, B:433:0x0833, B:408:0x07ae, B:410:0x07b2, B:412:0x07c6, B:414:0x07d4, B:416:0x07e0, B:420:0x07e9, B:422:0x07f3, B:428:0x07fe, B:384:0x0755, B:512:0x099d, B:516:0x09a4, B:517:0x09ac, B:521:0x09ca), top: B:592:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0676 A[Catch: RuntimeException -> 0x09db, IOException -> 0x0a05, zzsn -> 0x0a0a, zzfy -> 0x0a0f, zzce -> 0x0a14, zzqj -> 0x0a2b, zzia -> 0x0a35, TryCatch #9 {zzce -> 0x0a14, zzfy -> 0x0a0f, zzia -> 0x0a35, zzqj -> 0x0a2b, zzsn -> 0x0a0a, IOException -> 0x0a05, RuntimeException -> 0x09db, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0035, B:20:0x003a, B:24:0x0041, B:26:0x004a, B:28:0x0058, B:29:0x005b, B:30:0x0060, B:31:0x006b, B:32:0x007a, B:33:0x007f, B:34:0x0093, B:35:0x00a5, B:37:0x00b4, B:38:0x00b8, B:39:0x00c5, B:41:0x00d4, B:42:0x00f0, B:43:0x0100, B:44:0x0109, B:46:0x011b, B:47:0x0127, B:48:0x0137, B:50:0x0143, B:53:0x014e, B:54:0x0152, B:55:0x015f, B:59:0x0166, B:61:0x016e, B:63:0x0172, B:65:0x0178, B:67:0x0180, B:69:0x0188, B:70:0x018b, B:72:0x0190, B:79:0x019d, B:80:0x019e, B:84:0x01a5, B:86:0x01b3, B:87:0x01b8, B:89:0x01c8, B:90:0x01cd, B:91:0x01d2, B:93:0x01de, B:94:0x01e5, B:95:0x01ea, B:97:0x01f6, B:99:0x0222, B:100:0x0243, B:101:0x0247, B:103:0x024c, B:104:0x025d, B:106:0x0269, B:107:0x026c, B:114:0x0277, B:115:0x0278, B:117:0x027e, B:118:0x0285, B:119:0x0296, B:121:0x02bd, B:187:0x03d4, B:171:0x03a1, B:170:0x039d, B:196:0x03e5, B:197:0x03f2, B:122:0x02df, B:126:0x02f2, B:128:0x0302, B:130:0x0319, B:132:0x0323, B:198:0x03f3, B:200:0x0407, B:203:0x0411, B:205:0x0420, B:207:0x042c, B:209:0x045b, B:210:0x0460, B:211:0x0464, B:213:0x0468, B:215:0x0475, B:284:0x05bd, B:286:0x05c5, B:288:0x05cd, B:291:0x05d2, B:292:0x05de, B:294:0x05e4, B:296:0x05ec, B:299:0x05fc, B:301:0x0602, B:302:0x061c, B:304:0x0622, B:306:0x0627, B:308:0x062c, B:310:0x0630, B:312:0x0636, B:314:0x063a, B:316:0x0642, B:318:0x0648, B:320:0x0652, B:323:0x0658, B:324:0x065b, B:326:0x0664, B:328:0x0676, B:330:0x067f, B:332:0x0687, B:337:0x0691, B:218:0x0484, B:220:0x048a, B:223:0x0490, B:226:0x049b, B:228:0x04a0, B:231:0x04ae, B:233:0x04b4, B:234:0x04bc, B:235:0x04bf, B:237:0x04c7, B:239:0x04d5, B:241:0x0511, B:243:0x051b, B:246:0x0526, B:248:0x052e, B:249:0x0531, B:251:0x0535, B:253:0x053b, B:255:0x0547, B:257:0x0551, B:259:0x0562, B:261:0x0568, B:262:0x0573, B:263:0x0578, B:265:0x0583, B:268:0x0588, B:270:0x058e, B:272:0x0596, B:274:0x059c, B:276:0x05a2, B:280:0x05b0, B:282:0x05b7, B:283:0x05ba, B:214:0x0472, B:339:0x06bb, B:343:0x06c6, B:345:0x06d0, B:346:0x06d5, B:348:0x06e5, B:349:0x06fa, B:351:0x0700, B:353:0x0708, B:355:0x070f, B:359:0x0718, B:364:0x0727, B:370:0x0734, B:372:0x073a, B:382:0x074d, B:383:0x0750, B:385:0x075c, B:387:0x0762, B:391:0x076f, B:393:0x0777, B:395:0x077b, B:396:0x0786, B:398:0x078c, B:452:0x087c, B:455:0x0884, B:457:0x0889, B:459:0x0891, B:461:0x089f, B:462:0x08a6, B:463:0x08aa, B:465:0x08b0, B:467:0x08b9, B:469:0x08bf, B:471:0x08ca, B:472:0x08ce, B:479:0x08ed, B:481:0x08f3, B:485:0x08fc, B:487:0x0900, B:492:0x0909, B:494:0x090f, B:496:0x096f, B:498:0x0974, B:507:0x0985, B:509:0x0989, B:510:0x0991, B:511:0x0998, B:473:0x08d1, B:476:0x08df, B:477:0x08e6, B:399:0x0795, B:434:0x0837, B:436:0x083d, B:438:0x0841, B:442:0x084a, B:444:0x0858, B:446:0x0860, B:448:0x086a, B:449:0x086f, B:450:0x0874, B:451:0x0879, B:402:0x079f, B:404:0x07a3, B:431:0x0827, B:433:0x0833, B:408:0x07ae, B:410:0x07b2, B:412:0x07c6, B:414:0x07d4, B:416:0x07e0, B:420:0x07e9, B:422:0x07f3, B:428:0x07fe, B:384:0x0755, B:512:0x099d, B:516:0x09a4, B:517:0x09ac, B:521:0x09ca), top: B:592:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x074d A[Catch: RuntimeException -> 0x09db, IOException -> 0x0a05, zzsn -> 0x0a0a, zzfy -> 0x0a0f, zzce -> 0x0a14, zzqj -> 0x0a2b, zzia -> 0x0a35, TryCatch #9 {zzce -> 0x0a14, zzfy -> 0x0a0f, zzia -> 0x0a35, zzqj -> 0x0a2b, zzsn -> 0x0a0a, IOException -> 0x0a05, RuntimeException -> 0x09db, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0035, B:20:0x003a, B:24:0x0041, B:26:0x004a, B:28:0x0058, B:29:0x005b, B:30:0x0060, B:31:0x006b, B:32:0x007a, B:33:0x007f, B:34:0x0093, B:35:0x00a5, B:37:0x00b4, B:38:0x00b8, B:39:0x00c5, B:41:0x00d4, B:42:0x00f0, B:43:0x0100, B:44:0x0109, B:46:0x011b, B:47:0x0127, B:48:0x0137, B:50:0x0143, B:53:0x014e, B:54:0x0152, B:55:0x015f, B:59:0x0166, B:61:0x016e, B:63:0x0172, B:65:0x0178, B:67:0x0180, B:69:0x0188, B:70:0x018b, B:72:0x0190, B:79:0x019d, B:80:0x019e, B:84:0x01a5, B:86:0x01b3, B:87:0x01b8, B:89:0x01c8, B:90:0x01cd, B:91:0x01d2, B:93:0x01de, B:94:0x01e5, B:95:0x01ea, B:97:0x01f6, B:99:0x0222, B:100:0x0243, B:101:0x0247, B:103:0x024c, B:104:0x025d, B:106:0x0269, B:107:0x026c, B:114:0x0277, B:115:0x0278, B:117:0x027e, B:118:0x0285, B:119:0x0296, B:121:0x02bd, B:187:0x03d4, B:171:0x03a1, B:170:0x039d, B:196:0x03e5, B:197:0x03f2, B:122:0x02df, B:126:0x02f2, B:128:0x0302, B:130:0x0319, B:132:0x0323, B:198:0x03f3, B:200:0x0407, B:203:0x0411, B:205:0x0420, B:207:0x042c, B:209:0x045b, B:210:0x0460, B:211:0x0464, B:213:0x0468, B:215:0x0475, B:284:0x05bd, B:286:0x05c5, B:288:0x05cd, B:291:0x05d2, B:292:0x05de, B:294:0x05e4, B:296:0x05ec, B:299:0x05fc, B:301:0x0602, B:302:0x061c, B:304:0x0622, B:306:0x0627, B:308:0x062c, B:310:0x0630, B:312:0x0636, B:314:0x063a, B:316:0x0642, B:318:0x0648, B:320:0x0652, B:323:0x0658, B:324:0x065b, B:326:0x0664, B:328:0x0676, B:330:0x067f, B:332:0x0687, B:337:0x0691, B:218:0x0484, B:220:0x048a, B:223:0x0490, B:226:0x049b, B:228:0x04a0, B:231:0x04ae, B:233:0x04b4, B:234:0x04bc, B:235:0x04bf, B:237:0x04c7, B:239:0x04d5, B:241:0x0511, B:243:0x051b, B:246:0x0526, B:248:0x052e, B:249:0x0531, B:251:0x0535, B:253:0x053b, B:255:0x0547, B:257:0x0551, B:259:0x0562, B:261:0x0568, B:262:0x0573, B:263:0x0578, B:265:0x0583, B:268:0x0588, B:270:0x058e, B:272:0x0596, B:274:0x059c, B:276:0x05a2, B:280:0x05b0, B:282:0x05b7, B:283:0x05ba, B:214:0x0472, B:339:0x06bb, B:343:0x06c6, B:345:0x06d0, B:346:0x06d5, B:348:0x06e5, B:349:0x06fa, B:351:0x0700, B:353:0x0708, B:355:0x070f, B:359:0x0718, B:364:0x0727, B:370:0x0734, B:372:0x073a, B:382:0x074d, B:383:0x0750, B:385:0x075c, B:387:0x0762, B:391:0x076f, B:393:0x0777, B:395:0x077b, B:396:0x0786, B:398:0x078c, B:452:0x087c, B:455:0x0884, B:457:0x0889, B:459:0x0891, B:461:0x089f, B:462:0x08a6, B:463:0x08aa, B:465:0x08b0, B:467:0x08b9, B:469:0x08bf, B:471:0x08ca, B:472:0x08ce, B:479:0x08ed, B:481:0x08f3, B:485:0x08fc, B:487:0x0900, B:492:0x0909, B:494:0x090f, B:496:0x096f, B:498:0x0974, B:507:0x0985, B:509:0x0989, B:510:0x0991, B:511:0x0998, B:473:0x08d1, B:476:0x08df, B:477:0x08e6, B:399:0x0795, B:434:0x0837, B:436:0x083d, B:438:0x0841, B:442:0x084a, B:444:0x0858, B:446:0x0860, B:448:0x086a, B:449:0x086f, B:450:0x0874, B:451:0x0879, B:402:0x079f, B:404:0x07a3, B:431:0x0827, B:433:0x0833, B:408:0x07ae, B:410:0x07b2, B:412:0x07c6, B:414:0x07d4, B:416:0x07e0, B:420:0x07e9, B:422:0x07f3, B:428:0x07fe, B:384:0x0755, B:512:0x099d, B:516:0x09a4, B:517:0x09ac, B:521:0x09ca), top: B:592:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x08f3 A[Catch: RuntimeException -> 0x09db, IOException -> 0x0a05, zzsn -> 0x0a0a, zzfy -> 0x0a0f, zzce -> 0x0a14, zzqj -> 0x0a2b, zzia -> 0x0a35, TryCatch #9 {zzce -> 0x0a14, zzfy -> 0x0a0f, zzia -> 0x0a35, zzqj -> 0x0a2b, zzsn -> 0x0a0a, IOException -> 0x0a05, RuntimeException -> 0x09db, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0035, B:20:0x003a, B:24:0x0041, B:26:0x004a, B:28:0x0058, B:29:0x005b, B:30:0x0060, B:31:0x006b, B:32:0x007a, B:33:0x007f, B:34:0x0093, B:35:0x00a5, B:37:0x00b4, B:38:0x00b8, B:39:0x00c5, B:41:0x00d4, B:42:0x00f0, B:43:0x0100, B:44:0x0109, B:46:0x011b, B:47:0x0127, B:48:0x0137, B:50:0x0143, B:53:0x014e, B:54:0x0152, B:55:0x015f, B:59:0x0166, B:61:0x016e, B:63:0x0172, B:65:0x0178, B:67:0x0180, B:69:0x0188, B:70:0x018b, B:72:0x0190, B:79:0x019d, B:80:0x019e, B:84:0x01a5, B:86:0x01b3, B:87:0x01b8, B:89:0x01c8, B:90:0x01cd, B:91:0x01d2, B:93:0x01de, B:94:0x01e5, B:95:0x01ea, B:97:0x01f6, B:99:0x0222, B:100:0x0243, B:101:0x0247, B:103:0x024c, B:104:0x025d, B:106:0x0269, B:107:0x026c, B:114:0x0277, B:115:0x0278, B:117:0x027e, B:118:0x0285, B:119:0x0296, B:121:0x02bd, B:187:0x03d4, B:171:0x03a1, B:170:0x039d, B:196:0x03e5, B:197:0x03f2, B:122:0x02df, B:126:0x02f2, B:128:0x0302, B:130:0x0319, B:132:0x0323, B:198:0x03f3, B:200:0x0407, B:203:0x0411, B:205:0x0420, B:207:0x042c, B:209:0x045b, B:210:0x0460, B:211:0x0464, B:213:0x0468, B:215:0x0475, B:284:0x05bd, B:286:0x05c5, B:288:0x05cd, B:291:0x05d2, B:292:0x05de, B:294:0x05e4, B:296:0x05ec, B:299:0x05fc, B:301:0x0602, B:302:0x061c, B:304:0x0622, B:306:0x0627, B:308:0x062c, B:310:0x0630, B:312:0x0636, B:314:0x063a, B:316:0x0642, B:318:0x0648, B:320:0x0652, B:323:0x0658, B:324:0x065b, B:326:0x0664, B:328:0x0676, B:330:0x067f, B:332:0x0687, B:337:0x0691, B:218:0x0484, B:220:0x048a, B:223:0x0490, B:226:0x049b, B:228:0x04a0, B:231:0x04ae, B:233:0x04b4, B:234:0x04bc, B:235:0x04bf, B:237:0x04c7, B:239:0x04d5, B:241:0x0511, B:243:0x051b, B:246:0x0526, B:248:0x052e, B:249:0x0531, B:251:0x0535, B:253:0x053b, B:255:0x0547, B:257:0x0551, B:259:0x0562, B:261:0x0568, B:262:0x0573, B:263:0x0578, B:265:0x0583, B:268:0x0588, B:270:0x058e, B:272:0x0596, B:274:0x059c, B:276:0x05a2, B:280:0x05b0, B:282:0x05b7, B:283:0x05ba, B:214:0x0472, B:339:0x06bb, B:343:0x06c6, B:345:0x06d0, B:346:0x06d5, B:348:0x06e5, B:349:0x06fa, B:351:0x0700, B:353:0x0708, B:355:0x070f, B:359:0x0718, B:364:0x0727, B:370:0x0734, B:372:0x073a, B:382:0x074d, B:383:0x0750, B:385:0x075c, B:387:0x0762, B:391:0x076f, B:393:0x0777, B:395:0x077b, B:396:0x0786, B:398:0x078c, B:452:0x087c, B:455:0x0884, B:457:0x0889, B:459:0x0891, B:461:0x089f, B:462:0x08a6, B:463:0x08aa, B:465:0x08b0, B:467:0x08b9, B:469:0x08bf, B:471:0x08ca, B:472:0x08ce, B:479:0x08ed, B:481:0x08f3, B:485:0x08fc, B:487:0x0900, B:492:0x0909, B:494:0x090f, B:496:0x096f, B:498:0x0974, B:507:0x0985, B:509:0x0989, B:510:0x0991, B:511:0x0998, B:473:0x08d1, B:476:0x08df, B:477:0x08e6, B:399:0x0795, B:434:0x0837, B:436:0x083d, B:438:0x0841, B:442:0x084a, B:444:0x0858, B:446:0x0860, B:448:0x086a, B:449:0x086f, B:450:0x0874, B:451:0x0879, B:402:0x079f, B:404:0x07a3, B:431:0x0827, B:433:0x0833, B:408:0x07ae, B:410:0x07b2, B:412:0x07c6, B:414:0x07d4, B:416:0x07e0, B:420:0x07e9, B:422:0x07f3, B:428:0x07fe, B:384:0x0755, B:512:0x099d, B:516:0x09a4, B:517:0x09ac, B:521:0x09ca), top: B:592:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0900 A[Catch: RuntimeException -> 0x09db, IOException -> 0x0a05, zzsn -> 0x0a0a, zzfy -> 0x0a0f, zzce -> 0x0a14, zzqj -> 0x0a2b, zzia -> 0x0a35, TryCatch #9 {zzce -> 0x0a14, zzfy -> 0x0a0f, zzia -> 0x0a35, zzqj -> 0x0a2b, zzsn -> 0x0a0a, IOException -> 0x0a05, RuntimeException -> 0x09db, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0035, B:20:0x003a, B:24:0x0041, B:26:0x004a, B:28:0x0058, B:29:0x005b, B:30:0x0060, B:31:0x006b, B:32:0x007a, B:33:0x007f, B:34:0x0093, B:35:0x00a5, B:37:0x00b4, B:38:0x00b8, B:39:0x00c5, B:41:0x00d4, B:42:0x00f0, B:43:0x0100, B:44:0x0109, B:46:0x011b, B:47:0x0127, B:48:0x0137, B:50:0x0143, B:53:0x014e, B:54:0x0152, B:55:0x015f, B:59:0x0166, B:61:0x016e, B:63:0x0172, B:65:0x0178, B:67:0x0180, B:69:0x0188, B:70:0x018b, B:72:0x0190, B:79:0x019d, B:80:0x019e, B:84:0x01a5, B:86:0x01b3, B:87:0x01b8, B:89:0x01c8, B:90:0x01cd, B:91:0x01d2, B:93:0x01de, B:94:0x01e5, B:95:0x01ea, B:97:0x01f6, B:99:0x0222, B:100:0x0243, B:101:0x0247, B:103:0x024c, B:104:0x025d, B:106:0x0269, B:107:0x026c, B:114:0x0277, B:115:0x0278, B:117:0x027e, B:118:0x0285, B:119:0x0296, B:121:0x02bd, B:187:0x03d4, B:171:0x03a1, B:170:0x039d, B:196:0x03e5, B:197:0x03f2, B:122:0x02df, B:126:0x02f2, B:128:0x0302, B:130:0x0319, B:132:0x0323, B:198:0x03f3, B:200:0x0407, B:203:0x0411, B:205:0x0420, B:207:0x042c, B:209:0x045b, B:210:0x0460, B:211:0x0464, B:213:0x0468, B:215:0x0475, B:284:0x05bd, B:286:0x05c5, B:288:0x05cd, B:291:0x05d2, B:292:0x05de, B:294:0x05e4, B:296:0x05ec, B:299:0x05fc, B:301:0x0602, B:302:0x061c, B:304:0x0622, B:306:0x0627, B:308:0x062c, B:310:0x0630, B:312:0x0636, B:314:0x063a, B:316:0x0642, B:318:0x0648, B:320:0x0652, B:323:0x0658, B:324:0x065b, B:326:0x0664, B:328:0x0676, B:330:0x067f, B:332:0x0687, B:337:0x0691, B:218:0x0484, B:220:0x048a, B:223:0x0490, B:226:0x049b, B:228:0x04a0, B:231:0x04ae, B:233:0x04b4, B:234:0x04bc, B:235:0x04bf, B:237:0x04c7, B:239:0x04d5, B:241:0x0511, B:243:0x051b, B:246:0x0526, B:248:0x052e, B:249:0x0531, B:251:0x0535, B:253:0x053b, B:255:0x0547, B:257:0x0551, B:259:0x0562, B:261:0x0568, B:262:0x0573, B:263:0x0578, B:265:0x0583, B:268:0x0588, B:270:0x058e, B:272:0x0596, B:274:0x059c, B:276:0x05a2, B:280:0x05b0, B:282:0x05b7, B:283:0x05ba, B:214:0x0472, B:339:0x06bb, B:343:0x06c6, B:345:0x06d0, B:346:0x06d5, B:348:0x06e5, B:349:0x06fa, B:351:0x0700, B:353:0x0708, B:355:0x070f, B:359:0x0718, B:364:0x0727, B:370:0x0734, B:372:0x073a, B:382:0x074d, B:383:0x0750, B:385:0x075c, B:387:0x0762, B:391:0x076f, B:393:0x0777, B:395:0x077b, B:396:0x0786, B:398:0x078c, B:452:0x087c, B:455:0x0884, B:457:0x0889, B:459:0x0891, B:461:0x089f, B:462:0x08a6, B:463:0x08aa, B:465:0x08b0, B:467:0x08b9, B:469:0x08bf, B:471:0x08ca, B:472:0x08ce, B:479:0x08ed, B:481:0x08f3, B:485:0x08fc, B:487:0x0900, B:492:0x0909, B:494:0x090f, B:496:0x096f, B:498:0x0974, B:507:0x0985, B:509:0x0989, B:510:0x0991, B:511:0x0998, B:473:0x08d1, B:476:0x08df, B:477:0x08e6, B:399:0x0795, B:434:0x0837, B:436:0x083d, B:438:0x0841, B:442:0x084a, B:444:0x0858, B:446:0x0860, B:448:0x086a, B:449:0x086f, B:450:0x0874, B:451:0x0879, B:402:0x079f, B:404:0x07a3, B:431:0x0827, B:433:0x0833, B:408:0x07ae, B:410:0x07b2, B:412:0x07c6, B:414:0x07d4, B:416:0x07e0, B:420:0x07e9, B:422:0x07f3, B:428:0x07fe, B:384:0x0755, B:512:0x099d, B:516:0x09a4, B:517:0x09ac, B:521:0x09ca), top: B:592:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x090f A[Catch: RuntimeException -> 0x09db, IOException -> 0x0a05, zzsn -> 0x0a0a, zzfy -> 0x0a0f, zzce -> 0x0a14, zzqj -> 0x0a2b, zzia -> 0x0a35, TryCatch #9 {zzce -> 0x0a14, zzfy -> 0x0a0f, zzia -> 0x0a35, zzqj -> 0x0a2b, zzsn -> 0x0a0a, IOException -> 0x0a05, RuntimeException -> 0x09db, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0035, B:20:0x003a, B:24:0x0041, B:26:0x004a, B:28:0x0058, B:29:0x005b, B:30:0x0060, B:31:0x006b, B:32:0x007a, B:33:0x007f, B:34:0x0093, B:35:0x00a5, B:37:0x00b4, B:38:0x00b8, B:39:0x00c5, B:41:0x00d4, B:42:0x00f0, B:43:0x0100, B:44:0x0109, B:46:0x011b, B:47:0x0127, B:48:0x0137, B:50:0x0143, B:53:0x014e, B:54:0x0152, B:55:0x015f, B:59:0x0166, B:61:0x016e, B:63:0x0172, B:65:0x0178, B:67:0x0180, B:69:0x0188, B:70:0x018b, B:72:0x0190, B:79:0x019d, B:80:0x019e, B:84:0x01a5, B:86:0x01b3, B:87:0x01b8, B:89:0x01c8, B:90:0x01cd, B:91:0x01d2, B:93:0x01de, B:94:0x01e5, B:95:0x01ea, B:97:0x01f6, B:99:0x0222, B:100:0x0243, B:101:0x0247, B:103:0x024c, B:104:0x025d, B:106:0x0269, B:107:0x026c, B:114:0x0277, B:115:0x0278, B:117:0x027e, B:118:0x0285, B:119:0x0296, B:121:0x02bd, B:187:0x03d4, B:171:0x03a1, B:170:0x039d, B:196:0x03e5, B:197:0x03f2, B:122:0x02df, B:126:0x02f2, B:128:0x0302, B:130:0x0319, B:132:0x0323, B:198:0x03f3, B:200:0x0407, B:203:0x0411, B:205:0x0420, B:207:0x042c, B:209:0x045b, B:210:0x0460, B:211:0x0464, B:213:0x0468, B:215:0x0475, B:284:0x05bd, B:286:0x05c5, B:288:0x05cd, B:291:0x05d2, B:292:0x05de, B:294:0x05e4, B:296:0x05ec, B:299:0x05fc, B:301:0x0602, B:302:0x061c, B:304:0x0622, B:306:0x0627, B:308:0x062c, B:310:0x0630, B:312:0x0636, B:314:0x063a, B:316:0x0642, B:318:0x0648, B:320:0x0652, B:323:0x0658, B:324:0x065b, B:326:0x0664, B:328:0x0676, B:330:0x067f, B:332:0x0687, B:337:0x0691, B:218:0x0484, B:220:0x048a, B:223:0x0490, B:226:0x049b, B:228:0x04a0, B:231:0x04ae, B:233:0x04b4, B:234:0x04bc, B:235:0x04bf, B:237:0x04c7, B:239:0x04d5, B:241:0x0511, B:243:0x051b, B:246:0x0526, B:248:0x052e, B:249:0x0531, B:251:0x0535, B:253:0x053b, B:255:0x0547, B:257:0x0551, B:259:0x0562, B:261:0x0568, B:262:0x0573, B:263:0x0578, B:265:0x0583, B:268:0x0588, B:270:0x058e, B:272:0x0596, B:274:0x059c, B:276:0x05a2, B:280:0x05b0, B:282:0x05b7, B:283:0x05ba, B:214:0x0472, B:339:0x06bb, B:343:0x06c6, B:345:0x06d0, B:346:0x06d5, B:348:0x06e5, B:349:0x06fa, B:351:0x0700, B:353:0x0708, B:355:0x070f, B:359:0x0718, B:364:0x0727, B:370:0x0734, B:372:0x073a, B:382:0x074d, B:383:0x0750, B:385:0x075c, B:387:0x0762, B:391:0x076f, B:393:0x0777, B:395:0x077b, B:396:0x0786, B:398:0x078c, B:452:0x087c, B:455:0x0884, B:457:0x0889, B:459:0x0891, B:461:0x089f, B:462:0x08a6, B:463:0x08aa, B:465:0x08b0, B:467:0x08b9, B:469:0x08bf, B:471:0x08ca, B:472:0x08ce, B:479:0x08ed, B:481:0x08f3, B:485:0x08fc, B:487:0x0900, B:492:0x0909, B:494:0x090f, B:496:0x096f, B:498:0x0974, B:507:0x0985, B:509:0x0989, B:510:0x0991, B:511:0x0998, B:473:0x08d1, B:476:0x08df, B:477:0x08e6, B:399:0x0795, B:434:0x0837, B:436:0x083d, B:438:0x0841, B:442:0x084a, B:444:0x0858, B:446:0x0860, B:448:0x086a, B:449:0x086f, B:450:0x0874, B:451:0x0879, B:402:0x079f, B:404:0x07a3, B:431:0x0827, B:433:0x0833, B:408:0x07ae, B:410:0x07b2, B:412:0x07c6, B:414:0x07d4, B:416:0x07e0, B:420:0x07e9, B:422:0x07f3, B:428:0x07fe, B:384:0x0755, B:512:0x099d, B:516:0x09a4, B:517:0x09ac, B:521:0x09ca), top: B:592:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0974 A[Catch: RuntimeException -> 0x09db, IOException -> 0x0a05, zzsn -> 0x0a0a, zzfy -> 0x0a0f, zzce -> 0x0a14, zzqj -> 0x0a2b, zzia -> 0x0a35, TryCatch #9 {zzce -> 0x0a14, zzfy -> 0x0a0f, zzia -> 0x0a35, zzqj -> 0x0a2b, zzsn -> 0x0a0a, IOException -> 0x0a05, RuntimeException -> 0x09db, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0035, B:20:0x003a, B:24:0x0041, B:26:0x004a, B:28:0x0058, B:29:0x005b, B:30:0x0060, B:31:0x006b, B:32:0x007a, B:33:0x007f, B:34:0x0093, B:35:0x00a5, B:37:0x00b4, B:38:0x00b8, B:39:0x00c5, B:41:0x00d4, B:42:0x00f0, B:43:0x0100, B:44:0x0109, B:46:0x011b, B:47:0x0127, B:48:0x0137, B:50:0x0143, B:53:0x014e, B:54:0x0152, B:55:0x015f, B:59:0x0166, B:61:0x016e, B:63:0x0172, B:65:0x0178, B:67:0x0180, B:69:0x0188, B:70:0x018b, B:72:0x0190, B:79:0x019d, B:80:0x019e, B:84:0x01a5, B:86:0x01b3, B:87:0x01b8, B:89:0x01c8, B:90:0x01cd, B:91:0x01d2, B:93:0x01de, B:94:0x01e5, B:95:0x01ea, B:97:0x01f6, B:99:0x0222, B:100:0x0243, B:101:0x0247, B:103:0x024c, B:104:0x025d, B:106:0x0269, B:107:0x026c, B:114:0x0277, B:115:0x0278, B:117:0x027e, B:118:0x0285, B:119:0x0296, B:121:0x02bd, B:187:0x03d4, B:171:0x03a1, B:170:0x039d, B:196:0x03e5, B:197:0x03f2, B:122:0x02df, B:126:0x02f2, B:128:0x0302, B:130:0x0319, B:132:0x0323, B:198:0x03f3, B:200:0x0407, B:203:0x0411, B:205:0x0420, B:207:0x042c, B:209:0x045b, B:210:0x0460, B:211:0x0464, B:213:0x0468, B:215:0x0475, B:284:0x05bd, B:286:0x05c5, B:288:0x05cd, B:291:0x05d2, B:292:0x05de, B:294:0x05e4, B:296:0x05ec, B:299:0x05fc, B:301:0x0602, B:302:0x061c, B:304:0x0622, B:306:0x0627, B:308:0x062c, B:310:0x0630, B:312:0x0636, B:314:0x063a, B:316:0x0642, B:318:0x0648, B:320:0x0652, B:323:0x0658, B:324:0x065b, B:326:0x0664, B:328:0x0676, B:330:0x067f, B:332:0x0687, B:337:0x0691, B:218:0x0484, B:220:0x048a, B:223:0x0490, B:226:0x049b, B:228:0x04a0, B:231:0x04ae, B:233:0x04b4, B:234:0x04bc, B:235:0x04bf, B:237:0x04c7, B:239:0x04d5, B:241:0x0511, B:243:0x051b, B:246:0x0526, B:248:0x052e, B:249:0x0531, B:251:0x0535, B:253:0x053b, B:255:0x0547, B:257:0x0551, B:259:0x0562, B:261:0x0568, B:262:0x0573, B:263:0x0578, B:265:0x0583, B:268:0x0588, B:270:0x058e, B:272:0x0596, B:274:0x059c, B:276:0x05a2, B:280:0x05b0, B:282:0x05b7, B:283:0x05ba, B:214:0x0472, B:339:0x06bb, B:343:0x06c6, B:345:0x06d0, B:346:0x06d5, B:348:0x06e5, B:349:0x06fa, B:351:0x0700, B:353:0x0708, B:355:0x070f, B:359:0x0718, B:364:0x0727, B:370:0x0734, B:372:0x073a, B:382:0x074d, B:383:0x0750, B:385:0x075c, B:387:0x0762, B:391:0x076f, B:393:0x0777, B:395:0x077b, B:396:0x0786, B:398:0x078c, B:452:0x087c, B:455:0x0884, B:457:0x0889, B:459:0x0891, B:461:0x089f, B:462:0x08a6, B:463:0x08aa, B:465:0x08b0, B:467:0x08b9, B:469:0x08bf, B:471:0x08ca, B:472:0x08ce, B:479:0x08ed, B:481:0x08f3, B:485:0x08fc, B:487:0x0900, B:492:0x0909, B:494:0x090f, B:496:0x096f, B:498:0x0974, B:507:0x0985, B:509:0x0989, B:510:0x0991, B:511:0x0998, B:473:0x08d1, B:476:0x08df, B:477:0x08e6, B:399:0x0795, B:434:0x0837, B:436:0x083d, B:438:0x0841, B:442:0x084a, B:444:0x0858, B:446:0x0860, B:448:0x086a, B:449:0x086f, B:450:0x0874, B:451:0x0879, B:402:0x079f, B:404:0x07a3, B:431:0x0827, B:433:0x0833, B:408:0x07ae, B:410:0x07b2, B:412:0x07c6, B:414:0x07d4, B:416:0x07e0, B:420:0x07e9, B:422:0x07f3, B:428:0x07fe, B:384:0x0755, B:512:0x099d, B:516:0x09a4, B:517:0x09ac, B:521:0x09ca), top: B:592:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:598:0x062a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0750 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.google.android.gms.internal.ads.zzgz, com.google.android.gms.internal.ads.zzxl] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r56) {
        /*
            Method dump skipped, instructions count: 2844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkd.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zza(zzci zzciVar) {
        this.zzh.zzc(16, zzciVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    public final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final /* bridge */ /* synthetic */ void zzg(zzve zzveVar) {
        this.zzh.zzc(9, (zztj) zzveVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzti
    public final void zzi(zztj zztjVar) {
        this.zzh.zzc(8, zztjVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxc
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzcx zzcxVar, int i, long j) {
        this.zzh.zzc(3, new zzkc(zzcxVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkz
    public final synchronized void zzm(zzlb zzlbVar) {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzlbVar).zza();
            return;
        }
        zzer.zze("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzlbVar.zzh(false);
    }

    public final void zzn(boolean z, int i) {
        this.zzh.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzab(new zzju(this), this.zzs);
            return this.zzw;
        }
        return true;
    }

    public final void zzq(List list, int i, long j, zzvf zzvfVar) {
        this.zzh.zzc(17, new zzjy(list, zzvfVar, i, j, null)).zza();
    }
}
