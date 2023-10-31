package p060j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p060j$.util.function.C10428f0;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.x */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10730x implements PrimitiveIterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10731y f21321a;

    private /* synthetic */ C10730x(InterfaceC10731y interfaceC10731y) {
        this.f21321a = interfaceC10731y;
    }

    /* renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfLong m512a(InterfaceC10731y interfaceC10731y) {
        if (interfaceC10731y == null) {
            return null;
        }
        return interfaceC10731y instanceof C10729w ? ((C10729w) interfaceC10731y).f21320a : new C10730x(interfaceC10731y);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10731y interfaceC10731y = this.f21321a;
        if (obj instanceof C10730x) {
            obj = ((C10730x) obj).f21321a;
        }
        return interfaceC10731y.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f21321a.forEachRemaining(longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21321a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f21321a.mo511b(C10428f0.m886a(longConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21321a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21321a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f21321a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21321a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f21321a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21321a.remove();
    }
}
