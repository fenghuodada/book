package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class zzfrr extends zzfrm implements List, RandomAccess {
    private static final zzfts zza = new zzfrp(zzftb.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzfrr zzi(Object[] objArr, int i) {
        return i == 0 ? zzftb.zza : new zzftb(objArr, i);
    }

    public static zzfrr zzj(Collection collection) {
        if (!(collection instanceof zzfrm)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzfsz.zzb(array, length);
            return zzi(array, length);
        }
        zzfrr zzd2 = ((zzfrm) collection).zzd();
        if (zzd2.zzf()) {
            Object[] array2 = zzd2.toArray();
            return zzi(array2, array2.length);
        }
        return zzd2;
    }

    public static zzfrr zzk(Object[] objArr) {
        if (objArr.length == 0) {
            return zzftb.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfsz.zzb(objArr2, length);
        return zzi(objArr2, length);
    }

    public static zzfrr zzl() {
        return zzftb.zza;
    }

    public static zzfrr zzm(Object obj) {
        Object[] objArr = {obj};
        zzfsz.zzb(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzfrr zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfsz.zzb(objArr, 2);
        return zzi(objArr, 2);
    }

    public static zzfrr zzo(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfsz.zzb(objArr, 3);
        return zzi(objArr, 3);
    }

    public static zzfrr zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfsz.zzb(objArr, 5);
        return zzi(objArr, 5);
    }

    public static zzfrr zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfsz.zzb(objArr, 6);
        return zzi(objArr, 6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzfou.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzfou.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    @Deprecated
    public final zzfrr zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final zzftr zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzfrr subList(int i, int i2) {
        zzfoz.zzg(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzftb.zza : new zzfrq(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzr */
    public final zzfts listIterator(int i) {
        zzfoz.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzfrp(this, i);
    }
}
