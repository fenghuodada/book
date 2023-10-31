package p060j$.util.stream;

import java.util.Arrays;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a1 */
/* loaded from: classes2.dex */
public final class C10598a1 extends C10524I0 implements InterfaceC10484A0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10598a1(long j, InterfaceC10397N interfaceC10397N) {
        super(j, interfaceC10397N);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final /* synthetic */ void accept(double d) {
        AbstractC10707w0.m554r0();
        throw null;
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
    public final void accept(Object obj) {
        int i = this.f21011b;
        Object[] objArr = this.f21010a;
        if (i >= objArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
        }
        this.f21011b = i + 1;
        objArr[i] = obj;
    }

    @Override // p060j$.util.stream.InterfaceC10484A0
    public final InterfaceC10509F0 build() {
        int i = this.f21011b;
        Object[] objArr = this.f21010a;
        if (i >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f21011b), Integer.valueOf(objArr.length)));
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        int i = this.f21011b;
        Object[] objArr = this.f21010a;
        if (i < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f21011b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        Object[] objArr = this.f21010a;
        if (j != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
        }
        this.f21011b = 0;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.C10524I0
    public final String toString() {
        Object[] objArr = this.f21010a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f21011b), Arrays.toString(objArr));
    }
}
