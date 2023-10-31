package p060j$.util.stream;

/* renamed from: j$.util.stream.H0 */
/* loaded from: classes2.dex */
abstract class AbstractC10519H0 implements InterfaceC10509F0 {

    /* renamed from: a */
    protected final InterfaceC10509F0 f21002a;

    /* renamed from: b */
    protected final InterfaceC10509F0 f21003b;

    /* renamed from: c */
    private final long f21004c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10519H0(InterfaceC10509F0 interfaceC10509F0, InterfaceC10509F0 interfaceC10509F02) {
        this.f21002a = interfaceC10509F0;
        this.f21003b = interfaceC10509F02;
        this.f21004c = interfaceC10509F0.count() + interfaceC10509F02.count();
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC10504E0 mo620b(int i) {
        return (InterfaceC10504E0) mo620b(i);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: b */
    public final InterfaceC10509F0 mo620b(int i) {
        if (i == 0) {
            return this.f21002a;
        }
        if (i == 1) {
            return this.f21003b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final long count() {
        return this.f21004c;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: p */
    public final int mo618p() {
        return 2;
    }
}
