package p060j$.util.stream;

import p060j$.util.function.C10426e0;
import p060j$.util.function.InterfaceC10432h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.Q */
/* loaded from: classes2.dex */
public final class C10557Q extends AbstractC10568T implements InterfaceC10629g2 {

    /* renamed from: b */
    final InterfaceC10432h0 f21060b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10557Q(InterfaceC10432h0 interfaceC10432h0, boolean z) {
        super(z);
        this.f21060b = interfaceC10432h0;
    }

    @Override // p060j$.util.stream.AbstractC10568T, p060j$.util.stream.InterfaceC10634h2
    public final void accept(long j) {
        this.f21060b.accept(j);
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo537m((Long) obj);
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // p060j$.util.stream.InterfaceC10629g2
    /* renamed from: m */
    public final /* synthetic */ void mo537m(Long l) {
        AbstractC10707w0.m544w0(this, l);
    }
}
