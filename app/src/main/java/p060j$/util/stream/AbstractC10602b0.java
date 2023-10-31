package p060j$.util.stream;

/* renamed from: j$.util.stream.b0 */
/* loaded from: classes2.dex */
abstract class AbstractC10602b0 extends AbstractC10612d0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10602b0(AbstractC10606c abstractC10606c, int i) {
        super(abstractC10606c, i);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: L1 */
    final boolean mo680L1() {
        return true;
    }

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
