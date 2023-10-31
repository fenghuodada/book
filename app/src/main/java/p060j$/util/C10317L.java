package p060j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.L */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10317L implements Spliterator.OfPrimitive {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10318M f20722a;

    private /* synthetic */ C10317L(InterfaceC10318M interfaceC10318M) {
        this.f20722a = interfaceC10318M;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfPrimitive m1030a(InterfaceC10318M interfaceC10318M) {
        if (interfaceC10318M == null) {
            return null;
        }
        return interfaceC10318M instanceof C10316K ? ((C10316K) interfaceC10318M).f20721a : interfaceC10318M instanceof InterfaceC10309D ? C10308C.m1041a((InterfaceC10309D) interfaceC10318M) : interfaceC10318M instanceof InterfaceC10312G ? C10311F.m1034a((InterfaceC10312G) interfaceC10318M) : interfaceC10318M instanceof InterfaceC10315J ? C10314I.m1032a((InterfaceC10315J) interfaceC10318M) : new C10317L(interfaceC10318M);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f20722a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10318M interfaceC10318M = this.f20722a;
        if (obj instanceof C10317L) {
            obj = ((C10317L) obj).f20722a;
        }
        return interfaceC10318M.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f20722a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f20722a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20722a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f20722a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20722a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20722a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20722a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f20722a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f20722a.mo534a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return m1030a(this.f20722a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C10320O.m1028a(this.f20722a.trySplit());
    }
}
