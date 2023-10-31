package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.C0171d;
import androidx.core.text.C0790l;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.C1437b;
import com.google.android.material.animation.C7556a;
import com.google.android.material.resources.C7771a;
import com.google.android.material.resources.C7780h;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.c */
/* loaded from: classes3.dex */
public final class C7744c {
    @Nullable

    /* renamed from: A */
    public CharSequence f15027A;
    @Nullable

    /* renamed from: B */
    public CharSequence f15028B;

    /* renamed from: C */
    public boolean f15029C;
    @Nullable

    /* renamed from: E */
    public Bitmap f15031E;

    /* renamed from: F */
    public float f15032F;

    /* renamed from: G */
    public float f15033G;

    /* renamed from: H */
    public float f15034H;

    /* renamed from: I */
    public float f15035I;

    /* renamed from: J */
    public float f15036J;

    /* renamed from: K */
    public int f15037K;

    /* renamed from: L */
    public int[] f15038L;

    /* renamed from: M */
    public boolean f15039M;
    @NonNull

    /* renamed from: N */
    public final TextPaint f15040N;
    @NonNull

    /* renamed from: O */
    public final TextPaint f15041O;

    /* renamed from: P */
    public TimeInterpolator f15042P;

    /* renamed from: Q */
    public TimeInterpolator f15043Q;

    /* renamed from: R */
    public float f15044R;

    /* renamed from: S */
    public float f15045S;

    /* renamed from: T */
    public float f15046T;

    /* renamed from: U */
    public ColorStateList f15047U;

    /* renamed from: V */
    public float f15048V;

    /* renamed from: W */
    public float f15049W;

    /* renamed from: X */
    public float f15050X;

    /* renamed from: Y */
    public StaticLayout f15051Y;

    /* renamed from: Z */
    public float f15052Z;

    /* renamed from: a */
    public final View f15053a;

    /* renamed from: a0 */
    public float f15054a0;

    /* renamed from: b */
    public float f15055b;

    /* renamed from: b0 */
    public float f15056b0;
    @NonNull

    /* renamed from: c */
    public final Rect f15057c;

    /* renamed from: c0 */
    public CharSequence f15058c0;
    @NonNull

    /* renamed from: d */
    public final Rect f15059d;
    @NonNull

    /* renamed from: e */
    public final RectF f15061e;

    /* renamed from: j */
    public ColorStateList f15068j;

    /* renamed from: k */
    public ColorStateList f15069k;

    /* renamed from: l */
    public float f15070l;

    /* renamed from: m */
    public float f15071m;

    /* renamed from: n */
    public float f15072n;

    /* renamed from: o */
    public float f15073o;

    /* renamed from: p */
    public float f15074p;

    /* renamed from: q */
    public float f15075q;

    /* renamed from: r */
    public Typeface f15076r;

    /* renamed from: s */
    public Typeface f15077s;

    /* renamed from: t */
    public Typeface f15078t;

    /* renamed from: u */
    public Typeface f15079u;

    /* renamed from: v */
    public Typeface f15080v;

    /* renamed from: w */
    public Typeface f15081w;

    /* renamed from: x */
    public Typeface f15082x;

    /* renamed from: y */
    public C7771a f15083y;

    /* renamed from: f */
    public int f15063f = 16;

    /* renamed from: g */
    public int f15065g = 16;

    /* renamed from: h */
    public float f15066h = 15.0f;

    /* renamed from: i */
    public float f15067i = 15.0f;

    /* renamed from: z */
    public final TextUtils.TruncateAt f15084z = TextUtils.TruncateAt.END;

    /* renamed from: D */
    public final boolean f15030D = true;

    /* renamed from: d0 */
    public final int f15060d0 = 1;

    /* renamed from: e0 */
    public final float f15062e0 = 1.0f;

    /* renamed from: f0 */
    public final int f15064f0 = 1;

    public C7744c(View view) {
        this.f15053a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f15040N = textPaint;
        this.f15041O = new TextPaint(textPaint);
        this.f15059d = new Rect();
        this.f15057c = new Rect();
        this.f15061e = new RectF();
        m4524g(view.getContext().getResources().getConfiguration());
    }

    @ColorInt
    /* renamed from: a */
    public static int m4530a(@ColorInt int i, @FloatRange(from = 0.0d, m13045to = 1.0d) float f, @ColorInt int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* renamed from: f */
    public static float m4525f(float f, float f2, float f3, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = C7556a.f14282a;
        return C0171d.m12907a(f2, f, f3, f);
    }

    /* renamed from: b */
    public final boolean m4529b(@NonNull CharSequence charSequence) {
        C0790l.C0794d c0794d;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        boolean z = true;
        if (ViewCompat.C0815e.m11742d(this.f15053a) != 1) {
            z = false;
        }
        if (this.f15030D) {
            if (z) {
                c0794d = C0790l.f2495d;
            } else {
                c0794d = C0790l.f2494c;
            }
            return c0794d.m11799b(charSequence, charSequence.length());
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x010c, code lost:
        if (r12.f15029C != false) goto L63;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4528c(float r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C7744c.m4528c(float, boolean):void");
    }

    /* renamed from: d */
    public final float m4527d() {
        TextPaint textPaint = this.f15041O;
        textPaint.setTextSize(this.f15067i);
        textPaint.setTypeface(this.f15076r);
        textPaint.setLetterSpacing(this.f15048V);
        return -textPaint.ascent();
    }

    @ColorInt
    /* renamed from: e */
    public final int m4526e(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f15038L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: g */
    public final void m4524g(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f15078t;
            if (typeface != null) {
                this.f15077s = C7780h.m4481a(configuration, typeface);
            }
            Typeface typeface2 = this.f15081w;
            if (typeface2 != null) {
                this.f15080v = C7780h.m4481a(configuration, typeface2);
            }
            Typeface typeface3 = this.f15077s;
            if (typeface3 == null) {
                typeface3 = this.f15078t;
            }
            this.f15076r = typeface3;
            Typeface typeface4 = this.f15080v;
            if (typeface4 == null) {
                typeface4 = this.f15081w;
            }
            this.f15079u = typeface4;
            m4523h(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4523h(boolean r17) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C7744c.m4523h(boolean):void");
    }

    /* renamed from: i */
    public final void m4522i(@Nullable ColorStateList colorStateList) {
        if (this.f15069k != colorStateList || this.f15068j != colorStateList) {
            this.f15069k = colorStateList;
            this.f15068j = colorStateList;
            m4523h(false);
        }
    }

    /* renamed from: j */
    public final boolean m4521j(Typeface typeface) {
        C7771a c7771a = this.f15083y;
        if (c7771a != null) {
            c7771a.f15136c = true;
        }
        if (this.f15078t != typeface) {
            this.f15078t = typeface;
            Typeface m4481a = C7780h.m4481a(this.f15053a.getContext().getResources().getConfiguration(), typeface);
            this.f15077s = m4481a;
            if (m4481a == null) {
                m4481a = this.f15078t;
            }
            this.f15076r = m4481a;
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void m4520k(float f) {
        int m4526e;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f15055b) {
            this.f15055b = f;
            Rect rect = this.f15057c;
            Rect rect2 = this.f15059d;
            float m4525f = m4525f(rect.left, rect2.left, f, this.f15042P);
            RectF rectF = this.f15061e;
            rectF.left = m4525f;
            rectF.top = m4525f(this.f15070l, this.f15071m, f, this.f15042P);
            rectF.right = m4525f(rect.right, rect2.right, f, this.f15042P);
            rectF.bottom = m4525f(rect.bottom, rect2.bottom, f, this.f15042P);
            this.f15074p = m4525f(this.f15072n, this.f15073o, f, this.f15042P);
            this.f15075q = m4525f(this.f15070l, this.f15071m, f, this.f15042P);
            m4519l(f);
            C1437b c1437b = C7556a.f14283b;
            this.f15054a0 = 1.0f - m4525f(0.0f, 1.0f, 1.0f - f, c1437b);
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            View view = this.f15053a;
            ViewCompat.C0814d.m11754k(view);
            this.f15056b0 = m4525f(1.0f, 0.0f, f, c1437b);
            ViewCompat.C0814d.m11754k(view);
            ColorStateList colorStateList = this.f15069k;
            ColorStateList colorStateList2 = this.f15068j;
            TextPaint textPaint = this.f15040N;
            if (colorStateList != colorStateList2) {
                m4526e = m4530a(m4526e(colorStateList2), f, m4526e(this.f15069k));
            } else {
                m4526e = m4526e(colorStateList);
            }
            textPaint.setColor(m4526e);
            float f2 = this.f15048V;
            float f3 = this.f15049W;
            if (f2 != f3) {
                f2 = m4525f(f3, f2, f, c1437b);
            }
            textPaint.setLetterSpacing(f2);
            this.f15034H = m4525f(0.0f, this.f15044R, f, null);
            this.f15035I = m4525f(0.0f, this.f15045S, f, null);
            this.f15036J = m4525f(0.0f, this.f15046T, f, null);
            int m4530a = m4530a(m4526e(null), f, m4526e(this.f15047U));
            this.f15037K = m4530a;
            textPaint.setShadowLayer(this.f15034H, this.f15035I, this.f15036J, m4530a);
            ViewCompat.C0814d.m11754k(view);
        }
    }

    /* renamed from: l */
    public final void m4519l(float f) {
        m4528c(f, false);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11754k(this.f15053a);
    }

    /* renamed from: m */
    public final void m4518m(Typeface typeface) {
        boolean z;
        boolean m4521j = m4521j(typeface);
        if (this.f15081w != typeface) {
            this.f15081w = typeface;
            Typeface m4481a = C7780h.m4481a(this.f15053a.getContext().getResources().getConfiguration(), typeface);
            this.f15080v = m4481a;
            if (m4481a == null) {
                m4481a = this.f15081w;
            }
            this.f15079u = m4481a;
            z = true;
        } else {
            z = false;
        }
        if (m4521j || z) {
            m4523h(false);
        }
    }
}
