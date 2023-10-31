package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.V2 */
/* loaded from: assets/audience_network.dex */
public final class C5774V2 implements InterfaceC4954Hd {
    public final InterfaceC4977I0<? super C5775V3> A00;

    public C5774V2() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C5774V2(InterfaceC4977I0<? super C5775V3> interfaceC4977I0) {
        this.A00 = interfaceC4977I0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4954Hd
    public final InterfaceC4955He A4E() {
        return new C5775V3(this.A00);
    }
}
