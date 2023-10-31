package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzwv extends zzxa {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfta zzc = zzfta.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzwv.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });
    private static final zzfta zzd = zzfta.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwc
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzwv.zzb;
            return 0;
        }
    });
    @Nullable
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    @GuardedBy("lock")
    private zzwj zzg;
    @Nullable
    @GuardedBy("lock")
    private zzwo zzh;
    @GuardedBy("lock")
    private zzk zzi;
    private final zzvq zzj;

    @Deprecated
    public zzwv() {
        zzwj zzwjVar = zzwj.zzD;
        throw null;
    }

    public zzwv(Context context) {
        zzvq zzvqVar = new zzvq();
        zzwj zzd2 = zzwj.zzd(context);
        this.zze = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzvqVar;
        this.zzg = zzd2;
        this.zzi = zzk.zza;
        boolean z = false;
        if (context != null && zzfn.zzD(context)) {
            z = true;
        }
        this.zzf = z;
        if (!z && context != null && zzfn.zza >= 32) {
            this.zzh = zzwo.zza(context);
        }
        if (this.zzg.zzP && context == null) {
            zzer.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int zza(zzam zzamVar, @Nullable String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(zzamVar.zzd)) {
            String zzf = zzf(str);
            String zzf2 = zzf(zzamVar.zzd);
            if (zzf2 == null || zzf == null) {
                return (z && zzf2 == null) ? 1 : 0;
            } else if (zzf2.startsWith(zzf) || zzf.startsWith(zzf2)) {
                return 3;
            } else {
                int i = zzfn.zza;
                return zzf2.split("-", 2)[0].equals(zzf.split("-", 2)[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    @Nullable
    public static String zzf(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzwv zzwvVar) {
        zzwvVar.zzt();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0053, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean zzk(com.google.android.gms.internal.ads.zzwv r8, com.google.android.gms.internal.ads.zzam r9) {
        /*
            java.lang.Object r0 = r8.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzwj r1 = r8.zzg     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzP     // Catch: java.lang.Throwable -> L8f
            r2 = 1
            if (r1 == 0) goto L8d
            boolean r1 = r8.zzf     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L8d
            int r1 = r9.zzz     // Catch: java.lang.Throwable -> L8f
            r3 = 2
            if (r1 <= r3) goto L8d
            java.lang.String r1 = r9.zzm     // Catch: java.lang.Throwable -> L8f
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8f
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r2
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r7
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r5
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r3
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzfn.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8d
            com.google.android.gms.internal.ads.zzwo r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L65
            goto L8d
        L65:
            int r1 = com.google.android.gms.internal.ads.zzfn.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8c
            com.google.android.gms.internal.ads.zzwo r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            boolean r3 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzwo r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzwo r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.ads.zzk r8 = r8.zzi     // Catch: java.lang.Throwable -> L8f
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L8c
            goto L8d
        L8c:
            r2 = r5
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            return r2
        L8f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwv.zzk(com.google.android.gms.internal.ads.zzwv, com.google.android.gms.internal.ads.zzam):boolean");
    }

    public static boolean zzm(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    private static void zzs(zzvk zzvkVar, zzde zzdeVar, Map map) {
        for (int i = 0; i < zzvkVar.zzc; i++) {
            if (((zzdb) zzdeVar.zzB.get(zzvkVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    public final void zzt() {
        boolean z;
        zzwo zzwoVar;
        synchronized (this.zze) {
            z = false;
            if (this.zzg.zzP && !this.zzf && zzfn.zza >= 32 && (zzwoVar = this.zzh) != null && zzwoVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzr();
        }
    }

    @Nullable
    private static final Pair zzu(int i, zzwz zzwzVar, int[][][] iArr, zzwq zzwqVar, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        int i3;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 2; i4++) {
            if (i == zzwzVar.zzc(i4)) {
                zzvk zzd2 = zzwzVar.zzd(i4);
                for (int i5 = 0; i5 < zzd2.zzc; i5++) {
                    zzcz zzb2 = zzd2.zzb(i5);
                    List zza = zzwqVar.zza(i4, zzb2, iArr[i4][i5]);
                    int i6 = zzb2.zzb;
                    int i7 = 1;
                    boolean[] zArr = new boolean[1];
                    int i8 = 0;
                    while (i8 <= 0) {
                        zzwr zzwrVar = (zzwr) zza.get(i8);
                        int zzb3 = zzwrVar.zzb();
                        if (zArr[i8] || zzb3 == 0) {
                            i2 = i7;
                        } else {
                            if (zzb3 == i7) {
                                randomAccess = zzfrr.zzm(zzwrVar);
                                i2 = i7;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzwrVar);
                                int i9 = i8 + 1;
                                while (i9 <= 0) {
                                    zzwr zzwrVar2 = (zzwr) zza.get(i9);
                                    if (zzwrVar2.zzb() == 2 && zzwrVar.zzc(zzwrVar2)) {
                                        arrayList2.add(zzwrVar2);
                                        i3 = 1;
                                        zArr[i9] = true;
                                    } else {
                                        i3 = 1;
                                    }
                                    i9++;
                                    i7 = i3;
                                }
                                i2 = i7;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i8++;
                        i7 = i2;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((zzwr) list.get(i10)).zzc;
        }
        zzwr zzwrVar3 = (zzwr) list.get(0);
        return Pair.create(new zzww(zzwrVar3.zzb, iArr2, 0), Integer.valueOf(zzwrVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final Pair zzb(zzwz zzwzVar, int[][][] iArr, final int[] iArr2, zztl zztlVar, zzcx zzcxVar) throws zzia {
        final zzwj zzwjVar;
        int i;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        zzwo zzwoVar;
        int[][][] iArr4 = iArr;
        synchronized (this.zze) {
            zzwjVar = this.zzg;
            if (zzwjVar.zzP && zzfn.zza >= 32 && (zzwoVar = this.zzh) != null) {
                Looper myLooper = Looper.myLooper();
                zzdy.zzb(myLooper);
                zzwoVar.zzb(this, myLooper);
            }
        }
        int i2 = 2;
        zzww[] zzwwVarArr = new zzww[2];
        Pair zzu = zzu(2, zzwzVar, iArr4, new zzwq() { // from class: com.google.android.gms.internal.ads.zzvx
            /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
            @Override // com.google.android.gms.internal.ads.zzwq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r20, com.google.android.gms.internal.ads.zzcz r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 200
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvx.zza(int, com.google.android.gms.internal.ads.zzcz, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvy
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                zzfrg zzj = zzfrg.zzj();
                zzws zzwsVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzws
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwu.zzd((zzwu) obj3, (zzwu) obj4);
                    }
                };
                zzfrg zzb2 = zzj.zzc((zzwu) Collections.max(list, zzwsVar), (zzwu) Collections.max(list2, zzwsVar), zzwsVar).zzb(list.size(), list2.size());
                zzwt zzwtVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwt
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwu.zza((zzwu) obj3, (zzwu) obj4);
                    }
                };
                return zzb2.zzc((zzwu) Collections.max(list, zzwtVar), (zzwu) Collections.max(list2, zzwtVar), zzwtVar).zza();
            }
        });
        if (zzu != null) {
            zzwwVarArr[((Integer) zzu.second).intValue()] = (zzww) zzu.first;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            } else if (zzwzVar.zzc(i4) == 2 && zzwzVar.zzd(i4).zzc > 0) {
                z = true;
                break;
            } else {
                i4++;
            }
        }
        Pair zzu2 = zzu(1, zzwzVar, iArr4, new zzwq() { // from class: com.google.android.gms.internal.ads.zzvv
            @Override // com.google.android.gms.internal.ads.zzwq
            public final List zza(int i5, zzcz zzczVar, int[] iArr5) {
                final zzwv zzwvVar = zzwv.this;
                zzwj zzwjVar2 = zzwjVar;
                boolean z2 = z;
                zzfpa zzfpaVar = new zzfpa() { // from class: com.google.android.gms.internal.ads.zzvu
                    @Override // com.google.android.gms.internal.ads.zzfpa
                    public final boolean zza(Object obj) {
                        return zzwv.zzk(zzwv.this, (zzam) obj);
                    }
                };
                zzfro zzfroVar = new zzfro();
                int i6 = 0;
                while (true) {
                    int i7 = zzczVar.zzb;
                    if (i6 > 0) {
                        return zzfroVar.zzi();
                    }
                    zzfroVar.zzf(new zzwd(i5, zzczVar, i6, zzwjVar2, iArr5[i6], z2, zzfpaVar));
                    i6++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvw
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzwd) Collections.max((List) obj)).zza((zzwd) Collections.max((List) obj2));
            }
        });
        if (zzu2 != null) {
            zzwwVarArr[((Integer) zzu2.second).intValue()] = (zzww) zzu2.first;
        }
        if (zzu2 == null) {
            str = null;
        } else {
            Object obj = zzu2.first;
            str = ((zzww) obj).zza.zzb(((zzww) obj).zzb[0]).zzd;
        }
        int i5 = 3;
        Pair zzu3 = zzu(3, zzwzVar, iArr4, new zzwq() { // from class: com.google.android.gms.internal.ads.zzvz
            @Override // com.google.android.gms.internal.ads.zzwq
            public final List zza(int i6, zzcz zzczVar, int[] iArr5) {
                zzwj zzwjVar2 = zzwj.this;
                String str2 = str;
                int i7 = zzwv.zzb;
                zzfro zzfroVar = new zzfro();
                int i8 = 0;
                while (true) {
                    int i9 = zzczVar.zzb;
                    if (i8 > 0) {
                        return zzfroVar.zzi();
                    }
                    zzfroVar.zzf(new zzwp(i6, zzczVar, i8, zzwjVar2, iArr5[i8], str2));
                    i8++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwa
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzwp) ((List) obj2).get(0)).zza((zzwp) ((List) obj3).get(0));
            }
        });
        if (zzu3 != null) {
            zzwwVarArr[((Integer) zzu3.second).intValue()] = (zzww) zzu3.first;
        }
        int i6 = 0;
        while (i6 < i2) {
            int zzc2 = zzwzVar.zzc(i6);
            if (zzc2 != i2 && zzc2 != i && zzc2 != i5) {
                zzvk zzd2 = zzwzVar.zzd(i6);
                int[][] iArr5 = iArr4[i6];
                int i7 = i3;
                int i8 = i7;
                zzcz zzczVar = null;
                zzwe zzweVar = null;
                while (i7 < zzd2.zzc) {
                    zzcz zzb2 = zzd2.zzb(i7);
                    int[] iArr6 = iArr5[i7];
                    int i9 = i3;
                    zzwe zzweVar2 = zzweVar;
                    while (true) {
                        int i10 = zzb2.zzb;
                        if (i9 <= 0) {
                            if (zzm(iArr6[i9], zzwjVar.zzQ)) {
                                zzwe zzweVar3 = new zzwe(zzb2.zzb(i9), iArr6[i9]);
                                if (zzweVar2 == null || zzweVar3.compareTo(zzweVar2) > 0) {
                                    i8 = i9;
                                    zzweVar2 = zzweVar3;
                                    zzczVar = zzb2;
                                }
                            }
                            i9++;
                        }
                    }
                    i7++;
                    zzweVar = zzweVar2;
                    i3 = 0;
                }
                zzwwVarArr[i6] = zzczVar == null ? null : new zzww(zzczVar, new int[]{i8}, 0);
            }
            i6++;
            iArr4 = iArr;
            i2 = 2;
            i3 = 0;
            i = 1;
            i5 = 3;
        }
        HashMap hashMap = new HashMap();
        int i11 = 2;
        for (int i12 = 0; i12 < 2; i12++) {
            zzs(zzwzVar.zzd(i12), zzwjVar, hashMap);
        }
        zzs(zzwzVar.zze(), zzwjVar, hashMap);
        for (int i13 = 0; i13 < 2; i13++) {
            if (((zzdb) hashMap.get(Integer.valueOf(zzwzVar.zzc(i13)))) != null) {
                throw null;
            }
        }
        int i14 = 0;
        while (i14 < i11) {
            zzvk zzd3 = zzwzVar.zzd(i14);
            if (zzwjVar.zzg(i14, zzd3)) {
                if (zzwjVar.zze(i14, zzd3) != null) {
                    throw null;
                }
                zzwwVarArr[i14] = null;
            }
            i14++;
            i11 = 2;
        }
        int i15 = 0;
        for (int i16 = i11; i15 < i16; i16 = 2) {
            int zzc3 = zzwzVar.zzc(i15);
            if (zzwjVar.zzf(i15) || zzwjVar.zzC.contains(Integer.valueOf(zzc3))) {
                zzwwVarArr[i15] = null;
            }
            i15++;
        }
        zzvq zzvqVar = this.zzj;
        zzxl zzp = zzp();
        zzfrr zzf = zzvr.zzf(zzwwVarArr);
        int i17 = 2;
        zzwx[] zzwxVarArr = new zzwx[2];
        int i18 = 0;
        while (i18 < i17) {
            zzww zzwwVar = zzwwVarArr[i18];
            if (zzwwVar != null && (length = (iArr3 = zzwwVar.zzb).length) != 0) {
                zzwxVarArr[i18] = length == 1 ? new zzwy(zzwwVar.zza, iArr3[0], 0, 0, null) : zzvqVar.zza(zzwwVar.zza, iArr3, 0, zzp, (zzfrr) zzf.get(i18));
            }
            i18++;
            i17 = 2;
        }
        zzlg[] zzlgVarArr = new zzlg[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            zzlgVarArr[i19] = (zzwjVar.zzf(i19) || zzwjVar.zzC.contains(Integer.valueOf(zzwzVar.zzc(i19))) || (zzwzVar.zzc(i19) != -2 && zzwxVarArr[i19] == null)) ? null : zzlg.zza;
        }
        return Pair.create(zzlgVarArr, zzwxVarArr);
    }

    public final zzwj zzc() {
        zzwj zzwjVar;
        synchronized (this.zze) {
            zzwjVar = this.zzg;
        }
        return zzwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzh() {
        zzwo zzwoVar;
        synchronized (this.zze) {
            if (zzfn.zza >= 32 && (zzwoVar = this.zzh) != null) {
                zzwoVar.zzc();
            }
        }
        super.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzi(zzk zzkVar) {
        boolean z;
        synchronized (this.zze) {
            z = !this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (z) {
            zzt();
        }
    }

    public final void zzj(zzwh zzwhVar) {
        boolean z;
        zzwj zzwjVar = new zzwj(zzwhVar);
        synchronized (this.zze) {
            z = !this.zzg.equals(zzwjVar);
            this.zzg = zzwjVar;
        }
        if (z) {
            if (zzwjVar.zzP && this.zza == null) {
                zzer.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final boolean zzl() {
        return true;
    }
}
