package p060j$.util;

import p060j$.util.function.C10426e0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.v */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10728v implements InterfaceC10432h0 {

    /* renamed from: a */
    public final /* synthetic */ Consumer f21319a;

    public /* synthetic */ C10728v(Consumer consumer) {
        this.f21319a = consumer;
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    public final void accept(long j) {
        this.f21319a.accept(Long.valueOf(j));
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }
}
