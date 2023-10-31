package com.qmuiteam.qmui.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.qmuiteam.qmui.widget.h */
/* loaded from: classes3.dex */
public final class C9216h extends C9163d {

    /* renamed from: b */
    public int f17847b;

    public C9216h(Context context) {
        super(context);
        this.f17847b = 536870911;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        super.onMeasure(i, (layoutParams == null || (i3 = layoutParams.height) <= 0 || i3 > this.f17847b) ? View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.f17847b), Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public void setMaxHeight(int i) {
        if (this.f17847b != i) {
            this.f17847b = i;
            requestLayout();
        }
    }
}
