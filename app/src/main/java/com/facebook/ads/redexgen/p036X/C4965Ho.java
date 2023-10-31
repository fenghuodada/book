package com.facebook.ads.redexgen.p036X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ho */
/* loaded from: assets/audience_network.dex */
public class C4965Ho extends IOException {
    public final int A00;
    public final C4959Hi A01;

    public C4965Ho(IOException iOException, C4959Hi c4959Hi, int i) {
        super(iOException);
        this.A01 = c4959Hi;
        this.A00 = i;
    }

    public C4965Ho(String str, C4959Hi c4959Hi, int i) {
        super(str);
        this.A01 = c4959Hi;
        this.A00 = i;
    }

    public C4965Ho(String str, IOException iOException, C4959Hi c4959Hi, int i) {
        super(str, iOException);
        this.A01 = c4959Hi;
        this.A00 = i;
    }
}
