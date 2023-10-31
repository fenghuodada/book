package com.facebook.ads.redexgen.p036X;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.1M */
/* loaded from: assets/audience_network.dex */
public final class C39891M implements Serializable {
    public static final long serialVersionUID = -2102939945352398575L;
    public final List<String> A00;

    public C39891M(List<String> screenshots) {
        this.A00 = screenshots;
    }

    public final List<String> A00() {
        return Collections.unmodifiableList(this.A00);
    }
}
