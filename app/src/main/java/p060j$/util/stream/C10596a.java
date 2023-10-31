package p060j$.util.stream;

import java.util.List;
import p060j$.util.InterfaceC10321P;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10438k0;

/* renamed from: j$.util.stream.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10596a implements InterfaceC10400O0, InterfaceC10438k0, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f21130a;

    /* renamed from: b */
    public final /* synthetic */ Object f21131b;

    public /* synthetic */ C10596a(Object obj, int i) {
        this.f21130a = i;
        this.f21131b = obj;
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f21130a;
        Object obj2 = this.f21131b;
        switch (i) {
            case 3:
                ((InterfaceC10634h2) obj2).accept(obj);
                return;
            default:
                ((List) obj2).add(obj);
                return;
        }
    }

    @Override // p060j$.util.function.InterfaceC10438k0
    public final Object apply(long j) {
        int i = C10538L0.f21032k;
        return AbstractC10707w0.m581R0(j, (InterfaceC10397N) this.f21131b);
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        switch (this.f21130a) {
            case 3:
                consumer.getClass();
                return new C10359u(3, this, consumer);
            default:
                consumer.getClass();
                return new C10359u(3, this, consumer);
        }
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        int i = this.f21130a;
        Object obj = this.f21131b;
        switch (i) {
            case 0:
                return (InterfaceC10321P) obj;
            default:
                return ((AbstractC10606c) obj).m721I1();
        }
    }
}
