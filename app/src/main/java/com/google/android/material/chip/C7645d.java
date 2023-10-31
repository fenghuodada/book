package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.C0689a;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.graphics.drawable.InterfaceC0710h;
import com.ambrose.overwall.R;
import com.google.android.material.animation.C7563h;
import com.google.android.material.internal.C7754j;
import com.google.android.material.resources.C7775d;
import com.google.android.material.ripple.C7781a;
import com.google.android.material.shape.C7792a;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.C7803k;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.google.android.material.chip.d */
/* loaded from: classes3.dex */
public final class C7645d extends MaterialShapeDrawable implements Drawable.Callback, C7754j.InterfaceC7756b {

    /* renamed from: J0 */
    public static final int[] f14708J0 = {16842910};

    /* renamed from: K0 */
    public static final ShapeDrawable f14709K0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public float f14710A;
    @Nullable

    /* renamed from: A0 */
    public PorterDuff.Mode f14711A0;
    @Nullable

    /* renamed from: B */
    public ColorStateList f14712B;

    /* renamed from: B0 */
    public int[] f14713B0;

    /* renamed from: C */
    public float f14714C;

    /* renamed from: C0 */
    public boolean f14715C0;
    @Nullable

    /* renamed from: D */
    public ColorStateList f14716D;
    @Nullable

    /* renamed from: D0 */
    public ColorStateList f14717D0;
    @Nullable

    /* renamed from: E */
    public CharSequence f14718E;
    @NonNull

    /* renamed from: E0 */
    public WeakReference<InterfaceC7646a> f14719E0;

    /* renamed from: F */
    public boolean f14720F;

    /* renamed from: F0 */
    public TextUtils.TruncateAt f14721F0;
    @Nullable

    /* renamed from: G */
    public Drawable f14722G;

    /* renamed from: G0 */
    public boolean f14723G0;
    @Nullable

    /* renamed from: H */
    public ColorStateList f14724H;

    /* renamed from: H0 */
    public int f14725H0;

    /* renamed from: I */
    public float f14726I;

    /* renamed from: I0 */
    public boolean f14727I0;

    /* renamed from: J */
    public boolean f14728J;

    /* renamed from: K */
    public boolean f14729K;
    @Nullable

    /* renamed from: L */
    public Drawable f14730L;
    @Nullable

    /* renamed from: M */
    public RippleDrawable f14731M;
    @Nullable

    /* renamed from: N */
    public ColorStateList f14732N;

    /* renamed from: O */
    public float f14733O;
    @Nullable

    /* renamed from: P */
    public SpannableStringBuilder f14734P;

    /* renamed from: Q */
    public boolean f14735Q;

    /* renamed from: R */
    public boolean f14736R;
    @Nullable

    /* renamed from: S */
    public Drawable f14737S;
    @Nullable

    /* renamed from: T */
    public ColorStateList f14738T;
    @Nullable

    /* renamed from: U */
    public C7563h f14739U;
    @Nullable

    /* renamed from: V */
    public C7563h f14740V;

    /* renamed from: W */
    public float f14741W;

    /* renamed from: X */
    public float f14742X;

    /* renamed from: Y */
    public float f14743Y;

    /* renamed from: Z */
    public float f14744Z;

    /* renamed from: d0 */
    public float f14745d0;

    /* renamed from: e0 */
    public float f14746e0;

    /* renamed from: f0 */
    public float f14747f0;

    /* renamed from: g0 */
    public float f14748g0;
    @NonNull

    /* renamed from: h0 */
    public final Context f14749h0;

    /* renamed from: i0 */
    public final Paint f14750i0;

    /* renamed from: j0 */
    public final Paint.FontMetrics f14751j0;

    /* renamed from: k0 */
    public final RectF f14752k0;

    /* renamed from: l0 */
    public final PointF f14753l0;

    /* renamed from: m0 */
    public final Path f14754m0;
    @NonNull

    /* renamed from: n0 */
    public final C7754j f14755n0;
    @ColorInt

    /* renamed from: o0 */
    public int f14756o0;
    @ColorInt

    /* renamed from: p0 */
    public int f14757p0;
    @ColorInt

    /* renamed from: q0 */
    public int f14758q0;
    @ColorInt

    /* renamed from: r0 */
    public int f14759r0;
    @ColorInt

    /* renamed from: s0 */
    public int f14760s0;
    @ColorInt

    /* renamed from: t0 */
    public int f14761t0;

    /* renamed from: u0 */
    public boolean f14762u0;
    @ColorInt

    /* renamed from: v0 */
    public int f14763v0;

    /* renamed from: w0 */
    public int f14764w0;
    @Nullable

    /* renamed from: x */
    public ColorStateList f14765x;
    @Nullable

    /* renamed from: x0 */
    public ColorFilter f14766x0;
    @Nullable

    /* renamed from: y */
    public ColorStateList f14767y;
    @Nullable

    /* renamed from: y0 */
    public PorterDuffColorFilter f14768y0;

    /* renamed from: z */
    public float f14769z;
    @Nullable

    /* renamed from: z0 */
    public ColorStateList f14770z0;

    /* renamed from: com.google.android.material.chip.d$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7646a {
        /* renamed from: a */
        void mo4625a();
    }

    public C7645d(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2132018312);
        this.f14710A = -1.0f;
        this.f14750i0 = new Paint(1);
        this.f14751j0 = new Paint.FontMetrics();
        this.f14752k0 = new RectF();
        this.f14753l0 = new PointF();
        this.f14754m0 = new Path();
        this.f14764w0 = 255;
        this.f14711A0 = PorterDuff.Mode.SRC_IN;
        this.f14719E0 = new WeakReference<>(null);
        m4469i(context);
        this.f14749h0 = context;
        C7754j c7754j = new C7754j(this);
        this.f14755n0 = c7754j;
        this.f14718E = "";
        c7754j.f15113a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f14708J0;
        setState(iArr);
        if (!Arrays.equals(this.f14713B0, iArr)) {
            this.f14713B0 = iArr;
            if (m4639U()) {
                m4629w(getState(), iArr);
            }
        }
        this.f14723G0 = true;
        int[] iArr2 = C7781a.f15157a;
        f14709K0.setTint(-1);
    }

    /* renamed from: V */
    public static void m4638V(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: t */
    public static boolean m4632t(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: u */
    public static boolean m4631u(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void m4659A(boolean z) {
        if (this.f14736R != z) {
            boolean m4641S = m4641S();
            this.f14736R = z;
            boolean m4641S2 = m4641S();
            if (m4641S != m4641S2) {
                if (m4641S2) {
                    m4637o(this.f14737S);
                } else {
                    m4638V(this.f14737S);
                }
                invalidateSelf();
                m4630v();
            }
        }
    }

    @Deprecated
    /* renamed from: B */
    public final void m4658B(float f) {
        if (this.f14710A != f) {
            this.f14710A = f;
            C7801j c7801j = this.f15183a.f15206a;
            c7801j.getClass();
            C7801j.C7802a c7802a = new C7801j.C7802a(c7801j);
            c7802a.f15249e = new C7792a(f);
            c7802a.f15250f = new C7792a(f);
            c7802a.f15251g = new C7792a(f);
            c7802a.f15252h = new C7792a(f);
            setShapeAppearanceModel(new C7801j(c7802a));
        }
    }

    /* renamed from: C */
    public final void m4657C(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f14722G;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof InterfaceC0710h) {
                drawable2 = ((InterfaceC0710h) drawable2).m11908b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float m4635q = m4635q();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f14722G = drawable3;
            float m4635q2 = m4635q();
            m4638V(drawable2);
            if (m4640T()) {
                m4637o(this.f14722G);
            }
            invalidateSelf();
            if (m4635q != m4635q2) {
                m4630v();
            }
        }
    }

    /* renamed from: D */
    public final void m4656D(float f) {
        if (this.f14726I != f) {
            float m4635q = m4635q();
            this.f14726I = f;
            float m4635q2 = m4635q();
            invalidateSelf();
            if (m4635q != m4635q2) {
                m4630v();
            }
        }
    }

    /* renamed from: E */
    public final void m4655E(@Nullable ColorStateList colorStateList) {
        this.f14728J = true;
        if (this.f14724H != colorStateList) {
            this.f14724H = colorStateList;
            if (m4640T()) {
                C0700a.C0702b.m11924h(this.f14722G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: F */
    public final void m4654F(boolean z) {
        if (this.f14720F != z) {
            boolean m4640T = m4640T();
            this.f14720F = z;
            boolean m4640T2 = m4640T();
            if (m4640T != m4640T2) {
                if (m4640T2) {
                    m4637o(this.f14722G);
                } else {
                    m4638V(this.f14722G);
                }
                invalidateSelf();
                m4630v();
            }
        }
    }

    /* renamed from: G */
    public final void m4653G(@Nullable ColorStateList colorStateList) {
        if (this.f14712B != colorStateList) {
            this.f14712B = colorStateList;
            if (this.f14727I0) {
                MaterialShapeDrawable.C7791b c7791b = this.f15183a;
                if (c7791b.f15209d != colorStateList) {
                    c7791b.f15209d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: H */
    public final void m4652H(float f) {
        if (this.f14714C != f) {
            this.f14714C = f;
            this.f14750i0.setStrokeWidth(f);
            if (this.f14727I0) {
                this.f15183a.f15216k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* renamed from: I */
    public final void m4651I(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f14730L;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof InterfaceC0710h) {
                drawable2 = ((InterfaceC0710h) drawable2).m11908b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float m4634r = m4634r();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f14730L = drawable3;
            int[] iArr = C7781a.f15157a;
            this.f14731M = new RippleDrawable(C7781a.m4480a(this.f14716D), this.f14730L, f14709K0);
            float m4634r2 = m4634r();
            m4638V(drawable2);
            if (m4639U()) {
                m4637o(this.f14730L);
            }
            invalidateSelf();
            if (m4634r != m4634r2) {
                m4630v();
            }
        }
    }

    /* renamed from: J */
    public final void m4650J(float f) {
        if (this.f14747f0 != f) {
            this.f14747f0 = f;
            invalidateSelf();
            if (m4639U()) {
                m4630v();
            }
        }
    }

    /* renamed from: K */
    public final void m4649K(float f) {
        if (this.f14733O != f) {
            this.f14733O = f;
            invalidateSelf();
            if (m4639U()) {
                m4630v();
            }
        }
    }

    /* renamed from: L */
    public final void m4648L(float f) {
        if (this.f14746e0 != f) {
            this.f14746e0 = f;
            invalidateSelf();
            if (m4639U()) {
                m4630v();
            }
        }
    }

    /* renamed from: M */
    public final void m4647M(@Nullable ColorStateList colorStateList) {
        if (this.f14732N != colorStateList) {
            this.f14732N = colorStateList;
            if (m4639U()) {
                C0700a.C0702b.m11924h(this.f14730L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: N */
    public final void m4646N(boolean z) {
        if (this.f14729K != z) {
            boolean m4639U = m4639U();
            this.f14729K = z;
            boolean m4639U2 = m4639U();
            if (m4639U != m4639U2) {
                if (m4639U2) {
                    m4637o(this.f14730L);
                } else {
                    m4638V(this.f14730L);
                }
                invalidateSelf();
                m4630v();
            }
        }
    }

    /* renamed from: O */
    public final void m4645O(float f) {
        if (this.f14743Y != f) {
            float m4635q = m4635q();
            this.f14743Y = f;
            float m4635q2 = m4635q();
            invalidateSelf();
            if (m4635q != m4635q2) {
                m4630v();
            }
        }
    }

    /* renamed from: P */
    public final void m4644P(float f) {
        if (this.f14742X != f) {
            float m4635q = m4635q();
            this.f14742X = f;
            float m4635q2 = m4635q();
            invalidateSelf();
            if (m4635q != m4635q2) {
                m4630v();
            }
        }
    }

    /* renamed from: Q */
    public final void m4643Q(@Nullable ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.f14716D != colorStateList) {
            this.f14716D = colorStateList;
            if (this.f14715C0) {
                colorStateList2 = C7781a.m4480a(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.f14717D0 = colorStateList2;
            onStateChange(getState());
        }
    }

    /* renamed from: R */
    public final void m4642R(@Nullable C7775d c7775d) {
        C7754j c7754j = this.f14755n0;
        if (c7754j.f15118f != c7775d) {
            c7754j.f15118f = c7775d;
            if (c7775d != null) {
                TextPaint textPaint = c7754j.f15113a;
                Context context = this.f14749h0;
                C7754j.C7755a c7755a = c7754j.f15114b;
                c7775d.m4486f(context, textPaint, c7755a);
                C7754j.InterfaceC7756b interfaceC7756b = c7754j.f15117e.get();
                if (interfaceC7756b != null) {
                    textPaint.drawableState = interfaceC7756b.getState();
                }
                c7775d.m4487e(context, textPaint, c7755a);
                c7754j.f15116d = true;
            }
            C7754j.InterfaceC7756b interfaceC7756b2 = c7754j.f15117e.get();
            if (interfaceC7756b2 != null) {
                interfaceC7756b2.mo4512a();
                interfaceC7756b2.onStateChange(interfaceC7756b2.getState());
            }
        }
    }

    /* renamed from: S */
    public final boolean m4641S() {
        return this.f14736R && this.f14737S != null && this.f14762u0;
    }

    /* renamed from: T */
    public final boolean m4640T() {
        return this.f14720F && this.f14722G != null;
    }

    /* renamed from: U */
    public final boolean m4639U() {
        return this.f14729K && this.f14730L != null;
    }

    @Override // com.google.android.material.internal.C7754j.InterfaceC7756b
    /* renamed from: a */
    public final void mo4512a() {
        m4630v();
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i;
        int i2;
        RectF rectF;
        int i3;
        int i4;
        int i5;
        RectF rectF2;
        float f;
        boolean z;
        int i6;
        float f2;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f14764w0) != 0) {
            if (i < 255) {
                i2 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
            } else {
                i2 = 0;
            }
            boolean z2 = this.f14727I0;
            Paint paint = this.f14750i0;
            RectF rectF3 = this.f14752k0;
            if (!z2) {
                paint.setColor(this.f14756o0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, m4633s(), m4633s(), paint);
            }
            if (!this.f14727I0) {
                paint.setColor(this.f14757p0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f14766x0;
                if (colorFilter == null) {
                    colorFilter = this.f14768y0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, m4633s(), m4633s(), paint);
            }
            if (this.f14727I0) {
                super.draw(canvas);
            }
            float f3 = 0.0f;
            if (this.f14714C > 0.0f && !this.f14727I0) {
                paint.setColor(this.f14759r0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f14727I0) {
                    ColorFilter colorFilter2 = this.f14766x0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f14768y0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f4 = this.f14714C / 2.0f;
                rectF3.set(bounds.left + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
                float f5 = this.f14710A - (this.f14714C / 2.0f);
                canvas.drawRoundRect(rectF3, f5, f5, paint);
            }
            paint.setColor(this.f14760s0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.f14727I0) {
                canvas.drawRoundRect(rectF3, m4633s(), m4633s(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.f14754m0;
                C7803k c7803k = this.f15200r;
                MaterialShapeDrawable.C7791b c7791b = this.f15183a;
                c7803k.m4452a(c7791b.f15206a, c7791b.f15215j, rectF4, this.f15199q, path);
                m4471f(canvas, paint, path, this.f15183a.f15206a, m4470h());
            }
            if (m4640T()) {
                m4636p(bounds, rectF3);
                float f6 = rectF3.left;
                float f7 = rectF3.top;
                canvas.translate(f6, f7);
                this.f14722G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f14722G.draw(canvas);
                canvas.translate(-f6, -f7);
            }
            if (m4641S()) {
                m4636p(bounds, rectF3);
                float f8 = rectF3.left;
                float f9 = rectF3.top;
                canvas.translate(f8, f9);
                this.f14737S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f14737S.draw(canvas);
                canvas.translate(-f8, -f9);
            }
            if (this.f14723G0 && this.f14718E != null) {
                PointF pointF = this.f14753l0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f14718E;
                C7754j c7754j = this.f14755n0;
                if (charSequence != null) {
                    float m4635q = m4635q() + this.f14741W + this.f14744Z;
                    if (C0700a.C0703c.m11922a(this) == 0) {
                        pointF.x = bounds.left + m4635q;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - m4635q;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = c7754j.f15113a;
                    Paint.FontMetrics fontMetrics = this.f14751j0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.f14718E != null) {
                    float m4635q2 = m4635q() + this.f14741W + this.f14744Z;
                    float m4634r = m4634r() + this.f14748g0 + this.f14745d0;
                    if (C0700a.C0703c.m11922a(this) == 0) {
                        rectF3.left = bounds.left + m4635q2;
                        f2 = bounds.right - m4634r;
                    } else {
                        rectF3.left = bounds.left + m4634r;
                        f2 = bounds.right - m4635q2;
                    }
                    rectF3.right = f2;
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                C7775d c7775d = c7754j.f15118f;
                TextPaint textPaint2 = c7754j.f15113a;
                if (c7775d != null) {
                    textPaint2.drawableState = getState();
                    c7754j.f15118f.m4487e(this.f14749h0, textPaint2, c7754j.f15114b);
                }
                textPaint2.setTextAlign(align);
                String charSequence2 = this.f14718E.toString();
                if (!c7754j.f15116d) {
                    f = c7754j.f15115c;
                } else {
                    if (charSequence2 != null) {
                        f3 = textPaint2.measureText((CharSequence) charSequence2, 0, charSequence2.length());
                    }
                    c7754j.f15115c = f3;
                    c7754j.f15116d = false;
                    f = f3;
                }
                if (Math.round(f) > Math.round(rectF3.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i6 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i6 = 0;
                }
                CharSequence charSequence3 = this.f14718E;
                if (z && this.f14721F0 != null) {
                    charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF3.width(), this.f14721F0);
                }
                CharSequence charSequence4 = charSequence3;
                int length = charSequence4.length();
                float f10 = pointF.x;
                float f11 = pointF.y;
                rectF = rectF3;
                i3 = i2;
                i4 = 255;
                i5 = 0;
                canvas.drawText(charSequence4, 0, length, f10, f11, textPaint2);
                if (z) {
                    canvas.restoreToCount(i6);
                }
            } else {
                rectF = rectF3;
                i3 = i2;
                i4 = 255;
                i5 = 0;
            }
            if (m4639U()) {
                rectF.setEmpty();
                if (m4639U()) {
                    float f12 = this.f14748g0 + this.f14747f0;
                    if (C0700a.C0703c.m11922a(this) == 0) {
                        float f13 = bounds.right - f12;
                        rectF2 = rectF;
                        rectF2.right = f13;
                        rectF2.left = f13 - this.f14733O;
                    } else {
                        rectF2 = rectF;
                        float f14 = bounds.left + f12;
                        rectF2.left = f14;
                        rectF2.right = f14 + this.f14733O;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f15 = this.f14733O;
                    float f16 = exactCenterY - (f15 / 2.0f);
                    rectF2.top = f16;
                    rectF2.bottom = f16 + f15;
                } else {
                    rectF2 = rectF;
                }
                float f17 = rectF2.left;
                float f18 = rectF2.top;
                canvas.translate(f17, f18);
                this.f14730L.setBounds(i5, i5, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = C7781a.f15157a;
                this.f14731M.setBounds(this.f14730L.getBounds());
                this.f14731M.jumpToCurrentState();
                this.f14731M.draw(canvas);
                canvas.translate(-f17, -f18);
            }
            if (this.f14764w0 < i4) {
                canvas.restoreToCount(i3);
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f14764w0;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final ColorFilter getColorFilter() {
        return this.f14766x0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f14769z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float measureText;
        float m4635q = m4635q() + this.f14741W + this.f14744Z;
        String charSequence = this.f14718E.toString();
        C7754j c7754j = this.f14755n0;
        if (!c7754j.f15116d) {
            measureText = c7754j.f15115c;
        } else {
            if (charSequence == null) {
                measureText = 0.0f;
            } else {
                measureText = c7754j.f15113a.measureText((CharSequence) charSequence, 0, charSequence.length());
            }
            c7754j.f15115c = measureText;
            c7754j.f15116d = false;
        }
        return Math.min(Math.round(m4634r() + measureText + m4635q + this.f14745d0 + this.f14748g0), this.f14725H0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        if (this.f14727I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f14710A);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f14769z, this.f14710A);
        }
        outline.setAlpha(this.f14764w0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        if (m4632t(this.f14765x) || m4632t(this.f14767y) || m4632t(this.f14712B)) {
            return true;
        }
        if (this.f14715C0 && m4632t(this.f14717D0)) {
            return true;
        }
        C7775d c7775d = this.f14755n0.f15118f;
        if (c7775d != null && (colorStateList = c7775d.f15146j) != null && colorStateList.isStateful()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.f14736R && this.f14737S != null && this.f14735Q) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || m4631u(this.f14722G) || m4631u(this.f14737S) || m4632t(this.f14770z0)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void m4637o(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C0700a.C0703c.m11921b(drawable, C0700a.C0703c.m11922a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f14730L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f14713B0);
            }
            C0700a.C0702b.m11924h(drawable, this.f14732N);
            return;
        }
        Drawable drawable2 = this.f14722G;
        if (drawable == drawable2 && this.f14728J) {
            C0700a.C0702b.m11924h(drawable2, this.f14724H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m4640T()) {
            onLayoutDirectionChanged |= C0700a.C0703c.m11921b(this.f14722G, i);
        }
        if (m4641S()) {
            onLayoutDirectionChanged |= C0700a.C0703c.m11921b(this.f14737S, i);
        }
        if (m4639U()) {
            onLayoutDirectionChanged |= C0700a.C0703c.m11921b(this.f14730L, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m4640T()) {
            onLevelChange |= this.f14722G.setLevel(i);
        }
        if (m4641S()) {
            onLevelChange |= this.f14737S.setLevel(i);
        }
        if (m4639U()) {
            onLevelChange |= this.f14730L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.C7754j.InterfaceC7756b
    public final boolean onStateChange(@NonNull int[] iArr) {
        if (this.f14727I0) {
            super.onStateChange(iArr);
        }
        return m4629w(iArr, this.f14713B0);
    }

    /* renamed from: p */
    public final void m4636p(@NonNull Rect rect, @NonNull RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f;
        rectF.setEmpty();
        if (m4640T() || m4641S()) {
            float f2 = this.f14741W + this.f14742X;
            if (this.f14762u0) {
                drawable = this.f14737S;
            } else {
                drawable = this.f14722G;
            }
            float f3 = this.f14726I;
            if (f3 <= 0.0f && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (C0700a.C0703c.m11922a(this) == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            if (this.f14762u0) {
                drawable2 = this.f14737S;
            } else {
                drawable2 = this.f14722G;
            }
            float f6 = this.f14726I;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f14749h0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f6;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    /* renamed from: q */
    public final float m4635q() {
        Drawable drawable;
        if (!m4640T() && !m4641S()) {
            return 0.0f;
        }
        float f = this.f14742X;
        if (this.f14762u0) {
            drawable = this.f14737S;
        } else {
            drawable = this.f14722G;
        }
        float f2 = this.f14726I;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.f14743Y;
    }

    /* renamed from: r */
    public final float m4634r() {
        if (m4639U()) {
            return this.f14746e0 + this.f14733O + this.f14747f0;
        }
        return 0.0f;
    }

    /* renamed from: s */
    public final float m4633s() {
        if (this.f14727I0) {
            return this.f15183a.f15206a.f15237e.mo4460a(m4470h());
        }
        return this.f14710A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f14764w0 != i) {
            this.f14764w0 = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.f14766x0 != colorFilter) {
            this.f14766x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.f14770z0 != colorStateList) {
            this.f14770z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f14711A0 != mode) {
            this.f14711A0 = mode;
            ColorStateList colorStateList = this.f14770z0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f14768y0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m4640T()) {
            visible |= this.f14722G.setVisible(z, z2);
        }
        if (m4641S()) {
            visible |= this.f14737S.setVisible(z, z2);
        }
        if (m4639U()) {
            visible |= this.f14730L.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public final void m4630v() {
        InterfaceC7646a interfaceC7646a = this.f14719E0.get();
        if (interfaceC7646a != null) {
            interfaceC7646a.mo4625a();
        }
    }

    /* renamed from: w */
    public final boolean m4629w(@NonNull int[] iArr, @NonNull int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f14765x;
        if (colorStateList2 != null) {
            i = colorStateList2.getColorForState(iArr, this.f14756o0);
        } else {
            i = 0;
        }
        int m4473d = m4473d(i);
        boolean z6 = true;
        if (this.f14756o0 != m4473d) {
            this.f14756o0 = m4473d;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f14767y;
        if (colorStateList3 != null) {
            i2 = colorStateList3.getColorForState(iArr, this.f14757p0);
        } else {
            i2 = 0;
        }
        int m4473d2 = m4473d(i2);
        if (this.f14757p0 != m4473d2) {
            this.f14757p0 = m4473d2;
            onStateChange = true;
        }
        int m11971b = C0689a.m11971b(m4473d2, m4473d);
        if (this.f14758q0 != m11971b) {
            z = true;
        } else {
            z = false;
        }
        if (this.f15183a.f15208c == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            this.f14758q0 = m11971b;
            m4467k(ColorStateList.valueOf(m11971b));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f14712B;
        if (colorStateList4 != null) {
            i3 = colorStateList4.getColorForState(iArr, this.f14759r0);
        } else {
            i3 = 0;
        }
        if (this.f14759r0 != i3) {
            this.f14759r0 = i3;
            onStateChange = true;
        }
        if (this.f14717D0 != null && C7781a.m4479b(iArr)) {
            i4 = this.f14717D0.getColorForState(iArr, this.f14760s0);
        } else {
            i4 = 0;
        }
        if (this.f14760s0 != i4) {
            this.f14760s0 = i4;
            if (this.f14715C0) {
                onStateChange = true;
            }
        }
        C7775d c7775d = this.f14755n0.f15118f;
        if (c7775d != null && (colorStateList = c7775d.f15146j) != null) {
            i5 = colorStateList.getColorForState(iArr, this.f14761t0);
        } else {
            i5 = 0;
        }
        if (this.f14761t0 != i5) {
            this.f14761t0 = i5;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i7 : state) {
                if (i7 == 16842912) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (z3 && this.f14735Q) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f14762u0 != z4 && this.f14737S != null) {
            float m4635q = m4635q();
            this.f14762u0 = z4;
            if (m4635q != m4635q()) {
                onStateChange = true;
                z5 = true;
            } else {
                z5 = false;
                onStateChange = true;
            }
        } else {
            z5 = false;
        }
        ColorStateList colorStateList5 = this.f14770z0;
        if (colorStateList5 != null) {
            i6 = colorStateList5.getColorForState(iArr, this.f14763v0);
        } else {
            i6 = 0;
        }
        if (this.f14763v0 != i6) {
            this.f14763v0 = i6;
            ColorStateList colorStateList6 = this.f14770z0;
            PorterDuff.Mode mode = this.f14711A0;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f14768y0 = porterDuffColorFilter;
        } else {
            z6 = onStateChange;
        }
        if (m4631u(this.f14722G)) {
            z6 |= this.f14722G.setState(iArr);
        }
        if (m4631u(this.f14737S)) {
            z6 |= this.f14737S.setState(iArr);
        }
        if (m4631u(this.f14730L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z6 |= this.f14730L.setState(iArr3);
        }
        int[] iArr4 = C7781a.f15157a;
        if (m4631u(this.f14731M)) {
            z6 |= this.f14731M.setState(iArr2);
        }
        if (z6) {
            invalidateSelf();
        }
        if (z5) {
            m4630v();
        }
        return z6;
    }

    /* renamed from: x */
    public final void m4628x(boolean z) {
        if (this.f14735Q != z) {
            this.f14735Q = z;
            float m4635q = m4635q();
            if (!z && this.f14762u0) {
                this.f14762u0 = false;
            }
            float m4635q2 = m4635q();
            invalidateSelf();
            if (m4635q != m4635q2) {
                m4630v();
            }
        }
    }

    /* renamed from: y */
    public final void m4627y(@Nullable Drawable drawable) {
        if (this.f14737S != drawable) {
            float m4635q = m4635q();
            this.f14737S = drawable;
            float m4635q2 = m4635q();
            m4638V(this.f14737S);
            m4637o(this.f14737S);
            invalidateSelf();
            if (m4635q != m4635q2) {
                m4630v();
            }
        }
    }

    /* renamed from: z */
    public final void m4626z(@Nullable ColorStateList colorStateList) {
        boolean z;
        if (this.f14738T != colorStateList) {
            this.f14738T = colorStateList;
            if (this.f14736R && this.f14737S != null && this.f14735Q) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C0700a.C0702b.m11924h(this.f14737S, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
