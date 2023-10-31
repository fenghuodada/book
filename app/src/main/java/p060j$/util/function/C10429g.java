package p060j$.util.function;

import java.util.function.Consumer;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.function.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10429g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f20907a;

    private /* synthetic */ C10429g(Consumer consumer) {
        this.f20907a = consumer;
    }

    /* renamed from: a */
    public static /* synthetic */ Consumer m885a(Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof Consumer.VivifiedWrapper ? ((Consumer.VivifiedWrapper) consumer).f20859a : new C10429g(consumer);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.f20907a.accept(obj);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return m885a(this.f20907a.mo532e(Consumer.VivifiedWrapper.convert(consumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Consumer consumer = this.f20907a;
        if (obj instanceof C10429g) {
            obj = ((C10429g) obj).f20907a;
        }
        return consumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20907a.hashCode();
    }
}
