package p060j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10309D;
import p060j$.util.function.C10437k;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.K2 */
/* loaded from: classes2.dex */
public class C10536K2 extends AbstractC10560Q2 implements InterfaceC10443n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10536K2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10536K2(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void m798a(Consumer consumer) {
        if (consumer instanceof InterfaceC10443n) {
            mo653f((InterfaceC10443n) consumer);
        } else if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // p060j$.util.function.InterfaceC10443n
    public void accept(double d) {
        m775y();
        int i = this.f21157b;
        this.f21157b = i + 1;
        ((double[]) this.f21062e)[i] = d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC10368e0.m944f(spliterator());
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }

    @Override // p060j$.util.stream.AbstractC10560Q2
    public final Object newArray(int i) {
        return new double[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10560Q2
    /* renamed from: t */
    public final void mo780t(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        InterfaceC10443n interfaceC10443n = (InterfaceC10443n) obj2;
        while (i < i2) {
            interfaceC10443n.accept(dArr[i]);
            i++;
        }
    }

    public final String toString() {
        double[] dArr = (double[]) mo655c();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f21158c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f21158c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10560Q2
    /* renamed from: u */
    public final int mo779u(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // p060j$.util.stream.AbstractC10560Q2
    /* renamed from: x */
    protected final Object[] mo776x() {
        return new double[8];
    }

    @Override // p060j$.util.stream.AbstractC10560Q2, java.lang.Iterable
    /* renamed from: z */
    public InterfaceC10309D spliterator() {
        return new C10531J2(this, 0, this.f21158c, 0, this.f21157b);
    }
}
