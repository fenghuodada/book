package p060j$.util.stream;

/* renamed from: j$.util.stream.p */
/* loaded from: classes2.dex */
final class C10671p extends AbstractC10614d2 {

    /* renamed from: b */
    boolean f21225b;

    /* renamed from: c */
    Object f21226c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10671p(InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        InterfaceC10634h2 interfaceC10634h2 = this.f21154a;
        if (obj != null) {
            Object obj2 = this.f21226c;
            if (obj2 != null && obj.equals(obj2)) {
                return;
            }
        } else if (this.f21225b) {
            return;
        } else {
            this.f21225b = true;
            obj = null;
        }
        this.f21226c = obj;
        interfaceC10634h2.accept(obj);
    }

    @Override // p060j$.util.stream.AbstractC10614d2, p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        this.f21225b = false;
        this.f21226c = null;
        this.f21154a.end();
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        this.f21225b = false;
        this.f21226c = null;
        this.f21154a.mo531g(-1L);
    }
}
