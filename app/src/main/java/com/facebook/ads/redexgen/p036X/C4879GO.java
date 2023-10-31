package com.facebook.ads.redexgen.p036X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.GO */
/* loaded from: assets/audience_network.dex */
public class C4879GO implements InterfaceC6353eY {
    public final List<InterfaceC6354eZ> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC6353eY
    public final InterfaceC6354eZ A5Y(int i) {
        return this.A00.get(i);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC6354eZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC6353eY
    public final int size() {
        return this.A00.size();
    }
}
