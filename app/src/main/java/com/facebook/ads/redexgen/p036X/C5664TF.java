package com.facebook.ads.redexgen.p036X;

import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.TF */
/* loaded from: assets/audience_network.dex */
public class C5664TF implements InterfaceC5341O1 {
    public final /* synthetic */ C5332Ns A00;

    public C5664TF(C5332Ns c5332Ns) {
        this.A00 = c5332Ns;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5341O1
    public final void AAA(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A07;
        if (z2) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5341O1
    public final void AAp(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A07;
        if (z2) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }
}
