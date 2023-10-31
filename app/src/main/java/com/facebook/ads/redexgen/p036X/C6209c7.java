package com.facebook.ads.redexgen.p036X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.c7 */
/* loaded from: assets/audience_network.dex */
public class C6209c7 implements InterfaceC42044s {
    public final /* synthetic */ C4804F9 A00;

    public C6209c7(C4804F9 c4804f9) {
        this.A00 = c4804f9;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42044s
    public final void ADL(AbstractC41974l abstractC41974l, C41744O c41744o, C41744O c41744o2) {
        this.A00.A1n(abstractC41974l, c41744o, c41744o2);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42044s
    public final void ADN(AbstractC41974l abstractC41974l, @NonNull C41744O c41744o, @Nullable C41744O c41744o2) {
        this.A00.A0r.A0c(abstractC41974l);
        this.A00.A1o(abstractC41974l, c41744o, c41744o2);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42044s
    public final void ADP(AbstractC41974l abstractC41974l, @NonNull C41744O c41744o, @NonNull C41744O c41744o2) {
        abstractC41974l.A0Z(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(abstractC41974l, abstractC41974l, c41744o, c41744o2)) {
                this.A00.A1N();
            }
        } else if (!this.A00.A05.A0G(abstractC41974l, c41744o, c41744o2)) {
        } else {
            this.A00.A1N();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42044s
    public final void AFJ(AbstractC41974l abstractC41974l) {
        this.A00.A06.A1D(abstractC41974l.A0H, this.A00.A0r);
    }
}
