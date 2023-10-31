package p060j$.util.concurrent;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.g */
/* loaded from: classes2.dex */
public final class C10345g extends C10355q implements InterfaceC10321P {

    /* renamed from: i */
    final ConcurrentHashMap f20793i;

    /* renamed from: j */
    long f20794j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10345g(C10351m[] c10351mArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(c10351mArr, i, i2, i3);
        this.f20793i = concurrentHashMap;
        this.f20794j = j;
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final boolean mo534a(Consumer consumer) {
        consumer.getClass();
        C10351m m967e = m967e();
        if (m967e == null) {
            return false;
        }
        consumer.accept(new C10350l(m967e.f20803b, m967e.f20804c, this.f20793i));
        return true;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return 4353;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        return this.f20794j;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C10351m m967e = m967e();
            if (m967e == null) {
                return;
            }
            consumer.accept(new C10350l(m967e.f20803b, m967e.f20804c, this.f20793i));
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC10331a.m1013i(this);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC10331a.m1012j(this, i);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final InterfaceC10321P trySplit() {
        int i = this.f20815f;
        int i2 = this.f20816g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C10351m[] c10351mArr = this.f20810a;
        int i4 = this.f20817h;
        this.f20816g = i3;
        long j = this.f20794j >>> 1;
        this.f20794j = j;
        return new C10345g(c10351mArr, i4, i3, i2, j, this.f20793i);
    }
}
