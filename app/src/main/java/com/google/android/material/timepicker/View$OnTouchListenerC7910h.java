package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: com.google.android.material.timepicker.h */
/* loaded from: classes3.dex */
public final class View$OnTouchListenerC7910h implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ GestureDetector f15658a;

    public View$OnTouchListenerC7910h(GestureDetector gestureDetector) {
        this.f15658a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f15658a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
