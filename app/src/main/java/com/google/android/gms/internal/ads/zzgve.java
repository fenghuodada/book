package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes.dex */
final class zzgve implements Iterator, p060j$.util.Iterator {
    int zza = 0;
    final /* synthetic */ zzgvf zzb;

    public zzgve(zzgvf zzgvfVar) {
        this.zzb = zzgvfVar;
    }

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzgvf zzgvfVar = this.zzb;
            zzgvfVar.zza.add(zzgvfVar.zzb.next());
            return next();
        }
        List list = this.zzb.zza;
        int i = this.zza;
        this.zza = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
