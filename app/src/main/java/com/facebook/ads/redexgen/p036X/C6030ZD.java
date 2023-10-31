package com.facebook.ads.redexgen.p036X;

import android.content.pm.ServiceInfo;

/* renamed from: com.facebook.ads.redexgen.X.ZD */
/* loaded from: assets/audience_network.dex */
public class C6030ZD implements InterfaceC43306v {
    public static String[] A01 = {"Kjl9x1nXLMp", "FYT6FJfE388FncoeBbUW5LDH7Ti6Kpnc", "Yxd2XW5tX0tpbE5v80iFGWNMQ7F", "Eun4caaboMQouomEKTkKbMJy1uWMR8C3", "2B", "gVUv49X3C1I0CRHiCQrxfKc2j3pZm33W", "VtV7HGxoJcmYVE0XtMWfAnTQdxbbthfO", "Muv0aFmfDz7QlEQw1d"};
    public final /* synthetic */ C6012Yv A00;

    public C6030ZD(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ServiceInfo[] serviceInfoArr;
        ServiceInfo[] serviceInfoArr2;
        serviceInfoArr = this.A00.A05;
        if (serviceInfoArr != null) {
            C6012Yv c6012Yv = this.A00;
            serviceInfoArr2 = c6012Yv.A05;
            return c6012Yv.A04(serviceInfoArr2.length);
        }
        C6012Yv c6012Yv2 = this.A00;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            String[] strArr2 = A01;
            strArr2[0] = "czOc910r7ol";
            strArr2[2] = "WgsI1fVM7Yu7d9q7aeaJmksjNii";
            return c6012Yv2.A07(EnumC434176.A07);
        }
        throw new RuntimeException();
    }
}
