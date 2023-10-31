package p060j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p060j$.util.function.C10389J;
import p060j$.util.function.C10429g;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.E */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10310E implements InterfaceC10312G {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f20717a;

    private /* synthetic */ C10310E(Spliterator.OfInt ofInt) {
        this.f20717a = ofInt;
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC10312G m1035e(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C10311F ? ((C10311F) ofInt).f20718a : new C10310E(ofInt);
    }

    @Override // p060j$.util.InterfaceC10312G, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return this.f20717a.tryAdvance(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10312G
    /* renamed from: c */
    public final /* synthetic */ void mo662c(InterfaceC10391K interfaceC10391K) {
        this.f20717a.forEachRemaining(C10389J.m922a(interfaceC10391K));
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ int characteristics() {
        return this.f20717a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10310E) {
            obj = ((C10310E) obj).f20717a;
        }
        return this.f20717a.equals(obj);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long estimateSize() {
        return this.f20717a.estimateSize();
    }

    @Override // p060j$.util.InterfaceC10312G, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20717a.forEachRemaining(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10318M
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f20717a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ Comparator getComparator() {
        return this.f20717a.getComparator();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20717a.getExactSizeIfKnown();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20717a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20717a.hashCode();
    }

    @Override // p060j$.util.InterfaceC10312G
    /* renamed from: k */
    public final /* synthetic */ boolean mo661k(InterfaceC10391K interfaceC10391K) {
        return this.f20717a.tryAdvance(C10389J.m922a(interfaceC10391K));
    }

    @Override // p060j$.util.InterfaceC10318M
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f20717a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // p060j$.util.InterfaceC10312G, p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10312G trySplit() {
        return m1035e(this.f20717a.trySplit());
    }

    @Override // p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10318M trySplit() {
        return C10316K.m1031e(this.f20717a.trySplit());
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10321P trySplit() {
        return C10319N.m1029e(this.f20717a.trySplit());
    }
}
