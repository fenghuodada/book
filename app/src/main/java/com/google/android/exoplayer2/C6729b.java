package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.exoplayer2.C6970g1;

/* renamed from: com.google.android.exoplayer2.b */
/* loaded from: classes.dex */
public final class C6729b {

    /* renamed from: a */
    public final Context f10874a;

    /* renamed from: b */
    public final RunnableC6730a f10875b;

    /* renamed from: c */
    public boolean f10876c;

    /* renamed from: com.google.android.exoplayer2.b$a */
    /* loaded from: classes.dex */
    public final class RunnableC6730a extends BroadcastReceiver implements Runnable {

        /* renamed from: a */
        public final InterfaceC6731b f10877a;

        /* renamed from: b */
        public final Handler f10878b;

        public RunnableC6730a(Handler handler, C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b) {
            this.f10878b = handler;
            this.f10877a = surfaceHolder$CallbackC6972b;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f10878b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6729b.this.f10876c) {
                C6970g1.this.m5741f0(-1, 3, false);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6731b {
    }

    public C6729b(Context context, Handler handler, C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b) {
        this.f10874a = context.getApplicationContext();
        this.f10875b = new RunnableC6730a(handler, surfaceHolder$CallbackC6972b);
    }

    /* renamed from: a */
    public final void m6026a() {
        if (this.f10876c) {
            this.f10874a.unregisterReceiver(this.f10875b);
            this.f10876c = false;
        }
    }
}
