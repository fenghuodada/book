package p060j$.util;

import java.util.Comparator;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.Y */
/* loaded from: classes2.dex */
final class C10329Y extends AbstractC10331a implements InterfaceC10312G {
    @Override // p060j$.util.InterfaceC10312G, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1008o(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10312G
    /* renamed from: c */
    public final void mo662c(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
    }

    @Override // p060j$.util.InterfaceC10312G, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1015g(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC10331a.m1013i(this);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC10331a.m1012j(this, i);
    }

    @Override // p060j$.util.InterfaceC10312G
    /* renamed from: k */
    public final boolean mo661k(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return false;
    }

    @Override // p060j$.util.AbstractC10331a, p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* bridge */ /* synthetic */ InterfaceC10312G trySplit() {
        return null;
    }

    @Override // p060j$.util.AbstractC10331a, p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* bridge */ /* synthetic */ InterfaceC10318M trySplit() {
        return null;
    }
}
