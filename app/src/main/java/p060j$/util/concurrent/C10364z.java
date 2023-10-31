package p060j$.util.concurrent;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10309D;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.concurrent.z */
/* loaded from: classes2.dex */
final class C10364z implements InterfaceC10309D {

    /* renamed from: a */
    long f20832a;

    /* renamed from: b */
    final long f20833b;

    /* renamed from: c */
    final double f20834c;

    /* renamed from: d */
    final double f20835d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10364z(long j, long j2, double d, double d2) {
        this.f20832a = j;
        this.f20833b = j2;
        this.f20834c = d;
        this.f20835d = d2;
    }

    @Override // p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1009n(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return 17728;
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        long j = this.f20832a;
        long j2 = this.f20833b;
        if (j < j2) {
            this.f20832a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                interfaceC10443n.accept(current.m975c(this.f20834c, this.f20835d));
                j++;
            } while (j < j2);
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: e */
    public final C10364z trySplit() {
        long j = this.f20832a;
        long j2 = (this.f20833b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f20832a = j2;
        return new C10364z(j, j2, this.f20834c, this.f20835d);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        return this.f20833b - this.f20832a;
    }

    @Override // p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1016e(this, consumer);
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

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: p */
    public final boolean tryAdvance(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        long j = this.f20832a;
        if (j < this.f20833b) {
            interfaceC10443n.accept(ThreadLocalRandom.current().m975c(this.f20834c, this.f20835d));
            this.f20832a = j + 1;
            return true;
        }
        return false;
    }
}
