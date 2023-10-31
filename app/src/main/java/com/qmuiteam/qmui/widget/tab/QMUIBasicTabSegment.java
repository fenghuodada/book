package com.qmuiteam.qmui.widget.tab;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.collection.C0482i;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.layout.IQMUILayout;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.skin.InterfaceC9105e;
import com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class QMUIBasicTabSegment extends HorizontalScrollView implements IQMUILayout, InterfaceC9105e, InterfaceC9103a {

    /* renamed from: d */
    public static final C0482i<String, Integer> f17952d;

    /* renamed from: a */
    public int f17953a;

    /* renamed from: b */
    public int f17954b;

    /* renamed from: c */
    public boolean f17955c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Mode {
    }

    /* renamed from: com.qmuiteam.qmui.widget.tab.QMUIBasicTabSegment$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9247a {
    }

    static {
        C0482i<String, Integer> c0482i = new C0482i<>(3);
        f17952d = c0482i;
        Integer valueOf = Integer.valueOf((int) R.attr.qmui_skin_support_tab_separator_color);
        c0482i.put("bottomSeparator", valueOf);
        c0482i.put("topSeparator", valueOf);
        c0482i.put("background", Integer.valueOf((int) R.attr.qmui_skin_support_tab_bg));
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: a */
    public final boolean mo2547a() {
        throw null;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: b */
    public final boolean mo2546b() {
        throw null;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: c */
    public final boolean mo2545c() {
        throw null;
    }

    @Override // com.qmuiteam.qmui.skin.InterfaceC9105e
    /* renamed from: d */
    public final void mo2553d(@NotNull C9108h c9108h, @NotNull Resources.Theme theme, @Nullable C0482i c0482i) {
        c9108h.m2671e(this, theme, c0482i);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: e */
    public final void mo2544e(int i) {
        throw null;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: g */
    public final boolean mo2543g() {
        throw null;
    }

    @Override // com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a
    public C0482i<String, Integer> getDefaultSkinAttrs() {
        return f17952d;
    }

    public int getHideRadiusSide() {
        throw null;
    }

    public int getMode() {
        return this.f17954b;
    }

    public int getRadius() {
        throw null;
    }

    public int getSelectedIndex() {
        return 0;
    }

    public float getShadowAlpha() {
        throw null;
    }

    public int getShadowColor() {
        throw null;
    }

    public int getShadowElevation() {
        throw null;
    }

    public int getTabCount() {
        throw null;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: h */
    public final void mo2542h(int i) {
        throw null;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: i */
    public final boolean mo2541i() {
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        getWidth();
        getHeight();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f17954b == 0) {
            throw null;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            childAt.measure(View.MeasureSpec.makeMeasureSpec(size - paddingRight, 1073741824), i2);
            if (mode == Integer.MIN_VALUE) {
                setMeasuredDimension(Math.min(size, childAt.getMeasuredWidth() + paddingRight), i2);
                return;
            }
        }
        setMeasuredDimension(i, i2);
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: p */
    public final void mo2540p(int i) {
        throw null;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    /* renamed from: q */
    public final void mo2539q(int i) {
        throw null;
    }

    @Override // com.qmuiteam.qmui.layout.IQMUILayout
    public void setBorderColor(@ColorInt int i) {
        throw null;
    }

    public void setBorderWidth(int i) {
        throw null;
    }

    public void setBottomDividerAlpha(int i) {
        throw null;
    }

    public void setDefaultTabIconPosition(int i) {
        throw null;
    }

    public void setHideIndicatorWhenTabCountLessTwo(boolean z) {
    }

    public void setHideRadiusSide(int i) {
        throw null;
    }

    public void setIndicator(@Nullable C9248a c9248a) {
        throw null;
    }

    public void setItemSpaceInScrollMode(int i) {
    }

    public void setLeftDividerAlpha(int i) {
        throw null;
    }

    public void setMode(int i) {
        if (this.f17954b == i) {
            return;
        }
        this.f17954b = i;
        throw null;
    }

    public void setOnTabClickListener(InterfaceC9247a interfaceC9247a) {
    }

    public void setOuterNormalColor(int i) {
        throw null;
    }

    public void setOutlineExcludePadding(boolean z) {
        throw null;
    }

    public void setRadius(int i) {
        throw null;
    }

    public void setRightDividerAlpha(int i) {
        throw null;
    }

    public void setSelectNoAnimation(boolean z) {
    }

    public void setShadowAlpha(float f) {
        throw null;
    }

    public void setShadowColor(int i) {
        throw null;
    }

    public void setShadowElevation(int i) {
        throw null;
    }

    public void setShowBorderOnlyBeforeL(boolean z) {
        throw null;
    }

    public void setTopDividerAlpha(int i) {
        throw null;
    }
}
