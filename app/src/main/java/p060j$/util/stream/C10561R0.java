package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.R0 */
/* loaded from: classes2.dex */
public final class C10561R0 extends AbstractC10519H0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10561R0(InterfaceC10509F0 interfaceC10509F0, InterfaceC10509F0 interfaceC10509F02) {
        super(interfaceC10509F0, interfaceC10509F02);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final void mo621a(Consumer consumer) {
        this.f21002a.mo621a(consumer);
        this.f21003b.mo621a(consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: k */
    public final void mo619k(Object[] objArr, int i) {
        objArr.getClass();
        InterfaceC10509F0 interfaceC10509F0 = this.f21002a;
        interfaceC10509F0.mo619k(objArr, i);
        this.f21003b.mo619k(objArr, i + ((int) interfaceC10509F0.count()));
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
    public final InterfaceC10509F0 mo616s(long j, long j2, InterfaceC10397N interfaceC10397N) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.f21002a.count();
        return j >= count ? this.f21003b.mo616s(j - count, j2 - count, interfaceC10397N) : j2 <= count ? this.f21002a.mo616s(j, j2, interfaceC10397N) : AbstractC10707w0.m576W0(EnumC10591Y2.REFERENCE, this.f21002a.mo616s(j, count, interfaceC10397N), this.f21003b.mo616s(0L, j2 - count, interfaceC10397N));
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10321P spliterator() {
        return new C10638i1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f21002a, this.f21003b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
