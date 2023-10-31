package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import com.google.android.material.shadow.C7788a;
import java.util.ArrayList;

/* renamed from: com.google.android.material.shape.m */
/* loaded from: classes3.dex */
public final class C7806m {
    @Deprecated

    /* renamed from: a */
    public float f15272a;
    @Deprecated

    /* renamed from: b */
    public float f15273b;
    @Deprecated

    /* renamed from: c */
    public float f15274c;
    @Deprecated

    /* renamed from: d */
    public float f15275d;
    @Deprecated

    /* renamed from: e */
    public float f15276e;
    @Deprecated

    /* renamed from: f */
    public float f15277f;

    /* renamed from: g */
    public final ArrayList f15278g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f15279h = new ArrayList();

    /* renamed from: com.google.android.material.shape.m$a */
    /* loaded from: classes3.dex */
    public static class C7807a extends AbstractC7812f {

        /* renamed from: c */
        public final C7809c f15280c;

        public C7807a(C7809c c7809c) {
            this.f15280c = c7809c;
        }

        @Override // com.google.android.material.shape.C7806m.AbstractC7812f
        /* renamed from: a */
        public final void mo4443a(Matrix matrix, @NonNull C7788a c7788a, int i, @NonNull Canvas canvas) {
            boolean z;
            C7809c c7809c = this.f15280c;
            float f = c7809c.f15289f;
            float f2 = c7809c.f15290g;
            RectF rectF = new RectF(c7809c.f15285b, c7809c.f15286c, c7809c.f15287d, c7809c.f15288e);
            c7788a.getClass();
            if (f2 < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Path path = c7788a.f15180g;
            int[] iArr = C7788a.f15172k;
            if (z) {
                iArr[0] = 0;
                iArr[1] = c7788a.f15179f;
                iArr[2] = c7788a.f15178e;
                iArr[3] = c7788a.f15177d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                iArr[0] = 0;
                iArr[1] = c7788a.f15177d;
                iArr[2] = c7788a.f15178e;
                iArr[3] = c7788a.f15179f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f4 = 1.0f - (i / width);
                float[] fArr = C7788a.f15173l;
                fArr[1] = f4;
                fArr[2] = ((1.0f - f4) / 2.0f) + f4;
                RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
                Paint paint = c7788a.f15175b;
                paint.setShader(radialGradient);
                canvas.save();
                canvas.concat(matrix);
                canvas.scale(1.0f, rectF.height() / rectF.width());
                if (!z) {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                    canvas.drawPath(path, c7788a.f15181h);
                }
                canvas.drawArc(rectF, f, f2, true, paint);
                canvas.restore();
            }
        }
    }

    /* renamed from: com.google.android.material.shape.m$b */
    /* loaded from: classes3.dex */
    public static class C7808b extends AbstractC7812f {

        /* renamed from: c */
        public final C7810d f15281c;

        /* renamed from: d */
        public final float f15282d;

        /* renamed from: e */
        public final float f15283e;

        public C7808b(C7810d c7810d, float f, float f2) {
            this.f15281c = c7810d;
            this.f15282d = f;
            this.f15283e = f2;
        }

        @Override // com.google.android.material.shape.C7806m.AbstractC7812f
        /* renamed from: a */
        public final void mo4443a(Matrix matrix, @NonNull C7788a c7788a, int i, @NonNull Canvas canvas) {
            C7810d c7810d = this.f15281c;
            float f = c7810d.f15292c;
            float f2 = this.f15283e;
            float f3 = c7810d.f15291b;
            float f4 = this.f15282d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = this.f15295a;
            matrix2.set(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(m4445b());
            c7788a.getClass();
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = C7788a.f15170i;
            iArr[0] = c7788a.f15179f;
            iArr[1] = c7788a.f15178e;
            iArr[2] = c7788a.f15177d;
            Paint paint = c7788a.f15176c;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C7788a.f15171j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        /* renamed from: b */
        public final float m4445b() {
            C7810d c7810d = this.f15281c;
            return (float) Math.toDegrees(Math.atan((c7810d.f15292c - this.f15283e) / (c7810d.f15291b - this.f15282d)));
        }
    }

    /* renamed from: com.google.android.material.shape.m$c */
    /* loaded from: classes3.dex */
    public static class C7809c extends AbstractC7811e {

        /* renamed from: h */
        public static final RectF f15284h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f15285b;
        @Deprecated

        /* renamed from: c */
        public float f15286c;
        @Deprecated

        /* renamed from: d */
        public float f15287d;
        @Deprecated

        /* renamed from: e */
        public float f15288e;
        @Deprecated

        /* renamed from: f */
        public float f15289f;
        @Deprecated

        /* renamed from: g */
        public float f15290g;

        public C7809c(float f, float f2, float f3, float f4) {
            this.f15285b = f;
            this.f15286c = f2;
            this.f15287d = f3;
            this.f15288e = f4;
        }

        @Override // com.google.android.material.shape.C7806m.AbstractC7811e
        /* renamed from: a */
        public final void mo4444a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f15293a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f15284h;
            rectF.set(this.f15285b, this.f15286c, this.f15287d, this.f15288e);
            path.arcTo(rectF, this.f15289f, this.f15290g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: com.google.android.material.shape.m$d */
    /* loaded from: classes3.dex */
    public static class C7810d extends AbstractC7811e {

        /* renamed from: b */
        public float f15291b;

        /* renamed from: c */
        public float f15292c;

        @Override // com.google.android.material.shape.C7806m.AbstractC7811e
        /* renamed from: a */
        public final void mo4444a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f15293a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f15291b, this.f15292c);
            path.transform(matrix);
        }
    }

    /* renamed from: com.google.android.material.shape.m$e */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7811e {

        /* renamed from: a */
        public final Matrix f15293a = new Matrix();

        /* renamed from: a */
        public abstract void mo4444a(Matrix matrix, Path path);
    }

    /* renamed from: com.google.android.material.shape.m$f */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7812f {

        /* renamed from: b */
        public static final Matrix f15294b = new Matrix();

        /* renamed from: a */
        public final Matrix f15295a = new Matrix();

        /* renamed from: a */
        public abstract void mo4443a(Matrix matrix, C7788a c7788a, int i, Canvas canvas);
    }

    public C7806m() {
        m4446e(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m4450a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        C7809c c7809c = new C7809c(f, f2, f3, f4);
        c7809c.f15289f = f5;
        c7809c.f15290g = f6;
        this.f15278g.add(c7809c);
        C7807a c7807a = new C7807a(c7809c);
        float f8 = f5 + f6;
        if (f6 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        m4449b(f5);
        this.f15279h.add(c7807a);
        this.f15276e = f7;
        double d = f8;
        this.f15274c = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.f15275d = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    /* renamed from: b */
    public final void m4449b(float f) {
        float f2 = this.f15276e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f15274c;
        float f5 = this.f15275d;
        C7809c c7809c = new C7809c(f4, f5, f4, f5);
        c7809c.f15289f = this.f15276e;
        c7809c.f15290g = f3;
        this.f15279h.add(new C7807a(c7809c));
        this.f15276e = f;
    }

    /* renamed from: c */
    public final void m4448c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f15278g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7811e) arrayList.get(i)).mo4444a(matrix, path);
        }
    }

    /* renamed from: d */
    public final void m4447d(float f, float f2) {
        C7810d c7810d = new C7810d();
        c7810d.f15291b = f;
        c7810d.f15292c = f2;
        this.f15278g.add(c7810d);
        C7808b c7808b = new C7808b(c7810d, this.f15274c, this.f15275d);
        m4449b(c7808b.m4445b() + 270.0f);
        this.f15279h.add(c7808b);
        this.f15276e = c7808b.m4445b() + 270.0f;
        this.f15274c = f;
        this.f15275d = f2;
    }

    /* renamed from: e */
    public final void m4446e(float f, float f2, float f3) {
        this.f15272a = 0.0f;
        this.f15273b = f;
        this.f15274c = 0.0f;
        this.f15275d = f;
        this.f15276e = f2;
        this.f15277f = (f2 + f3) % 360.0f;
        this.f15278g.clear();
        this.f15279h.clear();
    }
}
