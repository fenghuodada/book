package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkl {
    private final zzcu zza = new zzcu();
    private final zzcw zzb = new zzcw();
    private final zzls zzc;
    private final zzei zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    @Nullable
    private zzki zzh;
    @Nullable
    private zzki zzi;
    @Nullable
    private zzki zzj;
    private int zzk;
    @Nullable
    private Object zzl;
    private long zzm;

    public zzkl(zzls zzlsVar, zzei zzeiVar) {
        this.zzc = zzlsVar;
        this.zzd = zzeiVar;
    }

    private final boolean zzA(zzcx zzcxVar, zztl zztlVar) {
        if (zzC(zztlVar)) {
            return zzcxVar.zze(zzcxVar.zzn(zztlVar.zza, this.zza).zzd, this.zzb, 0L).zzp == zzcxVar.zza(zztlVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzcx zzcxVar) {
        zzki zzkiVar = this.zzh;
        if (zzkiVar == null) {
            return true;
        }
        int zza = zzcxVar.zza(zzkiVar.zzb);
        while (true) {
            zza = zzcxVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzkiVar.zzg() != null && !zzkiVar.zzf.zzg) {
                zzkiVar = zzkiVar.zzg();
            }
            zzki zzg = zzkiVar.zzg();
            if (zza == -1 || zzg == null || zzcxVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzkiVar = zzg;
        }
        boolean zzm = zzm(zzkiVar);
        zzkiVar.zzf = zzg(zzcxVar, zzkiVar.zzf);
        return !zzm;
    }

    private static final boolean zzC(zztl zztlVar) {
        return !zztlVar.zzb() && zztlVar.zze == -1;
    }

    private final long zzs(zzcx zzcxVar, Object obj, int i) {
        zzcxVar.zzn(obj, this.zza);
        this.zza.zzi(i);
        this.zza.zzk(i);
        return 0L;
    }

    @Nullable
    private final zzkj zzt(zzcx zzcxVar, zzki zzkiVar, long j) {
        int zze;
        Object obj;
        long j2;
        long j3;
        Object obj2;
        int i;
        long j4;
        long j5;
        zzkj zzkjVar = zzkiVar.zzf;
        long zze2 = (zzkiVar.zze() + zzkjVar.zze) - j;
        if (zzkjVar.zzg) {
            long j6 = 0;
            int zzi = zzcxVar.zzi(zzcxVar.zza(zzkjVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i2 = zzcxVar.zzd(zzi, this.zza, true).zzd;
                Object obj3 = this.zza.zzc;
                obj3.getClass();
                long j7 = zzkjVar.zza.zzd;
                if (zzcxVar.zze(i2, this.zzb, 0L).zzo == zzi) {
                    Pair zzm = zzcxVar.zzm(this.zzb, this.zza, i2, -9223372036854775807L, Math.max(0L, zze2));
                    if (zzm != null) {
                        obj3 = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzki zzg = zzkiVar.zzg();
                        if (zzg == null || !zzg.zzb.equals(obj3)) {
                            j7 = this.zze;
                            this.zze = 1 + j7;
                        } else {
                            j7 = zzg.zzf.zza.zzd;
                        }
                        j5 = longValue;
                        j6 = -9223372036854775807L;
                    }
                } else {
                    j5 = 0;
                }
                zztl zzx = zzx(zzcxVar, obj3, j5, j7, this.zzb, this.zza);
                if (j6 != -9223372036854775807L && zzkjVar.zzc != -9223372036854775807L) {
                    zzcxVar.zzn(zzkjVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzcxVar, zzx, j6, j5);
            }
        } else {
            zztl zztlVar = zzkjVar.zza;
            zzcxVar.zzn(zztlVar.zza, this.zza);
            if (!zztlVar.zzb()) {
                int i3 = zztlVar.zze;
                if (i3 != -1) {
                    this.zza.zzm(i3);
                }
                zze = this.zza.zze(zztlVar.zze);
                this.zza.zzn(zztlVar.zze);
                if (zze != this.zza.zza(zztlVar.zze)) {
                    obj2 = zztlVar.zza;
                    i = zztlVar.zze;
                    j4 = zzkjVar.zze;
                    return zzv(zzcxVar, obj2, i, zze, j4, zztlVar.zzd);
                }
                zzs(zzcxVar, zztlVar.zza, zztlVar.zze);
                obj = zztlVar.zza;
                j2 = 0;
                j3 = zzkjVar.zze;
                return zzw(zzcxVar, obj, j2, j3, zztlVar.zzd);
            }
            i = zztlVar.zzb;
            if (this.zza.zza(i) != -1) {
                zze = this.zza.zzf(i, zztlVar.zzc);
                if (zze < 0) {
                    obj2 = zztlVar.zza;
                    j4 = zzkjVar.zzc;
                    return zzv(zzcxVar, obj2, i, zze, j4, zztlVar.zzd);
                }
                long j8 = zzkjVar.zzc;
                if (j8 == -9223372036854775807L) {
                    zzcw zzcwVar = this.zzb;
                    zzcu zzcuVar = this.zza;
                    Pair zzm2 = zzcxVar.zzm(zzcwVar, zzcuVar, zzcuVar.zzd, -9223372036854775807L, Math.max(0L, zze2));
                    if (zzm2 != null) {
                        j8 = ((Long) zzm2.second).longValue();
                    }
                }
                zzs(zzcxVar, zztlVar.zza, zztlVar.zzb);
                obj = zztlVar.zza;
                j2 = Math.max(0L, j8);
                j3 = zzkjVar.zzc;
                return zzw(zzcxVar, obj, j2, j3, zztlVar.zzd);
            }
        }
        return null;
    }

    @Nullable
    private final zzkj zzu(zzcx zzcxVar, zztl zztlVar, long j, long j2) {
        zzcxVar.zzn(zztlVar.zza, this.zza);
        boolean zzb = zztlVar.zzb();
        Object obj = zztlVar.zza;
        return zzb ? zzv(zzcxVar, obj, zztlVar.zzb, zztlVar.zzc, j, zztlVar.zzd) : zzw(zzcxVar, obj, j2, j, zztlVar.zzd);
    }

    private final zzkj zzv(zzcx zzcxVar, Object obj, int i, int i2, long j, long j2) {
        zztl zztlVar = new zztl(obj, i, i2, j2);
        long zzh = zzcxVar.zzn(zztlVar.zza, this.zza).zzh(zztlVar.zzb, zztlVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzj();
        }
        this.zza.zzn(zztlVar.zzb);
        return new zzkj(zztlVar, (zzh == -9223372036854775807L || zzh > 0) ? 0L : Math.max(0L, (-1) + zzh), j, -9223372036854775807L, zzh, false, false, false, false);
    }

    private final zzkj zzw(zzcx zzcxVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzcxVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j7);
        if (zzc != -1) {
            this.zza.zzm(zzc);
        }
        zzcu zzcuVar = this.zza;
        if (zzc == -1) {
            zzcuVar.zzb();
        } else {
            zzcuVar.zzn(zzc);
        }
        zztl zztlVar = new zztl(obj, j3, zzc);
        boolean zzC = zzC(zztlVar);
        boolean zzA = zzA(zzcxVar, zztlVar);
        boolean zzz = zzz(zzcxVar, zztlVar, zzC);
        if (zzc != -1) {
            this.zza.zzn(zzc);
        }
        if (zzc != -1) {
            this.zza.zzi(zzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j5 = 0;
            j6 = 0;
        } else {
            j5 = j4;
            j6 = this.zza.zze;
        }
        if (j6 != -9223372036854775807L && j7 >= j6) {
            j7 = Math.max(0L, j6 - 1);
        }
        return new zzkj(zztlVar, j7, j2, j5, j6, false, zzC, zzA, zzz);
    }

    private static zztl zzx(zzcx zzcxVar, Object obj, long j, long j2, zzcw zzcwVar, zzcu zzcuVar) {
        zzcxVar.zzn(obj, zzcuVar);
        zzcxVar.zze(zzcuVar.zzd, zzcwVar, 0L);
        zzcxVar.zza(obj);
        zzcuVar.zzb();
        zzcxVar.zzn(obj, zzcuVar);
        int zzd = zzcuVar.zzd(j);
        return zzd == -1 ? new zztl(obj, j2, zzcuVar.zzc(j)) : new zztl(obj, zzd, zzcuVar.zze(zzd), j2);
    }

    private final void zzy() {
        final zzfro zzfroVar = new zzfro();
        for (zzki zzkiVar = this.zzh; zzkiVar != null; zzkiVar = zzkiVar.zzg()) {
            zzfroVar.zzf(zzkiVar.zzf.zza);
        }
        zzki zzkiVar2 = this.zzi;
        final zztl zztlVar = zzkiVar2 == null ? null : zzkiVar2.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkk
            @Override // java.lang.Runnable
            public final void run() {
                zzkl.this.zzj(zzfroVar, zztlVar);
            }
        });
    }

    private final boolean zzz(zzcx zzcxVar, zztl zztlVar, boolean z) {
        int zza = zzcxVar.zza(zztlVar.zza);
        return !zzcxVar.zze(zzcxVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzi && zzcxVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    @Nullable
    public final zzki zza() {
        zzki zzkiVar = this.zzh;
        if (zzkiVar == null) {
            return null;
        }
        if (zzkiVar == this.zzi) {
            this.zzi = zzkiVar.zzg();
        }
        zzkiVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzki zzkiVar2 = this.zzh;
            this.zzl = zzkiVar2.zzb;
            this.zzm = zzkiVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzki zzb() {
        zzki zzkiVar = this.zzi;
        boolean z = false;
        if (zzkiVar != null && zzkiVar.zzg() != null) {
            z = true;
        }
        zzdy.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    @Nullable
    public final zzki zzc() {
        return this.zzj;
    }

    @Nullable
    public final zzki zzd() {
        return this.zzh;
    }

    @Nullable
    public final zzki zze() {
        return this.zzi;
    }

    @Nullable
    public final zzkj zzf(long j, zzky zzkyVar) {
        zzki zzkiVar = this.zzj;
        return zzkiVar == null ? zzu(zzkyVar.zza, zzkyVar.zzb, zzkyVar.zzc, zzkyVar.zzr) : zzt(zzkyVar.zza, zzkiVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzkj zzg(com.google.android.gms.internal.ads.zzcx r19, com.google.android.gms.internal.ads.zzkj r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zztl r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zztl r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzcu r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzcu r9 = r0.zza
            r9.zzi(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcu r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzh(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzcu r1 = r0.zza
            long r5 = r1.zze
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzcu r1 = r0.zza
            int r4 = r3.zzb
            r1.zzn(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzcu r4 = r0.zza
            r4.zzn(r1)
        L6e:
            com.google.android.gms.internal.ads.zzkj r15 = new com.google.android.gms.internal.ads.zzkj
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zzg(com.google.android.gms.internal.ads.zzcx, com.google.android.gms.internal.ads.zzkj):com.google.android.gms.internal.ads.zzkj");
    }

    public final zztl zzh(zzcx zzcxVar, Object obj, long j) {
        long j2;
        int zza;
        int i = zzcxVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzcxVar.zza(obj2)) == -1 || zzcxVar.zzd(zza, this.zza, false).zzd != i) {
            zzki zzkiVar = this.zzh;
            while (true) {
                if (zzkiVar == null) {
                    zzkiVar = this.zzh;
                    while (zzkiVar != null) {
                        int zza2 = zzcxVar.zza(zzkiVar.zzb);
                        if (zza2 == -1 || zzcxVar.zzd(zza2, this.zza, false).zzd != i) {
                            zzkiVar = zzkiVar.zzg();
                        }
                    }
                    j2 = this.zze;
                    this.zze = 1 + j2;
                    if (this.zzh == null) {
                        this.zzl = obj;
                        this.zzm = j2;
                    }
                } else if (zzkiVar.zzb.equals(obj)) {
                    break;
                } else {
                    zzkiVar = zzkiVar.zzg();
                }
            }
            j2 = zzkiVar.zzf.zza.zzd;
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzcxVar.zzn(obj, this.zza);
        zzcxVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzcxVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcw zzcwVar = this.zzb;
            if (zza3 < zzcwVar.zzo) {
                return zzx(zzcxVar, obj3, j, j3, zzcwVar, this.zza);
            }
            zzcxVar.zzd(zza3, this.zza, true);
            this.zza.zzb();
            zzcu zzcuVar = this.zza;
            if (zzcuVar.zzd(zzcuVar.zze) != -1) {
                obj3 = this.zza.zzc;
                obj3.getClass();
            }
            zza3--;
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzki zzkiVar = this.zzh;
        zzdy.zzb(zzkiVar);
        this.zzl = zzkiVar.zzb;
        this.zzm = zzkiVar.zzf.zza.zzd;
        while (zzkiVar != null) {
            zzkiVar.zzn();
            zzkiVar = zzkiVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    public final /* synthetic */ void zzj(zzfro zzfroVar, zztl zztlVar) {
        this.zzc.zzT(zzfroVar.zzi(), zztlVar);
    }

    public final void zzk(long j) {
        zzki zzkiVar = this.zzj;
        if (zzkiVar != null) {
            zzkiVar.zzm(j);
        }
    }

    public final boolean zzl(zztj zztjVar) {
        zzki zzkiVar = this.zzj;
        return zzkiVar != null && zzkiVar.zza == zztjVar;
    }

    public final boolean zzm(zzki zzkiVar) {
        boolean z = false;
        zzdy.zzf(zzkiVar != null);
        if (zzkiVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkiVar;
        while (zzkiVar.zzg() != null) {
            zzkiVar = zzkiVar.zzg();
            if (zzkiVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzkiVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzki zzkiVar = this.zzj;
        if (zzkiVar != null) {
            if (zzkiVar.zzf.zzi || !zzkiVar.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
                return false;
            }
            return this.zzk < 100;
        }
        return true;
    }

    public final boolean zzo(zzcx zzcxVar, long j, long j2) {
        zzkj zzkjVar;
        boolean z;
        zzki zzkiVar = null;
        for (zzki zzkiVar2 = this.zzh; zzkiVar2 != null; zzkiVar2 = zzkiVar2.zzg()) {
            zzkj zzkjVar2 = zzkiVar2.zzf;
            if (zzkiVar == null) {
                zzkjVar = zzg(zzcxVar, zzkjVar2);
            } else {
                zzkj zzt = zzt(zzcxVar, zzkiVar, j);
                if (zzt == null) {
                    return !zzm(zzkiVar);
                } else if (zzkjVar2.zzb != zzt.zzb || !zzkjVar2.zza.equals(zzt.zza)) {
                    return !zzm(zzkiVar);
                } else {
                    zzkjVar = zzt;
                }
            }
            zzkiVar2.zzf = zzkjVar.zza(zzkjVar2.zzc);
            long j3 = zzkjVar2.zze;
            int i = (j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1));
            long j4 = zzkjVar.zze;
            if (i != 0 && j3 != j4) {
                zzkiVar2.zzq();
                long j5 = zzkjVar.zze;
                long zze = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzkiVar2.zze();
                if (zzkiVar2 == this.zzi) {
                    boolean z2 = zzkiVar2.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= zze) {
                        z = true;
                        return zzm(zzkiVar2) && !z;
                    }
                }
                z = false;
                if (zzm(zzkiVar2)) {
                }
            }
            zzkiVar = zzkiVar2;
        }
        return true;
    }

    public final boolean zzp(zzcx zzcxVar, int i) {
        this.zzf = i;
        return zzB(zzcxVar);
    }

    public final boolean zzq(zzcx zzcxVar, boolean z) {
        this.zzg = z;
        return zzB(zzcxVar);
    }

    public final zzki zzr(zzlf[] zzlfVarArr, zzxd zzxdVar, zzxm zzxmVar, zzkx zzkxVar, zzkj zzkjVar, zzxe zzxeVar) {
        zzki zzkiVar = this.zzj;
        zzki zzkiVar2 = new zzki(zzlfVarArr, zzkiVar == null ? 1000000000000L : (zzkiVar.zze() + zzkiVar.zzf.zze) - zzkjVar.zzb, zzxdVar, zzxmVar, zzkxVar, zzkjVar, zzxeVar);
        zzki zzkiVar3 = this.zzj;
        if (zzkiVar3 != null) {
            zzkiVar3.zzo(zzkiVar2);
        } else {
            this.zzh = zzkiVar2;
            this.zzi = zzkiVar2;
        }
        this.zzl = null;
        this.zzj = zzkiVar2;
        this.zzk++;
        zzy();
        return zzkiVar2;
    }
}
