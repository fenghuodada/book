package com.qmuiteam.qmui.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import com.qmuiteam.qmui.alpha.C9001c;

/* renamed from: com.qmuiteam.qmui.layout.c */
/* loaded from: classes3.dex */
public class C9059c extends C9001c implements IQMUILayout {

    /* renamed from: b */
    public C9063g f17329b;

    public C9059c(Context context) {
        super(context);
        this.f17329b = new C9063g(context, null, 0, this);
        setChangeAlphaWhenDisable(false);
        setChangeAlphaWhenPress(false);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: a */
    public final boolean mo2547a() {
        return this.f17329b.mo2547a();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: b */
    public final boolean mo2546b() {
        return this.f17329b.mo2546b();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: c */
    public final boolean mo2545c() {
        return this.f17329b.mo2545c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f17329b.m2755f(canvas, getWidth(), getHeight());
        this.f17329b.m2756d(canvas);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: e */
    public final void mo2544e(int i) {
        this.f17329b.mo2544e(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: g */
    public final boolean mo2543g() {
        return this.f17329b.mo2543g();
    }

    public int getHideRadiusSide() {
        return this.f17329b.f17332B;
    }

    public int getRadius() {
        return this.f17329b.f17331A;
    }

    public float getShadowAlpha() {
        return this.f17329b.f17344N;
    }

    public int getShadowColor() {
        return this.f17329b.f17345O;
    }

    public int getShadowElevation() {
        return this.f17329b.f17343M;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: h */
    public final void mo2542h(int i) {
        this.f17329b.mo2542h(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: i */
    public final boolean mo2541i() {
        return this.f17329b.mo2541i();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int m2753k = this.f17329b.m2753k(i);
        int m2754j = this.f17329b.m2754j(i2);
        super.onMeasure(m2753k, m2754j);
        int m2750n = this.f17329b.m2750n(m2753k, getMeasuredWidth());
        int m2751m = this.f17329b.m2751m(m2754j, getMeasuredHeight());
        if (m2753k == m2750n && m2754j == m2751m) {
            return;
        }
        super.onMeasure(m2750n, m2751m);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: p */
    public final void mo2540p(int i) {
        this.f17329b.mo2540p(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: q */
    public final void mo2539q(int i) {
        this.f17329b.mo2539q(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    public void setBorderColor(@ColorInt int i) {
        this.f17329b.f17336F = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f17329b.f17337G = i;
        invalidate();
    }

    public void setBottomDividerAlpha(int i) {
        this.f17329b.f17363n = i;
        invalidate();
    }

    public void setHideRadiusSide(int i) {
        this.f17329b.m2748r(i);
    }

    public void setLeftDividerAlpha(int i) {
        this.f17329b.f17368s = i;
        invalidate();
    }

    public void setOuterNormalColor(int i) {
        this.f17329b.m2747s(i);
    }

    public void setOutlineExcludePadding(boolean z) {
        this.f17329b.m2746t(z);
    }

    public void setRadius(int i) {
        this.f17329b.m2745u(i);
    }

    public void setRightDividerAlpha(int i) {
        this.f17329b.f17373x = i;
        invalidate();
    }

    public void setShadowAlpha(float f) {
        this.f17329b.m2743w(f);
    }

    public void setShadowColor(int i) {
        this.f17329b.m2742x(i);
    }

    public void setShadowElevation(int i) {
        this.f17329b.m2741y(i);
    }

    public void setShowBorderOnlyBeforeL(boolean z) {
        this.f17329b.m2740z(z);
        invalidate();
    }

    public void setTopDividerAlpha(int i) {
        this.f17329b.f17358i = i;
        invalidate();
    }

    public C9059c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17329b = new C9063g(context, attributeSet, 0, this);
        setChangeAlphaWhenDisable(false);
        setChangeAlphaWhenPress(false);
    }

    public C9059c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17329b = new C9063g(context, attributeSet, i, this);
        setChangeAlphaWhenDisable(false);
        setChangeAlphaWhenPress(false);
    }
}
