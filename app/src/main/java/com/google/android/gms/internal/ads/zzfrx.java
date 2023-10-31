package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzfrx {
    public static boolean zza(Iterable iterable, zzfpa zzfpaVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfpaVar.getClass();
            return zzc((List) iterable, zzfpaVar);
        }
        Iterator it = iterable.iterator();
        zzfpaVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzfpaVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzb(List list, zzfpa zzfpaVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfpaVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            list.remove(i2);
        }
    }

    private static boolean zzc(List list, zzfpa zzfpaVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfpaVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzb(list, zzfpaVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzb(list, zzfpaVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
