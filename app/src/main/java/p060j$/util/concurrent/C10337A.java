package p060j$.util.concurrent;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10312G;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.concurrent.A */
/* loaded from: classes2.dex */
final class C10337A implements InterfaceC10312G {

    /* renamed from: a */
    long f20758a;

    /* renamed from: b */
    final long f20759b;

    /* renamed from: c */
    final int f20760c;

    /* renamed from: d */
    final int f20761d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10337A(long j, long j2, int i, int i2) {
        this.f20758a = j;
        this.f20759b = j2;
        this.f20760c = i;
        this.f20761d = i2;
    }

    @Override // p060j$.util.InterfaceC10312G, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1008o(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: c */
    public final void forEachRemaining(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        long j = this.f20758a;
        long j2 = this.f20759b;
        if (j < j2) {
            this.f20758a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                interfaceC10391K.accept(current.m974d(this.f20760c, this.f20761d));
                j++;
            } while (j < j2);
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return 17728;
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: e */
    public final C10337A trySplit() {
        long j = this.f20758a;
        long j2 = (this.f20759b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f20758a = j2;
        return new C10337A(j, j2, this.f20760c, this.f20761d);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        return this.f20759b - this.f20758a;
    }

    @Override // p060j$.util.InterfaceC10312G, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1015g(this, consumer);
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
    /* renamed from: k */
    public final boolean tryAdvance(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        long j = this.f20758a;
        if (j < this.f20759b) {
            interfaceC10391K.accept(ThreadLocalRandom.current().m974d(this.f20760c, this.f20761d));
            this.f20758a = j + 1;
            return true;
        }
        return false;
    }
}
