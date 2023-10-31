package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
abstract class zzfsi extends zzftm {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zza().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object zza = zzfsm.zza(zza(), key);
            if (zzfou.zza(zza, entry.getValue())) {
                return zza != null || zza().containsKey(key);
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@CheckForNull Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return zza().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftm, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return zzftn.zzd(this, collection);
        } catch (UnsupportedOperationException unused) {
            return zzftn.zze(this, collection.iterator());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                zzfqo.zza(size, "expectedSize");
                ceil = size + 1;
            } else {
                ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(ceil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return zza().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza().size();
    }

    public abstract Map zza();
}
