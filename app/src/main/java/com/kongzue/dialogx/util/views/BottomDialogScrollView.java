package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* loaded from: classes3.dex */
public class BottomDialogScrollView extends ScrollView {
    public BottomDialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getScrollDistance() {
        return getScrollY();
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
