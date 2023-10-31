package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class zzmx implements Iterator, p060j$.util.Iterator {
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
        return false;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
