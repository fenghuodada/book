package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.e3 */
/* loaded from: classes2.dex */
final class C10620e3 extends AbstractC10625f3 implements Consumer {

    /* renamed from: b */
    final Object[] f21162b = new Object[128];

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f21171a;
        this.f21171a = i + 1;
        this.f21162b[i] = obj;
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }
}
