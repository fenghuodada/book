package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzvb implements zzabr {
    private boolean zzA;
    private boolean zzB;
    @Nullable
    private zzqs zzC;
    private final zzuv zza;
    @Nullable
    private final zzqr zzd;
    @Nullable
    private final zzql zze;
    @Nullable
    private zzva zzf;
    @Nullable
    private zzam zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    @Nullable
    private zzam zzy;
    @Nullable
    private zzam zzz;
    private final zzux zzb = new zzux();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzabq[] zzn = new zzabq[1000];
    private final zzvi zzc = new zzvi(new zzec() { // from class: com.google.android.gms.internal.ads.zzuw
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;

    public zzvb(zzxm zzxmVar, @Nullable zzqr zzqrVar, @Nullable zzql zzqlVar) {
        this.zzd = zzqrVar;
        this.zze = zzqlVar;
        this.zza = new zzuv(zzxmVar);
    }

    private final int zzA(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzB(zzkf zzkfVar, zzhi zzhiVar, boolean z, boolean z2, zzux zzuxVar) {
        zzhiVar.zzc = false;
        if (!zzJ()) {
            if (!z2 && !this.zzv) {
                zzam zzamVar = this.zzz;
                if (zzamVar == null || (!z && zzamVar == this.zzg)) {
                    return -3;
                }
                zzG(zzamVar, zzkfVar);
                return -5;
            }
            zzhiVar.zzc(4);
            return -4;
        }
        zzam zzamVar2 = ((zzuz) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzamVar2 == this.zzg) {
            int zzA = zzA(this.zzr);
            if (!zzK(zzA)) {
                zzhiVar.zzc = true;
                return -3;
            }
            zzhiVar.zzc(this.zzl[zzA]);
            if (this.zzr == this.zzo - 1 && (z2 || this.zzv)) {
                zzhiVar.zza(536870912);
            }
            long j = this.zzm[zzA];
            zzhiVar.zzd = j;
            if (j < this.zzs) {
                zzhiVar.zza(Integer.MIN_VALUE);
            }
            zzuxVar.zza = this.zzk[zzA];
            zzuxVar.zzb = this.zzj[zzA];
            zzuxVar.zzc = this.zzn[zzA];
            return -4;
        }
        zzG(zzamVar2, zzkfVar);
        return -5;
    }

    private final synchronized long zzC(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzo;
        if (i2 != 0) {
            long[] jArr = this.zzm;
            int i3 = this.zzq;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzr) != i2) {
                    i2 = i + 1;
                }
                int zzz = zzz(i3, i2, j, false);
                if (zzz == -1) {
                    return -1L;
                }
                return zzE(zzz);
            }
        }
        return -1L;
    }

    private final synchronized long zzD() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzE(i);
    }

    @GuardedBy("this")
    private final long zzE(int i) {
        int i2;
        long j = this.zzt;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzA = zzA(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.zzm[zzA]);
                if ((this.zzl[zzA] & 1) != 0) {
                    break;
                }
                zzA--;
                if (zzA == -1) {
                    zzA = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, j2);
        this.zzo -= i;
        int i4 = this.zzp + i;
        this.zzp = i4;
        int i5 = this.zzq + i;
        this.zzq = i5;
        int i6 = this.zzh;
        if (i5 >= i6) {
            this.zzq = i5 - i6;
        }
        int i7 = this.zzr - i;
        this.zzr = i7;
        if (i7 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i4);
        if (this.zzo == 0) {
            int i8 = this.zzq;
            if (i8 == 0) {
                i8 = this.zzh;
            }
            return this.zzj[i8 - 1] + this.zzk[i2];
        }
        return this.zzj[this.zzq];
    }

    private final synchronized void zzF(long j, int i, long j2, int i2, @Nullable zzabq zzabqVar) {
        int i3 = this.zzo;
        if (i3 > 0) {
            int zzA = zzA(i3 - 1);
            zzdy.zzd(this.zzj[zzA] + ((long) this.zzk[zzA]) <= j2);
        }
        this.zzv = (536870912 & i) != 0;
        this.zzu = Math.max(this.zzu, j);
        int zzA2 = zzA(this.zzo);
        this.zzm[zzA2] = j;
        this.zzj[zzA2] = j2;
        this.zzk[zzA2] = i2;
        this.zzl[zzA2] = i;
        this.zzn[zzA2] = zzabqVar;
        this.zzi[zzA2] = 0;
        if (this.zzc.zzf() || !((zzuz) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzqq zzqqVar = zzqq.zzb;
            zzvi zzviVar = this.zzc;
            int i4 = this.zzp + this.zzo;
            zzam zzamVar = this.zzz;
            zzamVar.getClass();
            zzviVar.zzc(i4, new zzuz(zzamVar, zzqqVar, null));
        }
        int i5 = this.zzo + 1;
        this.zzo = i5;
        int i6 = this.zzh;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            long[] jArr3 = new long[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            zzabq[] zzabqVarArr = new zzabq[i7];
            int i8 = this.zzq;
            int i9 = i6 - i8;
            System.arraycopy(this.zzj, i8, jArr2, 0, i9);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i9);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i9);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i9);
            System.arraycopy(this.zzn, this.zzq, zzabqVarArr, 0, i9);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i9);
            int i10 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i9, i10);
            System.arraycopy(this.zzm, 0, jArr3, i9, i10);
            System.arraycopy(this.zzl, 0, iArr, i9, i10);
            System.arraycopy(this.zzk, 0, iArr2, i9, i10);
            System.arraycopy(this.zzn, 0, zzabqVarArr, i9, i10);
            System.arraycopy(this.zzi, 0, jArr, i9, i10);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzabqVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i7;
        }
    }

    private final void zzG(zzam zzamVar, zzkf zzkfVar) {
        zzam zzamVar2 = this.zzg;
        boolean z = zzamVar2 == null;
        zzad zzadVar = z ? null : zzamVar2.zzp;
        this.zzg = zzamVar;
        zzad zzadVar2 = zzamVar.zzp;
        zzkfVar.zza = zzamVar.zzc(this.zzd.zza(zzamVar));
        zzkfVar.zzb = this.zzC;
        if (z || !zzfn.zzB(zzadVar, zzadVar2)) {
            zzqs zzqsVar = zzamVar.zzp != null ? new zzqs(new zzqj(new zzqu(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE)) : null;
            this.zzC = zzqsVar;
            zzkfVar.zzb = zzqsVar;
        }
    }

    private final void zzH() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzI() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzJ() {
        return this.zzr != this.zzo;
    }

    private final boolean zzK(int i) {
        if (this.zzC != null) {
            return (this.zzl[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzL(zzam zzamVar) {
        this.zzx = false;
        if (zzfn.zzB(zzamVar, this.zzz)) {
            return false;
        }
        if (!this.zzc.zzf() && ((zzuz) this.zzc.zzb()).zza.equals(zzamVar)) {
            zzamVar = ((zzuz) this.zzc.zzb()).zza;
        }
        this.zzz = zzamVar;
        zzam zzamVar2 = this.zzz;
        this.zzA = zzcd.zze(zzamVar2.zzm, zzamVar2.zzj);
        this.zzB = false;
        return true;
    }

    public static /* synthetic */ void zzl(zzuz zzuzVar) {
        zzqq zzqqVar = zzuzVar.zzb;
        int i = zzqp.zza;
    }

    private final int zzz(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.zzm[i] > j ? 1 : (this.zzm[i] == j ? 0 : -1));
            if (i5 > 0) {
                break;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                i3 = i4;
                if (i5 == 0) {
                    break;
                }
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i3;
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzb(long j, boolean z) {
        int i = this.zzr;
        int zzA = zzA(i);
        if (zzJ() && j >= this.zzm[zzA]) {
            if (j > this.zzu && z) {
                return this.zzo - i;
            }
            int zzz = zzz(zzA, this.zzo - i, j, true);
            if (zzz == -1) {
                return 0;
            }
            return zzz;
        }
        return 0;
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r9 != 0) goto L17;
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzkf r9, com.google.android.gms.internal.ads.zzhi r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.zzux r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzB(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzg()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzuv r9 = r8.zza
            com.google.android.gms.internal.ads.zzux r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzuv r9 = r8.zza
            com.google.android.gms.internal.ads.zzux r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvb.zzd(com.google.android.gms.internal.ads.zzkf, com.google.android.gms.internal.ads.zzhi, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final /* synthetic */ int zze(zzt zztVar, int i, boolean z) {
        return zzabp.zza(this, zztVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final int zzf(zzt zztVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zztVar, i, z);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    @Nullable
    public final synchronized zzam zzh() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzi(long j, boolean z, boolean z2) {
        this.zza.zzc(zzC(j, false, z2));
    }

    public final void zzj() {
        this.zza.zzc(zzD());
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzk(zzam zzamVar) {
        this.zzy = zzamVar;
        boolean zzL = zzL(zzamVar);
        zzva zzvaVar = this.zzf;
        if (zzvaVar == null || !zzL) {
            return;
        }
        zzvaVar.zzL(zzamVar);
    }

    @CallSuper
    public final void zzm() throws IOException {
        zzqs zzqsVar = this.zzC;
        if (zzqsVar != null) {
            throw zzqsVar.zza();
        }
    }

    @CallSuper
    public final void zzn() {
        zzj();
        zzH();
    }

    @CallSuper
    public final void zzo() {
        zzp(true);
        zzH();
    }

    @CallSuper
    public final void zzp(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final /* synthetic */ void zzq(zzfd zzfdVar, int i) {
        zzabp.zzb(this, zzfdVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzr(zzfd zzfdVar, int i, int i2) {
        this.zza.zzh(zzfdVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzs(long j, int i, int i2, int i3, @Nullable zzabq zzabqVar) {
        if (this.zzw) {
            if ((i & 1) == 0) {
                return;
            }
            this.zzw = false;
        }
        if (this.zzA) {
            if (j < this.zzs) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzB) {
                    zzer.zze("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzF(j, i, (this.zza.zzb() - i2) - i3, i2, zzabqVar);
    }

    public final void zzt(long j) {
        this.zzs = j;
    }

    public final void zzu(@Nullable zzva zzvaVar) {
        this.zzf = zzvaVar;
    }

    public final synchronized void zzv(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdy.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    @CallSuper
    public final synchronized boolean zzx(boolean z) {
        boolean z2 = true;
        if (zzJ()) {
            if (((zzuz) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzK(zzA(this.zzr));
        }
        if (!z && !this.zzv) {
            zzam zzamVar = this.zzz;
            if (zzamVar == null) {
                z2 = false;
            } else if (zzamVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean zzy(long j, boolean z) {
        zzI();
        int i = this.zzr;
        int zzA = zzA(i);
        if (!zzJ() || j < this.zzm[zzA] || (j > this.zzu && !z)) {
            return false;
        }
        int zzz = zzz(zzA, this.zzo - i, j, true);
        if (zzz == -1) {
            return false;
        }
        this.zzs = j;
        this.zzr += zzz;
        return true;
    }
}
