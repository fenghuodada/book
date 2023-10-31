package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
final class zzfse extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfon zzb;

    public zzfse(List list, zzfon zzfonVar) {
        this.zza = list;
        this.zzb = zzfonVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzfsd(this, this.zza.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
