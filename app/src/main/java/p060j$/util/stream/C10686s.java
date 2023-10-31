package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Function;
import p060j$.util.function.InterfaceC10427f;

/* renamed from: j$.util.stream.s */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10686s implements InterfaceC10427f {

    /* renamed from: a */
    public final /* synthetic */ int f21256a;

    /* renamed from: b */
    public final /* synthetic */ BiConsumer f21257b;

    public /* synthetic */ C10686s(BiConsumer biConsumer, int i) {
        this.f21256a = i;
        this.f21257b = biConsumer;
    }

    @Override // p060j$.util.function.BiFunction
    /* renamed from: a */
    public final BiFunction mo622a(Function function) {
        switch (this.f21256a) {
            case 0:
                function.getClass();
                return new C10359u(this, function);
            case 1:
                function.getClass();
                return new C10359u(this, function);
            default:
                function.getClass();
                return new C10359u(this, function);
        }
    }

    @Override // p060j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f21256a;
        BiConsumer biConsumer = this.f21257b;
        switch (i) {
            case 0:
                biConsumer.accept(obj, obj2);
                return obj;
            case 1:
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                biConsumer.accept(obj, obj2);
                return obj;
        }
    }
}
