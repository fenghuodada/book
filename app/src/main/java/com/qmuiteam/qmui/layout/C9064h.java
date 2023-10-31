package com.qmuiteam.qmui.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.alpha.C9003e;

/* renamed from: com.qmuiteam.qmui.layout.h */
/* loaded from: classes3.dex */
public class C9064h extends C9003e implements IQMUILayout {

    /* renamed from: b */
    public C9063g f17376b;

    public C9064h(Context context) {
        super(context);
        this.f17376b = new C9063g(context, null, 0, this);
        setChangeAlphaWhenPress(false);
        setChangeAlphaWhenDisable(false);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: a */
    public final boolean mo2547a() {
        return this.f17376b.mo2547a();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: b */
    public final boolean mo2546b() {
        return this.f17376b.mo2546b();
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: c */
    public final boolean mo2545c() {
        return this.f17376b.mo2545c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f17376b.m2755f(canvas, getWidth(), getHeight());
        this.f17376b.m2756d(canvas);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: e */
    public final void mo2544e(int i) {
        this.f17376b.mo2544e(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: g */
    public final boolean mo2543g() {
        return this.f17376b.mo2543g();
    }

    public int getHideRadiusSide() {
        return this.f17376b.f17332B;
    }

    public int getRadius() {
        return this.f17376b.f17331A;
    }

    public float getShadowAlpha() {
        return this.f17376b.f17344N;
    }

    public int getShadowColor() {
        return this.f17376b.f17345O;
    }

    public int getShadowElevation() {
        return this.f17376b.f17343M;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: h */
    public final void mo2542h(int i) {
        this.f17376b.mo2542h(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: i */
    public final boolean mo2541i() {
        return this.f17376b.mo2541i();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int m2753k = this.f17376b.m2753k(i);
        int m2754j = this.f17376b.m2754j(i2);
        super.onMeasure(m2753k, m2754j);
        int m2750n = this.f17376b.m2750n(m2753k, getMeasuredWidth());
        int m2751m = this.f17376b.m2751m(m2754j, getMeasuredHeight());
        if (m2753k == m2750n && m2754j == m2751m) {
            return;
        }
        super.onMeasure(m2750n, m2751m);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: p */
    public final void mo2540p(int i) {
        this.f17376b.mo2540p(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: q */
    public final void mo2539q(int i) {
        this.f17376b.mo2539q(i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    public void setBorderColor(@ColorInt int i) {
        this.f17376b.f17336F = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f17376b.f17337G = i;
        invalidate();
    }

    public void setBottomDividerAlpha(int i) {
        this.f17376b.f17363n = i;
        invalidate();
    }

    public void setHideRadiusSide(int i) {
        this.f17376b.m2748r(i);
    }

    public void setLeftDividerAlpha(int i) {
        this.f17376b.f17368s = i;
        invalidate();
    }

    public void setOuterNormalColor(int i) {
        this.f17376b.m2747s(i);
    }

    public void setOutlineExcludePadding(boolean z) {
        this.f17376b.m2746t(z);
    }

    public void setRadius(int i) {
        this.f17376b.m2745u(i);
    }

    public void setRightDividerAlpha(int i) {
        this.f17376b.f17373x = i;
        invalidate();
    }

    public void setShadowAlpha(float f) {
        this.f17376b.m2743w(f);
    }

    public void setShadowColor(int i) {
        this.f17376b.m2742x(i);
    }

    public void setShadowElevation(int i) {
        this.f17376b.m2741y(i);
    }

    public void setShowBorderOnlyBeforeL(boolean z) {
        this.f17376b.m2740z(z);
        invalidate();
    }

    public void setTopDividerAlpha(int i) {
        this.f17376b.f17358i = i;
        invalidate();
    }

    public C9064h(Context context, int i) {
        super(context, 0);
        this.f17376b = new C9063g(context, null, R.attr.qmui_dialog_action_container_style, this);
        setChangeAlphaWhenPress(false);
        setChangeAlphaWhenDisable(false);
    }

    public C9064h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17376b = new C9063g(context, attributeSet, 0, this);
        setChangeAlphaWhenPress(false);
        setChangeAlphaWhenDisable(false);
    }
}
