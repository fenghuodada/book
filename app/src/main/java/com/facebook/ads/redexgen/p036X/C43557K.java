package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.7K */
/* loaded from: assets/audience_network.dex */
public final class C43557K {
    public Handler A00;

    public C43557K(Looper looper) {
        this.A00 = new Handler(looper);
    }

    public final void A00(RunnableC43567L runnableC43567L) {
        this.A00.post(runnableC43567L);
    }

    public final void A01(RunnableC43567L runnableC43567L) {
        this.A00.removeCallbacks(runnableC43567L);
    }

    public final boolean A02(RunnableC43567L runnableC43567L, long j) {
        return this.A00.postDelayed(runnableC43567L, j);
    }
}
