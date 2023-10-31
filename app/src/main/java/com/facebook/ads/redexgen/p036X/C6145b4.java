package com.facebook.ads.redexgen.p036X;

import android.app.ActivityManager;

/* renamed from: com.facebook.ads.redexgen.X.b4 */
/* loaded from: assets/audience_network.dex */
public class C6145b4 implements InterfaceC43306v {
    public static String[] A01 = {"ks6FgoJovve7iHM2pZkl", "wha53u", "49wSJ7V8XkDKZTUcjMDnpoSn", "1JQ5I5ad77Yrp3ewkirQ0oRutiEmvr6i", "jAt3ZHaaMbDXz0fIQiir7V", "EKdcAjdCbYFTR4bnYqi4SV", "MwtlcC", "w1RouBmka6J1zGDRhikmrfItH78owLWg"};
    public final /* synthetic */ C6134at A00;

    public C6145b4(C6134at c6134at) {
        this.A00 = c6134at;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ActivityManager activityManager;
        activityManager = this.A00.A02;
        if (activityManager != null) {
            return this.A00.A0F(ActivityManager.isUserAMonkey());
        }
        C6134at c6134at = this.A00;
        EnumC434176 enumC434176 = EnumC434176.A07;
        if (A01[2].length() != 23) {
            String[] strArr = A01;
            strArr[3] = "MHidzBjnmsHNQkooJipxy3AaWgleVPOv";
            strArr[7] = "EW2Ra62KpqEXQLSIkiFDqiivYFqdEGvM";
            return c6134at.A07(enumC434176);
        }
        throw new RuntimeException();
    }
}
