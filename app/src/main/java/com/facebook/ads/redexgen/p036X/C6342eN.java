package com.facebook.ads.redexgen.p036X;

import android.view.View;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.eN */
/* loaded from: assets/audience_network.dex */
public final class C6342eN {
    public final Map<View, C6349eU> A00 = new WeakHashMap();

    public final synchronized C6349eU A00(View view) {
        C6349eU c6349eU = this.A00.get(view);
        if (c6349eU == null) {
            return C6349eU.A06;
        }
        return c6349eU;
    }

    public final synchronized void A01(View view) {
        this.A00.remove(view);
    }

    public final synchronized void A02(View view, C6349eU c6349eU) {
        this.A00.put(view, c6349eU);
    }

    public final synchronized void A03(Collection<View> collection) {
        for (View view : this.A00.keySet()) {
            collection.add(view);
        }
    }
}
