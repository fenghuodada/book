package com.facebook.ads.redexgen.p036X;

import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.Bg */
/* loaded from: assets/audience_network.dex */
public class C4610Bg extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C5902X9 A01;

    public C4610Bg(C5902X9 c5902x9, AudioTrack audioTrack) {
        this.A01 = c5902x9;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
