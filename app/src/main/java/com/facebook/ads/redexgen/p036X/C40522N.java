package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.2N */
/* loaded from: assets/audience_network.dex */
public final class C40522N extends AbstractC4587BJ {
    public final int A00;
    public final int A01;
    public final InterfaceC4977I0<? super InterfaceC4955He> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C40522N(String str, InterfaceC4977I0<? super InterfaceC4955He> interfaceC4977I0) {
        this(str, interfaceC4977I0, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C40522N(String str, InterfaceC4977I0<? super InterfaceC4955He> interfaceC4977I0, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = interfaceC4977I0;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC4587BJ
    /* renamed from: A00 */
    public final C4604Ba A01(C4966Hp c4966Hp) {
        return new C4604Ba(this.A03, null, this.A02, this.A00, this.A01, this.A04, c4966Hp);
    }
}
