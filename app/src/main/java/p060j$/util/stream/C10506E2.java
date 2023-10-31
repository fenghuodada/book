package p060j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.E2 */
/* loaded from: classes2.dex */
final class C10506E2 extends AbstractC10689s2 {

    /* renamed from: c */
    private double[] f20981c;

    /* renamed from: d */
    private int f20982d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10506E2(InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
    }

    @Override // p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        double[] dArr = this.f20981c;
        int i = this.f20982d;
        this.f20982d = i + 1;
        dArr[i] = d;
    }

    @Override // p060j$.util.stream.AbstractC10599a2, p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f20981c, 0, this.f20982d);
        InterfaceC10634h2 interfaceC10634h2 = this.f21132a;
        interfaceC10634h2.mo531g(this.f20982d);
        if (this.f21260b) {
            while (i < this.f20982d && !interfaceC10634h2.mo530i()) {
                interfaceC10634h2.accept(this.f20981c[i]);
                i++;
            }
        } else {
            while (i < this.f20982d) {
                interfaceC10634h2.accept(this.f20981c[i]);
                i++;
            }
        }
        interfaceC10634h2.end();
        this.f20981c = null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20981c = new double[(int) j];
    }
}
