package p060j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.w2 */
/* loaded from: classes2.dex */
final class C10709w2 extends AbstractC10689s2 {

    /* renamed from: c */
    private C10536K2 f21299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10709w2(InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
    }

    @Override // p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        this.f21299c.accept(d);
    }

    @Override // p060j$.util.stream.AbstractC10599a2, p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        double[] dArr = (double[]) this.f21299c.mo655c();
        Arrays.sort(dArr);
        InterfaceC10634h2 interfaceC10634h2 = this.f21132a;
        interfaceC10634h2.mo531g(dArr.length);
        int i = 0;
        if (this.f21260b) {
            int length = dArr.length;
            while (i < length) {
                double d = dArr[i];
                if (interfaceC10634h2.mo530i()) {
                    break;
                }
                interfaceC10634h2.accept(d);
                i++;
            }
        } else {
            int length2 = dArr.length;
            while (i < length2) {
                interfaceC10634h2.accept(dArr[i]);
                i++;
            }
        }
        interfaceC10634h2.end();
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21299c = j > 0 ? new C10536K2((int) j) : new C10536K2();
    }
}
