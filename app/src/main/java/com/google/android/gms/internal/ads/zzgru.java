package com.google.android.gms.internal.ads;

import java.util.Iterator;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes.dex */
final class zzgru implements Iterator, p060j$.util.Iterator {
    final Iterator zza;
    final /* synthetic */ zzgrv zzb;

    public zzgru(zzgrv zzgrvVar) {
        zzgpo zzgpoVar;
        this.zzb = zzgrvVar;
        zzgpoVar = zzgrvVar.zza;
        this.zza = zzgpoVar.iterator();
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
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
