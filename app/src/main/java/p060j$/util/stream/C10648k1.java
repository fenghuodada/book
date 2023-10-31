package p060j$.util.stream;

import java.util.Arrays;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10432h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k1 */
/* loaded from: classes2.dex */
public class C10648k1 implements InterfaceC10499D0 {

    /* renamed from: a */
    final long[] f21196a;

    /* renamed from: b */
    int f21197b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10648k1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21196a = new long[(int) j];
        this.f21197b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10648k1(long[] jArr) {
        this.f21196a = jArr;
        this.f21197b = jArr.length;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final /* synthetic */ void mo621a(Consumer consumer) {
        AbstractC10707w0.m593G0(this, consumer);
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
        long[] jArr = this.f21196a;
        int length = jArr.length;
        int i = this.f21197b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final long count() {
        return this.f21197b;
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: d */
    public final void mo654d(Object obj, int i) {
        int i2 = this.f21197b;
        System.arraycopy(this.f21196a, 0, (long[]) obj, i, i2);
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: f */
    public final void mo653f(Object obj) {
        InterfaceC10432h0 interfaceC10432h0 = (InterfaceC10432h0) obj;
        for (int i = 0; i < this.f21197b; i++) {
            interfaceC10432h0.accept(this.f21196a[i]);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: n */
    public final /* synthetic */ void mo619k(Long[] lArr, int i) {
        AbstractC10707w0.m596D0(this, lArr, i);
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

    @Override // p060j$.util.stream.InterfaceC10504E0, p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10318M spliterator() {
        return AbstractC10368e0.m938l(this.f21196a, 0, this.f21197b);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10321P spliterator() {
        return AbstractC10368e0.m938l(this.f21196a, 0, this.f21197b);
    }

    public String toString() {
        long[] jArr = this.f21196a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f21197b), Arrays.toString(jArr));
    }
}
