package p060j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p060j$.util.function.C10429g;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.K */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10316K implements InterfaceC10318M {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfPrimitive f20721a;

    private /* synthetic */ C10316K(Spliterator.OfPrimitive ofPrimitive) {
        this.f20721a = ofPrimitive;
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC10318M m1031e(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof C10317L ? ((C10317L) ofPrimitive).f20722a : ofPrimitive instanceof Spliterator.OfDouble ? C10307B.m1042e((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? C10310E.m1035e((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? C10313H.m1033e((Spliterator.OfLong) ofPrimitive) : new C10316K(ofPrimitive);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return this.f20721a.tryAdvance(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ int characteristics() {
        return this.f20721a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10316K) {
            obj = ((C10316K) obj).f20721a;
        }
        return this.f20721a.equals(obj);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long estimateSize() {
        return this.f20721a.estimateSize();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20721a.forEachRemaining(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10318M
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f20721a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ Comparator getComparator() {
        return this.f20721a.getComparator();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20721a.getExactSizeIfKnown();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20721a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20721a.hashCode();
    }

    @Override // p060j$.util.InterfaceC10318M
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f20721a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10318M trySplit() {
        return m1031e(this.f20721a.trySplit());
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10321P trySplit() {
        return C10319N.m1029e(this.f20721a.trySplit());
    }
}
