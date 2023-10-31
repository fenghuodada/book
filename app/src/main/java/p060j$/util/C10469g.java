package p060j$.util;

import p060j$.util.function.C10437k;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.g */
/* loaded from: classes2.dex */
public final class C10469g implements InterfaceC10443n {

    /* renamed from: a */
    private double f20938a;

    /* renamed from: b */
    private double f20939b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    /* renamed from: a */
    public final void m848a(C10469g c10469g) {
        this.count += c10469g.count;
        this.f20939b += c10469g.f20939b;
        double d = c10469g.sum - this.f20938a;
        double d2 = this.sum;
        double d3 = d2 + d;
        double d4 = (d3 - d2) - d;
        this.f20938a = d4;
        double d5 = c10469g.f20938a - d4;
        double d6 = d3 + d5;
        this.f20938a = (d6 - d3) - d5;
        this.sum = d6;
        this.min = Math.min(this.min, c10469g.min);
        this.max = Math.max(this.max, c10469g.max);
    }

    @Override // p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        this.count++;
        this.f20939b += d;
        double d2 = d - this.f20938a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.f20938a = (d4 - d3) - d2;
        this.sum = d4;
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }

    public final String toString() {
        double d;
        Object[] objArr = new Object[6];
        objArr[0] = C10469g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        double d2 = this.sum + this.f20938a;
        if (Double.isNaN(d2) && Double.isInfinite(this.f20939b)) {
            d2 = this.f20939b;
        }
        objArr[2] = Double.valueOf(d2);
        objArr[3] = Double.valueOf(this.min);
        if (this.count > 0) {
            double d3 = this.sum + this.f20938a;
            if (Double.isNaN(d3) && Double.isInfinite(this.f20939b)) {
                d3 = this.f20939b;
            }
            d = d3 / this.count;
        } else {
            d = 0.0d;
        }
        objArr[4] = Double.valueOf(d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
