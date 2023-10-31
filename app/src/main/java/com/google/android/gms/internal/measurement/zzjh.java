package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class zzjh implements Iterator, p060j$.util.Iterator {
    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
