package com.facebook.ads.redexgen.p036X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.eH */
/* loaded from: assets/audience_network.dex */
public class C6336eH {
    public final Map<String, C6349eU> A00;
    public final Set<C6349eU> A01;

    public C6336eH() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C6349eU> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C6349eU> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C6349eU c6349eU : this.A01) {
            this.A00.put(c6349eU.A03, c6349eU);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C6349eU c6349eU) {
        if (this.A01.add(c6349eU)) {
            this.A00.remove(c6349eU.A03);
            return true;
        }
        return false;
    }
}
