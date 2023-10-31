package p060j$.util;

import java.util.PrimitiveIterator;
import p060j$.util.function.C10429g;
import p060j$.util.function.C10441m;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.o */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10478o implements InterfaceC10480q, Iterator {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfDouble f20951a;

    private /* synthetic */ C10478o(PrimitiveIterator.OfDouble ofDouble) {
        this.f20951a = ofDouble;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10480q m824a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C10479p ? ((C10479p) ofDouble).f20952a : new C10478o(ofDouble);
    }

    @Override // p060j$.util.InterfaceC10480q
    /* renamed from: d */
    public final /* synthetic */ void mo822d(InterfaceC10443n interfaceC10443n) {
        this.f20951a.forEachRemaining(C10441m.m873a(interfaceC10443n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10478o) {
            obj = ((C10478o) obj).f20951a;
        }
        return this.f20951a.equals(obj);
    }

    @Override // p060j$.util.InterfaceC10480q, p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20951a.forEachRemaining(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10732z
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f20951a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f20951a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20951a.hashCode();
    }

    @Override // p060j$.util.InterfaceC10480q, java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f20951a.next();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f20951a.next();
    }

    @Override // p060j$.util.InterfaceC10480q
    public final /* synthetic */ double nextDouble() {
        return this.f20951a.nextDouble();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f20951a.remove();
    }
}
