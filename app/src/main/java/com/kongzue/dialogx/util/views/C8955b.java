package com.kongzue.dialogx.util.views;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.style.C8941a;

/* renamed from: com.kongzue.dialogx.util.views.b */
/* loaded from: classes3.dex */
public final class C8955b extends View {

    /* renamed from: A */
    public Runnable f17097A;

    /* renamed from: B */
    public boolean f17098B;

    /* renamed from: a */
    public int f17099a;

    /* renamed from: b */
    public int f17100b;

    /* renamed from: c */
    public int f17101c;

    /* renamed from: d */
    public ValueAnimator f17102d;

    /* renamed from: e */
    public ValueAnimator f17103e;

    /* renamed from: f */
    public float f17104f;

    /* renamed from: g */
    public float f17105g;

    /* renamed from: h */
    public final float f17106h;

    /* renamed from: i */
    public final float f17107i;

    /* renamed from: j */
    public float f17108j;

    /* renamed from: k */
    public final Paint f17109k;

    /* renamed from: l */
    public boolean f17110l;

    /* renamed from: m */
    public float f17111m;

    /* renamed from: n */
    public float f17112n;

    /* renamed from: o */
    public float f17113o;

    /* renamed from: p */
    public RectF f17114p;

    /* renamed from: q */
    public int f17115q;

    /* renamed from: r */
    public float f17116r;

    /* renamed from: s */
    public float f17117s;

    /* renamed from: t */
    public float f17118t;

    /* renamed from: u */
    public int f17119u;

    /* renamed from: v */
    public int f17120v;

    /* renamed from: w */
    public ValueAnimator f17121w;

    /* renamed from: x */
    public float f17122x;

    /* renamed from: y */
    public Interpolator f17123y;

    /* renamed from: z */
    public Runnable f17124z;

    /* renamed from: com.kongzue.dialogx.util.views.b$a */
    /* loaded from: classes3.dex */
    public class C8956a implements ValueAnimator.AnimatorUpdateListener {
        public C8956a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C8955b c8955b = C8955b.this;
            c8955b.f17104f = floatValue;
            c8955b.invalidate();
        }
    }

    /* renamed from: com.kongzue.dialogx.util.views.b$b */
    /* loaded from: classes3.dex */
    public class RunnableC8957b implements Runnable {
        public RunnableC8957b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8955b.this.performHapticFeedback(0);
        }
    }

    /* renamed from: com.kongzue.dialogx.util.views.b$c */
    /* loaded from: classes3.dex */
    public class RunnableC8958c implements Runnable {
        public RunnableC8958c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8955b.this.performHapticFeedback(3);
        }
    }

    /* renamed from: com.kongzue.dialogx.util.views.b$d */
    /* loaded from: classes3.dex */
    public class RunnableC8959d implements Runnable {
        public RunnableC8959d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8955b c8955b = C8955b.this;
            c8955b.m2832c(c8955b.f17099a, c8955b.f17123y);
        }
    }

    /* renamed from: com.kongzue.dialogx.util.views.b$e */
    /* loaded from: classes3.dex */
    public class C8960e implements ValueAnimator.AnimatorUpdateListener {
        public C8960e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C8955b c8955b = C8955b.this;
            c8955b.f17122x = floatValue;
            c8955b.invalidate();
        }
    }

    public C8955b(Activity activity) {
        super(activity);
        this.f17099a = 0;
        this.f17100b = (int) ((Resources.getSystem().getDisplayMetrics().density * 2.0f) + 0.5f);
        this.f17101c = -1;
        this.f17106h = 180.0f;
        this.f17107i = 80.0f;
        this.f17109k = new Paint();
        this.f17110l = false;
        this.f17113o = 100.0f;
        this.f17115q = 0;
        this.f17119u = 0;
        this.f17120v = 0;
        m2833b();
    }

    /* renamed from: a */
    public final void m2834a(int i, Canvas canvas) {
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        Handler handler;
        Runnable runnableC8957b;
        float f8;
        TimeInterpolator interpolator = this.f17102d.getInterpolator();
        Interpolator interpolator2 = this.f17123y;
        if (interpolator != interpolator2) {
            this.f17102d.setInterpolator(interpolator2);
        }
        Runnable runnable = this.f17097A;
        if (runnable != null) {
            runnable.run();
            this.f17097A = null;
            C8941a c8941a = C8877a.f16910a;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        performHapticFeedback(3);
                        handler = new Handler(Looper.getMainLooper());
                        runnableC8957b = new RunnableC8958c();
                        f8 = ((float) 300) * 0.5f;
                    }
                } else {
                    handler = new Handler(Looper.getMainLooper());
                    runnableC8957b = new RunnableC8957b();
                    f8 = ((float) 300) * 0.8f;
                }
                handler.postDelayed(runnableC8957b, f8);
            } else {
                performHapticFeedback(3);
            }
        }
        Paint paint = this.f17109k;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    float f9 = this.f17112n;
                    float f10 = (this.f17113o * 4.0f) / 10.0f;
                    int i3 = (int) (f9 - f10);
                    int i4 = (int) (f10 + this.f17111m);
                    float f11 = this.f17122x;
                    if (f11 < 0.5f) {
                        float f12 = i3;
                        int i5 = (int) ((f11 * 2.0f * (i4 - i3)) + f12);
                        this.f17119u = i5;
                        this.f17120v = i5;
                        f5 = i5;
                        f6 = f5;
                        f7 = f12;
                        f4 = f7;
                    } else {
                        float f13 = i3;
                        float f14 = i4 - i3;
                        int i6 = (int) ((f11 * 2.0f * f14) + f13);
                        this.f17119u = i6;
                        this.f17120v = i6;
                        float f15 = i4;
                        f4 = f13;
                        canvas.drawLine(f13, f4, f15, f15, paint);
                        float f16 = (this.f17122x - 0.5f) * 2.0f * f14;
                        f5 = (int) (f15 - f16);
                        f6 = (int) (f16 + f13);
                        f7 = f15;
                    }
                    canvas.drawLine(f7, f4, f5, f6, paint);
                    return;
                }
                return;
            }
            float f17 = this.f17112n;
            float f18 = this.f17113o;
            float f19 = 1.0f * f18;
            int i7 = (int) (f17 - (f19 / 2.0f));
            int i8 = (int) ((f19 / 8.0f) + f17);
            int i9 = (int) (((f18 * 3.0f) / 7.0f) + f17);
            float f20 = this.f17122x;
            int i10 = (f20 > 0.9f ? 1 : (f20 == 0.9f ? 0 : -1));
            float f21 = (int) this.f17111m;
            if (i10 < 0) {
                float f22 = i7;
                f3 = f22;
                f2 = ((i8 - i7) * f20) + f22;
            } else {
                canvas.drawLine(f21, i7, f21, i8, paint);
                f2 = i9 + 1;
                f3 = i9;
            }
            canvas.drawLine(f21, f3, f21, f2, paint);
            return;
        }
        float f23 = this.f17113o;
        float f24 = this.f17111m;
        float f25 = (int) (f23 / 20.0f);
        int i11 = (int) ((f24 - (f23 / 10.0f)) - f25);
        int i12 = (int) (f24 - (f23 / 2.0f));
        int i13 = (int) (this.f17112n + f25);
        float f26 = i12;
        int i14 = (int) (((((int) (f + f24)) - i12) * this.f17122x) + f26);
        Path path = new Path();
        path.moveTo(f26, i13);
        if (i14 < i11) {
            this.f17119u = i14;
            i2 = (i14 - i12) + i13;
            this.f17120v = i2;
        } else {
            this.f17119u = i11;
            int i15 = (i11 - i12) + i13;
            this.f17120v = i15;
            path.lineTo(i11, i15);
            i2 = this.f17120v - (i14 - this.f17119u);
        }
        path.lineTo(i14, i2);
        canvas.drawPath(path, paint);
    }

    /* renamed from: b */
    public final void m2833b() {
        synchronized (C8955b.class) {
            if (this.f17110l) {
                return;
            }
            this.f17110l = true;
            this.f17109k.setAntiAlias(true);
            this.f17109k.setStyle(Paint.Style.STROKE);
            this.f17109k.setStrokeWidth(this.f17100b);
            this.f17109k.setStrokeCap(Paint.Cap.ROUND);
            this.f17109k.setColor(this.f17101c);
            if (!isInEditMode()) {
                this.f17108j = (this.f17106h - this.f17107i) / 2.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 365.0f);
                this.f17102d = ofFloat;
                ofFloat.setDuration(1000L);
                this.f17102d.setInterpolator(new LinearInterpolator());
                this.f17102d.setRepeatCount(-1);
                this.f17102d.addUpdateListener(new C8961c(this));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 365.0f);
                this.f17103e = ofFloat2;
                ofFloat2.setDuration(1500L);
                this.f17103e.setInterpolator(new LinearInterpolator());
                this.f17103e.setRepeatCount(-1);
                this.f17103e.addUpdateListener(new C8962d(this));
                this.f17103e.start();
                this.f17102d.start();
            }
        }
    }

    /* renamed from: c */
    public final void m2832c(int i, Interpolator interpolator) {
        this.f17123y = interpolator;
        this.f17099a = i;
        if (this.f17115q == 0) {
            this.f17124z = new RunnableC8959d();
            return;
        }
        ValueAnimator valueAnimator = this.f17121w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17121w = null;
        }
        this.f17122x = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f17121w = ofFloat;
        ofFloat.setDuration(300L);
        this.f17121w.addUpdateListener(new C8960e());
        this.f17121w.start();
    }

    /* renamed from: d */
    public final void m2831d(float f) {
        ValueAnimator valueAnimator = this.f17102d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f17103e;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        if (this.f17099a != 4) {
            this.f17104f = 0.0f;
        }
        this.f17098B = false;
        this.f17099a = 4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f17104f, f * 365.0f);
        this.f17102d = ofFloat;
        ofFloat.setDuration(1000L);
        this.f17102d.setInterpolator(new DecelerateInterpolator(2.0f));
        this.f17102d.setRepeatCount(0);
        this.f17102d.addUpdateListener(new C8956a());
        this.f17102d.start();
    }

    /* renamed from: e */
    public final C8955b m2830e(int i) {
        this.f17101c = i;
        Paint paint = this.f17109k;
        if (paint != null) {
            paint.setColor(i);
        }
        return this;
    }

    public int getColor() {
        return this.f17101c;
    }

    public int getStatus() {
        return this.f17099a;
    }

    public int getStrokeWidth() {
        return this.f17100b;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f17102d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f17103e;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Runnable runnable;
        boolean isInEditMode = isInEditMode();
        Paint paint = this.f17109k;
        if (isInEditMode) {
            canvas.drawArc(this.f17114p, 0.0f, 365.0f, false, paint);
        } else if (this.f17098B) {
            canvas.drawArc(this.f17114p, 0.0f, 365.0f, false, paint);
            this.f17115q = 2;
            m2834a(this.f17099a, canvas);
        } else {
            int i = this.f17099a;
            if (i == 0) {
                float sin = (this.f17107i / 2.0f) + ((float) (Math.sin(Math.toRadians(this.f17105g)) * this.f17108j)) + this.f17108j;
                float f = this.f17104f;
                float f2 = f - sin;
                this.f17116r = f2;
                if (f2 < 0.0f) {
                    this.f17116r = f2 + 360.0f;
                }
                this.f17117s = sin;
                this.f17118t = sin < 0.0f ? 360.0f - sin : sin;
                canvas.drawArc(this.f17114p, f, -sin, false, paint);
            } else if (i == 1 || i == 2 || i == 3) {
                int i2 = this.f17115q;
                if (i2 != 0) {
                    if (i2 != 1) {
                        return;
                    }
                    canvas.drawArc(this.f17114p, 0.0f, 360.0f, false, paint);
                    m2834a(this.f17099a, canvas);
                    return;
                }
                float f3 = this.f17117s + 5.0f;
                this.f17117s = f3;
                canvas.drawArc(this.f17114p, this.f17116r, f3, false, paint);
                if (this.f17117s - (360.0f - this.f17118t) >= this.f17116r) {
                    this.f17115q = 1;
                    runnable = this.f17124z;
                    if (runnable == null) {
                        return;
                    }
                    runnable.run();
                    this.f17124z = null;
                }
            } else if (i != 4) {
            } else {
                int i3 = this.f17115q;
                if (i3 != 0) {
                    if (i3 != 1) {
                        return;
                    }
                    canvas.drawArc(this.f17114p, 0.0f, 360.0f, false, paint);
                    m2834a(this.f17099a, canvas);
                    return;
                }
                canvas.drawArc(this.f17114p, -90.0f, this.f17104f, false, paint);
                if (this.f17104f == 365.0f) {
                    this.f17115q = 1;
                    runnable = this.f17124z;
                    if (runnable == null) {
                        return;
                    }
                    runnable.run();
                    this.f17124z = null;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f17111m = (i * 1.0f) / 2.0f;
        this.f17112n = (i2 * 1.0f) / 2.0f;
        this.f17113o = (Math.min(getWidth(), getHeight()) / 2) - (this.f17100b / 2);
        float f = this.f17111m;
        float f2 = this.f17113o;
        float f3 = this.f17112n;
        this.f17114p = new RectF(f - f2, f3 - f2, f + f2, f3 + f2);
    }
}
