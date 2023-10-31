package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0547l;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.nio.FloatBuffer;

/* renamed from: com.google.android.exoplayer2.video.spherical.f */
/* loaded from: classes.dex */
public final class C7481f {

    /* renamed from: i */
    public static final String[] f14147i = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: j */
    public static final String[] f14148j = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: k */
    public static final float[] f14149k = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: l */
    public static final float[] f14150l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: m */
    public static final float[] f14151m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public int f14152a;
    @Nullable

    /* renamed from: b */
    public C7482a f14153b;

    /* renamed from: c */
    public int f14154c;

    /* renamed from: d */
    public int f14155d;

    /* renamed from: e */
    public int f14156e;

    /* renamed from: f */
    public int f14157f;

    /* renamed from: g */
    public int f14158g;

    /* renamed from: h */
    public int f14159h;

    /* renamed from: com.google.android.exoplayer2.video.spherical.f$a */
    /* loaded from: classes.dex */
    public static class C7482a {

        /* renamed from: a */
        public final int f14160a;

        /* renamed from: b */
        public final FloatBuffer f14161b;

        /* renamed from: c */
        public final FloatBuffer f14162c;

        /* renamed from: d */
        public final int f14163d;

        public C7482a(Projection.C7474b c7474b) {
            int i;
            float[] fArr = c7474b.f14129c;
            this.f14160a = fArr.length / 3;
            this.f14161b = C0547l.m12203e(fArr);
            this.f14162c = C0547l.m12203e(c7474b.f14130d);
            int i2 = c7474b.f14128b;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                } else {
                    i = 6;
                }
            } else {
                i = 5;
            }
            this.f14163d = i;
        }
    }

    /* renamed from: a */
    public static boolean m4913a(Projection projection) {
        Projection.C7474b[] c7474bArr = projection.f14122a.f14126a;
        if (c7474bArr.length != 1 || c7474bArr[0].f14127a != 0) {
            return false;
        }
        Projection.C7474b[] c7474bArr2 = projection.f14123b.f14126a;
        if (c7474bArr2.length != 1 || c7474bArr2[0].f14127a != 0) {
            return false;
        }
        return true;
    }
}
