package com.facebook.ads.redexgen.p036X;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Ep */
/* loaded from: assets/audience_network.dex */
public class RunnableC4784Ep implements Runnable {
    public final /* synthetic */ ConditionVariable A00;

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.open();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
