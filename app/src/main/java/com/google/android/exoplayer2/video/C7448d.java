package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.widgets.C0547l;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;

@RequiresApi(17)
/* renamed from: com.google.android.exoplayer2.video.d */
/* loaded from: classes.dex */
public final class C7448d extends Surface {

    /* renamed from: d */
    public static int f14012d;

    /* renamed from: e */
    public static boolean f14013e;

    /* renamed from: a */
    public final boolean f14014a;

    /* renamed from: b */
    public final HandlerThreadC7449a f14015b;

    /* renamed from: c */
    public boolean f14016c;

    /* renamed from: com.google.android.exoplayer2.video.d$a */
    /* loaded from: classes.dex */
    public static class HandlerThreadC7449a extends HandlerThread implements Handler.Callback {

        /* renamed from: a */
        public EGLSurfaceTexture f14017a;

        /* renamed from: b */
        public Handler f14018b;
        @Nullable

        /* renamed from: c */
        public Error f14019c;
        @Nullable

        /* renamed from: d */
        public RuntimeException f14020d;
        @Nullable

        /* renamed from: e */
        public C7448d f14021e;

        public HandlerThreadC7449a() {
            super("ExoPlayer:DummySurface");
        }

        /* renamed from: a */
        public final void m4974a(int i) {
            EGLConfig eGLConfig;
            int[] iArr;
            int[] iArr2;
            EGLSurface eglCreatePbufferSurface;
            this.f14017a.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f14017a;
            eGLSurfaceTexture.getClass();
            boolean z = false;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != null) {
                int[] iArr3 = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
                    eGLSurfaceTexture.f13874c = eglGetDisplay;
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr4 = new int[1];
                    boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, EGLSurfaceTexture.f13871g, 0, eGLConfigArr, 0, 1, iArr4, 0);
                    if (eglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                        EGLDisplay eGLDisplay = eGLSurfaceTexture.f13874c;
                        if (i == 0) {
                            iArr = new int[]{12440, 2, 12344};
                        } else {
                            iArr = new int[]{12440, 2, 12992, 1, 12344};
                        }
                        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                        if (eglCreateContext != null) {
                            eGLSurfaceTexture.f13875d = eglCreateContext;
                            EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f13874c;
                            if (i == 1) {
                                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                            } else {
                                if (i == 2) {
                                    iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                                } else {
                                    iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                                }
                                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                                if (eglCreatePbufferSurface == null) {
                                    throw new EGLSurfaceTexture.C7393a("eglCreatePbufferSurface failed");
                                }
                            }
                            if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                eGLSurfaceTexture.f13876e = eglCreatePbufferSurface;
                                int[] iArr5 = eGLSurfaceTexture.f13873b;
                                GLES20.glGenTextures(1, iArr5, 0);
                                C0547l.m12206b();
                                SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
                                eGLSurfaceTexture.f13877f = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
                                SurfaceTexture surfaceTexture2 = this.f14017a.f13877f;
                                surfaceTexture2.getClass();
                                if (i != 0) {
                                    z = true;
                                }
                                this.f14021e = new C7448d(this, surfaceTexture2, z);
                                return;
                            }
                            throw new EGLSurfaceTexture.C7393a("eglMakeCurrent failed");
                        }
                        throw new EGLSurfaceTexture.C7393a("eglCreateContext failed");
                    }
                    throw new EGLSurfaceTexture.C7393a(C7408g0.m5096j("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]));
                }
                throw new EGLSurfaceTexture.C7393a("eglInitialize failed");
            }
            throw new EGLSurfaceTexture.C7393a("eglGetDisplay failed");
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
        /* renamed from: b */
        public final void m4973b() {
            this.f14017a.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f14017a;
            eGLSurfaceTexture.f13872a.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f13877f;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f13873b, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f13874c;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f13874c;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f13876e;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f13874c, eGLSurfaceTexture.f13876e);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f13875d;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f13874c, eGLContext);
                }
                if (C7408g0.f13905a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f13874c;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f13874c);
                }
                eGLSurfaceTexture.f13874c = null;
                eGLSurfaceTexture.f13875d = null;
                eGLSurfaceTexture.f13876e = null;
                eGLSurfaceTexture.f13877f = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        m4973b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m4974a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    C7421n.m5056b("DummySurface", "Failed to initialize dummy surface", e);
                    this.f14019c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    C7421n.m5056b("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f14020d = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public C7448d(HandlerThreadC7449a handlerThreadC7449a, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f14015b = handlerThreadC7449a;
        this.f14014a = z;
    }

    /* renamed from: b */
    public static int m4977b(Context context) {
        boolean z;
        String eglQueryString;
        String eglQueryString2;
        int i = C7408g0.f13905a;
        boolean z2 = false;
        if (i >= 24 && ((i >= 26 || (!"samsung".equals(C7408g0.f13907c) && !"XT1650".equals(C7408g0.f13908d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_EXT_protected_content")))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        if (i >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z2 = true;
        }
        if (z2) {
            return 1;
        }
        return 2;
    }

    /* renamed from: c */
    public static synchronized boolean m4976c(Context context) {
        boolean z;
        synchronized (C7448d.class) {
            if (!f14013e) {
                f14012d = m4977b(context);
                f14013e = true;
            }
            z = f14012d != 0;
        }
        return z;
    }

    /* renamed from: d */
    public static C7448d m4975d(Context context, boolean z) {
        boolean z2;
        int i;
        boolean z3 = false;
        if (z && !m4976c(context)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C7394a.m5131d(z2);
        HandlerThreadC7449a handlerThreadC7449a = new HandlerThreadC7449a();
        if (z) {
            i = f14012d;
        } else {
            i = 0;
        }
        handlerThreadC7449a.start();
        Handler handler = new Handler(handlerThreadC7449a.getLooper(), handlerThreadC7449a);
        handlerThreadC7449a.f14018b = handler;
        handlerThreadC7449a.f14017a = new EGLSurfaceTexture(handler);
        synchronized (handlerThreadC7449a) {
            handlerThreadC7449a.f14018b.obtainMessage(1, i, 0).sendToTarget();
            while (handlerThreadC7449a.f14021e == null && handlerThreadC7449a.f14020d == null && handlerThreadC7449a.f14019c == null) {
                try {
                    handlerThreadC7449a.wait();
                } catch (InterruptedException unused) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThreadC7449a.f14020d;
        if (runtimeException == null) {
            Error error = handlerThreadC7449a.f14019c;
            if (error == null) {
                C7448d c7448d = handlerThreadC7449a.f14021e;
                c7448d.getClass();
                return c7448d;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f14015b) {
            if (!this.f14016c) {
                HandlerThreadC7449a handlerThreadC7449a = this.f14015b;
                handlerThreadC7449a.f14018b.getClass();
                handlerThreadC7449a.f14018b.sendEmptyMessage(2);
                this.f14016c = true;
            }
        }
    }
}
