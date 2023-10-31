package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes.dex */
class zzfqg implements Iterator, p060j$.util.Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfqh zzc;

    public zzfqg(zzfqh zzfqhVar) {
        this.zzc = zzfqhVar;
        Collection collection = zzfqhVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public zzfqg(zzfqh zzfqhVar, Iterator it) {
        this.zzc = zzfqhVar;
        this.zzb = zzfqhVar.zzb;
        this.zza = it;
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
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        int i;
        this.zza.remove();
        zzfqk zzfqkVar = this.zzc.zze;
        i = zzfqkVar.zzb;
        zzfqkVar.zzb = i - 1;
        this.zzc.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
