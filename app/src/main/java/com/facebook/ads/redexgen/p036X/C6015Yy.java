package com.facebook.ads.redexgen.p036X;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Yy */
/* loaded from: assets/audience_network.dex */
public class C6015Yy implements InterfaceC43306v {
    public final /* synthetic */ C6012Yv A00;

    public C6015Yy(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ActivityInfo[] activityInfoArr;
        ActivityInfo[] activityInfoArr2;
        C42856C c42856c;
        ActivityInfo[] activityInfoArr3;
        activityInfoArr = this.A00.A04;
        if (activityInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            activityInfoArr2 = this.A00.A04;
            int length = activityInfoArr2.length;
            c42856c = this.A00.A03;
            int min = Math.min(length, c42856c.A0U());
            for (int i = 0; i < min; i++) {
                activityInfoArr3 = this.A00.A04;
                arrayList.add(activityInfoArr3[i].name);
            }
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
