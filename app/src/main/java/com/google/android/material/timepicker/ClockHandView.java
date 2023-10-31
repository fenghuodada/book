package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.Nullable;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.animation.C7556a;
import com.google.android.material.motion.C7769a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {

    /* renamed from: a */
    public final ValueAnimator f15634a;

    /* renamed from: b */
    public boolean f15635b;

    /* renamed from: c */
    public final ArrayList f15636c;

    /* renamed from: d */
    public final int f15637d;

    /* renamed from: e */
    public final float f15638e;

    /* renamed from: f */
    public final Paint f15639f;

    /* renamed from: g */
    public final RectF f15640g;
    @InterfaceC0074Px

    /* renamed from: h */
    public final int f15641h;

    /* renamed from: i */
    public float f15642i;

    /* renamed from: j */
    public boolean f15643j;

    /* renamed from: k */
    public double f15644k;

    /* renamed from: l */
    public int f15645l;

    /* renamed from: m */
    public int f15646m;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7901a {
        /* renamed from: d */
        void mo4310d(@FloatRange(from = 0.0d, m13045to = 360.0d) float f);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f15634a = new ValueAnimator();
        this.f15636c = new ArrayList();
        Paint paint = new Paint();
        this.f15639f = paint;
        this.f15640g = new RectF();
        this.f15646m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14585e, R.attr.materialClockStyle, 2132018390);
        C7769a.m4500c(context, R.attr.motionDurationLong2, 200);
        C7769a.m4499d(context, R.attr.motionEasingEmphasizedInterpolator, C7556a.f14283b);
        this.f15645l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f15637d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f15641h = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f15638e = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m4312b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11746s(this, 2);
        obtainStyledAttributes.recycle();
    }

    @Dimension
    /* renamed from: a */
    public final int m4313a(int i) {
        return i == 2 ? Math.round(this.f15645l * 0.66f) : this.f15645l;
    }

    /* renamed from: b */
    public final void m4312b(@FloatRange(from = 0.0d, m13045to = 360.0d) float f) {
        ValueAnimator valueAnimator = this.f15634a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        m4311c(f, false);
    }

    /* renamed from: c */
    public final void m4311c(@FloatRange(from = 0.0d, m13045to = 360.0d) float f, boolean z) {
        float f2 = f % 360.0f;
        this.f15642i = f2;
        this.f15644k = Math.toRadians(f2 - 90.0f);
        float m4313a = m4313a(this.f15646m);
        float cos = (((float) Math.cos(this.f15644k)) * m4313a) + (getWidth() / 2);
        float sin = (m4313a * ((float) Math.sin(this.f15644k))) + (getHeight() / 2);
        float f3 = this.f15637d;
        this.f15640g.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.f15636c.iterator();
        while (it.hasNext()) {
            ((InterfaceC7901a) it.next()).mo4310d(f2);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int m4313a;
        int i;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float m4313a2 = m4313a(this.f15646m);
        float f2 = height;
        Paint paint = this.f15639f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f15644k)) * m4313a2) + f, (m4313a2 * ((float) Math.sin(this.f15644k))) + f2, this.f15637d, paint);
        double sin = Math.sin(this.f15644k);
        paint.setStrokeWidth(this.f15641h);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f15644k) * r12)), height + ((int) (r12 * sin)), paint);
        canvas.drawCircle(f, f2, this.f15638e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f15634a.isRunning()) {
            m4312b(this.f15642i);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z2 = false;
                z = false;
            } else {
                z2 = this.f15643j;
                if (this.f15635b) {
                    if (((float) Math.hypot(x - (getWidth() / 2), y - (getHeight() / 2))) <= m4313a(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    this.f15646m = i;
                }
                z = false;
            }
        } else {
            this.f15643j = false;
            z = true;
            z2 = false;
        }
        boolean z5 = this.f15643j;
        int degrees = ((int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f = degrees;
        if (this.f15642i != f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z3) {
            if (z3 || z2) {
                m4312b(f);
            }
            this.f15643j = z5 | z4;
            return true;
        }
        z4 = true;
        this.f15643j = z5 | z4;
        return true;
    }
}
