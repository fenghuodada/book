package p060j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.O */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10320O implements Spliterator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10321P f20724a;

    private /* synthetic */ C10320O(InterfaceC10321P interfaceC10321P) {
        this.f20724a = interfaceC10321P;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator m1028a(InterfaceC10321P interfaceC10321P) {
        if (interfaceC10321P == null) {
            return null;
        }
        return interfaceC10321P instanceof C10319N ? ((C10319N) interfaceC10321P).f20723a : interfaceC10321P instanceof InterfaceC10318M ? C10317L.m1030a((InterfaceC10318M) interfaceC10321P) : new C10320O(interfaceC10321P);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f20724a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10321P interfaceC10321P = this.f20724a;
        if (obj instanceof C10320O) {
            obj = ((C10320O) obj).f20724a;
        }
        return interfaceC10321P.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f20724a.estimateSize();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20724a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f20724a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20724a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20724a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20724a.hashCode();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f20724a.mo534a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return m1028a(this.f20724a.trySplit());
    }
}
