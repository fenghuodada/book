package p060j$.util.stream;

/* renamed from: j$.util.stream.o2 */
/* loaded from: classes2.dex */
final class C10669o2 extends AbstractC10599a2 {

    /* renamed from: b */
    long f21222b;

    /* renamed from: c */
    long f21223c;

    /* renamed from: d */
    final /* synthetic */ C10674p2 f21224d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10669o2(C10674p2 c10674p2, InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
        this.f21224d = c10674p2;
        this.f21222b = c10674p2.f21230s;
        long j = c10674p2.f21231t;
        this.f21223c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        long j = this.f21222b;
        if (j != 0) {
            this.f21222b = j - 1;
            return;
        }
        long j2 = this.f21223c;
        if (j2 > 0) {
            this.f21223c = j2 - 1;
            this.f21132a.accept(d);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        this.f21132a.mo531g(AbstractC10707w0.m586N0(j, this.f21224d.f21230s, this.f21223c));
    }

    @Override // p060j$.util.stream.AbstractC10599a2, p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final boolean mo530i() {
        return this.f21223c == 0 || this.f21132a.mo530i();
    }
}
