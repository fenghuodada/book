package p060j$.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Consumer;
import p060j$.util.function.Function;

/* renamed from: j$.util.concurrent.u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10359u implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f20828a;

    /* renamed from: b */
    public final /* synthetic */ Object f20829b;

    /* renamed from: c */
    public final /* synthetic */ Object f20830c;

    public /* synthetic */ C10359u(int i, Object obj, Object obj2) {
        this.f20828a = i;
        this.f20829b = obj;
        this.f20830c = obj2;
    }

    public /* synthetic */ C10359u(BiFunction biFunction, Function function) {
        this.f20828a = 2;
        this.f20830c = biFunction;
        this.f20829b = function;
    }

    @Override // p060j$.util.function.BiFunction
    /* renamed from: a */
    public final BiFunction mo622a(Function function) {
        function.getClass();
        return new C10359u(this, function);
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        ((Consumer) this.f20829b).accept(obj);
        ((Consumer) this.f20830c).accept(obj);
    }

    @Override // p060j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.f20828a;
        Object obj3 = this.f20830c;
        Object obj4 = this.f20829b;
        switch (i) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                return;
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                return;
        }
    }

    @Override // p060j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.f20829b).apply(((BiFunction) this.f20830c).apply(obj, obj2));
    }

    @Override // p060j$.util.function.BiConsumer
    /* renamed from: c */
    public final BiConsumer mo692c(BiConsumer biConsumer) {
        switch (this.f20828a) {
            case 0:
                biConsumer.getClass();
                return new C10359u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new C10359u(1, this, biConsumer);
        }
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }
}
