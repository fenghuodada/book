package p060j$.util.stream;

import p060j$.util.C10472i;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10384G0;
import p060j$.util.function.InterfaceC10424d0;
import p060j$.util.function.InterfaceC10438k0;

/* renamed from: j$.util.stream.f0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10622f0 implements InterfaceC10424d0, InterfaceC10438k0, InterfaceC10384G0, BiConsumer, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f21170a;

    public /* synthetic */ C10622f0(int i) {
        this.f21170a = i;
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // p060j$.util.function.InterfaceC10384G0
    public final void accept(Object obj, long j) {
        ((C10472i) obj).accept(j);
    }

    @Override // p060j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((C10472i) obj).m845a((C10472i) obj2);
    }

    @Override // p060j$.util.function.InterfaceC10438k0
    public final Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // p060j$.util.function.InterfaceC10424d0
    public final long applyAsLong(long j, long j2) {
        switch (this.f21170a) {
            case 0:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // p060j$.util.function.BiConsumer
    /* renamed from: c */
    public final BiConsumer mo692c(BiConsumer biConsumer) {
        biConsumer.getClass();
        return new C10359u(1, this, biConsumer);
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }
}
