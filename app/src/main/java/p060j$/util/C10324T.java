package p060j$.util;

import java.util.NoSuchElementException;
import p060j$.util.function.C10426e0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.T */
/* loaded from: classes2.dex */
final class C10324T implements InterfaceC10731y, InterfaceC10432h0, Iterator {

    /* renamed from: a */
    boolean f20733a = false;

    /* renamed from: b */
    long f20734b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10315J f20735c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10324T(InterfaceC10315J interfaceC10315J) {
        this.f20735c = interfaceC10315J;
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    public final void accept(long j) {
        this.f20733a = true;
        this.f20734b = j;
    }

    @Override // p060j$.util.InterfaceC10732z
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        while (hasNext()) {
            interfaceC10432h0.accept(nextLong());
        }
    }

    @Override // p060j$.util.InterfaceC10731y, p060j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof InterfaceC10432h0) {
            forEachRemaining((InterfaceC10432h0) consumer);
            return;
        }
        consumer.getClass();
        if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(C10324T.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        } else {
            forEachRemaining(new C10728v(consumer));
        }
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f20733a) {
            this.f20735c.mo650f(this);
        }
        return this.f20733a;
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Long next() {
        if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(C10324T.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // p060j$.util.InterfaceC10731y
    public final long nextLong() {
        if (this.f20733a || hasNext()) {
            this.f20733a = false;
            return this.f20734b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
