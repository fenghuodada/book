package p060j$.util.stream;

import java.util.Arrays;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10437k;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.T0 */
/* loaded from: classes2.dex */
public final class C10569T0 extends C10565S0 implements InterfaceC10712x0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10569T0(long j) {
        super(j);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        int i = this.f21069b;
        double[] dArr = this.f21068a;
        if (i >= dArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
        }
        this.f21069b = i + 1;
        dArr[i] = d;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void accept(int i) {
        AbstractC10707w0.m541y0();
        throw null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void accept(long j) {
        AbstractC10707w0.m539z0();
        throw null;
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo527q((Double) obj);
    }

    @Override // p060j$.util.stream.InterfaceC10712x0, p060j$.util.stream.InterfaceC10484A0
    public final InterfaceC10489B0 build() {
        int i = this.f21069b;
        double[] dArr = this.f21068a;
        if (i >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f21069b), Integer.valueOf(dArr.length)));
    }

    @Override // p060j$.util.stream.InterfaceC10484A0
    public final /* bridge */ /* synthetic */ InterfaceC10509F0 build() {
        build();
        return this;
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        int i = this.f21069b;
        double[] dArr = this.f21068a;
        if (i < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f21069b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        double[] dArr = this.f21068a;
        if (j != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(dArr.length)));
        }
        this.f21069b = 0;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }

    @Override // p060j$.util.stream.InterfaceC10619e2
    /* renamed from: q */
    public final /* synthetic */ void mo527q(Double d) {
        AbstractC10707w0.m552s0(this, d);
    }

    @Override // p060j$.util.stream.C10565S0
    public final String toString() {
        double[] dArr = this.f21068a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f21069b), Arrays.toString(dArr));
    }
}
