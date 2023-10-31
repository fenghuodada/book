package com.facebook.ads.redexgen.p036X;

import android.graphics.Rect;

/* renamed from: com.facebook.ads.redexgen.X.Ud */
/* loaded from: assets/audience_network.dex */
public final class C5749Ud implements InterfaceC5069JW {
    public static String[] A02 = {"AMQNzlG2eGPOJo74lPpddO6twtMEce", "8uZuLGh3CZSzV4eSaK74M9a8aAW81o1g", "CYs8BZmCr6kO5jRRUq4laItl384RlovT", "PO4hUmmCpilEicL1R3sLdD9hI0Kiey5Z", "WmgRsP13YsLJamj9MMjVCco3tjnpIVCq", "0ErvOAeoLZJf3MJzf6jF5Cw5BrHPqp", "S0kgbIpbc64QMPj8XCJtTK8zDrzNpUnW", "MO6xPizLQkqntlkNHRrNVg7dZ2stU5UP"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C6349eU<C5070JX, C5075Jc> c6349eU) {
        if (c6349eU.A01.A05()) {
            return c6349eU.A02.A07();
        }
        if (!c6349eU.A01.A06()) {
            return true;
        }
        C5075Jc c5075Jc = c6349eU.A02;
        String[] strArr = A02;
        if (strArr[3].charAt(7) != strArr[2].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "8O0EOVeCMdEJdeSbYPFIeNjJXhTUSITs";
        strArr2[2] = "Km62DwbCV8Ma1ecjtuIU72b1y8KakI9d";
        return c5075Jc.A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    private boolean A01(C6349eU<C5070JX, C5075Jc> c6349eU, InterfaceC6338eJ interfaceC6338eJ) {
        float f = -1.0f;
        try {
            f = interfaceC6338eJ.A7r(c6349eU);
        } catch (IllegalStateException unused) {
        }
        if (f <= 0.0f || !A00(c6349eU)) {
            if (c6349eU.A01.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c6349eU)) {
                return true;
            }
            interfaceC6338eJ.A7q(this.A00);
            interfaceC6338eJ.A6j(c6349eU, this.A01);
            return (this.A00.bottom - this.A00.top > 0 && this.A01.bottom - this.A00.top > 0) && A00(c6349eU);
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C6349eU<C5070JX, C5075Jc> c6349eU, InterfaceC6338eJ interfaceC6338eJ) {
        if (c6349eU.A02.A04() && A01(c6349eU, interfaceC6338eJ)) {
            c6349eU.A02.A01();
            c6349eU.A01.A02().A9G(c6349eU.A01.A03(), c6349eU.A01.A04());
        }
        if (c6349eU.A02.A05() && C5064JR.A16(c6349eU.A01.A01())) {
            c6349eU.A02.A02();
            c6349eU.A01.A02().A95(c6349eU.A01.A03(), c6349eU.A01.A04());
        }
    }
}
