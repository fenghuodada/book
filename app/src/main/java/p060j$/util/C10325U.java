package p060j$.util;

import java.util.NoSuchElementException;
import p060j$.util.function.C10437k;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.U */
/* loaded from: classes2.dex */
final class C10325U implements InterfaceC10480q, InterfaceC10443n, Iterator {

    /* renamed from: a */
    boolean f20736a = false;

    /* renamed from: b */
    double f20737b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10309D f20738c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10325U(InterfaceC10309D interfaceC10309D) {
        this.f20738c = interfaceC10309D;
    }

    @Override // p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        this.f20736a = true;
        this.f20737b = d;
    }

    @Override // p060j$.util.InterfaceC10732z
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        while (hasNext()) {
            interfaceC10443n.accept(nextDouble());
        }
    }

    @Override // p060j$.util.InterfaceC10480q, p060j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof InterfaceC10443n) {
            forEachRemaining((InterfaceC10443n) consumer);
            return;
        }
        consumer.getClass();
        if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(C10325U.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        } else {
            forEachRemaining(new C10477n(consumer));
        }
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f20736a) {
            this.f20738c.mo681p(this);
        }
        return this.f20736a;
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Double next() {
        if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(C10325U.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // p060j$.util.InterfaceC10480q
    public final double nextDouble() {
        if (this.f20736a || hasNext()) {
            this.f20736a = false;
            return this.f20737b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
