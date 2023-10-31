package com.facebook.ads.redexgen.p036X;

import android.content.pm.ApplicationInfo;

/* renamed from: com.facebook.ads.redexgen.X.af */
/* loaded from: assets/audience_network.dex */
public class C6120af implements InterfaceC43306v {
    public static String[] A01 = {"CyYconlRA", "Z99FvxWAH", "r", "I6nMbGSwO", "f1HEaIkkO6UN2Wyn2K6t6YhOL5YQHMub", "q7TOnFp8MDH9pVcAi7q7X5O", "kHDnEbJrZHu3VwOwnck16fHaeHzzt8", "W41og5bN"};
    public final /* synthetic */ C6113aY A00;

    public C6120af(C6113aY c6113aY) {
        this.A00 = c6113aY;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            C6113aY c6113aY = this.A00;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[2] = "ZWV";
            applicationInfo2 = c6113aY.A01;
            return c6113aY.A08(applicationInfo2.sourceDir);
        }
        C6113aY c6113aY2 = this.A00;
        if (A01[6].length() != 14) {
            A01[6] = "1VAENbmq7tYIb9ZQI0D0jEbiw3q";
            return c6113aY2.A07(EnumC434176.A07);
        }
        return c6113aY2.A07(EnumC434176.A07);
    }
}
