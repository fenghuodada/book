package com.facebook.ads.redexgen.p036X;

import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.ZB */
/* loaded from: assets/audience_network.dex */
public class C6028ZB implements InterfaceC43306v {
    public final /* synthetic */ C6012Yv A00;

    public C6028ZB(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        String[] strArr;
        String[] strArr2;
        C42856C c42856c;
        String[] strArr3;
        strArr = this.A00.A06;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList();
            strArr2 = this.A00.A06;
            int length = strArr2.length;
            c42856c = this.A00.A03;
            int min = Math.min(length, c42856c.A0U());
            for (int i = 0; i < min; i++) {
                strArr3 = this.A00.A06;
                arrayList.add(strArr3[i]);
            }
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
