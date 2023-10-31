package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(17)
/* loaded from: classes.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g */
    public static final int[] f13871g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a */
    public final Handler f13872a;

    /* renamed from: b */
    public final int[] f13873b = new int[1];
    @Nullable

    /* renamed from: c */
    public EGLDisplay f13874c;
    @Nullable

    /* renamed from: d */
    public EGLContext f13875d;
    @Nullable

    /* renamed from: e */
    public EGLSurface f13876e;
    @Nullable

    /* renamed from: f */
    public SurfaceTexture f13877f;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SecureMode {
    }

    /* renamed from: com.google.android.exoplayer2.util.EGLSurfaceTexture$a */
    /* loaded from: classes.dex */
    public static final class C7393a extends RuntimeException {
        public C7393a(String str) {
            super(str);
        }
    }

    public EGLSurfaceTexture(Handler handler) {
        this.f13872a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f13872a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f13877f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
