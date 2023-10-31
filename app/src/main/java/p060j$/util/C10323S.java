package p060j$.util;

import java.util.NoSuchElementException;
import p060j$.util.function.C10385H;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.S */
/* loaded from: classes2.dex */
final class C10323S implements InterfaceC10727u, InterfaceC10391K, Iterator {

    /* renamed from: a */
    boolean f20730a = false;

    /* renamed from: b */
    int f20731b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10312G f20732c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10323S(InterfaceC10312G interfaceC10312G) {
        this.f20732c = interfaceC10312G;
    }

    @Override // p060j$.util.function.InterfaceC10391K
    public final void accept(int i) {
        this.f20730a = true;
        this.f20731b = i;
    }

    @Override // p060j$.util.InterfaceC10732z
    /* renamed from: c */
    public final void forEachRemaining(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        while (hasNext()) {
            interfaceC10391K.accept(nextInt());
        }
    }

    @Override // p060j$.util.InterfaceC10727u, p060j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof InterfaceC10391K) {
            forEachRemaining((InterfaceC10391K) consumer);
            return;
        }
        consumer.getClass();
        if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(C10323S.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        } else {
            forEachRemaining(new C10481r(consumer));
        }
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f20730a) {
            this.f20732c.mo661k(this);
        }
        return this.f20730a;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Integer next() {
        if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(C10323S.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // p060j$.util.InterfaceC10727u
    public final int nextInt() {
        if (this.f20730a || hasNext()) {
            this.f20730a = false;
            return this.f20731b;
        }
        throw new NoSuchElementException();
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
