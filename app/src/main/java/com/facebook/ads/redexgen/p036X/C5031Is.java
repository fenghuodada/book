package com.facebook.ads.redexgen.p036X;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Is */
/* loaded from: assets/audience_network.dex */
public class C5031Is implements Comparator<C5032It> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(C5032It c5032It, C5032It c5032It2) {
        if (c5032It.A00 < c5032It2.A00) {
            return -1;
        }
        return c5032It2.A00 < c5032It.A00 ? 1 : 0;
    }
}
