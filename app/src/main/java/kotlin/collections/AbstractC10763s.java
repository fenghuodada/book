package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: kotlin.collections.s */
/* loaded from: classes3.dex */
public abstract class AbstractC10763s implements Iterator<Long>, InterfaceC10847a, p060j$.util.Iterator {
    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Long> consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
