package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.webkit.WebView;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.applovin.impl.adview.h */
/* loaded from: classes.dex */
public class C2773h extends WebView {

    /* renamed from: a */
    private PointF f6623a;

    public C2773h(Context context) {
        super(context);
        this.f6623a = new PointF();
    }

    public PointF getAndClearLastClickLocation() {
        PointF pointF = this.f6623a;
        this.f6623a = new PointF();
        return pointF;
    }

    public PointF getLastClickLocation() {
        return this.f6623a;
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f6623a = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        return super.onTouchEvent(motionEvent);
    }
}
