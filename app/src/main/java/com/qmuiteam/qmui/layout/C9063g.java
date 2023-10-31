package com.qmuiteam.qmui.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.util.C9145f;
import java.lang.ref.WeakReference;

/* renamed from: com.qmuiteam.qmui.layout.g */
/* loaded from: classes3.dex */
public final class C9063g implements IQMUILayout {

    /* renamed from: A */
    public int f17331A;

    /* renamed from: B */
    public int f17332B;

    /* renamed from: C */
    public float[] f17333C;

    /* renamed from: D */
    public boolean f17334D;

    /* renamed from: E */
    public final RectF f17335E;

    /* renamed from: F */
    public int f17336F;

    /* renamed from: G */
    public int f17337G;

    /* renamed from: H */
    public int f17338H;

    /* renamed from: I */
    public final WeakReference<View> f17339I;

    /* renamed from: J */
    public boolean f17340J;

    /* renamed from: L */
    public boolean f17342L;

    /* renamed from: N */
    public float f17344N;

    /* renamed from: P */
    public final int f17346P;

    /* renamed from: Q */
    public final int f17347Q;

    /* renamed from: R */
    public final int f17348R;

    /* renamed from: S */
    public final int f17349S;

    /* renamed from: a */
    public final int f17350a;

    /* renamed from: b */
    public final int f17351b;

    /* renamed from: c */
    public final int f17352c;

    /* renamed from: d */
    public final int f17353d;

    /* renamed from: e */
    public int f17354e;

    /* renamed from: f */
    public int f17355f;

    /* renamed from: g */
    public int f17356g;

    /* renamed from: h */
    public int f17357h;

    /* renamed from: j */
    public int f17359j;

    /* renamed from: k */
    public int f17360k;

    /* renamed from: l */
    public int f17361l;

    /* renamed from: m */
    public int f17362m;

    /* renamed from: o */
    public int f17364o;

    /* renamed from: p */
    public int f17365p;

    /* renamed from: q */
    public int f17366q;

    /* renamed from: r */
    public int f17367r;

    /* renamed from: t */
    public int f17369t;

    /* renamed from: u */
    public final int f17370u;

    /* renamed from: v */
    public final int f17371v;

    /* renamed from: w */
    public int f17372w;

    /* renamed from: y */
    public Paint f17374y;

    /* renamed from: z */
    public final Paint f17375z;

    /* renamed from: i */
    public int f17358i = 255;

    /* renamed from: n */
    public int f17363n = 255;

    /* renamed from: s */
    public int f17368s = 255;

    /* renamed from: x */
    public int f17373x = 255;

    /* renamed from: K */
    public final Path f17341K = new Path();

    /* renamed from: M */
    public int f17343M = 0;

    /* renamed from: O */
    public int f17345O = -16777216;

    public C9063g(Context context, AttributeSet attributeSet, int i, View view) {
        boolean z;
        int i2;
        int i3 = 0;
        this.f17350a = 0;
        this.f17351b = 0;
        this.f17352c = 0;
        this.f17353d = 0;
        this.f17354e = 0;
        this.f17355f = 0;
        this.f17356g = 0;
        this.f17359j = 0;
        this.f17360k = 0;
        this.f17361l = 0;
        this.f17364o = 0;
        this.f17365p = 0;
        this.f17366q = 0;
        this.f17369t = 0;
        this.f17370u = 0;
        this.f17371v = 0;
        this.f17332B = 0;
        this.f17336F = 0;
        this.f17337G = 1;
        this.f17338H = 0;
        this.f17340J = false;
        this.f17342L = true;
        this.f17346P = 0;
        this.f17347Q = 0;
        this.f17348R = 0;
        this.f17349S = 0;
        this.f17339I = new WeakReference<>(view);
        Object obj = ContextCompat.f2323a;
        int m12030a = ContextCompat.C0652d.m12030a(context, R.color.qmui_config_color_separator);
        this.f17357h = m12030a;
        this.f17362m = m12030a;
        new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        Paint paint = new Paint();
        this.f17375z = paint;
        paint.setAntiAlias(true);
        this.f17344N = C9145f.m2633h(R.attr.qmui_general_shadow_alpha, context.getTheme());
        this.f17335E = new RectF();
        if (attributeSet == null && i == 0) {
            z = false;
            i2 = 0;
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9056b.f17317l, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i4 = 0;
            z = false;
            i2 = 0;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == 0) {
                    this.f17350a = obtainStyledAttributes.getDimensionPixelSize(index, this.f17350a);
                } else if (index == 1) {
                    this.f17351b = obtainStyledAttributes.getDimensionPixelSize(index, this.f17351b);
                } else if (index == 2) {
                    this.f17352c = obtainStyledAttributes.getDimensionPixelSize(index, this.f17352c);
                } else if (index == 3) {
                    this.f17353d = obtainStyledAttributes.getDimensionPixelSize(index, this.f17353d);
                } else if (index == 29) {
                    this.f17357h = obtainStyledAttributes.getColor(index, this.f17357h);
                } else if (index == 30) {
                    this.f17354e = obtainStyledAttributes.getDimensionPixelSize(index, this.f17354e);
                } else if (index == 31) {
                    this.f17355f = obtainStyledAttributes.getDimensionPixelSize(index, this.f17355f);
                } else if (index == 32) {
                    this.f17356g = obtainStyledAttributes.getDimensionPixelSize(index, this.f17356g);
                } else if (index == 6) {
                    this.f17362m = obtainStyledAttributes.getColor(index, this.f17362m);
                } else if (index == 7) {
                    this.f17359j = obtainStyledAttributes.getDimensionPixelSize(index, this.f17359j);
                } else if (index == 8) {
                    this.f17360k = obtainStyledAttributes.getDimensionPixelSize(index, this.f17360k);
                } else if (index == 9) {
                    this.f17361l = obtainStyledAttributes.getDimensionPixelSize(index, this.f17361l);
                } else if (index == 11) {
                    this.f17367r = obtainStyledAttributes.getColor(index, this.f17367r);
                } else if (index == 14) {
                    this.f17364o = obtainStyledAttributes.getDimensionPixelSize(index, this.f17364o);
                } else if (index == 13) {
                    this.f17365p = obtainStyledAttributes.getDimensionPixelSize(index, this.f17365p);
                } else if (index == 12) {
                    this.f17366q = obtainStyledAttributes.getDimensionPixelSize(index, this.f17366q);
                } else if (index == 22) {
                    this.f17372w = obtainStyledAttributes.getColor(index, this.f17372w);
                } else if (index == 25) {
                    this.f17369t = obtainStyledAttributes.getDimensionPixelSize(index, this.f17369t);
                } else if (index == 24) {
                    this.f17370u = obtainStyledAttributes.getDimensionPixelSize(index, this.f17370u);
                } else if (index == 23) {
                    this.f17371v = obtainStyledAttributes.getDimensionPixelSize(index, this.f17371v);
                } else if (index == 4) {
                    this.f17336F = obtainStyledAttributes.getColor(index, this.f17336F);
                } else if (index == 5) {
                    this.f17337G = obtainStyledAttributes.getDimensionPixelSize(index, this.f17337G);
                } else if (index == 21) {
                    i2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 15) {
                    this.f17338H = obtainStyledAttributes.getColor(index, this.f17338H);
                } else if (index == 10) {
                    this.f17332B = obtainStyledAttributes.getInt(index, this.f17332B);
                } else if (index == 28) {
                    this.f17342L = obtainStyledAttributes.getBoolean(index, this.f17342L);
                } else if (index == 27) {
                    i4 = obtainStyledAttributes.getDimensionPixelSize(index, i4);
                } else if (index == 26) {
                    this.f17344N = obtainStyledAttributes.getFloat(index, this.f17344N);
                } else if (index == 33) {
                    z = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == 18) {
                    this.f17346P = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 19) {
                    this.f17347Q = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 20) {
                    this.f17348R = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 17) {
                    this.f17349S = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 16) {
                    this.f17340J = obtainStyledAttributes.getBoolean(index, false);
                }
            }
            obtainStyledAttributes.recycle();
            i3 = i4;
        }
        if (i3 == 0 && z) {
            i3 = C9145f.m2636e(context, R.attr.qmui_general_shadow_elevation);
        }
        m2744v(i2, this.f17344N, this.f17332B, i3);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: a */
    public final boolean mo2547a() {
        return this.f17364o > 0;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: b */
    public final boolean mo2546b() {
        return this.f17354e > 0;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: c */
    public final boolean mo2545c() {
        return this.f17369t > 0;
    }

    /* renamed from: d */
    public final void m2756d(Canvas canvas) {
        View view;
        boolean z;
        if (this.f17339I.get() == null) {
            return;
        }
        int m2752l = m2752l();
        if (this.f17337G > 0 && this.f17336F != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        if (this.f17342L && this.f17343M != 0) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.save();
        canvas.translate(view.getScrollX(), view.getScrollY());
        float f = this.f17337G / 2.0f;
        boolean z2 = this.f17340J;
        RectF rectF = this.f17335E;
        if (z2) {
            rectF.set(view.getPaddingLeft() + f, view.getPaddingTop() + f, (width - view.getPaddingRight()) - f, (height - view.getPaddingBottom()) - f);
        } else {
            rectF.set(f, f, width - f, height - f);
        }
        if (this.f17334D) {
            if (this.f17333C == null) {
                this.f17333C = new float[8];
            }
            int i = this.f17332B;
            if (i == 1) {
                float[] fArr = this.f17333C;
                float f2 = m2752l;
                fArr[4] = f2;
                fArr[5] = f2;
                fArr[6] = f2;
                fArr[7] = f2;
            } else if (i == 2) {
                float[] fArr2 = this.f17333C;
                float f3 = m2752l;
                fArr2[0] = f3;
                fArr2[1] = f3;
                fArr2[6] = f3;
                fArr2[7] = f3;
            } else if (i == 3) {
                float[] fArr3 = this.f17333C;
                float f4 = m2752l;
                fArr3[0] = f4;
                fArr3[1] = f4;
                fArr3[2] = f4;
                fArr3[3] = f4;
            } else if (i == 4) {
                float[] fArr4 = this.f17333C;
                float f5 = m2752l;
                fArr4[2] = f5;
                fArr4[3] = f5;
                fArr4[4] = f5;
                fArr4[5] = f5;
            }
        }
        if (z) {
            Paint paint = this.f17375z;
            paint.setColor(this.f17336F);
            paint.setStrokeWidth(this.f17337G);
            paint.setStyle(Paint.Style.STROKE);
            if (this.f17334D) {
                float[] fArr5 = this.f17333C;
                Path path = this.f17341K;
                path.reset();
                path.addRoundRect(rectF, fArr5, Path.Direction.CW);
                canvas.drawPath(path, paint);
            } else if (m2752l <= 0) {
                canvas.drawRect(rectF, paint);
            } else {
                float f6 = m2752l;
                canvas.drawRoundRect(rectF, f6, f6, paint);
            }
        }
        canvas.restore();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: e */
    public final void mo2544e(int i) {
        if (this.f17362m != i) {
            this.f17362m = i;
            m2749o();
        }
    }

    /* renamed from: f */
    public final void m2755f(Canvas canvas, int i, int i2) {
        View view = this.f17339I.get();
        if (view == null) {
            return;
        }
        if (this.f17374y == null && (this.f17354e > 0 || this.f17359j > 0 || this.f17364o > 0 || this.f17369t > 0)) {
            this.f17374y = new Paint();
        }
        canvas.save();
        canvas.translate(view.getScrollX(), view.getScrollY());
        int i3 = this.f17354e;
        if (i3 > 0) {
            this.f17374y.setStrokeWidth(i3);
            this.f17374y.setColor(this.f17357h);
            int i4 = this.f17358i;
            if (i4 < 255) {
                this.f17374y.setAlpha(i4);
            }
            float f = this.f17354e / 2.0f;
            canvas.drawLine(this.f17355f, f, i - this.f17356g, f, this.f17374y);
        }
        int i5 = this.f17359j;
        if (i5 > 0) {
            this.f17374y.setStrokeWidth(i5);
            this.f17374y.setColor(this.f17362m);
            int i6 = this.f17363n;
            if (i6 < 255) {
                this.f17374y.setAlpha(i6);
            }
            float floor = (float) Math.floor(i2 - (this.f17359j / 2.0f));
            canvas.drawLine(this.f17360k, floor, i - this.f17361l, floor, this.f17374y);
        }
        int i7 = this.f17364o;
        if (i7 > 0) {
            this.f17374y.setStrokeWidth(i7);
            this.f17374y.setColor(this.f17367r);
            int i8 = this.f17368s;
            if (i8 < 255) {
                this.f17374y.setAlpha(i8);
            }
            float f2 = this.f17364o / 2.0f;
            canvas.drawLine(f2, this.f17365p, f2, i2 - this.f17366q, this.f17374y);
        }
        int i9 = this.f17369t;
        if (i9 > 0) {
            this.f17374y.setStrokeWidth(i9);
            this.f17374y.setColor(this.f17372w);
            int i10 = this.f17373x;
            if (i10 < 255) {
                this.f17374y.setAlpha(i10);
            }
            float floor2 = (float) Math.floor(i - (this.f17369t / 2.0f));
            canvas.drawLine(floor2, this.f17370u, floor2, i2 - this.f17371v, this.f17374y);
        }
        canvas.restore();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: g */
    public final boolean mo2543g() {
        return this.f17337G > 0;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: h */
    public final void mo2542h(int i) {
        if (this.f17367r != i) {
            this.f17367r = i;
            m2749o();
        }
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: i */
    public final boolean mo2541i() {
        return this.f17359j > 0;
    }

    /* renamed from: j */
    public final int m2754j(int i) {
        int i2 = this.f17351b;
        if (i2 <= 0 || View.MeasureSpec.getSize(i) <= i2) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.f17350a;
        return mode == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
    }

    /* renamed from: k */
    public final int m2753k(int i) {
        int i2 = this.f17350a;
        return (i2 <= 0 || View.MeasureSpec.getSize(i) <= i2) ? i : View.MeasureSpec.getMode(i) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    /* renamed from: l */
    public final int m2752l() {
        int width;
        View view = this.f17339I.get();
        if (view == null) {
            return this.f17331A;
        }
        int i = this.f17331A;
        if (i == -1) {
            width = view.getHeight();
        } else if (i != -2) {
            return i;
        } else {
            width = view.getWidth();
        }
        return width / 2;
    }

    /* renamed from: m */
    public final int m2751m(int i, int i2) {
        int i3;
        return (View.MeasureSpec.getMode(i) == 1073741824 || i2 >= (i3 = this.f17353d)) ? i : View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
    }

    /* renamed from: n */
    public final int m2750n(int i, int i2) {
        int i3;
        return (View.MeasureSpec.getMode(i) == 1073741824 || i2 >= (i3 = this.f17352c)) ? i : View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
    }

    /* renamed from: o */
    public final void m2749o() {
        View view = this.f17339I.get();
        if (view == null) {
            return;
        }
        view.invalidate();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: p */
    public final void mo2540p(int i) {
        if (this.f17357h != i) {
            this.f17357h = i;
            m2749o();
        }
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: q */
    public final void mo2539q(int i) {
        if (this.f17372w != i) {
            this.f17372w = i;
            m2749o();
        }
    }

    /* renamed from: r */
    public final void m2748r(int i) {
        if (this.f17332B == i) {
            return;
        }
        m2744v(this.f17331A, this.f17344N, i, this.f17343M);
    }

    /* renamed from: s */
    public final void m2747s(int i) {
        this.f17338H = i;
        View view = this.f17339I.get();
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    public final void setBorderColor(@ColorInt int i) {
        this.f17336F = i;
    }

    /* renamed from: t */
    public final void m2746t(boolean z) {
        View view = this.f17339I.get();
        if (view == null) {
            return;
        }
        this.f17340J = z;
        view.invalidateOutline();
    }

    /* renamed from: u */
    public final void m2745u(int i) {
        if (this.f17331A != i) {
            m2744v(i, this.f17344N, this.f17332B, this.f17343M);
        }
    }

    /* renamed from: v */
    public final void m2744v(int i, float f, int i2, int i3) {
        boolean z;
        float f2;
        View view;
        int i4 = this.f17345O;
        WeakReference<View> weakReference = this.f17339I;
        View view2 = weakReference.get();
        if (view2 != null) {
            this.f17331A = i;
            this.f17332B = i2;
            boolean z2 = true;
            if ((i == -1 || i == -2 || i > 0) && i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f17334D = z;
            this.f17343M = i3;
            this.f17344N = f;
            this.f17345O = i4;
            if (i3 != 0 && !z) {
                f2 = i3;
            } else {
                f2 = 0.0f;
            }
            view2.setElevation(f2);
            int i5 = this.f17345O;
            if (Build.VERSION.SDK_INT >= 28 && (view = weakReference.get()) != null) {
                view.setOutlineAmbientShadowColor(i5);
                view.setOutlineSpotShadowColor(i5);
            }
            view2.setOutlineProvider(new C9062f(this));
            int i6 = this.f17331A;
            if (i6 != -2 && i6 != -1 && i6 <= 0) {
                z2 = false;
            }
            view2.setClipToOutline(z2);
            view2.invalidate();
        }
    }

    /* renamed from: w */
    public final void m2743w(float f) {
        float f2;
        if (this.f17344N == f) {
            return;
        }
        this.f17344N = f;
        View view = this.f17339I.get();
        if (view != null) {
            int i = this.f17343M;
            if (i == 0) {
                f2 = 0.0f;
            } else {
                f2 = i;
            }
            view.setElevation(f2);
            view.invalidateOutline();
        }
    }

    /* renamed from: x */
    public final void m2742x(int i) {
        View view;
        if (this.f17345O == i) {
            return;
        }
        this.f17345O = i;
        if (Build.VERSION.SDK_INT >= 28 && (view = this.f17339I.get()) != null) {
            view.setOutlineAmbientShadowColor(i);
            view.setOutlineSpotShadowColor(i);
        }
    }

    /* renamed from: y */
    public final void m2741y(int i) {
        float f;
        if (this.f17343M == i) {
            return;
        }
        this.f17343M = i;
        View view = this.f17339I.get();
        if (view != null) {
            int i2 = this.f17343M;
            if (i2 == 0) {
                f = 0.0f;
            } else {
                f = i2;
            }
            view.setElevation(f);
            view.invalidateOutline();
        }
    }

    /* renamed from: z */
    public final void m2740z(boolean z) {
        this.f17342L = z;
        m2749o();
    }
}
