package p060j$.util;

import java.util.PrimitiveIterator;
import p060j$.util.function.C10429g;
import p060j$.util.function.C10430g0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.w */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10729w implements InterfaceC10731y, Iterator {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfLong f21320a;

    private /* synthetic */ C10729w(PrimitiveIterator.OfLong ofLong) {
        this.f21320a = ofLong;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10731y m513a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C10730x ? ((C10730x) ofLong).f21321a : new C10729w(ofLong);
    }

    @Override // p060j$.util.InterfaceC10731y
    /* renamed from: b */
    public final /* synthetic */ void mo511b(InterfaceC10432h0 interfaceC10432h0) {
        this.f21320a.forEachRemaining(C10430g0.m884a(interfaceC10432h0));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10729w) {
            obj = ((C10729w) obj).f21320a;
        }
        return this.f21320a.equals(obj);
    }

    @Override // p060j$.util.InterfaceC10731y, p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21320a.forEachRemaining(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10732z
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21320a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21320a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21320a.hashCode();
    }

    @Override // p060j$.util.InterfaceC10731y, java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f21320a.next();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21320a.next();
    }

    @Override // p060j$.util.InterfaceC10731y
    public final /* synthetic */ long nextLong() {
        return this.f21320a.nextLong();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21320a.remove();
    }
}
