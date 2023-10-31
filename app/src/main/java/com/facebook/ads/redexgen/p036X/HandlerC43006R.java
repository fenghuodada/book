package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* renamed from: com.facebook.ads.redexgen.X.6R */
/* loaded from: assets/audience_network.dex */
public class HandlerC43006R extends Handler {
    public final /* synthetic */ C43016S A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC43006R(C43016S c43016s, Looper looper) {
        super(looper);
        this.A00 = c43016s;
    }

    @Override // android.os.Handler
    @SuppressLint({"CatchGeneralException"})
    public final void handleMessage(Message message) {
        MotionEvent motionEvent;
        C43116c c43116c;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            if (C42986P.A00[EnumC42996Q.values()[message.what].ordinal()] == 1 && (motionEvent = (MotionEvent) message.obj) != null) {
                c43116c = this.A00.A02;
                c43116c.A00(motionEvent);
            }
        } catch (Throwable th) {
            try {
                C42976O.A03(th);
            } catch (Throwable th2) {
                C5158L0.A00(th2, this);
            }
        }
    }
}
