package p060j$.util;

import java.util.Comparator;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.Z */
/* loaded from: classes2.dex */
final class C10330Z extends AbstractC10331a implements InterfaceC10315J {
    @Override // p060j$.util.InterfaceC10315J, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1007q(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10315J
    /* renamed from: b */
    public final void mo651b(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
    }

    @Override // p060j$.util.InterfaceC10315J
    /* renamed from: f */
    public final boolean mo650f(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return false;
    }

    @Override // p060j$.util.InterfaceC10315J, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1014h(this, consumer);
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

    @Override // p060j$.util.AbstractC10331a, p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* bridge */ /* synthetic */ InterfaceC10315J trySplit() {
        return null;
    }

    @Override // p060j$.util.AbstractC10331a, p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public final /* bridge */ /* synthetic */ InterfaceC10318M trySplit() {
        return null;
    }
}
