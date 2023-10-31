package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

@GwtCompatible
/* renamed from: com.google.common.collect.x0 */
/* loaded from: classes3.dex */
public abstract class AbstractC8032x0<E> implements Iterator<E>, p060j$.util.Iterator {
    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
