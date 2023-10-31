package com.google.android.exoplayer2;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.InterfaceC7396b;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.exoplayer2.b1 */
/* loaded from: classes.dex */
public final class C6733b1 {

    /* renamed from: a */
    public final InterfaceC6735b f10881a;

    /* renamed from: b */
    public final InterfaceC6734a f10882b;

    /* renamed from: c */
    public final InterfaceC7396b f10883c;

    /* renamed from: d */
    public int f10884d;
    @Nullable

    /* renamed from: e */
    public Object f10885e;

    /* renamed from: f */
    public final Looper f10886f;

    /* renamed from: g */
    public boolean f10887g;

    /* renamed from: h */
    public boolean f10888h;

    /* renamed from: i */
    public boolean f10889i;

    /* renamed from: com.google.android.exoplayer2.b1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6734a {
    }

    /* renamed from: com.google.android.exoplayer2.b1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6735b {
        /* renamed from: p */
        void mo4917p(int i, @Nullable Object obj) throws ExoPlaybackException;
    }

    public C6733b1(C6989k0 c6989k0, InterfaceC6735b interfaceC6735b, AbstractC6984j1 abstractC6984j1, int i, InterfaceC7396b interfaceC7396b, Looper looper) {
        this.f10882b = c6989k0;
        this.f10881a = interfaceC6735b;
        this.f10886f = looper;
        this.f10883c = interfaceC7396b;
    }

    /* renamed from: a */
    public final synchronized void m6025a(long j) throws InterruptedException, TimeoutException {
        boolean z;
        C7394a.m5131d(this.f10887g);
        C7394a.m5131d(this.f10886f.getThread() != Thread.currentThread());
        long elapsedRealtime = this.f10883c.elapsedRealtime() + j;
        while (true) {
            z = this.f10889i;
            if (z || j <= 0) {
                break;
            }
            this.f10883c.mo5125c();
            wait(j);
            j = elapsedRealtime - this.f10883c.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    /* renamed from: b */
    public final synchronized void m6024b(boolean z) {
        this.f10888h = z | this.f10888h;
        this.f10889i = true;
        notifyAll();
    }

    /* renamed from: c */
    public final void m6023c() {
        C7394a.m5131d(!this.f10887g);
        this.f10887g = true;
        C6989k0 c6989k0 = (C6989k0) this.f10882b;
        synchronized (c6989k0) {
            if (!c6989k0.f12231y && c6989k0.f12214h.isAlive()) {
                c6989k0.f12213g.mo5063j(14, this).m5122a();
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            m6024b(false);
        }
    }
}
