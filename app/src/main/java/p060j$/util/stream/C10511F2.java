package p060j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.F2 */
/* loaded from: classes2.dex */
final class C10511F2 extends AbstractC10694t2 {

    /* renamed from: c */
    private int[] f20988c;

    /* renamed from: d */
    private int f20989d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10511F2(InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
    }

    @Override // p060j$.util.stream.InterfaceC10624f2, p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        int[] iArr = this.f20988c;
        int i2 = this.f20989d;
        this.f20989d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // p060j$.util.stream.AbstractC10604b2, p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f20988c, 0, this.f20989d);
        InterfaceC10634h2 interfaceC10634h2 = this.f21137a;
        interfaceC10634h2.mo531g(this.f20989d);
        if (this.f21266b) {
            while (i < this.f20989d && !interfaceC10634h2.mo530i()) {
                interfaceC10634h2.accept(this.f20988c[i]);
                i++;
            }
        } else {
            while (i < this.f20989d) {
                interfaceC10634h2.accept(this.f20988c[i]);
                i++;
            }
        }
        interfaceC10634h2.end();
        this.f20988c = null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20988c = new int[(int) j];
    }
}
