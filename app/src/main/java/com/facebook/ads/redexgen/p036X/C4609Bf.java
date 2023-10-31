package com.facebook.ads.redexgen.p036X;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Bf */
/* loaded from: assets/audience_network.dex */
public class C4609Bf extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C5902X9 A01;

    public C4609Bf(C5902X9 c5902x9, AudioTrack audioTrack) {
        this.A01 = c5902x9;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.flush();
            this.A00.release();
            conditionVariable = this.A01.A0f;
            conditionVariable.open();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
