package p060j$.util.stream;

import p060j$.util.function.Function;

/* renamed from: j$.util.stream.V1 */
/* loaded from: classes2.dex */
final class C10578V1 extends AbstractC10590Y1 {

    /* renamed from: s */
    public final /* synthetic */ int f21088s;

    /* renamed from: t */
    final /* synthetic */ Function f21089t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10578V1(AbstractC10606c abstractC10606c, int i, Function function, int i2) {
        super(abstractC10606c, i);
        this.f21088s = i2;
        this.f21089t = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        switch (this.f21088s) {
            case 0:
                return new C10570T1(this, interfaceC10634h2, 2);
            default:
                return new C10570T1(this, interfaceC10634h2, 6);
        }
    }
}
