package com.facebook.ads.redexgen.p036X;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.R6 */
/* loaded from: assets/audience_network.dex */
public class C5531R6 {
    public C5535RA A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C5531R6 A00(C5535RA c5535ra) {
        this.A00 = c5535ra;
        return this;
    }

    public final C5531R6 A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C5531R6 A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C5531R6 A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C5531R6 A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C5532R7 A05() {
        return new C5532R7(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
