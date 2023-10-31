package com.facebook.ads.redexgen.p036X;

import android.database.Observable;

/* renamed from: com.facebook.ads.redexgen.X.4I */
/* loaded from: assets/audience_network.dex */
public class C41684I extends Observable<AbstractC41694J> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC41694J) this.mObservers.get(size)).A00();
        }
    }
}
