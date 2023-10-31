package p060j$.util.stream;

import p060j$.util.function.C10385H;
import p060j$.util.function.InterfaceC10391K;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.P */
/* loaded from: classes2.dex */
public final class C10553P extends AbstractC10568T implements InterfaceC10624f2 {

    /* renamed from: b */
    final InterfaceC10391K f21053b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10553P(InterfaceC10391K interfaceC10391K, boolean z) {
        super(z);
        this.f21053b = interfaceC10391K;
    }

    @Override // p060j$.util.stream.AbstractC10568T, p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        this.f21053b.accept(i);
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo630h((Integer) obj);
    }

    @Override // p060j$.util.stream.InterfaceC10624f2
    /* renamed from: h */
    public final /* synthetic */ void mo630h(Integer num) {
        AbstractC10707w0.m548u0(this, num);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
