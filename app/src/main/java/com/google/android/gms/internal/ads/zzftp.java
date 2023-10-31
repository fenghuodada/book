package com.google.android.gms.internal.ads;

import java.util.Iterator;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes.dex */
abstract class zzftp implements Iterator, p060j$.util.Iterator {
    final Iterator zzb;

    public zzftp(Iterator it) {
        it.getClass();
        this.zzb = it;
    }

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    public abstract Object zza(Object obj);
}
