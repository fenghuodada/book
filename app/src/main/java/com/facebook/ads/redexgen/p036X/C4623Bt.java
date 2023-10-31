package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* renamed from: com.facebook.ads.redexgen.X.Bt */
/* loaded from: assets/audience_network.dex */
public final class C4623Bt {
    public final MediaCodec.CryptoInfo.Pattern A00;
    public final MediaCodec.CryptoInfo A01;

    public C4623Bt(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
        this.A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i, int i2) {
        this.A00.set(i, i2);
        this.A01.setPattern(this.A00);
    }
}
