package p060j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p060j$.util.function.C10428f0;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.I */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10314I implements Spliterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10315J f20720a;

    private /* synthetic */ C10314I(InterfaceC10315J interfaceC10315J) {
        this.f20720a = interfaceC10315J;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfLong m1032a(InterfaceC10315J interfaceC10315J) {
        if (interfaceC10315J == null) {
            return null;
        }
        return interfaceC10315J instanceof C10313H ? ((C10313H) interfaceC10315J).f20719a : new C10314I(interfaceC10315J);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f20720a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10315J interfaceC10315J = this.f20720a;
        if (obj instanceof C10314I) {
            obj = ((C10314I) obj).f20720a;
        }
        return interfaceC10315J.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f20720a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f20720a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20720a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f20720a.mo651b(C10428f0.m886a(longConsumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f20720a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20720a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20720a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20720a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f20720a.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f20720a.mo534a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return this.f20720a.mo650f(C10428f0.m886a(longConsumer));
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfLong trySplit() {
        return m1032a(this.f20720a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C10317L.m1030a(this.f20720a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C10320O.m1028a(this.f20720a.trySplit());
    }
}
