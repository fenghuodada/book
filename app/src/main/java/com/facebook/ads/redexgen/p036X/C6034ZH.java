package com.facebook.ads.redexgen.p036X;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.ZH */
/* loaded from: assets/audience_network.dex */
public class C6034ZH implements InterfaceC43306v {
    public final /* synthetic */ C6032ZF A00;

    public C6034ZH(C6032ZF c6032zf) {
        this.A00 = c6032zf;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() throws Exception {
        AbstractC43457A A02;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        HashMap hashMap = new HashMap();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            hashMap.put(nextElement.getDisplayName(), new C6033ZG(nextElement.getInetAddresses(), null));
        }
        A02 = this.A00.A02(hashMap);
        return A02;
    }
}
