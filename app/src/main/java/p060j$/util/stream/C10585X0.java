package p060j$.util.stream;

import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;

/* renamed from: j$.util.stream.X0 */
/* loaded from: classes2.dex */
final class C10585X0 extends AbstractC10593Z0 implements InterfaceC10499D0 {
    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final /* synthetic */ void mo621a(Consumer consumer) {
        AbstractC10707w0.m593G0(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10593Z0, p060j$.util.stream.InterfaceC10509F0
    /* renamed from: b */
    public final InterfaceC10504E0 mo620b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p060j$.util.stream.AbstractC10593Z0, p060j$.util.stream.InterfaceC10509F0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC10509F0 mo620b(int i) {
        mo620b(i);
        throw null;
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: c */
    public final Object mo655c() {
        long[] jArr;
        jArr = AbstractC10707w0.f21293f;
        return jArr;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: e */
    public final /* synthetic */ void mo619k(Long[] lArr, int i) {
        AbstractC10707w0.m596D0(this, lArr, i);
    }

    @Override // p060j$.util.stream.AbstractC10593Z0, p060j$.util.stream.InterfaceC10509F0
    /* renamed from: s */
    public final /* synthetic */ InterfaceC10509F0 mo616s(long j, long j2, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m590J0(this, j, j2);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10318M spliterator() {
        return AbstractC10368e0.m946d();
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10321P spliterator() {
        return AbstractC10368e0.m946d();
    }
}
