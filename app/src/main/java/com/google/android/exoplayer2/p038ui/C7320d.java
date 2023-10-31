package com.google.android.exoplayer2.p038ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.p038ui.C7325i;
import com.google.android.exoplayer2.p038ui.InterfaceC7338o;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.ui.d */
/* loaded from: classes.dex */
public final class C7320d extends View implements InterfaceC7338o {

    /* renamed from: A */
    public int f13563A;

    /* renamed from: B */
    public long f13564B;

    /* renamed from: C */
    public int f13565C;

    /* renamed from: D */
    public Rect f13566D;

    /* renamed from: E */
    public float f13567E;

    /* renamed from: F */
    public boolean f13568F;

    /* renamed from: G */
    public long f13569G;

    /* renamed from: H */
    public long f13570H;

    /* renamed from: I */
    public long f13571I;

    /* renamed from: J */
    public long f13572J;

    /* renamed from: K */
    public int f13573K;
    @Nullable

    /* renamed from: L */
    public long[] f13574L;
    @Nullable

    /* renamed from: M */
    public boolean[] f13575M;

    /* renamed from: a */
    public final Rect f13576a;

    /* renamed from: b */
    public final Rect f13577b;

    /* renamed from: c */
    public final Rect f13578c;

    /* renamed from: d */
    public final Rect f13579d;

    /* renamed from: e */
    public final Paint f13580e;

    /* renamed from: f */
    public final Paint f13581f;

    /* renamed from: g */
    public final Paint f13582g;

    /* renamed from: h */
    public final Paint f13583h;

    /* renamed from: i */
    public final Paint f13584i;

    /* renamed from: j */
    public final Paint f13585j;
    @Nullable

    /* renamed from: k */
    public final Drawable f13586k;

    /* renamed from: l */
    public final int f13587l;

    /* renamed from: m */
    public final int f13588m;

    /* renamed from: n */
    public final int f13589n;

    /* renamed from: o */
    public final int f13590o;

    /* renamed from: p */
    public final int f13591p;

    /* renamed from: q */
    public final int f13592q;

    /* renamed from: r */
    public final int f13593r;

    /* renamed from: s */
    public final int f13594s;

    /* renamed from: t */
    public final int f13595t;

    /* renamed from: u */
    public final StringBuilder f13596u;

    /* renamed from: v */
    public final Formatter f13597v;

    /* renamed from: w */
    public final RunnableC7318b f13598w;

    /* renamed from: x */
    public final CopyOnWriteArraySet<InterfaceC7338o.InterfaceC7339a> f13599x;

    /* renamed from: y */
    public final Point f13600y;

    /* renamed from: z */
    public final float f13601z;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.exoplayer2.ui.b] */
    public C7320d(Context context) {
        super(context, null, 0);
        this.f13576a = new Rect();
        this.f13577b = new Rect();
        this.f13578c = new Rect();
        this.f13579d = new Rect();
        Paint paint = new Paint();
        this.f13580e = paint;
        Paint paint2 = new Paint();
        this.f13581f = paint2;
        Paint paint3 = new Paint();
        this.f13582g = paint3;
        Paint paint4 = new Paint();
        this.f13583h = paint4;
        Paint paint5 = new Paint();
        this.f13584i = paint5;
        Paint paint6 = new Paint();
        this.f13585j = paint6;
        paint6.setAntiAlias(true);
        this.f13599x = new CopyOnWriteArraySet<>();
        this.f13600y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f13601z = f;
        this.f13595t = m5219c(f, -50);
        int m5219c = m5219c(f, 4);
        int m5219c2 = m5219c(f, 26);
        int m5219c3 = m5219c(f, 4);
        int m5219c4 = m5219c(f, 12);
        int m5219c5 = m5219c(f, 0);
        int m5219c6 = m5219c(f, 16);
        this.f13587l = m5219c;
        this.f13588m = m5219c2;
        this.f13589n = 0;
        this.f13590o = m5219c3;
        this.f13591p = m5219c4;
        this.f13592q = m5219c5;
        this.f13593r = m5219c6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.f13586k = null;
        StringBuilder sb = new StringBuilder();
        this.f13596u = sb;
        this.f13597v = new Formatter(sb, Locale.getDefault());
        this.f13598w = new Runnable() { // from class: com.google.android.exoplayer2.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                C7320d.this.m5215g(false);
            }
        };
        this.f13594s = (Math.max(m5219c5, Math.max(m5219c4, m5219c6)) + 1) / 2;
        this.f13567E = 1.0f;
        new ValueAnimator().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7320d c7320d = C7320d.this;
                c7320d.getClass();
                c7320d.f13567E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c7320d.invalidate(c7320d.f13576a);
            }
        });
        this.f13570H = -9223372036854775807L;
        this.f13564B = -9223372036854775807L;
        this.f13563A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: c */
    public static int m5219c(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f13564B;
        if (j == -9223372036854775807L) {
            long j2 = this.f13570H;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.f13563A;
        }
        return j;
    }

    private String getProgressText() {
        return C7408g0.m5089q(this.f13596u, this.f13597v, this.f13571I);
    }

    private long getScrubberPosition() {
        Rect rect = this.f13577b;
        if (rect.width() <= 0 || this.f13570H == -9223372036854775807L) {
            return 0L;
        }
        return (this.f13579d.width() * this.f13570H) / rect.width();
    }

    @Override // com.google.android.exoplayer2.p038ui.InterfaceC7338o
    /* renamed from: a */
    public final void mo5186a(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
        C7394a.m5134a(i == 0 || !(jArr == null || zArr == null));
        this.f13573K = i;
        this.f13574L = jArr;
        this.f13575M = zArr;
        m5214h();
    }

    @Override // com.google.android.exoplayer2.p038ui.InterfaceC7338o
    /* renamed from: b */
    public final void mo5185b(C7325i.View$OnClickListenerC7327b view$OnClickListenerC7327b) {
        this.f13599x.add(view$OnClickListenerC7327b);
    }

    /* renamed from: d */
    public final void m5218d(float f) {
        Rect rect = this.f13577b;
        this.f13579d.right = C7408g0.m5099g((int) f, rect.left, rect.right);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13586k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final boolean m5217e(long j) {
        long j2 = this.f13570H;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f13568F ? this.f13569G : this.f13571I;
        long m5098h = C7408g0.m5098h(j3 + j, 0L, j2);
        if (m5098h == j3) {
            return false;
        }
        if (this.f13568F) {
            m5213i(m5098h);
        } else {
            m5216f(m5098h);
        }
        m5214h();
        return true;
    }

    /* renamed from: f */
    public final void m5216f(long j) {
        this.f13569G = j;
        this.f13568F = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<InterfaceC7338o.InterfaceC7339a> it = this.f13599x.iterator();
        while (it.hasNext()) {
            it.next().mo5183e(j);
        }
    }

    /* renamed from: g */
    public final void m5215g(boolean z) {
        removeCallbacks(this.f13598w);
        this.f13568F = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<InterfaceC7338o.InterfaceC7339a> it = this.f13599x.iterator();
        while (it.hasNext()) {
            it.next().mo5182g(this.f13569G, z);
        }
    }

    @Override // com.google.android.exoplayer2.p038ui.InterfaceC7338o
    public long getPreferredUpdateDelay() {
        int width = (int) (this.f13577b.width() / this.f13601z);
        if (width != 0) {
            long j = this.f13570H;
            if (j != 0 && j != -9223372036854775807L) {
                return j / width;
            }
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: h */
    public final void m5214h() {
        Rect rect = this.f13578c;
        Rect rect2 = this.f13577b;
        rect.set(rect2);
        Rect rect3 = this.f13579d;
        rect3.set(rect2);
        long j = this.f13568F ? this.f13569G : this.f13571I;
        if (this.f13570H > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f13572J) / this.f13570H)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.f13570H)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f13576a);
    }

    /* renamed from: i */
    public final void m5213i(long j) {
        if (this.f13569G == j) {
            return;
        }
        this.f13569G = j;
        Iterator<InterfaceC7338o.InterfaceC7339a> it = this.f13599x.iterator();
        while (it.hasNext()) {
            it.next().mo5184d(j);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13586k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        canvas.save();
        Rect rect = this.f13577b;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i2 = height + centerY;
        int i3 = (this.f13570H > 0L ? 1 : (this.f13570H == 0L ? 0 : -1));
        Paint paint2 = this.f13582g;
        Rect rect2 = this.f13579d;
        if (i3 <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i2, paint2);
        } else {
            Rect rect3 = this.f13578c;
            int i4 = rect3.left;
            int i5 = rect3.right;
            int max = Math.max(Math.max(rect.left, i5), rect2.right);
            int i6 = rect.right;
            if (max < i6) {
                canvas.drawRect(max, centerY, i6, i2, paint2);
            }
            int max2 = Math.max(i4, rect2.right);
            if (i5 > max2) {
                canvas.drawRect(max2, centerY, i5, i2, this.f13581f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i2, this.f13580e);
            }
            if (this.f13573K != 0) {
                long[] jArr = this.f13574L;
                jArr.getClass();
                boolean[] zArr = this.f13575M;
                zArr.getClass();
                int i7 = this.f13590o;
                int i8 = i7 / 2;
                int i9 = 0;
                int i10 = 0;
                while (i10 < this.f13573K) {
                    int min = Math.min(rect.width() - i7, Math.max(i9, ((int) ((rect.width() * C7408g0.m5098h(jArr[i10], 0L, this.f13570H)) / this.f13570H)) - i8)) + rect.left;
                    if (zArr[i10]) {
                        paint = this.f13584i;
                    } else {
                        paint = this.f13583h;
                    }
                    canvas.drawRect(min, centerY, min + i7, i2, paint);
                    i10++;
                    i9 = i9;
                    i7 = i7;
                }
            }
        }
        if (this.f13570H > 0) {
            int m5099g = C7408g0.m5099g(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.f13586k;
            if (drawable == null) {
                if (!this.f13568F && !isFocused()) {
                    if (isEnabled()) {
                        i = this.f13591p;
                    } else {
                        i = this.f13592q;
                    }
                } else {
                    i = this.f13593r;
                }
                canvas.drawCircle(m5099g, centerY2, (int) ((i * this.f13567E) / 2.0f), this.f13585j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f13567E)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f13567E)) / 2;
                drawable.setBounds(m5099g - intrinsicWidth, centerY2 - intrinsicHeight, m5099g + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f13568F || z) {
            return;
        }
        m5215g(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f13570H <= 0) {
            return;
        }
        if (C7408g0.f13905a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m5217e(r0)
            if (r0 == 0) goto L2e
            com.google.android.exoplayer2.ui.b r5 = r4.f13598w
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f13568F
            if (r0 == 0) goto L2e
            r5 = 0
            r4.m5215g(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p038ui.C7320d.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Rect rect;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i7 - getPaddingRight();
        int i9 = this.f13589n;
        int i10 = this.f13587l;
        int i11 = this.f13588m;
        int i12 = this.f13594s;
        if (i9 == 1) {
            i5 = (i8 - getPaddingBottom()) - i11;
            i6 = ((i8 - getPaddingBottom()) - i10) - Math.max(i12 - (i10 / 2), 0);
        } else {
            i5 = (i8 - i11) / 2;
            i6 = (i8 - i10) / 2;
        }
        Rect rect2 = this.f13576a;
        rect2.set(paddingLeft, i5, paddingRight, i11 + i5);
        this.f13577b.set(rect2.left + i12, i6, rect2.right - i12, i10 + i6);
        if (C7408g0.f13905a >= 29 && ((rect = this.f13566D) == null || rect.width() != i7 || this.f13566D.height() != i8)) {
            Rect rect3 = new Rect(0, 0, i7, i8);
            this.f13566D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m5214h();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f13588m;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f13586k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        boolean z;
        Drawable drawable = this.f13586k;
        if (drawable != null) {
            if (C7408g0.f13905a >= 23 && drawable.setLayoutDirection(i)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r3 != 3) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L7b
            long r2 = r7.f13570H
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L7b
        L10:
            android.graphics.Point r0 = r7.f13600y
            float r2 = r8.getX()
            int r2 = (int) r2
            float r3 = r8.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L64
            r5 = 3
            if (r3 == r4) goto L55
            r6 = 2
            if (r3 == r6) goto L33
            if (r3 == r5) goto L55
            goto L7b
        L33:
            boolean r8 = r7.f13568F
            if (r8 == 0) goto L7b
            int r8 = r7.f13595t
            if (r0 >= r8) goto L41
            int r8 = r7.f13565C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r2 = r2 + r8
            goto L43
        L41:
            r7.f13565C = r2
        L43:
            float r8 = (float) r2
            r7.m5218d(r8)
            long r0 = r7.getScrubberPosition()
            r7.m5213i(r0)
        L4e:
            r7.m5214h()
            r7.invalidate()
            return r4
        L55:
            boolean r0 = r7.f13568F
            if (r0 == 0) goto L7b
            int r8 = r8.getAction()
            if (r8 != r5) goto L60
            r1 = r4
        L60:
            r7.m5215g(r1)
            return r4
        L64:
            float r8 = (float) r2
            float r0 = (float) r0
            int r2 = (int) r8
            int r0 = (int) r0
            android.graphics.Rect r3 = r7.f13576a
            boolean r0 = r3.contains(r2, r0)
            if (r0 == 0) goto L7b
            r7.m5218d(r8)
            long r0 = r7.getScrubberPosition()
            r7.m5216f(r0)
            goto L4e
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p038ui.C7320d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (m5217e(-getPositionIncrement()) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        m5215g(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (m5217e(getPositionIncrement()) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        sendAccessibilityEvent(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        return true;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performAccessibilityAction(int r6, @androidx.annotation.Nullable android.os.Bundle r7) {
        /*
            r5 = this;
            boolean r7 = super.performAccessibilityAction(r6, r7)
            r0 = 1
            if (r7 == 0) goto L8
            return r0
        L8:
            long r1 = r5.f13570H
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r7 > 0) goto L12
            return r1
        L12:
            r7 = 8192(0x2000, float:1.148E-41)
            if (r6 != r7) goto L25
            long r6 = r5.getPositionIncrement()
            long r6 = -r6
            boolean r6 = r5.m5217e(r6)
            if (r6 == 0) goto L34
        L21:
            r5.m5215g(r1)
            goto L34
        L25:
            r7 = 4096(0x1000, float:5.74E-42)
            if (r6 != r7) goto L39
            long r6 = r5.getPositionIncrement()
            boolean r6 = r5.m5217e(r6)
            if (r6 == 0) goto L34
            goto L21
        L34:
            r6 = 4
            r5.sendAccessibilityEvent(r6)
            return r0
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p038ui.C7320d.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.f13583h.setColor(i);
        invalidate(this.f13576a);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f13581f.setColor(i);
        invalidate(this.f13576a);
    }

    @Override // com.google.android.exoplayer2.p038ui.InterfaceC7338o
    public void setBufferedPosition(long j) {
        if (this.f13572J == j) {
            return;
        }
        this.f13572J = j;
        m5214h();
    }

    @Override // com.google.android.exoplayer2.p038ui.InterfaceC7338o
    public void setDuration(long j) {
        if (this.f13570H == j) {
            return;
        }
        this.f13570H = j;
        if (this.f13568F && j == -9223372036854775807L) {
            m5215g(true);
        }
        m5214h();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p038ui.InterfaceC7338o
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f13568F || z) {
            return;
        }
        m5215g(true);
    }

    public void setKeyCountIncrement(int i) {
        C7394a.m5134a(i > 0);
        this.f13563A = i;
        this.f13564B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        C7394a.m5134a(j > 0);
        this.f13563A = -1;
        this.f13564B = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.f13584i.setColor(i);
        invalidate(this.f13576a);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.f13580e.setColor(i);
        invalidate(this.f13576a);
    }

    @Override // com.google.android.exoplayer2.p038ui.InterfaceC7338o
    public void setPosition(long j) {
        if (this.f13571I == j) {
            return;
        }
        this.f13571I = j;
        setContentDescription(getProgressText());
        m5214h();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.f13585j.setColor(i);
        invalidate(this.f13576a);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.f13582g.setColor(i);
        invalidate(this.f13576a);
    }
}
