package com.google.android.exoplayer2.video;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C7124p;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.video.k */
/* loaded from: classes.dex */
public final class C7459k {

    /* renamed from: a */
    public final C7450e f14081a = new C7450e();
    @Nullable

    /* renamed from: b */
    public final InterfaceC7460a f14082b;
    @Nullable

    /* renamed from: c */
    public final Choreographer$FrameCallbackC7464d f14083c;

    /* renamed from: d */
    public boolean f14084d;
    @Nullable

    /* renamed from: e */
    public Surface f14085e;

    /* renamed from: f */
    public float f14086f;

    /* renamed from: g */
    public float f14087g;

    /* renamed from: h */
    public float f14088h;

    /* renamed from: i */
    public float f14089i;

    /* renamed from: j */
    public long f14090j;

    /* renamed from: k */
    public long f14091k;

    /* renamed from: l */
    public long f14092l;

    /* renamed from: m */
    public long f14093m;

    /* renamed from: n */
    public long f14094n;

    /* renamed from: o */
    public long f14095o;

    /* renamed from: p */
    public long f14096p;

    /* renamed from: com.google.android.exoplayer2.video.k$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7460a {

        /* renamed from: com.google.android.exoplayer2.video.k$a$a */
        /* loaded from: classes.dex */
        public interface InterfaceC7461a {
        }

        /* renamed from: a */
        void mo4927a(C7124p c7124p);

        void unregister();
    }

    /* renamed from: com.google.android.exoplayer2.video.k$b */
    /* loaded from: classes.dex */
    public static final class C7462b implements InterfaceC7460a {

        /* renamed from: a */
        public final WindowManager f14097a;

        public C7462b(WindowManager windowManager) {
            this.f14097a = windowManager;
        }

        @Override // com.google.android.exoplayer2.video.C7459k.InterfaceC7460a
        /* renamed from: a */
        public final void mo4927a(C7124p c7124p) {
            c7124p.m5502a(this.f14097a.getDefaultDisplay());
        }

        @Override // com.google.android.exoplayer2.video.C7459k.InterfaceC7460a
        public final void unregister() {
        }
    }

    @RequiresApi(17)
    /* renamed from: com.google.android.exoplayer2.video.k$c */
    /* loaded from: classes.dex */
    public static final class C7463c implements InterfaceC7460a, DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f14098a;
        @Nullable

        /* renamed from: b */
        public InterfaceC7460a.InterfaceC7461a f14099b;

        public C7463c(DisplayManager displayManager) {
            this.f14098a = displayManager;
        }

        @Override // com.google.android.exoplayer2.video.C7459k.InterfaceC7460a
        /* renamed from: a */
        public final void mo4927a(C7124p c7124p) {
            this.f14099b = c7124p;
            Handler m5097i = C7408g0.m5097i(null);
            DisplayManager displayManager = this.f14098a;
            displayManager.registerDisplayListener(this, m5097i);
            c7124p.m5502a(displayManager.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            InterfaceC7460a.InterfaceC7461a interfaceC7461a = this.f14099b;
            if (interfaceC7461a != null && i == 0) {
                ((C7124p) interfaceC7461a).m5502a(this.f14098a.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }

        @Override // com.google.android.exoplayer2.video.C7459k.InterfaceC7460a
        public final void unregister() {
            this.f14098a.unregisterDisplayListener(this);
            this.f14099b = null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.video.k$d */
    /* loaded from: classes.dex */
    public static final class Choreographer$FrameCallbackC7464d implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: e */
        public static final Choreographer$FrameCallbackC7464d f14100e = new Choreographer$FrameCallbackC7464d();

        /* renamed from: a */
        public volatile long f14101a = -9223372036854775807L;

        /* renamed from: b */
        public final Handler f14102b;

        /* renamed from: c */
        public Choreographer f14103c;

        /* renamed from: d */
        public int f14104d;

        public Choreographer$FrameCallbackC7464d() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i = C7408g0.f13905a;
            Handler handler = new Handler(looper, this);
            this.f14102b = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.f14101a = j;
            Choreographer choreographer = this.f14103c;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    int i2 = this.f14104d - 1;
                    this.f14104d = i2;
                    if (i2 == 0) {
                        Choreographer choreographer = this.f14103c;
                        choreographer.getClass();
                        choreographer.removeFrameCallback(this);
                        this.f14101a = -9223372036854775807L;
                    }
                    return true;
                }
                int i3 = this.f14104d + 1;
                this.f14104d = i3;
                if (i3 == 1) {
                    Choreographer choreographer2 = this.f14103c;
                    choreographer2.getClass();
                    choreographer2.postFrameCallback(this);
                }
                return true;
            }
            this.f14103c = Choreographer.getInstance();
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7459k(@androidx.annotation.Nullable android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            com.google.android.exoplayer2.video.e r0 = new com.google.android.exoplayer2.video.e
            r0.<init>()
            r3.f14081a = r0
            r0 = 0
            if (r4 == 0) goto L3a
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            com.google.android.exoplayer2.video.k$c r2 = new com.google.android.exoplayer2.video.k$c
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3b
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3a
            com.google.android.exoplayer2.video.k$b r2 = new com.google.android.exoplayer2.video.k$b
            r2.<init>(r4)
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r3.f14082b = r2
            if (r2 == 0) goto L41
            com.google.android.exoplayer2.video.k$d r0 = com.google.android.exoplayer2.video.C7459k.Choreographer$FrameCallbackC7464d.f14100e
        L41:
            r3.f14083c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f14090j = r0
            r3.f14091k = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f14086f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f14089i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.C7459k.<init>(android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
        if (java.lang.Math.abs(r2 - r9.f14087g) < r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
        if (r0.f14026e >= 30) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4929a() {
        /*
            r9 = this;
            int r0 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r1 = 30
            if (r0 < r1) goto L8f
            android.view.Surface r0 = r9.f14085e
            if (r0 != 0) goto Lc
            goto L8f
        Lc:
            com.google.android.exoplayer2.video.e r0 = r9.f14081a
            boolean r2 = r0.m4972a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L35
            boolean r2 = r0.m4972a()
            if (r2 == 0) goto L33
            com.google.android.exoplayer2.video.e$a r2 = r0.f14022a
            long r4 = r2.f14031e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L27
            goto L2a
        L27:
            long r6 = r2.f14032f
            long r6 = r6 / r4
        L2a:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L37
        L33:
            r2 = r3
            goto L37
        L35:
            float r2 = r9.f14086f
        L37:
            float r4 = r9.f14087g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L3e
            return
        L3e:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L7f
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L7f
            boolean r1 = r0.m4972a()
            if (r1 == 0) goto L69
            boolean r1 = r0.m4972a()
            if (r1 == 0) goto L59
            com.google.android.exoplayer2.video.e$a r0 = r0.f14022a
            long r0 = r0.f14032f
            goto L5e
        L59:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L5e:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L69
            r0 = r7
            goto L6a
        L69:
            r0 = r6
        L6a:
            if (r0 == 0) goto L70
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L72
        L70:
            r0 = 1065353216(0x3f800000, float:1.0)
        L72:
            float r1 = r9.f14087g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L87
            goto L88
        L7f:
            if (r5 == 0) goto L82
            goto L88
        L82:
            int r0 = r0.f14026e
            if (r0 < r1) goto L87
            goto L88
        L87:
            r7 = r6
        L88:
            if (r7 == 0) goto L8f
            r9.f14087g = r2
            r9.m4928b(r6)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.C7459k.m4929a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4928b(boolean r5) {
        /*
            r4 = this;
            int r0 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r1 = 30
            if (r0 < r1) goto L3b
            android.view.Surface r0 = r4.f14085e
            if (r0 != 0) goto Lb
            goto L3b
        Lb:
            boolean r1 = r4.f14084d
            r2 = 0
            if (r1 == 0) goto L1c
            float r1 = r4.f14087g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L1c
            float r3 = r4.f14089i
            float r1 = r1 * r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r5 != 0) goto L26
            float r5 = r4.f14088h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L26
            return
        L26:
            r4.f14088h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L2e
            r5 = 0
            goto L2f
        L2e:
            r5 = 1
        L2f:
            androidx.core.view.C0976n2.m11404b(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L33
            goto L3b
        L33:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            com.google.android.exoplayer2.util.C7421n.m5056b(r0, r1, r5)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.C7459k.m4928b(boolean):void");
    }
}
