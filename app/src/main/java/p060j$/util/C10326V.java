package p060j$.util;

import java.util.Comparator;
import okhttp3.internal.http2.Http2;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.V */
/* loaded from: classes2.dex */
final class C10326V implements InterfaceC10321P {

    /* renamed from: a */
    private final Object[] f20739a;

    /* renamed from: b */
    private int f20740b;

    /* renamed from: c */
    private final int f20741c;

    /* renamed from: d */
    private final int f20742d;

    public C10326V(Object[] objArr, int i, int i2, int i3) {
        this.f20739a = objArr;
        this.f20740b = i;
        this.f20741c = i2;
        this.f20742d = i3 | 64 | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final boolean mo534a(Consumer consumer) {
        consumer.getClass();
        int i = this.f20740b;
        if (i < 0 || i >= this.f20741c) {
            return false;
        }
        this.f20740b = i + 1;
        consumer.accept(this.f20739a[i]);
        return true;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return this.f20742d;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        return this.f20741c - this.f20740b;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.f20739a;
        int length = objArr.length;
        int i2 = this.f20741c;
        if (length < i2 || (i = this.f20740b) < 0) {
            return;
        }
        this.f20740b = i2;
        if (i < i2) {
            do {
                consumer.accept(objArr[i]);
                i++;
            } while (i < i2);
        }
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
    public final InterfaceC10321P trySplit() {
        int i = this.f20740b;
        int i2 = (this.f20741c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f20740b = i2;
        return new C10326V(this.f20739a, i, i2, this.f20742d);
    }
}
