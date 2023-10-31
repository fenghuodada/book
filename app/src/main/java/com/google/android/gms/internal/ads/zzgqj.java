package com.google.android.gms.internal.ads;

import com.adcolony.sdk.C2362x3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgqj<T> implements zzgqz<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgsa.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgqg zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzgpu zzn;
    private final zzgrq zzo;
    private final zzgoj zzp;
    private final zzgql zzq;
    private final zzgqb zzr;

    private zzgqj(int[] iArr, Object[] objArr, int i, int i2, zzgqg zzgqgVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgql zzgqlVar, zzgpu zzgpuVar, zzgrq zzgrqVar, zzgoj zzgojVar, zzgqb zzgqbVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgqgVar instanceof zzgow;
        this.zzj = z;
        boolean z3 = false;
        if (zzgojVar != null && zzgojVar.zzh(zzgqgVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzgqlVar;
        this.zzn = zzgpuVar;
        this.zzo = zzgrqVar;
        this.zzp = zzgojVar;
        this.zzg = zzgqgVar;
        this.zzr = zzgqbVar;
    }

    private static long zzA(Object obj, long j) {
        return ((Long) zzgsa.zzh(obj, j)).longValue();
    }

    private final zzgpa zzB(int i) {
        int i2 = i / 3;
        return (zzgpa) this.zzd[i2 + i2 + 1];
    }

    private final zzgqz zzC(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgqz zzgqzVar = (zzgqz) this.zzd[i3];
        if (zzgqzVar != null) {
            return zzgqzVar;
        }
        zzgqz zzb2 = zzgqo.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i, Object obj2, zzgrq zzgrqVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzh = zzgsa.zzh(obj, zzz(i) & 1048575);
        if (zzh == null || zzB(i) == null) {
            return obj2;
        }
        zzgqa zzgqaVar = (zzgqa) zzh;
        zzgpz zzgpzVar = (zzgpz) zzE(i);
        throw null;
    }

    private final Object zzE(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzF(Object obj, int i) {
        zzgqz zzC = zzC(i);
        int zzz = zzz(i) & 1048575;
        if (zzS(obj, i)) {
            Object object = zzb.getObject(obj, zzz);
            if (zzV(object)) {
                return object;
            }
            Object zze = zzC.zze();
            if (object != null) {
                zzC.zzg(zze, object);
            }
            return zze;
        }
        return zzC.zze();
    }

    private final Object zzG(Object obj, int i, int i2) {
        zzgqz zzC = zzC(i2);
        if (zzW(obj, i, i2)) {
            Object object = zzb.getObject(obj, zzz(i2) & 1048575);
            if (zzV(object)) {
                return object;
            }
            Object zze = zzC.zze();
            if (object != null) {
                zzC.zzg(zze, object);
            }
            return zze;
        }
        return zzC.zze();
    }

    private static Field zzH(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder m9460b = C2362x3.m9460b("Field ", str, " for ", name, " not found. Known fields are ");
            m9460b.append(arrays);
            throw new RuntimeException(m9460b.toString());
        }
    }

    private static void zzI(Object obj) {
        if (!zzV(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        if (zzS(obj2, i)) {
            Unsafe unsafe = zzb;
            long zzz = zzz(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzz);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgqz zzC = zzC(i);
            if (!zzS(obj, i)) {
                if (zzV(object)) {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, zzz, zze);
                } else {
                    unsafe.putObject(obj, zzz, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzz);
            if (!zzV(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, zzz, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzW(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long zzz = zzz(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzz);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgqz zzC = zzC(i);
            if (!zzW(obj, i2, i)) {
                if (zzV(object)) {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, zzz, zze);
                } else {
                    unsafe.putObject(obj, zzz, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzz);
            if (!zzV(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, zzz, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i, zzgqr zzgqrVar) throws IOException {
        int i2;
        Object zzr;
        if (zzR(i)) {
            i2 = i & 1048575;
            zzr = zzgqrVar.zzs();
        } else {
            i2 = i & 1048575;
            zzr = this.zzi ? zzgqrVar.zzr() : zzgqrVar.zzp();
        }
        zzgsa.zzv(obj, i2, zzr);
    }

    private final void zzM(Object obj, int i) {
        int zzw = zzw(i);
        long j = 1048575 & zzw;
        if (j == 1048575) {
            return;
        }
        zzgsa.zzt(obj, j, (1 << (zzw >>> 20)) | zzgsa.zzd(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzgsa.zzt(obj, zzw(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzz(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzz(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    private final boolean zzQ(Object obj, Object obj2, int i) {
        return zzS(obj, i) == zzS(obj2, i);
    }

    private static boolean zzR(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzS(Object obj, int i) {
        int zzw = zzw(i);
        long j = zzw & 1048575;
        if (j != 1048575) {
            return (zzgsa.zzd(obj, j) & (1 << (zzw >>> 20))) != 0;
        }
        int zzz = zzz(i);
        long j2 = zzz & 1048575;
        switch (zzy(zzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzgsa.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgsa.zzc(obj, j2)) != 0;
            case 2:
                return zzgsa.zzf(obj, j2) != 0;
            case 3:
                return zzgsa.zzf(obj, j2) != 0;
            case 4:
                return zzgsa.zzd(obj, j2) != 0;
            case 5:
                return zzgsa.zzf(obj, j2) != 0;
            case 6:
                return zzgsa.zzd(obj, j2) != 0;
            case 7:
                return zzgsa.zzz(obj, j2);
            case 8:
                Object zzh = zzgsa.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                } else if (zzh instanceof zzgno) {
                    return !zzgno.zzb.equals(zzh);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgsa.zzh(obj, j2) != null;
            case 10:
                return !zzgno.zzb.equals(zzgsa.zzh(obj, j2));
            case 11:
                return zzgsa.zzd(obj, j2) != 0;
            case 12:
                return zzgsa.zzd(obj, j2) != 0;
            case 13:
                return zzgsa.zzd(obj, j2) != 0;
            case 14:
                return zzgsa.zzf(obj, j2) != 0;
            case 15:
                return zzgsa.zzd(obj, j2) != 0;
            case 16:
                return zzgsa.zzf(obj, j2) != 0;
            case 17:
                return zzgsa.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzT(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzS(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzU(Object obj, int i, zzgqz zzgqzVar) {
        return zzgqzVar.zzk(zzgsa.zzh(obj, i & 1048575));
    }

    private static boolean zzV(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgow) {
            return ((zzgow) obj).zzaY();
        }
        return true;
    }

    private final boolean zzW(Object obj, int i, int i2) {
        return zzgsa.zzd(obj, (long) (zzw(i2) & 1048575)) == i;
    }

    private static boolean zzX(Object obj, long j) {
        return ((Boolean) zzgsa.zzh(obj, j)).booleanValue();
    }

    private final void zzY(zzgoe zzgoeVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzgpz zzgpzVar = (zzgpz) zzE(i2);
        throw null;
    }

    private static final void zzZ(int i, Object obj, zzgoe zzgoeVar) throws IOException {
        if (obj instanceof String) {
            zzgoeVar.zzF(i, (String) obj);
        } else {
            zzgoeVar.zzd(i, (zzgno) obj);
        }
    }

    public static zzgrr zzd(Object obj) {
        zzgow zzgowVar = (zzgow) obj;
        zzgrr zzgrrVar = zzgowVar.zzc;
        if (zzgrrVar == zzgrr.zzc()) {
            zzgrr zzf = zzgrr.zzf();
            zzgowVar.zzc = zzf;
            return zzf;
        }
        return zzgrrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgqj zzl(java.lang.Class r31, com.google.android.gms.internal.ads.zzgqd r32, com.google.android.gms.internal.ads.zzgql r33, com.google.android.gms.internal.ads.zzgpu r34, com.google.android.gms.internal.ads.zzgrq r35, com.google.android.gms.internal.ads.zzgoj r36, com.google.android.gms.internal.ads.zzgqb r37) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqj.zzl(java.lang.Class, com.google.android.gms.internal.ads.zzgqd, com.google.android.gms.internal.ads.zzgql, com.google.android.gms.internal.ads.zzgpu, com.google.android.gms.internal.ads.zzgrq, com.google.android.gms.internal.ads.zzgoj, com.google.android.gms.internal.ads.zzgqb):com.google.android.gms.internal.ads.zzgqj");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzgsa.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzgsa.zzh(obj, j)).floatValue();
    }

    private final int zzp(Object obj) {
        int i;
        int zzA;
        int i2;
        Object object;
        int i3;
        int zzA2;
        int zzA3;
        int i4;
        int zzg;
        int zzh;
        int zzA4;
        Object object2;
        int i5;
        Unsafe unsafe = zzb;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (i9 < this.zzc.length) {
            int zzz = zzz(i9);
            int[] iArr = this.zzc;
            int i11 = iArr[i9];
            int zzy = zzy(zzz);
            if (zzy <= 17) {
                int i12 = iArr[i9 + 2];
                int i13 = i12 & i6;
                int i14 = i12 >>> 20;
                if (i13 != i10) {
                    i7 = unsafe.getInt(obj, i13);
                    i10 = i13;
                }
                i = 1 << i14;
            } else {
                i = 0;
            }
            long j = i6 & zzz;
            switch (zzy) {
                case 0:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 8;
                    break;
                case 1:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 4;
                    break;
                case 2:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    int zzB = zzgod.zzB(unsafe.getLong(obj, j));
                    zzA = zzgod.zzA(i11 << 3);
                    i2 = zzB;
                    i8 = zzA + i2 + i8;
                    i9 += 3;
                    i6 = 1048575;
                case 3:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    int zzB2 = zzgod.zzB(unsafe.getLong(obj, j));
                    zzA = zzgod.zzA(i11 << 3);
                    i2 = zzB2;
                    i8 = zzA + i2 + i8;
                    i9 += 3;
                    i6 = 1048575;
                case 4:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    i3 = i11 << 3;
                    i2 = zzgod.zzx(unsafe.getInt(obj, j));
                    zzA = zzgod.zzA(i3);
                    i8 = zzA + i2 + i8;
                    i9 += 3;
                    i6 = 1048575;
                case 5:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 8;
                    break;
                case 6:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 4;
                    break;
                case 7:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 1;
                    break;
                case 8:
                    if ((i7 & i) != 0) {
                        object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzgno)) {
                            i3 = i11 << 3;
                            i2 = zzgod.zzz((String) object);
                            zzA = zzgod.zzA(i3);
                            i8 = zzA + i2 + i8;
                            i9 += 3;
                            i6 = 1048575;
                        }
                        int i15 = zzgod.zzf;
                        int zzd = ((zzgno) object).zzd();
                        zzA2 = zzd + zzgod.zzA(zzd);
                        zzA3 = zzgod.zzA(i11 << 3);
                        zzg = zzA2 + zzA3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 9:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgrb.zzn(i11, unsafe.getObject(obj, j), zzC(i9));
                    break;
                case 10:
                    if ((i7 & i) != 0) {
                        object = unsafe.getObject(obj, j);
                        int i152 = zzgod.zzf;
                        int zzd2 = ((zzgno) object).zzd();
                        zzA2 = zzd2 + zzgod.zzA(zzd2);
                        zzA3 = zzgod.zzA(i11 << 3);
                        zzg = zzA2 + zzA3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 11:
                    if ((i7 & i) != 0) {
                        i3 = i11 << 3;
                        i2 = zzgod.zzA(unsafe.getInt(obj, j));
                        zzA = zzgod.zzA(i3);
                        i8 = zzA + i2 + i8;
                        i9 += 3;
                        i6 = 1048575;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 12:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    i3 = i11 << 3;
                    i2 = zzgod.zzx(unsafe.getInt(obj, j));
                    zzA = zzgod.zzA(i3);
                    i8 = zzA + i2 + i8;
                    i9 += 3;
                    i6 = 1048575;
                case 13:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 4;
                    break;
                case 14:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 8;
                    break;
                case 15:
                    if ((i7 & i) != 0) {
                        i4 = unsafe.getInt(obj, j);
                        zzg = zzgod.zzA((i4 >> 31) ^ (i4 + i4)) + zzgod.zzA(i11 << 3);
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 16:
                    if ((i & i7) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        zzA2 = zzgod.zzA(i11 << 3);
                        zzA3 = zzgod.zzB((j2 >> 63) ^ (j2 + j2));
                        zzg = zzA2 + zzA3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 17:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzw(i11, (zzgqg) unsafe.getObject(obj, j), zzC(i9));
                    break;
                case 18:
                case 23:
                case 32:
                    zzg = zzgrb.zzg(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 19:
                case 24:
                case 31:
                    zzg = zzgrb.zze(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 20:
                    zzg = zzgrb.zzl(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 21:
                    zzg = zzgrb.zzw(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 22:
                    zzg = zzgrb.zzj(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 25:
                    zzg = zzgrb.zza(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 26:
                    zzg = zzgrb.zzt(i11, (List) unsafe.getObject(obj, j));
                    break;
                case 27:
                    zzg = zzgrb.zzo(i11, (List) unsafe.getObject(obj, j), zzC(i9));
                    break;
                case 28:
                    zzg = zzgrb.zzb(i11, (List) unsafe.getObject(obj, j));
                    break;
                case 29:
                    zzg = zzgrb.zzu(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 30:
                    zzg = zzgrb.zzc(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 33:
                    zzg = zzgrb.zzp(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 34:
                    zzg = zzgrb.zzr(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 35:
                    zzh = zzgrb.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 36:
                    zzh = zzgrb.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 37:
                    zzh = zzgrb.zzm((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 38:
                    zzh = zzgrb.zzx((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 39:
                    zzh = zzgrb.zzk((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 40:
                    zzh = zzgrb.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 41:
                    zzh = zzgrb.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 42:
                    int i16 = zzgrb.zza;
                    zzh = ((List) unsafe.getObject(obj, j)).size();
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 43:
                    zzh = zzgrb.zzv((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 44:
                    zzh = zzgrb.zzd((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 45:
                    zzh = zzgrb.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 46:
                    zzh = zzgrb.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 47:
                    zzh = zzgrb.zzq((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 48:
                    zzh = zzgrb.zzs((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzA4 = zzgod.zzA(i11 << 3) + zzgod.zzA(zzh);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 49:
                    zzg = zzgrb.zzi(i11, (List) unsafe.getObject(obj, j), zzC(i9));
                    break;
                case 50:
                    zzgqb.zza(i11, unsafe.getObject(obj, j), zzE(i9));
                    continue;
                    i9 += 3;
                    i6 = 1048575;
                case 51:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 8;
                    break;
                case 52:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 4;
                    break;
                case 53:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    int zzB3 = zzgod.zzB(zzA(obj, j));
                    zzA4 = zzgod.zzA(i11 << 3);
                    zzh = zzB3;
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 54:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    int zzB32 = zzgod.zzB(zzA(obj, j));
                    zzA4 = zzgod.zzA(i11 << 3);
                    zzh = zzB32;
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 55:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    i5 = i11 << 3;
                    zzh = zzgod.zzx(zzq(obj, j));
                    zzA4 = zzgod.zzA(i5);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 56:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 8;
                    break;
                case 57:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 4;
                    break;
                case 58:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 1;
                    break;
                case 59:
                    if (zzW(obj, i11, i9)) {
                        object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof zzgno)) {
                            i5 = i11 << 3;
                            zzh = zzgod.zzz((String) object2);
                            zzA4 = zzgod.zzA(i5);
                            i8 += zzA4 + zzh;
                            i9 += 3;
                            i6 = 1048575;
                        }
                        int i17 = zzgod.zzf;
                        int zzd3 = ((zzgno) object2).zzd();
                        zzA2 = zzd3 + zzgod.zzA(zzd3);
                        zzA3 = zzgod.zzA(i11 << 3);
                        zzg = zzA2 + zzA3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 60:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgrb.zzn(i11, unsafe.getObject(obj, j), zzC(i9));
                    break;
                case 61:
                    if (zzW(obj, i11, i9)) {
                        object2 = unsafe.getObject(obj, j);
                        int i172 = zzgod.zzf;
                        int zzd32 = ((zzgno) object2).zzd();
                        zzA2 = zzd32 + zzgod.zzA(zzd32);
                        zzA3 = zzgod.zzA(i11 << 3);
                        zzg = zzA2 + zzA3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 62:
                    if (zzW(obj, i11, i9)) {
                        i5 = i11 << 3;
                        zzh = zzgod.zzA(zzq(obj, j));
                        zzA4 = zzgod.zzA(i5);
                        i8 += zzA4 + zzh;
                        i9 += 3;
                        i6 = 1048575;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 63:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    i5 = i11 << 3;
                    zzh = zzgod.zzx(zzq(obj, j));
                    zzA4 = zzgod.zzA(i5);
                    i8 += zzA4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 64:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 4;
                    break;
                case 65:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzA(i11 << 3) + 8;
                    break;
                case 66:
                    if (zzW(obj, i11, i9)) {
                        i4 = zzq(obj, j);
                        zzg = zzgod.zzA((i4 >> 31) ^ (i4 + i4)) + zzgod.zzA(i11 << 3);
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 67:
                    if (zzW(obj, i11, i9)) {
                        long zzA5 = zzA(obj, j);
                        zzA2 = zzgod.zzA(i11 << 3);
                        zzA3 = zzgod.zzB((zzA5 >> 63) ^ (zzA5 + zzA5));
                        zzg = zzA2 + zzA3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 68:
                    if (!zzW(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzgod.zzw(i11, (zzgqg) unsafe.getObject(obj, j), zzC(i9));
                    break;
                default:
                    i9 += 3;
                    i6 = 1048575;
            }
            i8 += zzg;
            i9 += 3;
            i6 = 1048575;
        }
        zzgrq zzgrqVar = this.zzo;
        int zza2 = i8 + zzgrqVar.zza(zzgrqVar.zzd(obj));
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return zza2;
    }

    private static int zzq(Object obj, long j) {
        return ((Integer) zzgsa.zzh(obj, j)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzgna zzgnaVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzgqb.zzb(object)) {
            zzgqa zzb2 = zzgqa.zza().zzb();
            zzgqb.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzgpz zzgpzVar = (zzgpz) zzE;
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgna zzgnaVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzgnb.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzgnb.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzgnb.zzm(bArr, i, zzgnaVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgnaVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzgnb.zzj(bArr, i, zzgnaVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgnaVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzgnb.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzgnb.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzgnb.zzm(bArr, i, zzgnaVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzgnaVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzgnb.zzj(bArr, i, zzgnaVar);
                    int i13 = zzgnaVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzgsf.zzj(bArr, zzj2, zzj2 + i13)) {
                        throw zzgpi.zzd();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzgpg.zzb));
                        zzj2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzG = zzG(obj, i4, i8);
                    int zzo = zzgnb.zzo(zzG, zzC(i8), bArr, i, i2, zzgnaVar);
                    zzP(obj, i4, i8, zzG);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzgnb.zza(bArr, i, zzgnaVar);
                    unsafe.putObject(obj, j, zzgnaVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzgnb.zzj(bArr, i, zzgnaVar);
                    int i14 = zzgnaVar.zza;
                    zzgpa zzB = zzB(i8);
                    if (zzB == null || zzB.zza(i14)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzd(obj).zzj(i3, Long.valueOf(i14));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzgnb.zzj(bArr, i, zzgnaVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgnw.zzF(zzgnaVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzgnb.zzm(bArr, i, zzgnaVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgnw.zzG(zzgnaVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzG2 = zzG(obj, i4, i8);
                    int zzn = zzgnb.zzn(zzG2, zzC(i8), bArr, i, i2, (i3 & (-8)) | 4, zzgnaVar);
                    zzP(obj, i4, i8, zzG2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x024e, code lost:
        if (r29.zzb != 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0250, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0252, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0253, code lost:
        r12.zze(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0256, code lost:
        if (r4 >= r19) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0258, code lost:
        r6 = com.google.android.gms.internal.ads.zzgnb.zzj(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x025e, code lost:
        if (r20 == r29.zza) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0261, code lost:
        r4 = com.google.android.gms.internal.ads.zzgnb.zzm(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0269, code lost:
        if (r29.zzb == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x026c, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r4 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        r12.add(com.google.android.gms.internal.ads.zzgno.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r12.add(com.google.android.gms.internal.ads.zzgno.zzv(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1 >= r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r4 = com.google.android.gms.internal.ads.zzgnb.zzj(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r20 == r29.zza) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = com.google.android.gms.internal.ads.zzgnb.zzj(r17, r4, r29);
        r4 = r29.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
        if (r4 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
        if (r4 > (r17.length - r1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
        if (r4 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
        throw com.google.android.gms.internal.ads.zzgpi.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw com.google.android.gms.internal.ads.zzgpi.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x01dd -> B:110:0x01e1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01f3 -> B:105:0x01ca). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0252 -> B:146:0x0253). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0269 -> B:144:0x0250). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0123 -> B:59:0x012b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0142 -> B:57:0x011d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0195 -> B:90:0x0199). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01ab -> B:87:0x018a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzt(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzgna r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqj.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzgna):int");
    }

    private final int zzu(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, 0);
    }

    private final int zzv(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, i2);
    }

    private final int zzw(int i) {
        return this.zzc[i + 2];
    }

    private final int zzx(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzy(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzz(int i) {
        return this.zzc[i + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0310, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.zzgno) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0327, code lost:
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.ads.zzgod.zzz((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.zzgno) != false) goto L54;
     */
    @Override // com.google.android.gms.internal.ads.zzgqz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqj.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e7, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.ads.zzgqz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqj.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0308, code lost:
        if (r0 != r21) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x030a, code lost:
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r1 = r30;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r8 = r18;
        r5 = r19;
        r3 = r20;
        r2 = r21;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0326, code lost:
        r2 = r0;
        r7 = r20;
        r6 = r23;
        r0 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x035a, code lost:
        if (r0 != r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0380, code lost:
        if (r0 != r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0403, code lost:
        if (r0 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0405, code lost:
        r26.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x040b, code lost:
        r10 = r8.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0410, code lost:
        if (r10 >= r8.zzm) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0412, code lost:
        zzD(r28, r8.zzk[r10], null, r8.zzo, r28);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0427, code lost:
        if (r9 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0429, code lost:
        if (r6 != r31) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0430, code lost:
        throw com.google.android.gms.internal.ads.zzgpi.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0431, code lost:
        if (r6 > r31) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0433, code lost:
        if (r7 != r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0435, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x043a, code lost:
        throw com.google.android.gms.internal.ads.zzgpi.zzg();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.zzgna r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqj.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgna):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final Object zze() {
        return ((zzgow) this.zzg).zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final void zzf(Object obj) {
        int i;
        if (zzV(obj)) {
            if (obj instanceof zzgow) {
                zzgow zzgowVar = (zzgow) obj;
                zzgowVar.zzaV(Integer.MAX_VALUE);
                zzgowVar.zza = 0;
                zzgowVar.zzaT();
            }
            int length = this.zzc.length;
            while (i < length) {
                int zzz = zzz(i);
                int i2 = 1048575 & zzz;
                int zzy = zzy(zzz);
                long j = i2;
                if (zzy != 9) {
                    if (zzy != 60 && zzy != 68) {
                        switch (zzy) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzn.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object == null) {
                                    break;
                                } else {
                                    ((zzgqa) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                }
                        }
                    } else {
                        if (!zzW(obj, this.zzc[i], i)) {
                        }
                        zzC(i).zzf(zzb.getObject(obj, j));
                    }
                }
                i = zzS(obj, i) ? 0 : i + 3;
                zzC(i).zzf(zzb.getObject(obj, j));
            }
            this.zzo.zzm(obj);
            if (this.zzh) {
                this.zzp.zze(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzz = zzz(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzz;
            switch (zzy(zzz)) {
                case 0:
                    if (zzS(obj2, i)) {
                        zzgsa.zzr(obj, j, zzgsa.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzS(obj2, i)) {
                        zzgsa.zzs(obj, j, zzgsa.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzu(obj, j, zzgsa.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 3:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzu(obj, j, zzgsa.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 4:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzt(obj, j, zzgsa.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 5:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzu(obj, j, zzgsa.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 6:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzt(obj, j, zzgsa.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 7:
                    if (zzS(obj2, i)) {
                        zzgsa.zzp(obj, j, zzgsa.zzz(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzv(obj, j, zzgsa.zzh(obj2, j));
                    zzM(obj, i);
                    break;
                case 9:
                case 17:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzv(obj, j, zzgsa.zzh(obj2, j));
                    zzM(obj, i);
                    break;
                case 11:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzt(obj, j, zzgsa.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 12:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzt(obj, j, zzgsa.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 13:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzt(obj, j, zzgsa.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 14:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzu(obj, j, zzgsa.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 15:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzt(obj, j, zzgsa.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 16:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgsa.zzu(obj, j, zzgsa.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzgrb.zza;
                    zzgsa.zzv(obj, j, zzgqb.zzc(zzgsa.zzh(obj, j), zzgsa.zzh(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzW(obj2, i2, i)) {
                        break;
                    }
                    zzgsa.zzv(obj, j, zzgsa.zzh(obj2, j));
                    zzN(obj, i2, i);
                    break;
                case 60:
                case 68:
                    zzK(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzW(obj2, i2, i)) {
                        break;
                    }
                    zzgsa.zzv(obj, j, zzgsa.zzh(obj2, j));
                    zzN(obj, i2, i);
                    break;
            }
        }
        zzgrb.zzC(this.zzo, obj, obj2);
        if (this.zzh) {
            this.zzp.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x05af A[Catch: all -> 0x05a4, TryCatch #2 {all -> 0x05a4, blocks: (B:171:0x057d, B:185:0x05aa, B:187:0x05af, B:188:0x05b4), top: B:211:0x057d }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05e7 A[LOOP:3: B:203:0x05e3->B:205:0x05e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05ba A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgqz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzgqr r19, com.google.android.gms.internal.ads.zzgoi r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqj.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzgqr, com.google.android.gms.internal.ads.zzgoi):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e5, code lost:
        if (r0 != r24) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02e7, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02fa, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0326, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0347, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzgqz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzgna r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqj.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzgna):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzz = zzz(i);
            long j = zzz & 1048575;
            switch (zzy(zzz)) {
                case 0:
                    if (zzQ(obj, obj2, i) && Double.doubleToLongBits(zzgsa.zzb(obj, j)) == Double.doubleToLongBits(zzgsa.zzb(obj2, j))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzQ(obj, obj2, i) && Float.floatToIntBits(zzgsa.zzc(obj, j)) == Float.floatToIntBits(zzgsa.zzc(obj2, j))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzQ(obj, obj2, i) && zzgsa.zzf(obj, j) == zzgsa.zzf(obj2, j)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzQ(obj, obj2, i) && zzgsa.zzf(obj, j) == zzgsa.zzf(obj2, j)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzQ(obj, obj2, i) && zzgsa.zzd(obj, j) == zzgsa.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzQ(obj, obj2, i) && zzgsa.zzf(obj, j) == zzgsa.zzf(obj2, j)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzQ(obj, obj2, i) && zzgsa.zzd(obj, j) == zzgsa.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzQ(obj, obj2, i) && zzgsa.zzz(obj, j) == zzgsa.zzz(obj2, j)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzQ(obj, obj2, i) && zzgrb.zzE(zzgsa.zzh(obj, j), zzgsa.zzh(obj2, j))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzQ(obj, obj2, i) && zzgrb.zzE(zzgsa.zzh(obj, j), zzgsa.zzh(obj2, j))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzQ(obj, obj2, i) && zzgrb.zzE(zzgsa.zzh(obj, j), zzgsa.zzh(obj2, j))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzQ(obj, obj2, i) && zzgsa.zzd(obj, j) == zzgsa.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzQ(obj, obj2, i) && zzgsa.zzd(obj, j) == zzgsa.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzQ(obj, obj2, i) && zzgsa.zzd(obj, j) == zzgsa.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzQ(obj, obj2, i) && zzgsa.zzf(obj, j) == zzgsa.zzf(obj2, j)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzQ(obj, obj2, i) && zzgsa.zzd(obj, j) == zzgsa.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzQ(obj, obj2, i) && zzgsa.zzf(obj, j) == zzgsa.zzf(obj2, j)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzQ(obj, obj2, i) && zzgrb.zzE(zzgsa.zzh(obj, j), zzgsa.zzh(obj2, j))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (zzgrb.zzE(zzgsa.zzh(obj, j), zzgsa.zzh(obj2, j))) {
                        break;
                    } else {
                        return false;
                    }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzw = zzw(i) & 1048575;
                    if (zzgsa.zzd(obj, zzw) == zzgsa.zzd(obj2, zzw) && zzgrb.zzE(zzgsa.zzh(obj, j), zzgsa.zzh(obj2, j))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            if (this.zzh) {
                this.zzp.zza(obj);
                this.zzp.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzl) {
            int i6 = this.zzk[i4];
            int i7 = this.zzc[i6];
            int zzz = zzz(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzz) != 0 && !zzT(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy == 60 || zzy == 68) {
                        if (zzW(obj, i7, i6) && !zzU(obj, zzz, zzC(i6))) {
                            return false;
                        }
                    } else if (zzy != 49) {
                        if (zzy == 50 && !((zzgqa) zzgsa.zzh(obj, zzz & 1048575)).isEmpty()) {
                            zzgpz zzgpzVar = (zzgpz) zzE(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgsa.zzh(obj, zzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgqz zzC = zzC(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzC.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzT(obj, i6, i, i2, i10) && !zzU(obj, zzz, zzC(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzgqz
    public final void zzm(Object obj, zzgoe zzgoeVar) throws IOException {
        int i;
        int i2;
        int i3;
        double zzb2;
        float zzc;
        long zzf;
        long zzf2;
        int zzd;
        long zzf3;
        int zzd2;
        boolean zzz;
        int zzd3;
        int zzd4;
        int zzd5;
        long zzf4;
        int zzd6;
        long zzf5;
        int i4 = 0;
        int i5 = 1048575;
        if (this.zzj) {
            if (this.zzh) {
                this.zzp.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int zzz2 = zzz(i6);
                int i7 = this.zzc[i6];
                switch (zzy(zzz2)) {
                    case 0:
                        if (zzS(obj, i6)) {
                            zzb2 = zzgsa.zzb(obj, zzz2 & 1048575);
                            zzgoeVar.zzf(i7, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzS(obj, i6)) {
                            zzc = zzgsa.zzc(obj, zzz2 & 1048575);
                            zzgoeVar.zzo(i7, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzS(obj, i6)) {
                            zzf = zzgsa.zzf(obj, zzz2 & 1048575);
                            zzgoeVar.zzt(i7, zzf);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzS(obj, i6)) {
                            zzf2 = zzgsa.zzf(obj, zzz2 & 1048575);
                            zzgoeVar.zzJ(i7, zzf2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzS(obj, i6)) {
                            zzd = zzgsa.zzd(obj, zzz2 & 1048575);
                            zzgoeVar.zzr(i7, zzd);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzS(obj, i6)) {
                            zzf3 = zzgsa.zzf(obj, zzz2 & 1048575);
                            zzgoeVar.zzm(i7, zzf3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzS(obj, i6)) {
                            zzd2 = zzgsa.zzd(obj, zzz2 & 1048575);
                            zzgoeVar.zzk(i7, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzS(obj, i6)) {
                            zzz = zzgsa.zzz(obj, zzz2 & 1048575);
                            zzgoeVar.zzb(i7, zzz);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!zzS(obj, i6)) {
                            break;
                        }
                        zzZ(i7, zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar);
                        break;
                    case 9:
                        if (!zzS(obj, i6)) {
                            break;
                        }
                        zzgoeVar.zzv(i7, zzgsa.zzh(obj, zzz2 & 1048575), zzC(i6));
                        break;
                    case 10:
                        if (!zzS(obj, i6)) {
                            break;
                        }
                        zzgoeVar.zzd(i7, (zzgno) zzgsa.zzh(obj, zzz2 & 1048575));
                        break;
                    case 11:
                        if (zzS(obj, i6)) {
                            zzd3 = zzgsa.zzd(obj, zzz2 & 1048575);
                            zzgoeVar.zzH(i7, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzS(obj, i6)) {
                            zzd4 = zzgsa.zzd(obj, zzz2 & 1048575);
                            zzgoeVar.zzi(i7, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzS(obj, i6)) {
                            zzd5 = zzgsa.zzd(obj, zzz2 & 1048575);
                            zzgoeVar.zzw(i7, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzS(obj, i6)) {
                            zzf4 = zzgsa.zzf(obj, zzz2 & 1048575);
                            zzgoeVar.zzy(i7, zzf4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzS(obj, i6)) {
                            zzd6 = zzgsa.zzd(obj, zzz2 & 1048575);
                            zzgoeVar.zzA(i7, zzd6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzS(obj, i6)) {
                            zzf5 = zzgsa.zzf(obj, zzz2 & 1048575);
                            zzgoeVar.zzC(i7, zzf5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!zzS(obj, i6)) {
                            break;
                        }
                        zzgoeVar.zzq(i7, zzgsa.zzh(obj, zzz2 & 1048575), zzC(i6));
                        break;
                    case 18:
                        zzgrb.zzH(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 19:
                        zzgrb.zzL(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 20:
                        zzgrb.zzO(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 21:
                        zzgrb.zzW(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 22:
                        zzgrb.zzN(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 23:
                        zzgrb.zzK(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 24:
                        zzgrb.zzJ(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 25:
                        zzgrb.zzF(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 26:
                        zzgrb.zzU(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar);
                        break;
                    case 27:
                        zzgrb.zzP(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, zzC(i6));
                        break;
                    case 28:
                        zzgrb.zzG(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar);
                        break;
                    case 29:
                        zzgrb.zzV(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 30:
                        zzgrb.zzI(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 31:
                        zzgrb.zzQ(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 32:
                        zzgrb.zzR(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 33:
                        zzgrb.zzS(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 34:
                        zzgrb.zzT(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, false);
                        break;
                    case 35:
                        zzgrb.zzH(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 36:
                        zzgrb.zzL(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 37:
                        zzgrb.zzO(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 38:
                        zzgrb.zzW(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 39:
                        zzgrb.zzN(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 40:
                        zzgrb.zzK(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 41:
                        zzgrb.zzJ(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 42:
                        zzgrb.zzF(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 43:
                        zzgrb.zzV(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 44:
                        zzgrb.zzI(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 45:
                        zzgrb.zzQ(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 46:
                        zzgrb.zzR(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 47:
                        zzgrb.zzS(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 48:
                        zzgrb.zzT(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, true);
                        break;
                    case 49:
                        zzgrb.zzM(i7, (List) zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar, zzC(i6));
                        break;
                    case 50:
                        zzY(zzgoeVar, i7, zzgsa.zzh(obj, zzz2 & 1048575), i6);
                        break;
                    case 51:
                        if (zzW(obj, i7, i6)) {
                            zzb2 = zzn(obj, zzz2 & 1048575);
                            zzgoeVar.zzf(i7, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzW(obj, i7, i6)) {
                            zzc = zzo(obj, zzz2 & 1048575);
                            zzgoeVar.zzo(i7, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzW(obj, i7, i6)) {
                            zzf = zzA(obj, zzz2 & 1048575);
                            zzgoeVar.zzt(i7, zzf);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzW(obj, i7, i6)) {
                            zzf2 = zzA(obj, zzz2 & 1048575);
                            zzgoeVar.zzJ(i7, zzf2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzW(obj, i7, i6)) {
                            zzd = zzq(obj, zzz2 & 1048575);
                            zzgoeVar.zzr(i7, zzd);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzW(obj, i7, i6)) {
                            zzf3 = zzA(obj, zzz2 & 1048575);
                            zzgoeVar.zzm(i7, zzf3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzW(obj, i7, i6)) {
                            zzd2 = zzq(obj, zzz2 & 1048575);
                            zzgoeVar.zzk(i7, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzW(obj, i7, i6)) {
                            zzz = zzX(obj, zzz2 & 1048575);
                            zzgoeVar.zzb(i7, zzz);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!zzW(obj, i7, i6)) {
                            break;
                        }
                        zzZ(i7, zzgsa.zzh(obj, zzz2 & 1048575), zzgoeVar);
                        break;
                    case 60:
                        if (!zzW(obj, i7, i6)) {
                            break;
                        }
                        zzgoeVar.zzv(i7, zzgsa.zzh(obj, zzz2 & 1048575), zzC(i6));
                        break;
                    case 61:
                        if (!zzW(obj, i7, i6)) {
                            break;
                        }
                        zzgoeVar.zzd(i7, (zzgno) zzgsa.zzh(obj, zzz2 & 1048575));
                        break;
                    case 62:
                        if (zzW(obj, i7, i6)) {
                            zzd3 = zzq(obj, zzz2 & 1048575);
                            zzgoeVar.zzH(i7, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzW(obj, i7, i6)) {
                            zzd4 = zzq(obj, zzz2 & 1048575);
                            zzgoeVar.zzi(i7, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzW(obj, i7, i6)) {
                            zzd5 = zzq(obj, zzz2 & 1048575);
                            zzgoeVar.zzw(i7, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzW(obj, i7, i6)) {
                            zzf4 = zzA(obj, zzz2 & 1048575);
                            zzgoeVar.zzy(i7, zzf4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzW(obj, i7, i6)) {
                            zzd6 = zzq(obj, zzz2 & 1048575);
                            zzgoeVar.zzA(i7, zzd6);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzW(obj, i7, i6)) {
                            zzf5 = zzA(obj, zzz2 & 1048575);
                            zzgoeVar.zzC(i7, zzf5);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!zzW(obj, i7, i6)) {
                            break;
                        }
                        zzgoeVar.zzq(i7, zzgsa.zzh(obj, zzz2 & 1048575), zzC(i6));
                        break;
                }
            }
        } else if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        } else {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i8 = 0;
            int i9 = 0;
            int i10 = 1048575;
            while (i8 < length2) {
                int zzz3 = zzz(i8);
                int[] iArr = this.zzc;
                int i11 = iArr[i8];
                int zzy = zzy(zzz3);
                if (zzy <= 17) {
                    int i12 = iArr[i8 + 2];
                    int i13 = i12 & i5;
                    if (i13 != i10) {
                        i9 = unsafe.getInt(obj, i13);
                        i10 = i13;
                    }
                    i = 1 << (i12 >>> 20);
                } else {
                    i = i4;
                }
                long j = zzz3 & i5;
                switch (zzy) {
                    case 0:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzf(i11, zzgsa.zzb(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzo(i11, zzgsa.zzc(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzt(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzJ(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzr(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzm(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzk(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzb(i11, zzgsa.zzz(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzZ(i11, unsafe.getObject(obj, j), zzgoeVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzv(i11, unsafe.getObject(obj, j), zzC(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzd(i11, (zzgno) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzH(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzi(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzw(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzy(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzA(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzC(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgoeVar.zzq(i11, unsafe.getObject(obj, j), zzC(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i2 = 0;
                        zzgrb.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        break;
                    case 19:
                        i2 = 0;
                        zzgrb.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        break;
                    case 20:
                        i2 = 0;
                        zzgrb.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        break;
                    case 21:
                        i2 = 0;
                        zzgrb.zzW(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        break;
                    case 22:
                        i2 = 0;
                        zzgrb.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        break;
                    case 23:
                        i2 = 0;
                        zzgrb.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        break;
                    case 24:
                        i2 = 0;
                        zzgrb.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        break;
                    case 25:
                        i2 = 0;
                        zzgrb.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        break;
                    case 26:
                        zzgrb.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar);
                        i2 = 0;
                        break;
                    case 27:
                        zzgrb.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, zzC(i8));
                        i2 = 0;
                        break;
                    case 28:
                        zzgrb.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar);
                        i2 = 0;
                        break;
                    case 29:
                        i3 = 0;
                        zzgrb.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        i2 = i3;
                        break;
                    case 30:
                        i3 = 0;
                        zzgrb.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        i2 = i3;
                        break;
                    case 31:
                        i3 = 0;
                        zzgrb.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        i2 = i3;
                        break;
                    case 32:
                        i3 = 0;
                        zzgrb.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        i2 = i3;
                        break;
                    case 33:
                        i3 = 0;
                        zzgrb.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        i2 = i3;
                        break;
                    case 34:
                        i3 = 0;
                        zzgrb.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, false);
                        i2 = i3;
                        break;
                    case 35:
                        zzgrb.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 36:
                        zzgrb.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 37:
                        zzgrb.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 38:
                        zzgrb.zzW(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 39:
                        zzgrb.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 40:
                        zzgrb.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 41:
                        zzgrb.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 42:
                        zzgrb.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 43:
                        zzgrb.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 44:
                        zzgrb.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 45:
                        zzgrb.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 46:
                        zzgrb.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 47:
                        zzgrb.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 48:
                        zzgrb.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, true);
                        i2 = 0;
                        break;
                    case 49:
                        zzgrb.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgoeVar, zzC(i8));
                        i2 = 0;
                        break;
                    case 50:
                        zzY(zzgoeVar, i11, unsafe.getObject(obj, j), i8);
                        i2 = 0;
                        break;
                    case 51:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzf(i11, zzn(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 52:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzo(i11, zzo(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 53:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzt(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 54:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzJ(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 55:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzr(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 56:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzm(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 57:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzk(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 58:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzb(i11, zzX(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 59:
                        if (zzW(obj, i11, i8)) {
                            zzZ(i11, unsafe.getObject(obj, j), zzgoeVar);
                        }
                        i2 = 0;
                        break;
                    case 60:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzv(i11, unsafe.getObject(obj, j), zzC(i8));
                        }
                        i2 = 0;
                        break;
                    case 61:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzd(i11, (zzgno) unsafe.getObject(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 62:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzH(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 63:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzi(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 64:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzw(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 65:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzy(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 66:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzA(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 67:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzC(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 68:
                        if (zzW(obj, i11, i8)) {
                            zzgoeVar.zzq(i11, unsafe.getObject(obj, j), zzC(i8));
                        }
                        i2 = 0;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                i8 += 3;
                i4 = i2;
                i5 = 1048575;
            }
        }
        zzgrq zzgrqVar = this.zzo;
        zzgrqVar.zzr(zzgrqVar.zzd(obj), zzgoeVar);
    }
}
