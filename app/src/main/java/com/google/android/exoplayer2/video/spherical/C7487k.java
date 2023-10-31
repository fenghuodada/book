package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.video.InterfaceC7458j;
import com.google.android.exoplayer2.video.spherical.C7478d;
import com.google.android.exoplayer2.video.spherical.C7487k;
import com.google.android.exoplayer2.video.spherical.View$OnTouchListenerC7490l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.exoplayer2.video.spherical.k */
/* loaded from: classes.dex */
public final class C7487k extends GLSurfaceView {

    /* renamed from: a */
    public final CopyOnWriteArrayList<InterfaceC7489b> f14181a;

    /* renamed from: b */
    public final SensorManager f14182b;
    @Nullable

    /* renamed from: c */
    public final Sensor f14183c;

    /* renamed from: d */
    public final C7478d f14184d;

    /* renamed from: e */
    public final Handler f14185e;

    /* renamed from: f */
    public final C7484h f14186f;
    @Nullable

    /* renamed from: g */
    public SurfaceTexture f14187g;
    @Nullable

    /* renamed from: h */
    public Surface f14188h;

    /* renamed from: i */
    public boolean f14189i;

    /* renamed from: j */
    public boolean f14190j;

    /* renamed from: k */
    public boolean f14191k;

    @VisibleForTesting
    /* renamed from: com.google.android.exoplayer2.video.spherical.k$a */
    /* loaded from: classes.dex */
    public final class C7488a implements GLSurfaceView.Renderer, View$OnTouchListenerC7490l.InterfaceC7491a, C7478d.InterfaceC7479a {

        /* renamed from: a */
        public final C7484h f14192a;

        /* renamed from: d */
        public final float[] f14195d;

        /* renamed from: e */
        public final float[] f14196e;

        /* renamed from: f */
        public final float[] f14197f;

        /* renamed from: g */
        public float f14198g;

        /* renamed from: h */
        public float f14199h;

        /* renamed from: b */
        public final float[] f14193b = new float[16];

        /* renamed from: c */
        public final float[] f14194c = new float[16];

        /* renamed from: i */
        public final float[] f14200i = new float[16];

        /* renamed from: j */
        public final float[] f14201j = new float[16];

        public C7488a(C7484h c7484h) {
            float[] fArr = new float[16];
            this.f14195d = fArr;
            float[] fArr2 = new float[16];
            this.f14196e = fArr2;
            float[] fArr3 = new float[16];
            this.f14197f = fArr3;
            this.f14192a = c7484h;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f14199h = 3.1415927f;
        }

        @Override // com.google.android.exoplayer2.video.spherical.C7478d.InterfaceC7479a
        @BinderThread
        /* renamed from: a */
        public final synchronized void mo4904a(float[] fArr, float f) {
            float[] fArr2 = this.f14195d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.f14199h = f2;
            Matrix.setRotateM(this.f14196e, 0, -this.f14198g, (float) Math.cos(f2), (float) Math.sin(this.f14199h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f14201j, 0, this.f14195d, 0, this.f14197f, 0);
                Matrix.multiplyMM(this.f14200i, 0, this.f14196e, 0, this.f14201j, 0);
            }
            Matrix.multiplyMM(this.f14194c, 0, this.f14193b, 0, this.f14200i, 0);
            this.f14192a.m4911b(this.f14194c);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            float f;
            boolean z = false;
            GLES20.glViewport(0, 0, i, i2);
            float f2 = i / i2;
            if (f2 > 1.0f) {
                z = true;
            }
            if (z) {
                f = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d);
            } else {
                f = 90.0f;
            }
            Matrix.perspectiveM(this.f14193b, 0, f, f2, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            final C7487k c7487k = C7487k.this;
            final SurfaceTexture m4909d = this.f14192a.m4909d();
            c7487k.f14185e.post(new Runnable() { // from class: com.google.android.exoplayer2.video.spherical.i
                @Override // java.lang.Runnable
                public final void run() {
                    C7487k c7487k2 = C7487k.this;
                    SurfaceTexture surfaceTexture = c7487k2.f14187g;
                    Surface surface = c7487k2.f14188h;
                    SurfaceTexture surfaceTexture2 = m4909d;
                    Surface surface2 = new Surface(surfaceTexture2);
                    c7487k2.f14187g = surfaceTexture2;
                    c7487k2.f14188h = surface2;
                    Iterator<C7487k.InterfaceC7489b> it = c7487k2.f14181a.iterator();
                    while (it.hasNext()) {
                        it.next().mo4905g(surface2);
                    }
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                    }
                    if (surface != null) {
                        surface.release();
                    }
                }
            });
        }
    }

    /* renamed from: com.google.android.exoplayer2.video.spherical.k$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7489b {
        /* renamed from: f */
        void mo4906f();

        /* renamed from: g */
        void mo4905g(Surface surface);
    }

    public C7487k(Context context) {
        super(context, null);
        this.f14181a = new CopyOnWriteArrayList<>();
        this.f14185e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f14182b = sensorManager;
        Sensor defaultSensor = C7408g0.f13905a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f14183c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C7484h c7484h = new C7484h();
        this.f14186f = c7484h;
        C7488a c7488a = new C7488a(c7484h);
        View.OnTouchListener view$OnTouchListenerC7490l = new View$OnTouchListenerC7490l(context, c7488a);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f14184d = new C7478d(windowManager.getDefaultDisplay(), view$OnTouchListenerC7490l, c7488a);
        this.f14189i = true;
        setEGLContextClientVersion(2);
        setRenderer(c7488a);
        setOnTouchListener(view$OnTouchListenerC7490l);
    }

    /* renamed from: a */
    public final void m4907a() {
        boolean z = this.f14189i && this.f14190j;
        Sensor sensor = this.f14183c;
        if (sensor == null || z == this.f14191k) {
            return;
        }
        C7478d c7478d = this.f14184d;
        SensorManager sensorManager = this.f14182b;
        if (z) {
            sensorManager.registerListener(c7478d, sensor, 0);
        } else {
            sensorManager.unregisterListener(c7478d);
        }
        this.f14191k = z;
    }

    public InterfaceC7475a getCameraMotionListener() {
        return this.f14186f;
    }

    public InterfaceC7458j getVideoFrameMetadataListener() {
        return this.f14186f;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f14188h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14185e.post(new Runnable() { // from class: com.google.android.exoplayer2.video.spherical.j
            @Override // java.lang.Runnable
            public final void run() {
                C7487k c7487k = C7487k.this;
                Surface surface = c7487k.f14188h;
                if (surface != null) {
                    Iterator<C7487k.InterfaceC7489b> it = c7487k.f14181a.iterator();
                    while (it.hasNext()) {
                        it.next().mo4906f();
                    }
                }
                SurfaceTexture surfaceTexture = c7487k.f14187g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                c7487k.f14187g = null;
                c7487k.f14188h = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f14190j = false;
        m4907a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f14190j = true;
        m4907a();
    }

    public void setDefaultStereoMode(int i) {
        this.f14186f.f14175k = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.f14189i = z;
        m4907a();
    }
}
