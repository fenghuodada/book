package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s1 */
/* loaded from: classes2.dex */
public final class C10688s1 extends C10563R2 implements InterfaceC10509F0, InterfaceC10484A0 {
    @Override // p060j$.util.stream.C10563R2, p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final void mo621a(Consumer consumer) {
        super.mo621a(consumer);
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

    @Override // p060j$.util.stream.C10563R2, p060j$.util.function.Consumer
    public final void accept(Object obj) {
        super.accept(obj);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: b */
    public final InterfaceC10509F0 mo620b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p060j$.util.stream.InterfaceC10484A0
    public final InterfaceC10509F0 build() {
        return this;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final void end() {
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        clear();
        m774t(j);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: k */
    public final void mo619k(Object[] objArr, int i) {
        long j = i;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f21158c == 0) {
            System.arraycopy(this.f21065e, 0, objArr, i, this.f21157b);
            return;
        }
        for (int i2 = 0; i2 < this.f21158c; i2++) {
            Object[] objArr2 = this.f21066f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f21066f[i2].length;
        }
        int i3 = this.f21157b;
        if (i3 > 0) {
            System.arraycopy(this.f21065e, 0, objArr, i, i3);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: p */
    public final /* synthetic */ int mo618p() {
        return 0;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: r */
    public final Object[] mo617r(InterfaceC10397N interfaceC10397N) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) interfaceC10397N.apply((int) count);
            mo619k(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: s */
    public final /* synthetic */ InterfaceC10509F0 mo616s(long j, long j2, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m589K0(this, j, j2, interfaceC10397N);
    }

    @Override // p060j$.util.stream.C10563R2, java.lang.Iterable
    public final InterfaceC10321P spliterator() {
        return super.spliterator();
    }
}
