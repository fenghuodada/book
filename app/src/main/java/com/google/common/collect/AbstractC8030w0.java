package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.Map;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

@GwtCompatible
/* renamed from: com.google.common.collect.w0 */
/* loaded from: classes3.dex */
public abstract class AbstractC8030w0<F, T> implements Iterator<T>, p060j$.util.Iterator {

    /* renamed from: a */
    public final Iterator<? extends F> f15838a;

    public AbstractC8030w0(Iterator<? extends F> it) {
        it.getClass();
        this.f15838a = it;
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
        return this.f15838a.hasNext();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f15838a.next()).getValue();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        this.f15838a.remove();
    }
}
