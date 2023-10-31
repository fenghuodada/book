package p060j$.util.stream;

import java.util.Arrays;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10426e0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l1 */
/* loaded from: classes2.dex */
public final class C10653l1 extends C10648k1 implements InterfaceC10722z0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10653l1(long j) {
        super(j);
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
    public final void accept(long j) {
        int i = this.f21197b;
        long[] jArr = this.f21196a;
        if (i >= jArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
        }
        this.f21197b = i + 1;
        jArr[i] = j;
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo537m((Long) obj);
    }

    @Override // p060j$.util.stream.InterfaceC10722z0, p060j$.util.stream.InterfaceC10484A0
    public final InterfaceC10499D0 build() {
        int i = this.f21197b;
        long[] jArr = this.f21196a;
        if (i >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f21197b), Integer.valueOf(jArr.length)));
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
        int i = this.f21197b;
        long[] jArr = this.f21196a;
        if (i < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f21197b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        long[] jArr = this.f21196a;
        if (j != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(jArr.length)));
        }
        this.f21197b = 0;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // p060j$.util.stream.InterfaceC10629g2
    /* renamed from: m */
    public final /* synthetic */ void mo537m(Long l) {
        AbstractC10707w0.m544w0(this, l);
    }

    @Override // p060j$.util.stream.C10648k1
    public final String toString() {
        long[] jArr = this.f21196a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f21197b), Arrays.toString(jArr));
    }
}
