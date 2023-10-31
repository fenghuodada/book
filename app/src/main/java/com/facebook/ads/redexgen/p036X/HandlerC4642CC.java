package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.CC */
/* loaded from: assets/audience_network.dex */
public class HandlerC4642CC extends Handler {
    public final /* synthetic */ C5891Wy A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CC != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public HandlerC4642CC(C5891Wy c5891Wy, Looper looper) {
        super(looper);
        this.A00 = c5891Wy;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CC != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List<C5892Wz> list;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            byte[] bArr = (byte[]) message.obj;
            list = this.A00.A09;
            for (C5892Wz c5892Wz : list) {
                if (c5892Wz.A0N(bArr)) {
                    c5892Wz.A0J(message.what);
                    return;
                }
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
