package p060j$.util;

import p060j$.util.function.C10385H;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.r */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10481r implements InterfaceC10391K {

    /* renamed from: a */
    public final /* synthetic */ Consumer f20953a;

    public /* synthetic */ C10481r(Consumer consumer) {
        this.f20953a = consumer;
    }

    @Override // p060j$.util.function.InterfaceC10391K
    public final void accept(int i) {
        this.f20953a.accept(Integer.valueOf(i));
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
