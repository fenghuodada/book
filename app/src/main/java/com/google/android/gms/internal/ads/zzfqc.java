package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfqc extends zzfqf implements NavigableSet {
    final /* synthetic */ zzfqk zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqc(zzfqk zzfqkVar, NavigableMap navigableMap) {
        super(zzfqkVar, navigableMap);
        this.zzb = zzfqkVar;
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new zzfqc(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).descendingMap());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new zzfqc(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).headMap(obj, z));
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object pollFirst() {
        return zzfsb.zza(iterator());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object pollLast() {
        return zzfsb.zza(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzfqc(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).subMap(obj, z, obj2, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new zzfqc(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).tailMap(obj, z));
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final /* synthetic */ SortedMap zza() {
        return (NavigableMap) ((SortedMap) this.zzd);
    }
}
