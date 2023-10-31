package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class zzgvf extends AbstractList {
    private static final zzgvg zzc = zzgvg.zzb(zzgvf.class);
    final List zza;
    final Iterator zzb;

    public zzgvf(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (this.zza.size() > i) {
            return this.zza.get(i);
        }
        if (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzgve(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzgvg zzgvgVar = zzc;
        zzgvgVar.zza("potentially expensive size() call");
        zzgvgVar.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}
