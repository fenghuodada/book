package p060j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1 */
/* loaded from: classes2.dex */
public class C10698u1 extends AbstractC10703v1 {

    /* renamed from: c */
    public final /* synthetic */ int f21271c;

    /* renamed from: d */
    private final Object f21272d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10698u1(InterfaceC10504E0 interfaceC10504E0, Object obj) {
        this(interfaceC10504E0, obj, 0);
        this.f21271c = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10698u1(InterfaceC10509F0 interfaceC10509F0, Object obj, int i) {
        super(interfaceC10509F0);
        this.f21271c = i;
        this.f21272d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10698u1(InterfaceC10509F0 interfaceC10509F0, Object[] objArr) {
        this(interfaceC10509F0, objArr, 1);
        this.f21271c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10698u1(C10698u1 c10698u1, InterfaceC10504E0 interfaceC10504E0, int i) {
        super(c10698u1, interfaceC10504E0, i);
        this.f21271c = 0;
        this.f21272d = c10698u1.f21272d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10698u1(C10698u1 c10698u1, InterfaceC10509F0 interfaceC10509F0, int i) {
        super(c10698u1, interfaceC10509F0, i);
        this.f21271c = 1;
        this.f21272d = (Object[]) c10698u1.f21272d;
    }

    @Override // p060j$.util.stream.AbstractC10703v1
    /* renamed from: a */
    final void mo603a() {
        switch (this.f21271c) {
            case 0:
                ((InterfaceC10504E0) this.f21277a).mo654d(this.f21272d, this.f21278b);
                return;
            default:
                this.f21277a.mo619k((Object[]) this.f21272d, this.f21278b);
                return;
        }
    }

    @Override // p060j$.util.stream.AbstractC10703v1
    /* renamed from: b */
    final C10698u1 mo602b(int i, int i2) {
        switch (this.f21271c) {
            case 0:
                return new C10698u1(this, ((InterfaceC10504E0) this.f21277a).mo620b(i), i2);
            default:
                return new C10698u1(this, this.f21277a.mo620b(i), i2);
        }
    }
}
