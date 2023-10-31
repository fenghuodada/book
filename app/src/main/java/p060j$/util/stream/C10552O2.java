package p060j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10315J;
import p060j$.util.function.C10426e0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.O2 */
/* loaded from: classes2.dex */
public class C10552O2 extends AbstractC10560Q2 implements InterfaceC10432h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10552O2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10552O2(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void m791a(Consumer consumer) {
        if (consumer instanceof InterfaceC10432h0) {
            mo653f((InterfaceC10432h0) consumer);
        } else if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    public void accept(long j) {
        m775y();
        int i = this.f21157b;
        this.f21157b = i + 1;
        ((long[]) this.f21062e)[i] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC10368e0.m942h(spliterator());
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // p060j$.util.stream.AbstractC10560Q2
    public final Object newArray(int i) {
        return new long[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10560Q2
    /* renamed from: t */
    public final void mo780t(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        InterfaceC10432h0 interfaceC10432h0 = (InterfaceC10432h0) obj2;
        while (i < i2) {
            interfaceC10432h0.accept(jArr[i]);
            i++;
        }
    }

    public final String toString() {
        long[] jArr = (long[]) mo655c();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f21158c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f21158c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10560Q2
    /* renamed from: u */
    public final int mo779u(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // p060j$.util.stream.AbstractC10560Q2
    /* renamed from: x */
    protected final Object[] mo776x() {
        return new long[8];
    }

    @Override // p060j$.util.stream.AbstractC10560Q2, java.lang.Iterable
    /* renamed from: z */
    public InterfaceC10315J spliterator() {
        return new C10548N2(this, 0, this.f21158c, 0, this.f21157b);
    }
}
