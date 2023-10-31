package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import org.jetbrains.annotations.NotNull;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes3.dex */
public final class C10832a<T> implements Iterator<T>, InterfaceC10847a, p060j$.util.Iterator {
    @NotNull

    /* renamed from: a */
    public final T[] f21399a;

    /* renamed from: b */
    public int f21400b;

    public C10832a(@NotNull T[] array) {
        C10843j.m430f(array, "array");
        this.f21399a = array;
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
        return this.f21400b < this.f21399a.length;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f21399a;
            int i = this.f21400b;
            this.f21400b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f21400b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
