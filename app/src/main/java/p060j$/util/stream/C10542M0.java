package p060j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10427f;
import p060j$.util.function.InterfaceC10438k0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.M0 */
/* loaded from: classes2.dex */
public class C10542M0 extends AbstractC10621f {

    /* renamed from: h */
    protected final AbstractC10707w0 f21039h;

    /* renamed from: i */
    protected final InterfaceC10438k0 f21040i;

    /* renamed from: j */
    protected final InterfaceC10427f f21041j;

    C10542M0(C10542M0 c10542m0, InterfaceC10321P interfaceC10321P) {
        super(c10542m0, interfaceC10321P);
        this.f21039h = c10542m0.f21039h;
        this.f21040i = c10542m0.f21040i;
        this.f21041j = c10542m0.f21041j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10542M0(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, InterfaceC10438k0 interfaceC10438k0, C10534K0 c10534k0) {
        super(abstractC10707w0, interfaceC10321P);
        this.f21039h = abstractC10707w0;
        this.f21040i = interfaceC10438k0;
        this.f21041j = c10534k0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: a */
    public final Object mo606a() {
        InterfaceC10484A0 interfaceC10484A0 = (InterfaceC10484A0) this.f21040i.apply(this.f21039h.mo570c1(this.f21165b));
        this.f21039h.mo540y1(this.f21165b, interfaceC10484A0);
        return interfaceC10484A0.build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: d */
    public final AbstractC10621f mo605d(InterfaceC10321P interfaceC10321P) {
        return new C10542M0(this, interfaceC10321P);
    }

    @Override // p060j$.util.stream.AbstractC10621f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC10621f abstractC10621f = this.f21167d;
        if (!(abstractC10621f == null)) {
            mo694e((InterfaceC10509F0) this.f21041j.apply((InterfaceC10509F0) ((C10542M0) abstractC10621f).mo696b(), (InterfaceC10509F0) ((C10542M0) this.f21168e).mo696b()));
        }
        super.onCompletion(countedCompleter);
    }
}
