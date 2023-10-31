package com.facebook.ads.redexgen.p036X;

import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.V6 */
/* loaded from: assets/audience_network.dex */
public final class C5778V6 implements InterfaceC4954Hd {
    public final Context A00;
    public final InterfaceC4954Hd A01;
    public final InterfaceC4977I0<? super InterfaceC4955He> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C5778V6(Context context, InterfaceC4977I0<? super InterfaceC4955He> interfaceC4977I0, InterfaceC4954Hd interfaceC4954Hd) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC4977I0;
        this.A01 = interfaceC4954Hd;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C5778V6(Context context, String str, InterfaceC4977I0<? super InterfaceC4955He> interfaceC4977I0) {
        this(context, interfaceC4977I0, new C40522N(str, interfaceC4977I0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4954Hd
    /* renamed from: A00 */
    public final C5779V7 A4E() {
        return new C5779V7(this.A00, this.A02, this.A01.A4E());
    }
}
