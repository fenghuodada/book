package p060j$.util.stream;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10321P;
import p060j$.util.concurrent.C10359u;
import p060j$.util.concurrent.ConcurrentHashMap;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.g3 */
/* loaded from: classes2.dex */
final class C10630g3 implements InterfaceC10321P, Consumer {

    /* renamed from: d */
    private static final Object f21175d = new Object();

    /* renamed from: a */
    private final InterfaceC10321P f21176a;

    /* renamed from: b */
    private final ConcurrentHashMap f21177b;

    /* renamed from: c */
    private Object f21178c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10630g3(InterfaceC10321P interfaceC10321P) {
        this(interfaceC10321P, new ConcurrentHashMap());
    }

    private C10630g3(InterfaceC10321P interfaceC10321P, ConcurrentHashMap concurrentHashMap) {
        this.f21176a = interfaceC10321P;
        this.f21177b = concurrentHashMap;
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final boolean mo534a(Consumer consumer) {
        while (this.f21176a.mo534a(this)) {
            Object obj = this.f21178c;
            if (obj == null) {
                obj = f21175d;
            }
            if (this.f21177b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f21178c);
                this.f21178c = null;
                return true;
            }
        }
        return false;
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f21178c = obj;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return (this.f21176a.characteristics() & (-16469)) | 1;
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        return this.f21176a.estimateSize();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final void forEachRemaining(Consumer consumer) {
        this.f21176a.forEachRemaining(new C10666o(6, this, consumer));
    }

    @Override // p060j$.util.InterfaceC10321P
    public final Comparator getComparator() {
        return this.f21176a.getComparator();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC10331a.m1013i(this);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC10331a.m1012j(this, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m690j(Consumer consumer, Object obj) {
        if (this.f21177b.putIfAbsent(obj != null ? obj : f21175d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final InterfaceC10321P trySplit() {
        InterfaceC10321P trySplit = this.f21176a.trySplit();
        if (trySplit != null) {
            return new C10630g3(trySplit, this.f21177b);
        }
        return null;
    }
}
