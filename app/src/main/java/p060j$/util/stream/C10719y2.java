package p060j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.y2 */
/* loaded from: classes2.dex */
final class C10719y2 extends AbstractC10699u2 {

    /* renamed from: c */
    private C10552O2 f21312c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10719y2(InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
    }

    @Override // p060j$.util.stream.InterfaceC10629g2, p060j$.util.stream.InterfaceC10634h2
    public final void accept(long j) {
        this.f21312c.accept(j);
    }

    @Override // p060j$.util.stream.AbstractC10609c2, p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        long[] jArr = (long[]) this.f21312c.mo655c();
        Arrays.sort(jArr);
        InterfaceC10634h2 interfaceC10634h2 = this.f21150a;
        interfaceC10634h2.mo531g(jArr.length);
        int i = 0;
        if (this.f21273b) {
            int length = jArr.length;
            while (i < length) {
                long j = jArr[i];
                if (interfaceC10634h2.mo530i()) {
                    break;
                }
                interfaceC10634h2.accept(j);
                i++;
            }
        } else {
            int length2 = jArr.length;
            while (i < length2) {
                interfaceC10634h2.accept(jArr[i]);
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
        this.f21312c = j > 0 ? new C10552O2((int) j) : new C10552O2();
    }
}
