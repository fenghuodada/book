package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class zzno implements Iterator, p060j$.util.Iterator {
    final Iterator zza;
    final /* synthetic */ zznp zzb;

    public zzno(zznp zznpVar) {
        zzlq zzlqVar;
        this.zzb = zznpVar;
        zzlqVar = zznpVar.zza;
        this.zza = zzlqVar.iterator();
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
