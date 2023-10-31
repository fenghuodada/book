package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.3R */
/* loaded from: assets/audience_network.dex */
public final class C41163R {
    public static final C41153Q A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C4811FG();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C6221cJ();
        } else {
            A00 = new C41153Q();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}
