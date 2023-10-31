package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.by */
/* loaded from: assets/audience_network.dex */
public final class C6201by extends C40762m {
    public static String[] A02 = {"kCJseLSqSIrXu4CFjUZgH7qP37OfZeHD", "xEAmwUG5TGVzyoKH1PTTnmgJSds6zi0t", "yfye5wiKddzXjwKpYSAHRZ10SdbOyGIS", "FmBYeFx3U0BhjOzbepjZtX", "pFd99JFbVQiCxR8NKRmLZvqZPwpJ8hMq", "9sA", "zOMSQIOQC2uzgyYA4i3GoXbtL5yC1N4Y", "6JUJmYz6"};
    public final C40762m A00 = new C6202bz(this);
    public final C4804F9 A01;

    public C6201by(C4804F9 c4804f9) {
        this.A01 = c4804f9;
    }

    @Override // com.facebook.ads.redexgen.p036X.C40762m
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C4804F9.class.getName());
        if ((view instanceof C4804F9) && !A0B()) {
            C4804F9 c4804f9 = (C4804F9) view;
            if (c4804f9.getLayoutManager() != null) {
                c4804f9.getLayoutManager().A1x(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.C40762m
    public final void A08(View view, C41223X c41223x) {
        super.A08(view, c41223x);
        c41223x.A0O(C4804F9.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c41223x);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.C40762m
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[0].charAt(11)) {
                throw new RuntimeException();
            }
            A02[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            return true;
        } else if (!A0B() && this.A01.getLayoutManager() != null) {
            AbstractC41794T layoutManager = this.A01.getLayoutManager();
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "ZdbAAVtg";
            strArr2[3] = "rBKlzqXoYmUf6BYv0O8fT1";
            return layoutManager.A1Z(i, bundle);
        } else {
            return false;
        }
    }

    public final C40762m A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1t();
    }
}
