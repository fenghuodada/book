package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.bV */
/* loaded from: assets/audience_network.dex */
public class C6172bV implements InterfaceC42405S {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C42425U A01;
    public final /* synthetic */ C5721UB A02;

    public C6172bV(C42425U c42425u, ImageView imageView, C5721UB c5721ub) {
        this.A01 = c42425u;
        this.A00 = imageView;
        this.A02 = c5721ub;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42405S
    public final void AAy(@Nullable Drawable drawable) {
        C5721UB.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
