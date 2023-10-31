package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfqb extends zzfqe implements NavigableMap {
    final /* synthetic */ zzfqk zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqb(zzfqk zzfqkVar, NavigableMap navigableMap) {
        super(zzfqkVar, navigableMap);
        this.zzc = zzfqkVar;
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return zza(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzfqb(this.zzc, ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return zza(firstEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return zza(floorEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new zzfqb(this.zzc, ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).headMap(obj, z));
    }

    @Override // com.google.android.gms.internal.ads.zzfqe, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return zza(higherEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqe, com.google.android.gms.internal.ads.zzfpx, com.google.android.gms.internal.ads.zzfsl, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return zza(lastEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return zza(lowerEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzfqb(this.zzc, ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).subMap(obj, z, obj2, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfqe, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new zzfqb(this.zzc, ((NavigableMap) ((SortedMap) ((zzfpx) this).zza)).tailMap(obj, z));
    }

    @Override // com.google.android.gms.internal.ads.zzfqe, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @CheckForNull
    public final Map.Entry zzc(Iterator it) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Collection zza = this.zzc.zza();
            zza.addAll((Collection) entry.getValue());
            it.remove();
            return new zzfrn(entry.getKey(), this.zzc.zzb(zza));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqe
    /* renamed from: zzd */
    public final NavigableSet zzg() {
        return new zzfqc(this.zzc, (NavigableMap) ((SortedMap) ((zzfpx) this).zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfqe
    public final /* synthetic */ SortedMap zzf() {
        return (NavigableMap) ((SortedMap) ((zzfpx) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqe
    public final /* synthetic */ SortedSet zzh() {
        return (NavigableSet) super.keySet();
    }
}
