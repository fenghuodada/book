package p060j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p060j$.util.function.C10387I;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.F */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10311F implements Spliterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10312G f20718a;

    private /* synthetic */ C10311F(InterfaceC10312G interfaceC10312G) {
        this.f20718a = interfaceC10312G;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfInt m1034a(InterfaceC10312G interfaceC10312G) {
        if (interfaceC10312G == null) {
            return null;
        }
        return interfaceC10312G instanceof C10310E ? ((C10310E) interfaceC10312G).f20717a : new C10311F(interfaceC10312G);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f20718a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10312G interfaceC10312G = this.f20718a;
        if (obj instanceof C10311F) {
            obj = ((C10311F) obj).f20718a;
        }
        return interfaceC10312G.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f20718a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f20718a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20718a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f20718a.mo662c(C10387I.m923a(intConsumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f20718a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20718a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20718a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20718a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f20718a.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f20718a.mo534a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return this.f20718a.mo661k(C10387I.m923a(intConsumer));
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return m1034a(this.f20718a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C10317L.m1030a(this.f20718a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C10320O.m1028a(this.f20718a.trySplit());
    }
}
