package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.C6660u;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zzafn implements zzaao {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzafj
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzafn(0)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    @Nullable
    private zzafm zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    @Nullable
    private zzes zzJ;
    @Nullable
    private zzes zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzaar zzai;
    private final zzafi zzh;
    private final zzafp zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzfd zzl;
    private final zzfd zzm;
    private final zzfd zzn;
    private final zzfd zzo;
    private final zzfd zzp;
    private final zzfd zzq;
    private final zzfd zzr;
    private final zzfd zzs;
    private final zzfd zzt;
    private final zzfd zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzfn.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfol.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        C6660u.m6129a(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzafn() {
        this(0);
    }

    public zzafn(int i) {
        zzafg zzafgVar = new zzafg();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzafgVar;
        zzafgVar.zza(new zzafl(this, null));
        this.zzk = true;
        this.zzi = new zzafp();
        this.zzj = new SparseArray();
        this.zzn = new zzfd(4);
        this.zzo = new zzfd(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzfd(4);
        this.zzl = new zzfd(zzew.zza);
        this.zzm = new zzfd(4);
        this.zzq = new zzfd();
        this.zzr = new zzfd();
        this.zzs = new zzfd(8);
        this.zzt = new zzfd();
        this.zzu = new zzfd();
        this.zzS = new int[1];
    }

    @RequiresNonNull({"#2.output"})
    private final int zzn(zzaap zzaapVar, zzafm zzafmVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzafmVar.zzb)) {
            zzv(zzaapVar, zzb, i);
        } else if ("S_TEXT/ASS".equals(zzafmVar.zzb)) {
            zzv(zzaapVar, zzd, i);
        } else if ("S_TEXT/WEBVTT".equals(zzafmVar.zzb)) {
            zzv(zzaapVar, zze, i);
        } else {
            zzabr zzabrVar = zzafmVar.zzV;
            if (!this.zzac) {
                if (zzafmVar.zzg) {
                    this.zzV &= -1073741825;
                    if (!this.zzad) {
                        ((zzaae) zzaapVar).zzn(this.zzn.zzH(), 0, 1, false);
                        this.zzZ++;
                        if ((this.zzn.zzH()[0] & 128) == 128) {
                            throw zzce.zza("Extension bit is set in signal byte", null);
                        }
                        this.zzag = this.zzn.zzH()[0];
                        this.zzad = true;
                    }
                    byte b = this.zzag;
                    if ((b & 1) == 1) {
                        int i3 = b & 2;
                        this.zzV |= 1073741824;
                        if (!this.zzah) {
                            ((zzaae) zzaapVar).zzn(this.zzs.zzH(), 0, 8, false);
                            this.zzZ += 8;
                            this.zzah = true;
                            this.zzn.zzH()[0] = (byte) ((i3 != 2 ? 0 : 128) | 8);
                            this.zzn.zzF(0);
                            zzabrVar.zzr(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzF(0);
                            zzabrVar.zzr(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (i3 == 2) {
                            if (!this.zzae) {
                                ((zzaae) zzaapVar).zzn(this.zzn.zzH(), 0, 1, false);
                                this.zzZ++;
                                this.zzn.zzF(0);
                                this.zzaf = this.zzn.zzk();
                                this.zzae = true;
                            }
                            int i4 = this.zzaf * 4;
                            this.zzn.zzC(i4);
                            ((zzaae) zzaapVar).zzn(this.zzn.zzH(), 0, i4, false);
                            this.zzZ += i4;
                            int i5 = (this.zzaf >> 1) + 1;
                            int i6 = (i5 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                this.zzv = ByteBuffer.allocate(i6);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i5);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i2 = this.zzaf;
                                if (i7 >= i2) {
                                    break;
                                }
                                int zzn = this.zzn.zzn();
                                if (i7 % 2 == 0) {
                                    this.zzv.putShort((short) (zzn - i8));
                                } else {
                                    this.zzv.putInt(zzn - i8);
                                }
                                i7++;
                                i8 = zzn;
                            }
                            int i9 = (i - this.zzZ) - i8;
                            if ((i2 & 1) == 1) {
                                this.zzv.putInt(i9);
                            } else {
                                this.zzv.putShort((short) i9);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzD(this.zzv.array(), i6);
                            zzabrVar.zzr(this.zzt, i6, 1);
                            this.zzaa += i6;
                        }
                    }
                } else {
                    byte[] bArr = zzafmVar.zzh;
                    if (bArr != null) {
                        this.zzq.zzD(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzafmVar.zzb) ? zzafmVar.zzf > 0 : z) {
                    this.zzV |= 268435456;
                    this.zzu.zzC(0);
                    int zzd2 = (this.zzq.zzd() + i) - this.zzZ;
                    this.zzn.zzC(4);
                    this.zzn.zzH()[0] = (byte) ((zzd2 >> 24) & 255);
                    this.zzn.zzH()[1] = (byte) ((zzd2 >> 16) & 255);
                    this.zzn.zzH()[2] = (byte) ((zzd2 >> 8) & 255);
                    this.zzn.zzH()[3] = (byte) (zzd2 & 255);
                    zzabrVar.zzr(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int zzd3 = this.zzq.zzd() + i;
            if (!"V_MPEG4/ISO/AVC".equals(zzafmVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzafmVar.zzb)) {
                if (zzafmVar.zzS != null) {
                    zzdy.zzf(this.zzq.zzd() == 0);
                    zzafmVar.zzS.zzd(zzaapVar);
                }
                while (true) {
                    int i10 = this.zzZ;
                    if (i10 >= zzd3) {
                        break;
                    }
                    int zzo = zzo(zzaapVar, zzabrVar, zzd3 - i10);
                    this.zzZ += zzo;
                    this.zzaa += zzo;
                }
            } else {
                byte[] zzH = this.zzm.zzH();
                zzH[0] = 0;
                zzH[1] = 0;
                zzH[2] = 0;
                int i11 = zzafmVar.zzW;
                int i12 = 4 - i11;
                while (this.zzZ < zzd3) {
                    int i13 = this.zzab;
                    if (i13 == 0) {
                        int min = Math.min(i11, this.zzq.zza());
                        ((zzaae) zzaapVar).zzn(zzH, i12 + min, i11 - min, false);
                        if (min > 0) {
                            this.zzq.zzB(zzH, i12, min);
                        }
                        this.zzZ += i11;
                        this.zzm.zzF(0);
                        this.zzab = this.zzm.zzn();
                        this.zzl.zzF(0);
                        zzabp.zzb(zzabrVar, this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int zzo2 = zzo(zzaapVar, zzabrVar, i13);
                        this.zzZ += zzo2;
                        this.zzaa += zzo2;
                        this.zzab -= zzo2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzafmVar.zzb)) {
                this.zzo.zzF(0);
                zzabp.zzb(zzabrVar, this.zzo, 4);
                this.zzaa += 4;
            }
        }
        int i14 = this.zzaa;
        zzu();
        return i14;
    }

    private final int zzo(zzaap zzaapVar, zzabr zzabrVar, int i) throws IOException {
        int zza2 = this.zzq.zza();
        if (zza2 > 0) {
            int min = Math.min(i, zza2);
            zzabp.zzb(zzabrVar, this.zzq, min);
            return min;
        }
        return zzabp.zza(zzabrVar, zzaapVar, i, false);
    }

    private final long zzp(long j) throws zzce {
        long j2 = this.zzy;
        if (j2 != -9223372036854775807L) {
            return zzfn.zzp(j, j2, 1000L);
        }
        throw zzce.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzq(int i) throws zzce {
        if (this.zzJ == null || this.zzK == null) {
            throw zzce.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzr(int i) throws zzce {
        if (this.zzB != null) {
            return;
        }
        throw zzce.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de A[EDGE_INSN: B:63:0x00de->B:52:0x00de ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzs(com.google.android.gms.internal.ads.zzafm r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafn.zzs(com.google.android.gms.internal.ads.zzafm, long, int, int, int):void");
    }

    private final void zzt(zzaap zzaapVar, int i) throws IOException {
        if (this.zzn.zzd() >= i) {
            return;
        }
        if (this.zzn.zzb() < i) {
            zzfd zzfdVar = this.zzn;
            int zzb2 = zzfdVar.zzb();
            zzfdVar.zzz(Math.max(zzb2 + zzb2, i));
        }
        ((zzaae) zzaapVar).zzn(this.zzn.zzH(), this.zzn.zzd(), i - this.zzn.zzd(), false);
        this.zzn.zzE(i);
    }

    private final void zzu() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzC(0);
    }

    private final void zzv(zzaap zzaapVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzb() < i2) {
            zzfd zzfdVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzfdVar.zzD(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzH(), 0, length);
        }
        ((zzaae) zzaapVar).zzn(this.zzr.zzH(), length, i, false);
        this.zzr.zzF(0);
        this.zzr.zzE(i2);
    }

    private static byte[] zzw(long j, String str, long j2) {
        zzdy.zzd(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = zzfn.zza;
        return format.getBytes(zzfol.zzc);
    }

    private static int[] zzx(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final int zza(zzaap zzaapVar, zzabk zzabkVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzaapVar)) {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzafm zzafmVar = (zzafm) this.zzj.valueAt(i);
                    zzafm.zzd(zzafmVar);
                    zzabs zzabsVar = zzafmVar.zzS;
                    if (zzabsVar != null) {
                        zzabsVar.zza(zzafmVar.zzV, zzafmVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzaapVar.zzf();
            if (this.zzF) {
                this.zzH = zzf2;
                zzabkVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            } else if (this.zzC) {
                long j = this.zzH;
                if (j != -1) {
                    zzabkVar.zza = j;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzai = zzaarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    @CallSuper
    public final void zzc(long j, long j2) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzu();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzabs zzabsVar = ((zzafm) this.zzj.valueAt(i)).zzS;
            if (zzabsVar != null) {
                zzabsVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        return new zzafo().zza(zzaapVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x027b, code lost:
        throw com.google.android.gms.internal.ads.zzce.zza("EBML lacing sample size out of range.", null);
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(int r20, int r21, com.google.android.gms.internal.ads.zzaap r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafn.zzg(int, int, com.google.android.gms.internal.ads.zzaap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e5, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L95;
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(int r22) throws com.google.android.gms.internal.ads.zzce {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafn.zzh(int):void");
    }

    @CallSuper
    public final void zzi(int i, double d) throws zzce {
        if (i == 181) {
            zzr(i);
            this.zzB.zzP = (int) d;
        } else if (i == 17545) {
            this.zzz = (long) d;
        } else {
            switch (i) {
                case 21969:
                    zzr(i);
                    this.zzB.zzC = (float) d;
                    return;
                case 21970:
                    zzr(i);
                    this.zzB.zzD = (float) d;
                    return;
                case 21971:
                    zzr(i);
                    this.zzB.zzE = (float) d;
                    return;
                case 21972:
                    zzr(i);
                    this.zzB.zzF = (float) d;
                    return;
                case 21973:
                    zzr(i);
                    this.zzB.zzG = (float) d;
                    return;
                case 21974:
                    zzr(i);
                    this.zzB.zzH = (float) d;
                    return;
                case 21975:
                    zzr(i);
                    this.zzB.zzI = (float) d;
                    return;
                case 21976:
                    zzr(i);
                    this.zzB.zzJ = (float) d;
                    return;
                case 21977:
                    zzr(i);
                    this.zzB.zzK = (float) d;
                    return;
                case 21978:
                    zzr(i);
                    this.zzB.zzL = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            zzr(i);
                            this.zzB.zzr = (float) d;
                            return;
                        case 30324:
                            zzr(i);
                            this.zzB.zzs = (float) d;
                            return;
                        case 30325:
                            zzr(i);
                            this.zzB.zzt = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    @CallSuper
    public final void zzj(int i, long j) throws zzce {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzce.zza("ContentEncodingOrder " + j + " not supported", null);
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzce.zza("ContentEncodingScope " + j + " not supported", null);
        } else {
            switch (i) {
                case 131:
                    zzr(i);
                    this.zzB.zzd = (int) j;
                    return;
                case 136:
                    zzr(i);
                    this.zzB.zzU = j == 1;
                    return;
                case 155:
                    this.zzP = zzp(j);
                    return;
                case 159:
                    zzr(i);
                    this.zzB.zzN = (int) j;
                    return;
                case 176:
                    zzr(i);
                    this.zzB.zzl = (int) j;
                    return;
                case 179:
                    zzq(i);
                    this.zzJ.zzc(zzp(j));
                    return;
                case 186:
                    zzr(i);
                    this.zzB.zzm = (int) j;
                    return;
                case 215:
                    zzr(i);
                    this.zzB.zzc = (int) j;
                    return;
                case 231:
                    this.zzI = zzp(j);
                    return;
                case 238:
                    this.zzW = (int) j;
                    return;
                case 241:
                    if (this.zzL) {
                        return;
                    }
                    zzq(i);
                    this.zzK.zzc(j);
                    this.zzL = true;
                    return;
                case 251:
                    this.zzX = true;
                    return;
                case 16871:
                    zzr(i);
                    zzafm.zzb(this.zzB, (int) j);
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw zzce.zza("ContentCompAlgo " + j + " not supported", null);
                case 17029:
                    if (j < 1 || j > 2) {
                        throw zzce.zza("DocTypeReadVersion " + j + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw zzce.zza("EBMLReadVersion " + j + " not supported", null);
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw zzce.zza("ContentEncAlgo " + j + " not supported", null);
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw zzce.zza("AESSettingsCipherMode " + j + " not supported", null);
                case 21420:
                    this.zzE = j + this.zzx;
                    return;
                case 21432:
                    int i2 = (int) j;
                    zzr(i);
                    if (i2 == 0) {
                        this.zzB.zzv = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzB.zzv = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzB.zzv = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzB.zzv = 3;
                        return;
                    }
                case 21680:
                    zzr(i);
                    this.zzB.zzn = (int) j;
                    return;
                case 21682:
                    zzr(i);
                    this.zzB.zzp = (int) j;
                    return;
                case 21690:
                    zzr(i);
                    this.zzB.zzo = (int) j;
                    return;
                case 21930:
                    zzr(i);
                    this.zzB.zzT = j == 1;
                    return;
                case 21998:
                    zzr(i);
                    this.zzB.zzf = (int) j;
                    return;
                case 22186:
                    zzr(i);
                    this.zzB.zzQ = j;
                    return;
                case 22203:
                    zzr(i);
                    this.zzB.zzR = j;
                    return;
                case 25188:
                    zzr(i);
                    this.zzB.zzO = (int) j;
                    return;
                case 30114:
                    this.zzY = j;
                    return;
                case 30321:
                    zzr(i);
                    int i3 = (int) j;
                    if (i3 == 0) {
                        this.zzB.zzq = 0;
                        return;
                    } else if (i3 == 1) {
                        this.zzB.zzq = 1;
                        return;
                    } else if (i3 == 2) {
                        this.zzB.zzq = 2;
                        return;
                    } else if (i3 != 3) {
                        return;
                    } else {
                        this.zzB.zzq = 3;
                        return;
                    }
                case 2352003:
                    zzr(i);
                    this.zzB.zze = (int) j;
                    return;
                case 2807729:
                    this.zzy = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            zzr(i);
                            int i4 = (int) j;
                            if (i4 == 1) {
                                this.zzB.zzz = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.zzB.zzz = 1;
                                return;
                            }
                        case 21946:
                            zzr(i);
                            int zzb2 = zzs.zzb((int) j);
                            if (zzb2 != -1) {
                                this.zzB.zzy = zzb2;
                                return;
                            }
                            return;
                        case 21947:
                            zzr(i);
                            this.zzB.zzw = true;
                            int zza2 = zzs.zza((int) j);
                            if (zza2 != -1) {
                                this.zzB.zzx = zza2;
                                return;
                            }
                            return;
                        case 21948:
                            zzr(i);
                            this.zzB.zzA = (int) j;
                            return;
                        case 21949:
                            zzr(i);
                            this.zzB.zzB = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    @CallSuper
    public final void zzk(int i, long j, long j2) throws zzce {
        zzdy.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0L;
        } else if (i == 174) {
            this.zzB = new zzafm();
        } else if (i == 187) {
            this.zzL = false;
        } else if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
        } else if (i == 20533) {
            zzr(i);
            this.zzB.zzg = true;
        } else if (i == 21968) {
            zzr(i);
            this.zzB.zzw = true;
        } else if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 != -1 && j3 != j) {
                throw zzce.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j2;
        } else if (i == 475249515) {
            this.zzJ = new zzes(32);
            this.zzK = new zzes(32);
        } else if (i == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
                return;
            }
            this.zzai.zzN(new zzabm(this.zzA, 0L));
            this.zzC = true;
        }
    }

    @CallSuper
    public final void zzl(int i, String str) throws zzce {
        if (i == 134) {
            zzr(i);
            this.zzB.zzb = str;
        } else if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzce.zza("DocType " + str + " not supported", null);
        } else if (i == 21358) {
            zzr(i);
            this.zzB.zza = str;
        } else if (i != 2274716) {
        } else {
            zzr(i);
            zzafm.zzc(this.zzB, str);
        }
    }
}
