package p060j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.G2 */
/* loaded from: classes2.dex */
final class C10516G2 extends AbstractC10699u2 {

    /* renamed from: c */
    private long[] f20996c;

    /* renamed from: d */
    private int f20997d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10516G2(InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
    }

    @Override // p060j$.util.stream.InterfaceC10629g2, p060j$.util.stream.InterfaceC10634h2
    public final void accept(long j) {
        long[] jArr = this.f20996c;
        int i = this.f20997d;
        this.f20997d = i + 1;
        jArr[i] = j;
    }

    @Override // p060j$.util.stream.AbstractC10609c2, p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f20996c, 0, this.f20997d);
        InterfaceC10634h2 interfaceC10634h2 = this.f21150a;
        interfaceC10634h2.mo531g(this.f20997d);
        if (this.f21273b) {
            while (i < this.f20997d && !interfaceC10634h2.mo530i()) {
                interfaceC10634h2.accept(this.f20996c[i]);
                i++;
            }
        } else {
            while (i < this.f20997d) {
                interfaceC10634h2.accept(this.f20996c[i]);
                i++;
            }
        }
        interfaceC10634h2.end();
        this.f20996c = null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20996c = new long[(int) j];
    }
}
