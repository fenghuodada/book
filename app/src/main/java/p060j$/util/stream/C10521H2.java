package p060j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: j$.util.stream.H2 */
/* loaded from: classes2.dex */
final class C10521H2 extends AbstractC10704v2 {

    /* renamed from: d */
    private Object[] f21008d;

    /* renamed from: e */
    private int f21009e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10521H2(InterfaceC10634h2 interfaceC10634h2, Comparator comparator) {
        super(interfaceC10634h2, comparator);
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f21008d;
        int i = this.f21009e;
        this.f21009e = i + 1;
        objArr[i] = obj;
    }

    @Override // p060j$.util.stream.AbstractC10614d2, p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f21008d, 0, this.f21009e, this.f21279b);
        InterfaceC10634h2 interfaceC10634h2 = this.f21154a;
        interfaceC10634h2.mo531g(this.f21009e);
        if (this.f21280c) {
            while (i < this.f21009e && !interfaceC10634h2.mo530i()) {
                interfaceC10634h2.accept(this.f21008d[i]);
                i++;
            }
        } else {
            while (i < this.f21009e) {
                interfaceC10634h2.accept(this.f21008d[i]);
                i++;
            }
        }
        interfaceC10634h2.end();
        this.f21008d = null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21008d = new Object[(int) j];
    }
}
