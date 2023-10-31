package com.facebook.ads.redexgen.p036X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Du */
/* loaded from: assets/audience_network.dex */
public final class C4731Du {
    public final int A00;
    public final String A01;
    public final List<C4730Dt> A02;
    public final byte[] A03;

    public C4731Du(int i, String str, List<C4730Dt> list, byte[] bArr) {
        List<C4730Dt> unmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}
