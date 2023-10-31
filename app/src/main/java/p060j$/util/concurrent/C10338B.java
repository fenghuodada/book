package p060j$.util.concurrent;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10315J;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.concurrent.B */
/* loaded from: classes2.dex */
final class C10338B implements InterfaceC10315J {

    /* renamed from: a */
    long f20762a;

    /* renamed from: b */
    final long f20763b;

    /* renamed from: c */
    final long f20764c;

    /* renamed from: d */
    final long f20765d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10338B(long j, long j2, long j3, long j4) {
        this.f20762a = j;
        this.f20763b = j2;
        this.f20764c = j3;
        this.f20765d = j4;
    }

    @Override // p060j$.util.InterfaceC10315J, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1007q(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        long j = this.f20762a;
        long j2 = this.f20763b;
        if (j < j2) {
            this.f20762a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                interfaceC10432h0.accept(current.m973e(this.f20764c, this.f20765d));
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
    public final C10338B trySplit() {
        long j = this.f20762a;
        long j2 = (this.f20763b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f20762a = j2;
        return new C10338B(j, j2, this.f20764c, this.f20765d);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        return this.f20763b - this.f20762a;
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: f */
    public final boolean tryAdvance(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        long j = this.f20762a;
        if (j < this.f20763b) {
            interfaceC10432h0.accept(ThreadLocalRandom.current().m973e(this.f20764c, this.f20765d));
            this.f20762a = j + 1;
            return true;
        }
        return false;
    }

    @Override // p060j$.util.InterfaceC10315J, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1014h(this, consumer);
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
}
