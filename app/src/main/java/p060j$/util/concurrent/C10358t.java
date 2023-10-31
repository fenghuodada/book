package p060j$.util.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import p060j$.util.AbstractC10331a;
import p060j$.util.C10320O;
import p060j$.util.InterfaceC10321P;
import p060j$.util.InterfaceC10333b;
import p060j$.util.function.C10390J0;
import p060j$.util.function.C10393L;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.stream.AbstractC10707w0;
import p060j$.util.stream.C10571T2;
import p060j$.util.stream.InterfaceC10575U2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.t */
/* loaded from: classes2.dex */
public final class C10358t extends AbstractC10341c implements InterfaceC10333b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10358t(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // p060j$.util.InterfaceC10333b
    /* renamed from: a */
    public final void mo955a(Consumer consumer) {
        consumer.getClass();
        C10351m[] c10351mArr = this.f20792a.f20777a;
        if (c10351mArr == null) {
            return;
        }
        C10355q c10355q = new C10355q(c10351mArr, c10351mArr.length, 0, c10351mArr.length);
        while (true) {
            C10351m m967e = c10355q.m967e();
            if (m967e == null) {
                return;
            }
            consumer.accept(m967e.f20804c);
        }
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p060j$.util.InterfaceC10333b
    /* renamed from: b */
    public final /* synthetic */ boolean mo954b(InterfaceC10394L0 interfaceC10394L0) {
        return AbstractC10331a.m1011l(this, interfaceC10394L0);
    }

    @Override // p060j$.util.concurrent.AbstractC10341c, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20792a.containsValue(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        mo955a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // p060j$.util.concurrent.AbstractC10341c, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f20792a;
        C10351m[] c10351mArr = concurrentHashMap.f20777a;
        int length = c10351mArr == null ? 0 : c10351mArr.length;
        return new C10347i(c10351mArr, length, length, concurrentHashMap, 1);
    }

    @Override // java.util.Collection
    public final Stream parallelStream() {
        return C10571T2.m769A(AbstractC10707w0.m542x1(AbstractC10331a.m1018F(this), true));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC10340b abstractC10340b;
        if (obj != null) {
            Iterator it = iterator();
            do {
                abstractC10340b = (AbstractC10340b) it;
                if (!abstractC10340b.hasNext()) {
                    return false;
                }
            } while (!obj.equals(((C10347i) it).next()));
            abstractC10340b.remove();
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return AbstractC10331a.m1011l(this, C10390J0.m921c(predicate));
    }

    @Override // java.util.Collection, java.lang.Iterable, p060j$.util.InterfaceC10333b, java.util.Set
    public final InterfaceC10321P spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f20792a;
        long m984l = concurrentHashMap.m984l();
        C10351m[] c10351mArr = concurrentHashMap.f20777a;
        int length = c10351mArr == null ? 0 : c10351mArr.length;
        return new C10349k(c10351mArr, length, 0, length, m984l >= 0 ? m984l : 0L, 1);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C10320O.m1028a(spliterator());
    }

    @Override // java.util.Collection, p060j$.util.InterfaceC10333b
    public final /* synthetic */ InterfaceC10575U2 stream() {
        return AbstractC10331a.m1010m(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return C10571T2.m769A(AbstractC10331a.m1010m(this));
    }

    public final Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) C10393L.m919a(intFunction).apply(0));
    }
}
