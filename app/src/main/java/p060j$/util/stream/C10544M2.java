package p060j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10312G;
import p060j$.util.function.C10385H;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.M2 */
/* loaded from: classes2.dex */
public class C10544M2 extends AbstractC10560Q2 implements InterfaceC10391K {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10544M2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10544M2(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void m794a(Consumer consumer) {
        if (consumer instanceof InterfaceC10391K) {
            mo653f((InterfaceC10391K) consumer);
        } else if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // p060j$.util.function.InterfaceC10391K
    public void accept(int i) {
        m775y();
        int i2 = this.f21157b;
        this.f21157b = i2 + 1;
        ((int[]) this.f21062e)[i2] = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC10368e0.m943g(spliterator());
    }

    @Override // p060j$.util.stream.AbstractC10560Q2
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10560Q2
    /* renamed from: t */
    public final void mo780t(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        InterfaceC10391K interfaceC10391K = (InterfaceC10391K) obj2;
        while (i < i2) {
            interfaceC10391K.accept(iArr[i]);
            i++;
        }
    }

    public final String toString() {
        int[] iArr = (int[]) mo655c();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f21158c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f21158c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10560Q2
    /* renamed from: u */
    public final int mo779u(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // p060j$.util.stream.AbstractC10560Q2
    /* renamed from: x */
    protected final Object[] mo776x() {
        return new int[8];
    }

    @Override // p060j$.util.stream.AbstractC10560Q2, java.lang.Iterable
    /* renamed from: z */
    public InterfaceC10312G spliterator() {
        return new C10540L2(this, 0, this.f21158c, 0, this.f21157b);
    }
}
