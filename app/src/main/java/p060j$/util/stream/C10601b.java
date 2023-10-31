package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.C10458u0;
import p060j$.util.function.InterfaceC10372A0;
import p060j$.util.function.InterfaceC10378D0;
import p060j$.util.function.InterfaceC10384G0;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10414X;
import p060j$.util.function.InterfaceC10438k0;
import p060j$.util.function.InterfaceC10464x0;
import p060j$.util.function.InterfaceC10467z;
import p060j$.util.function.ToDoubleFunction;
import p060j$.util.function.ToIntFunction;
import p060j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10601b implements InterfaceC10397N, InterfaceC10372A0, BiConsumer, InterfaceC10467z, InterfaceC10400O0, ToDoubleFunction, ToIntFunction, InterfaceC10414X, InterfaceC10378D0, InterfaceC10464x0, ToLongFunction, InterfaceC10384G0, InterfaceC10438k0 {

    /* renamed from: a */
    public final /* synthetic */ int f21134a;

    public /* synthetic */ C10601b(int i) {
        this.f21134a = i;
    }

    @Override // p060j$.util.function.InterfaceC10464x0
    /* renamed from: a */
    public final InterfaceC10464x0 mo729a(InterfaceC10464x0 interfaceC10464x0) {
        interfaceC10464x0.getClass();
        return new C10458u0(this, interfaceC10464x0, 1);
    }

    @Override // p060j$.util.function.InterfaceC10372A0
    public final void accept(Object obj, double d) {
        switch (this.f21134a) {
            case 2:
                double[] dArr = (double[]) obj;
                AbstractC10661n.m647a(dArr, d);
                dArr[2] = dArr[2] + d;
                return;
            default:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                AbstractC10661n.m647a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                return;
        }
    }

    @Override // p060j$.util.function.InterfaceC10378D0
    public final void accept(Object obj, int i) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i;
    }

    @Override // p060j$.util.function.InterfaceC10384G0
    public final void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    @Override // p060j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f21134a) {
            case 3:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC10661n.m647a(dArr, dArr2[0]);
                AbstractC10661n.m647a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 7:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC10661n.m647a(dArr3, dArr4[0]);
                AbstractC10661n.m647a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 19:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    @Override // p060j$.util.function.InterfaceC10397N
    public final Object apply(int i) {
        switch (this.f21134a) {
            case 0:
                return new Object[i];
            case 1:
                return new Double[i];
            case 14:
                int i2 = C10572U.f21076h;
                return new Object[i];
            case 20:
                return new Integer[i];
            default:
                return new Long[i];
        }
    }

    @Override // p060j$.util.function.InterfaceC10438k0
    public final Object apply(long j) {
        switch (this.f21134a) {
            case 27:
                return AbstractC10707w0.m573Z0(j);
            case 28:
                return AbstractC10707w0.m563j1(j);
            default:
                return AbstractC10707w0.m561l1(j);
        }
    }

    @Override // p060j$.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // p060j$.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // p060j$.util.function.InterfaceC10467z
    public final long applyAsLong(double d) {
        return 1L;
    }

    @Override // p060j$.util.function.InterfaceC10414X
    public final long applyAsLong(int i) {
        return 1L;
    }

    @Override // p060j$.util.function.InterfaceC10464x0
    public final long applyAsLong(long j) {
        return 1L;
    }

    @Override // p060j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // p060j$.util.function.InterfaceC10464x0
    /* renamed from: b */
    public final InterfaceC10464x0 mo728b(InterfaceC10464x0 interfaceC10464x0) {
        interfaceC10464x0.getClass();
        return new C10458u0(this, interfaceC10464x0, 0);
    }

    @Override // p060j$.util.function.BiConsumer
    /* renamed from: c */
    public final BiConsumer mo692c(BiConsumer biConsumer) {
        switch (this.f21134a) {
            case 3:
                biConsumer.getClass();
                return new C10359u(1, this, biConsumer);
            case 7:
                biConsumer.getClass();
                return new C10359u(1, this, biConsumer);
            case 19:
                biConsumer.getClass();
                return new C10359u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new C10359u(1, this, biConsumer);
        }
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        switch (this.f21134a) {
            case 5:
                return new double[4];
            case 6:
            case 7:
            case 8:
            case 14:
            case 15:
            case 16:
            default:
                return new long[2];
            case 9:
                return new double[3];
            case 10:
                return new C10523I();
            case 11:
                return new C10533K();
            case 12:
                return new C10537L();
            case 13:
                return new C10528J();
            case 17:
                return new long[2];
        }
    }
}
