package p060j$.util.stream;

import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10432h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m1 */
/* loaded from: classes2.dex */
public final class C10658m1 extends C10552O2 implements InterfaceC10499D0, InterfaceC10722z0 {
    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: A */
    public final /* synthetic */ void mo619k(Long[] lArr, int i) {
        AbstractC10707w0.m596D0(this, lArr, i);
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

    @Override // p060j$.util.stream.C10552O2, p060j$.util.function.InterfaceC10432h0
    public final void accept(long j) {
        super.accept(j);
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo537m((Long) obj);
    }

    @Override // p060j$.util.stream.InterfaceC10504E0, p060j$.util.stream.InterfaceC10509F0
    /* renamed from: b */
    public final InterfaceC10504E0 mo620b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC10509F0 mo620b(int i) {
        mo620b(i);
        throw null;
    }

    @Override // p060j$.util.stream.InterfaceC10722z0, p060j$.util.stream.InterfaceC10484A0
    public final InterfaceC10499D0 build() {
        return this;
    }

    @Override // p060j$.util.stream.InterfaceC10484A0
    public final InterfaceC10509F0 build() {
        return this;
    }

    @Override // p060j$.util.stream.AbstractC10560Q2, p060j$.util.stream.InterfaceC10504E0
    /* renamed from: c */
    public final Object mo655c() {
        return (long[]) super.mo655c();
    }

    @Override // p060j$.util.stream.AbstractC10560Q2, p060j$.util.stream.InterfaceC10504E0
    /* renamed from: d */
    public final void mo654d(Object obj, int i) {
        super.mo654d((long[]) obj, i);
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final void end() {
    }

    @Override // p060j$.util.stream.AbstractC10560Q2, p060j$.util.stream.InterfaceC10504E0
    /* renamed from: f */
    public final void mo653f(Object obj) {
        super.mo653f((InterfaceC10432h0) obj);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        clear();
        m777w(j);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.InterfaceC10629g2
    /* renamed from: m */
    public final /* synthetic */ void mo537m(Long l) {
        AbstractC10707w0.m544w0(this, l);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: p */
    public final /* synthetic */ int mo618p() {
        return 0;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: r */
    public final /* synthetic */ Object[] mo617r(InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m599A0(this, interfaceC10397N);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: s */
    public final /* synthetic */ InterfaceC10509F0 mo616s(long j, long j2, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m590J0(this, j, j2);
    }

    @Override // p060j$.util.stream.C10552O2, p060j$.util.stream.AbstractC10560Q2, java.lang.Iterable
    public final InterfaceC10318M spliterator() {
        return super.spliterator();
    }

    @Override // p060j$.util.stream.C10552O2, p060j$.util.stream.AbstractC10560Q2, java.lang.Iterable
    public final InterfaceC10321P spliterator() {
        return super.spliterator();
    }

    @Override // p060j$.util.stream.C10552O2
    /* renamed from: z */
    public final InterfaceC10315J mo652z() {
        return super.spliterator();
    }
}
