package p060j$.util.stream;

import p060j$.util.function.InterfaceC10394L0;

/* renamed from: j$.util.stream.o0 */
/* loaded from: classes2.dex */
final class C10667o0 extends AbstractC10687s0 {

    /* renamed from: c */
    final /* synthetic */ EnumC10692t0 f21219c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC10394L0 f21220d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10667o0(InterfaceC10394L0 interfaceC10394L0, EnumC10692t0 enumC10692t0) {
        super(enumC10692t0);
        this.f21219c = enumC10692t0;
        this.f21220d = interfaceC10394L0;
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (this.f21258a) {
            return;
        }
        boolean test = this.f21220d.test(obj);
        EnumC10692t0 enumC10692t0 = this.f21219c;
        z = enumC10692t0.f21264a;
        if (test == z) {
            this.f21258a = true;
            z2 = enumC10692t0.f21265b;
            this.f21259b = z2;
        }
    }
}
