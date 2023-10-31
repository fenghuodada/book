package p060j$.util;

import java.util.Comparator;
import okhttp3.internal.http2.Http2;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.W */
/* loaded from: classes2.dex */
final class C10327W implements InterfaceC10309D {

    /* renamed from: a */
    private final double[] f20743a;

    /* renamed from: b */
    private int f20744b;

    /* renamed from: c */
    private final int f20745c;

    /* renamed from: d */
    private final int f20746d;

    public C10327W(double[] dArr, int i, int i2, int i3) {
        this.f20743a = dArr;
        this.f20744b = i;
        this.f20745c = i2;
        this.f20746d = i3 | 64 | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    @Override // p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1009n(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return this.f20746d;
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC10443n interfaceC10443n) {
        int i;
        interfaceC10443n.getClass();
        double[] dArr = this.f20743a;
        int length = dArr.length;
        int i2 = this.f20745c;
        if (length < i2 || (i = this.f20744b) < 0) {
            return;
        }
        this.f20744b = i2;
        if (i < i2) {
            do {
                interfaceC10443n.accept(dArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        return this.f20745c - this.f20744b;
    }

    @Override // p060j$.util.InterfaceC10309D, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1016e(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final Comparator getComparator() {
        if (AbstractC10331a.m1012j(this, 4)) {
            return null;
        }
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
        int i = this.f20744b;
        if (i < 0 || i >= this.f20745c) {
            return false;
        }
        this.f20744b = i + 1;
        interfaceC10443n.accept(this.f20743a[i]);
        return true;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final InterfaceC10309D trySplit() {
        int i = this.f20744b;
        int i2 = (this.f20745c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f20744b = i2;
        return new C10327W(this.f20743a, i, i2, this.f20746d);
    }
}
