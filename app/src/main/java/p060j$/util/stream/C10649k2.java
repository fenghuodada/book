package p060j$.util.stream;

/* renamed from: j$.util.stream.k2 */
/* loaded from: classes2.dex */
final class C10649k2 extends AbstractC10604b2 {

    /* renamed from: b */
    long f21198b;

    /* renamed from: c */
    long f21199c;

    /* renamed from: d */
    final /* synthetic */ C10654l2 f21200d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10649k2(C10654l2 c10654l2, InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
        this.f21200d = c10654l2;
        this.f21198b = c10654l2.f21203s;
        long j = c10654l2.f21204t;
        this.f21199c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p060j$.util.stream.InterfaceC10624f2, p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        long j = this.f21198b;
        if (j != 0) {
            this.f21198b = j - 1;
            return;
        }
        long j2 = this.f21199c;
        if (j2 > 0) {
            this.f21199c = j2 - 1;
            this.f21137a.accept(i);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        this.f21137a.mo531g(AbstractC10707w0.m586N0(j, this.f21200d.f21203s, this.f21199c));
    }

    @Override // p060j$.util.stream.AbstractC10604b2, p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final boolean mo530i() {
        return this.f21199c == 0 || this.f21137a.mo530i();
    }
}
