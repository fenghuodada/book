package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.drm.ExoMediaDrm;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.C1 */
/* loaded from: assets/audience_network.dex */
public class HandlerC4631C1 extends Handler {
    public final /* synthetic */ C5892Wz A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C1 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    public HandlerC4631C1(C5892Wz c5892Wz, Looper looper) {
        super(looper);
        this.A00 = c5892Wz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C1 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    private long A00(int i) {
        return Math.min((i - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C1 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    private boolean A01(Message message) {
        int i;
        if (message.arg1 == 1) {
            int i2 = message.arg2 + 1;
            i = this.A00.A0D;
            if (i2 > i) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i2;
            sendMessageDelayed(obtain, A00(i2));
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C1 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    public final void A02(int errorCount, Object obj, boolean z) {
        obtainMessage(errorCount, z ? 1 : 0, 0, obj).sendToTarget();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C1 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            Object obj = message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    e = this.A00.A0B.executeProvisionRequest(this.A00.A0C, (InterfaceC4653CS) obj);
                } else if (i == 1) {
                    Pair<ExoMediaDrm.KeyRequest, String> keyRequest = (Pair) obj;
                    e = this.A00.A0B.executeKeyRequest(this.A00.A0C, (InterfaceC4652CO) keyRequest.first, (String) keyRequest.second);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                e = e;
                if (A01(message)) {
                    return;
                }
            }
            this.A00.A0A.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
