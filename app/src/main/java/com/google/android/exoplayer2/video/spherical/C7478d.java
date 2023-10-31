package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;

/* renamed from: com.google.android.exoplayer2.video.spherical.d */
/* loaded from: classes.dex */
public final class C7478d implements SensorEventListener {

    /* renamed from: a */
    public final float[] f14140a = new float[16];

    /* renamed from: b */
    public final float[] f14141b = new float[16];

    /* renamed from: c */
    public final float[] f14142c = new float[16];

    /* renamed from: d */
    public final float[] f14143d = new float[3];

    /* renamed from: e */
    public final Display f14144e;

    /* renamed from: f */
    public final InterfaceC7479a[] f14145f;

    /* renamed from: g */
    public boolean f14146g;

    /* renamed from: com.google.android.exoplayer2.video.spherical.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7479a {
        /* renamed from: a */
        void mo4904a(float[] fArr, float f);
    }

    public C7478d(Display display, InterfaceC7479a... interfaceC7479aArr) {
        this.f14144e = display;
        this.f14145f = interfaceC7479aArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f14140a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f14144e.getRotation();
        float[] fArr3 = this.f14141b;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i2 = 130;
                        i = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i = 129;
                i2 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f14143d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(this.f14140a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr5 = this.f14140a;
        if (!this.f14146g) {
            C7477c.m4915a(this.f14142c, fArr5);
            this.f14146g = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.f14141b, 0, this.f14142c, 0);
        for (InterfaceC7479a interfaceC7479a : this.f14145f) {
            interfaceC7479a.mo4904a(fArr2, f);
        }
    }
}
