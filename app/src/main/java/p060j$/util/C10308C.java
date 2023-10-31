package p060j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p060j$.util.function.C10439l;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.C */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10308C implements Spliterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10309D f20710a;

    private /* synthetic */ C10308C(InterfaceC10309D interfaceC10309D) {
        this.f20710a = interfaceC10309D;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfDouble m1041a(InterfaceC10309D interfaceC10309D) {
        if (interfaceC10309D == null) {
            return null;
        }
        return interfaceC10309D instanceof C10307B ? ((C10307B) interfaceC10309D).f20709a : new C10308C(interfaceC10309D);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f20710a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10309D interfaceC10309D = this.f20710a;
        if (obj instanceof C10308C) {
            obj = ((C10308C) obj).f20710a;
        }
        return interfaceC10309D.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f20710a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f20710a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20710a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f20710a.mo682d(C10439l.m879a(doubleConsumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f20710a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20710a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20710a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20710a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f20710a.tryAdvance(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f20710a.mo534a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f20710a.mo681p(C10439l.m879a(doubleConsumer));
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfDouble trySplit() {
        return m1041a(this.f20710a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C10317L.m1030a(this.f20710a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C10320O.m1028a(this.f20710a.trySplit());
    }
}
