package p060j$.util.stream;

import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.S */
/* loaded from: classes2.dex */
final class C10564S extends AbstractC10568T {

    /* renamed from: b */
    final Consumer f21067b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10564S(Consumer consumer, boolean z) {
        super(z);
        this.f21067b = consumer;
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f21067b.accept(obj);
    }
}
