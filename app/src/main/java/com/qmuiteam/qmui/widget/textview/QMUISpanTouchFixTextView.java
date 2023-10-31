package com.qmuiteam.qmui.widget.textview;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.C0383m0;
import com.qmuiteam.qmui.layout.C9063g;
import com.qmuiteam.qmui.layout.IQMUILayout;
import com.qmuiteam.qmui.link.C9069c;

/* loaded from: classes3.dex */
public class QMUISpanTouchFixTextView extends C0383m0 implements InterfaceC9255a, IQMUILayout {

    /* renamed from: h */
    public boolean f17971h;

    /* renamed from: i */
    public boolean f17972i;

    /* renamed from: j */
    public boolean f17973j;

    /* renamed from: k */
    public final C9063g f17974k;

    public QMUISpanTouchFixTextView() {
        throw null;
    }

    public QMUISpanTouchFixTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f17972i = false;
        this.f17973j = false;
        setHighlightColor(0);
        this.f17974k = new C9063g(context, attributeSet, 0, this);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: a */
    public final boolean mo2547a() {
        return this.f17974k.mo2547a();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: b */
    public final boolean mo2546b() {
        return this.f17974k.mo2546b();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: c */
    public final boolean mo2545c() {
        return this.f17974k.mo2545c();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        C9063g c9063g = this.f17974k;
        c9063g.m2755f(canvas, width, height);
        c9063g.m2756d(canvas);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: e */
    public final void mo2544e(int i) {
        this.f17974k.mo2544e(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: g */
    public final boolean mo2543g() {
        return this.f17974k.mo2543g();
    }

    public int getHideRadiusSide() {
        return this.f17974k.f17332B;
    }

    public int getRadius() {
        return this.f17974k.f17331A;
    }

    public float getShadowAlpha() {
        return this.f17974k.f17344N;
    }

    @Override // android.widget.TextView
    public int getShadowColor() {
        return this.f17974k.f17345O;
    }

    public int getShadowElevation() {
        return this.f17974k.f17343M;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: h */
    public final void mo2542h(int i) {
        this.f17974k.mo2542h(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: i */
    public final boolean mo2541i() {
        return this.f17974k.mo2541i();
    }

    @Override // androidx.appcompat.widget.C0383m0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        C9063g c9063g = this.f17974k;
        int m2753k = c9063g.m2753k(i);
        int m2754j = c9063g.m2754j(i2);
        super.onMeasure(m2753k, m2754j);
        int m2750n = c9063g.m2750n(m2753k, getMeasuredWidth());
        int m2751m = c9063g.m2751m(m2754j, getMeasuredHeight());
        if (m2753k == m2750n && m2754j == m2751m) {
            return;
        }
        super.onMeasure(m2750n, m2751m);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((getText() instanceof Spannable) && (getMovementMethod() instanceof C9069c)) {
            this.f17971h = true;
            return this.f17973j ? this.f17971h : super.onTouchEvent(motionEvent);
        }
        this.f17971h = false;
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: p */
    public final void mo2540p(int i) {
        this.f17974k.mo2540p(i);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f17971h || this.f17973j) {
            return false;
        }
        return super.performClick();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean performLongClick() {
        if (this.f17971h || this.f17973j) {
            return false;
        }
        return super.performLongClick();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: q */
    public final void mo2539q(int i) {
        this.f17974k.mo2539q(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    public void setBorderColor(@ColorInt int i) {
        this.f17974k.f17336F = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f17974k.f17337G = i;
        invalidate();
    }

    public void setBottomDividerAlpha(int i) {
        this.f17974k.f17363n = i;
        invalidate();
    }

    public void setHideRadiusSide(int i) {
        this.f17974k.m2748r(i);
        invalidate();
    }

    public void setLeftDividerAlpha(int i) {
        this.f17974k.f17368s = i;
        invalidate();
    }

    public void setMovementMethodCompat(MovementMethod movementMethod) {
        setMovementMethod(movementMethod);
        if (this.f17973j) {
            setNeedForceEventToParent(true);
        }
    }

    public void setNeedForceEventToParent(boolean z) {
        this.f17973j = z;
        setFocusable(!z);
        setClickable(!z);
        setLongClickable(!z);
    }

    public void setOuterNormalColor(int i) {
        this.f17974k.m2747s(i);
    }

    public void setOutlineExcludePadding(boolean z) {
        this.f17974k.m2746t(z);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        this.f17972i = z;
        if (this.f17971h) {
            return;
        }
        mo2538u(z);
    }

    public void setRadius(int i) {
        this.f17974k.m2745u(i);
    }

    public void setRightDividerAlpha(int i) {
        this.f17974k.f17373x = i;
        invalidate();
    }

    public void setShadowAlpha(float f) {
        this.f17974k.m2743w(f);
    }

    public void setShadowColor(int i) {
        this.f17974k.m2742x(i);
    }

    public void setShadowElevation(int i) {
        this.f17974k.m2741y(i);
    }

    public void setShowBorderOnlyBeforeL(boolean z) {
        this.f17974k.m2740z(z);
        invalidate();
    }

    public void setTopDividerAlpha(int i) {
        this.f17974k.f17358i = i;
        invalidate();
    }

    @Override // com.qmuiteam.qmui.widget.textview.InterfaceC9255a
    public void setTouchSpanHit(boolean z) {
        if (this.f17971h != z) {
            this.f17971h = z;
            setPressed(this.f17972i);
        }
    }

    /* renamed from: u */
    public void mo2538u(boolean z) {
        super.setPressed(z);
    }
}
