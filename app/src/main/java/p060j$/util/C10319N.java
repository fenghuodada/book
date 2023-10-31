package p060j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p060j$.util.function.C10429g;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.N */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10319N implements InterfaceC10321P {

    /* renamed from: a */
    public final /* synthetic */ Spliterator f20723a;

    private /* synthetic */ C10319N(Spliterator spliterator) {
        this.f20723a = spliterator;
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC10321P m1029e(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof C10320O ? ((C10320O) spliterator).f20724a : spliterator instanceof Spliterator.OfPrimitive ? C10316K.m1031e((Spliterator.OfPrimitive) spliterator) : new C10319N(spliterator);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return this.f20723a.tryAdvance(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ int characteristics() {
        return this.f20723a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10319N) {
            obj = ((C10319N) obj).f20723a;
        }
        return this.f20723a.equals(obj);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long estimateSize() {
        return this.f20723a.estimateSize();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20723a.forEachRemaining(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ Comparator getComparator() {
        return this.f20723a.getComparator();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20723a.getExactSizeIfKnown();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20723a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20723a.hashCode();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10321P trySplit() {
        return m1029e(this.f20723a.trySplit());
    }
}
