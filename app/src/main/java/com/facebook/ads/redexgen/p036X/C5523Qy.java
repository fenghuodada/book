package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qy */
/* loaded from: assets/audience_network.dex */
public final class C5523Qy {
    public static boolean A00(View view) {
        return view.getBackground() == null || (Build.VERSION.SDK_INT >= 19 && view.getBackground().getAlpha() <= 0);
    }
}
