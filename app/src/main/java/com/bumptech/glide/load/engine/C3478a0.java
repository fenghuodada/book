package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.engine.a0 */
/* loaded from: classes.dex */
public final class C3478a0 {

    /* renamed from: a */
    public boolean f9230a;

    /* renamed from: b */
    public final Handler f9231b = new Handler(Looper.getMainLooper(), new C3479a());

    /* renamed from: com.bumptech.glide.load.engine.a0$a */
    /* loaded from: classes.dex */
    public static final class C3479a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((InterfaceC3573x) message.obj).mo6510a();
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized void m6713a(InterfaceC3573x<?> interfaceC3573x, boolean z) {
        if (!this.f9230a && !z) {
            this.f9230a = true;
            interfaceC3573x.mo6510a();
            this.f9230a = false;
        }
        this.f9231b.obtainMessage(1, interfaceC3573x).sendToTarget();
    }
}
