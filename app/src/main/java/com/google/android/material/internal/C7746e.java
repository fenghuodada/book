package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0922g2;
import androidx.core.view.C0963l;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes3.dex */
public class C7746e extends ViewGroup {

    /* renamed from: a */
    public int f15087a;

    /* renamed from: b */
    public int f15088b;

    /* renamed from: c */
    public boolean f15089c;

    /* renamed from: d */
    public int f15090d;

    /* renamed from: a */
    public boolean mo4515a() {
        return this.f15089c;
    }

    public int getItemSpacing() {
        return this.f15088b;
    }

    public int getLineSpacing() {
        return this.f15087a;
    }

    public int getRowCount() {
        return this.f15090d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f15090d = 0;
            return;
        }
        this.f15090d = 1;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0815e.m11742d(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingRight;
        int i8 = paddingLeft;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = C0963l.m11421c(marginLayoutParams);
                    i5 = C0963l.m11422b(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i8 + i6;
                if (!this.f15089c && measuredWidth > i7) {
                    i9 = this.f15087a + paddingTop;
                    this.f15090d++;
                    i8 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f15090d - 1));
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth2;
                    measuredWidth2 = (i7 - i8) - i6;
                }
                childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                i8 += childAt.getMeasuredWidth() + i6 + i5 + this.f15088b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i5 > paddingRight && !mo4515a()) {
                    paddingLeft = getPaddingLeft();
                    i6 = this.f15087a + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i5;
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i5 + i4 + this.f15088b + paddingLeft;
                if (i8 == getChildCount() - 1) {
                    i7 += i4;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i7;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f15088b = i;
    }

    public void setLineSpacing(int i) {
        this.f15087a = i;
    }

    public void setSingleLine(boolean z) {
        this.f15089c = z;
    }
}
