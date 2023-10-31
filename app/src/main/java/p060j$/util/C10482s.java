package p060j$.util;

import java.util.PrimitiveIterator;
import p060j$.util.function.C10389J;
import p060j$.util.function.C10429g;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.s */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10482s implements InterfaceC10727u, Iterator {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfInt f20954a;

    private /* synthetic */ C10482s(PrimitiveIterator.OfInt ofInt) {
        this.f20954a = ofInt;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10727u m821a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C10726t ? ((C10726t) ofInt).f21318a : new C10482s(ofInt);
    }

    @Override // p060j$.util.InterfaceC10727u
    /* renamed from: c */
    public final /* synthetic */ void mo515c(InterfaceC10391K interfaceC10391K) {
        this.f20954a.forEachRemaining(C10389J.m922a(interfaceC10391K));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10482s) {
            obj = ((C10482s) obj).f20954a;
        }
        return this.f20954a.equals(obj);
    }

    @Override // p060j$.util.InterfaceC10727u, p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20954a.forEachRemaining(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10732z
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f20954a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f20954a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20954a.hashCode();
    }

    @Override // p060j$.util.InterfaceC10727u, java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f20954a.next();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f20954a.next();
    }

    @Override // p060j$.util.InterfaceC10727u
    public final /* synthetic */ int nextInt() {
        return this.f20954a.nextInt();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f20954a.remove();
    }
}
