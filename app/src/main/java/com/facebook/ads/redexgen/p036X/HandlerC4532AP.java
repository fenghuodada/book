package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.AP */
/* loaded from: assets/audience_network.dex */
public class HandlerC4532AP extends Handler {
    public final /* synthetic */ C4740E3 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4532AP(C4740E3 c4740e3, Looper looper) {
        super(looper);
        this.A00 = c4740e3;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0A(message);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
