package com.facebook.ads.redexgen.p036X;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.5G */
/* loaded from: assets/audience_network.dex */
public final class C42285G {
    public static InterfaceC39330R A00(Context context, InterfaceC44168W interfaceC44168W) {
        C5952Xx sdkContext = A07(context);
        InterfaceC39360U A6i = interfaceC44168W.A6i(sdkContext);
        if (A6i != null) {
            return A6i.A9T();
        }
        return new C6314dq();
    }

    public static C5953Xy A01(Activity activity) {
        return new C5953Xy(activity, A08(), A00(activity, A08()));
    }

    public static C5953Xy A02(Context context) {
        return new C5953Xy(context, A08(), new C6314dq());
    }

    public static C5953Xy A03(Context context) {
        return new C5953Xy(context, A08(), A00(context, A08()));
    }

    public static C5953Xy A04(Context context) {
        if (C5064JR.A0o(context)) {
            return new C5953Xy(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static C5953Xy A05(Context context) {
        return new C5953Xy(context, A08(), A00(context, A08()));
    }

    public static C4780El A06(Context context) {
        return new C4780El(context, A08(), A08().A6i(A07(context)));
    }

    public static C5952Xx A07(Context context) {
        return new C5952Xx(context, A08());
    }

    public static synchronized InterfaceC44168W A08() {
        C5925XW A02;
        synchronized (C42285G.class) {
            A02 = C5925XW.A02();
        }
        return A02;
    }
}
