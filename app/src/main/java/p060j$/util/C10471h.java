package p060j$.util;

import p060j$.util.function.C10385H;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.h */
/* loaded from: classes2.dex */
public final class C10471h implements InterfaceC10391K {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    /* renamed from: a */
    public final void m846a(C10471h c10471h) {
        this.count += c10471h.count;
        this.sum += c10471h.sum;
        this.min = Math.min(this.min, c10471h.min);
        this.max = Math.max(this.max, c10471h.max);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C10471h.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? this.sum / j : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
