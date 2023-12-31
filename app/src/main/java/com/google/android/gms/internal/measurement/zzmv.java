package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznk zzc;
    private static final zznk zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zznk zznkVar = null;
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
                zznkVar = (zznk) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznkVar;
        zzd = new zznm();
    }

    public static Object zzA(Object obj, int i, int i2, Object obj2, zznk zznkVar) {
        if (obj2 == null) {
            obj2 = zznkVar.zzc(obj);
        }
        zznkVar.zzf(obj2, i, i2);
        return obj2;
    }

    public static void zzB(zznk zznkVar, Object obj, Object obj2) {
        zznkVar.zzh(obj, zznkVar.zze(zznkVar.zzd(obj), zznkVar.zzd(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzlb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzD(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzc(i, list, z);
    }

    public static void zzE(int i, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zze(i, list);
    }

    public static void zzF(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzg(i, list, z);
    }

    public static void zzG(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzj(i, list, z);
    }

    public static void zzH(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzl(i, list, z);
    }

    public static void zzI(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzn(i, list, z);
    }

    public static void zzJ(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzp(i, list, z);
    }

    public static void zzK(int i, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzkj) zzocVar).zzq(i, list.get(i2), zzmtVar);
        }
    }

    public static void zzL(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzs(i, list, z);
    }

    public static void zzM(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzu(i, list, z);
    }

    public static void zzN(int i, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzkj) zzocVar).zzv(i, list.get(i2), zzmtVar);
        }
    }

    public static void zzO(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzx(i, list, z);
    }

    public static void zzP(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzz(i, list, z);
    }

    public static void zzQ(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzB(i, list, z);
    }

    public static void zzR(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzD(i, list, z);
    }

    public static void zzS(int i, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzG(i, list);
    }

    public static void zzT(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzI(i, list, z);
    }

    public static void zzU(int i, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzK(i, list, z);
    }

    public static boolean zzV(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 1) * size;
    }

    public static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzki.zzx(i << 3) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int zzd2 = ((zzka) list.get(i2)).zzd();
            zzx += zzki.zzx(zzd2) + zzd2;
        }
        return zzx;
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i = 0;
            while (i2 < size) {
                i += zzki.zzu(zzlcVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzki.zzu(((Integer) list.get(i2)).intValue());
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
        return (zzki.zzx(i << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += zzki.zzt(i, (zzmi) list.get(i3), zzmtVar);
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
        return (zzki.zzx(i << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i = 0;
            while (i2 < size) {
                i += zzki.zzu(zzlcVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzki.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzl(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i = 0;
            while (i2 < size) {
                i += zzki.zzy(zzlxVar.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzki.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzn(int i, Object obj, zzmt zzmtVar) {
        if (!(obj instanceof zzlo)) {
            return zzki.zzx(i << 3) + zzki.zzv((zzmi) obj, zzmtVar);
        }
        int i2 = zzki.zzb;
        int zza2 = ((zzlo) obj).zza();
        return zzki.zzx(i << 3) + zzki.zzx(zza2) + zza2;
    }

    public static int zzo(int i, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzki.zzx(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzlo) {
                int zza2 = ((zzlo) obj).zza();
                zzx = zzki.zzx(zza2) + zza2 + zzx;
            } else {
                zzx = zzki.zzv((zzmi) obj, zzmtVar) + zzx;
            }
        }
        return zzx;
    }

    public static int zzp(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i = 0;
            while (i2 < size) {
                int zze = zzlcVar.zze(i2);
                i += zzki.zzx((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzki.zzx((intValue >> 31) ^ (intValue + intValue));
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
        return (zzki.zzx(i << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i = 0;
            while (i2 < size) {
                long zza2 = zzlxVar.zza(i2);
                i += zzki.zzy((zza2 >> 63) ^ (zza2 + zza2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzki.zzy((longValue >> 63) ^ (longValue + longValue));
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
        boolean z = list instanceof zzlq;
        int zzx = zzki.zzx(i << 3) * size;
        if (z) {
            zzlq zzlqVar = (zzlq) list;
            while (i2 < size) {
                Object zzf = zzlqVar.zzf(i2);
                if (zzf instanceof zzka) {
                    int zzd2 = ((zzka) zzf).zzd();
                    zzx = zzki.zzx(zzd2) + zzd2 + zzx;
                } else {
                    zzx = zzki.zzw((String) zzf) + zzx;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzka) {
                    int zzd3 = ((zzka) obj).zzd();
                    zzx = zzki.zzx(zzd3) + zzd3 + zzx;
                } else {
                    zzx = zzki.zzw((String) obj) + zzx;
                }
                i2++;
            }
        }
        return zzx;
    }

    public static int zzu(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i = 0;
            while (i2 < size) {
                i += zzki.zzx(zzlcVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzki.zzx(((Integer) list.get(i2)).intValue());
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
        return (zzki.zzx(i << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i = 0;
            while (i2 < size) {
                i += zzki.zzy(zzlxVar.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzki.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zznk zzy() {
        return zzc;
    }

    public static zznk zzz() {
        return zzd;
    }
}
