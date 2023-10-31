package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzagr implements zzaao {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzagn
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzagr(0, null)};
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzam zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzaar zzD;
    private zzabr[] zzE;
    private zzabr[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzfd zzf;
    private final zzfd zzg;
    private final zzfd zzh;
    private final byte[] zzi;
    private final zzfd zzj;
    private final zzadi zzk;
    private final zzfd zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    @Nullable
    private zzfd zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    @Nullable
    private zzagq zzy;
    private int zzz;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzS("application/x-emsg");
        zzc = zzakVar.zzY();
    }

    public zzagr() {
        this(0, null);
    }

    public zzagr(int i, @Nullable zzfl zzflVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzadi();
        this.zzl = new zzfd(16);
        this.zzf = new zzfd(zzew.zza);
        this.zzg = new zzfd(5);
        this.zzh = new zzfd();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzfd(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzaar.zza;
        this.zzE = new zzabr[0];
        this.zzF = new zzabr[0];
    }

    private static int zze(int i) throws zzce {
        if (i >= 0) {
            return i;
        }
        throw zzce.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzad zzf(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto Lb6
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzagb r5 = (com.google.android.gms.internal.ads.zzagb) r5
            int r6 = r5.zzd
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb2
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.google.android.gms.internal.ads.zzfd r5 = r5.zza
            byte[] r5 = r5.zzH()
            com.google.android.gms.internal.ads.zzfd r6 = new com.google.android.gms.internal.ads.zzfd
            r6.<init>(r5)
            int r8 = r6.zzd()
            r9 = 32
            if (r8 >= r9) goto L32
            goto L8a
        L32:
            r6.zzF(r1)
            int r8 = r6.zze()
            int r9 = r6.zza()
            int r9 = r9 + 4
            if (r8 == r9) goto L42
            goto L8a
        L42:
            int r8 = r6.zze()
            if (r8 == r7) goto L49
            goto L8a
        L49:
            int r7 = r6.zze()
            int r7 = com.google.android.gms.internal.ads.zzagc.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L68
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Unsupported pssh version: "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            com.google.android.gms.internal.ads.zzer.zze(r7, r6)
            goto L8a
        L68:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzr()
            long r12 = r6.zzr()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L80
            int r8 = r6.zzn()
            int r8 = r8 * 16
            r6.zzG(r8)
        L80:
            int r8 = r6.zzn()
            int r10 = r6.zza()
            if (r8 == r10) goto L8c
        L8a:
            r6 = r2
            goto L96
        L8c:
            byte[] r10 = new byte[r8]
            r6.zzB(r10, r1, r8)
            com.google.android.gms.internal.ads.zzagx r6 = new com.google.android.gms.internal.ads.zzagx
            r6.<init>(r9, r7, r10)
        L96:
            if (r6 != 0) goto L9a
            r6 = r2
            goto L9e
        L9a:
            java.util.UUID r6 = com.google.android.gms.internal.ads.zzagx.zza(r6)
        L9e:
            if (r6 != 0) goto La8
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzer.zze(r5, r6)
            goto Lb2
        La8:
            com.google.android.gms.internal.ads.zzac r7 = new com.google.android.gms.internal.ads.zzac
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        Lb2:
            int r3 = r3 + 1
            goto L8
        Lb6:
            if (r4 != 0) goto Lb9
            return r2
        Lb9:
            com.google.android.gms.internal.ads.zzad r14 = new com.google.android.gms.internal.ads.zzad
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagr.zzf(java.util.List):com.google.android.gms.internal.ads.zzad");
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzfd zzfdVar, int i, zzahc zzahcVar) throws zzce {
        zzfdVar.zzF(i + 8);
        int zze = zzfdVar.zze() & 16777215;
        if ((zze & 1) != 0) {
            throw zzce.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zze & 2) != 0;
        int zzn = zzfdVar.zzn();
        if (zzn == 0) {
            Arrays.fill(zzahcVar.zzl, 0, zzahcVar.zze, false);
            return;
        }
        int i2 = zzahcVar.zze;
        if (zzn != i2) {
            throw zzce.zza("Senc sample count " + zzn + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzahcVar.zzl, 0, zzn, z);
        zzahcVar.zza(zzfdVar.zza());
        zzfd zzfdVar2 = zzahcVar.zzn;
        zzfdVar.zzB(zzfdVar2.zzH(), 0, zzfdVar2.zzd());
        zzahcVar.zzn.zzF(0);
        zzahcVar.zzo = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0315, code lost:
        if (com.google.android.gms.internal.ads.zzfn.zzp(r31 + r8[0], 1000000, r5.zzd) < r5.zze) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzi(long r46) throws com.google.android.gms.internal.ads.zzce {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagr.zzi(long):void");
    }

    private static final zzagm zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzagm) sparseArray.valueAt(0);
        }
        zzagm zzagmVar = (zzagm) sparseArray.get(i);
        zzagmVar.getClass();
        return zzagmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024a, code lost:
        if (r0.zzn.isEmpty() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x024c, code lost:
        r1 = (com.google.android.gms.internal.ads.zzagp) r0.zzn.removeFirst();
        r0.zzu -= r1.zzc;
        r6 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025f, code lost:
        if (r1.zzb == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0261, code lost:
        r6 = r6 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0262, code lost:
        r3 = r0.zzE;
        r15 = r3.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0267, code lost:
        if (r14 >= r15) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0269, code lost:
        r3[r14].zzs(r6, 1, r1.zzc, r0.zzu, null);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0281, code lost:
        if (r2.zzk() != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0283, code lost:
        r0.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0286, code lost:
        r0.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028a, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0727, code lost:
        if (r5.zzq == r5.zzr) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (r0.zzo != 3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
        r3 = r2.zzb();
        r0.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if (r2.zzf >= r2.zzi) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
        ((com.google.android.gms.internal.ads.zzaae) r1).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r1 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r3.zzG(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
        if (r2.zzb.zzb(r2.zzf) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r3.zzG(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
        if (r2.zzk() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
        r0.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
        r0.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
        if (r2.zzd.zza.zzg != 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
        r0.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzaae) r1).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fe, code lost:
        r0.zzA = r2.zzc(r0.zzz, 7);
        com.google.android.gms.internal.ads.zzzs.zzb(r0.zzz, r0.zzj);
        r2.zza.zzq(r0.zzj, 7);
        r3 = r0.zzA + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
        r3 = r2.zzc(r0.zzz, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
        r0.zzA = r3;
        r0.zzz += r3;
        r0.zzo = 4;
        r0.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
        r3 = r2.zzd.zza;
        r9 = r2.zza;
        r14 = r2.zze();
        r5 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
        if (r5 != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
        r3 = r0.zzA;
        r4 = r0.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
        if (r3 >= r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
        r0.zzA += r9.zze(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
        r10 = r0.zzg.zzH();
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r11 = r5 + 1;
        r5 = 4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015f, code lost:
        if (r0.zzA >= r0.zzz) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0161, code lost:
        r12 = r0.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0165, code lost:
        if (r12 != 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
        ((com.google.android.gms.internal.ads.zzaae) r1).zzn(r10, r5, r11, r8);
        r0.zzg.zzF(r8);
        r12 = r0.zzg.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
        if (r12 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017a, code lost:
        r0.zzB = r12 - 1;
        r0.zzf.zzF(r8);
        r9.zzq(r0.zzf, 4);
        r9.zzq(r0.zzg, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0191, code lost:
        if (r0.zzF.length <= 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
        r8 = r3.zzf.zzm;
        r12 = r10[4];
        r16 = com.google.android.gms.internal.ads.zzew.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a1, code lost:
        if ("video/avc".equals(r8) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a5, code lost:
        if ((r12 & 31) == r4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
        if ("video/hevc".equals(r8) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
        if (((r12 & 126) >> r7) != 39) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b4, code lost:
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b7, code lost:
        r0.zzC = r6;
        r0.zzA += 5;
        r0.zzz += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cc, code lost:
        throw com.google.android.gms.internal.ads.zzce.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cf, code lost:
        if (r0.zzC == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d1, code lost:
        r0.zzh.zzC(r12);
        ((com.google.android.gms.internal.ads.zzaae) r1).zzn(r0.zzh.zzH(), 0, r0.zzB, false);
        r9.zzq(r0.zzh, r0.zzB);
        r4 = r0.zzB;
        r6 = r0.zzh;
        r6 = com.google.android.gms.internal.ads.zzew.zzb(r6.zzH(), r6.zzd());
        r0.zzh.zzF("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r0.zzh.zzE(r6);
        com.google.android.gms.internal.ads.zzaab.zza(r14, r0.zzh, r0.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0216, code lost:
        r4 = r9.zze(r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021b, code lost:
        r0.zzA += r4;
        r0.zzB -= r4;
        r4 = 6;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0228, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022c, code lost:
        r12 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0234, code lost:
        if (r1 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0236, code lost:
        r1 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0239, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023a, code lost:
        r9.zzs(r14, r12, r0.zzz, 0, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0730 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v22 */
    @Override // com.google.android.gms.internal.ads.zzaao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzaap r29, com.google.android.gms.internal.ads.zzabk r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagr.zza(com.google.android.gms.internal.ads.zzaap, com.google.android.gms.internal.ads.zzabk):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzD = zzaarVar;
        zzg();
        zzabr[] zzabrVarArr = new zzabr[2];
        this.zzE = zzabrVarArr;
        int i = 0;
        zzabr[] zzabrVarArr2 = (zzabr[]) zzfn.zzF(zzabrVarArr, 0);
        this.zzE = zzabrVarArr2;
        for (zzabr zzabrVar : zzabrVarArr2) {
            zzabrVar.zzk(zzc);
        }
        this.zzF = new zzabr[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzabr zzv = this.zzD.zzv(i2, 3);
            zzv.zzk((zzam) this.zzd.get(i));
            this.zzF[i] = zzv;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzagq) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        return zzagz.zza(zzaapVar);
    }
}
