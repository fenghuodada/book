package p060j$.util.stream;

import java.util.Arrays;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10443n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.S0 */
/* loaded from: classes2.dex */
public class C10565S0 implements InterfaceC10489B0 {

    /* renamed from: a */
    final double[] f21068a;

    /* renamed from: b */
    int f21069b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10565S0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21068a = new double[(int) j];
        this.f21069b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10565S0(double[] dArr) {
        this.f21068a = dArr;
        this.f21069b = dArr.length;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final /* synthetic */ void mo621a(Consumer consumer) {
        AbstractC10707w0.m595E0(this, consumer);
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

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: c */
    public final Object mo655c() {
        double[] dArr = this.f21068a;
        int length = dArr.length;
        int i = this.f21069b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final long count() {
        return this.f21069b;
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: d */
    public final void mo654d(Object obj, int i) {
        int i2 = this.f21069b;
        System.arraycopy(this.f21068a, 0, (double[]) obj, i, i2);
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: f */
    public final void mo653f(Object obj) {
        InterfaceC10443n interfaceC10443n = (InterfaceC10443n) obj;
        for (int i = 0; i < this.f21069b; i++) {
            interfaceC10443n.accept(this.f21068a[i]);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: j */
    public final /* synthetic */ void mo619k(Double[] dArr, int i) {
        AbstractC10707w0.m598B0(this, dArr, i);
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
        return AbstractC10707w0.m592H0(this, j, j2);
    }

    @Override // p060j$.util.stream.InterfaceC10504E0, p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10318M spliterator() {
        return AbstractC10368e0.m940j(this.f21068a, 0, this.f21069b);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10321P spliterator() {
        return AbstractC10368e0.m940j(this.f21068a, 0, this.f21069b);
    }

    public String toString() {
        double[] dArr = this.f21068a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f21069b), Arrays.toString(dArr));
    }
}
