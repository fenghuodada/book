package p060j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p060j$.util.InterfaceC10321P;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.R1 */
/* loaded from: classes2.dex */
public final class C10562R1 extends AbstractC10621f {

    /* renamed from: h */
    private final AbstractC10707w0 f21064h;

    C10562R1(C10562R1 c10562r1, InterfaceC10321P interfaceC10321P) {
        super(c10562r1, interfaceC10321P);
        this.f21064h = c10562r1.f21064h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10562R1(AbstractC10707w0 abstractC10707w0, AbstractC10707w0 abstractC10707w02, InterfaceC10321P interfaceC10321P) {
        super(abstractC10707w02, interfaceC10321P);
        this.f21064h = abstractC10707w0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: a */
    public final Object mo606a() {
        AbstractC10707w0 abstractC10707w0 = this.f21164a;
        InterfaceC10555P1 mo535w1 = this.f21064h.mo535w1();
        abstractC10707w0.mo540y1(this.f21165b, mo535w1);
        return mo535w1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: d */
    public final AbstractC10621f mo605d(InterfaceC10321P interfaceC10321P) {
        return new C10562R1(this, interfaceC10321P);
    }

    @Override // p060j$.util.stream.AbstractC10621f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC10621f abstractC10621f = this.f21167d;
        if (!(abstractC10621f == null)) {
            InterfaceC10555P1 interfaceC10555P1 = (InterfaceC10555P1) ((C10562R1) abstractC10621f).mo696b();
            interfaceC10555P1.mo529l((InterfaceC10555P1) ((C10562R1) this.f21168e).mo696b());
            mo694e(interfaceC10555P1);
        }
        super.onCompletion(countedCompleter);
    }
}
