package com.kongzue.dialogx.util.views;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kongzue.dialogx.impl.C8917a;
import com.kongzue.dialogx.util.ActivityC8943b;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class ActivityScreenShotImageView extends ImageView {

    /* renamed from: a */
    public float f17054a;

    /* renamed from: b */
    public float f17055b;

    /* renamed from: c */
    public float f17056c;

    /* renamed from: d */
    public boolean f17057d;

    /* renamed from: e */
    public int f17058e;

    /* renamed from: f */
    public int f17059f;

    public ActivityScreenShotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17057d = false;
        setLayerType(2, null);
    }

    private ViewGroup getDecorView() {
        Activity m2888b = C8917a.m2888b();
        if (m2888b != null) {
            if (m2888b instanceof ActivityC8943b) {
                m2888b = ((ActivityC8943b) m2888b).m2847o();
            }
            return (ViewGroup) m2888b.getWindow().getDecorView();
        }
        return null;
    }

    /* renamed from: a */
    public final void m2844a() {
        if (!isAttachedToWindow()) {
            return;
        }
        if (this.f17058e != getMeasuredWidth() || this.f17059f != getMeasuredHeight()) {
            this.f17058e = getMeasuredWidth();
            this.f17059f = getMeasuredHeight();
            ViewGroup decorView = getDecorView();
            if (decorView != null) {
                if (decorView.getWidth() != 0 && decorView.getHeight() != 0) {
                    throw null;
                }
                setVisibility(0);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setContentViewVisibility(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.f17057d) {
            super.onDraw(canvas);
        }
        float f = this.f17054a;
        float f2 = this.f17056c;
        if (f >= f2 && this.f17055b > f2) {
            Path path = new Path();
            path.moveTo(this.f17056c, 0.0f);
            path.lineTo(this.f17054a - this.f17056c, 0.0f);
            float f3 = this.f17054a;
            path.quadTo(f3, 0.0f, f3, this.f17056c);
            path.lineTo(this.f17054a, this.f17055b - this.f17056c);
            float f4 = this.f17054a;
            float f5 = this.f17055b;
            path.quadTo(f4, f5, f4 - this.f17056c, f5);
            path.lineTo(this.f17056c, this.f17055b);
            float f6 = this.f17055b;
            path.quadTo(0.0f, f6, 0.0f, f6 - this.f17056c);
            path.lineTo(0.0f, this.f17056c);
            path.quadTo(0.0f, 0.0f, this.f17056c, 0.0f);
            canvas.clipPath(path);
        }
        try {
            canvas.drawColor(-1);
            super.onDraw(canvas);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f17054a != getWidth() || this.f17055b != getHeight()) {
            m2844a();
        }
        this.f17054a = getWidth();
        this.f17055b = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m2844a();
    }

    public void setContentViewVisibility(boolean z) {
    }

    public void setRadius(float f) {
        this.f17056c = f;
        invalidate();
    }

    public void setScale(float f) {
        setScaleX(f);
        setScaleY(f);
        this.f17057d = true;
    }
}
