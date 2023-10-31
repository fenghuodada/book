package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yn */
/* loaded from: assets/audience_network.dex */
public class C6004Yn implements InterfaceC43306v {
    public final /* synthetic */ EnumC43266r A00;
    public final /* synthetic */ C6002Yl A01;
    public final /* synthetic */ List A02;

    public C6004Yn(C6002Yl c6002Yl, List list, EnumC43266r enumC43266r) {
        this.A01 = c6002Yl;
        this.A02 = list;
        this.A00 = enumC43266r;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        AbstractC43457A A03;
        Context context;
        HashMap hashMap = new HashMap();
        for (C43296u c43296u : this.A02) {
            if (c43296u.A02()) {
                String str = (String) c43296u.A01();
                context = this.A01.A00;
                C6003Ym systemSettings = new C6003Ym(context, str, this.A00);
                hashMap.put(str, systemSettings);
            }
        }
        A03 = this.A01.A03(hashMap);
        return A03;
    }
}
