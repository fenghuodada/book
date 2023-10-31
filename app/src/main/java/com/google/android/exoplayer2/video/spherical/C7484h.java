package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0547l;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.util.C7402d0;
import com.google.android.exoplayer2.util.C7436v;
import com.google.android.exoplayer2.video.InterfaceC7458j;
import com.google.android.exoplayer2.video.spherical.C7481f;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;

/* renamed from: com.google.android.exoplayer2.video.spherical.h */
/* loaded from: classes.dex */
public final class C7484h implements InterfaceC7458j, InterfaceC7475a {

    /* renamed from: i */
    public int f14173i;

    /* renamed from: j */
    public SurfaceTexture f14174j;
    @Nullable

    /* renamed from: m */
    public byte[] f14177m;

    /* renamed from: a */
    public final AtomicBoolean f14165a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicBoolean f14166b = new AtomicBoolean(true);

    /* renamed from: c */
    public final C7481f f14167c = new C7481f();

    /* renamed from: d */
    public final C7477c f14168d = new C7477c();

    /* renamed from: e */
    public final C7402d0<Long> f14169e = new C7402d0<>();

    /* renamed from: f */
    public final C7402d0<Projection> f14170f = new C7402d0<>();

    /* renamed from: g */
    public final float[] f14171g = new float[16];

    /* renamed from: h */
    public final float[] f14172h = new float[16];

    /* renamed from: k */
    public volatile int f14175k = 0;

    /* renamed from: l */
    public int f14176l = -1;

    @Override // com.google.android.exoplayer2.video.spherical.InterfaceC7475a
    /* renamed from: a */
    public final void mo4912a(long j, float[] fArr) {
        this.f14168d.f14138c.m5118a(j, fArr);
    }

    /* renamed from: b */
    public final void m4911b(float[] fArr) {
        float[] fArr2;
        Long m5115d;
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        C0547l.m12206b();
        if (this.f14165a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f14174j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            C0547l.m12206b();
            if (this.f14166b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f14171g, 0);
            }
            long timestamp = this.f14174j.getTimestamp();
            C7402d0<Long> c7402d0 = this.f14169e;
            synchronized (c7402d0) {
                m5115d = c7402d0.m5115d(timestamp, false);
            }
            Long l = m5115d;
            if (l != null) {
                C7477c c7477c = this.f14168d;
                float[] fArr3 = this.f14171g;
                float[] m5114e = c7477c.f14138c.m5114e(l.longValue());
                if (m5114e != null) {
                    float[] fArr4 = c7477c.f14137b;
                    float f = m5114e[0];
                    float f2 = -m5114e[1];
                    float f3 = -m5114e[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!c7477c.f14139d) {
                        C7477c.m4915a(c7477c.f14136a, c7477c.f14137b);
                        c7477c.f14139d = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, c7477c.f14136a, 0, c7477c.f14137b, 0);
                }
            }
            Projection m5114e2 = this.f14170f.m5114e(timestamp);
            if (m5114e2 != null) {
                C7481f c7481f = this.f14167c;
                c7481f.getClass();
                if (C7481f.m4913a(m5114e2)) {
                    c7481f.f14152a = m5114e2.f14124c;
                    c7481f.f14153b = new C7481f.C7482a(m5114e2.f14122a.f14126a[0]);
                    if (!m5114e2.f14125d) {
                        new C7481f.C7482a(m5114e2.f14123b.f14126a[0]);
                    }
                    c7481f.getClass();
                }
            }
        }
        Matrix.multiplyMM(this.f14172h, 0, fArr, 0, this.f14171g, 0);
        C7481f c7481f2 = this.f14167c;
        int i = this.f14173i;
        float[] fArr5 = this.f14172h;
        C7481f.C7482a c7482a = c7481f2.f14153b;
        if (c7482a != null) {
            GLES20.glUseProgram(c7481f2.f14154c);
            C0547l.m12206b();
            GLES20.glEnableVertexAttribArray(c7481f2.f14157f);
            GLES20.glEnableVertexAttribArray(c7481f2.f14158g);
            C0547l.m12206b();
            int i2 = c7481f2.f14152a;
            if (i2 == 1) {
                fArr2 = C7481f.f14150l;
            } else if (i2 == 2) {
                fArr2 = C7481f.f14151m;
            } else {
                fArr2 = C7481f.f14149k;
            }
            GLES20.glUniformMatrix3fv(c7481f2.f14156e, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(c7481f2.f14155d, 1, false, fArr5, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(c7481f2.f14159h, 0);
            C0547l.m12206b();
            GLES20.glVertexAttribPointer(c7481f2.f14157f, 3, 5126, false, 12, (Buffer) c7482a.f14161b);
            C0547l.m12206b();
            GLES20.glVertexAttribPointer(c7481f2.f14158g, 2, 5126, false, 8, (Buffer) c7482a.f14162c);
            C0547l.m12206b();
            GLES20.glDrawArrays(c7482a.f14163d, 0, c7482a.f14160a);
            C0547l.m12206b();
            GLES20.glDisableVertexAttribArray(c7481f2.f14157f);
            GLES20.glDisableVertexAttribArray(c7481f2.f14158g);
        }
    }

    @Override // com.google.android.exoplayer2.video.spherical.InterfaceC7475a
    /* renamed from: c */
    public final void mo4910c() {
        this.f14169e.m5117b();
        C7477c c7477c = this.f14168d;
        c7477c.f14138c.m5117b();
        c7477c.f14139d = false;
        this.f14166b.set(true);
    }

    /* renamed from: d */
    public final SurfaceTexture m4909d() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        C0547l.m12206b();
        C7481f c7481f = this.f14167c;
        c7481f.getClass();
        int m12204d = C0547l.m12204d(TextUtils.join("\n", C7481f.f14147i), TextUtils.join("\n", C7481f.f14148j));
        c7481f.f14154c = m12204d;
        c7481f.f14155d = GLES20.glGetUniformLocation(m12204d, "uMvpMatrix");
        c7481f.f14156e = GLES20.glGetUniformLocation(c7481f.f14154c, "uTexMatrix");
        c7481f.f14157f = GLES20.glGetAttribLocation(c7481f.f14154c, "aPosition");
        c7481f.f14158g = GLES20.glGetAttribLocation(c7481f.f14154c, "aTexCoords");
        c7481f.f14159h = GLES20.glGetUniformLocation(c7481f.f14154c, "uTexture");
        C0547l.m12206b();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        C0547l.m12206b();
        this.f14173i = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f14173i);
        this.f14174j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.google.android.exoplayer2.video.spherical.g
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C7484h.this.f14165a.set(true);
            }
        });
        return this.f14174j;
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC7458j
    /* renamed from: f */
    public final void mo4908f(long j, long j2, C7003m0 c7003m0, @Nullable MediaFormat mediaFormat) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        ArrayList<Projection.C7473a> arrayList;
        boolean z;
        this.f14169e.m5118a(j2, Long.valueOf(j));
        byte[] bArr = c7003m0.f12297v;
        int i4 = c7003m0.f12298w;
        byte[] bArr2 = this.f14177m;
        int i5 = this.f14176l;
        this.f14177m = bArr;
        if (i4 == -1) {
            i4 = this.f14175k;
        }
        this.f14176l = i4;
        if (i5 != i4 || !Arrays.equals(bArr2, this.f14177m)) {
            byte[] bArr3 = this.f14177m;
            Projection projection = null;
            if (bArr3 != null) {
                int i6 = this.f14176l;
                C7436v c7436v = new C7436v(bArr3);
                try {
                    c7436v.m5018A(4);
                    int m5015c = c7436v.m5015c();
                    c7436v.m4992z(0);
                    if (m5015c == 1886547818) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (z) {
                    c7436v.m5018A(8);
                    int i7 = c7436v.f13979b;
                    int i8 = c7436v.f13980c;
                    while (i7 < i8) {
                        int m5015c2 = c7436v.m5015c() + i7;
                        if (m5015c2 <= i7 || m5015c2 > i8) {
                            break;
                        }
                        int m5015c3 = c7436v.m5015c();
                        if (m5015c3 != 2037673328 && m5015c3 != 1836279920) {
                            c7436v.m4992z(m5015c2);
                            i7 = m5015c2;
                        }
                        c7436v.m4993y(m5015c2);
                        arrayList = C7480e.m4914a(c7436v);
                        break;
                    }
                    arrayList = null;
                } else {
                    arrayList = C7480e.m4914a(c7436v);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size != 1) {
                        if (size == 2) {
                            projection = new Projection(arrayList.get(0), arrayList.get(1), i6);
                        }
                    } else {
                        Projection.C7473a c7473a = arrayList.get(0);
                        projection = new Projection(c7473a, c7473a, i6);
                    }
                }
            }
            if (projection == null || !C7481f.m4913a(projection)) {
                int i9 = this.f14176l;
                float radians = (float) Math.toRadians(180.0f);
                float radians2 = (float) Math.toRadians(360.0f);
                float f3 = radians / 36;
                float f4 = radians2 / 72;
                float[] fArr = new float[15984];
                float[] fArr2 = new float[10656];
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 36; i10 < i13; i13 = 36) {
                    float f5 = radians / 2.0f;
                    float f6 = (i10 * f3) - f5;
                    int i14 = i10 + 1;
                    float f7 = (i14 * f3) - f5;
                    int i15 = 0;
                    while (i15 < 73) {
                        int i16 = i14;
                        int i17 = 0;
                        int i18 = 2;
                        while (i17 < i18) {
                            if (i17 == 0) {
                                f2 = f7;
                                f = f6;
                            } else {
                                f = f7;
                                f2 = f;
                            }
                            float f8 = i15 * f4;
                            float f9 = f6;
                            int i19 = i11 + 1;
                            float f10 = f4;
                            double d = 50.0f;
                            int i20 = i15;
                            double d2 = (f8 + 3.1415927f) - (radians2 / 2.0f);
                            float f11 = f3;
                            double d3 = f;
                            int i21 = i9;
                            int i22 = i17;
                            fArr[i11] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                            int i23 = i19 + 1;
                            fArr[i19] = (float) (Math.sin(d3) * d);
                            int i24 = i23 + 1;
                            fArr[i23] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                            int i25 = i12 + 1;
                            fArr2[i12] = f8 / radians2;
                            int i26 = i25 + 1;
                            fArr2[i25] = ((i10 + i22) * f11) / radians;
                            if (i20 == 0 && i22 == 0) {
                                i = i20;
                                i2 = i22;
                            } else {
                                i = i20;
                                i2 = i22;
                                if (i != 72 || i2 != 1) {
                                    i3 = 2;
                                    i12 = i26;
                                    i11 = i24;
                                    i17 = i2 + 1;
                                    i15 = i;
                                    i18 = i3;
                                    f7 = f2;
                                    f4 = f10;
                                    f6 = f9;
                                    f3 = f11;
                                    i9 = i21;
                                }
                            }
                            System.arraycopy(fArr, i24 - 3, fArr, i24, 3);
                            i24 += 3;
                            i3 = 2;
                            System.arraycopy(fArr2, i26 - 2, fArr2, i26, 2);
                            i26 += 2;
                            i12 = i26;
                            i11 = i24;
                            i17 = i2 + 1;
                            i15 = i;
                            i18 = i3;
                            f7 = f2;
                            f4 = f10;
                            f6 = f9;
                            f3 = f11;
                            i9 = i21;
                        }
                        i15++;
                        i14 = i16;
                        f6 = f6;
                        i9 = i9;
                    }
                    i10 = i14;
                }
                Projection.C7473a c7473a2 = new Projection.C7473a(new Projection.C7474b(0, fArr, fArr2, 1));
                projection = new Projection(c7473a2, c7473a2, i9);
            }
            this.f14170f.m5118a(j2, projection);
        }
    }
}
