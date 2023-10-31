package com.facebook.ads.redexgen.p036X;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.IH */
/* loaded from: assets/audience_network.dex */
public class C4994IH extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C5758Um A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4994IH(C5758Um c5758Um, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c5758Um;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                this.A00.open();
                this.A01.A04();
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
