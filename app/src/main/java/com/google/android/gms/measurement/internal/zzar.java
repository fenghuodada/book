package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class zzar implements Iterator, p060j$.util.Iterator {
    final Iterator zza;
    final /* synthetic */ zzas zzb;

    public zzar(zzas zzasVar) {
        Bundle bundle;
        this.zzb = zzasVar;
        bundle = zzasVar.zza;
        this.zza = bundle.keySet().iterator();
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
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    /* renamed from: zza */
    public final String next() {
        return (String) this.zza.next();
    }
}
