package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4O */
/* loaded from: assets/audience_network.dex */
public class C41744O {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C41744O A00(AbstractC41974l abstractC41974l, int i) {
        View view = abstractC41974l.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C41744O A01(AbstractC41974l abstractC41974l) {
        return A00(abstractC41974l, 0);
    }
}
