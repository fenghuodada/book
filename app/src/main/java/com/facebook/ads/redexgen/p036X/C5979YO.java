package com.facebook.ads.redexgen.p036X;

import android.icu.util.TimeZone;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.YO */
/* loaded from: assets/audience_network.dex */
public class C5979YO implements InterfaceC43306v {
    public static String[] A01 = {"smnl8goxbtEXy2ari0oo94M5wBAsJ", "4jdGfKjJVtKongVqtnlXz1qpag9QmJcO", "6HhyQoH63eZiDTc8tIM8lg1a8XmlaMXL", "TRovmJ8dsKeWsGtAEtnO1NLs5DkGdItv", "EJDQOjfPW", "Fvhxx1JOY2tpNVIZJk2UFnorm88CMjoG", "Hr", "QB67UPOvQOrUPNaLWc8iYWX5dhIe7kRi"};
    public final /* synthetic */ C5978YN A00;

    public C5979YO(C5978YN c5978yn) {
        this.A00 = c5978yn;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        if (Build.VERSION.SDK_INT < 24) {
            AbstractC43457A A07 = this.A00.A07(EnumC434176.A05);
            String[] strArr = A01;
            if (strArr[5].charAt(2) != strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A01[0] = "zHpdef4a8sETM0qy6DqDlJHNwIYZi";
            return A07;
        }
        return this.A00.A08(TimeZone.getDefault().getDisplayName());
    }
}
