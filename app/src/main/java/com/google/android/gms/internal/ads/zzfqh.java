package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
class zzfqh extends AbstractCollection {
    final Object zza;
    Collection zzb;
    @CheckForNull
    final zzfqh zzc;
    @CheckForNull
    final Collection zzd;
    final /* synthetic */ zzfqk zze;

    public zzfqh(zzfqk zzfqkVar, Object obj, @CheckForNull Collection collection, zzfqh zzfqhVar) {
        this.zze = zzfqkVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfqhVar;
        this.zzd = zzfqhVar == null ? null : zzfqhVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfqk zzfqkVar = this.zze;
            zzfqk.zzn(zzfqkVar, zzfqk.zzd(zzfqkVar) + 1);
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfqk zzfqkVar = this.zze;
            zzfqk.zzn(zzfqkVar, (size2 - size) + zzfqk.zzd(zzfqkVar));
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfqk zzfqkVar = this.zze;
        zzfqk.zzn(zzfqkVar, zzfqk.zzd(zzfqkVar) - size);
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfqg(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfqk zzfqkVar = this.zze;
            zzfqk.zzn(zzfqkVar, zzfqk.zzd(zzfqkVar) - 1);
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzfqk zzfqkVar = this.zze;
            zzfqk.zzn(zzfqkVar, (size2 - size) + zzfqk.zzd(zzfqkVar));
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzfqk zzfqkVar = this.zze;
            zzfqk.zzn(zzfqkVar, (size2 - size) + zzfqk.zzd(zzfqkVar));
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        zzfqh zzfqhVar = this.zzc;
        if (zzfqhVar != null) {
            zzfqhVar.zza();
        } else {
            zzfqk.zzi(this.zze).put(this.zza, this.zzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        zzfqh zzfqhVar = this.zzc;
        if (zzfqhVar != null) {
            zzfqhVar.zzb();
            if (this.zzc.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else if (!this.zzb.isEmpty() || (collection = (Collection) zzfqk.zzi(this.zze).get(this.zza)) == null) {
        } else {
            this.zzb = collection;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        zzfqh zzfqhVar = this.zzc;
        if (zzfqhVar != null) {
            zzfqhVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzfqk.zzi(this.zze).remove(this.zza);
        }
    }
}
