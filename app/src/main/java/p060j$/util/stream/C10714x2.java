package p060j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.x2 */
/* loaded from: classes2.dex */
final class C10714x2 extends AbstractC10694t2 {

    /* renamed from: c */
    private C10544M2 f21306c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10714x2(InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
    }

    @Override // p060j$.util.stream.InterfaceC10624f2, p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        this.f21306c.accept(i);
    }

    @Override // p060j$.util.stream.AbstractC10604b2, p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        int[] iArr = (int[]) this.f21306c.mo655c();
        Arrays.sort(iArr);
        InterfaceC10634h2 interfaceC10634h2 = this.f21137a;
        interfaceC10634h2.mo531g(iArr.length);
        int i = 0;
        if (this.f21266b) {
            int length = iArr.length;
            while (i < length) {
                int i2 = iArr[i];
                if (interfaceC10634h2.mo530i()) {
                    break;
                }
                interfaceC10634h2.accept(i2);
                i++;
            }
        } else {
            int length2 = iArr.length;
            while (i < length2) {
                interfaceC10634h2.accept(iArr[i]);
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
        this.f21306c = j > 0 ? new C10544M2((int) j) : new C10544M2();
    }
}
