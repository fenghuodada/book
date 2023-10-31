package com.facebook.ads.redexgen.p036X;

import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.Ye */
/* loaded from: assets/audience_network.dex */
public class C5995Ye implements InterfaceC43306v {
    public static String[] A01 = {"1jYE18OinQfv5WLTq2cVBe585KmN", "X325BmovX2W2cAXv5JjOdne9uqamI6Ku", "itArcmOQ038W2qOxTmWDysJ", "YLO301mgb0CV", "8Iuh4U1kakUbsQ2Nn", "O3ZH7jI89PddtJoXg7iV4O6wtsqjtnrU", "1x9H6MAyleaM4oP8QSazbLvKby53Pv0n", "YmZygv2VfDGVkOFuuIE9CAITaRVNY9b1"};
    public final /* synthetic */ C5982YR A00;

    public C5995Ye(C5982YR c5982yr) {
        this.A00 = c5982yr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        telephonyManager = this.A00.A00;
        if (telephonyManager != null) {
            C5982YR c5982yr = this.A00;
            telephonyManager2 = c5982yr.A00;
            String simCountryIso = telephonyManager2.getSimCountryIso();
            String[] strArr = A01;
            if (strArr[6].charAt(3) != strArr[5].charAt(3)) {
                throw new RuntimeException();
            }
            A01[2] = "tduom2IhCerqtA7iCB";
            return c5982yr.A08(simCountryIso);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
