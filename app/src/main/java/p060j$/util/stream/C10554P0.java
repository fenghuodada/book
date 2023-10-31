package p060j$.util.stream;

import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.P0 */
/* loaded from: classes2.dex */
public final class C10554P0 extends AbstractC10558Q0 implements InterfaceC10499D0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10554P0(InterfaceC10499D0 interfaceC10499D0, InterfaceC10499D0 interfaceC10499D02) {
        super(interfaceC10499D0, interfaceC10499D02);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final /* synthetic */ void mo621a(Consumer consumer) {
        AbstractC10707w0.m593G0(this, consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: e */
    public final /* synthetic */ void mo619k(Long[] lArr, int i) {
        AbstractC10707w0.m596D0(this, lArr, i);
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: s */
    public final /* synthetic */ InterfaceC10509F0 mo616s(long j, long j2, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m590J0(this, j, j2);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10318M spliterator() {
        return new C10628g1(this);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10321P spliterator() {
        return new C10628g1(this);
    }
}
