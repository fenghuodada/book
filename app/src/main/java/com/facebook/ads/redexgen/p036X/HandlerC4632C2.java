package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.C2 */
/* loaded from: assets/audience_network.dex */
public class HandlerC4632C2 extends Handler {
    public final /* synthetic */ C5892Wz A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostResponseHandler */
    public HandlerC4632C2(C5892Wz c5892Wz, Looper looper) {
        super(looper);
        this.A00 = c5892Wz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostResponseHandler */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                this.A00.A0A(obj, obj2);
                return;
            }
            this.A00.A0B(obj, obj2);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
