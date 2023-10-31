package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes.dex */
public final class zzgrv extends AbstractList implements RandomAccess, zzgpo {
    private final zzgpo zza;

    public zzgrv(zzgpo zzgpoVar) {
        this.zza = zzgpoVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzgpn) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzgru(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzgrt(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final zzgpo zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final void zzi(zzgno zzgnoVar) {
        throw new UnsupportedOperationException();
    }
}
