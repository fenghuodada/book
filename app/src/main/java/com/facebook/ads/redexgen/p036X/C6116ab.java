package com.facebook.ads.redexgen.p036X;

import android.content.pm.ApplicationInfo;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.ab */
/* loaded from: assets/audience_network.dex */
public class C6116ab implements InterfaceC43306v {
    public static String[] A01 = {"9CH7FUr60fjSOu0uDtam6QWrW1LAXcO0", "MGZ5NGAJYsXrcQ530Rpa4mq072uYsiXm", "FSEpTqAJrXrPXD8Cb", "YDmM9nsCETgUfJB46tzDOSpydcNxEQ3F", "VGv8Kw1xSq2totQkDwmbaDQvoJVXTwia", "PqLjk4LqC3tC9ytXEM059nB67sHSnsxP", "xjbenFCMrkBs7EfKqhSnYCZ0lRG62qii", "xgMaaa53aLKiV09tKVXK6rj7dvlbsjte"};
    public final /* synthetic */ C6113aY A00;

    public C6116ab(C6113aY c6113aY) {
        this.A00 = c6113aY;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        if (Build.VERSION.SDK_INT >= 24) {
            applicationInfo = this.A00.A01;
            if (applicationInfo != null) {
                C6113aY c6113aY = this.A00;
                applicationInfo2 = c6113aY.A01;
                return c6113aY.A08(applicationInfo2.deviceProtectedDataDir);
            }
            return this.A00.A07(EnumC434176.A07);
        }
        C6113aY c6113aY2 = this.A00;
        EnumC434176 enumC434176 = EnumC434176.A05;
        String[] strArr = A01;
        if (strArr[4].charAt(20) != strArr[5].charAt(20)) {
            String[] strArr2 = A01;
            strArr2[3] = "fnZh3TS8JAEKtifjP4n7RBztgRvZoar8";
            strArr2[2] = "4XQjD71oxr9tiB6pv";
            return c6113aY2.A07(enumC434176);
        }
        throw new RuntimeException();
    }
}
