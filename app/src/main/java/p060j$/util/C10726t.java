package p060j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p060j$.util.function.C10387I;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.t */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10726t implements PrimitiveIterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10727u f21318a;

    private /* synthetic */ C10726t(InterfaceC10727u interfaceC10727u) {
        this.f21318a = interfaceC10727u;
    }

    /* renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfInt m516a(InterfaceC10727u interfaceC10727u) {
        if (interfaceC10727u == null) {
            return null;
        }
        return interfaceC10727u instanceof C10482s ? ((C10482s) interfaceC10727u).f20954a : new C10726t(interfaceC10727u);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10727u interfaceC10727u = this.f21318a;
        if (obj instanceof C10726t) {
            obj = ((C10726t) obj).f21318a;
        }
        return interfaceC10727u.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f21318a.forEachRemaining(intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21318a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f21318a.mo515c(C10387I.m923a(intConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21318a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21318a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f21318a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21318a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f21318a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21318a.remove();
    }
}
