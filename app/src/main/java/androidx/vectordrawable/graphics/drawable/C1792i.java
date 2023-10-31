package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.C0470b;
import androidx.core.content.res.C0674d;
import androidx.core.graphics.C0694d;
import androidx.core.graphics.drawable.C0700a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.i */
/* loaded from: classes.dex */
public final class C1792i extends AbstractC1791h {

    /* renamed from: j */
    public static final PorterDuff.Mode f4320j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public C1799g f4321b;

    /* renamed from: c */
    public PorterDuffColorFilter f4322c;

    /* renamed from: d */
    public ColorFilter f4323d;

    /* renamed from: e */
    public boolean f4324e;

    /* renamed from: f */
    public boolean f4325f;

    /* renamed from: g */
    public final float[] f4326g;

    /* renamed from: h */
    public final Matrix f4327h;

    /* renamed from: i */
    public final Rect f4328i;

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$a */
    /* loaded from: classes.dex */
    public static class C1793a extends AbstractC1797e {
        public C1793a() {
        }

        public C1793a(C1793a c1793a) {
            super(c1793a);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$b */
    /* loaded from: classes.dex */
    public static class C1794b extends AbstractC1797e {

        /* renamed from: e */
        public C0674d f4329e;

        /* renamed from: f */
        public float f4330f;

        /* renamed from: g */
        public C0674d f4331g;

        /* renamed from: h */
        public float f4332h;

        /* renamed from: i */
        public float f4333i;

        /* renamed from: j */
        public float f4334j;

        /* renamed from: k */
        public float f4335k;

        /* renamed from: l */
        public float f4336l;

        /* renamed from: m */
        public Paint.Cap f4337m;

        /* renamed from: n */
        public Paint.Join f4338n;

        /* renamed from: o */
        public float f4339o;

        public C1794b() {
            this.f4330f = 0.0f;
            this.f4332h = 1.0f;
            this.f4333i = 1.0f;
            this.f4334j = 0.0f;
            this.f4335k = 1.0f;
            this.f4336l = 0.0f;
            this.f4337m = Paint.Cap.BUTT;
            this.f4338n = Paint.Join.MITER;
            this.f4339o = 4.0f;
        }

        public C1794b(C1794b c1794b) {
            super(c1794b);
            this.f4330f = 0.0f;
            this.f4332h = 1.0f;
            this.f4333i = 1.0f;
            this.f4334j = 0.0f;
            this.f4335k = 1.0f;
            this.f4336l = 0.0f;
            this.f4337m = Paint.Cap.BUTT;
            this.f4338n = Paint.Join.MITER;
            this.f4339o = 4.0f;
            this.f4329e = c1794b.f4329e;
            this.f4330f = c1794b.f4330f;
            this.f4332h = c1794b.f4332h;
            this.f4331g = c1794b.f4331g;
            this.f4354c = c1794b.f4354c;
            this.f4333i = c1794b.f4333i;
            this.f4334j = c1794b.f4334j;
            this.f4335k = c1794b.f4335k;
            this.f4336l = c1794b.f4336l;
            this.f4337m = c1794b.f4337m;
            this.f4338n = c1794b.f4338n;
            this.f4339o = c1794b.f4339o;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1792i.AbstractC1796d
        /* renamed from: a */
        public final boolean mo9939a() {
            return this.f4331g.m11991b() || this.f4329e.m11991b();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        @Override // androidx.vectordrawable.graphics.drawable.C1792i.AbstractC1796d
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean mo9938b(int[] r7) {
            /*
                r6 = this;
                androidx.core.content.res.d r0 = r6.f4331g
                boolean r1 = r0.m11991b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f2352b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f2353c
                if (r1 == r4) goto L1c
                r0.f2353c = r1
                r0 = r2
                goto L1d
            L1c:
                r0 = r3
            L1d:
                androidx.core.content.res.d r1 = r6.f4329e
                boolean r4 = r1.m11991b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f2352b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f2353c
                if (r7 == r4) goto L36
                r1.f2353c = r7
                goto L37
            L36:
                r2 = r3
            L37:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1792i.C1794b.mo9938b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f4333i;
        }

        @ColorInt
        public int getFillColor() {
            return this.f4331g.f2353c;
        }

        public float getStrokeAlpha() {
            return this.f4332h;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f4329e.f2353c;
        }

        public float getStrokeWidth() {
            return this.f4330f;
        }

        public float getTrimPathEnd() {
            return this.f4335k;
        }

        public float getTrimPathOffset() {
            return this.f4336l;
        }

        public float getTrimPathStart() {
            return this.f4334j;
        }

        public void setFillAlpha(float f) {
            this.f4333i = f;
        }

        public void setFillColor(int i) {
            this.f4331g.f2353c = i;
        }

        public void setStrokeAlpha(float f) {
            this.f4332h = f;
        }

        public void setStrokeColor(int i) {
            this.f4329e.f2353c = i;
        }

        public void setStrokeWidth(float f) {
            this.f4330f = f;
        }

        public void setTrimPathEnd(float f) {
            this.f4335k = f;
        }

        public void setTrimPathOffset(float f) {
            this.f4336l = f;
        }

        public void setTrimPathStart(float f) {
            this.f4334j = f;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1796d {
        /* renamed from: a */
        public boolean mo9939a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo9938b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$f */
    /* loaded from: classes.dex */
    public static class C1798f {

        /* renamed from: p */
        public static final Matrix f4356p = new Matrix();

        /* renamed from: a */
        public final Path f4357a;

        /* renamed from: b */
        public final Path f4358b;

        /* renamed from: c */
        public final Matrix f4359c;

        /* renamed from: d */
        public Paint f4360d;

        /* renamed from: e */
        public Paint f4361e;

        /* renamed from: f */
        public PathMeasure f4362f;

        /* renamed from: g */
        public final C1795c f4363g;

        /* renamed from: h */
        public float f4364h;

        /* renamed from: i */
        public float f4365i;

        /* renamed from: j */
        public float f4366j;

        /* renamed from: k */
        public float f4367k;

        /* renamed from: l */
        public int f4368l;

        /* renamed from: m */
        public String f4369m;

        /* renamed from: n */
        public Boolean f4370n;

        /* renamed from: o */
        public final C0470b<String, Object> f4371o;

        public C1798f() {
            this.f4359c = new Matrix();
            this.f4364h = 0.0f;
            this.f4365i = 0.0f;
            this.f4366j = 0.0f;
            this.f4367k = 0.0f;
            this.f4368l = 255;
            this.f4369m = null;
            this.f4370n = null;
            this.f4371o = new C0470b<>();
            this.f4363g = new C1795c();
            this.f4357a = new Path();
            this.f4358b = new Path();
        }

        public C1798f(C1798f c1798f) {
            this.f4359c = new Matrix();
            this.f4364h = 0.0f;
            this.f4365i = 0.0f;
            this.f4366j = 0.0f;
            this.f4367k = 0.0f;
            this.f4368l = 255;
            this.f4369m = null;
            this.f4370n = null;
            C0470b<String, Object> c0470b = new C0470b<>();
            this.f4371o = c0470b;
            this.f4363g = new C1795c(c1798f.f4363g, c0470b);
            this.f4357a = new Path(c1798f.f4357a);
            this.f4358b = new Path(c1798f.f4358b);
            this.f4364h = c1798f.f4364h;
            this.f4365i = c1798f.f4365i;
            this.f4366j = c1798f.f4366j;
            this.f4367k = c1798f.f4367k;
            this.f4368l = c1798f.f4368l;
            this.f4369m = c1798f.f4369m;
            String str = c1798f.f4369m;
            if (str != null) {
                c0470b.put(str, this);
            }
            this.f4370n = c1798f.f4370n;
        }

        /* renamed from: a */
        public final void m9937a(C1795c c1795c, Matrix matrix, Canvas canvas, int i, int i2) {
            int i3;
            float f;
            float f2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            Path.FillType fillType;
            Path.FillType fillType2;
            c1795c.f4340a.set(matrix);
            Matrix matrix2 = c1795c.f4340a;
            matrix2.preConcat(c1795c.f4349j);
            canvas.save();
            char c = 0;
            int i4 = 0;
            while (true) {
                ArrayList<AbstractC1796d> arrayList = c1795c.f4341b;
                if (i4 < arrayList.size()) {
                    AbstractC1796d abstractC1796d = arrayList.get(i4);
                    if (abstractC1796d instanceof C1795c) {
                        m9937a((C1795c) abstractC1796d, matrix2, canvas, i, i2);
                    } else if (abstractC1796d instanceof AbstractC1797e) {
                        AbstractC1797e abstractC1797e = (AbstractC1797e) abstractC1796d;
                        float f3 = i / this.f4366j;
                        float f4 = i2 / this.f4367k;
                        float min = Math.min(f3, f4);
                        Matrix matrix3 = this.f4359c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f3, f4);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        i3 = i4;
                        float hypot = (float) Math.hypot(fArr[2], fArr[3]);
                        float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float max = Math.max((float) Math.hypot(fArr[c], fArr[1]), hypot);
                        if (max > 0.0f) {
                            f = Math.abs(f5) / max;
                        } else {
                            f = 0.0f;
                        }
                        if (f != 0.0f) {
                            abstractC1797e.getClass();
                            Path path = this.f4357a;
                            path.reset();
                            C0694d.C0695a[] c0695aArr = abstractC1797e.f4352a;
                            if (c0695aArr != null) {
                                C0694d.C0695a.m11957b(c0695aArr, path);
                            }
                            Path path2 = this.f4358b;
                            path2.reset();
                            if (abstractC1797e instanceof C1793a) {
                                if (abstractC1797e.f4354c == 0) {
                                    fillType2 = Path.FillType.WINDING;
                                } else {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType2);
                                path2.addPath(path, matrix3);
                                canvas.clipPath(path2);
                            } else {
                                C1794b c1794b = (C1794b) abstractC1797e;
                                float f6 = c1794b.f4334j;
                                if (f6 != 0.0f || c1794b.f4335k != 1.0f) {
                                    float f7 = c1794b.f4336l;
                                    float f8 = (f6 + f7) % 1.0f;
                                    float f9 = (c1794b.f4335k + f7) % 1.0f;
                                    if (this.f4362f == null) {
                                        this.f4362f = new PathMeasure();
                                    }
                                    this.f4362f.setPath(path, false);
                                    float length = this.f4362f.getLength();
                                    float f10 = f8 * length;
                                    float f11 = f9 * length;
                                    path.reset();
                                    if (f10 > f11) {
                                        this.f4362f.getSegment(f10, length, path, true);
                                        f2 = 0.0f;
                                        this.f4362f.getSegment(0.0f, f11, path, true);
                                    } else {
                                        f2 = 0.0f;
                                        this.f4362f.getSegment(f10, f11, path, true);
                                    }
                                    path.rLineTo(f2, f2);
                                }
                                path2.addPath(path, matrix3);
                                C0674d c0674d = c1794b.f4331g;
                                if (c0674d.f2351a != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z && c0674d.f2353c == 0) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    if (this.f4361e == null) {
                                        Paint paint = new Paint(1);
                                        this.f4361e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f4361e;
                                    Shader shader = c0674d.f2351a;
                                    if (shader != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(c1794b.f4333i * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i5 = c0674d.f2353c;
                                        float f12 = c1794b.f4333i;
                                        PorterDuff.Mode mode = C1792i.f4320j;
                                        paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f12)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    if (c1794b.f4354c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas.drawPath(path2, paint2);
                                }
                                C0674d c0674d2 = c1794b.f4329e;
                                if (c0674d2.f2351a != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3 && c0674d2.f2353c == 0) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (z4) {
                                    if (this.f4360d == null) {
                                        z5 = true;
                                        Paint paint3 = new Paint(1);
                                        this.f4360d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    } else {
                                        z5 = true;
                                    }
                                    Paint paint4 = this.f4360d;
                                    Paint.Join join = c1794b.f4338n;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = c1794b.f4337m;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(c1794b.f4339o);
                                    Shader shader2 = c0674d2.f2351a;
                                    if (shader2 == null) {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(c1794b.f4332h * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i6 = c0674d2.f2353c;
                                        float f13 = c1794b.f4332h;
                                        PorterDuff.Mode mode2 = C1792i.f4320j;
                                        paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(c1794b.f4330f * f * min);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                        i4 = i3 + 1;
                        c = 0;
                    }
                    i3 = i4;
                    i4 = i3 + 1;
                    c = 0;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4368l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f4368l = i;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$g */
    /* loaded from: classes.dex */
    public static class C1799g extends Drawable.ConstantState {

        /* renamed from: a */
        public int f4372a;

        /* renamed from: b */
        public C1798f f4373b;

        /* renamed from: c */
        public ColorStateList f4374c;

        /* renamed from: d */
        public PorterDuff.Mode f4375d;

        /* renamed from: e */
        public boolean f4376e;

        /* renamed from: f */
        public Bitmap f4377f;

        /* renamed from: g */
        public ColorStateList f4378g;

        /* renamed from: h */
        public PorterDuff.Mode f4379h;

        /* renamed from: i */
        public int f4380i;

        /* renamed from: j */
        public boolean f4381j;

        /* renamed from: k */
        public boolean f4382k;

        /* renamed from: l */
        public Paint f4383l;

        public C1799g() {
            this.f4374c = null;
            this.f4375d = C1792i.f4320j;
            this.f4373b = new C1798f();
        }

        public C1799g(C1799g c1799g) {
            this.f4374c = null;
            this.f4375d = C1792i.f4320j;
            if (c1799g != null) {
                this.f4372a = c1799g.f4372a;
                C1798f c1798f = new C1798f(c1799g.f4373b);
                this.f4373b = c1798f;
                if (c1799g.f4373b.f4361e != null) {
                    c1798f.f4361e = new Paint(c1799g.f4373b.f4361e);
                }
                if (c1799g.f4373b.f4360d != null) {
                    this.f4373b.f4360d = new Paint(c1799g.f4373b.f4360d);
                }
                this.f4374c = c1799g.f4374c;
                this.f4375d = c1799g.f4375d;
                this.f4376e = c1799g.f4376e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4372a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new C1792i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new C1792i(this);
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$h */
    /* loaded from: classes.dex */
    public static class C1800h extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f4384a;

        public C1800h(Drawable.ConstantState constantState) {
            this.f4384a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f4384a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4384a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            C1792i c1792i = new C1792i();
            c1792i.f4319a = (VectorDrawable) this.f4384a.newDrawable();
            return c1792i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            C1792i c1792i = new C1792i();
            c1792i.f4319a = (VectorDrawable) this.f4384a.newDrawable(resources);
            return c1792i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1792i c1792i = new C1792i();
            c1792i.f4319a = (VectorDrawable) this.f4384a.newDrawable(resources, theme);
            return c1792i;
        }
    }

    public C1792i() {
        this.f4325f = true;
        this.f4326g = new float[9];
        this.f4327h = new Matrix();
        this.f4328i = new Rect();
        this.f4321b = new C1799g();
    }

    public C1792i(@NonNull C1799g c1799g) {
        this.f4325f = true;
        this.f4326g = new float[9];
        this.f4327h = new Matrix();
        this.f4328i = new Rect();
        this.f4321b = c1799g;
        this.f4322c = m9941a(c1799g.f4374c, c1799g.f4375d);
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m9941a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            C0700a.C0702b.m11930b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r10 == false) goto L66;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1792i.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return C0700a.C0701a.m11936a(drawable);
        }
        return this.f4321b.f4373b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4319a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4321b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return C0700a.C0702b.m11929c(drawable);
        }
        return this.f4323d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4319a == null || Build.VERSION.SDK_INT < 24) {
            this.f4321b.f4372a = getChangingConfigurations();
            return this.f4321b;
        }
        return new C1800h(this.f4319a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4319a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4321b.f4373b.f4365i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4319a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4321b.f4373b.f4364h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1792i.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return C0700a.C0701a.m11933d(drawable);
        }
        return this.f4321b.f4376e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C1799g c1799g = this.f4321b;
            if (c1799g != null) {
                C1798f c1798f = c1799g.f4373b;
                if (c1798f.f4370n == null) {
                    c1798f.f4370n = Boolean.valueOf(c1798f.f4363g.mo9939a());
                }
                if (c1798f.f4370n.booleanValue() || ((colorStateList = this.f4321b.f4374c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4324e && super.mutate() == this) {
            this.f4321b = new C1799g(this.f4321b);
            this.f4324e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1799g c1799g = this.f4321b;
        ColorStateList colorStateList = c1799g.f4374c;
        if (colorStateList != null && (mode = c1799g.f4375d) != null) {
            this.f4322c = m9941a(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        C1798f c1798f = c1799g.f4373b;
        if (c1798f.f4370n == null) {
            c1798f.f4370n = Boolean.valueOf(c1798f.f4363g.mo9939a());
        }
        if (c1798f.f4370n.booleanValue()) {
            boolean mo9938b = c1799g.f4373b.f4363g.mo9938b(iArr);
            c1799g.f4382k |= mo9938b;
            if (mo9938b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f4321b.f4373b.getRootAlpha() != i) {
            this.f4321b.f4373b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            C0700a.C0701a.m11932e(drawable, z);
        } else {
            this.f4321b.f4376e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4323d = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            C0700a.m11939a(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            C0700a.C0702b.m11924h(drawable, colorStateList);
            return;
        }
        C1799g c1799g = this.f4321b;
        if (c1799g.f4374c != colorStateList) {
            c1799g.f4374c = colorStateList;
            this.f4322c = m9941a(colorStateList, c1799g.f4375d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            C0700a.C0702b.m11923i(drawable, mode);
            return;
        }
        C1799g c1799g = this.f4321b;
        if (c1799g.f4375d != mode) {
            c1799g.f4375d = mode;
            this.f4322c = m9941a(c1799g.f4374c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4319a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$c */
    /* loaded from: classes.dex */
    public static class C1795c extends AbstractC1796d {

        /* renamed from: a */
        public final Matrix f4340a;

        /* renamed from: b */
        public final ArrayList<AbstractC1796d> f4341b;

        /* renamed from: c */
        public float f4342c;

        /* renamed from: d */
        public float f4343d;

        /* renamed from: e */
        public float f4344e;

        /* renamed from: f */
        public float f4345f;

        /* renamed from: g */
        public float f4346g;

        /* renamed from: h */
        public float f4347h;

        /* renamed from: i */
        public float f4348i;

        /* renamed from: j */
        public final Matrix f4349j;

        /* renamed from: k */
        public final int f4350k;

        /* renamed from: l */
        public String f4351l;

        public C1795c() {
            this.f4340a = new Matrix();
            this.f4341b = new ArrayList<>();
            this.f4342c = 0.0f;
            this.f4343d = 0.0f;
            this.f4344e = 0.0f;
            this.f4345f = 1.0f;
            this.f4346g = 1.0f;
            this.f4347h = 0.0f;
            this.f4348i = 0.0f;
            this.f4349j = new Matrix();
            this.f4351l = null;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1792i.AbstractC1796d
        /* renamed from: a */
        public final boolean mo9939a() {
            int i = 0;
            while (true) {
                ArrayList<AbstractC1796d> arrayList = this.f4341b;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).mo9939a()) {
                    return true;
                }
                i++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1792i.AbstractC1796d
        /* renamed from: b */
        public final boolean mo9938b(int[] iArr) {
            int i = 0;
            boolean z = false;
            while (true) {
                ArrayList<AbstractC1796d> arrayList = this.f4341b;
                if (i >= arrayList.size()) {
                    return z;
                }
                z |= arrayList.get(i).mo9938b(iArr);
                i++;
            }
        }

        /* renamed from: c */
        public final void m9940c() {
            Matrix matrix = this.f4349j;
            matrix.reset();
            matrix.postTranslate(-this.f4343d, -this.f4344e);
            matrix.postScale(this.f4345f, this.f4346g);
            matrix.postRotate(this.f4342c, 0.0f, 0.0f);
            matrix.postTranslate(this.f4347h + this.f4343d, this.f4348i + this.f4344e);
        }

        public String getGroupName() {
            return this.f4351l;
        }

        public Matrix getLocalMatrix() {
            return this.f4349j;
        }

        public float getPivotX() {
            return this.f4343d;
        }

        public float getPivotY() {
            return this.f4344e;
        }

        public float getRotation() {
            return this.f4342c;
        }

        public float getScaleX() {
            return this.f4345f;
        }

        public float getScaleY() {
            return this.f4346g;
        }

        public float getTranslateX() {
            return this.f4347h;
        }

        public float getTranslateY() {
            return this.f4348i;
        }

        public void setPivotX(float f) {
            if (f != this.f4343d) {
                this.f4343d = f;
                m9940c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f4344e) {
                this.f4344e = f;
                m9940c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f4342c) {
                this.f4342c = f;
                m9940c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f4345f) {
                this.f4345f = f;
                m9940c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f4346g) {
                this.f4346g = f;
                m9940c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f4347h) {
                this.f4347h = f;
                m9940c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f4348i) {
                this.f4348i = f;
                m9940c();
            }
        }

        public C1795c(C1795c c1795c, C0470b<String, Object> c0470b) {
            AbstractC1797e c1793a;
            this.f4340a = new Matrix();
            this.f4341b = new ArrayList<>();
            this.f4342c = 0.0f;
            this.f4343d = 0.0f;
            this.f4344e = 0.0f;
            this.f4345f = 1.0f;
            this.f4346g = 1.0f;
            this.f4347h = 0.0f;
            this.f4348i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4349j = matrix;
            this.f4351l = null;
            this.f4342c = c1795c.f4342c;
            this.f4343d = c1795c.f4343d;
            this.f4344e = c1795c.f4344e;
            this.f4345f = c1795c.f4345f;
            this.f4346g = c1795c.f4346g;
            this.f4347h = c1795c.f4347h;
            this.f4348i = c1795c.f4348i;
            String str = c1795c.f4351l;
            this.f4351l = str;
            this.f4350k = c1795c.f4350k;
            if (str != null) {
                c0470b.put(str, this);
            }
            matrix.set(c1795c.f4349j);
            ArrayList<AbstractC1796d> arrayList = c1795c.f4341b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC1796d abstractC1796d = arrayList.get(i);
                if (abstractC1796d instanceof C1795c) {
                    this.f4341b.add(new C1795c((C1795c) abstractC1796d, c0470b));
                } else {
                    if (abstractC1796d instanceof C1794b) {
                        c1793a = new C1794b((C1794b) abstractC1796d);
                    } else if (!(abstractC1796d instanceof C1793a)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        c1793a = new C1793a((C1793a) abstractC1796d);
                    }
                    this.f4341b.add(c1793a);
                    String str2 = c1793a.f4353b;
                    if (str2 != null) {
                        c0470b.put(str2, c1793a);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1797e extends AbstractC1796d {

        /* renamed from: a */
        public C0694d.C0695a[] f4352a;

        /* renamed from: b */
        public String f4353b;

        /* renamed from: c */
        public int f4354c;

        /* renamed from: d */
        public final int f4355d;

        public AbstractC1797e() {
            this.f4352a = null;
            this.f4354c = 0;
        }

        public C0694d.C0695a[] getPathData() {
            return this.f4352a;
        }

        public String getPathName() {
            return this.f4353b;
        }

        public void setPathData(C0694d.C0695a[] c0695aArr) {
            if (!C0694d.m11963a(this.f4352a, c0695aArr)) {
                this.f4352a = C0694d.m11959e(c0695aArr);
                return;
            }
            C0694d.C0695a[] c0695aArr2 = this.f4352a;
            for (int i = 0; i < c0695aArr.length; i++) {
                c0695aArr2[i].f2389a = c0695aArr[i].f2389a;
                int i2 = 0;
                while (true) {
                    float[] fArr = c0695aArr[i].f2390b;
                    if (i2 < fArr.length) {
                        c0695aArr2[i].f2390b[i2] = fArr[i2];
                        i2++;
                    }
                }
            }
        }

        public AbstractC1797e(AbstractC1797e abstractC1797e) {
            this.f4352a = null;
            this.f4354c = 0;
            this.f4353b = abstractC1797e.f4353b;
            this.f4355d = abstractC1797e.f4355d;
            this.f4352a = C0694d.m11959e(abstractC1797e.f4352a);
        }
    }
}
