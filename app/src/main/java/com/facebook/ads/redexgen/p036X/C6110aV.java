package com.facebook.ads.redexgen.p036X;

import android.media.AudioManager;

/* renamed from: com.facebook.ads.redexgen.X.aV */
/* loaded from: assets/audience_network.dex */
public class C6110aV implements InterfaceC43306v {
    public final /* synthetic */ C6106aR A00;

    public C6110aV(C6106aR c6106aR) {
        this.A00 = c6106aR;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        AudioManager audioManager;
        C6106aR c6106aR = this.A00;
        audioManager = c6106aR.A00;
        return c6106aR.A0F(audioManager.isSpeakerphoneOn());
    }
}
