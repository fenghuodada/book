package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class zzym extends zzrt {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private long zzB;
    private int zzC;
    private long zzD;
    private zzdn zzE;
    @Nullable
    private zzdn zzF;
    private int zzG;
    @Nullable
    private zzyq zzH;
    private final Context zze;
    private final zzyx zzf;
    private final zzzi zzg;
    private final zzyl zzh;
    private final boolean zzi;
    private zzyj zzj;
    private boolean zzk;
    private boolean zzl;
    @Nullable
    private Surface zzm;
    @Nullable
    private zzyp zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzym(Context context, zzrl zzrlVar, zzrv zzrvVar, long j, boolean z, @Nullable Handler handler, @Nullable zzzj zzzjVar, int i, float f) {
        super(2, zzrlVar, zzrvVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        zzyx zzyxVar = new zzyx(applicationContext);
        this.zzf = zzyxVar;
        this.zzg = new zzzi(handler, zzzjVar);
        this.zzh = new zzyl(zzyxVar, this);
        this.zzi = "NVIDIA".equals(zzfn.zzc);
        this.zzu = -9223372036854775807L;
        this.zzp = 1;
        this.zzE = zzdn.zza;
        this.zzG = 0;
        this.zzF = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r3.equals("video/av01") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzV(com.google.android.gms.internal.ads.zzrp r10, com.google.android.gms.internal.ads.zzam r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzym.zzV(com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzam):int");
    }

    public static int zzW(zzrp zzrpVar, zzam zzamVar) {
        if (zzamVar.zzn != -1) {
            int size = zzamVar.zzo.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) zzamVar.zzo.get(i2)).length;
            }
            return zzamVar.zzn + i;
        }
        return zzV(zzrpVar, zzamVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04bf, code lost:
        if (r0.equals("deb") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x079d, code lost:
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzaM(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzym.zzaM(java.lang.String):boolean");
    }

    public static final boolean zzaN(long j, long j2, boolean z) {
        return zzaV(j) && !z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzaO(long j, long j2, long j3, long j4, boolean z) {
        long zzaj = (long) ((j4 - j) / zzaj());
        return z ? zzaj - (j3 - j2) : zzaj;
    }

    private static List zzaP(Context context, zzrv zzrvVar, zzam zzamVar, boolean z, boolean z2) throws zzsc {
        String str = zzamVar.zzm;
        if (str == null) {
            return zzfrr.zzl();
        }
        List zzf = zzsi.zzf(str, z, z2);
        String zze = zzsi.zze(zzamVar);
        if (zze == null) {
            return zzfrr.zzj(zzf);
        }
        List zzf2 = zzsi.zzf(zze, z, z2);
        if (zzfn.zza < 26 || !"video/dolby-vision".equals(zzamVar.zzm) || zzf2.isEmpty() || zzyi.zza(context)) {
            zzfro zzfroVar = new zzfro();
            zzfroVar.zzh(zzf);
            zzfroVar.zzh(zzf2);
            return zzfroVar.zzi();
        }
        return zzfrr.zzj(zzf2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaQ(zzdn zzdnVar) {
        if (zzdnVar.equals(zzdn.zza) || zzdnVar.equals(this.zzF)) {
            return;
        }
        this.zzF = zzdnVar;
        this.zzg.zzt(zzdnVar);
    }

    private final void zzaR() {
        zzdn zzdnVar = this.zzF;
        if (zzdnVar != null) {
            this.zzg.zzt(zzdnVar);
        }
    }

    @RequiresApi(17)
    private final void zzaS() {
        Surface surface = this.zzm;
        zzyp zzypVar = this.zzn;
        if (surface == zzypVar) {
            this.zzm = null;
        }
        zzypVar.release();
        this.zzn = null;
    }

    private final void zzaT(zzrm zzrmVar, zzam zzamVar, int i, long j, boolean z) {
        long zza = this.zzh.zzl() ? this.zzh.zza(j, zzak()) * 1000 : System.nanoTime();
        if (zzfn.zza >= 21) {
            zzaG(zzrmVar, i, j, zza);
        } else {
            zzaF(zzrmVar, i, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzaU() {
        return zzfn.zza >= 21;
    }

    private static boolean zzaV(long j) {
        return j < -30000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzaW(long j, long j2) {
        int zzbc = zzbc();
        boolean z = this.zzs;
        boolean z2 = zzbc == 2;
        boolean z3 = z ? !this.zzq : z2 || this.zzr;
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.zzA;
        if (this.zzu == -9223372036854775807L && j >= zzak()) {
            if (z3) {
                return true;
            }
            if (z2 && zzaV(j2) && elapsedRealtime > 100000) {
                return true;
            }
        }
        return false;
    }

    private final boolean zzaX(zzrp zzrpVar) {
        if (zzfn.zza < 23 || zzaM(zzrpVar.zza)) {
            return false;
        }
        return !zzrpVar.zzf || zzyp.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzle
    public final void zzF(float f, float f2) throws zzia {
        super.zzF(f, f2);
        this.zzf.zze(f);
    }

    @Override // com.google.android.gms.internal.ads.zzle, com.google.android.gms.internal.ads.zzlf
    public final String zzM() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzle
    @CallSuper
    public final void zzN(long j, long j2) throws zzia {
        super.zzN(j, j2);
        if (this.zzh.zzl()) {
            this.zzh.zzg(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzle
    public final boolean zzO() {
        boolean zzO = super.zzO();
        if (this.zzh.zzl()) {
            return false;
        }
        return zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzle
    public final boolean zzP() {
        zzyp zzypVar;
        if (super.zzP() && ((!this.zzh.zzl() || this.zzh.zzm()) && (this.zzq || (((zzypVar = this.zzn) != null && this.zzm == zzypVar) || zzal() == null)))) {
            this.zzu = -9223372036854775807L;
            return true;
        } else if (this.zzu == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzu) {
                return true;
            }
            this.zzu = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final float zzR(float f, zzam zzamVar, zzam[] zzamVarArr) {
        float f2 = -1.0f;
        for (zzam zzamVar2 : zzamVarArr) {
            float f3 = zzamVar2.zzt;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final int zzS(zzrv zzrvVar, zzam zzamVar) throws zzsc {
        boolean z;
        if (zzcd.zzg(zzamVar.zzm)) {
            int i = 0;
            boolean z2 = zzamVar.zzp != null;
            List zzaP = zzaP(this.zze, zzrvVar, zzamVar, z2, false);
            if (z2 && zzaP.isEmpty()) {
                zzaP = zzaP(this.zze, zzrvVar, zzamVar, false, false);
            }
            if (zzaP.isEmpty()) {
                return 129;
            }
            if (zzrt.zzay(zzamVar)) {
                zzrp zzrpVar = (zzrp) zzaP.get(0);
                boolean zze = zzrpVar.zze(zzamVar);
                if (!zze) {
                    for (int i2 = 1; i2 < zzaP.size(); i2++) {
                        zzrp zzrpVar2 = (zzrp) zzaP.get(i2);
                        if (zzrpVar2.zze(zzamVar)) {
                            zze = true;
                            z = false;
                            zzrpVar = zzrpVar2;
                            break;
                        }
                    }
                }
                z = true;
                int i3 = true != zze ? 3 : 4;
                int i4 = true != zzrpVar.zzf(zzamVar) ? 8 : 16;
                int i5 = true != zzrpVar.zzg ? 0 : 64;
                int i6 = true != z ? 0 : 128;
                if (zzfn.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzyi.zza(this.zze)) {
                    i6 = 256;
                }
                if (zze) {
                    List zzaP2 = zzaP(this.zze, zzrvVar, zzamVar, z2, true);
                    if (!zzaP2.isEmpty()) {
                        zzrp zzrpVar3 = (zzrp) zzsi.zzg(zzaP2, zzamVar).get(0);
                        if (zzrpVar3.zze(zzamVar) && zzrpVar3.zzf(zzamVar)) {
                            i = 32;
                        }
                    }
                }
                return i3 | i4 | i | i5 | i6;
            }
            return 130;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final zzht zzT(zzrp zzrpVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzht zzb2 = zzrpVar.zzb(zzamVar, zzamVar2);
        int i3 = zzb2.zze;
        int i4 = zzamVar2.zzr;
        zzyj zzyjVar = this.zzj;
        if (i4 > zzyjVar.zza || zzamVar2.zzs > zzyjVar.zzb) {
            i3 |= 256;
        }
        if (zzW(zzrpVar, zzamVar2) > this.zzj.zzc) {
            i3 |= 64;
        }
        String str = zzrpVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzb2.zzd;
        }
        return new zzht(str, zzamVar, zzamVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @Nullable
    public final zzht zzU(zzkf zzkfVar) throws zzia {
        zzht zzU = super.zzU(zzkfVar);
        this.zzg.zzf(zzkfVar.zza, zzU);
        return zzU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x010c, code lost:
        if (true == r12) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010e, code lost:
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0110, code lost:
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0111, code lost:
        if (true == r12) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0113, code lost:
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0117, code lost:
        r3 = new android.graphics.Point(r13, r4);
     */
    @Override // com.google.android.gms.internal.ads.zzrt
    @android.annotation.TargetApi(17)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzrk zzX(com.google.android.gms.internal.ads.zzrp r20, com.google.android.gms.internal.ads.zzam r21, @androidx.annotation.Nullable android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzym.zzX(com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzrk");
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final List zzY(zzrv zzrvVar, zzam zzamVar, boolean z) throws zzsc {
        return zzsi.zzg(zzaP(this.zze, zzrvVar, zzamVar, false, false), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzZ(Exception exc) {
        zzer.zzc("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    public final void zzaE() {
        this.zzs = true;
        if (this.zzq) {
            return;
        }
        this.zzq = true;
        this.zzg.zzq(this.zzm);
        this.zzo = true;
    }

    public final void zzaF(zzrm zzrmVar, int i, long j) {
        int i2 = zzfn.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzrmVar.zzn(i, true);
        Trace.endSection();
        ((zzrt) this).zza.zze++;
        this.zzx = 0;
        if (this.zzh.zzl()) {
            return;
        }
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        zzaQ(this.zzE);
        zzaE();
    }

    @RequiresApi(21)
    public final void zzaG(zzrm zzrmVar, int i, long j, long j2) {
        int i2 = zzfn.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzrmVar.zzm(i, j2);
        Trace.endSection();
        ((zzrt) this).zza.zze++;
        this.zzx = 0;
        if (this.zzh.zzl()) {
            return;
        }
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        zzaQ(this.zzE);
        zzaE();
    }

    public final void zzaH(zzrm zzrmVar, int i, long j) {
        int i2 = zzfn.zza;
        Trace.beginSection("skipVideoBuffer");
        zzrmVar.zzn(i, false);
        Trace.endSection();
        ((zzrt) this).zza.zzf++;
    }

    public final void zzaI(int i, int i2) {
        zzhs zzhsVar = ((zzrt) this).zza;
        zzhsVar.zzh += i;
        int i3 = i + i2;
        zzhsVar.zzg += i3;
        this.zzw += i3;
        int i4 = this.zzx + i3;
        this.zzx = i4;
        zzhsVar.zzi = Math.max(i4, zzhsVar.zzi);
    }

    public final void zzaJ(long j) {
        zzhs zzhsVar = ((zzrt) this).zza;
        zzhsVar.zzk += j;
        zzhsVar.zzl++;
        this.zzB += j;
        this.zzC++;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzaa(String str, zzrk zzrkVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzk = zzaM(str);
        zzrp zzan = zzan();
        zzan.getClass();
        boolean z = false;
        if (zzfn.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzan.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzan.zzh();
            int length = zzh.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (zzh[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.zzl = z;
        this.zzh.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzab(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzac(zzam zzamVar, @Nullable MediaFormat mediaFormat) {
        zzrm zzal = zzal();
        if (zzal != null) {
            zzal.zzq(this.zzp);
        }
        mediaFormat.getClass();
        int i = 0;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzamVar.zzv;
        if (zzaU()) {
            int i2 = zzamVar.zzu;
            if (i2 == 90 || i2 == 270) {
                f = 1.0f / f;
                int i3 = integer2;
                integer2 = integer;
                integer = i3;
            }
        } else if (!this.zzh.zzl()) {
            i = zzamVar.zzu;
        }
        this.zzE = new zzdn(integer, integer2, i, f);
        this.zzf.zzc(zzamVar.zzt);
        if (this.zzh.zzl()) {
            zzyl zzylVar = this.zzh;
            zzak zzb2 = zzamVar.zzb();
            zzb2.zzX(integer);
            zzb2.zzF(integer2);
            zzb2.zzR(i);
            zzb2.zzP(f);
            zzylVar.zzi(zzb2.zzY());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzae() {
        this.zzq = false;
        int i = zzfn.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @CallSuper
    public final void zzaf(zzhi zzhiVar) throws zzia {
        this.zzy++;
        int i = zzfn.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final boolean zzah(long j, long j2, @Nullable zzrm zzrmVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zzia {
        boolean z3;
        int zzd2;
        boolean z4;
        zzrmVar.getClass();
        if (this.zzt == -9223372036854775807L) {
            this.zzt = j;
        }
        if (j3 != this.zzz) {
            if (!this.zzh.zzl()) {
                this.zzf.zzd(j3);
            }
            this.zzz = j3;
        }
        long zzak = j3 - zzak();
        if (z && !z2) {
            zzaH(zzrmVar, i, zzak);
            return true;
        }
        boolean z5 = zzbc() == 2;
        long zzaO = zzaO(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z5);
        if (this.zzm == this.zzn) {
            if (!zzaV(zzaO)) {
                return false;
            }
            zzaH(zzrmVar, i, zzak);
        } else if (!zzaW(j, zzaO)) {
            if (!z5 || j == this.zzt) {
                return false;
            }
            long nanoTime = System.nanoTime();
            long zza = this.zzf.zza(nanoTime + (zzaO * 1000));
            if (!this.zzh.zzl()) {
                zzaO = (zza - nanoTime) / 1000;
            }
            long j4 = this.zzu;
            if (zzaO < -500000 && !z2 && (zzd2 = zzd(j)) != 0) {
                if (j4 != -9223372036854775807L) {
                    zzhs zzhsVar = ((zzrt) this).zza;
                    zzhsVar.zzd += zzd2;
                    zzhsVar.zzf += this.zzy;
                } else {
                    ((zzrt) this).zza.zzj++;
                    zzaI(zzd2, this.zzy);
                }
                zzav();
                if (this.zzh.zzl()) {
                    this.zzh.zze();
                    return false;
                }
                return false;
            } else if (zzaN(zzaO, j2, z2)) {
                if (j4 != -9223372036854775807L) {
                    zzaH(zzrmVar, i, zzak);
                    z3 = true;
                } else {
                    int i4 = zzfn.zza;
                    Trace.beginSection("dropVideoBuffer");
                    zzrmVar.zzn(i, false);
                    Trace.endSection();
                    z3 = true;
                    zzaI(0, 1);
                }
                zzaJ(zzaO);
                return z3;
            } else if (this.zzh.zzl()) {
                this.zzh.zzg(j, j2);
                if (this.zzh.zzo(zzamVar, zzak, z2)) {
                    zzaT(zzrmVar, zzamVar, i, zzak, false);
                    return true;
                }
                return false;
            } else {
                if (zzfn.zza >= 21) {
                    if (zzaO < 50000) {
                        if (zza == this.zzD) {
                            zzaH(zzrmVar, i, zzak);
                        } else {
                            zzaG(zzrmVar, i, zzak, zza);
                        }
                        zzaJ(zzaO);
                        this.zzD = zza;
                        return true;
                    }
                } else if (zzaO < 30000) {
                    if (zzaO > 11000) {
                        try {
                            Thread.sleep(((-10000) + zzaO) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    zzaF(zzrmVar, i, zzak);
                }
                return false;
            }
        } else {
            if (!this.zzh.zzl()) {
                z4 = true;
            } else if (!this.zzh.zzo(zzamVar, zzak, z2)) {
                return false;
            } else {
                z4 = false;
            }
            zzaT(zzrmVar, zzamVar, i, zzak, z4);
        }
        zzaJ(zzaO);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final zzrn zzam(Throwable th, @Nullable zzrp zzrpVar) {
        return new zzyh(th, zzrpVar, this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @TargetApi(29)
    public final void zzao(zzhi zzhiVar) throws zzia {
        if (this.zzl) {
            ByteBuffer byteBuffer = zzhiVar.zze;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzrm zzal = zzal();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzal.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @CallSuper
    public final void zzaq(long j) {
        super.zzaq(j);
        this.zzy--;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @CallSuper
    public final void zzar(zzam zzamVar) throws zzia {
        if (this.zzh.zzl()) {
            return;
        }
        this.zzh.zzn(zzamVar, zzak());
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @CallSuper
    public final void zzat() {
        super.zzat();
        this.zzy = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final boolean zzax(zzrp zzrpVar) {
        return this.zzm != null || zzaX(zzrpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzla
    public final void zzq(int i, @Nullable Object obj) throws zzia {
        Surface surface;
        if (i != 1) {
            if (i == 7) {
                this.zzH = (zzyq) obj;
                return;
            } else if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.zzG != intValue) {
                    this.zzG = intValue;
                    return;
                }
                return;
            } else if (i == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.zzp = intValue2;
                zzrm zzal = zzal();
                if (zzal != null) {
                    zzal.zzq(intValue2);
                    return;
                }
                return;
            } else if (i == 5) {
                this.zzf.zzj(((Integer) obj).intValue());
                return;
            } else if (i == 13) {
                obj.getClass();
                this.zzh.zzk((List) obj);
                return;
            } else if (i != 14) {
                return;
            } else {
                obj.getClass();
                zzff zzffVar = (zzff) obj;
                if (zzffVar.zzb() == 0 || zzffVar.zza() == 0 || (surface = this.zzm) == null) {
                    return;
                }
                this.zzh.zzj(surface, zzffVar);
                return;
            }
        }
        zzyp zzypVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzypVar == null) {
            zzyp zzypVar2 = this.zzn;
            if (zzypVar2 != null) {
                zzypVar = zzypVar2;
            } else {
                zzrp zzan = zzan();
                if (zzan != null && zzaX(zzan)) {
                    zzypVar = zzyp.zza(this.zze, zzan.zzf);
                    this.zzn = zzypVar;
                }
            }
        }
        if (this.zzm == zzypVar) {
            if (zzypVar == null || zzypVar == this.zzn) {
                return;
            }
            zzaR();
            if (this.zzo) {
                this.zzg.zzq(this.zzm);
                return;
            }
            return;
        }
        this.zzm = zzypVar;
        this.zzf.zzi(zzypVar);
        this.zzo = false;
        int zzbc = zzbc();
        zzrm zzal2 = zzal();
        if (zzal2 != null && !this.zzh.zzl()) {
            if (zzfn.zza < 23 || zzypVar == null || this.zzk) {
                zzas();
                zzap();
            } else {
                zzal2.zzo(zzypVar);
            }
        }
        if (zzypVar == null || zzypVar == this.zzn) {
            this.zzF = null;
            this.zzq = false;
            int i2 = zzfn.zza;
            if (this.zzh.zzl()) {
                this.zzh.zzd();
                return;
            }
            return;
        }
        zzaR();
        this.zzq = false;
        int i3 = zzfn.zza;
        if (zzbc == 2) {
            this.zzu = -9223372036854775807L;
        }
        if (this.zzh.zzl()) {
            this.zzh.zzj(zzypVar, zzff.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzhr
    public final void zzt() {
        this.zzF = null;
        this.zzq = false;
        int i = zzfn.zza;
        this.zzo = false;
        try {
            super.zzt();
        } finally {
            this.zzg.zzc(((zzrt) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzhr
    public final void zzu(boolean z, boolean z2) throws zzia {
        super.zzu(z, z2);
        zzk();
        this.zzg.zze(((zzrt) this).zza);
        this.zzr = z2;
        this.zzs = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzhr
    public final void zzv(long j, boolean z) throws zzia {
        super.zzv(j, z);
        if (this.zzh.zzl()) {
            this.zzh.zze();
        }
        this.zzq = false;
        int i = zzfn.zza;
        this.zzf.zzf();
        this.zzz = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzx = 0;
        this.zzu = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzhr
    @TargetApi(17)
    public final void zzw() {
        try {
            super.zzw();
            if (this.zzh.zzl()) {
                this.zzh.zzh();
            }
            if (this.zzn != null) {
                zzaS();
            }
        } catch (Throwable th) {
            if (this.zzh.zzl()) {
                this.zzh.zzh();
            }
            if (this.zzn != null) {
                zzaS();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzx() {
        this.zzw = 0;
        this.zzv = SystemClock.elapsedRealtime();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zzB = 0L;
        this.zzC = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzy() {
        this.zzu = -9223372036854775807L;
        if (this.zzw > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzw, elapsedRealtime - this.zzv);
            this.zzw = 0;
            this.zzv = elapsedRealtime;
        }
        int i = this.zzC;
        if (i != 0) {
            this.zzg.zzr(this.zzB, i);
            this.zzB = 0L;
            this.zzC = 0;
        }
        this.zzf.zzh();
    }
}
