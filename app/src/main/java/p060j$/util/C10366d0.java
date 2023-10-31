package p060j$.util;

import java.util.Comparator;
import okhttp3.internal.http2.Http2;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.d0 */
/* loaded from: classes2.dex */
final class C10366d0 implements InterfaceC10315J {

    /* renamed from: a */
    private final long[] f20839a;

    /* renamed from: b */
    private int f20840b;

    /* renamed from: c */
    private final int f20841c;

    /* renamed from: d */
    private final int f20842d;

    public C10366d0(long[] jArr, int i, int i2, int i3) {
        this.f20839a = jArr;
        this.f20840b = i;
        this.f20841c = i2;
        this.f20842d = i3 | 64 | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    @Override // p060j$.util.InterfaceC10315J, p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1007q(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC10432h0 interfaceC10432h0) {
        int i;
        interfaceC10432h0.getClass();
        long[] jArr = this.f20839a;
        int length = jArr.length;
        int i2 = this.f20841c;
        if (length < i2 || (i = this.f20840b) < 0) {
            return;
        }
        this.f20840b = i2;
        if (i < i2) {
            do {
                interfaceC10432h0.accept(jArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return this.f20842d;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        return this.f20841c - this.f20840b;
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: f */
    public final boolean tryAdvance(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        int i = this.f20840b;
        if (i < 0 || i >= this.f20841c) {
            return false;
        }
        this.f20840b = i + 1;
        interfaceC10432h0.accept(this.f20839a[i]);
        return true;
    }

    @Override // p060j$.util.InterfaceC10315J, p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1014h(this, consumer);
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

    @Override // p060j$.util.InterfaceC10321P
    public final InterfaceC10315J trySplit() {
        int i = this.f20840b;
        int i2 = (this.f20841c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f20840b = i2;
        return new C10366d0(this.f20839a, i, i2, this.f20842d);
    }
}
