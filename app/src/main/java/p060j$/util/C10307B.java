package p060j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p060j$.util.function.C10429g;
import p060j$.util.function.C10441m;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.B */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10307B implements InterfaceC10309D {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f20709a;

    private /* synthetic */ C10307B(Spliterator.OfDouble ofDouble) {
        this.f20709a = ofDouble;
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC10309D m1042e(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C10308C ? ((C10308C) ofDouble).f20710a : new C10307B(ofDouble);
    }

    @Override // p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return this.f20709a.tryAdvance(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ int characteristics() {
        return this.f20709a.characteristics();
    }

    @Override // p060j$.util.InterfaceC10309D
    /* renamed from: d */
    public final /* synthetic */ void mo682d(InterfaceC10443n interfaceC10443n) {
        this.f20709a.forEachRemaining(C10441m.m873a(interfaceC10443n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10307B) {
            obj = ((C10307B) obj).f20709a;
        }
        return this.f20709a.equals(obj);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long estimateSize() {
        return this.f20709a.estimateSize();
    }

    @Override // p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20709a.forEachRemaining(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.InterfaceC10318M
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f20709a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ Comparator getComparator() {
        return this.f20709a.getComparator();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20709a.getExactSizeIfKnown();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20709a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20709a.hashCode();
    }

    @Override // p060j$.util.InterfaceC10309D
    /* renamed from: p */
    public final /* synthetic */ boolean mo681p(InterfaceC10443n interfaceC10443n) {
        return this.f20709a.tryAdvance(C10441m.m873a(interfaceC10443n));
    }

    @Override // p060j$.util.InterfaceC10318M
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f20709a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10309D trySplit() {
        return m1042e(this.f20709a.trySplit());
    }

    @Override // p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10318M trySplit() {
        return C10316K.m1031e(this.f20709a.trySplit());
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ InterfaceC10321P trySplit() {
        return C10319N.m1029e(this.f20709a.trySplit());
    }
}
