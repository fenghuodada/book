package p060j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p060j$.util.function.C10429g;
import p060j$.util.function.C10430g0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.H */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10313H implements InterfaceC10315J {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f20719a;

    private /* synthetic */ C10313H(Spliterator.OfLong ofLong) {
        this.f20719a = ofLong;
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC10315J m1033e(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C10314I ? ((C10314I) ofLong).f20720a : new C10313H(ofLong);
    }

    @Override // p060j$.util.InterfaceC10315J, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return this.f20719a.tryAdvance(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10315J
    /* renamed from: b */
    public final /* synthetic */ void mo651b(InterfaceC10432h0 interfaceC10432h0) {
        this.f20719a.forEachRemaining(C10430g0.m884a(interfaceC10432h0));
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ int characteristics() {
        return this.f20719a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10313H) {
            obj = ((C10313H) obj).f20719a;
        }
        return this.f20719a.equals(obj);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long estimateSize() {
        return this.f20719a.estimateSize();
    }

    @Override // p060j$.util.InterfaceC10315J
    /* renamed from: f */
    public final /* synthetic */ boolean mo650f(InterfaceC10432h0 interfaceC10432h0) {
        return this.f20719a.tryAdvance(C10430g0.m884a(interfaceC10432h0));
    }

    @Override // p060j$.util.InterfaceC10315J, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20719a.forEachRemaining(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10318M
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f20719a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ Comparator getComparator() {
        return this.f20719a.getComparator();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20719a.getExactSizeIfKnown();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20719a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20719a.hashCode();
    }

    @Override // p060j$.util.InterfaceC10318M
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f20719a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // p060j$.util.InterfaceC10315J, p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10315J trySplit() {
        return m1033e(this.f20719a.trySplit());
    }

    @Override // p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10318M trySplit() {
        return C10316K.m1031e(this.f20719a.trySplit());
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10321P trySplit() {
        return C10319N.m1029e(this.f20719a.trySplit());
    }
}
