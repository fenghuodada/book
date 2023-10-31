package p060j$.util.stream;

import java.util.Arrays;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b1 */
/* loaded from: classes2.dex */
public class C10603b1 implements InterfaceC10494C0 {

    /* renamed from: a */
    final int[] f21135a;

    /* renamed from: b */
    int f21136b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10603b1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21135a = new int[(int) j];
        this.f21136b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10603b1(int[] iArr) {
        this.f21135a = iArr;
        this.f21136b = iArr.length;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final /* synthetic */ void mo621a(Consumer consumer) {
        AbstractC10707w0.m594F0(this, consumer);
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
        int[] iArr = this.f21135a;
        int length = iArr.length;
        int i = this.f21136b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final long count() {
        return this.f21136b;
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: d */
    public final void mo654d(Object obj, int i) {
        int i2 = this.f21136b;
        System.arraycopy(this.f21135a, 0, (int[]) obj, i, i2);
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: f */
    public final void mo653f(Object obj) {
        InterfaceC10391K interfaceC10391K = (InterfaceC10391K) obj;
        for (int i = 0; i < this.f21136b; i++) {
            interfaceC10391K.accept(this.f21135a[i]);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: j */
    public final /* synthetic */ void mo619k(Integer[] numArr, int i) {
        AbstractC10707w0.m597C0(this, numArr, i);
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
        return AbstractC10707w0.m591I0(this, j, j2);
    }

    @Override // p060j$.util.stream.InterfaceC10504E0, p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10318M spliterator() {
        return AbstractC10368e0.m939k(this.f21135a, 0, this.f21136b);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10321P spliterator() {
        return AbstractC10368e0.m939k(this.f21135a, 0, this.f21136b);
    }

    public String toString() {
        int[] iArr = this.f21135a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f21136b), Arrays.toString(iArr));
    }
}
