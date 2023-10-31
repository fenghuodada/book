package p060j$.util.stream;

/* renamed from: j$.util.stream.m2 */
/* loaded from: classes2.dex */
final class C10659m2 extends AbstractC10609c2 {

    /* renamed from: b */
    long f21208b;

    /* renamed from: c */
    long f21209c;

    /* renamed from: d */
    final /* synthetic */ C10664n2 f21210d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10659m2(C10664n2 c10664n2, InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
        this.f21210d = c10664n2;
        this.f21208b = c10664n2.f21213s;
        long j = c10664n2.f21214t;
        this.f21209c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p060j$.util.stream.InterfaceC10629g2, p060j$.util.stream.InterfaceC10634h2
    public final void accept(long j) {
        long j2 = this.f21208b;
        if (j2 != 0) {
            this.f21208b = j2 - 1;
            return;
        }
        long j3 = this.f21209c;
        if (j3 > 0) {
            this.f21209c = j3 - 1;
            this.f21150a.accept(j);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        this.f21150a.mo531g(AbstractC10707w0.m586N0(j, this.f21210d.f21213s, this.f21209c));
    }

    @Override // p060j$.util.stream.AbstractC10609c2, p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final boolean mo530i() {
        return this.f21209c == 0 || this.f21150a.mo530i();
    }
}
