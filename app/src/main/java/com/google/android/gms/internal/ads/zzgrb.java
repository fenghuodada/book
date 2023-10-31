package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgrb {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzgrq zzc;
    private static final zzgrq zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzgrq zzgrqVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzgrqVar = (zzgrq) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzgrqVar;
        zzd = new zzgrs();
    }

    public static Object zzA(Object obj, int i, List list, zzgpa zzgpaVar, Object obj2, zzgrq zzgrqVar) {
        if (zzgpaVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgpaVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = zzB(obj, i, intValue, obj2, zzgrqVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgpaVar.zza(intValue2)) {
                    obj2 = zzB(obj, i, intValue2, obj2, zzgrqVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzB(Object obj, int i, int i2, Object obj2, zzgrq zzgrqVar) {
        if (obj2 == null) {
            obj2 = zzgrqVar.zzc(obj);
        }
        zzgrqVar.zzl(obj2, i, i2);
        return obj2;
    }

    public static void zzC(zzgrq zzgrqVar, Object obj, Object obj2) {
        zzgrqVar.zzo(obj, zzgrqVar.zze(zzgrqVar.zzd(obj), zzgrqVar.zzd(obj2)));
    }

    public static void zzD(Class cls) {
        Class cls2;
        if (!zzgow.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzF(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzc(i, list, z);
    }

    public static void zzG(int i, List list, zzgoe zzgoeVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zze(i, list);
    }

    public static void zzH(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzg(i, list, z);
    }

    public static void zzI(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzj(i, list, z);
    }

    public static void zzJ(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzl(i, list, z);
    }

    public static void zzK(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzn(i, list, z);
    }

    public static void zzL(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzp(i, list, z);
    }

    public static void zzM(int i, List list, zzgoe zzgoeVar, zzgqz zzgqzVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgoeVar.zzq(i, list.get(i2), zzgqzVar);
        }
    }

    public static void zzN(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzs(i, list, z);
    }

    public static void zzO(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzu(i, list, z);
    }

    public static void zzP(int i, List list, zzgoe zzgoeVar, zzgqz zzgqzVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgoeVar.zzv(i, list.get(i2), zzgqzVar);
        }
    }

    public static void zzQ(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzx(i, list, z);
    }

    public static void zzR(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzz(i, list, z);
    }

    public static void zzS(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzB(i, list, z);
    }

    public static void zzT(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzD(i, list, z);
    }

    public static void zzU(int i, List list, zzgoe zzgoeVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzG(i, list);
    }

    public static void zzV(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzI(i, list, z);
    }

    public static void zzW(int i, List list, zzgoe zzgoeVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgoeVar.zzK(i, list, z);
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgod.zzA(i << 3) + 1) * size;
    }

    public static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzA = zzgod.zzA(i << 3) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int zzd2 = ((zzgno) list.get(i2)).zzd();
            zzA += zzgod.zzA(zzd2) + zzd2;
        }
        return zzA;
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgod.zzA(i << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgox) {
            zzgox zzgoxVar = (zzgox) list;
            i = 0;
            while (i2 < size) {
                i += zzgod.zzx(zzgoxVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgod.zzx(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgod.zzA(i << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgod.zzA(i << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i, List list, zzgqz zzgqzVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += zzgod.zzw(i, (zzgqg) list.get(i3), zzgqzVar);
            }
            return i2;
        }
        return 0;
    }

    public static int zzj(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgod.zzA(i << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgox) {
            zzgox zzgoxVar = (zzgox) list;
            i = 0;
            while (i2 < size) {
                i += zzgod.zzx(zzgoxVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgod.zzx(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzl(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzgod.zzA(i << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgpv) {
            zzgpv zzgpvVar = (zzgpv) list;
            i = 0;
            while (i2 < size) {
                i += zzgod.zzB(zzgpvVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgod.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzn(int i, Object obj, zzgqz zzgqzVar) {
        if (!(obj instanceof zzgpm)) {
            return zzgod.zzA(i << 3) + zzgod.zzy((zzgqg) obj, zzgqzVar);
        }
        int i2 = zzgod.zzf;
        int zza2 = ((zzgpm) obj).zza();
        return zzgod.zzA(i << 3) + zzgod.zzA(zza2) + zza2;
    }

    public static int zzo(int i, List list, zzgqz zzgqzVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzA = zzgod.zzA(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzgpm) {
                int zza2 = ((zzgpm) obj).zza();
                zzA = zzgod.zzA(zza2) + zza2 + zzA;
            } else {
                zzA = zzgod.zzy((zzgqg) obj, zzgqzVar) + zzA;
            }
        }
        return zzA;
    }

    public static int zzp(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgod.zzA(i << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgox) {
            zzgox zzgoxVar = (zzgox) list;
            i = 0;
            while (i2 < size) {
                int zze = zzgoxVar.zze(i2);
                i += zzgod.zzA((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzgod.zzA((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzr(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgod.zzA(i << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgpv) {
            zzgpv zzgpvVar = (zzgpv) list;
            i = 0;
            while (i2 < size) {
                long zze = zzgpvVar.zze(i2);
                i += zzgod.zzB((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzgod.zzB((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzt(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = zzgod.zzf;
        boolean z = list instanceof zzgpo;
        int zzA = zzgod.zzA(i << 3) * size;
        if (z) {
            zzgpo zzgpoVar = (zzgpo) list;
            while (i2 < size) {
                Object zzf = zzgpoVar.zzf(i2);
                if (zzf instanceof zzgno) {
                    int zzd2 = ((zzgno) zzf).zzd();
                    zzA = zzgod.zzA(zzd2) + zzd2 + zzA;
                } else {
                    zzA = zzgod.zzz((String) zzf) + zzA;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzgno) {
                    int zzd3 = ((zzgno) obj).zzd();
                    zzA = zzgod.zzA(zzd3) + zzd3 + zzA;
                } else {
                    zzA = zzgod.zzz((String) obj) + zzA;
                }
                i2++;
            }
        }
        return zzA;
    }

    public static int zzu(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgod.zzA(i << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgox) {
            zzgox zzgoxVar = (zzgox) list;
            i = 0;
            while (i2 < size) {
                i += zzgod.zzA(zzgoxVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgod.zzA(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzw(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgod.zzA(i << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgpv) {
            zzgpv zzgpvVar = (zzgpv) list;
            i = 0;
            while (i2 < size) {
                i += zzgod.zzB(zzgpvVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgod.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzgrq zzy() {
        return zzc;
    }

    public static zzgrq zzz() {
        return zzd;
    }
}
