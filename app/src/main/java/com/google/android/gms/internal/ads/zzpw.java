package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzpw implements zzoz {
    private static final Object zza = new Object();
    @Nullable
    @GuardedBy("releaseExecutorLock")
    private static ExecutorService zzb;
    @GuardedBy("releaseExecutorLock")
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private float zzI;
    @Nullable
    private ByteBuffer zzJ;
    private int zzK;
    @Nullable
    private ByteBuffer zzL;
    private byte[] zzM;
    private int zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzl zzT;
    @Nullable
    private zzpi zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private final zzpm zzY;
    private final zzpe zzd;
    private final zzqg zze;
    private final zzfrr zzf;
    private final zzfrr zzg;
    private final zzeb zzh;
    private final zzpd zzi;
    private final ArrayDeque zzj;
    private zzpu zzk;
    private final zzpp zzl;
    private final zzpp zzm;
    private final zzpj zzn;
    @Nullable
    private zzof zzo;
    @Nullable
    private zzow zzp;
    @Nullable
    private zzpl zzq;
    private zzpl zzr;
    private zzdo zzs;
    @Nullable
    private AudioTrack zzt;
    private zzoh zzu;
    private zzk zzv;
    @Nullable
    private zzpo zzw;
    private zzpo zzx;
    private zzci zzy;
    private boolean zzz;

    public /* synthetic */ zzpw(zzpk zzpkVar, zzpv zzpvVar) {
        zzoh zzohVar;
        zzpm zzpmVar;
        zzohVar = zzpkVar.zzb;
        this.zzu = zzohVar;
        zzpmVar = zzpkVar.zzc;
        this.zzY = zzpmVar;
        int i = zzfn.zza;
        this.zzn = zzpkVar.zza;
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zzh = zzebVar;
        zzebVar.zze();
        this.zzi = new zzpd(new zzpr(this, null));
        zzpe zzpeVar = new zzpe();
        this.zzd = zzpeVar;
        zzqg zzqgVar = new zzqg();
        this.zze = zzqgVar;
        this.zzf = zzfrr.zzo(new zzdv(), zzpeVar, zzqgVar);
        this.zzg = zzfrr.zzm(new zzqf());
        this.zzI = 1.0f;
        this.zzv = zzk.zza;
        this.zzS = 0;
        this.zzT = new zzl(0, 0.0f);
        zzci zzciVar = zzci.zza;
        this.zzx = new zzpo(zzciVar, 0L, 0L, null);
        this.zzy = zzciVar;
        this.zzz = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzpp(100L);
        this.zzm = new zzpp(100L);
    }

    public static /* bridge */ /* synthetic */ AudioTrack zzB(zzpw zzpwVar) {
        return zzpwVar.zzt;
    }

    public static /* bridge */ /* synthetic */ zzow zzC(zzpw zzpwVar) {
        return zzpwVar.zzp;
    }

    public static /* synthetic */ void zzD(AudioTrack audioTrack, zzeb zzebVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzebVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzebVar.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzE(zzpw zzpwVar) {
        return zzpwVar.zzQ;
    }

    public final long zzF() {
        zzpl zzplVar = this.zzr;
        return zzplVar.zzc == 0 ? this.zzA / zzplVar.zzb : this.zzB;
    }

    public final long zzG() {
        zzpl zzplVar = this.zzr;
        return zzplVar.zzc == 0 ? this.zzC / zzplVar.zzd : this.zzD;
    }

    private final AudioTrack zzH(zzpl zzplVar) throws zzov {
        try {
            return zzplVar.zzb(false, this.zzv, this.zzS);
        } catch (zzov e) {
            zzow zzowVar = this.zzp;
            if (zzowVar != null) {
                zzowVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzI(long j) {
        zzci zzciVar;
        boolean z;
        zzos zzosVar;
        if (zzS()) {
            zzpm zzpmVar = this.zzY;
            zzciVar = this.zzy;
            zzpmVar.zzc(zzciVar);
        } else {
            zzciVar = zzci.zza;
        }
        zzci zzciVar2 = zzciVar;
        this.zzy = zzciVar2;
        if (zzS()) {
            zzpm zzpmVar2 = this.zzY;
            z = this.zzz;
            zzpmVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzz = z;
        this.zzj.add(new zzpo(zzciVar2, Math.max(0L, j), this.zzr.zza(zzG()), null));
        zzN();
        zzow zzowVar = this.zzp;
        if (zzowVar != null) {
            boolean z2 = this.zzz;
            zzosVar = ((zzqb) zzowVar).zza.zzc;
            zzosVar.zzs(z2);
        }
    }

    private final void zzJ() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        this.zzi.zzc(zzG());
        this.zzt.stop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0026, code lost:
        r0 = r2.zzJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0028, code lost:
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x002e, code lost:
        if (r0.hasRemaining() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0031, code lost:
        r2.zzs.zze(r2.zzJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0039, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzK(long r3) throws com.google.android.gms.internal.ads.zzoy {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.zzdo r0 = r2.zzs
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L3a
        L8:
            com.google.android.gms.internal.ads.zzdo r0 = r2.zzs
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L39
        L10:
            com.google.android.gms.internal.ads.zzdo r0 = r2.zzs
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L26
            r2.zzO(r0, r3)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L10
            return
        L26:
            java.nio.ByteBuffer r0 = r2.zzJ
            if (r0 == 0) goto L39
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L31
            goto L39
        L31:
            com.google.android.gms.internal.ads.zzdo r0 = r2.zzs
            java.nio.ByteBuffer r1 = r2.zzJ
            r0.zze(r1)
            goto L8
        L39:
            return
        L3a:
            java.nio.ByteBuffer r0 = r2.zzJ
            if (r0 != 0) goto L40
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzdr.zza
        L40:
            r2.zzO(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpw.zzK(long):void");
    }

    private final void zzL(zzci zzciVar) {
        zzpo zzpoVar = new zzpo(zzciVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzQ()) {
            this.zzw = zzpoVar;
        } else {
            this.zzx = zzpoVar;
        }
    }

    private final void zzM() {
        if (zzQ()) {
            if (zzfn.zza >= 21) {
                this.zzt.setVolume(this.zzI);
                return;
            }
            AudioTrack audioTrack = this.zzt;
            float f = this.zzI;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzN() {
        zzdo zzdoVar = this.zzr.zzi;
        this.zzs = zzdoVar;
        zzdoVar.zzc();
    }

    private final void zzO(ByteBuffer byteBuffer, long j) throws zzoy {
        int write;
        zzow zzowVar;
        zzld zzldVar;
        zzld zzldVar2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzL;
            if (byteBuffer2 != null) {
                zzdy.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzL = byteBuffer;
                if (zzfn.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzM;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzM = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzM, 0, remaining);
                    byteBuffer.position(position);
                    this.zzN = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i = zzfn.zza;
            if (i < 21) {
                int zza2 = this.zzi.zza(this.zzC);
                if (zza2 > 0) {
                    write = this.zzt.write(this.zzM, this.zzN, Math.min(remaining2, zza2));
                    if (write > 0) {
                        this.zzN += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzt.write(byteBuffer, remaining2, 1);
            }
            this.zzV = SystemClock.elapsedRealtime();
            if (write < 0) {
                if (((i < 24 || write != -6) && write != -32) || this.zzD <= 0) {
                    r0 = false;
                }
                zzoy zzoyVar = new zzoy(write, this.zzr.zza, r0);
                zzow zzowVar2 = this.zzp;
                if (zzowVar2 != null) {
                    zzowVar2.zza(zzoyVar);
                }
                if (zzoyVar.zzb) {
                    this.zzu = zzoh.zza;
                    throw zzoyVar;
                } else {
                    this.zzm.zzb(zzoyVar);
                    return;
                }
            }
            this.zzm.zza();
            if (zzR(this.zzt)) {
                if (this.zzD > 0) {
                    this.zzX = false;
                }
                if (this.zzQ && (zzowVar = this.zzp) != null && write < remaining2 && !this.zzX) {
                    zzqc zzqcVar = ((zzqb) zzowVar).zza;
                    zzldVar = zzqcVar.zzm;
                    if (zzldVar != null) {
                        zzldVar2 = zzqcVar.zzm;
                        zzldVar2.zza();
                    }
                }
            }
            int i2 = this.zzr.zzc;
            if (i2 == 0) {
                this.zzC += write;
            }
            if (write == remaining2) {
                if (i2 != 0) {
                    zzdy.zzf(byteBuffer == this.zzJ);
                    this.zzD = (this.zzE * this.zzK) + this.zzD;
                }
                this.zzL = null;
            }
        }
    }

    private final boolean zzP() throws zzoy {
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer == null) {
                return true;
            }
            zzO(byteBuffer, Long.MIN_VALUE);
            return this.zzL == null;
        }
        this.zzs.zzd();
        zzK(Long.MIN_VALUE);
        if (this.zzs.zzg()) {
            ByteBuffer byteBuffer2 = this.zzL;
            return byteBuffer2 == null || !byteBuffer2.hasRemaining();
        }
        return false;
    }

    private final boolean zzQ() {
        return this.zzt != null;
    }

    private static boolean zzR(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (zzfn.zza >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            return isOffloadedPlayback;
        }
        return false;
    }

    private final boolean zzS() {
        zzpl zzplVar = this.zzr;
        if (zzplVar.zzc == 0) {
            int i = zzplVar.zza.zzB;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final int zza(zzam zzamVar) {
        if (!"audio/raw".equals(zzamVar.zzm)) {
            if (!this.zzW) {
                int i = zzfn.zza;
            }
            return this.zzu.zza(zzamVar) != null ? 2 : 0;
        }
        boolean zzC = zzfn.zzC(zzamVar.zzB);
        int i2 = zzamVar.zzB;
        if (zzC) {
            return i2 != 2 ? 1 : 2;
        }
        zzer.zze("DefaultAudioSink", "Invalid PCM encoding: " + i2);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final long zzb(boolean z) {
        long zzm;
        if (!zzQ() || this.zzG) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzi.zzb(z), this.zzr.zza(zzG()));
        while (!this.zzj.isEmpty() && min >= ((zzpo) this.zzj.getFirst()).zzc) {
            this.zzx = (zzpo) this.zzj.remove();
        }
        zzpo zzpoVar = this.zzx;
        long j = min - zzpoVar.zzc;
        if (zzpoVar.zza.equals(zzci.zza)) {
            zzm = this.zzx.zzb + j;
        } else if (this.zzj.isEmpty()) {
            zzm = this.zzY.zza(j) + this.zzx.zzb;
        } else {
            zzpo zzpoVar2 = (zzpo) this.zzj.getFirst();
            zzm = zzpoVar2.zzb - zzfn.zzm(zzpoVar2.zzc - min, this.zzx.zza.zzc);
        }
        return zzm + this.zzr.zza(this.zzY.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final zzci zzc() {
        return this.zzy;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    @Override // com.google.android.gms.internal.ads.zzoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzam r19, int r20, @androidx.annotation.Nullable int[] r21) throws com.google.android.gms.internal.ads.zzou {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpw.zzd(com.google.android.gms.internal.ads.zzam, int, int[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zze() {
        if (zzQ()) {
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzX = false;
            this.zzE = 0;
            this.zzx = new zzpo(this.zzy, 0L, 0L, null);
            this.zzH = 0L;
            this.zzw = null;
            this.zzj.clear();
            this.zzJ = null;
            this.zzK = 0;
            this.zzL = null;
            this.zzP = false;
            this.zzO = false;
            this.zze.zzp();
            zzN();
            if (this.zzi.zzh()) {
                this.zzt.pause();
            }
            if (zzR(this.zzt)) {
                zzpu zzpuVar = this.zzk;
                zzpuVar.getClass();
                zzpuVar.zzb(this.zzt);
            }
            if (zzfn.zza < 21 && !this.zzR) {
                this.zzS = 0;
            }
            zzpl zzplVar = this.zzq;
            if (zzplVar != null) {
                this.zzr = zzplVar;
                this.zzq = null;
            }
            this.zzi.zzd();
            final AudioTrack audioTrack = this.zzt;
            final zzeb zzebVar = this.zzh;
            zzebVar.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzfn.zzz("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpw.zzD(audioTrack, zzebVar);
                    }
                });
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzf() {
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzg() {
        this.zzQ = false;
        if (zzQ() && this.zzi.zzk()) {
            this.zzt.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzh() {
        this.zzQ = true;
        if (zzQ()) {
            this.zzi.zzf();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzi() throws zzoy {
        if (!this.zzO && zzQ() && zzP()) {
            zzJ();
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzj() {
        zze();
        zzfrr zzfrrVar = this.zzf;
        int size = zzfrrVar.size();
        for (int i = 0; i < size; i++) {
            ((zzdr) zzfrrVar.get(i)).zzf();
        }
        zzfrr zzfrrVar2 = this.zzg;
        int size2 = zzfrrVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzdr) zzfrrVar2.get(i2)).zzf();
        }
        zzdo zzdoVar = this.zzs;
        if (zzdoVar != null) {
            zzdoVar.zzf();
        }
        this.zzQ = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzk(zzk zzkVar) {
        if (this.zzv.equals(zzkVar)) {
            return;
        }
        this.zzv = zzkVar;
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzl(int i) {
        if (this.zzS != i) {
            this.zzS = i;
            this.zzR = i != 0;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzm(zzl zzlVar) {
        if (this.zzT.equals(zzlVar)) {
            return;
        }
        int i = zzlVar.zza;
        if (this.zzt != null) {
            int i2 = this.zzT.zza;
        }
        this.zzT = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzn(zzow zzowVar) {
        this.zzp = zzowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzo(zzci zzciVar) {
        this.zzy = new zzci(Math.max(0.1f, Math.min(zzciVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzciVar.zzd, 8.0f)));
        zzL(zzciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzp(@Nullable zzof zzofVar) {
        this.zzo = zzofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    @RequiresApi(23)
    public final void zzq(@Nullable AudioDeviceInfo audioDeviceInfo) {
        zzpi zzpiVar = audioDeviceInfo == null ? null : new zzpi(audioDeviceInfo);
        this.zzU = zzpiVar;
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzpg.zza(audioTrack, zzpiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzr(boolean z) {
        this.zzz = z;
        zzL(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzs(float f) {
        if (this.zzI != f) {
            this.zzI = f;
            zzM();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:380:0x037f A[Catch: zzov -> 0x0383, TryCatch #3 {zzov -> 0x0383, blocks: (B:236:0x0089, B:249:0x00ce, B:251:0x00d6, B:253:0x00dc, B:254:0x00e3, B:255:0x00f5, B:257:0x00fb, B:259:0x00ff, B:260:0x0104, B:264:0x011a, B:268:0x0132, B:269:0x0137, B:245:0x009e, B:247:0x00a7, B:378:0x0377, B:380:0x037f, B:381:0x0382, B:239:0x0092, B:241:0x0097), top: B:395:0x0089, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.zzoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(java.nio.ByteBuffer r23, long r24, int r26) throws com.google.android.gms.internal.ads.zzov, com.google.android.gms.internal.ads.zzoy {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpw.zzt(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final boolean zzu() {
        return zzQ() && this.zzi.zzg(zzG());
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final boolean zzv() {
        if (zzQ()) {
            return this.zzO && !zzu();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final boolean zzw(zzam zzamVar) {
        return zza(zzamVar) != 0;
    }
}
