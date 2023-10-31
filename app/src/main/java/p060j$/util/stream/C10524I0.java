package p060j$.util.stream;

import java.util.Arrays;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.I0 */
/* loaded from: classes2.dex */
public class C10524I0 implements InterfaceC10509F0 {

    /* renamed from: a */
    final Object[] f21010a;

    /* renamed from: b */
    int f21011b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10524I0(long j, InterfaceC10397N interfaceC10397N) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21010a = (Object[]) interfaceC10397N.apply((int) j);
        this.f21011b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10524I0(Object[] objArr) {
        this.f21010a = objArr;
        this.f21011b = objArr.length;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final void mo621a(Consumer consumer) {
        for (int i = 0; i < this.f21011b; i++) {
            consumer.accept(this.f21010a[i]);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: b */
    public final InterfaceC10509F0 mo620b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final long count() {
        return this.f21011b;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: k */
    public final void mo619k(Object[] objArr, int i) {
        System.arraycopy(this.f21010a, 0, objArr, i, this.f21011b);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: p */
    public final /* synthetic */ int mo618p() {
        return 0;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: r */
    public final Object[] mo617r(InterfaceC10397N interfaceC10397N) {
        Object[] objArr = this.f21010a;
        if (objArr.length == this.f21011b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: s */
    public final /* synthetic */ InterfaceC10509F0 mo616s(long j, long j2, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m589K0(this, j, j2, interfaceC10397N);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10321P spliterator() {
        return AbstractC10368e0.m937m(this.f21010a, 0, this.f21011b);
    }

    public String toString() {
        Object[] objArr = this.f21010a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f21011b), Arrays.toString(objArr));
    }
}
