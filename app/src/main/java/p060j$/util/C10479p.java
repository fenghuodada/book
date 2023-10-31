package p060j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p060j$.util.function.C10439l;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10479p implements PrimitiveIterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10480q f20952a;

    private /* synthetic */ C10479p(InterfaceC10480q interfaceC10480q) {
        this.f20952a = interfaceC10480q;
    }

    /* renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfDouble m823a(InterfaceC10480q interfaceC10480q) {
        if (interfaceC10480q == null) {
            return null;
        }
        return interfaceC10480q instanceof C10478o ? ((C10478o) interfaceC10480q).f20951a : new C10479p(interfaceC10480q);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10480q interfaceC10480q = this.f20952a;
        if (obj instanceof C10479p) {
            obj = ((C10479p) obj).f20952a;
        }
        return interfaceC10480q.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f20952a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20952a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f20952a.mo822d(C10439l.m879a(doubleConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f20952a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20952a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f20952a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f20952a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f20952a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f20952a.remove();
    }
}
