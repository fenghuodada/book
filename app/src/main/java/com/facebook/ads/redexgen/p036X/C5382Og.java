package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Og */
/* loaded from: assets/audience_network.dex */
public final class C5382Og {
    public static AbstractC5381Of A00(C5385Oj c5385Oj, @Nullable Bundle bundle, boolean z) {
        AbstractC5381Of c5642St;
        C39781B A0O = c5385Oj.A04().A0O();
        double A00 = C5380Oe.A00(A0O);
        boolean isWatchAndBrowse = c5385Oj.A04().A0O().A0N();
        boolean isVideo = C5380Oe.A05(c5385Oj.A00(), c5385Oj.A01(), A00);
        AbstractC39470f A002 = C39480g.A00(c5385Oj.A05(), c5385Oj.A06(), "", C5191La.A00(c5385Oj.A04().A0O().A0F().A05()), new HashMap());
        boolean z2 = !TextUtils.isEmpty(A0O.A0D().A08());
        if (C5064JR.A1I(c5385Oj.A05())) {
            c5385Oj.A05().A09().AFP(c5385Oj.A02(), c5385Oj.A04().A0U(), z2);
        }
        if (isWatchAndBrowse && (A002 instanceof C4857G0)) {
            c5642St = new C5635Sm(c5385Oj);
        } else if (z2) {
            c5642St = new C4516A9(c5385Oj);
        } else if (!z2 && C5064JR.A1q(c5385Oj.A05())) {
            c5642St = new C4517AA(c5385Oj, isVideo);
        } else if (isVideo) {
            c5642St = new C5644Sv(c5385Oj, c5385Oj.A00() == 2);
        } else {
            c5642St = new C5642St(c5385Oj, C5380Oe.A03(A00));
        }
        if (z) {
            c5642St.A0b(A0O, c5385Oj.A04().A0U(), A00, bundle);
        }
        return c5642St;
    }
}
