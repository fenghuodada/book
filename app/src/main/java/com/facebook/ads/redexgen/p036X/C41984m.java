package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4m */
/* loaded from: assets/audience_network.dex */
public final class C41984m {
    public static String[] A00 = {"UqypfisWbLbbWLDfIVvpiaUsz0iS", "wEiCJDeLGzLJebV", "cX", "dRMEhdR7kDOm9Ob", "SmhGT229bW5LAFpAZzaxeRYqKvMDeGhX", "QcSoUKFtoryhyFMFYIfDI81ChPsDlMu7", "SBvSWfqovIH0ljTVzoffsyrdWCNw", "n"};

    public static int A00(C41944i c41944i, AbstractC41634D abstractC41634D, View view, View view2, AbstractC41794T abstractC41794T, boolean z) {
        if (abstractC41794T.A0W() == 0 || c41944i.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC41794T.A0p(view) - abstractC41794T.A0p(view2)) + 1;
        }
        int A0C = abstractC41634D.A0C(view2);
        int A0F = abstractC41634D.A0F(view);
        String[] strArr = A00;
        if (strArr[4].charAt(28) != strArr[5].charAt(28)) {
            String[] strArr2 = A00;
            strArr2[3] = "xd2oZUwi45Npmqe";
            strArr2[1] = "1k2xoHfklbXXQiR";
            return Math.min(abstractC41634D.A0B(), A0C - A0F);
        }
        throw new RuntimeException();
    }

    public static int A01(C41944i c41944i, AbstractC41634D abstractC41634D, View view, View view2, AbstractC41794T abstractC41794T, boolean z) {
        if (abstractC41794T.A0W() == 0 || c41944i.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c41944i.A03();
        }
        return (int) (((abstractC41634D.A0C(view2) - abstractC41634D.A0F(view)) / (Math.abs(abstractC41794T.A0p(view) - abstractC41794T.A0p(view2)) + 1)) * c41944i.A03());
    }

    public static int A02(C41944i c41944i, AbstractC41634D abstractC41634D, View view, View view2, AbstractC41794T abstractC41794T, boolean z, boolean z2) {
        int max;
        if (abstractC41794T.A0W() != 0) {
            int A03 = c41944i.A03();
            String[] strArr = A00;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[6] = "xSzU3PMpL9LC7k2G9V08vNIV3nIP";
            strArr2[0] = "UsrmTbcEPDcBULmsiiLKltF5MwgK";
            if (A03 != 0 && view != null && view2 != null) {
                int min = Math.min(abstractC41794T.A0p(view), abstractC41794T.A0p(view2));
                int max2 = Math.max(abstractC41794T.A0p(view), abstractC41794T.A0p(view2));
                if (z2) {
                    max = Math.max(0, (c41944i.A03() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z) {
                    return max;
                }
                return Math.round((max * (Math.abs(abstractC41634D.A0C(view2) - abstractC41634D.A0F(view)) / (Math.abs(abstractC41794T.A0p(view) - abstractC41794T.A0p(view2)) + 1))) + (abstractC41634D.A0A() - abstractC41634D.A0F(view)));
            }
        }
        return 0;
    }
}
