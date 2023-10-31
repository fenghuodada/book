package com.facebook.ads.redexgen.p036X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bI */
/* loaded from: assets/audience_network.dex */
public final class C6159bI implements InterfaceC427562 {
    public final Map<String, C427360> A00 = new HashMap();

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC427562
    public final synchronized String AE2() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (C427360 stat : this.A00.values()) {
            sb.append(stat.toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC427562
    public final synchronized void reset() {
        this.A00.clear();
    }
}
