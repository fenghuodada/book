package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: com.facebook.ads.redexgen.X.3i */
/* loaded from: assets/audience_network.dex */
public final class C41333i {
    public static final C41323h A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C6216cE();
        } else {
            A00 = new C41323h();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f, float f2) {
        A00.A00(edgeEffect, f, f2);
    }
}
