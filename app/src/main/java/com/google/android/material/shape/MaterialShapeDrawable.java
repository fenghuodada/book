package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.C0799c;
import com.google.android.material.elevation.C7714a;
import com.google.android.material.shadow.C7788a;
import com.google.android.material.shape.C7803k;
import com.google.android.material.shape.C7806m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* loaded from: classes3.dex */
public class MaterialShapeDrawable extends Drawable implements InterfaceC7813n {

    /* renamed from: w */
    public static final Paint f15182w;

    /* renamed from: a */
    public C7791b f15183a;

    /* renamed from: b */
    public final C7806m.AbstractC7812f[] f15184b;

    /* renamed from: c */
    public final C7806m.AbstractC7812f[] f15185c;

    /* renamed from: d */
    public final BitSet f15186d;

    /* renamed from: e */
    public boolean f15187e;

    /* renamed from: f */
    public final Matrix f15188f;

    /* renamed from: g */
    public final Path f15189g;

    /* renamed from: h */
    public final Path f15190h;

    /* renamed from: i */
    public final RectF f15191i;

    /* renamed from: j */
    public final RectF f15192j;

    /* renamed from: k */
    public final Region f15193k;

    /* renamed from: l */
    public final Region f15194l;

    /* renamed from: m */
    public C7801j f15195m;

    /* renamed from: n */
    public final Paint f15196n;

    /* renamed from: o */
    public final Paint f15197o;

    /* renamed from: p */
    public final C7788a f15198p;
    @NonNull

    /* renamed from: q */
    public final C7790a f15199q;

    /* renamed from: r */
    public final C7803k f15200r;
    @Nullable

    /* renamed from: s */
    public PorterDuffColorFilter f15201s;
    @Nullable

    /* renamed from: t */
    public PorterDuffColorFilter f15202t;
    @NonNull

    /* renamed from: u */
    public final RectF f15203u;

    /* renamed from: v */
    public final boolean f15204v;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CompatibilityShadowMode {
    }

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$a */
    /* loaded from: classes3.dex */
    public class C7790a {
        public C7790a() {
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$b */
    /* loaded from: classes3.dex */
    public static class C7791b extends Drawable.ConstantState {
        @NonNull

        /* renamed from: a */
        public C7801j f15206a;
        @Nullable

        /* renamed from: b */
        public C7714a f15207b;
        @Nullable

        /* renamed from: c */
        public ColorStateList f15208c;
        @Nullable

        /* renamed from: d */
        public ColorStateList f15209d;
        @Nullable

        /* renamed from: e */
        public final ColorStateList f15210e;
        @Nullable

        /* renamed from: f */
        public ColorStateList f15211f;
        @Nullable

        /* renamed from: g */
        public PorterDuff.Mode f15212g;
        @Nullable

        /* renamed from: h */
        public Rect f15213h;

        /* renamed from: i */
        public final float f15214i;

        /* renamed from: j */
        public float f15215j;

        /* renamed from: k */
        public float f15216k;

        /* renamed from: l */
        public int f15217l;

        /* renamed from: m */
        public float f15218m;

        /* renamed from: n */
        public float f15219n;

        /* renamed from: o */
        public final float f15220o;

        /* renamed from: p */
        public final int f15221p;

        /* renamed from: q */
        public int f15222q;

        /* renamed from: r */
        public int f15223r;

        /* renamed from: s */
        public int f15224s;

        /* renamed from: t */
        public final boolean f15225t;

        /* renamed from: u */
        public final Paint.Style f15226u;

        public C7791b(@NonNull C7791b c7791b) {
            this.f15208c = null;
            this.f15209d = null;
            this.f15210e = null;
            this.f15211f = null;
            this.f15212g = PorterDuff.Mode.SRC_IN;
            this.f15213h = null;
            this.f15214i = 1.0f;
            this.f15215j = 1.0f;
            this.f15217l = 255;
            this.f15218m = 0.0f;
            this.f15219n = 0.0f;
            this.f15220o = 0.0f;
            this.f15221p = 0;
            this.f15222q = 0;
            this.f15223r = 0;
            this.f15224s = 0;
            this.f15225t = false;
            this.f15226u = Paint.Style.FILL_AND_STROKE;
            this.f15206a = c7791b.f15206a;
            this.f15207b = c7791b.f15207b;
            this.f15216k = c7791b.f15216k;
            this.f15208c = c7791b.f15208c;
            this.f15209d = c7791b.f15209d;
            this.f15212g = c7791b.f15212g;
            this.f15211f = c7791b.f15211f;
            this.f15217l = c7791b.f15217l;
            this.f15214i = c7791b.f15214i;
            this.f15223r = c7791b.f15223r;
            this.f15221p = c7791b.f15221p;
            this.f15225t = c7791b.f15225t;
            this.f15215j = c7791b.f15215j;
            this.f15218m = c7791b.f15218m;
            this.f15219n = c7791b.f15219n;
            this.f15220o = c7791b.f15220o;
            this.f15222q = c7791b.f15222q;
            this.f15224s = c7791b.f15224s;
            this.f15210e = c7791b.f15210e;
            this.f15226u = c7791b.f15226u;
            if (c7791b.f15213h != null) {
                this.f15213h = new Rect(c7791b.f15213h);
            }
        }

        public C7791b(@NonNull C7801j c7801j) {
            this.f15208c = null;
            this.f15209d = null;
            this.f15210e = null;
            this.f15211f = null;
            this.f15212g = PorterDuff.Mode.SRC_IN;
            this.f15213h = null;
            this.f15214i = 1.0f;
            this.f15215j = 1.0f;
            this.f15217l = 255;
            this.f15218m = 0.0f;
            this.f15219n = 0.0f;
            this.f15220o = 0.0f;
            this.f15221p = 0;
            this.f15222q = 0;
            this.f15223r = 0;
            this.f15224s = 0;
            this.f15225t = false;
            this.f15226u = Paint.Style.FILL_AND_STROKE;
            this.f15206a = c7801j;
            this.f15207b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f15187e = true;
            return materialShapeDrawable;
        }
    }

    static {
        Paint paint = new Paint(1);
        f15182w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new C7801j());
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this(C7801j.m4457b(context, attributeSet, i, i2).m4454a());
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public MaterialShapeDrawable(@NonNull C7791b c7791b) {
        C7803k c7803k;
        this.f15184b = new C7806m.AbstractC7812f[4];
        this.f15185c = new C7806m.AbstractC7812f[4];
        this.f15186d = new BitSet(8);
        this.f15188f = new Matrix();
        this.f15189g = new Path();
        this.f15190h = new Path();
        this.f15191i = new RectF();
        this.f15192j = new RectF();
        this.f15193k = new Region();
        this.f15194l = new Region();
        Paint paint = new Paint(1);
        this.f15196n = paint;
        Paint paint2 = new Paint(1);
        this.f15197o = paint2;
        this.f15198p = new C7788a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c7803k = C7803k.C7804a.f15269a;
        } else {
            c7803k = new C7803k();
        }
        this.f15200r = c7803k;
        this.f15203u = new RectF();
        this.f15204v = true;
        this.f15183a = c7791b;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m4465m();
        m4466l(getState());
        this.f15199q = new C7790a();
    }

    public MaterialShapeDrawable(@NonNull C7801j c7801j) {
        this(new C7791b(c7801j));
    }

    /* renamed from: b */
    public final void m4475b(@NonNull RectF rectF, @NonNull Path path) {
        C7803k c7803k = this.f15200r;
        C7791b c7791b = this.f15183a;
        c7803k.m4452a(c7791b.f15206a, c7791b.f15215j, rectF, this.f15199q, path);
        if (this.f15183a.f15214i != 1.0f) {
            Matrix matrix = this.f15188f;
            matrix.reset();
            float f = this.f15183a.f15214i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f15203u, true);
    }

    @NonNull
    /* renamed from: c */
    public final PorterDuffColorFilter m4474c(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int m4473d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = m4473d(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z && (m4473d = m4473d((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(m4473d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    @ColorInt
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: d */
    public final int m4473d(@ColorInt int i) {
        C7791b c7791b = this.f15183a;
        float f = c7791b.f15219n + c7791b.f15220o + c7791b.f15218m;
        C7714a c7714a = c7791b.f15207b;
        if (c7714a != null) {
            return c7714a.m4572a(f, i);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0128, code lost:
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.shape.MaterialShapeDrawable.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public final void m4472e(@NonNull Canvas canvas) {
        if (this.f15186d.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f15183a.f15223r;
        Path path = this.f15189g;
        C7788a c7788a = this.f15198p;
        if (i != 0) {
            canvas.drawPath(path, c7788a.f15174a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            C7806m.AbstractC7812f abstractC7812f = this.f15184b[i2];
            int i3 = this.f15183a.f15222q;
            Matrix matrix = C7806m.AbstractC7812f.f15294b;
            abstractC7812f.mo4443a(matrix, c7788a, i3, canvas);
            this.f15185c[i2].mo4443a(matrix, c7788a, this.f15183a.f15222q, canvas);
        }
        if (this.f15204v) {
            C7791b c7791b = this.f15183a;
            int sin = (int) (Math.sin(Math.toRadians(c7791b.f15224s)) * c7791b.f15223r);
            C7791b c7791b2 = this.f15183a;
            int cos = (int) (Math.cos(Math.toRadians(c7791b2.f15224s)) * c7791b2.f15223r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f15182w);
            canvas.translate(sin, cos);
        }
    }

    /* renamed from: f */
    public final void m4471f(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull C7801j c7801j, @NonNull RectF rectF) {
        if (!c7801j.m4455d(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float mo4460a = c7801j.f15238f.mo4460a(rectF) * this.f15183a.f15215j;
        canvas.drawRoundRect(rectF, mo4460a, mo4460a, paint);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: g */
    public void mo4376g(@NonNull Canvas canvas) {
        boolean z;
        Paint paint = this.f15197o;
        Path path = this.f15190h;
        C7801j c7801j = this.f15195m;
        RectF rectF = this.f15192j;
        rectF.set(m4470h());
        Paint.Style style = this.f15183a.f15226u;
        float f = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f, f);
        m4471f(canvas, paint, path, c7801j, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15183a.f15217l;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.f15183a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        C7791b c7791b = this.f15183a;
        if (c7791b.f15221p == 2) {
            return;
        }
        if (c7791b.f15206a.m4455d(m4470h())) {
            outline.setRoundRect(getBounds(), this.f15183a.f15206a.f15237e.mo4460a(m4470h()) * this.f15183a.f15215j);
            return;
        }
        RectF m4470h = m4470h();
        Path path = this.f15189g;
        m4475b(m4470h, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
        } else if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f15183a.f15213h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f15193k;
        region.set(bounds);
        RectF m4470h = m4470h();
        Path path = this.f15189g;
        m4475b(m4470h, path);
        Region region2 = this.f15194l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @NonNull
    /* renamed from: h */
    public final RectF m4470h() {
        RectF rectF = this.f15191i;
        rectF.set(getBounds());
        return rectF;
    }

    /* renamed from: i */
    public final void m4469i(Context context) {
        this.f15183a.f15207b = new C7714a(context);
        m4464n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f15187e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f15183a.f15211f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f15183a.f15210e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f15183a.f15209d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f15183a.f15208c) != null && colorStateList4.isStateful())));
    }

    /* renamed from: j */
    public final void m4468j(float f) {
        C7791b c7791b = this.f15183a;
        if (c7791b.f15219n != f) {
            c7791b.f15219n = f;
            m4464n();
        }
    }

    /* renamed from: k */
    public final void m4467k(@Nullable ColorStateList colorStateList) {
        C7791b c7791b = this.f15183a;
        if (c7791b.f15208c != colorStateList) {
            c7791b.f15208c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: l */
    public final boolean m4466l(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f15183a.f15208c == null || color2 == (colorForState2 = this.f15183a.f15208c.getColorForState(iArr, (color2 = (paint2 = this.f15196n).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f15183a.f15209d == null || color == (colorForState = this.f15183a.f15209d.getColorForState(iArr, (color = (paint = this.f15197o).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: m */
    public final boolean m4465m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f15201s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f15202t;
        C7791b c7791b = this.f15183a;
        this.f15201s = m4474c(c7791b.f15211f, c7791b.f15212g, this.f15196n, true);
        C7791b c7791b2 = this.f15183a;
        this.f15202t = m4474c(c7791b2.f15210e, c7791b2.f15212g, this.f15197o, false);
        C7791b c7791b3 = this.f15183a;
        if (c7791b3.f15225t) {
            this.f15198p.m4476a(c7791b3.f15211f.getColorForState(getState(), 0));
        }
        if (!C0799c.m11795a(porterDuffColorFilter, this.f15201s) || !C0799c.m11795a(porterDuffColorFilter2, this.f15202t)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f15183a = new C7791b(this.f15183a);
        return this;
    }

    /* renamed from: n */
    public final void m4464n() {
        C7791b c7791b = this.f15183a;
        float f = c7791b.f15219n + c7791b.f15220o;
        c7791b.f15222q = (int) Math.ceil(0.75f * f);
        this.f15183a.f15223r = (int) Math.ceil(f * 0.25f);
        m4465m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f15187e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C7754j.InterfaceC7756b
    public boolean onStateChange(int[] iArr) {
        boolean z = m4466l(iArr) || m4465m();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, m13044to = 255) int i) {
        C7791b c7791b = this.f15183a;
        if (c7791b.f15217l != i) {
            c7791b.f15217l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f15183a.getClass();
        super.invalidateSelf();
    }

    @Override // com.google.android.material.shape.InterfaceC7813n
    public final void setShapeAppearanceModel(@NonNull C7801j c7801j) {
        this.f15183a.f15206a = c7801j;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f15183a.f15211f = colorStateList;
        m4465m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        C7791b c7791b = this.f15183a;
        if (c7791b.f15212g != mode) {
            c7791b.f15212g = mode;
            m4465m();
            super.invalidateSelf();
        }
    }
}
