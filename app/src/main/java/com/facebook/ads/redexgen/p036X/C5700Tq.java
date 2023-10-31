package com.facebook.ads.redexgen.p036X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.facebook.ads.redexgen.X.Tq */
/* loaded from: assets/audience_network.dex */
public class C5700Tq implements InterfaceC5225M8 {
    public final Collection<String> A00;

    public C5700Tq() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5225M8
    public final void ADK(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5225M8
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String line : this.A00) {
            sb.append(line);
            sb.append('\n');
        }
        return sb.toString();
    }
}
