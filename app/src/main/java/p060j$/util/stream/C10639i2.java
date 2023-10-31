package p060j$.util.stream;

/* renamed from: j$.util.stream.i2 */
/* loaded from: classes2.dex */
final class C10639i2 extends AbstractC10614d2 {

    /* renamed from: b */
    long f21182b;

    /* renamed from: c */
    long f21183c;

    /* renamed from: d */
    final /* synthetic */ C10644j2 f21184d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10639i2(C10644j2 c10644j2, InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
        this.f21184d = c10644j2;
        this.f21182b = c10644j2.f21191s;
        long j = c10644j2.f21192t;
        this.f21183c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.f21182b;
        if (j != 0) {
            this.f21182b = j - 1;
            return;
        }
        long j2 = this.f21183c;
        if (j2 > 0) {
            this.f21183c = j2 - 1;
            this.f21154a.accept(obj);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        this.f21154a.mo531g(AbstractC10707w0.m586N0(j, this.f21184d.f21191s, this.f21183c));
    }

    @Override // p060j$.util.stream.AbstractC10614d2, p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final boolean mo530i() {
        return this.f21183c == 0 || this.f21154a.mo530i();
    }
}
