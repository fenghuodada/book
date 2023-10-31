package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

/* loaded from: classes3.dex */
public class PopMenuListView extends ListView {

    /* renamed from: a */
    public final float f17095a;

    public PopMenuListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17095a = -1.0f;
    }

    public float getMaxHeight() {
        return this.f17095a;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public final void layoutChildren() {
        try {
            super.layoutChildren();
        } catch (IllegalStateException unused) {
            ((BaseAdapter) getAdapter()).notifyDataSetChanged();
            super.layoutChildren();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.f17095a;
        if (f <= View.MeasureSpec.getSize(i2) && f > -1.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec(Float.valueOf(f).intValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
