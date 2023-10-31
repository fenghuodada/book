package com.qmuiteam.qmui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.collection.C0482i;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a;
import com.qmuiteam.qmui.util.C9141b;

/* loaded from: classes3.dex */
public class QMUILoadingView extends View implements InterfaceC9103a {

    /* renamed from: g */
    public static final C0482i<String, Integer> f17605g;

    /* renamed from: a */
    public int f17606a;

    /* renamed from: b */
    public int f17607b;

    /* renamed from: c */
    public int f17608c;

    /* renamed from: d */
    public ValueAnimator f17609d;

    /* renamed from: e */
    public Paint f17610e;

    /* renamed from: f */
    public final C9157a f17611f;

    /* renamed from: com.qmuiteam.qmui.widget.QMUILoadingView$a */
    /* loaded from: classes3.dex */
    public class C9157a implements ValueAnimator.AnimatorUpdateListener {
        public C9157a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            QMUILoadingView qMUILoadingView = QMUILoadingView.this;
            qMUILoadingView.f17608c = intValue;
            qMUILoadingView.invalidate();
        }
    }

    static {
        C0482i<String, Integer> c0482i = new C0482i<>();
        f17605g = c0482i;
        c0482i.put("tintColor", Integer.valueOf((int) R.attr.qmui_skin_support_loading_color));
    }

    public QMUILoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.QMUILoadingStyle);
        this.f17608c = 0;
        this.f17611f = new C9157a();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9056b.f17319n, R.attr.QMUILoadingStyle, 0);
        this.f17606a = obtainStyledAttributes.getDimensionPixelSize(1, C9141b.m2646a(context, 32));
        this.f17607b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f17610e = paint;
        paint.setColor(this.f17607b);
        this.f17610e.setAntiAlias(true);
        this.f17610e.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: a */
    public final void m2618a() {
        ValueAnimator valueAnimator = this.f17609d;
        if (valueAnimator == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 11);
            this.f17609d = ofInt;
            ofInt.addUpdateListener(this.f17611f);
            this.f17609d.setDuration(600L);
            this.f17609d.setRepeatMode(1);
            this.f17609d.setRepeatCount(-1);
            this.f17609d.setInterpolator(new LinearInterpolator());
        } else if (valueAnimator.isStarted()) {
            return;
        }
        this.f17609d.start();
    }

    @Override // com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a
    public C0482i<String, Integer> getDefaultSkinAttrs() {
        return f17605g;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2618a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f17609d;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f17611f);
            this.f17609d.removeAllUpdateListeners();
            this.f17609d.cancel();
            this.f17609d = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        int i = this.f17606a;
        int i2 = i / 12;
        int i3 = i / 6;
        this.f17610e.setStrokeWidth(i2);
        float f = this.f17606a / 2;
        canvas.rotate(this.f17608c * 30, f, f);
        float f2 = this.f17606a / 2;
        canvas.translate(f2, f2);
        int i4 = 0;
        while (i4 < 12) {
            canvas.rotate(30.0f);
            i4++;
            this.f17610e.setAlpha((int) ((i4 * 255.0f) / 12.0f));
            int i5 = i2 / 2;
            canvas.translate(0.0f, ((-this.f17606a) / 2) + i5);
            canvas.drawLine(0.0f, 0.0f, 0.0f, i3, this.f17610e);
            canvas.translate(0.0f, (this.f17606a / 2) - i5);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f17606a;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            m2618a();
            return;
        }
        ValueAnimator valueAnimator = this.f17609d;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f17611f);
            this.f17609d.removeAllUpdateListeners();
            this.f17609d.cancel();
            this.f17609d = null;
        }
    }

    public void setColor(int i) {
        this.f17607b = i;
        this.f17610e.setColor(i);
        invalidate();
    }

    public void setSize(int i) {
        this.f17606a = i;
        requestLayout();
    }
}
