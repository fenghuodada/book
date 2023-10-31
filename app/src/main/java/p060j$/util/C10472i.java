package p060j$.util;

import p060j$.util.function.C10385H;
import p060j$.util.function.C10426e0;
import p060j$.util.function.InterfaceC10391K;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.i */
/* loaded from: classes2.dex */
public final class C10472i implements InterfaceC10432h0, InterfaceC10391K {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    /* renamed from: a */
    public final void m845a(C10472i c10472i) {
        this.count += c10472i.count;
        this.sum += c10472i.sum;
        this.min = Math.min(this.min, c10472i.min);
        this.max = Math.max(this.max, c10472i.max);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    public final void accept(int i) {
        accept(i);
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C10472i.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? this.sum / j : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
