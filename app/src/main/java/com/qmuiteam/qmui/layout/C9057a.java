package com.qmuiteam.qmui.layout;

import android.content.Context;
import android.graphics.Canvas;
import androidx.annotation.ColorInt;
import com.qmuiteam.qmui.alpha.C8999a;

/* renamed from: com.qmuiteam.qmui.layout.a */
/* loaded from: classes3.dex */
public final class C9057a extends C8999a implements IQMUILayout {

    /* renamed from: e */
    public C9063g f17327e;

    public C9057a(Context context) {
        super(context);
        this.f17327e = new C9063g(context, null, 0, this);
        setChangeAlphaWhenDisable(false);
        setChangeAlphaWhenPress(false);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: a */
    public final boolean mo2547a() {
        return this.f17327e.mo2547a();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: b */
    public final boolean mo2546b() {
        return this.f17327e.mo2546b();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: c */
    public final boolean mo2545c() {
        return this.f17327e.mo2545c();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f17327e.m2755f(canvas, getWidth(), getHeight());
        this.f17327e.m2756d(canvas);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: e */
    public final void mo2544e(int i) {
        this.f17327e.mo2544e(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: g */
    public final boolean mo2543g() {
        return this.f17327e.mo2543g();
    }

    public int getHideRadiusSide() {
        return this.f17327e.f17332B;
    }

    public int getRadius() {
        return this.f17327e.f17331A;
    }

    public float getShadowAlpha() {
        return this.f17327e.f17344N;
    }

    @Override // android.widget.TextView
    public int getShadowColor() {
        return this.f17327e.f17345O;
    }

    public int getShadowElevation() {
        return this.f17327e.f17343M;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: h */
    public final void mo2542h(int i) {
        this.f17327e.mo2542h(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: i */
    public final boolean mo2541i() {
        return this.f17327e.mo2541i();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int m2753k = this.f17327e.m2753k(i);
        int m2754j = this.f17327e.m2754j(i2);
        super.onMeasure(m2753k, m2754j);
        int m2750n = this.f17327e.m2750n(m2753k, getMeasuredWidth());
        int m2751m = this.f17327e.m2751m(m2754j, getMeasuredHeight());
        if (m2753k == m2750n && m2754j == m2751m) {
            return;
        }
        super.onMeasure(m2750n, m2751m);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: p */
    public final void mo2540p(int i) {
        this.f17327e.mo2540p(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: q */
    public final void mo2539q(int i) {
        this.f17327e.mo2539q(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    public void setBorderColor(@ColorInt int i) {
        this.f17327e.f17336F = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f17327e.f17337G = i;
        invalidate();
    }

    public void setBottomDividerAlpha(int i) {
        this.f17327e.f17363n = i;
        invalidate();
    }

    public void setHideRadiusSide(int i) {
        this.f17327e.m2748r(i);
        invalidate();
    }

    public void setLeftDividerAlpha(int i) {
        this.f17327e.f17368s = i;
        invalidate();
    }

    public void setOuterNormalColor(int i) {
        this.f17327e.m2747s(i);
    }

    public void setOutlineExcludePadding(boolean z) {
        this.f17327e.m2746t(z);
    }

    public void setRadius(int i) {
        this.f17327e.m2745u(i);
    }

    public void setRightDividerAlpha(int i) {
        this.f17327e.f17373x = i;
        invalidate();
    }

    public void setShadowAlpha(float f) {
        this.f17327e.m2743w(f);
    }

    public void setShadowColor(int i) {
        this.f17327e.m2742x(i);
    }

    public void setShadowElevation(int i) {
        this.f17327e.m2741y(i);
    }

    public void setShowBorderOnlyBeforeL(boolean z) {
        this.f17327e.m2740z(z);
        invalidate();
    }

    public void setTopDividerAlpha(int i) {
        this.f17327e.f17358i = i;
        invalidate();
    }
}
