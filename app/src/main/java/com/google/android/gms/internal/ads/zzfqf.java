package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzfqf extends zzfqa implements SortedSet {
    final /* synthetic */ zzfqk zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqf(zzfqk zzfqkVar, SortedMap sortedMap) {
        super(zzfqkVar, sortedMap);
        this.zzc = zzfqkVar;
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return zza().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzfqf(this.zzc, zza().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzfqf(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzfqf(this.zzc, zza().tailMap(obj));
    }

    public SortedMap zza() {
        return (SortedMap) this.zzd;
    }
}
