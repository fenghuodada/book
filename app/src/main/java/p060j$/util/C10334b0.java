package p060j$.util;

import java.util.Comparator;
import okhttp3.internal.http2.Http2;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.b0 */
/* loaded from: classes2.dex */
final class C10334b0 implements InterfaceC10312G {

    /* renamed from: a */
    private final int[] f20747a;

    /* renamed from: b */
    private int f20748b;

    /* renamed from: c */
    private final int f20749c;

    /* renamed from: d */
    private final int f20750d;

    public C10334b0(int[] iArr, int i, int i2, int i3) {
        this.f20747a = iArr;
        this.f20748b = i;
        this.f20749c = i2;
        this.f20750d = i3 | 64 | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    @Override // p060j$.util.InterfaceC10312G, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1008o(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: c */
    public final void forEachRemaining(InterfaceC10391K interfaceC10391K) {
        int i;
        interfaceC10391K.getClass();
        int[] iArr = this.f20747a;
        int length = iArr.length;
        int i2 = this.f20749c;
        if (length < i2 || (i = this.f20748b) < 0) {
            return;
        }
        this.f20748b = i2;
        if (i < i2) {
            do {
                interfaceC10391K.accept(iArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return this.f20750d;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        return this.f20749c - this.f20748b;
    }

    @Override // p060j$.util.InterfaceC10312G, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1015g(this, consumer);
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
    /* renamed from: k */
    public final boolean tryAdvance(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        int i = this.f20748b;
        if (i < 0 || i >= this.f20749c) {
            return false;
        }
        this.f20748b = i + 1;
        interfaceC10391K.accept(this.f20747a[i]);
        return true;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final InterfaceC10312G trySplit() {
        int i = this.f20748b;
        int i2 = (this.f20749c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f20748b = i2;
        return new C10334b0(this.f20747a, i, i2, this.f20750d);
    }
}
