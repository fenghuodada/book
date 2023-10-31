package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.C0510h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

@KeepForSdk
/* loaded from: classes.dex */
public class DataBufferIterator<T> implements Iterator<T>, p060j$.util.Iterator {
    @NonNull
    protected final DataBuffer<T> zaa;
    protected int zab = -1;

    public DataBufferIterator(@NonNull DataBuffer<T> dataBuffer) {
        this.zaa = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
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
        return this.zab < this.zaa.getCount() + (-1);
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    @NonNull
    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.zaa;
            int i = this.zab + 1;
            this.zab = i;
            return dataBuffer.get(i);
        }
        throw new NoSuchElementException(C0510h.m12340a(46, "Cannot advance the iterator beyond ", this.zab));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
