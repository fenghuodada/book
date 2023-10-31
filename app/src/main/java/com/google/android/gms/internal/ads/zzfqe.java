package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzfqe extends zzfpx implements SortedMap {
    @CheckForNull
    SortedSet zzd;
    final /* synthetic */ zzfqk zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqe(zzfqk zzfqkVar, SortedMap sortedMap) {
        super(zzfqkVar, sortedMap);
        this.zze = zzfqkVar;
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfqe(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfqe(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfqe(this.zze, zzf().tailMap(obj));
    }

    public SortedMap zzf() {
        return (SortedMap) ((zzfpx) this).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    /* renamed from: zzg */
    public SortedSet zze() {
        return new zzfqf(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfpx, com.google.android.gms.internal.ads.zzfsl, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet == null) {
            SortedSet zze = zze();
            this.zzd = zze;
            return zze;
        }
        return sortedSet;
    }
}
