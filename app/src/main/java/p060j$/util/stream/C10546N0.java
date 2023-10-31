package p060j$.util.stream;

import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.N0 */
/* loaded from: classes2.dex */
public final class C10546N0 extends AbstractC10558Q0 implements InterfaceC10489B0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10546N0(InterfaceC10489B0 interfaceC10489B0, InterfaceC10489B0 interfaceC10489B02) {
        super(interfaceC10489B0, interfaceC10489B02);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final /* synthetic */ void mo621a(Consumer consumer) {
        AbstractC10707w0.m595E0(this, consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: e */
    public final /* synthetic */ void mo619k(Double[] dArr, int i) {
        AbstractC10707w0.m598B0(this, dArr, i);
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: s */
    public final /* synthetic */ InterfaceC10509F0 mo616s(long j, long j2, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m592H0(this, j, j2);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10318M spliterator() {
        return new C10618e1(this);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10321P spliterator() {
        return new C10618e1(this);
    }
}
