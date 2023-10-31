package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes3.dex */
public final class ViewTreeObserver$OnPreDrawListenerC7904b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ ClockFaceView f15650a;

    public ViewTreeObserver$OnPreDrawListenerC7904b(ClockFaceView clockFaceView) {
        this.f15650a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f15650a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f15627t.f15637d) - clockFaceView.f15620B;
        if (height != clockFaceView.f15654r) {
            clockFaceView.f15654r = height;
            clockFaceView.mo4306w();
            int i = clockFaceView.f15654r;
            ClockHandView clockHandView = clockFaceView.f15627t;
            clockHandView.f15645l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
