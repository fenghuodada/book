package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.C6702h0;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.source.C7139a0;
import com.google.android.exoplayer2.source.C7146b;
import com.google.android.exoplayer2.source.C7159e0;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.exoplayer2.upstream.z */
/* loaded from: classes.dex */
public final class C7385z {

    /* renamed from: d */
    public static final C7387b f13853d = new C7387b(2, -9223372036854775807L);

    /* renamed from: e */
    public static final C7387b f13854e = new C7387b(3, -9223372036854775807L);

    /* renamed from: a */
    public final ExecutorService f13855a;
    @Nullable

    /* renamed from: b */
    public HandlerC7388c<? extends InterfaceC7389d> f13856b;
    @Nullable

    /* renamed from: c */
    public IOException f13857c;

    /* renamed from: com.google.android.exoplayer2.upstream.z$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7386a<T extends InterfaceC7389d> {
        /* renamed from: b */
        void mo5141b(T t, long j, long j2, boolean z);

        /* renamed from: d */
        void mo5140d(T t, long j, long j2);

        /* renamed from: o */
        C7387b mo5139o(T t, long j, long j2, IOException iOException, int i);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.z$b */
    /* loaded from: classes.dex */
    public static final class C7387b {

        /* renamed from: a */
        public final int f13858a;

        /* renamed from: b */
        public final long f13859b;

        public C7387b(int i, long j) {
            this.f13858a = i;
            this.f13859b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.z$c */
    /* loaded from: classes.dex */
    public final class HandlerC7388c<T extends InterfaceC7389d> extends Handler implements Runnable {

        /* renamed from: a */
        public final int f13860a;

        /* renamed from: b */
        public final T f13861b;

        /* renamed from: c */
        public final long f13862c;
        @Nullable

        /* renamed from: d */
        public InterfaceC7386a<T> f13863d;
        @Nullable

        /* renamed from: e */
        public IOException f13864e;

        /* renamed from: f */
        public int f13865f;
        @Nullable

        /* renamed from: g */
        public Thread f13866g;

        /* renamed from: h */
        public boolean f13867h;

        /* renamed from: i */
        public volatile boolean f13868i;

        public HandlerC7388c(Looper looper, C7139a0.C7140a c7140a, InterfaceC7386a interfaceC7386a, int i, long j) {
            super(looper);
            this.f13861b = c7140a;
            this.f13863d = interfaceC7386a;
            this.f13860a = i;
            this.f13862c = j;
        }

        /* renamed from: a */
        public final void m5138a(boolean z) {
            this.f13868i = z;
            this.f13864e = null;
            if (hasMessages(0)) {
                this.f13867h = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f13867h = true;
                    ((C7139a0.C7140a) this.f13861b).f12750g = true;
                    Thread thread = this.f13866g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                C7385z.this.f13856b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                InterfaceC7386a<T> interfaceC7386a = this.f13863d;
                interfaceC7386a.getClass();
                interfaceC7386a.mo5141b(this.f13861b, elapsedRealtime, elapsedRealtime - this.f13862c, true);
                this.f13863d = null;
            }
        }

        /* renamed from: b */
        public final void m5137b(long j) {
            boolean z;
            C7385z c7385z = C7385z.this;
            if (c7385z.f13856b == null) {
                z = true;
            } else {
                z = false;
            }
            C7394a.m5131d(z);
            c7385z.f13856b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f13864e = null;
            ExecutorService executorService = c7385z.f13855a;
            HandlerC7388c<? extends InterfaceC7389d> handlerC7388c = c7385z.f13856b;
            handlerC7388c.getClass();
            executorService.execute(handlerC7388c);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f13868i) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.f13864e = null;
                C7385z c7385z = C7385z.this;
                ExecutorService executorService = c7385z.f13855a;
                HandlerC7388c<? extends InterfaceC7389d> handlerC7388c = c7385z.f13856b;
                handlerC7388c.getClass();
                executorService.execute(handlerC7388c);
            } else if (i != 3) {
                C7385z.this.f13856b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f13862c;
                InterfaceC7386a<T> interfaceC7386a = this.f13863d;
                interfaceC7386a.getClass();
                if (this.f13867h) {
                    interfaceC7386a.mo5141b(this.f13861b, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f13864e = iOException;
                        int i3 = this.f13865f + 1;
                        this.f13865f = i3;
                        C7387b mo5139o = interfaceC7386a.mo5139o(this.f13861b, elapsedRealtime, j, iOException, i3);
                        int i4 = mo5139o.f13858a;
                        if (i4 == 3) {
                            C7385z.this.f13857c = this.f13864e;
                            return;
                        } else if (i4 != 2) {
                            if (i4 == 1) {
                                this.f13865f = 1;
                            }
                            long j2 = mo5139o.f13859b;
                            if (j2 == -9223372036854775807L) {
                                j2 = Math.min((this.f13865f - 1) * 1000, 5000);
                            }
                            m5137b(j2);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    interfaceC7386a.mo5140d(this.f13861b, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    C7421n.m5056b("LoadTask", "Unexpected exception handling load completed", e);
                    C7385z.this.f13857c = new C7392g(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7392g c7392g;
            Message obtainMessage;
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f13867h;
                    this.f13866g = Thread.currentThread();
                }
                if (z) {
                    String simpleName = this.f13861b.getClass().getSimpleName();
                    C6702h0.m6062a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        ((C7139a0.C7140a) this.f13861b).m5473b();
                        C6702h0.m6060c();
                    } catch (Throwable th) {
                        C6702h0.m6060c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f13866g = null;
                    Thread.interrupted();
                }
                if (this.f13868i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.f13868i) {
                    return;
                }
                obtainMessage = obtainMessage(2, e);
                obtainMessage.sendToTarget();
            } catch (Error e2) {
                if (!this.f13868i) {
                    C7421n.m5056b("LoadTask", "Unexpected error loading stream", e2);
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                if (this.f13868i) {
                    return;
                }
                C7421n.m5056b("LoadTask", "Unexpected exception loading stream", e3);
                c7392g = new C7392g(e3);
                obtainMessage = obtainMessage(2, c7392g);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.f13868i) {
                    return;
                }
                C7421n.m5056b("LoadTask", "OutOfMemory error loading stream", e4);
                c7392g = new C7392g(e4);
                obtainMessage = obtainMessage(2, c7392g);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.z$d */
    /* loaded from: classes.dex */
    public interface InterfaceC7389d {
    }

    /* renamed from: com.google.android.exoplayer2.upstream.z$e */
    /* loaded from: classes.dex */
    public interface InterfaceC7390e {
    }

    /* renamed from: com.google.android.exoplayer2.upstream.z$f */
    /* loaded from: classes.dex */
    public static final class RunnableC7391f implements Runnable {

        /* renamed from: a */
        public final InterfaceC7390e f13870a;

        public RunnableC7391f(InterfaceC7390e interfaceC7390e) {
            this.f13870a = interfaceC7390e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7159e0[] c7159e0Arr;
            C7139a0 c7139a0 = (C7139a0) this.f13870a;
            for (C7159e0 c7159e0 : c7139a0.f12736s) {
                c7159e0.m5441o(true);
                DrmSession drmSession = c7159e0.f12844i;
                if (drmSession != null) {
                    drmSession.mo5977b(c7159e0.f12840e);
                    c7159e0.f12844i = null;
                    c7159e0.f12843h = null;
                }
            }
            C7146b c7146b = (C7146b) c7139a0.f12729l;
            Extractor extractor = c7146b.f12782b;
            if (extractor != null) {
                extractor.release();
                c7146b.f12782b = null;
            }
            c7146b.f12783c = null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.z$g */
    /* loaded from: classes.dex */
    public static final class C7392g extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C7392g(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                int r2 = r0.length()
                int r2 = r2 + 13
                int r2 = androidx.constraintlayout.motion.widget.C0552c.m12193a(r1, r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                r4.<init>(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.C7385z.C7392g.<init>(java.lang.Throwable):void");
        }
    }

    public C7385z() {
        final String str;
        if ("ProgressiveMediaPeriod".length() != 0) {
            str = "ExoPlayer:Loader:".concat("ProgressiveMediaPeriod");
        } else {
            str = new String("ExoPlayer:Loader:");
        }
        int i = C7408g0.f13905a;
        this.f13855a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.exoplayer2.util.f0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }
}
