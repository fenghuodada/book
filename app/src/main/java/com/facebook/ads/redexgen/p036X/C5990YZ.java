package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.YZ */
/* loaded from: assets/audience_network.dex */
public class C5990YZ implements InterfaceC43306v {
    public static String[] A01 = {"YvgwWocx1FADdeAzbpsmJqKucTKVrLw8", "IN5yo6alVzQxSBDS0LSAMVLc9G2MRZFn", "HAZTu6IPNZsD1qj0M1i9utr9DJx5S0QZ", "N5cGJfQ0ESKW2WKzc5hPaTPWXOaKWBwf", "tNMXMhxZjOCLmtsXwerOChNpJkA4NIz8", "qe3nCZLHllYVPimtyVQbZz0eRg0vYsPF", "hksQgw", "nUQ4NN4k5WyfvhfMBfttwidjpDAXB5K7"};
    public final /* synthetic */ C5982YR A00;

    public C5990YZ(C5982YR c5982yr) {
        this.A00 = c5982yr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        TelephonyManager telephonyManager3;
        telephonyManager = this.A00.A00;
        if (telephonyManager == null) {
            return this.A00.A07(EnumC434176.A07);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            C5982YR c5982yr = this.A00;
            telephonyManager3 = c5982yr.A00;
            return c5982yr.A04(telephonyManager3.getVoiceNetworkType());
        }
        C5982YR c5982yr2 = this.A00;
        telephonyManager2 = c5982yr2.A00;
        if (A01[2].charAt(0) != 'L') {
            A01[1] = "ynGeEoYIomGmDWEGPoJ89qRpE67tUZnz";
            return c5982yr2.A04(telephonyManager2.getNetworkType());
        }
        throw new RuntimeException();
    }
}
