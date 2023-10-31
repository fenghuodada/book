package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.38 */
/* loaded from: assets/audience_network.dex */
public final class C409838 {
    public static final C409737 A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C39300O() { // from class: com.facebook.ads.redexgen.X.04
            };
        } else if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C39300O();
        } else if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C39400Y();
        } else if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C39420a();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C39450d();
        } else if (Build.VERSION.SDK_INT >= 18) {
            A00 = new C40091g();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A00 = new C41213W();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C4813FI();
        } else if (Build.VERSION.SDK_INT >= 15) {
            A00 = new C6225cO();
        } else {
            A00 = new C409737();
        }
    }

    public static int A00(View view) {
        return A00.A03(view);
    }

    public static int A01(View view) {
        return A00.A04(view);
    }

    public static int A02(View view) {
        return A00.A05(view);
    }

    public static int A03(View view) {
        return A00.A06(view);
    }

    public static Display A04(@NonNull View view) {
        return A00.A07(view);
    }

    public static C41143P A05(View view, C41143P c41143p) {
        return A00.A08(view, c41143p);
    }

    public static C41143P A06(View view, C41143P c41143p) {
        return A00.A09(view, c41143p);
    }

    public static void A07(View view) {
        A00.A0A(view);
    }

    public static void A08(@NonNull View view) {
        A00.A0B(view);
    }

    public static void A09(View view, int i) {
        A00.A0C(view, i);
    }

    public static void A0A(View view, Drawable drawable) {
        A00.A0D(view, drawable);
    }

    public static void A0B(View view, C40762m c40762m) {
        A00.A0E(view, c40762m);
    }

    public static void A0C(View view, InterfaceC40822s interfaceC40822s) {
        A00.A0F(view, interfaceC40822s);
    }

    public static void A0D(View view, Runnable runnable) {
        A00.A0G(view, runnable);
    }

    public static void A0E(View view, Runnable runnable, long j) {
        A00.A0H(view, runnable, j);
    }

    public static boolean A0F(View view) {
        return A00.A0K(view);
    }

    public static boolean A0G(View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(View view) {
        return A00.A0J(view);
    }
}
