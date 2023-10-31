package com.facebook.ads.redexgen.p036X;

import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yh */
/* loaded from: assets/audience_network.dex */
public class C5998Yh implements InterfaceC43306v {
    public final /* synthetic */ C5996Yf A00;
    public final /* synthetic */ List A01;

    public C5998Yh(C5996Yf c5996Yf, List list) {
        this.A00 = c5996Yf;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        AbstractC43457A A02;
        HashMap hashMap = new HashMap();
        for (C43296u c43296u : this.A01) {
            if (c43296u.A02()) {
                String str = (String) c43296u.A01();
                C5997Yg systemProperty = new C5997Yg(str);
                hashMap.put(str, systemProperty);
            }
        }
        A02 = this.A00.A02(hashMap);
        return A02;
    }
}
