package com.qmuiteam.qmui.layout;

import android.content.Context;
import android.graphics.Canvas;
import androidx.annotation.ColorInt;
import com.qmuiteam.qmui.alpha.C9000b;

/* renamed from: com.qmuiteam.qmui.layout.b */
/* loaded from: classes3.dex */
public class C9058b extends C9000b implements IQMUILayout {

    /* renamed from: r */
    public C9063g f17328r;

    public C9058b(Context context) {
        super(context);
        this.f17328r = new C9063g(context, null, 0, this);
        setChangeAlphaWhenPress(false);
        setChangeAlphaWhenDisable(false);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: a */
    public final boolean mo2547a() {
        return this.f17328r.mo2547a();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: b */
    public final boolean mo2546b() {
        return this.f17328r.mo2546b();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: c */
    public final boolean mo2545c() {
        return this.f17328r.mo2545c();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
            this.f17328r.m2755f(canvas, getWidth(), getHeight());
            this.f17328r.m2756d(canvas);
        } catch (Throwable unused) {
        }
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: e */
    public final void mo2544e(int i) {
        this.f17328r.mo2544e(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: g */
    public final boolean mo2543g() {
        return this.f17328r.mo2543g();
    }

    public int getHideRadiusSide() {
        return this.f17328r.f17332B;
    }

    public int getRadius() {
        return this.f17328r.f17331A;
    }

    public float getShadowAlpha() {
        return this.f17328r.f17344N;
    }

    public int getShadowColor() {
        return this.f17328r.f17345O;
    }

    public int getShadowElevation() {
        return this.f17328r.f17343M;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: h */
    public final void mo2542h(int i) {
        this.f17328r.mo2542h(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: i */
    public final boolean mo2541i() {
        return this.f17328r.mo2541i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int m2753k = this.f17328r.m2753k(i);
        int m2754j = this.f17328r.m2754j(i2);
        super.onMeasure(m2753k, m2754j);
        int m2750n = this.f17328r.m2750n(m2753k, getMeasuredWidth());
        int m2751m = this.f17328r.m2751m(m2754j, getMeasuredHeight());
        if (m2753k == m2750n && m2754j == m2751m) {
            return;
        }
        super.onMeasure(m2750n, m2751m);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: p */
    public final void mo2540p(int i) {
        this.f17328r.mo2540p(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: q */
    public final void mo2539q(int i) {
        this.f17328r.mo2539q(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    public void setBorderColor(@ColorInt int i) {
        this.f17328r.f17336F = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f17328r.f17337G = i;
        invalidate();
    }

    public void setBottomDividerAlpha(int i) {
        this.f17328r.f17363n = i;
        invalidate();
    }

    public void setHideRadiusSide(int i) {
        this.f17328r.m2748r(i);
    }

    public void setLeftDividerAlpha(int i) {
        this.f17328r.f17368s = i;
        invalidate();
    }

    public void setOuterNormalColor(int i) {
        this.f17328r.m2747s(i);
    }

    public void setOutlineExcludePadding(boolean z) {
        this.f17328r.m2746t(z);
    }

    public void setRadius(int i) {
        this.f17328r.m2745u(i);
    }

    public void setRightDividerAlpha(int i) {
        this.f17328r.f17373x = i;
        invalidate();
    }

    public void setShadowAlpha(float f) {
        this.f17328r.m2743w(f);
    }

    public void setShadowColor(int i) {
        this.f17328r.m2742x(i);
    }

    public void setShadowElevation(int i) {
        this.f17328r.m2741y(i);
    }

    public void setShowBorderOnlyBeforeL(boolean z) {
        this.f17328r.m2740z(z);
        invalidate();
    }

    public void setTopDividerAlpha(int i) {
        this.f17328r.f17358i = i;
        invalidate();
    }

    /* renamed from: w */
    public final void m2759w(int i, int i2, int i3, int i4) {
        C9063g c9063g = this.f17328r;
        c9063g.f17360k = i;
        c9063g.f17361l = i2;
        c9063g.f17362m = i4;
        c9063g.f17359j = 1;
        invalidate();
    }

    public C9058b(Context context, int i) {
        super(context, i);
        this.f17328r = new C9063g(context, null, i, this);
        setChangeAlphaWhenPress(false);
        setChangeAlphaWhenDisable(false);
    }
}
