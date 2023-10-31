package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class zzftn {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfpa zzfpaVar) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof zzftk) {
                zzftk zzftkVar = (zzftk) set;
                return new zzftk(zzftkVar.zza, zzfpd.zza(zzftkVar.zzb, zzfpaVar));
            }
            set.getClass();
            zzfpaVar.getClass();
            return new zzftk(set, zzfpaVar);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof zzftk) {
            zzftk zzftkVar2 = (zzftk) sortedSet;
            return new zzftl((SortedSet) zzftkVar2.zza, zzfpd.zza(zzftkVar2.zzb, zzfpaVar));
        }
        sortedSet.getClass();
        zzfpaVar.getClass();
        return new zzftl(sortedSet, zzfpaVar);
    }

    public static boolean zzc(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zzd(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfsx) {
            collection = ((zzfsx) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean zze(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
