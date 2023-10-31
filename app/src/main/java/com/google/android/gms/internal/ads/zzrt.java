package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzrt extends zzhr {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    @Nullable
    private zzrr zzA;
    @Nullable
    private zzrp zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    @Nullable
    private zzrh zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    @Nullable
    private ByteBuffer zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    protected zzhs zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private long zzad;
    private long zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private zzrs zzai;
    private long zzaj;
    private boolean zzak;
    @Nullable
    private zzqs zzal;
    @Nullable
    private zzqs zzam;
    private final zzrl zzc;
    private final zzrv zzd;
    private final float zze;
    private final zzhi zzf;
    private final zzhi zzg;
    private final zzhi zzh;
    private final zzrg zzi;
    private final ArrayList zzj;
    private final MediaCodec.BufferInfo zzk;
    private final ArrayDeque zzl;
    private final zzqd zzm;
    @Nullable
    private zzam zzn;
    @Nullable
    private zzam zzo;
    @Nullable
    private MediaCrypto zzp;
    private boolean zzq;
    private long zzr;
    private float zzs;
    private float zzt;
    @Nullable
    private zzrm zzu;
    @Nullable
    private zzam zzv;
    @Nullable
    private MediaFormat zzw;
    private boolean zzx;
    private float zzy;
    @Nullable
    private ArrayDeque zzz;

    public zzrt(int i, zzrl zzrlVar, zzrv zzrvVar, boolean z, float f) {
        super(i);
        this.zzc = zzrlVar;
        zzrvVar.getClass();
        this.zzd = zzrvVar;
        this.zze = f;
        this.zzf = new zzhi(0, 0);
        this.zzg = new zzhi(0, 0);
        this.zzh = new zzhi(2, 0);
        zzrg zzrgVar = new zzrg();
        this.zzi = zzrgVar;
        this.zzj = new ArrayList();
        this.zzk = new MediaCodec.BufferInfo();
        this.zzs = 1.0f;
        this.zzt = 1.0f;
        this.zzr = -9223372036854775807L;
        this.zzl = new ArrayDeque();
        zzaD(zzrs.zza);
        zzrgVar.zzj(0);
        zzrgVar.zzb.order(ByteOrder.nativeOrder());
        this.zzm = new zzqd();
        this.zzy = -1.0f;
        this.zzC = 0;
        this.zzX = 0;
        this.zzO = -1;
        this.zzP = -1;
        this.zzN = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzaj = -9223372036854775807L;
        this.zzY = 0;
        this.zzZ = 0;
    }

    private final void zzV() {
        this.zzV = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzU = false;
        this.zzT = false;
        this.zzm.zzb();
    }

    private final void zzW() throws zzia {
        if (this.zzaa) {
            this.zzY = 1;
            this.zzZ = 3;
            return;
        }
        zzas();
        zzap();
    }

    @TargetApi(23)
    private final void zzaA() throws zzia {
        int i = this.zzZ;
        if (i == 1) {
            zzad();
        } else if (i == 2) {
            zzad();
            zzaE();
        } else if (i != 3) {
            this.zzag = true;
            zzag();
        } else {
            zzas();
            zzap();
        }
    }

    private final void zzaB() {
        this.zzO = -1;
        this.zzg.zzb = null;
    }

    private final void zzaC() {
        this.zzP = -1;
        this.zzQ = null;
    }

    private final void zzaD(zzrs zzrsVar) {
        this.zzai = zzrsVar;
        if (zzrsVar.zzc != -9223372036854775807L) {
            this.zzak = true;
        }
    }

    @RequiresApi(23)
    private final void zzaE() throws zzia {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzbe(e, this.zzn, false, 6006);
        }
    }

    @TargetApi(23)
    private final boolean zzaF() throws zzia {
        if (this.zzaa) {
            this.zzY = 1;
            if (this.zzE || this.zzG) {
                this.zzZ = 3;
                return false;
            }
            this.zzZ = 2;
        } else {
            zzaE();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaG() throws zzia {
        zzrm zzrmVar = this.zzu;
        boolean z = 0;
        if (zzrmVar == null || this.zzY == 2 || this.zzaf) {
            return false;
        }
        if (this.zzO < 0) {
            int zza = zzrmVar.zza();
            this.zzO = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzu.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzY == 1) {
            if (!this.zzL) {
                this.zzab = true;
                this.zzu.zzj(this.zzO, 0, 0, 0L, 4);
                zzaB();
            }
            this.zzY = 2;
            return false;
        } else if (this.zzJ) {
            this.zzJ = false;
            this.zzg.zzb.put(zzb);
            this.zzu.zzj(this.zzO, 0, 38, 0L, 0);
            zzaB();
            this.zzaa = true;
            return true;
        } else {
            if (this.zzX == 1) {
                for (int i = 0; i < this.zzv.zzo.size(); i++) {
                    this.zzg.zzb.put((byte[]) this.zzv.zzo.get(i));
                }
                this.zzX = 2;
            }
            int position = this.zzg.zzb.position();
            zzkf zzh = zzh();
            try {
                int zzbd = zzbd(zzh, this.zzg, 0);
                if (zzI() || this.zzg.zzi()) {
                    this.zzae = this.zzad;
                }
                if (zzbd == -3) {
                    return false;
                }
                if (zzbd == -5) {
                    if (this.zzX == 2) {
                        this.zzg.zzb();
                        this.zzX = 1;
                    }
                    zzU(zzh);
                    return true;
                }
                zzhi zzhiVar = this.zzg;
                if (zzhiVar.zzg()) {
                    if (this.zzX == 2) {
                        zzhiVar.zzb();
                        this.zzX = 1;
                    }
                    this.zzaf = true;
                    if (!this.zzaa) {
                        zzaA();
                        return false;
                    }
                    try {
                        if (!this.zzL) {
                            this.zzab = true;
                            this.zzu.zzj(this.zzO, 0, 0, 0L, 4);
                            zzaB();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw zzbe(e, this.zzn, false, zzfn.zzh(e.getErrorCode()));
                    }
                } else if (!this.zzaa && !zzhiVar.zzh()) {
                    zzhiVar.zzb();
                    if (this.zzX == 2) {
                        this.zzX = 1;
                    }
                    return true;
                } else {
                    boolean zzl = zzhiVar.zzl();
                    if (zzl) {
                        zzhiVar.zza.zzb(position);
                    }
                    if (this.zzD && !zzl) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzew.zza;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            int i5 = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (i5 == 1) {
                                    if ((byteBuffer.get(i4) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    i5 = 1;
                                }
                            } else if (i5 == 0) {
                                i3++;
                            }
                            if (i5 != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzD = false;
                    }
                    zzhi zzhiVar2 = this.zzg;
                    long j = zzhiVar2.zzd;
                    zzrh zzrhVar = this.zzM;
                    if (zzrhVar != null) {
                        j = zzrhVar.zzb(this.zzn, zzhiVar2);
                        this.zzad = Math.max(this.zzad, this.zzM.zza(this.zzn));
                    }
                    long j2 = j;
                    if (this.zzg.zzf()) {
                        this.zzj.add(Long.valueOf(j2));
                    }
                    if (this.zzah) {
                        (!this.zzl.isEmpty() ? (zzrs) this.zzl.peekLast() : this.zzai).zzd.zzd(j2, this.zzn);
                        this.zzah = false;
                    }
                    this.zzad = Math.max(this.zzad, j2);
                    this.zzg.zzk();
                    zzhi zzhiVar3 = this.zzg;
                    if (zzhiVar3.zze()) {
                        zzao(zzhiVar3);
                    }
                    zzaf(this.zzg);
                    try {
                        if (zzl) {
                            this.zzu.zzk(this.zzO, 0, this.zzg.zza, j2, 0);
                        } else {
                            this.zzu.zzj(this.zzO, 0, this.zzg.zzb.limit(), j2, 0);
                        }
                        zzaB();
                        this.zzaa = true;
                        this.zzX = 0;
                        zzhs zzhsVar = this.zza;
                        z = zzhsVar.zzc + 1;
                        zzhsVar.zzc = z;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw zzbe(e2, this.zzn, z, zzfn.zzh(e2.getErrorCode()));
                    }
                }
            } catch (zzhh e3) {
                zzZ(e3);
                zzaI(0);
                zzad();
                return true;
            }
        }
    }

    private final boolean zzaH() {
        return this.zzP >= 0;
    }

    private final boolean zzaI(int i) throws zzia {
        zzkf zzh = zzh();
        this.zzf.zzb();
        int zzbd = zzbd(zzh, this.zzf, i | 4);
        if (zzbd == -5) {
            zzU(zzh);
            return true;
        } else if (zzbd == -4 && this.zzf.zzg()) {
            this.zzaf = true;
            zzaA();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzaJ(long j) {
        return this.zzr == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.zzr;
    }

    private final boolean zzaK(zzam zzamVar) throws zzia {
        if (zzfn.zza >= 23 && this.zzu != null && this.zzZ != 3 && zzbc() != 0) {
            float zzR = zzR(this.zzt, zzamVar, zzL());
            float f = this.zzy;
            if (f == zzR) {
                return true;
            }
            if (zzR == -1.0f) {
                zzW();
                return false;
            } else if (f == -1.0f && zzR <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzR);
                this.zzu.zzp(bundle);
                this.zzy = zzR;
            }
        }
        return true;
    }

    private final void zzad() {
        try {
            this.zzu.zzi();
        } finally {
            zzat();
        }
    }

    public static boolean zzay(zzam zzamVar) {
        return zzamVar.zzF == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0334, code lost:
        if ("stvm8".equals(r5) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0344, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x041b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaz(com.google.android.gms.internal.ads.zzrp r19, android.media.MediaCrypto r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrt.zzaz(com.google.android.gms.internal.ads.zzrp, android.media.MediaCrypto):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzle
    public void zzF(float f, float f2) throws zzia {
        this.zzs = f;
        this.zzt = f2;
        zzaK(this.zzv);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01be, code lost:
        if (r15.zzY == r11) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0286, code lost:
        if (r15.zzo != null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        r15.zzag = true;
        r13 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0331 A[LOOP:2: B:87:0x015a->B:195:0x0331, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0343 A[Catch: IllegalStateException -> 0x0375, TryCatch #6 {IllegalStateException -> 0x0375, blocks: (B:192:0x032a, B:197:0x033d, B:199:0x0343, B:201:0x0349, B:188:0x0312, B:190:0x0324, B:208:0x035b), top: B:254:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x033a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v26 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v36 */
    /* JADX WARN: Type inference failed for: r19v37 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // com.google.android.gms.internal.ads.zzle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzN(long r24, long r26) throws com.google.android.gms.internal.ads.zzia {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrt.zzN(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public boolean zzO() {
        return this.zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public boolean zzP() {
        if (this.zzn != null) {
            if (zzK() || zzaH()) {
                return true;
            }
            return this.zzN != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzN;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlf
    public final int zzQ(zzam zzamVar) throws zzia {
        try {
            return zzS(this.zzd, zzamVar);
        } catch (zzsc e) {
            throw zzbe(e, zzamVar, false, 4002);
        }
    }

    public float zzR(float f, zzam zzamVar, zzam[] zzamVarArr) {
        throw null;
    }

    public abstract int zzS(zzrv zzrvVar, zzam zzamVar) throws zzsc;

    public zzht zzT(zzrp zzrpVar, zzam zzamVar, zzam zzamVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
        if (zzaF() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
        if (zzaF() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
        if (zzaF() == false) goto L31;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzht zzU(com.google.android.gms.internal.ads.zzkf r12) throws com.google.android.gms.internal.ads.zzia {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrt.zzU(com.google.android.gms.internal.ads.zzkf):com.google.android.gms.internal.ads.zzht");
    }

    public abstract zzrk zzX(zzrp zzrpVar, zzam zzamVar, @Nullable MediaCrypto mediaCrypto, float f);

    public abstract List zzY(zzrv zzrvVar, zzam zzamVar, boolean z) throws zzsc;

    public void zzZ(Exception exc) {
        throw null;
    }

    public void zzaa(String str, zzrk zzrkVar, long j, long j2) {
        throw null;
    }

    public void zzab(String str) {
        throw null;
    }

    public void zzac(zzam zzamVar, @Nullable MediaFormat mediaFormat) throws zzia {
        throw null;
    }

    public void zzae() {
    }

    public void zzaf(zzhi zzhiVar) throws zzia {
        throw null;
    }

    public void zzag() throws zzia {
    }

    public abstract boolean zzah(long j, long j2, @Nullable zzrm zzrmVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zzia;

    public boolean zzai(zzam zzamVar) {
        return false;
    }

    public final float zzaj() {
        return this.zzs;
    }

    public final long zzak() {
        return this.zzai.zzc;
    }

    @Nullable
    public final zzrm zzal() {
        return this.zzu;
    }

    public zzrn zzam(Throwable th, @Nullable zzrp zzrpVar) {
        return new zzrn(th, zzrpVar);
    }

    @Nullable
    public final zzrp zzan() {
        return this.zzB;
    }

    public void zzao(zzhi zzhiVar) throws zzia {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[Catch: zzrr -> 0x0119, TryCatch #3 {zzrr -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:80:0x0065, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[Catch: zzrr -> 0x0119, TryCatch #3 {zzrr -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:80:0x0065, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzap() throws com.google.android.gms.internal.ads.zzia {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrt.zzap():void");
    }

    @CallSuper
    public void zzaq(long j) {
        this.zzaj = j;
        while (!this.zzl.isEmpty() && j >= ((zzrs) this.zzl.peek()).zzb) {
            zzaD((zzrs) this.zzl.poll());
            zzae();
        }
    }

    public void zzar(zzam zzamVar) throws zzia {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzrm, android.media.MediaCrypto, com.google.android.gms.internal.ads.zzqs] */
    public final void zzas() {
        try {
            zzrm zzrmVar = this.zzu;
            if (zzrmVar != null) {
                zzrmVar.zzl();
                this.zza.zzb++;
                zzab(this.zzB.zza);
            }
        } finally {
            this.zzu = null;
            this.zzp = null;
            this.zzal = null;
            zzau();
        }
    }

    @CallSuper
    public void zzat() {
        zzaB();
        zzaC();
        this.zzN = -9223372036854775807L;
        this.zzab = false;
        this.zzaa = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzR = false;
        this.zzS = false;
        this.zzj.clear();
        this.zzad = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzaj = -9223372036854775807L;
        zzrh zzrhVar = this.zzM;
        if (zzrhVar != null) {
            zzrhVar.zzc();
        }
        this.zzY = 0;
        this.zzZ = 0;
        this.zzX = this.zzW ? 1 : 0;
    }

    @CallSuper
    public final void zzau() {
        zzat();
        this.zzM = null;
        this.zzz = null;
        this.zzB = null;
        this.zzv = null;
        this.zzw = null;
        this.zzx = false;
        this.zzac = false;
        this.zzy = -1.0f;
        this.zzC = 0;
        this.zzD = false;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzL = false;
        this.zzW = false;
        this.zzX = 0;
        this.zzq = false;
    }

    public final boolean zzav() throws zzia {
        boolean zzaw = zzaw();
        if (zzaw) {
            zzap();
        }
        return zzaw;
    }

    public final boolean zzaw() {
        if (this.zzu == null) {
            return false;
        }
        int i = this.zzZ;
        if (i == 3 || this.zzE || ((this.zzF && !this.zzac) || (this.zzG && this.zzab))) {
            zzas();
            return true;
        }
        if (i == 2) {
            int i2 = zzfn.zza;
            zzdy.zzf(i2 >= 23);
            if (i2 >= 23) {
                try {
                    zzaE();
                } catch (zzia e) {
                    zzer.zzf("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzas();
                    return true;
                }
            }
        }
        zzad();
        return false;
    }

    public boolean zzax(zzrp zzrpVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzlf
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzt() {
        this.zzn = null;
        zzaD(zzrs.zza);
        this.zzl.clear();
        zzaw();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzu(boolean z, boolean z2) throws zzia {
        this.zza = new zzhs();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzv(long j, boolean z) throws zzia {
        this.zzaf = false;
        this.zzag = false;
        if (this.zzT) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzU = false;
        } else {
            zzav();
        }
        zzfk zzfkVar = this.zzai.zzd;
        if (zzfkVar.zza() > 0) {
            this.zzah = true;
        }
        zzfkVar.zze();
        this.zzl.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzw() {
        try {
            zzV();
            zzas();
        } finally {
            this.zzam = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzz(com.google.android.gms.internal.ads.zzam[] r13, long r14, long r16) throws com.google.android.gms.internal.ads.zzia {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zzrs r1 = r0.zzai
            long r1 = r1.zzc
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.zzrs r1 = new com.google.android.gms.internal.ads.zzrs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaD(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.zzl
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.zzad
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.zzaj
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.zzrs r1 = new com.google.android.gms.internal.ads.zzrs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaD(r1)
            com.google.android.gms.internal.ads.zzrs r1 = r0.zzai
            long r1 = r1.zzc
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.zzae()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.zzl
            com.google.android.gms.internal.ads.zzrs r9 = new com.google.android.gms.internal.ads.zzrs
            long r3 = r0.zzad
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrt.zzz(com.google.android.gms.internal.ads.zzam[], long, long):void");
    }
}
