package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.BitSet;

/* renamed from: com.google.android.material.shape.k */
/* loaded from: classes3.dex */
public final class C7803k {

    /* renamed from: a */
    public final C7806m[] f15257a = new C7806m[4];

    /* renamed from: b */
    public final Matrix[] f15258b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f15259c = new Matrix[4];

    /* renamed from: d */
    public final PointF f15260d = new PointF();

    /* renamed from: e */
    public final Path f15261e = new Path();

    /* renamed from: f */
    public final Path f15262f = new Path();

    /* renamed from: g */
    public final C7806m f15263g = new C7806m();

    /* renamed from: h */
    public final float[] f15264h = new float[2];

    /* renamed from: i */
    public final float[] f15265i = new float[2];

    /* renamed from: j */
    public final Path f15266j = new Path();

    /* renamed from: k */
    public final Path f15267k = new Path();

    /* renamed from: l */
    public final boolean f15268l = true;

    /* renamed from: com.google.android.material.shape.k$a */
    /* loaded from: classes3.dex */
    public static class C7804a {

        /* renamed from: a */
        public static final C7803k f15269a = new C7803k();
    }

    public C7803k() {
        for (int i = 0; i < 4; i++) {
            this.f15257a[i] = new C7806m();
            this.f15258b[i] = new Matrix();
            this.f15259c[i] = new Matrix();
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: a */
    public final void m4452a(C7801j c7801j, float f, RectF rectF, MaterialShapeDrawable.C7790a c7790a, @NonNull Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        C7806m[] c7806mArr;
        float centerX;
        float f2;
        C7797f c7797f;
        Path path2;
        MaterialShapeDrawable.C7790a c7790a2;
        char c;
        InterfaceC7794c interfaceC7794c;
        C7795d c7795d;
        float f3;
        float f4;
        float f5;
        float f6;
        C7803k c7803k = this;
        C7801j c7801j2 = c7801j;
        RectF rectF2 = rectF;
        MaterialShapeDrawable.C7790a c7790a3 = c7790a;
        Path path3 = path;
        path.rewind();
        Path path4 = c7803k.f15261e;
        path4.rewind();
        Path path5 = c7803k.f15262f;
        path5.rewind();
        path5.addRect(rectF2, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            matrixArr = c7803k.f15259c;
            fArr = c7803k.f15264h;
            matrixArr2 = c7803k.f15258b;
            c7806mArr = c7803k.f15257a;
            if (i2 >= 4) {
                break;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        interfaceC7794c = c7801j2.f15238f;
                    } else {
                        interfaceC7794c = c7801j2.f15237e;
                    }
                } else {
                    interfaceC7794c = c7801j2.f15240h;
                }
            } else {
                interfaceC7794c = c7801j2.f15239g;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        c7795d = c7801j2.f15234b;
                    } else {
                        c7795d = c7801j2.f15233a;
                    }
                } else {
                    c7795d = c7801j2.f15236d;
                }
            } else {
                c7795d = c7801j2.f15235c;
            }
            C7806m c7806m = c7806mArr[i2];
            c7795d.getClass();
            c7795d.mo4459a(f, interfaceC7794c.mo4460a(rectF2), c7806m);
            int i3 = i2 + 1;
            float f7 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = c7803k.f15260d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        f6 = rectF2.right;
                    } else {
                        f6 = rectF2.left;
                    }
                    f4 = f6;
                    f5 = rectF2.top;
                    pointF.set(f4, f5);
                    matrixArr2[i2].setTranslate(pointF.x, pointF.y);
                    matrixArr2[i2].preRotate(f7);
                    C7806m c7806m2 = c7806mArr[i2];
                    fArr[0] = c7806m2.f15274c;
                    fArr[1] = c7806m2.f15275d;
                    matrixArr2[i2].mapPoints(fArr);
                    matrixArr[i2].reset();
                    matrixArr[i2].setTranslate(fArr[0], fArr[1]);
                    matrixArr[i2].preRotate(f7);
                    rectF2 = rectF;
                    i2 = i3;
                } else {
                    f3 = rectF2.left;
                }
            } else {
                f3 = rectF2.right;
            }
            f4 = f3;
            f5 = rectF2.bottom;
            pointF.set(f4, f5);
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f7);
            C7806m c7806m22 = c7806mArr[i2];
            fArr[0] = c7806m22.f15274c;
            fArr[1] = c7806m22.f15275d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f7);
            rectF2 = rectF;
            i2 = i3;
        }
        char c2 = 1;
        char c3 = 0;
        int i4 = 0;
        while (i4 < i) {
            C7806m c7806m3 = c7806mArr[i4];
            fArr[c3] = c7806m3.f15272a;
            fArr[c2] = c7806m3.f15273b;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path3.moveTo(fArr[c3], fArr[c2]);
            } else {
                path3.lineTo(fArr[c3], fArr[c2]);
            }
            c7806mArr[i4].m4448c(matrixArr2[i4], path3);
            if (c7790a3 != null) {
                C7806m c7806m4 = c7806mArr[i4];
                Matrix matrix = matrixArr2[i4];
                MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
                BitSet bitSet = materialShapeDrawable.f15186d;
                c7806m4.getClass();
                bitSet.set(i4, false);
                c7806m4.m4449b(c7806m4.f15277f);
                materialShapeDrawable.f15184b[i4] = new C7805l(new ArrayList(c7806m4.f15279h), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            C7806m c7806m5 = c7806mArr[i4];
            fArr[0] = c7806m5.f15274c;
            fArr[1] = c7806m5.f15275d;
            matrixArr2[i4].mapPoints(fArr);
            C7806m c7806m6 = c7806mArr[i6];
            float f8 = c7806m6.f15272a;
            float[] fArr2 = c7803k.f15265i;
            fArr2[0] = f8;
            fArr2[1] = c7806m6.f15273b;
            matrixArr2[i6].mapPoints(fArr2);
            Path path6 = path4;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C7806m c7806m7 = c7806mArr[i4];
            fArr[0] = c7806m7.f15274c;
            fArr[1] = c7806m7.f15275d;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 != 1 && i4 != 3) {
                centerX = rectF.centerY();
                f2 = fArr[1];
            } else {
                centerX = rectF.centerX();
                f2 = fArr[0];
            }
            float abs = Math.abs(centerX - f2);
            C7806m c7806m8 = c7803k.f15263g;
            c7806m8.m4446e(0.0f, 270.0f, 0.0f);
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        c7797f = c7801j2.f15242j;
                    } else {
                        c7797f = c7801j2.f15241i;
                    }
                } else {
                    c7797f = c7801j2.f15244l;
                }
            } else {
                c7797f = c7801j2.f15243k;
            }
            c7797f.m4463a(max, abs, f, c7806m8);
            Path path7 = c7803k.f15266j;
            path7.reset();
            c7806m8.m4448c(matrixArr[i4], path7);
            if (c7803k.f15268l && (c7803k.m4451b(path7, i4) || c7803k.m4451b(path7, i6))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = c7806m8.f15272a;
                fArr[1] = c7806m8.f15273b;
                matrixArr[i4].mapPoints(fArr);
                path6.moveTo(fArr[0], fArr[1]);
                c7806m8.m4448c(matrixArr[i4], path6);
                c7790a2 = c7790a;
                path2 = path;
            } else {
                path2 = path;
                c7806m8.m4448c(matrixArr[i4], path2);
                c7790a2 = c7790a;
            }
            if (c7790a2 != null) {
                Matrix matrix2 = matrixArr[i4];
                MaterialShapeDrawable materialShapeDrawable2 = MaterialShapeDrawable.this;
                c = 0;
                materialShapeDrawable2.f15186d.set(i4 + 4, false);
                c7806m8.m4449b(c7806m8.f15277f);
                materialShapeDrawable2.f15185c[i4] = new C7805l(new ArrayList(c7806m8.f15279h), new Matrix(matrix2));
            } else {
                c = 0;
            }
            c7803k = this;
            c3 = c;
            i4 = i5;
            c2 = 1;
            i = 4;
            c7801j2 = c7801j;
            Path path8 = path2;
            path4 = path6;
            c7790a3 = c7790a2;
            path3 = path8;
        }
        Path path9 = path4;
        Path path10 = path3;
        path.close();
        path9.close();
        if (!path9.isEmpty()) {
            path10.op(path9, Path.Op.UNION);
        }
    }

    @RequiresApi(19)
    /* renamed from: b */
    public final boolean m4451b(Path path, int i) {
        Path path2 = this.f15267k;
        path2.reset();
        this.f15257a[i].m4448c(this.f15258b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
