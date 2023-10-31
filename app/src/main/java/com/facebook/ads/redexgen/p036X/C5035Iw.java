package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: com.facebook.ads.redexgen.X.Iw */
/* loaded from: assets/audience_network.dex */
public final class C5035Iw {
    public static void A00() {
        if (C5038Iz.A02 >= 18) {
            A01();
        }
    }

    @TargetApi(18)
    public static void A01() {
        Trace.endSection();
    }

    public static void A02(String str) {
        if (C5038Iz.A02 >= 18) {
            A03(str);
        }
    }

    @TargetApi(18)
    public static void A03(String str) {
        Trace.beginSection(str);
    }
}
