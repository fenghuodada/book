package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.mediacodec.C7013g;

/* renamed from: com.google.android.exoplayer2.mediacodec.f */
/* loaded from: classes.dex */
public final class HandlerC7012f extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C7013g f12347a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC7012f(C7013g c7013g, Looper looper) {
        super(looper);
        this.f12347a = c7013g;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C7013g.C7014a c7014a;
        C7013g c7013g = this.f12347a;
        c7013g.getClass();
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    c7013g.f12353d.set(new IllegalStateException(String.valueOf(message.what)));
                } else {
                    c7013g.f12354e.m5119c();
                }
                c7014a = null;
            } else {
                c7014a = (C7013g.C7014a) message.obj;
                int i2 = c7014a.f12357a;
                int i3 = c7014a.f12358b;
                MediaCodec.CryptoInfo cryptoInfo = c7014a.f12360d;
                long j = c7014a.f12361e;
                int i4 = c7014a.f12362f;
                try {
                    if (c7013g.f12355f) {
                        synchronized (C7013g.f12349i) {
                            c7013g.f12350a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                        }
                    } else {
                        c7013g.f12350a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                    }
                } catch (RuntimeException e) {
                    c7013g.f12353d.set(e);
                }
            }
        } else {
            c7014a = (C7013g.C7014a) message.obj;
            try {
                c7013g.f12350a.queueInputBuffer(c7014a.f12357a, c7014a.f12358b, c7014a.f12359c, c7014a.f12361e, c7014a.f12362f);
            } catch (RuntimeException e2) {
                c7013g.f12353d.set(e2);
            }
        }
        if (c7014a != null) {
            C7013g.m5606c(c7014a);
        }
    }
}
