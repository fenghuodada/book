package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.android.material.C7582b;

/* loaded from: classes3.dex */
public class MaxLinearLayout extends LinearLayout {

    /* renamed from: a */
    public int f17079a;

    /* renamed from: b */
    public int f17080b;

    /* renamed from: c */
    public int f17081c;

    /* renamed from: d */
    public int f17082d;

    /* renamed from: e */
    public int f17083e;

    public MaxLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17083e = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7582b.f14378b);
            this.f17079a = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f17080b = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.f17081c = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f17082d = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            obtainStyledAttributes.recycle();
        }
        int i = this.f17081c;
        this.f17081c = i == 0 ? getMinimumWidth() : i;
        int i2 = this.f17082d;
        this.f17082d = i2 == 0 ? getMinimumHeight() : i2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view;
        int measuredWidth;
        int measuredHeight;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f17083e == -1 && size2 != 0) {
            this.f17083e = size2;
        }
        int i3 = this.f17080b;
        if (size > i3 && i3 != 0) {
            size = i3;
        }
        int i4 = this.f17079a;
        if (size2 > i4 && i4 != 0) {
            size2 = i4;
        }
        View findViewWithTag = findViewWithTag("blurView");
        int i5 = 0;
        while (true) {
            if (i5 < getChildCount()) {
                if (!"blurView".equals(getChildAt(i5).getTag())) {
                    view = getChildAt(i5);
                    break;
                }
                i5++;
            } else {
                view = null;
                break;
            }
        }
        if (view != null && findViewWithTag != null) {
            if (view.getMeasuredWidth() == 0) {
                measuredWidth = getMeasuredWidth();
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            if (view.getMeasuredHeight() == 0) {
                measuredHeight = getMeasuredHeight();
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int i6 = this.f17081c;
            if (measuredWidth < i6) {
                measuredWidth = i6;
            }
            int i7 = this.f17082d;
            if (measuredHeight < i7) {
                measuredHeight = i7;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewWithTag.getLayoutParams();
            layoutParams.addRule(13);
            layoutParams.width = measuredWidth;
            layoutParams.height = measuredHeight;
            findViewWithTag.setLayoutParams(layoutParams);
        } else if (findViewWithTag != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewWithTag.getLayoutParams();
            layoutParams2.width = getMeasuredWidth();
            layoutParams2.height = getMeasuredHeight();
            findViewWithTag.setLayoutParams(layoutParams2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f17082d = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f17081c = i;
        super.setMinimumWidth(i);
    }
}
