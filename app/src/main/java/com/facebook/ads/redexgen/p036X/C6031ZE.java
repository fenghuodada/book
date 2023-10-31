package com.facebook.ads.redexgen.p036X;

import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.ZE */
/* loaded from: assets/audience_network.dex */
public class C6031ZE implements InterfaceC43306v {
    public final /* synthetic */ C6012Yv A00;

    public C6031ZE(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ServiceInfo[] serviceInfoArr;
        ServiceInfo[] serviceInfoArr2;
        C42856C c42856c;
        ServiceInfo[] serviceInfoArr3;
        serviceInfoArr = this.A00.A05;
        if (serviceInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            serviceInfoArr2 = this.A00.A05;
            int length = serviceInfoArr2.length;
            c42856c = this.A00.A03;
            int min = Math.min(length, c42856c.A0U());
            for (int i = 0; i < min; i++) {
                serviceInfoArr3 = this.A00.A05;
                arrayList.add(serviceInfoArr3[i].name);
            }
            Collections.sort(arrayList);
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
