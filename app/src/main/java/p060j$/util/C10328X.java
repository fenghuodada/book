package p060j$.util;

import java.util.Comparator;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.X */
/* loaded from: classes2.dex */
final class C10328X extends AbstractC10331a implements InterfaceC10309D {
    @Override // p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1009n(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10309D
    /* renamed from: d */
    public final void mo682d(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
    }

    @Override // p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1016e(this, consumer);
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

    @Override // p060j$.util.InterfaceC10309D
    /* renamed from: p */
    public final boolean mo681p(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return false;
    }

    @Override // p060j$.util.AbstractC10331a, p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* bridge */ /* synthetic */ InterfaceC10309D trySplit() {
        return null;
    }

    @Override // p060j$.util.AbstractC10331a, p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* bridge */ /* synthetic */ InterfaceC10318M trySplit() {
        return null;
    }
}
