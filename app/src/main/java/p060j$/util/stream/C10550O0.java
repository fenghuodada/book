package p060j$.util.stream;

import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.O0 */
/* loaded from: classes2.dex */
public final class C10550O0 extends AbstractC10558Q0 implements InterfaceC10494C0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10550O0(InterfaceC10494C0 interfaceC10494C0, InterfaceC10494C0 interfaceC10494C02) {
        super(interfaceC10494C0, interfaceC10494C02);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final /* synthetic */ void mo621a(Consumer consumer) {
        AbstractC10707w0.m594F0(this, consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: e */
    public final /* synthetic */ void mo619k(Integer[] numArr, int i) {
        AbstractC10707w0.m597C0(this, numArr, i);
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: s */
    public final /* synthetic */ InterfaceC10509F0 mo616s(long j, long j2, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m591I0(this, j, j2);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10318M spliterator() {
        return new C10623f1(this);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10321P spliterator() {
        return new C10623f1(this);
    }
}
